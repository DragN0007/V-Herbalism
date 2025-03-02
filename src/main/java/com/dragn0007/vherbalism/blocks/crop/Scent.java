package com.dragn0007.vherbalism.blocks.crop;

import com.dragn0007.vherbalism.util.HerbalismCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Scent extends Block {

    public static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public Scent() {
        super(Properties.of().sound(SoundType.EMPTY).noLootTable().instabreak().pushReaction(PushReaction.DESTROY).noOcclusion().noCollission().randomTicks());
    }

    public final RandomSource random = RandomSource.create();
    public int dissipateTime = this.random.nextInt(48000) + 24000;

    public VoxelShape getShape(BlockState p_152917_, BlockGetter p_152918_, BlockPos p_152919_, CollisionContext p_152920_) {
        return SHAPE;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        level.scheduleTick(pos, this, dissipateTime);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        this.tick(state, level, pos, source);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {

        --dissipateTime;
        level.scheduleTick(pos, this, Mth.nextInt(source, 40, 40));

        if (level.isRaining() && level.getRandom().nextDouble() < HerbalismCommonConfig.SCENT_WASH_CHANCE.get()) {
            if (HerbalismCommonConfig.DEBUG_LOGS.get()) {
                System.out.println("[V-Herbalism DEBUG] Washed away scent at " + pos + " due to rain.");
            }
            level.removeBlock(pos, false);
        }

        if (--dissipateTime <= 0) {
            if (HerbalismCommonConfig.DEBUG_LOGS.get()) {
                System.out.println("[V-Herbalism DEBUG] Dissipated scent at " + pos + ", at tick time " + dissipateTime);
            }
            level.removeBlock(pos, false);
            dissipateTime = this.random.nextInt(48000) + 24000;
            if (HerbalismCommonConfig.DEBUG_LOGS.get()) {
                System.out.println("[V-Herbalism DEBUG] Reset tick time to " + dissipateTime);
            }
        }
    }

}
