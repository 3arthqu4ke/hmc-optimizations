package me.earth.headlessmc.optimizations.mixin.gui;

import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// ported from HeadlessForge, used to be an ASM patch
@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu {
    @Inject(
        method = "<init>",
        at = @At(
            value = "me.earth.headlessmc.optimizations.injectors.LenientBeforeInvoke",
            target = "Lorg/lwjgl/opengl/GLContext;getCapabilities()Lorg/lwjgl/opengl/ContextCapabilities;"
        ),
        cancellable = true
    )
    private void onInit(CallbackInfo ci) {
        ci.cancel();
    }

}
