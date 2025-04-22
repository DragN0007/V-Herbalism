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
    public static final ResourceKey<ConfiguredFeature<?, ?>> COLTSFOOT = registerKey("coltsfoot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COMFREY = registerKey("comfrey");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOCK = registerKey("dock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FENNEL = registerKey("fennel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FEVERFEW = registerKey("feverfew");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOATWEED = registerKey("goatweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GARLIC = registerKey("garlic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDENROD = registerKey("goldenrod");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAWKWEED = registerKey("hawkweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HORSETAIL = registerKey("horsetail");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HEATHER = registerKey("heather");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IVY = registerKey("ivy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNIPER = registerKey("juniper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAY_LAUREL = registerKey("bay_laurel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER = registerKey("lavender");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIGHT_EYE = registerKey("bright_eye");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOVAGE = registerKey("lovage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LUNGWORT = registerKey("lungwort");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MALLOW = registerKey("mallow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARIGOLD = registerKey("marigold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINT = registerKey("mint");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS = registerKey("moss");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RASPBERRY_BUSH = registerKey("raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PARSLEY = registerKey("parsley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RAGWEED = registerKey("ragweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RAGWORT = registerKey("ragwort");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RHUBARB = registerKey("rhubarb");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUSH = registerKey("rush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHEEP_SORREL = registerKey("sheep_sorrel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SORREL = registerKey("sorrel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STINGING_NETTLE = registerKey("stinging_nettle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEET_SEDGE = registerKey("sweet_sedge");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TANSY = registerKey("tansy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TORMENTIL = registerKey("tormentil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THYME = registerKey("thyme");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATERMINT = registerKey("watermint");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_TREE = registerKey("willow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINTERGREEN_BUSH = registerKey("wintergreen_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WOOD_SORREL = registerKey("wood_sorrel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YARROW = registerKey("yarrow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEATHBERRY_BUSH = registerKey("deathberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOXGLOVE = registerKey("foxglove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLLYBERRY_BUSH = registerKey("hollyberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEADOW_SAFFRON = registerKey("meadow_saffron");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HEMLOCK = registerKey("hemlock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SNAKEROOT = registerKey("snakeroot");

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
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_CHICKWEED.get())))));

        register(context, COLTSFOOT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_COLTSFOOT.get())))));

        register(context, COMFREY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_COMFREY.get())))));

        register(context, DOCK, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_DOCK.get())))));

        register(context, ELDERBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.ELDERBERRY_BUSH.get())))));

        register(context, FENNEL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_FENNEL.get())))));

        register(context, FEVERFEW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_FEVERFEW.get())))));

        register(context, GOATWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_GOATWEED.get())))));

        register(context, GARLIC, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_GARLIC.get())))));

        register(context, GOLDENROD, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_GOLDENROD.get())))));

        register(context, HAWKWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_HAWKWEED.get())))));

        register(context, HORSETAIL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_HORSETAIL.get())))));

        register(context, HEATHER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_HEATHER.get())))));

        register(context, IVY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_IVY.get())))));

        register(context, JUNIPER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.JUNIPER_BUSH.get())))));

        register(context, BAY_LAUREL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_BAY_LAUREL.get())))));

        register(context, LAVENDER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 6, 7, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_LAVENDER.get())))));

        register(context, BRIGHT_EYE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_BRIGHT_EYE.get())))));

        register(context, LOVAGE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_LOVAGE.get())))));

        register(context, LUNGWORT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_LUNGWORT.get())))));

        register(context, MALLOW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_MALLOW.get())))));

        register(context, MARIGOLD, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_MARIGOLD.get())))));

        register(context, MINT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_MINT.get())))));

        register(context, MOSS, Feature.FLOWER,
                new RandomPatchConfiguration(14, 7, 8, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.MOSS_CARPET)))));

        register(context, RASPBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.RASPBERRY_BUSH.get())))));

        register(context, PARSLEY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_PARSLEY.get())))));

        register(context, RAGWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_RAGWEED.get())))));

        register(context, RAGWORT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_RAGWORT.get())))));

        register(context, RHUBARB, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_RHUBARB.get())))));

        register(context, ROSEMARY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_ROSEMARY.get())))));

        register(context, RUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_RUSH.get())))));

        register(context, SHEEP_SORREL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_SHEEP_SORREL.get())))));

        register(context, SORREL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_SORREL.get())))));

        register(context, STINGING_NETTLE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_STINGING_NETTLE.get())))));

        register(context, SWEET_SEDGE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_SWEET_SEDGE.get())))));

        register(context, TANSY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_TANSY.get())))));

        register(context, THYME, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_THYME.get())))));

        register(context, TORMENTIL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_TORMENTIL.get())))));

        register(context, WATERMINT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_WATERMINT.get())))));

        register(context, WILLOW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_WILLOW.get())))));

        register(context, WINTERGREEN_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WINTERGREEN_BUSH.get())))));

        register(context, WOOD_SORREL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_WOOD_SORREL.get())))));

        register(context, YARROW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(VHBlocks.WILD_YARROW.get())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Herbalism.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


