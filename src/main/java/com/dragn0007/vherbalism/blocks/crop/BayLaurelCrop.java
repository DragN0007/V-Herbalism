package com.dragn0007.vherbalism.blocks.crop;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismCropBlock;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BayLaurelCrop extends HerbalismCropBlock {
    public BayLaurelCrop(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {

        if (level.getFluidState(pos).is(FluidTags.WATER)) {
            return InteractionResult.FAIL;
        }

        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return VHBlocks.BAY_LAUREL.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return VHItems.BAY_LAUREL_LEAF.get();
    }
}
