package me.earth.headlessmc.optimizations.mixin;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.api.command.Command;
import me.earth.headlessmc.command.CommandContextImpl;
import me.earth.headlessmc.optimizations.FPSCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(value = CommandContextImpl.class, remap = false)
public abstract class MixinCommandContextImpl {
    @Shadow protected abstract void add(Command command);

    @Inject(method = "<init>", at = @At("RETURN"))
    private void initHook(HeadlessMc log, CallbackInfo ci) {
        add(new FPSCommand(log));
    }

}
