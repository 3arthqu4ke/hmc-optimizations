package me.earth.headlessmc.optimizations.replace;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.util.vector.Vector3f;

import java.util.Collection;

public class EmptyRenderGlobal extends RenderGlobal {
    public EmptyRenderGlobal(Minecraft minecraft) {
        super(minecraft);
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {

    }

    @Override
    public void makeEntityOutlineShader() {

    }

    @Override
    public void renderEntityOutlineFramebuffer() {

    }

    @Override
    protected boolean isRenderEntityOutlines() {
        return false;
    }

    @Override
    public void setWorldAndLoadRenderers(@Nullable WorldClient worldClientIn) {

    }

    @Override
    public void loadRenderers() {

    }

    @Override
    protected void stopChunkUpdates() {

    }

    @Override
    public void createBindEntityOutlineFbs(int i, int height) {

    }

    @Override
    public void renderEntities(Entity entity, ICamera iCamera, float partialTicks) {

    }

    @Override
    public String getDebugInfoRenders() {
        return "EmptyRenderGlobal-getDebugInfoRenders";
    }

    @Override
    protected int getRenderedChunks() {
        return 0;
    }

    @Override
    public String getDebugInfoEntities() {
        return "EmptyRenderGlobal-getDebugInfoEntities";
    }

    @Override
    public void setupTerrain(Entity entity, double d, ICamera iCamera, int i, boolean playerSpectator) {

    }

    @Override
    protected Vector3f getViewVector(Entity entity, double partialTicks) {
        return new Vector3f(0, 0, 0);
    }

    @Override
    public int renderBlockLayer(BlockRenderLayer blockRenderLayer, double d, int i, Entity entityIn) {
        return 0;
    }

    @Override
    public void updateClouds() {

    }

    @Override
    public void renderSky(float f, int pass) {

    }

    @Override
    public void renderClouds(float f, int i, double d, double e, double z) {

    }

    @Override
    public boolean hasCloudFog(double d, double e, double f, float partialTicks) {
        return false;
    }

    @Override
    public void updateChunks(long finishTimeNano) {

    }

    @Override
    public void renderWorldBorder(Entity entity, float partialTicks) {

    }

    @Override
    public void drawBlockDamageTexture(Tessellator tessellator, BufferBuilder bufferBuilder, Entity entity, float partialTicks) {

    }

    @Override
    public void drawSelectionBox(EntityPlayer entityPlayer, RayTraceResult rayTraceResult, int i, float partialTicks) {

    }

    @Override
    public void notifyBlockUpdate(World world, BlockPos blockPos, IBlockState iBlockState, IBlockState iBlockState2, int flags) {

    }

    @Override
    public void notifyLightSet(BlockPos pos) {

    }

    @Override
    public void markBlockRangeForRenderUpdate(int i, int j, int k, int l, int m, int z2) {

    }

    @Override
    public void playRecord(@Nullable SoundEvent soundEvent, BlockPos pos) {

    }

    @Override
    public void playSoundToAllNearExcept(@Nullable EntityPlayer entityPlayer, SoundEvent soundEvent, SoundCategory soundCategory, double d, double e, double z, float g, float h) {

    }

    @Override
    public void spawnParticle(int i, boolean bl, double d, double e, double f, double xSpeed, double h, double j, int... is) {

    }

    @Override
    public void spawnParticle(int i, boolean bl, boolean bl2, double d, double e, double z, double g, double h, double j, int... is) {

    }

    @Override
    public void onEntityAdded(Entity entityIn) {

    }

    @Override
    public void onEntityRemoved(Entity entityIn) {

    }

    @Override
    public void deleteAllDisplayLists() {

    }

    @Override
    public void broadcastSound(int i, BlockPos blockPos, int data) {

    }

    @Override
    public void playEvent(EntityPlayer entityPlayer, int i, BlockPos blockPos, int data) {

    }

    @Override
    public void sendBlockBreakProgress(int i, BlockPos blockPos, int progress) {

    }

    @Override
    public boolean hasNoChunkUpdates() {
        return true;
    }

    @Override
    public void setDisplayListEntitiesDirty() {

    }

    @Override
    public void updateTileEntities(Collection<TileEntity> collection, Collection<TileEntity> tileEntitiesToAdd) {

    }
}
