package me.earth.headlessmc.optimizations.injectors;

import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.points.BeforeInvoke;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

/**
 * Allows injecting into constructors anywhere. BE CAREFUL!
 *
 * @see BeforeInvoke
 */
@SuppressWarnings("unused")
@InjectionPoint.AtCode(namespace = "HMCOPTIMIZATIONS", value = "LENIENT_INVOKE")
public class LenientBeforeInvoke extends BeforeInvoke {
    public LenientBeforeInvoke(InjectionPointData data) {
        super(data);
    }

    @Override
    public RestrictTargetLevel getTargetRestriction(IInjectionPointContext context) {
        return RestrictTargetLevel.ALLOW_ALL;
    }

}
