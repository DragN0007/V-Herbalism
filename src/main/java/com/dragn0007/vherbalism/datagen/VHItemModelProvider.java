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
        simpleItem(VHItems.COLTSFOOT_BUNDLE);
        simpleItem(VHItems.COMFREY_LEAF);
        simpleItem(VHItems.COMFREY_ROOT);
        simpleItem(VHItems.DAISY_LEAVES);
        simpleItem(VHItems.DANDELION_LEAVES);
        simpleItem(VHItems.DANDELION_ROOT);
        simpleItem(VHItems.DOCK_LEAF);
        simpleItem(VHItems.ELDERBERRY);
        simpleItem(VHItems.ELDERBERRY_LEAVES);
        simpleItem(VHItems.ELDERBERRY_LEAF_POULTICE);
        simpleItem(VHItems.FENNEL_STALK);
        simpleItem(VHItems.FEVERFEW_BUNDLE);
        simpleItem(VHItems.GOATWEED_BUNDLE);
        simpleItem(VHItems.GARLIC);
        simpleItem(VHItems.GOLDENROD_BUNDLE);
        simpleItem(VHItems.GOLDENROD_POULTICE);
        simpleItem(VHItems.HAWKWEED_BUNDLE);
        simpleItem(VHItems.HEATHER_BUNDLE);
        simpleItem(VHItems.HORSETAIL_BUNDLE);
        simpleItem(VHItems.HORSETAIL_POULTICE);
        simpleItem(VHItems.IVY_LEAF);
        simpleItem(VHItems.JUNIPERBERRY);
        simpleItem(VHItems.TOPICAL_POULTICE);
        simpleItem(VHItems.BAY_LAUREL_LEAF);
        simpleItem(VHItems.WATER_BAY_LAUREL_LEAF);
        simpleItem(VHItems.HONEY_BAY_LAUREL_LEAF);
        simpleItem(VHItems.LAVENDER_BUNDLE);
        simpleItem(VHItems.BRIGHT_EYE_BUNDLE);
        simpleItem(VHItems.LOVAGE_BUNDLE);
        simpleItem(VHItems.BRIGHT_EYE_LOVAGE_POULTICE);
        simpleItem(VHItems.LUNGWORT_LEAF);
        simpleItem(VHItems.MALLOW);
        simpleItem(VHItems.MARIGOLD_BUNDLE);
        simpleItem(VHItems.MARIGOLD_POULTICE);
        simpleItem(VHItems.MINT_LEAVES);
        simpleItem(VHItems.MOSS_CLUMP);
        simpleItem(VHItems.DRIED_OAK_LEAVES);
        simpleItem(VHItems.POPPY_SEEDS);
        simpleItem(VHItems.RASPBERRY);
        simpleItem(VHItems.RASPBERRY_LEAVES);
        simpleItem(VHItems.PARSLEY_LEAVES);
        simpleItem(VHItems.RAGWEED_BUNDLE);
        simpleItem(VHItems.RAGWORT_LEAVES);
        simpleItem(VHItems.RHUBARB);
        simpleItem(VHItems.RHUBARB_LEAF);
        simpleItem(VHItems.ROSEMARY_BUNDLE);
        simpleItem(VHItems.RUSH_BUNDLE);
        simpleItem(VHItems.SHEEP_SORREL_BUNDLE);
        simpleItem(VHItems.SORREL_LEAVES);
        simpleItem(VHItems.STINGING_NETTLE_LEAVES);
        simpleItem(VHItems.TREE_SAP);
        simpleItem(VHItems.SWEET_SEDGE_BUNDLE);
        simpleItem(VHItems.TANSY_BUNDLE);
        simpleItem(VHItems.THYME_BUNDLE);
        simpleItem(VHItems.TORMENTIL_BUNDLE);
        simpleItem(VHItems.TORMENTIL_POULTICE);
        simpleItem(VHItems.WATERMINT_BUNDLE);
        simpleItem(VHItems.WILLOW_BUNDLE);
        simpleItem(VHItems.COOKED_WILLOW);
        simpleItem(VHItems.WINTERGREEN_BERRY);
        simpleItem(VHItems.WINTERGREEN_LEAVES);
        simpleItem(VHItems.WINTERGREEN_LEAF_POULTICE);
        simpleItem(VHItems.WOOD_SORREL_LEAF);
        simpleItem(VHItems.WOOD_SORREL_POULTICE);
        simpleItem(VHItems.YARROW_BUNDLE);
        simpleItem(VHItems.DEATHBERRY);
        simpleItem(VHItems.DEATHBERRY_SEEDS);
        simpleItem(VHItems.FOXGLOVE_SEEDS);
        simpleItem(VHItems.HOLLYBERRY);
        simpleItem(VHItems.HEMLOCK_BUNDLE);
        simpleItem(VHItems.NIGHTSHADE_BERRY);
        simpleItem(VHItems.MEADOW_SAFFRON_BUNDLE);
        simpleItem(VHItems.SNAKEROOT_BUNDLE);
        simpleItem(VHItems.SNAKEROOT_PETALS);
        simpleItem(VHItems.WILLOW_LEAVES_BUNDLE);


        simpleItem(VHItems.BIRCH_SAP);
        simpleBlockItem(VHBlocks.SAPPY_BIRCH_SAPLING);
        parentRotatedBlockItem(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG);

        simpleBlockItem(VHBlocks.WILLOW_SAPLING);
        parentRotatedBlockItem(VHBlocksNoDatagenLoot.WILLOW_LOG);
        simpleItem(VHItems.WILLOW_BARK);
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