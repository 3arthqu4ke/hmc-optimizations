package me.earth.headlessmc.optimizations;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.api.command.AbstractCommand;
import net.minecraft.client.Minecraft;

public class FPSCommand extends AbstractCommand {
    public FPSCommand(HeadlessMc ctx) {
        super(ctx, "fps", "Prints out the current FPS.");
    }

    @Override
    public void execute(String s, String... strings) {
        ctx.log(Minecraft.getDebugFPS() + " : " + Minecraft.getMinecraft().debug);
    }

}
