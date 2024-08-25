package me.earth.headlessmc.optimizations.replace;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class EmptyRenderItem extends RenderItem {
    public EmptyRenderItem(TextureManager textureManager, ModelManager modelManager, ItemColors itemColors) {
        super(textureManager, modelManager, itemColors);
    }

    @Override
    protected void registerItem(Item item, int i, String identifier) {

    }

    @Override
    protected void registerBlock(Block block, int i, String identifier) {

    }

    @Override
    public void renderItem(ItemStack itemStack, IBakedModel model) {

    }

    @Override
    public boolean shouldRenderItemIn3D(ItemStack stack) {
        return false;
    }

    @Override
    public void renderItem(ItemStack itemStack, ItemCameraTransforms.TransformType cameraTransformType) {

    }

    @Override
    public IBakedModel getItemModelWithOverrides(ItemStack itemStack, @Nullable World world, @Nullable EntityLivingBase entitylivingbaseIn) {
        return null;
    }

    @Override
    public void renderItem(ItemStack itemStack, EntityLivingBase entityLivingBase, ItemCameraTransforms.TransformType transformType, boolean leftHanded) {

    }

    @Override
    protected void renderItemModel(ItemStack itemStack, IBakedModel iBakedModel, ItemCameraTransforms.TransformType transformType, boolean leftHanded) {

    }

    @Override
    public void renderItemIntoGUI(ItemStack itemStack, int i, int y) {

    }

    @Override
    protected void renderItemModelIntoGUI(ItemStack itemStack, int i, int j, IBakedModel bakedmodel) {

    }

    @Override
    public void renderItemAndEffectIntoGUI(ItemStack itemStack, int i, int yPosition) {

    }

    @Override
    public void renderItemAndEffectIntoGUI(@Nullable EntityLivingBase entityLivingBase, ItemStack itemStack, int i, int j) {

    }

    @Override
    public void renderItemOverlays(FontRenderer fontRenderer, ItemStack itemStack, int i, int yPosition) {

    }

    @Override
    public void renderItemOverlayIntoGUI(FontRenderer fontRenderer, ItemStack itemStack, int i, int j, @Nullable String text) {

    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {

    }

}
