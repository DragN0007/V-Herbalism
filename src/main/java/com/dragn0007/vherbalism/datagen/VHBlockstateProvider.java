package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class VHBlockstateProvider extends BlockStateProvider {
    public VHBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Herbalism.MODID, exFileHelper);
    }
    @Override
    public void registerStatesAndModels() {
        
        logBlock(VHBlocksNoDatagenLoot.ALDER_LOG.get());
        blockWithItem(VHBlocks.ALDER_PLANKS);
        simpleBlockWithItem(VHBlocks.ALDER_LEAVES.get(), models().cubeAll(VHBlocks.ALDER_LEAVES.getId().getPath(),
                blockTexture(VHBlocks.ALDER_LEAVES.get())).renderType("cutout"));
        stairsBlock((StairBlock) VHBlocks.ALDER_STAIRS.get(), blockTexture(VHBlocks.ALDER_PLANKS.get()));
        simpleBlockItem(VHBlocks.ALDER_STAIRS.get(), models().stairs(VHBlocks.ALDER_STAIRS.getId().getPath(),
                blockTexture(VHBlocks.ALDER_PLANKS.get()), blockTexture(VHBlocks.ALDER_PLANKS.get()), blockTexture(VHBlocks.ALDER_PLANKS.get())));
        slabBlock((SlabBlock) VHBlocks.ALDER_SLAB.get(), blockTexture(VHBlocks.ALDER_PLANKS.get()), blockTexture(VHBlocks.ALDER_PLANKS.get()));
        simpleBlockItem(VHBlocks.ALDER_SLAB.get(), models().slab(VHBlocks.ALDER_SLAB.getId().getPath(),
                blockTexture(VHBlocks.ALDER_PLANKS.get()), blockTexture(VHBlocks.ALDER_PLANKS.get()), blockTexture(VHBlocks.ALDER_PLANKS.get())));
        simpleBlock(VHBlocks.ALDER_SAPLING.get(), models().cross(VHBlocks.ALDER_SAPLING.getId().getPath(),
                blockTexture(VHBlocks.ALDER_SAPLING.get())).renderType("cutout"));
        fenceBlock((FenceBlock) VHBlocks.ALDER_FENCE.get(), blockTexture(VHBlocks.ALDER_PLANKS.get()));
        simpleBlockItem(VHBlocks.ALDER_FENCE.get(), models().fenceInventory(VHBlocks.ALDER_FENCE.getId().getPath(),
                blockTexture(VHBlocks.ALDER_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) VHBlocks.ALDER_FENCE_GATE.get(), blockTexture(VHBlocks.ALDER_PLANKS.get()));
        simpleBlockItem(VHBlocks.ALDER_FENCE_GATE.get(), models().fenceGate(VHBlocks.ALDER_FENCE_GATE.getId().getPath(),
                blockTexture(VHBlocks.ALDER_PLANKS.get())));

        logBlock(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get());
        simpleBlock(VHBlocks.SAPPY_BIRCH_SAPLING.get(), models().cross(VHBlocks.SAPPY_BIRCH_SAPLING.getId().getPath(),
                blockTexture(VHBlocks.SAPPY_BIRCH_SAPLING.get())).renderType("cutout"));

        simpleBlockWithItem(VHBlocks.PREPARED_OAK_LEAVES.get(), models().cubeAll(VHBlocks.PREPARED_OAK_LEAVES.getId().getPath(),
                blockTexture(VHBlocks.PREPARED_OAK_LEAVES.get())).renderType("cutout"));
        simpleBlockWithItem(VHBlocks.DRIED_OAK_LEAVES.get(), models().cubeAll(VHBlocks.DRIED_OAK_LEAVES.getId().getPath(),
                blockTexture(VHBlocks.DRIED_OAK_LEAVES.get())).renderType("cutout"));

        blockWithItem(VHBlocks.BURDOCK_ROOT);
        simpleBlock(VHBlocks.HANGING_BURDOCK_ROOT.get(), models().cross(VHBlocks.HANGING_BURDOCK_ROOT.getId().getPath(),
                wildPlantTexture("hanging_burdock_root")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.BINDWEED.get(), "bindweed_stage_", "bindweed_stage_");
        simpleBlock(VHBlocks.WILD_BINDWEED.get(), models().cross(VHBlocks.WILD_BINDWEED.getId().getPath(),
                wildPlantTexture("bindweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.BORAGE.get(), "borage_stage_", "borage_stage_");
        simpleBlock(VHBlocks.WILD_BORAGE.get(), models().cross(VHBlocks.WILD_BORAGE.getId().getPath(),
                wildPlantTexture("borage_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.BURNET.get(), "burnet_stage_", "burnet_stage_");
        simpleBlock(VHBlocks.WILD_BURNET.get(), models().cross(VHBlocks.WILD_BURNET.getId().getPath(),
                wildPlantTexture("burnet_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CATCHWEED.get(), "catchweed_stage_", "catchweed_stage_");
        simpleBlock(VHBlocks.WILD_CATCHWEED.get(), models().cross(VHBlocks.WILD_CATCHWEED.getId().getPath(),
                wildPlantTexture("catchweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CATMINT.get(), "catmint_stage_", "catmint_stage_");
        simpleBlock(VHBlocks.WILD_CATMINT.get(), models().cross(VHBlocks.WILD_CATMINT.getId().getPath(),
                wildPlantTexture("catmint_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CELADINE.get(), "celadine_stage_", "celadine_stage_");
        simpleBlock(VHBlocks.WILD_CELADINE.get(), models().cross(VHBlocks.WILD_CELADINE.getId().getPath(),
                wildPlantTexture("celadine_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CAMOMILE.get(), "camomile_stage_", "camomile_stage_");
        simpleBlock(VHBlocks.WILD_CAMOMILE.get(), models().cross(VHBlocks.WILD_CAMOMILE.getId().getPath(),
                wildPlantTexture("camomile_stage_3")).renderType("cutout"));

        simpleBlock(VHBlocks.COBWEB.get(), models().cross(VHBlocks.COBWEB.getId().getPath(),
                wildPlantTexture("cobweb")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CHERVIL.get(), "chervil_stage_", "chervil_stage_");
        simpleBlock(VHBlocks.WILD_CHERVIL.get(), models().cross(VHBlocks.WILD_CHERVIL.getId().getPath(),
                wildPlantTexture("chervil_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.CHICKWEED.get(), "chickweed_stage_", "chickweed_stage_");
        simpleBlock(VHBlocks.WILD_CHICKWEED.get(), models().cross(VHBlocks.WILD_CHICKWEED.getId().getPath(),
                wildPlantTexture("chickweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.COLTSFOOT.get(), "coltsfoot_stage_", "coltsfoot_stage_");
        simpleBlock(VHBlocks.WILD_COLTSFOOT.get(), models().cross(VHBlocks.WILD_COLTSFOOT.getId().getPath(),
                wildPlantTexture("coltsfoot_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.COMFREY.get(), "comfrey_stage_", "comfrey_stage_");
        simpleBlock(VHBlocks.WILD_COMFREY.get(), models().cross(VHBlocks.WILD_COMFREY.getId().getPath(),
                wildPlantTexture("comfrey_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.DAISY.get(), "daisy_stage_", "daisy_stage_");

        createCrop((CropBlock) VHBlocks.DANDELION.get(), "dandelion_stage_", "dandelion_stage_");

        createCrop((CropBlock) VHBlocks.DOCK.get(), "dock_stage_", "dock_stage_");
        simpleBlock(VHBlocks.WILD_DOCK.get(), models().cross(VHBlocks.WILD_DOCK.getId().getPath(),
                wildPlantTexture("dock_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.FENNEL.get(), "fennel_stage_", "fennel_stage_");
        simpleBlock(VHBlocks.WILD_FENNEL.get(), models().cross(VHBlocks.WILD_FENNEL.getId().getPath(),
                wildPlantTexture("fennel_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.FEVERFEW.get(), "feverfew_stage_", "feverfew_stage_");
        simpleBlock(VHBlocks.WILD_FEVERFEW.get(), models().cross(VHBlocks.WILD_FEVERFEW.getId().getPath(),
                wildPlantTexture("feverfew_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.GOATWEED.get(), "goatweed_stage_", "goatweed_stage_");
        simpleBlock(VHBlocks.WILD_GOATWEED.get(), models().cross(VHBlocks.WILD_GOATWEED.getId().getPath(),
                wildPlantTexture("goatweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.GARLIC.get(), "garlic_stage_", "garlic_stage_");
        simpleBlock(VHBlocks.WILD_GARLIC.get(), models().cross(VHBlocks.WILD_GARLIC.getId().getPath(),
                wildPlantTexture("garlic_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.GOLDENROD.get(), "goldenrod_stage_", "goldenrod_stage_");
        simpleBlock(VHBlocks.WILD_GOLDENROD.get(), models().cross(VHBlocks.WILD_GOLDENROD.getId().getPath(),
                wildPlantTexture("goldenrod_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.HAWKWEED.get(), "hawkweed_stage_", "hawkweed_stage_");
        simpleBlock(VHBlocks.WILD_HAWKWEED.get(), models().cross(VHBlocks.WILD_HAWKWEED.getId().getPath(),
                wildPlantTexture("hawkweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.HORSETAIL.get(), "horsetail_stage_", "horsetail_stage_");
        simpleBlock(VHBlocks.WILD_HORSETAIL.get(), models().cross(VHBlocks.WILD_HORSETAIL.getId().getPath(),
                wildPlantTexture("horsetail_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.HEATHER.get(), "heather_stage_", "heather_stage_");
        simpleBlock(VHBlocks.WILD_HEATHER.get(), models().cross(VHBlocks.WILD_HEATHER.getId().getPath(),
                wildPlantTexture("heather_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.IVY.get(), "ivy_stage_", "ivy_stage_");
        simpleBlock(VHBlocks.WILD_IVY.get(), models().cross(VHBlocks.WILD_IVY.getId().getPath(),
                wildPlantTexture("ivy_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.BAY_LAUREL.get(), "bay_laurel_stage_", "bay_laurel_stage_");
        simpleBlock(VHBlocks.WILD_BAY_LAUREL.get(), models().cross(VHBlocks.WILD_BAY_LAUREL.getId().getPath(),
                wildPlantTexture("bay_laurel_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.LAVENDER.get(), "lavender_stage_", "lavender_stage_");
        simpleBlock(VHBlocks.WILD_LAVENDER.get(), models().cross(VHBlocks.WILD_LAVENDER.getId().getPath(),
                wildPlantTexture("lavender_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.BRIGHT_EYE.get(), "bright_eye_stage_", "bright_eye_stage_");
        simpleBlock(VHBlocks.WILD_BRIGHT_EYE.get(), models().cross(VHBlocks.WILD_BRIGHT_EYE.getId().getPath(),
                wildPlantTexture("bright_eye_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.LOVAGE.get(), "lovage_stage_", "lovage_stage_");
        simpleBlock(VHBlocks.WILD_LOVAGE.get(), models().cross(VHBlocks.WILD_LOVAGE.getId().getPath(),
                wildPlantTexture("lovage_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.LUNGWORT.get(), "lungwort_stage_", "lungwort_stage_");
        simpleBlock(VHBlocks.WILD_LUNGWORT.get(), models().cross(VHBlocks.WILD_LUNGWORT.getId().getPath(),
                wildPlantTexture("lungwort_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.MALLOW.get(), "mallow_stage_", "mallow_stage_");
        simpleBlock(VHBlocks.WILD_MALLOW.get(), models().cross(VHBlocks.WILD_MALLOW.getId().getPath(),
                wildPlantTexture("mallow_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.MARIGOLD.get(), "marigold_stage_", "marigold_stage_");
        simpleBlock(VHBlocks.WILD_MARIGOLD.get(), models().cross(VHBlocks.WILD_MARIGOLD.getId().getPath(),
                wildPlantTexture("marigold_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.MINT.get(), "mint_stage_", "mint_stage_");
        simpleBlock(VHBlocks.WILD_MINT.get(), models().cross(VHBlocks.WILD_MINT.getId().getPath(),
                wildPlantTexture("mint_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.PARSLEY.get(), "parsley_stage_", "parsley_stage_");
        simpleBlock(VHBlocks.WILD_PARSLEY.get(), models().cross(VHBlocks.WILD_PARSLEY.getId().getPath(),
                wildPlantTexture("parsley_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.RAGWEED.get(), "ragweed_stage_", "ragweed_stage_");
        simpleBlock(VHBlocks.WILD_RAGWEED.get(), models().cross(VHBlocks.WILD_RAGWEED.getId().getPath(),
                wildPlantTexture("ragweed_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.RAGWORT.get(), "ragwort_stage_", "ragwort_stage_");
        simpleBlock(VHBlocks.WILD_RAGWORT.get(), models().cross(VHBlocks.WILD_RAGWORT.getId().getPath(),
                wildPlantTexture("ragwort_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.RHUBARB.get(), "rhubarb_stage_", "rhubarb_stage_");
        simpleBlock(VHBlocks.WILD_RHUBARB.get(), models().cross(VHBlocks.WILD_RHUBARB.getId().getPath(),
                wildPlantTexture("rhubarb_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.ROSEMARY.get(), "rosemary_stage_", "rosemary_stage_");
        simpleBlock(VHBlocks.WILD_ROSEMARY.get(), models().cross(VHBlocks.WILD_ROSEMARY.getId().getPath(),
                wildPlantTexture("rosemary_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.RUSH.get(), "rush_stage_", "rush_stage_");
        simpleBlock(VHBlocks.WILD_RUSH.get(), models().cross(VHBlocks.WILD_RUSH.getId().getPath(),
                wildPlantTexture("rush_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.SHEEP_SORREL.get(), "sheep_sorrel_stage_", "sheep_sorrel_stage_");
        simpleBlock(VHBlocks.WILD_SHEEP_SORREL.get(), models().cross(VHBlocks.WILD_SHEEP_SORREL.getId().getPath(),
                wildPlantTexture("sheep_sorrel_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.SORREL.get(), "sorrel_stage_", "sorrel_stage_");
        simpleBlock(VHBlocks.WILD_SORREL.get(), models().cross(VHBlocks.WILD_SORREL.getId().getPath(),
                wildPlantTexture("sorrel_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.STINGING_NETTLE.get(), "stinging_nettle_stage_", "stinging_nettle_stage_");
        simpleBlock(VHBlocks.WILD_STINGING_NETTLE.get(), models().cross(VHBlocks.WILD_STINGING_NETTLE.getId().getPath(),
                wildPlantTexture("stinging_nettle_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.SWEET_SEDGE.get(), "sweet_sedge_stage_", "sweet_sedge_stage_");
        simpleBlock(VHBlocks.WILD_SWEET_SEDGE.get(), models().cross(VHBlocks.WILD_SWEET_SEDGE.getId().getPath(),
                wildPlantTexture("sweet_sedge_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.TANSY.get(), "tansy_stage_", "tansy_stage_");
        simpleBlock(VHBlocks.WILD_TANSY.get(), models().cross(VHBlocks.WILD_TANSY.getId().getPath(),
                wildPlantTexture("tansy_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.THYME.get(), "thyme_stage_", "thyme_stage_");
        simpleBlock(VHBlocks.WILD_THYME.get(), models().cross(VHBlocks.WILD_THYME.getId().getPath(),
                wildPlantTexture("thyme_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.TORMENTIL.get(), "tormentil_stage_", "tormentil_stage_");
        simpleBlock(VHBlocks.WILD_TORMENTIL.get(), models().cross(VHBlocks.WILD_TORMENTIL.getId().getPath(),
                wildPlantTexture("tormentil_stage_3")).renderType("cutout"));

        createCrop((CropBlock) VHBlocks.WATERMINT.get(), "watermint_stage_", "watermint_stage_");
        simpleBlock(VHBlocks.WILD_WATERMINT.get(), models().cross(VHBlocks.WILD_WATERMINT.getId().getPath(),
                wildPlantTexture("watermint_stage_3")).renderType("cutout"));
    }

    public void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Herbalism.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    public void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public void createCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cropStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    public ConfiguredModel[] cropStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((HerbalismCropBlock) block).getAgeProperty()),
                new ResourceLocation(Herbalism.MODID, "block/" + textureName + state.getValue(((HerbalismCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public ResourceLocation wildPlantTexture(String getTextureName) {
        return new ResourceLocation(Herbalism.MODID,"block/" + getTextureName);
    }
}
