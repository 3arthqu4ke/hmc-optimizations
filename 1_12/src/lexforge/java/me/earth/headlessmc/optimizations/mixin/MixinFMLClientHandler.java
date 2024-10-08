package me.earth.headlessmc.optimizations.mixin;

import me.earth.headlessmc.optimizations.hook.Hooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.lang.reflect.Method;

@SuppressWarnings("UnusedMixin")
@Pseudo
@Mixin(targets = "net/minecraftforge/fml/client/FMLClientHandler", remap = false)
public abstract class MixinFMLClientHandler {
    @Redirect(
        method = "beginMinecraftLoading",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraftforge/fml/client/SplashProgress;start()V")
    )
    private void beginMinecraftLoadingHook() {
        Hooks.RUN_HOOK.invoke(() -> {
            try {
                Class<?> splashProgress = Class.forName("net.minecraftforge.fml.client.SplashProgress");
                Method start = splashProgress.getMethod("start");
                start.invoke(null);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Inject(
        method = "processWindowMessages",
        at = @At("HEAD"),
        cancellable = true)
    private void processWindowMessagesHook(CallbackInfo ci) {
        Hooks.DEFAULT_HOOK.invoke(ci);
    }

    @Inject(
        method = "updateCloudSettings",
        at = @At("HEAD"),
        cancellable = true)
    private void cloudHook(CallbackInfo ci) {
        Hooks.DEFAULT_HOOK.invoke(ci);
    }

    @Inject(
        method = "isDisplayCloseRequested",
        at = @At("HEAD"),
        cancellable = true)
    private void isDisplayCloseRequestedHook(CallbackInfoReturnable<Boolean> cir) {
        Hooks.returnableHook(cir, false);
    }
}