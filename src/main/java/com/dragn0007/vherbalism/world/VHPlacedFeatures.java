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
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class VHPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ALDER_PLACED = registerKey("alder_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ALDER_PLACED, configuredFeatures.getOrThrow(VHConfigFeatures.ALDER),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        VHBlocks.ALDER_SAPLING.get()));

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
