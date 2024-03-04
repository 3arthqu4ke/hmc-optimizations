package me.earth.hmc_optimizations;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.command.AbstractCommand;
import net.minecraft.client.Minecraft;

public class FPSCommand extends AbstractCommand {
    public FPSCommand(HeadlessMc ctx) {
        super(ctx, "fps", "Prints out the current FPS.");
    }

    @Override
    public void execute(String... strings) {
        ctx.log(Minecraft.getInstance().fpsString);
    }

}
