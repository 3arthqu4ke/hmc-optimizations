package me.earth.headlessmc.optimizations.replace;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;

public class EmptyFontRenderer extends FontRenderer {
    public EmptyFontRenderer(GameSettings gameSettings, ResourceLocation resourceLocation, TextureManager textureManager, boolean bl) {
        super(gameSettings, resourceLocation, textureManager, bl);
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {

    }

    @Override
    public int drawStringWithShadow(String string, float f, float g, int color) {
        return 0;
    }

    @Override
    public int drawString(String string, int i, int j, int color) {
        return 0;
    }

    @Override
    public int drawString(String string, float f, float g, int i, boolean dropShadow) {
        return 0;
    }

    @Override
    public int getStringWidth(String text) {
        return 0;
    }

    @Override
    public int getCharWidth(char character) {
        return 0;
    }

    @Override
    public String trimStringToWidth(String string, int width) {
        return string;
    }

    @Override
    public String trimStringToWidth(String string, int i, boolean reverse) {
        return string;
    }

    @Override
    public void drawSplitString(String string, int i, int j, int k, int textColor) {

    }

    @Override
    public int getWordWrappedHeight(String string, int maxLength) {
        return 0;
    }

    @Override
    public int getColorCode(char character) {
        return -1;
    }

}
