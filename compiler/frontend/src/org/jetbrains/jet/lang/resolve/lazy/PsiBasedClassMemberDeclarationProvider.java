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

package org.jetbrains.jet.lang.resolve.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.psi.*;
import org.jetbrains.jet.lang.resolve.lazy.data.JetClassLikeInfo;

public class PsiBasedClassMemberDeclarationProvider extends AbstractPsiBasedDeclarationProvider implements ClassMemberDeclarationProvider {

    private final JetClassLikeInfo classInfo;

    public PsiBasedClassMemberDeclarationProvider(@NotNull JetClassLikeInfo classInfo) {
        this.classInfo = classInfo;
    }

    @NotNull
    @Override
    public JetClassLikeInfo getOwnerInfo() {
        return classInfo;
    }

    @Override
    protected void doCreateIndex() {
        for (JetDeclaration declaration : classInfo.getDeclarations()) {
            if (declaration instanceof JetClassObject) {
                // Do nothing, class object will be taken directly from the classInfo
            }
            else {
                putToIndex(declaration);
            }
        }

        for (JetParameter parameter : classInfo.getPrimaryConstructorParameters()) {
            if (parameter.getValOrVarNode() != null) {
                putToIndex(parameter);
            }
        }
    }

    @Override
    public String toString() {
        return "Declarations for " + classInfo;
    }
}
