package com.dragn0007.vherbalism.world;


import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class VHConfigFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALDER = registerKey("alder");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPY_BIRCH = registerKey("sappy_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BINDWEED = registerKey("bindweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKBERRY_BUSH = registerKey("blackberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BORAGE = registerKey("borage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROOM = registerKey("broom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BURNET = registerKey("burnet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CATCHWEED = registerKey("catchweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CATMINT = registerKey("catmint");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CELADINE = registerKey("celadine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMOMILE = registerKey("camomile");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ALDER, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(VHBlocksNoDatagenLoot.ALDER_LOG.get()),
                new ForkingTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(VHBlocks.ALDER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, SAPPY_BIRCH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get()),
                new StraightTrunkPlacer(5, 2, 0),
                //                              ^ base     ^ rand a   ^ rand b
                BlockStateProvider.simple(Blocks.BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                //                                            ^ radius                    ^ offset    ^ height
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
                //                               ^ limit    ^ lower    ^ upper

        register(context, BINDWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_BINDWEED.get())))));

        register(context, BLACKBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.BLACKBERRY_BUSH.get())))));

        register(context, BORAGE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_BORAGE.get())))));

        register(context, BROOM, Feature.FLOWER,
                new RandomPatchConfiguration(12, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.BROOM_SHRUB.get())))));

        register(context, BURNET, Feature.FLOWER,
                new RandomPatchConfiguration(12, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_BURNET.get())))));

        register(context, CATCHWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CATCHWEED.get())))));

        register(context, CATMINT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CATMINT.get())))));

        register(context, CELADINE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CELADINE.get())))));

        register(context, CAMOMILE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CAMOMILE.get())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Herbalism.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


