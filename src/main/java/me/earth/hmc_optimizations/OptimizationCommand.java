package me.earth.hmc_optimizations;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.command.AbstractCommand;

public class OptimizationCommand extends AbstractCommand {
    public OptimizationCommand(HeadlessMc ctx) {
        super(ctx, "optimize", "Turns HMCOptimizations off/on, e.g. for when want to use the render command.");
    }

    @Override
    public void execute(String... strings) {
        HMCOptimizations.optimize = !HMCOptimizations.optimize;
        ctx.log("HMC-Optimizations " + (HMCOptimizations.optimize ? "enabled." : "disabled."));
    }

}
