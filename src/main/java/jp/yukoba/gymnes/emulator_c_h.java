// Generated by jextract

package jp.yukoba.gymnes;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class emulator_c_h  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfInt C_LONG = JAVA_INT;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * #define _VCRT_COMPILER_PREPROCESSOR 1
     * }
     */
    public static int _VCRT_COMPILER_PREPROCESSOR() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _SAL_VERSION 20
     * }
     */
    public static int _SAL_VERSION() {
        return (int)20L;
    }
    /**
     * {@snippet :
     * #define __SAL_H_VERSION 180000000
     * }
     */
    public static int __SAL_H_VERSION() {
        return (int)180000000L;
    }
    /**
     * {@snippet :
     * #define _USE_DECLSPECS_FOR_SAL 0
     * }
     */
    public static int _USE_DECLSPECS_FOR_SAL() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _USE_ATTRIBUTES_FOR_SAL 0
     * }
     */
    public static int _USE_ATTRIBUTES_FOR_SAL() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _CRT_PACKING 8
     * }
     */
    public static int _CRT_PACKING() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _HAS_EXCEPTIONS 1
     * }
     */
    public static int _HAS_EXCEPTIONS() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _HAS_CXX17 0
     * }
     */
    public static int _HAS_CXX17() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _HAS_CXX20 0
     * }
     */
    public static int _HAS_CXX20() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _HAS_CXX23 0
     * }
     */
    public static int _HAS_CXX23() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _HAS_CXX26 0
     * }
     */
    public static int _HAS_CXX26() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _HAS_NODISCARD 0
     * }
     */
    public static int _HAS_NODISCARD() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define WCHAR_MIN 0
     * }
     */
    public static int WCHAR_MIN() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define WCHAR_MAX 65535
     * }
     */
    public static int WCHAR_MAX() {
        return (int)65535L;
    }
    /**
     * {@snippet :
     * #define WINT_MIN 0
     * }
     */
    public static int WINT_MIN() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define WINT_MAX 65535
     * }
     */
    public static int WINT_MAX() {
        return (int)65535L;
    }
    /**
     * {@snippet :
     * typedef unsigned long long uintptr_t;
     * }
     */
    public static final OfLong uintptr_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef char* va_list;
     * }
     */
    public static final AddressLayout va_list = RuntimeHelper.POINTER;
    public static MethodHandle __va_start$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$1,"__va_start");
    }
    /**
     * {@snippet :
     * void __va_start(va_list*,...);
     * }
     */
    public static void __va_start(MemorySegment x0, Object... x1) {
        var mh$ = __va_start$MH();
        try {
            mh$.invokeExact(x0, x1);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * typedef unsigned long long size_t;
     * }
     */
    public static final OfLong size_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long long ptrdiff_t;
     * }
     */
    public static final OfLong ptrdiff_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long long intptr_t;
     * }
     */
    public static final OfLong intptr_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned short wchar_t;
     * }
     */
    public static final OfShort wchar_t = JAVA_SHORT;
    public static MethodHandle __security_init_cookie$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$3,"__security_init_cookie");
    }
    /**
     * {@snippet :
     * void __security_init_cookie();
     * }
     */
    public static void __security_init_cookie() {
        var mh$ = __security_init_cookie$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle __security_check_cookie$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$5,"__security_check_cookie");
    }
    /**
     * {@snippet :
     * void __security_check_cookie(uintptr_t _StackCookie);
     * }
     */
    public static void __security_check_cookie(long _StackCookie) {
        var mh$ = __security_check_cookie$MH();
        try {
            mh$.invokeExact(_StackCookie);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle __report_gsfailure$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$0,"__report_gsfailure");
    }
    /**
     * {@snippet :
     * void __report_gsfailure(uintptr_t _StackCookie);
     * }
     */
    public static void __report_gsfailure(long _StackCookie) {
        var mh$ = __report_gsfailure$MH();
        try {
            mh$.invokeExact(_StackCookie);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MemoryLayout __security_cookie$LAYOUT() {
        return JAVA_LONG;
    }
    public static VarHandle __security_cookie$VH() {
        return constants$1.const$1;
    }
    public static MemorySegment __security_cookie$SEGMENT() {
        return RuntimeHelper.requireNonNull(constants$1.const$2,"__security_cookie");
    }
    /**
     * Getter for variable:
     * {@snippet :
     * uintptr_t __security_cookie;
     * }
     */
    public static long __security_cookie$get() {
        return (long) constants$1.const$1.get(RuntimeHelper.requireNonNull(constants$1.const$2, "__security_cookie"));
    }
    /**
     * Setter for variable:
     * {@snippet :
     * uintptr_t __security_cookie;
     * }
     */
    public static void __security_cookie$set(long x) {
        constants$1.const$1.set(RuntimeHelper.requireNonNull(constants$1.const$2, "__security_cookie"), x);
    }
    /**
     * {@snippet :
     * typedef signed char int8_t;
     * }
     */
    public static final OfByte int8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short int16_t;
     * }
     */
    public static final OfShort int16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int int32_t;
     * }
     */
    public static final OfInt int32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long long int64_t;
     * }
     */
    public static final OfLong int64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint8_t;
     * }
     */
    public static final OfByte uint8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short uint16_t;
     * }
     */
    public static final OfShort uint16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int uint32_t;
     * }
     */
    public static final OfInt uint32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long long uint64_t;
     * }
     */
    public static final OfLong uint64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char int_least8_t;
     * }
     */
    public static final OfByte int_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short int_least16_t;
     * }
     */
    public static final OfShort int_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int int_least32_t;
     * }
     */
    public static final OfInt int_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long long int_least64_t;
     * }
     */
    public static final OfLong int_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint_least8_t;
     * }
     */
    public static final OfByte uint_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short uint_least16_t;
     * }
     */
    public static final OfShort uint_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int uint_least32_t;
     * }
     */
    public static final OfInt uint_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long long uint_least64_t;
     * }
     */
    public static final OfLong uint_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char int_fast8_t;
     * }
     */
    public static final OfByte int_fast8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef int int_fast16_t;
     * }
     */
    public static final OfInt int_fast16_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef int int_fast32_t;
     * }
     */
    public static final OfInt int_fast32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long long int_fast64_t;
     * }
     */
    public static final OfLong int_fast64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint_fast8_t;
     * }
     */
    public static final OfByte uint_fast8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned int uint_fast16_t;
     * }
     */
    public static final OfInt uint_fast16_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned int uint_fast32_t;
     * }
     */
    public static final OfInt uint_fast32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long long uint_fast64_t;
     * }
     */
    public static final OfLong uint_fast64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long long intmax_t;
     * }
     */
    public static final OfLong intmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long long uintmax_t;
     * }
     */
    public static final OfLong uintmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char NES_Byte_C;
     * }
     */
    public static final OfByte NES_Byte_C = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short NES_Address_C;
     * }
     */
    public static final OfShort NES_Address_C = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int NES_Pixel_C;
     * }
     */
    public static final OfInt NES_Pixel_C = JAVA_INT;
    /**
     * {@snippet :
     * typedef struct Emulator_C* Emulator_Handle;
     * }
     */
    public static final AddressLayout Emulator_Handle = RuntimeHelper.POINTER;
    public static MethodHandle emulator_create$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$4,"emulator_create");
    }
    /**
     * {@snippet :
     * Emulator_Handle emulator_create(char* rom_path);
     * }
     */
    public static MemorySegment emulator_create(MemorySegment rom_path) {
        var mh$ = emulator_create$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(rom_path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_destroy$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$5,"emulator_destroy");
    }
    /**
     * {@snippet :
     * void emulator_destroy(Emulator_Handle emulator);
     * }
     */
    public static void emulator_destroy(MemorySegment emulator) {
        var mh$ = emulator_destroy$MH();
        try {
            mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_get_screen_buffer$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$0,"emulator_get_screen_buffer");
    }
    /**
     * {@snippet :
     * NES_Pixel_C* emulator_get_screen_buffer(Emulator_Handle emulator);
     * }
     */
    public static MemorySegment emulator_get_screen_buffer(MemorySegment emulator) {
        var mh$ = emulator_get_screen_buffer$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_get_memory_buffer$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$1,"emulator_get_memory_buffer");
    }
    /**
     * {@snippet :
     * NES_Byte_C* emulator_get_memory_buffer(Emulator_Handle emulator);
     * }
     */
    public static MemorySegment emulator_get_memory_buffer(MemorySegment emulator) {
        var mh$ = emulator_get_memory_buffer$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_get_controller$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$3,"emulator_get_controller");
    }
    /**
     * {@snippet :
     * NES_Byte_C* emulator_get_controller(Emulator_Handle emulator, int port);
     * }
     */
    public static MemorySegment emulator_get_controller(MemorySegment emulator, int port) {
        var mh$ = emulator_get_controller$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(emulator, port);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_reset$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$4,"emulator_reset");
    }
    /**
     * {@snippet :
     * void emulator_reset(Emulator_Handle emulator);
     * }
     */
    public static void emulator_reset(MemorySegment emulator) {
        var mh$ = emulator_reset$MH();
        try {
            mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_step$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$5,"emulator_step");
    }
    /**
     * {@snippet :
     * void emulator_step(Emulator_Handle emulator);
     * }
     */
    public static void emulator_step(MemorySegment emulator) {
        var mh$ = emulator_step$MH();
        try {
            mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_backup$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$0,"emulator_backup");
    }
    /**
     * {@snippet :
     * void emulator_backup(Emulator_Handle emulator);
     * }
     */
    public static void emulator_backup(MemorySegment emulator) {
        var mh$ = emulator_backup$MH();
        try {
            mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_restore$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$1,"emulator_restore");
    }
    /**
     * {@snippet :
     * void emulator_restore(Emulator_Handle emulator);
     * }
     */
    public static void emulator_restore(MemorySegment emulator) {
        var mh$ = emulator_restore$MH();
        try {
            mh$.invokeExact(emulator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_get_width$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$3,"emulator_get_width");
    }
    /**
     * {@snippet :
     * int emulator_get_width(,...);
     * }
     */
    public static int emulator_get_width(Object... x0) {
        var mh$ = emulator_get_width$MH();
        try {
            return (int)mh$.invokeExact(x0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle emulator_get_height$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$4,"emulator_get_height");
    }
    /**
     * {@snippet :
     * int emulator_get_height(,...);
     * }
     */
    public static int emulator_get_height(Object... x0) {
        var mh$ = emulator_get_height$MH();
        try {
            return (int)mh$.invokeExact(x0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * #define _VCRUNTIME_DISABLED_WARNINGS 4514
     * }
     */
    public static int _VCRUNTIME_DISABLED_WARNINGS() {
        return (int)4514L;
    }
    /**
     * {@snippet :
     * #define NULL 0
     * }
     */
    public static MemorySegment NULL() {
        return constants$3.const$5;
    }
    /**
     * {@snippet :
     * #define INT8_MIN -128
     * }
     */
    public static int INT8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT16_MIN -32768
     * }
     */
    public static int INT16_MIN() {
        return (int)-32768L;
    }
    /**
     * {@snippet :
     * #define INT32_MIN -2147483648
     * }
     */
    public static int INT32_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT64_MIN -9223372036854775808
     * }
     */
    public static long INT64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT8_MAX 127
     * }
     */
    public static byte INT8_MAX() {
        return (byte)127L;
    }
    /**
     * {@snippet :
     * #define INT16_MAX 32767
     * }
     */
    public static short INT16_MAX() {
        return (short)32767L;
    }
    /**
     * {@snippet :
     * #define INT32_MAX 2147483647
     * }
     */
    public static int INT32_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT64_MAX 9223372036854775807
     * }
     */
    public static long INT64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT8_MAX 255
     * }
     */
    public static byte UINT8_MAX() {
        return (byte)255L;
    }
    /**
     * {@snippet :
     * #define UINT16_MAX 65535
     * }
     */
    public static short UINT16_MAX() {
        return (short)65535L;
    }
    /**
     * {@snippet :
     * #define UINT32_MAX 4294967295
     * }
     */
    public static int UINT32_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT64_MAX -1
     * }
     */
    public static long UINT64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST8_MIN -128
     * }
     */
    public static int INT_LEAST8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST16_MIN -32768
     * }
     */
    public static int INT_LEAST16_MIN() {
        return (int)-32768L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST32_MIN -2147483648
     * }
     */
    public static int INT_LEAST32_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST64_MIN -9223372036854775808
     * }
     */
    public static long INT_LEAST64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST8_MAX 127
     * }
     */
    public static byte INT_LEAST8_MAX() {
        return (byte)127L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST16_MAX 32767
     * }
     */
    public static short INT_LEAST16_MAX() {
        return (short)32767L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST32_MAX 2147483647
     * }
     */
    public static int INT_LEAST32_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST64_MAX 9223372036854775807
     * }
     */
    public static long INT_LEAST64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST8_MAX 255
     * }
     */
    public static byte UINT_LEAST8_MAX() {
        return (byte)255L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST16_MAX 65535
     * }
     */
    public static short UINT_LEAST16_MAX() {
        return (short)65535L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST32_MAX 4294967295
     * }
     */
    public static int UINT_LEAST32_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST64_MAX -1
     * }
     */
    public static long UINT_LEAST64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INT_FAST8_MIN -128
     * }
     */
    public static int INT_FAST8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT_FAST16_MIN -2147483648
     * }
     */
    public static int INT_FAST16_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT_FAST32_MIN -2147483648
     * }
     */
    public static int INT_FAST32_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT_FAST64_MIN -9223372036854775808
     * }
     */
    public static long INT_FAST64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_FAST8_MAX 127
     * }
     */
    public static byte INT_FAST8_MAX() {
        return (byte)127L;
    }
    /**
     * {@snippet :
     * #define INT_FAST16_MAX 2147483647
     * }
     */
    public static int INT_FAST16_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT_FAST32_MAX 2147483647
     * }
     */
    public static int INT_FAST32_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT_FAST64_MAX 9223372036854775807
     * }
     */
    public static long INT_FAST64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST8_MAX 255
     * }
     */
    public static byte UINT_FAST8_MAX() {
        return (byte)255L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST16_MAX 4294967295
     * }
     */
    public static int UINT_FAST16_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST32_MAX 4294967295
     * }
     */
    public static int UINT_FAST32_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST64_MAX -1
     * }
     */
    public static long UINT_FAST64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INTPTR_MIN -9223372036854775808
     * }
     */
    public static long INTPTR_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INTPTR_MAX 9223372036854775807
     * }
     */
    public static long INTPTR_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINTPTR_MAX -1
     * }
     */
    public static long UINTPTR_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INTMAX_MIN -9223372036854775808
     * }
     */
    public static long INTMAX_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INTMAX_MAX 9223372036854775807
     * }
     */
    public static long INTMAX_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINTMAX_MAX -1
     * }
     */
    public static long UINTMAX_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define PTRDIFF_MIN -9223372036854775808
     * }
     */
    public static long PTRDIFF_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define PTRDIFF_MAX 9223372036854775807
     * }
     */
    public static long PTRDIFF_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define SIZE_MAX -1
     * }
     */
    public static long SIZE_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define SIG_ATOMIC_MIN -2147483648
     * }
     */
    public static int SIG_ATOMIC_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define SIG_ATOMIC_MAX 2147483647
     * }
     */
    public static int SIG_ATOMIC_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define EMULATOR_WIDTH 256
     * }
     */
    public static int EMULATOR_WIDTH() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define EMULATOR_HEIGHT 240
     * }
     */
    public static int EMULATOR_HEIGHT() {
        return (int)240L;
    }
}


