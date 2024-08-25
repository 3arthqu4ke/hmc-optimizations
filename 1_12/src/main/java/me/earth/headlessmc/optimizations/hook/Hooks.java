package me.earth.headlessmc.optimizations.hook;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Supplier;

public class Hooks {
    private static final boolean HOOK = true;

    public static final Hook<CallbackInfo> DEFAULT_HOOK = ci -> {
        if (HOOK) {
            ci.cancel();
        }
    };

    public static final Hook<Runnable> RUN_HOOK = runnable -> {
        if (!HOOK) {
            runnable.run();
        }
    };

    public static <T> void returnableHook(CallbackInfoReturnable<T> cir, T value) {
        if (HOOK) {
            cir.setReturnValue(value);
        }
    }

    public static <T> T lambdaHook(Supplier<T> ifHooked, Supplier<T> otherwise) {
        return HOOK ? ifHooked.get() : otherwise.get();
    }

    public static <T> T valueHook(T ifHooked, T otherwise) {
        return HOOK ? ifHooked : otherwise;
    }

    public static boolean active() {
        return HOOK;
    }

}
