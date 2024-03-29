package me.earth.hmc_optimizations.mixin;

import me.earth.hmc_optimizations.HMCOptimizations;
import net.minecraft.client.sounds.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundEngine.class)
public class MixinSoundEngine {
    // TODO: handle sound differently from rendering?
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void tickHook(CallbackInfo ci) {
        HMCOptimizations.optimize(ci);
    }

    @Inject(method = "play", at = @At("HEAD"), cancellable = true)
    private void playHook(CallbackInfo ci) {
        HMCOptimizations.optimize(ci);
    }

}
