package me.earth.hmc_optimizations.mixin;

import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class MixinLevelRenderer {
    @Inject(method = "createStars", at = @At("HEAD"), cancellable = true)
    private void createStarsHook(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "createLightSky", at = @At("HEAD"), cancellable = true)
    private void createLightSkyHook(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "createDarkSky", at = @At("HEAD"), cancellable = true)
    private void createDarkSkyHook(CallbackInfo ci) {
        ci.cancel();
    }

}
