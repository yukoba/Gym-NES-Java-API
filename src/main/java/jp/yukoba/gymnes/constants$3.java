// Generated by jextract

package jp.yukoba.gymnes;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "emulator_backup",
        constants$0.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "emulator_restore",
        constants$0.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandleVariadic(
        "emulator_get_width",
        constants$3.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "emulator_get_height",
        constants$3.const$2
    );
    static final MemorySegment const$5 = MemorySegment.ofAddress(0L);
}


