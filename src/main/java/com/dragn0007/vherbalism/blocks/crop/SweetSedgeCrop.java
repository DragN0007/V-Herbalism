package com.dragn0007.vherbalism.blocks.crop;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismCropBlock;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

public class SweetSedgeCrop extends HerbalismCropBlock {
    public SweetSedgeCrop(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return VHBlocks.SWEET_SEDGE.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return VHItems.SWEET_SEDGE_BUNDLE.get();
    }
}
