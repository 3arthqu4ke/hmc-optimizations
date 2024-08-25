package me.earth.headlessmc.optimizations.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.util.profiling.ProfileResults;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MixinMinecraft {
    @Inject(method = "renderFpsMeter", at = @At("HEAD"), cancellable = true)
    private void renderFpsMeterHook(PoseStack poseStack, ProfileResults profileResults, CallbackInfo ci) {
        ci.cancel();
    }

}
