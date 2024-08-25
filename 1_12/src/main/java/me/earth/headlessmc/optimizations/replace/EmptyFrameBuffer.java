package me.earth.headlessmc.optimizations.replace;

import net.minecraft.client.shader.Framebuffer;

public class EmptyFrameBuffer extends Framebuffer {
    public EmptyFrameBuffer(int i, int j, boolean bl) {
        super(i, j, bl);
    }

    @Override
    public void createBindFramebuffer(int i, int height) {

    }

    @Override
    public void deleteFramebuffer() {

    }

    @Override
    public void createFramebuffer(int i, int height) {

    }

    @Override
    public void setFramebufferFilter(int framebufferFilterIn) {

    }

    @Override
    public void checkFramebufferComplete() {

    }

    @Override
    public void bindFramebufferTexture() {

    }

    @Override
    public void unbindFramebufferTexture() {

    }

    @Override
    public void bindFramebuffer(boolean bl) {

    }

    @Override
    public void unbindFramebuffer() {

    }

    @Override
    public void setFramebufferColor(float f, float g, float h, float alpha) {

    }

    @Override
    public void framebufferRender(int i, int height) {

    }

    @Override
    public void framebufferRenderExt(int i, int height, boolean bl) {

    }

    @Override
    public void framebufferClear() {

    }

}
