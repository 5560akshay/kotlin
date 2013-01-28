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

package org.jetbrains.jet.lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Deprecated // Tuples are to be removed in Kotlin M4
public class JetTupleExpression extends JetExpressionImpl {

    @Deprecated // Tuples are to be removed in Kotlin M4
    public JetTupleExpression(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull JetVisitorVoid visitor) {
        visitor.visitTupleExpression(this);
    }

    @Override
    public <R, D> R accept(@NotNull JetVisitor<R, D> visitor, D data) {
        return visitor.visitTupleExpression(this, data);
    }

    @Deprecated // Tuples are to be removed in Kotlin M4
    public List<JetExpression> getEntries() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JetExpression.class);
    }
}
