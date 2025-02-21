package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VHBlockstateProvider extends BlockStateProvider {
    public VHBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Herbalism.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        
        logBlock(VHBlocks.ALDER_LOG.get());
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

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Herbalism.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
