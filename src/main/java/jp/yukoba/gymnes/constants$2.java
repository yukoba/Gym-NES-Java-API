// Generated by jextract

package jp.yukoba.gymnes;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "emulator_get_screen_buffer",
        constants$1.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "emulator_get_memory_buffer",
        constants$1.const$3
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "emulator_get_controller",
        constants$2.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "emulator_reset",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "emulator_step",
        constants$0.const$0
    );
}


