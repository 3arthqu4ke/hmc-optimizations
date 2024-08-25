package me.earth.headlessmc.optimizations.mixin.renderer;

import me.earth.headlessmc.optimizations.hook.Hooks;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DynamicTexture.class)
public abstract class MixinDynamicTexture {
    @Inject(
        method = "updateDynamicTexture",
        at = @At("HEAD"),
        cancellable = true)
    private void updateDynamicTextureHook(CallbackInfo ci) {
        Hooks.DEFAULT_HOOK.invoke(ci);
    }
}