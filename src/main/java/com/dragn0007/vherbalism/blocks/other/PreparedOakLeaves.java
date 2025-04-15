package com.dragn0007.vherbalism.blocks.other;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PreparedOakLeaves extends Block {


    public PreparedOakLeaves() {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).noOcclusion().randomTicks());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(this.getDryTimeProperty(), 0));
    }

    public static final IntegerProperty DRY_TIME = IntegerProperty.create("dry_time", 0, 17);

    protected IntegerProperty getDryTimeProperty() {
        return DRY_TIME;
    }

    public int getMaxDryTime() {
        return 16;
    }

    public int getDryTime(BlockState state) {
        return state.getValue(this.getDryTimeProperty());
    }

    public BlockState getStateForDryTime(int i) {
        return this.defaultBlockState().setValue(this.getDryTimeProperty(), Integer.valueOf(i));
    }

    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DRY_TIME).add(HorizontalDirectionalBlock.FACING);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {

        if (!level.isAreaLoaded(pos, 1)) return;

        int dryTime = this.getDryTime(state);

        if (dryTime <= this.getMaxDryTime() && level.getRandom().nextDouble() < 0.85) {
            BlockState newState = this.getStateForDryTime(dryTime + 1);
            level.setBlockAndUpdate(pos, newState);
        }

        int i = this.getDryTime(state);

        if (i >= this.getMaxDryTime()) {
            BlockState state1 = VHBlocks.DRIED_OAK_LEAVES.get().defaultBlockState();
            level.setBlockAndUpdate(pos, state1);
        }

    }

}
