package com.dragn0007.vherbalism.blocks.crop.base;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class HerbalismCropBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    //essentially just a cropblock but without the private/ protected methods, and some extra stuff

    public HerbalismCropBlock(Properties properties) {
        super(properties);
    }

    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return null;
    }

    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(AGE);
    }

    public int getBonemealAgeIncrease(Level level) {
        return super.getBonemealAgeIncrease(level) / 3;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public ItemLike getBaseSeedId() {
        return null;
    }
}
