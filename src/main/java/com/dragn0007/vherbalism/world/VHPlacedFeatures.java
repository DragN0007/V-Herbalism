package com.dragn0007.vherbalism.world;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class VHPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ALDER = registerKey("alder");
    public static final ResourceKey<PlacedFeature> SAPPY_BIRCH = registerKey("sappy_birch");
    public static final ResourceKey<PlacedFeature> BINDWEED = registerKey("bindweed");
    public static final ResourceKey<PlacedFeature> BLACKBERRY_BUSH = registerKey("blackberry_bush");
    public static final ResourceKey<PlacedFeature> BORAGE = registerKey("borage");
    public static final ResourceKey<PlacedFeature> BROOM = registerKey("broom");
    public static final ResourceKey<PlacedFeature> BURDOCK_ROOT = registerKey("burdock_root");
    public static final ResourceKey<PlacedFeature> BURNET = registerKey("burnet");
    public static final ResourceKey<PlacedFeature> CATCHWEED = registerKey("catchweed");
    public static final ResourceKey<PlacedFeature> CATMINT = registerKey("catmint");
    public static final ResourceKey<PlacedFeature> CELADINE = registerKey("celadine");
    public static final ResourceKey<PlacedFeature> CAMOMILE = registerKey("camomile");
    public static final ResourceKey<PlacedFeature> COBWEB = registerKey("cobweb");
    public static final ResourceKey<PlacedFeature> CHERVIL = registerKey("chervil");
    public static final ResourceKey<PlacedFeature> CHICKWEED = registerKey("chickweed");
    public static final ResourceKey<PlacedFeature> COLTSFOOT = registerKey("coltsfoot");
    public static final ResourceKey<PlacedFeature> COMFREY = registerKey("comfrey");
    public static final ResourceKey<PlacedFeature> DOCK = registerKey("dock");
    public static final ResourceKey<PlacedFeature> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<PlacedFeature> FENNEL = registerKey("fennel");
    public static final ResourceKey<PlacedFeature> FEVERFEW = registerKey("feverfew");
    public static final ResourceKey<PlacedFeature> GOATWEED = registerKey("goatweed");
    public static final ResourceKey<PlacedFeature> GARLIC = registerKey("garlic");
    public static final ResourceKey<PlacedFeature> GOLDENROD = registerKey("goldenrod");
    public static final ResourceKey<PlacedFeature> HAWKWEED = registerKey("hawkweed");
    public static final ResourceKey<PlacedFeature> HORSETAIL = registerKey("horsetail");
    public static final ResourceKey<PlacedFeature> HEATHER = registerKey("heather");
    public static final ResourceKey<PlacedFeature> IVY = registerKey("ivy");
    public static final ResourceKey<PlacedFeature> JUNIPER = registerKey("juniper");
    public static final ResourceKey<PlacedFeature> BAY_LAUREL = registerKey("bay_laurel");
    public static final ResourceKey<PlacedFeature> LAVENDER = registerKey("lavender");
    public static final ResourceKey<PlacedFeature> BRIGHT_EYE = registerKey("bright_eye");
    public static final ResourceKey<PlacedFeature> LOVAGE = registerKey("lovage");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ALDER, configuredFeatures.getOrThrow(VHConfigFeatures.ALDER),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        VHBlocks.ALDER_SAPLING.get()));

        register(context, SAPPY_BIRCH, configuredFeatures.getOrThrow(VHConfigFeatures.SAPPY_BIRCH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        VHBlocks.SAPPY_BIRCH_SAPLING.get()));

        register(context, BINDWEED, configuredFeatures.getOrThrow(VHConfigFeatures.BINDWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BLACKBERRY_BUSH, configuredFeatures.getOrThrow(VHConfigFeatures.BLACKBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BORAGE, configuredFeatures.getOrThrow(VHConfigFeatures.BORAGE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BROOM, configuredFeatures.getOrThrow(VHConfigFeatures.BROOM),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BURDOCK_ROOT, configuredFeatures.getOrThrow(VHConfigFeatures.BURDOCK_ROOT),
                OrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(80))));

        register(context, BURNET, configuredFeatures.getOrThrow(VHConfigFeatures.BURNET),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CATCHWEED, configuredFeatures.getOrThrow(VHConfigFeatures.CATCHWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CATMINT, configuredFeatures.getOrThrow(VHConfigFeatures.CATMINT),
                List.of(RarityFilter.onAverageOnceEvery(128),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CELADINE, configuredFeatures.getOrThrow(VHConfigFeatures.CELADINE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CAMOMILE, configuredFeatures.getOrThrow(VHConfigFeatures.CAMOMILE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COBWEB, configuredFeatures.getOrThrow(VHConfigFeatures.COBWEB),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.noFluid(), BlockPredicate.anyOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.LEAVES))))));

        register(context, CHERVIL, configuredFeatures.getOrThrow(VHConfigFeatures.CHERVIL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CHICKWEED, configuredFeatures.getOrThrow(VHConfigFeatures.CHICKWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COLTSFOOT, configuredFeatures.getOrThrow(VHConfigFeatures.COLTSFOOT),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COMFREY, configuredFeatures.getOrThrow(VHConfigFeatures.COMFREY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DOCK, configuredFeatures.getOrThrow(VHConfigFeatures.DOCK),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, ELDERBERRY_BUSH, configuredFeatures.getOrThrow(VHConfigFeatures.ELDERBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FENNEL, configuredFeatures.getOrThrow(VHConfigFeatures.FENNEL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FEVERFEW, configuredFeatures.getOrThrow(VHConfigFeatures.FEVERFEW),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GOATWEED, configuredFeatures.getOrThrow(VHConfigFeatures.GOATWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GARLIC, configuredFeatures.getOrThrow(VHConfigFeatures.GARLIC),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GOLDENROD, configuredFeatures.getOrThrow(VHConfigFeatures.GOLDENROD),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HAWKWEED, configuredFeatures.getOrThrow(VHConfigFeatures.HAWKWEED),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HORSETAIL, configuredFeatures.getOrThrow(VHConfigFeatures.HORSETAIL),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HEATHER, configuredFeatures.getOrThrow(VHConfigFeatures.HEATHER),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, IVY, configuredFeatures.getOrThrow(VHConfigFeatures.IVY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, JUNIPER, configuredFeatures.getOrThrow(VHConfigFeatures.JUNIPER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BAY_LAUREL, configuredFeatures.getOrThrow(VHConfigFeatures.BAY_LAUREL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, LAVENDER, configuredFeatures.getOrThrow(VHConfigFeatures.LAVENDER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BRIGHT_EYE, configuredFeatures.getOrThrow(VHConfigFeatures.BRIGHT_EYE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, LOVAGE, configuredFeatures.getOrThrow(VHConfigFeatures.LOVAGE),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }

    public static ResourceKey<PlacedFeature> registerKey (String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Herbalism.MODID, name));
    }
    public static void register
    (BootstapContext < PlacedFeature > context, ResourceKey < PlacedFeature > key, Holder < ConfiguredFeature < ?, ?>>
    configuration,
            List < PlacementModifier > modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
