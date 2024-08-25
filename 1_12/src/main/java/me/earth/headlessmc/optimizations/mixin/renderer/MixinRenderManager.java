package me.earth.headlessmc.optimizations.mixin.renderer;

import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderManager.class)
public class MixinRenderManager {
    // ported from HeadlessForge, used to be an ASM patch
    @Inject(
            method = "<init>",
            at = @At(
                    value = "me.earth.headlessmc.optimizations.injectors.LenientBeforeInvoke",
                    target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"),
            cancellable = true)
    private void onInit(CallbackInfo ci) {
        ci.cancel();
    }

}
