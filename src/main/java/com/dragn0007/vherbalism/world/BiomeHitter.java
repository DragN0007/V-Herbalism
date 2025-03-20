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

public class BiomeHitter {

    public static final ResourceKey<BiomeModifier> ADD_ALDER = registerKey("add_alder");
    public static final ResourceKey<BiomeModifier> ADD_SAPPY_BIRCH = registerKey("add_sappy_birch");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_FOREST = registerKey("add_bindweed_forest");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_PLAINS = registerKey("add_bindweed_plains");
    public static final ResourceKey<BiomeModifier> ADD_BINDWEED_RIVER = registerKey("add_bindweed_river");
    public static final ResourceKey<BiomeModifier> ADD_BLACKBERRY_BUSH = registerKey("add_blackberry_bush");
    public static final ResourceKey<BiomeModifier> ADD_BORAGE_FOREST = registerKey("add_borage_forest");
    public static final ResourceKey<BiomeModifier> ADD_BORAGE_RIVER = registerKey("add_borage_river");
    public static final ResourceKey<BiomeModifier> ADD_BROOM_PLAINS = registerKey("add_broom_plains");
    public static final ResourceKey<BiomeModifier> ADD_BROOM_BEACH = registerKey("add_broom_beach");
    public static final ResourceKey<BiomeModifier> ADD_BURNET_BEACH = registerKey("add_burnet_beach");
    public static final ResourceKey<BiomeModifier> ADD_CATCHWEED_WET = registerKey("add_catchweed_wet");
    public static final ResourceKey<BiomeModifier> ADD_CATMINT_OVERWORLD = registerKey("add_catmint_overworld");
    public static final ResourceKey<BiomeModifier> ADD_CELADINE_WET = registerKey("add_celadine_wet");
    public static final ResourceKey<BiomeModifier> ADD_CAMOMILE_PLAINS = registerKey("add_camomile_plains");

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

        context.register(ADD_BLACKBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BLACKBERRY_BUSH_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BORAGE_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BORAGE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BORAGE_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BORAGE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BROOM_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BROOM_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BROOM_BEACH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BROOM_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_BURNET_BEACH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BURNET_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CATCHWEED_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CATCHWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CATMINT_OVERWORLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CATMINT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CELADINE_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CELADINE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CAMOMILE_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CAMOMILE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Herbalism.MODID, name));
    }
}