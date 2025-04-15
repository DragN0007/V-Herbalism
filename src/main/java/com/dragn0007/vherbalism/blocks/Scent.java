package com.dragn0007.vherbalism.blocks;

import com.dragn0007.vherbalism.util.HerbalismCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Scent extends Block {

    public static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public Scent() {
        super(Properties.of().sound(SoundType.EMPTY).noLootTable().instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().noCollission().randomTicks());
        this.registerDefaultState(this.stateDefinition.any().setValue(this.getDissipateTimeProperty(), 0));
    }

    public VoxelShape getShape(BlockState p_152917_, BlockGetter p_152918_, BlockPos p_152919_, CollisionContext p_152920_) {
        return SHAPE;
    }

    public static final IntegerProperty DISSIPATE_TIME = IntegerProperty.create("dissipate_time", 0, 17);

    protected IntegerProperty getDissipateTimeProperty() {
        return DISSIPATE_TIME;
    }

    public int getMaxDissipateTime() {
        return 16;
    }

    public int getDissipateTime(BlockState state) {
        return state.getValue(this.getDissipateTimeProperty());
    }

    public BlockState getStateForDissipateTime(int i) {
        return this.defaultBlockState().setValue(this.getDissipateTimeProperty(), Integer.valueOf(i));
    }

    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DISSIPATE_TIME);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {

        int dissipateTime = this.getDissipateTime(state);

        if (dissipateTime <= this.getMaxDissipateTime() && level.getRandom().nextDouble() < 0.85) {
            BlockState newState = this.getStateForDissipateTime(dissipateTime + 1);
            level.setBlockAndUpdate(pos, newState);
        }

        if (dissipateTime >= this.getMaxDissipateTime()) {
            if (HerbalismCommonConfig.DEBUG_LOGS.get()) {
                System.out.println("[V-Herbalism DEBUG] Dissipated scent at " + pos + ", at dissipate time " + dissipateTime);
            }
            level.removeBlock(pos, false);
        }

        if (level.isRaining() && level.getRandom().nextDouble() < HerbalismCommonConfig.SCENT_WASH_CHANCE.get()) {
            if (HerbalismCommonConfig.DEBUG_LOGS.get()) {
                System.out.println("[V-Herbalism DEBUG] Washed away scent at " + pos + " due to rain.");
            }
            level.removeBlock(pos, false);
        }
    }

}
