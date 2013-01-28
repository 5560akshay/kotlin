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
import org.jetbrains.jet.lang.descriptors.DeclarationDescriptor;
import org.jetbrains.jet.lang.resolve.scopes.JetScope;
import org.jetbrains.jet.lang.types.TypeConstructor;

public class ForceResolveUtil {
    private ForceResolveUtil() {}

    public static void forceResolveAllContents(@NotNull DeclarationDescriptor descriptor) {
        if (descriptor instanceof LazyDescriptor) {
            LazyDescriptor lazyDescriptor = (LazyDescriptor) descriptor;
            lazyDescriptor.forceResolveAllContents();
        }
    }

    public static void forceResolveAllContents(@NotNull JetScope scope) {
        for (DeclarationDescriptor descriptor : scope.getAllDescriptors()) {
            forceResolveAllContents(descriptor);
        }
    }

    public static void forceResolveAllContents(@NotNull TypeConstructor typeConstructor) {
        if (typeConstructor instanceof LazyDescriptor) {
            LazyDescriptor lazyConstructor = (LazyDescriptor) typeConstructor;
            lazyConstructor.forceResolveAllContents();
        }
    }
}
