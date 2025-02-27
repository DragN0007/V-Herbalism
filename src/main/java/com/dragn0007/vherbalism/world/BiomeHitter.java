package com.dragn0007.vherbalism.world;

import com.dragn0007.vherbalism.Herbalism;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import javax.xml.parsers.SAXParserFactory;

public class BiomeHitter {

    public static final ResourceKey<BiomeModifier> ADD_ALDER = registerKey("add_alder");
    public static final ResourceKey<BiomeModifier> ADD_SAPPY_BIRCH = registerKey("add_sappy_birch");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_FOREST = registerKey("add_bindweed_forest");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_PLAINS = registerKey("add_bindweed_plains");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_RIVER = registerKey("add_bindweed_river");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ALDER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.ALDER_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BINDWEED_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BINDWEED_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BINDWEED_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_SAPPY_BIRCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.SAPPY_BIRCH_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Herbalism.MODID, name));
    }
}