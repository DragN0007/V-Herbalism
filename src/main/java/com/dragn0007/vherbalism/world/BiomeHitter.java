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

    public static final ResourceKey<BiomeModifier> ALDER = registerKey("alder");
    public static final ResourceKey<BiomeModifier> SAPPY_BIRCH = registerKey("sappy_birch");
    public static final ResourceKey<BiomeModifier> BINDWEED_FOREST = registerKey("bindweed_forest");
    public static final ResourceKey<BiomeModifier> BINDWEED_PLAINS = registerKey("bindweed_plains");
    public static final ResourceKey<BiomeModifier> BINDWEED_RIVER = registerKey("bindweed_river");
    public static final ResourceKey<BiomeModifier> BLACKBERRY_BUSH = registerKey("blackberry_bush");
    public static final ResourceKey<BiomeModifier> BORAGE_FOREST = registerKey("borage_forest");
    public static final ResourceKey<BiomeModifier> BORAGE_RIVER = registerKey("borage_river");
    public static final ResourceKey<BiomeModifier> BROOM_PLAINS = registerKey("broom_plains");
    public static final ResourceKey<BiomeModifier> BURDOCK_ROOT = registerKey("burdock_root");
    public static final ResourceKey<BiomeModifier> BROOM_BEACH = registerKey("broom_beach");
    public static final ResourceKey<BiomeModifier> BURNET_BEACH = registerKey("burnet_beach");
    public static final ResourceKey<BiomeModifier> CATCHWEED_WET = registerKey("catchweed_wet");
    public static final ResourceKey<BiomeModifier> CATMINT_OVERWORLD = registerKey("catmint_overworld");
    public static final ResourceKey<BiomeModifier> CELADINE_WET = registerKey("celadine_wet");
    public static final ResourceKey<BiomeModifier> CAMOMILE_PLAINS = registerKey("camomile_plains");
    public static final ResourceKey<BiomeModifier> COBWEB_FOREST = registerKey("cobweb_forest");
    public static final ResourceKey<BiomeModifier> CHERVIL_HILLS = registerKey("chervil_hills");
    public static final ResourceKey<BiomeModifier> CHERVIL_MOUNTAINS = registerKey("chervil_mountains");
    public static final ResourceKey<BiomeModifier> CHICKWEED_RIVER = registerKey("chickweed_river");
    public static final ResourceKey<BiomeModifier> CHICKWEED_PLAINS = registerKey("chickweed_plains");
    public static final ResourceKey<BiomeModifier> COLTSFOOT_PLAINS = registerKey("coltsfoot_plains");
    public static final ResourceKey<BiomeModifier> COLTSFOOT_FOREST = registerKey("coltsfoot_forest");
    public static final ResourceKey<BiomeModifier> COMFREY_WET = registerKey("comfrey_wet");
    public static final ResourceKey<BiomeModifier> COMFREY_COLD = registerKey("comfrey_cold");
    public static final ResourceKey<BiomeModifier> DOCK_FOREST = registerKey("dock_forest");
    public static final ResourceKey<BiomeModifier> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<BiomeModifier> FENNEL_PLAINS = registerKey("fennel_plains");
    public static final ResourceKey<BiomeModifier> FENNEL_RIVER = registerKey("fennel_river");
    public static final ResourceKey<BiomeModifier> FEVERFEW_WET = registerKey("feverfew_wet");
    public static final ResourceKey<BiomeModifier> GOATWEED_HOT = registerKey("goatweed_hot");
    public static final ResourceKey<BiomeModifier> GOATWEED_WET = registerKey("goatweed_wet");
    public static final ResourceKey<BiomeModifier> GARLIC_PLAINS = registerKey("garlic_plains");
    public static final ResourceKey<BiomeModifier> GOLDENROD_PLAINS = registerKey("goldenrod_plains");
    public static final ResourceKey<BiomeModifier> HAWKWEED = registerKey("hawkweed");
    public static final ResourceKey<BiomeModifier> HEATHER_SWAMP = registerKey("heather_swamp");
    public static final ResourceKey<BiomeModifier> HEATHER_PLAINS = registerKey("heather_plains");
    public static final ResourceKey<BiomeModifier> HORSETAIL_WET = registerKey("horsetail_wet");
    public static final ResourceKey<BiomeModifier> IVY_FOREST = registerKey("ivy_forest");
    public static final ResourceKey<BiomeModifier> IVY_MOUNTAINS = registerKey("ivy_mountains");
    public static final ResourceKey<BiomeModifier> JUNIPER_PLAINS = registerKey("juniper_plains");
    public static final ResourceKey<BiomeModifier> JUNIPER_CONIFEROUS = registerKey("juniper_coniferous");
    public static final ResourceKey<BiomeModifier> BAY_LAUREL = registerKey("bay_laurel");
    public static final ResourceKey<BiomeModifier> LAVENDER = registerKey("lavender");
    public static final ResourceKey<BiomeModifier> BRIGHT_EYE = registerKey("bright_eye");
    public static final ResourceKey<BiomeModifier> LOVAGE = registerKey("lovage");
    public static final ResourceKey<BiomeModifier> LUNGWORT = registerKey("lungwort");
    public static final ResourceKey<BiomeModifier> MALLOW = registerKey("mallow");
    public static final ResourceKey<BiomeModifier> MARIGOLD = registerKey("marigold");
    public static final ResourceKey<BiomeModifier> MINT = registerKey("mint");
    public static final ResourceKey<BiomeModifier> MOSS = registerKey("moss");
    public static final ResourceKey<BiomeModifier> RASPBERRY = registerKey("raspberry");
    public static final ResourceKey<BiomeModifier> PARSLEY = registerKey("parsley");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ALDER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.ALDER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BINDWEED_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BINDWEED_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BINDWEED_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BINDWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SAPPY_BIRCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.SAPPY_BIRCH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BLACKBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BLACKBERRY_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BORAGE_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BORAGE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BORAGE_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BORAGE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BROOM_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BROOM)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BROOM_BEACH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BROOM)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BURDOCK_ROOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BURDOCK_ROOT)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(BURNET_BEACH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BURNET)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CATCHWEED_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CATCHWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CATMINT_OVERWORLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CATMINT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CELADINE_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CELADINE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CAMOMILE_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CAMOMILE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COBWEB_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COBWEB)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CHERVIL_HILLS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_HILL),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHERVIL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CHERVIL_MOUNTAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHERVIL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CHICKWEED_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHICKWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CHICKWEED_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.CHICKWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COLTSFOOT_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COLTSFOOT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COLTSFOOT_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COLTSFOOT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COMFREY_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COMFREY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COMFREY_COLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.COMFREY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(DOCK_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.DOCK)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ELDERBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.ELDERBERRY_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FENNEL_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FENNEL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FENNEL_RIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FENNEL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FEVERFEW_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.FEVERFEW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GOATWEED_HOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GOATWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GARLIC_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GARLIC)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GOLDENROD_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.GOLDENROD)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HAWKWEED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.HAWKWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HEATHER_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.HEATHER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HEATHER_SWAMP, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.HEATHER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HORSETAIL_WET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.HORSETAIL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(IVY_FOREST, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.IVY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(IVY_MOUNTAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.IVY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(JUNIPER_PLAINS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.JUNIPER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(JUNIPER_CONIFEROUS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.JUNIPER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BAY_LAUREL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BAY_LAUREL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LAVENDER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.LAVENDER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BRIGHT_EYE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.BRIGHT_EYE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LOVAGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.LOVAGE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LUNGWORT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.LUNGWORT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MALLOW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.MALLOW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MARIGOLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.MARIGOLD)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MINT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.MINT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MOSS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.MOSS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(RASPBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.RASPBERRY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PARSLEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(VHPlacedFeatures.PARSLEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Herbalism.MODID, name));
    }
}