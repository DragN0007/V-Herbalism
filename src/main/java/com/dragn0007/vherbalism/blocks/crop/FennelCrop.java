package com.dragn0007.vherbalism.blocks.crop;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismCropBlock;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FennelCrop extends HerbalismCropBlock {
    public FennelCrop(Properties properties) {
        super(properties);
    }

    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND) || state.is(Blocks.SAND);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return VHBlocks.FENNEL.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return VHItems.FENNEL_STALK.get();
    }
}
