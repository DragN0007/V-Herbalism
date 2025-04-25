package com.dragn0007.vherbalism.world.tree;


import com.dragn0007.vherbalism.world.VHConfigFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class WillowTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    public ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return VHConfigFeatures.WILLOW_TREE;
    }
}
