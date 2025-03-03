package com.dragn0007.vherbalism.world;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class VHPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ALDER_PLACED = registerKey("alder_placed");
    public static final ResourceKey<PlacedFeature> SAPPY_BIRCH_PLACED = registerKey("sappy_birch_placed");
    public static final ResourceKey<PlacedFeature> BINDWEED_PLACED = registerKey("bindweed_placed");
    public static final ResourceKey<PlacedFeature> BLACKBERRY_BUSH_PLACED = registerKey("blackberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BORAGE_PLACED = registerKey("borage_placed");

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
