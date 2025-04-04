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
