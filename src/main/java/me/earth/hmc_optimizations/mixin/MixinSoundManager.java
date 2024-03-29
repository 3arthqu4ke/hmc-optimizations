package me.earth.hmc_optimizations.mixin;

import me.earth.hmc_optimizations.HMCOptimizations;
import net.minecraft.client.Camera;
import net.minecraft.client.sounds.SoundManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundManager.class)
public class MixinSoundManager {
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void tickHook(CallbackInfo ci) {
        HMCOptimizations.optimize(ci);
    }

    @Inject(method = "updateSource", at = @At("HEAD"), cancellable = true)
    private void updateSourceHook(Camera camera, CallbackInfo ci) {
        HMCOptimizations.optimize(ci);
    }

}
