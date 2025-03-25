package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class VHItemModelProvider extends ItemModelProvider {
    public VHItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Herbalism.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(VHItems.ALDER_BARK);
        simpleBlockItem(VHBlocks.ALDER_SAPLING);
        parentRotatedBlockItem(VHBlocksNoDatagenLoot.ALDER_LOG);

        simpleItem(VHItems.BINDWEED_BUNDLE);
        simpleItem(VHItems.BLACKBERRY);
        simpleItem(VHItems.BLACKBERRY_LEAVES);
        simpleItem(VHItems.BLACKBERRY_LEAF_POULTICE);
        simpleItem(VHItems.BORAGE);
        simpleItem(VHItems.BROOM_BUNDLE);
        simpleItem(VHItems.BROOM_POULTICE);
        simpleItem(VHItems.BURDOCK_ROOT);
        simpleItem(VHItems.BURNET_BUNDLE);
        simpleItem(VHItems.CATCHWEED_BUNDLE);
        simpleItem(VHItems.CATMINT_LEAVES);
        simpleItem(VHItems.CELADINE_BUNDLE);
        simpleItem(VHItems.CELADINE_JUICE);
        simpleItem(VHItems.CAMOMILE_FLOWER);
        simpleItem(VHItems.COBWEB);
        simpleItem(VHItems.CHERVIL);
        simpleItem(VHItems.CHICKWEED);

        simpleItem(VHItems.BIRCH_SAP);
        simpleBlockItem(VHBlocks.SAPPY_BIRCH_SAPLING);
        parentRotatedBlockItem(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG);
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Herbalism.MODID,"item/" + item.getId().getPath()));
    }

    public ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Herbalism.MODID,"block/" + item.getId().getPath()));
    }

    public ItemModelBuilder parentRotatedBlockItem(RegistryObject<RotatedPillarBlock> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(Herbalism.MODID,"block/" + item.getId().getPath()));
    }

    public ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Herbalism.MODID,"item/" + getTextureName));
    }
}