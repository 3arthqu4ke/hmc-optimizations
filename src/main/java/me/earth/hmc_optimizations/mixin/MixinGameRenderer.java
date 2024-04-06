package me.earth.hmc_optimizations.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {
    @Shadow @Final Minecraft minecraft;

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void renderHook(float f, long l, boolean bl, CallbackInfo ci) {
        // finishing of a loading overlay is tied to rendering it, so in that case we need to render it.
        if (minecraft.getOverlay() == null && minecraft.screen == null) {
            ci.cancel();
        }
    }

}
