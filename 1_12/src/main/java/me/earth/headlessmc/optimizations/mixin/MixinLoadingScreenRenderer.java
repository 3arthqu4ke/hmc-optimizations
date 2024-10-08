package me.earth.headlessmc.optimizations.mixin;

import me.earth.headlessmc.optimizations.hook.Hooks;
import net.minecraft.client.LoadingScreenRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LoadingScreenRenderer.class)
public abstract class MixinLoadingScreenRenderer {
    @Inject(method = "setLoadingProgress", at = @At("HEAD"), cancellable = true)
    private void loadingProgressHook(CallbackInfo ci) {
        Hooks.DEFAULT_HOOK.invoke(ci);
    }

}
