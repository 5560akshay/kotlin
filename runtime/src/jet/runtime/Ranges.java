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


package jet.runtime;

import jet.*;

/* This file is generated by org.jetbrains.jet.generators.runtime.GenerateRanges. DO NOT EDIT! */
public class Ranges {
    public static ByteRange rangeTo(byte from, byte to) {
        if (from > to) {
            return ByteRange.EMPTY;
        }
        else {
            return new ByteRange(from, to - from + 1);
        }
    }

    public static ShortRange rangeTo(byte from, short to) {
        if (from > to) {
            return ShortRange.EMPTY;
        }
        else {
            return new ShortRange(from, to - from + 1);
        }
    }

    public static IntRange rangeTo(byte from, int to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(byte from, long to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(byte from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(byte from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static CharRange rangeTo(byte from, char to) {
        if (from > to) {
            return CharRange.EMPTY;
        }
        else {
            return new CharRange((char) from, to - from + 1);
        }
    }

    public static ShortRange rangeTo(short from, byte to) {
        if (from > to) {
            return ShortRange.EMPTY;
        }
        else {
            return new ShortRange(from, to - from + 1);
        }
    }

    public static ShortRange rangeTo(short from, short to) {
        if (from > to) {
            return ShortRange.EMPTY;
        }
        else {
            return new ShortRange(from, to - from + 1);
        }
    }

    public static IntRange rangeTo(short from, int to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(short from, long to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(short from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(short from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static ShortRange rangeTo(short from, char to) {
        if (from > to) {
            return ShortRange.EMPTY;
        }
        else {
            return new ShortRange(from, to - from + 1);
        }
    }

    public static IntRange rangeTo(int from, byte to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static IntRange rangeTo(int from, short to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static IntRange rangeTo(int from, int to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(int from, long to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(int from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(int from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static IntRange rangeTo(int from, char to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(long from, byte to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(long from, short to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(long from, int to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(long from, long to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(long from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(long from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static LongRange rangeTo(long from, char to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(float from, byte to) {
        return new FloatRange(from, to - from);
    }

    public static FloatRange rangeTo(float from, short to) {
        return new FloatRange(from, to - from);
    }

    public static FloatRange rangeTo(float from, int to) {
        return new FloatRange(from, to - from);
    }

    public static FloatRange rangeTo(float from, long to) {
        return new FloatRange(from, to - from);
    }

    public static FloatRange rangeTo(float from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(float from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static FloatRange rangeTo(float from, char to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, byte to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, short to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, int to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, long to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, float to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static DoubleRange rangeTo(double from, char to) {
        return new DoubleRange(from, to - from);
    }

    public static CharRange rangeTo(char from, byte to) {
        if (from > to) {
            return CharRange.EMPTY;
        }
        else {
            return new CharRange(from, to - from + 1);
        }
    }

    public static ShortRange rangeTo(char from, short to) {
        if (from > to) {
            return ShortRange.EMPTY;
        }
        else {
            return new ShortRange((short) from, to - from + 1);
        }
    }

    public static IntRange rangeTo(char from, int to) {
        if (from > to) {
            return IntRange.EMPTY;
        }
        else {
            return new IntRange(from, to - from + 1);
        }
    }

    public static LongRange rangeTo(char from, long to) {
        if (from > to) {
            return LongRange.EMPTY;
        }
        else {
            return new LongRange(from, to - from + 1);
        }
    }

    public static FloatRange rangeTo(char from, float to) {
        return new FloatRange(from, to - from);
    }

    public static DoubleRange rangeTo(char from, double to) {
        return new DoubleRange(from, to - from);
    }

    public static CharRange rangeTo(char from, char to) {
        if (from > to) {
            return CharRange.EMPTY;
        }
        else {
            return new CharRange(from, to - from + 1);
        }
    }

    private Ranges() {}
}
