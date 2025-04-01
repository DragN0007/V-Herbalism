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

    public static final ResourceKey<PlacedFeature> ALDER_PLACED = registerKey("alder_placed");
    public static final ResourceKey<PlacedFeature> SAPPY_BIRCH_PLACED = registerKey("sappy_birch_placed");
    public static final ResourceKey<PlacedFeature> BINDWEED_PLACED = registerKey("bindweed_placed");
    public static final ResourceKey<PlacedFeature> BLACKBERRY_BUSH_PLACED = registerKey("blackberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BORAGE_PLACED = registerKey("borage_placed");
    public static final ResourceKey<PlacedFeature> BROOM_PLACED = registerKey("broom_placed");
    public static final ResourceKey<PlacedFeature> BURDOCK_ROOT_PLACED = registerKey("burdock_root_placed");
    public static final ResourceKey<PlacedFeature> BURNET_PLACED = registerKey("burnet_placed");
    public static final ResourceKey<PlacedFeature> CATCHWEED_PLACED = registerKey("catchweed_placed");
    public static final ResourceKey<PlacedFeature> CATMINT_PLACED = registerKey("catmint_placed");
    public static final ResourceKey<PlacedFeature> CELADINE_PLACED = registerKey("celadine_placed");
    public static final ResourceKey<PlacedFeature> CAMOMILE_PLACED = registerKey("camomile_placed");
    public static final ResourceKey<PlacedFeature> COBWEB_PLACED = registerKey("cobweb_placed");
    public static final ResourceKey<PlacedFeature> CHERVIL_PLACED = registerKey("chervil_placed");
    public static final ResourceKey<PlacedFeature> CHICKWEED_PLACED = registerKey("chickweed_placed");
    public static final ResourceKey<PlacedFeature> COLTSFOOT_PLACED = registerKey("coltsfoot_placed");
    public static final ResourceKey<PlacedFeature> COMFREY_PLACED = registerKey("comfrey_placed");
    public static final ResourceKey<PlacedFeature> DOCK_PLACED = registerKey("dock_placed");
    public static final ResourceKey<PlacedFeature> ELDERBERRY_BUSH_PLACED = registerKey("elderberry_bush_placed");
    public static final ResourceKey<PlacedFeature> FENNEL_PLACED = registerKey("fennel_placed");
    public static final ResourceKey<PlacedFeature> FEVERFEW_PLACED = registerKey("feverfew_placed");
    public static final ResourceKey<PlacedFeature> GOATWEED_PLACED = registerKey("goatweed_placed");
    public static final ResourceKey<PlacedFeature> GARLIC_PLACED = registerKey("garlic_placed");
    public static final ResourceKey<PlacedFeature> GOLDENROD_PLACED = registerKey("goldenrod_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ALDER_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.ALDER),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        VHBlocks.ALDER_SAPLING.get()));

        register(context, SAPPY_BIRCH_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.SAPPY_BIRCH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        VHBlocks.SAPPY_BIRCH_SAPLING.get()));

        register(context, BINDWEED_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BINDWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BLACKBERRY_BUSH_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BLACKBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BORAGE_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BORAGE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BROOM_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BROOM),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BURDOCK_ROOT_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BURDOCK_ROOT),
                OrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(80))));

        register(context, BURNET_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.BURNET),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CATCHWEED_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CATCHWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CATMINT_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CATMINT),
                List.of(RarityFilter.onAverageOnceEvery(128),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CELADINE_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CELADINE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CAMOMILE_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CAMOMILE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COBWEB_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.COBWEB),
                List.of(RarityFilter.onAverageOnceEvery(24),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.noFluid(), BlockPredicate.anyOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.LEAVES))))));

        register(context, CHERVIL_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CHERVIL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CHICKWEED_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.CHICKWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COLTSFOOT_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.COLTSFOOT),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COMFREY_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.COMFREY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DOCK_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.DOCK),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, ELDERBERRY_BUSH_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.ELDERBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FENNEL_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.FENNEL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FEVERFEW_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.FEVERFEW),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GOATWEED_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.GOATWEED),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GARLIC_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.GARLIC),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GOLDENROD_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.GOLDENROD),
                List.of(RarityFilter.onAverageOnceEvery(48),
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
