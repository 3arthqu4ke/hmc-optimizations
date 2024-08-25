package me.earth.headlessmc.optimizations.mixin;

import me.earth.headlessmc.optimizations.FPSCommand;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings({"unused", "UnusedMixin"})
@Mixin(value = FPSCommand.class)
public abstract class MixinFMLClientHandler {
    // dummy because FMLClientHandler does not exist on Fabric

}