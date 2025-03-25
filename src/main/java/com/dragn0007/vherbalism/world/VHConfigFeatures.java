package com.dragn0007.vherbalism.world;


import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class VHConfigFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALDER = registerKey("alder");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPY_BIRCH = registerKey("sappy_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BINDWEED = registerKey("bindweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKBERRY_BUSH = registerKey("blackberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BORAGE = registerKey("borage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROOM = registerKey("broom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BURDOCK_ROOT = registerKey("burdock_root");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BURNET = registerKey("burnet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CATCHWEED = registerKey("catchweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CATMINT = registerKey("catmint");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CELADINE = registerKey("celadine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMOMILE = registerKey("camomile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBWEB = registerKey("cobweb");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERVIL = registerKey("chervil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHICKWEED = registerKey("chickweed");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceabeles = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceabeles = new BlockMatchTest(Blocks.END_STONE);

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

        List<OreConfiguration.TargetBlockState> burdockRoot = List.of(OreConfiguration.target(stoneReplaceabeles,
                        VHBlocks.BURDOCK_ROOT.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, VHBlocks.BURDOCK_ROOT.get().defaultBlockState()));
        register(context, BURDOCK_ROOT, Feature.ORE, new OreConfiguration(burdockRoot, 9));

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

        register(context, COBWEB, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.COBWEB.get())));

        register(context, CHERVIL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CHERVIL.get())))));

        register(context, CHICKWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CHICKWEED.get())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Herbalism.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


