/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.k2js.translate.expression;

import com.google.dart.compiler.backend.js.ast.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.descriptors.ClassDescriptor;
import org.jetbrains.jet.lang.psi.JetClassOrObject;
import org.jetbrains.k2js.translate.context.TraceableThisAliasProvider;
import org.jetbrains.k2js.translate.context.TranslationContext;

class InnerObjectTranslator extends InnerDeclarationTranslator {
    public InnerObjectTranslator(@NotNull JetClassOrObject declaration, @NotNull ClassDescriptor descriptor, @NotNull TranslationContext context, @NotNull JsFunction fun) {
        super(declaration, descriptor, context, fun);
    }

    @Override
    protected JsExpression createExpression(JsNameRef nameRef, JsExpression self) {
        return createInvocation(nameRef, self);
    }

    @Override
    @NotNull
    public JsExpression translate(@NotNull JsNameRef nameRef) {
        return super.translate(nameRef, thisAliasProvider().getRefIfWasCaptured());
    }

    private TraceableThisAliasProvider thisAliasProvider() {
        return ((TraceableThisAliasProvider) context.thisAliasProvider());
    }

    @Override
    protected JsInvocation createInvocation(JsNameRef nameRef, JsExpression self) {
        JsInvocation invocation = new JsInvocation(nameRef);
        if (thisAliasProvider().wasThisCaptured()) {
            fun.getParameters().add(new JsParameter(((JsNameRef) self).getName()));
            invocation.getArguments().add(JsLiteral.THIS);
        }
        return invocation;
    }
}
