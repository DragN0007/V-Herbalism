package com.dragn0007.vherbalism.blocks.other;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class BurdockRootBlock extends Block implements BonemealableBlock {
   public BurdockRootBlock(BlockBehaviour.Properties p_154359_) {
      super(p_154359_);
   }

   public boolean isValidBonemealTarget(LevelReader p_256100_, BlockPos p_255943_, BlockState p_255655_, boolean p_256455_) {
      return p_256100_.getBlockState(p_255943_.below()).isAir();
   }

   public boolean isBonemealSuccess(Level p_221979_, RandomSource p_221980_, BlockPos p_221981_, BlockState p_221982_) {
      return true;
   }

   public void performBonemeal(ServerLevel serverLevel, RandomSource p_221975_, BlockPos pos, BlockState p_221977_) {
      serverLevel.setBlockAndUpdate(pos.below(), VHBlocks.HANGING_BURDOCK_ROOT.get().defaultBlockState());
   }
}