package me.earth.hmc_optimizations;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class HMCOptimizations {
    public static boolean optimize = Boolean.parseBoolean(System.getProperty("hmc.optimize", "true"));

    public static void optimize(CallbackInfo ci) {
        if (optimize) {
            ci.cancel();
        }
    }

}
