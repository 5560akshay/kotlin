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

package org.jetbrains.jet.util.slicedmap;

import com.google.common.collect.ImmutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

public interface MutableSlicedMap extends SlicedMap {

    <K, V> void put(WritableSlice<K, V> slice, K key, V value);

    <K, V> V remove(RemovableSlice<K, V> slice, K key);

    void clear();

    @NotNull
    @TestOnly
    <K, V> ImmutableMap<K, V> getSliceContents(@NotNull ReadOnlySlice<K, V> slice);
}
