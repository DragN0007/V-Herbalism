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
    public static final ResourceKey<BiomeModifier> ADD_BURDOCK_ROOT = registerKey("add_burdock_root");
    public static final ResourceKey<BiomeModifier> ADD_BROOM_BEACH = registerKey("add_broom_beach");
    public static final ResourceKey<BiomeModifier> ADD_BURNET_BEACH = registerKey("add_burnet_beach");
    public static final ResourceKey<BiomeModifier> ADD_CATCHWEED_WET = registerKey("add_catchweed_wet");
    public static final ResourceKey<BiomeModifier> ADD_CATMINT_OVERWORLD = registerKey("add_catmint_overworld");
    public static final ResourceKey<BiomeModifier> ADD_CELADINE_WET = registerKey("add_celadine_wet");
    public static final ResourceKey<BiomeModifier> ADD_CAMOMILE_PLAINS = registerKey("add_camomile_plains");
    public static final ResourceKey<BiomeModifier> ADD_COBWEB_FOREST = registerKey("add_cobweb_forest");
    public static final ResourceKey<BiomeModifier> ADD_CHERVIL_HILLS = registerKey("add_chervil_hills");
    public static final ResourceKey<BiomeModifier> ADD_CHERVIL_MOUNTAINS = registerKey("add_chervil_mountains");
    public static final ResourceKey<BiomeModifier> ADD_CHICKWEED_RIVER = registerKey("add_chickweed_river");
    public static final ResourceKey<BiomeModifier> ADD_CHICKWEED_PLAINS = registerKey("add_chickweed_plains");
    public static final ResourceKey<BiomeModifier> ADD_COLTSFOOT_PLAINS = registerKey("add_coltsfoot_plains");
    public static final ResourceKey<BiomeModifier> ADD_COLTSFOOT_FOREST = registerKey("add_coltsfoot_forest");
    public static final ResourceKey<BiomeModifier> ADD_COMFREY_WET = registerKey("add_comfrey_wet");
    public static final ResourceKey<BiomeModifier> ADD_COMFREY_COLD = registerKey("add_comfrey_cold");
    public static final ResourceKey<BiomeModifier> ADD_DOCK_FOREST = registerKey("add_dock_forest");
    public static final ResourceKey<BiomeModifier> ADD_ELDERBERRY_BUSH = registerKey("add_elderberry_bush");
    public static final ResourceKey<BiomeModifier> ADD_FENNEL_PLAINS = registerKey("add_fennel_plains");
    public static final ResourceKey<BiomeModifier> ADD_FENNEL_RIVER = registerKey("add_fennel_river");
    public static final ResourceKey<BiomeModifier> ADD_FEVERFEW_WET = registerKey("add_feverfew_wet");
    public static final ResourceKey<BiomeModifier> ADD_GOATWEED_HOT = registerKey("add_goatweed_hot");
    public static final ResourceKey<BiomeModifier> ADD_GOATWEED_WET = registerKey("add_goatweed_wet");
    public static final ResourceKey<BiomeModifier> ADD_GARLIC_PLAINS = registerKey("add_garlic_plains");
    public static final ResourceKey<BiomeModifier> ADD_GOLDENROD_PLAINS = registerKey("add_goldenrod_plains");

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

        context.register(ADD_BURDOCK_ROOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BURDOCK_ROOT_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

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

        context.register(ADD_COBWEB_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COBWEB_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CHERVIL_HILLS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_HILL),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHERVIL_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CHERVIL_MOUNTAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHERVIL_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CHICKWEED_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHICKWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CHICKWEED_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHICKWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_COLTSFOOT_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COLTSFOOT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_COLTSFOOT_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COLTSFOOT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_COMFREY_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COMFREY_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_COMFREY_COLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COMFREY_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DOCK_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.DOCK_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_ELDERBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.ELDERBERRY_BUSH_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_FENNEL_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FENNEL_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_FENNEL_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FENNEL_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_FEVERFEW_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FEVERFEW_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_GOATWEED_HOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GOATWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_GOATWEED_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GOATWEED_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_GARLIC_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GARLIC_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_GOLDENROD_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GOLDENROD_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Herbalism.MODID, name));
    }
}