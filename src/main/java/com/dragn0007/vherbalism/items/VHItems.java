package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.items.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VHItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Herbalism.MODID);

    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new BlackberryItem(VHBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> BLACKBERRY_LEAVES = ITEMS.register("blackberry_leaves",
            () -> new BlackberryLeavesItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BLACKBERRY_LEAF_POULTICE = ITEMS.register("blackberry_leaf_poultice",
            () -> new BlackberryLeafPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BINDWEED_BUNDLE = ITEMS.register("bindweed_bundle",
            () -> new BindweedItem(VHBlocks.BINDWEED.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BORAGE = ITEMS.register("borage",
            () -> new BorageItem(VHBlocks.BORAGE.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BROOM_BUNDLE = ITEMS.register("broom_bundle",
            () -> new BroomItem(VHBlocks.BROOM_SHRUB.get(), (new Item.Properties())));
    public static final RegistryObject<Item> BROOM_POULTICE = ITEMS.register("broom_poultice",
            () -> new BroomPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BURDOCK_ROOT = ITEMS.register("burdock_root",
            () -> new BurdockRootItem(new Item.Properties()));

    public static final RegistryObject<Item> BURNET_BUNDLE = ITEMS.register("burnet_bundle",
            () -> new BurnetItem(VHBlocks.BURNET.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1F).saturationMod(0).build()))));

    public static final RegistryObject<Item> CATCHWEED_BUNDLE = ITEMS.register("catchweed_bundle",
            () -> new CatchweedItem(VHBlocks.CATCHWEED.get(), (new Item.Properties())));


    public static final RegistryObject<Item> CATMINT_LEAVES = ITEMS.register("catmint_leaves",
            () -> new CatchweedItem(VHBlocks.CATMINT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> CELADINE_BUNDLE = ITEMS.register("celadine_bundle",
            () -> new CeladineItem(VHBlocks.CELADINE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CELADINE_JUICE = ITEMS.register("celadine_juice",
            () -> new CeladineJuiceItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CAMOMILE_FLOWER = ITEMS.register("camomile_flower",
            () -> new CamomileItem(VHBlocks.CAMOMILE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1F).saturationMod(0).build()))));

    public static final RegistryObject<Item> COBWEB = ITEMS.register("cobweb",
            () -> new CobwebItem(new Item.Properties()));

    public static final RegistryObject<Item> CHERVIL = ITEMS.register("chervil",
            () -> new ChervilItem(VHBlocks.CHERVIL.get(), (new Item.Properties())));

    public static final RegistryObject<Item> CHICKWEED = ITEMS.register("chickweed",
            () -> new ChickweedItem(VHBlocks.CHICKWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> COLTSFOOT_BUNDLE = ITEMS.register("coltsfoot_bundle",
            () -> new ColtsfootItem(VHBlocks.COLTSFOOT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> COMFREY_LEAF = ITEMS.register("comfrey_leaf",
            () -> new ComfreyItem(VHBlocks.COMFREY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1F).saturationMod(0).build()))));
    public static final RegistryObject<Item> COMFREY_ROOT = ITEMS.register("comfrey_root",
            () -> new ComfreyRootItem(VHBlocks.COMFREY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1F).saturationMod(0).build()))));

    public static final RegistryObject<Item> DAISY_LEAVES = ITEMS.register("daisy_leaves",
            () -> new DaisyItem(VHBlocks.DAISY.get(), (new Item.Properties())));

    public static final RegistryObject<Item> DANDELION_LEAVES = ITEMS.register("dandelion_leaves",
            () -> new DandelionItem(VHBlocks.DANDELION.get(), (new Item.Properties())));
    public static final RegistryObject<Item> DANDELION_ROOT = ITEMS.register("dandelion_root",
            () -> new DandelionRootItem(VHBlocks.DANDELION.get(), (new Item.Properties())));

    public static final RegistryObject<Item> DOCK_LEAF = ITEMS.register("dock_leaf",
            () -> new DockItem(VHBlocks.DOCK.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry",
            () -> new ElderberryItem(VHBlocks.ELDERBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> ELDERBERRY_LEAVES = ITEMS.register("elderberry_leaves",
            () -> new ElderberryLeavesItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ELDERBERRY_LEAF_POULTICE = ITEMS.register("elderberry_leaf_poultice",
            () -> new ElderberryLeafPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FENNEL_STALK = ITEMS.register("fennel_stalk",
            () -> new FennelStalkItem(VHBlocks.FENNEL.get(), (new Item.Properties())));

    public static final RegistryObject<Item> FEVERFEW_BUNDLE = ITEMS.register("feverfew_bundle",
            () -> new FeverfewItem(VHBlocks.FEVERFEW.get(), (new Item.Properties())));

    public static final RegistryObject<Item> GOATWEED_BUNDLE = ITEMS.register("goatweed_bundle",
            () -> new GoatweedItem(VHBlocks.GOATWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new GarlicItem(VHBlocks.GARLIC.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));

    public static final RegistryObject<Item> GOLDENROD_BUNDLE = ITEMS.register("goldenrod_bundle",
            () -> new GoldenrodItem(VHBlocks.GOLDENROD.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> GOLDENROD_POULTICE = ITEMS.register("goldenrod_poultice",
            () -> new GoldenrodPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HAWKWEED_BUNDLE = ITEMS.register("hawkweed_bundle",
            () -> new HawkweedItem(VHBlocks.HAWKWEED.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HEATHER_BUNDLE = ITEMS.register("heather_bundle",
            () -> new HeatherItem(VHBlocks.HEATHER.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HORSETAIL_BUNDLE = ITEMS.register("horsetail_bundle",
            () -> new HorsetailItem(VHBlocks.HORSETAIL.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> HORSETAIL_POULTICE = ITEMS.register("horsetail_poultice",
            () -> new HorsetailPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> IVY_LEAF = ITEMS.register("ivy_leaf",
            () -> new IvyItem(VHBlocks.IVY.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> JUNIPERBERRY = ITEMS.register("juniperberry",
            () -> new JuniperItem(VHBlocks.JUNIPER_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> TOPICAL_POULTICE = ITEMS.register("topical_poultice",
            () -> new TopicalPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BAY_LAUREL_LEAF = ITEMS.register("bay_laurel_leaf",
            () -> new BayLaurelItem(VHBlocks.BAY_LAUREL.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LAVENDER_BUNDLE = ITEMS.register("lavender_bundle",
            () -> new LavenderItem(VHBlocks.LAVENDER.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BRIGHT_EYE_BUNDLE = ITEMS.register("bright_eye_bundle",
            () -> new BrightEyeItem(VHBlocks.BRIGHT_EYE.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LOVAGE_BUNDLE = ITEMS.register("lovage_bundle",
            () -> new LovageItem(VHBlocks.LOVAGE.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BRIGHT_EYE_LOVAGE_POULTICE = ITEMS.register("bright_eye_lovage_poultice",
            () -> new BrightEyeLovagePoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LUNGWORT_LEAF = ITEMS.register("lungwort_leaf",
            () -> new LungwortItem(VHBlocks.LUNGWORT.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MALLOW = ITEMS.register("mallow",
            () -> new MallowItem(VHBlocks.MALLOW.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MARIGOLD_BUNDLE = ITEMS.register("marigold_bundle",
            () -> new MarigoldItem(VHBlocks.MARIGOLD.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> MARIGOLD_POULTICE = ITEMS.register("marigold_poultice",
            () -> new MarigoldPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MINT_LEAVES = ITEMS.register("mint_leaves",
            () -> new MintItem(VHBlocks.MINT.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MOSS_CLUMP = ITEMS.register("moss_clump",
            () -> new MossItem(Blocks.MOSS_CARPET, new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> DRIED_OAK_LEAVES = ITEMS.register("dried_oak_leaves",
            () -> new DriedOakLeavesItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> POPPY_SEEDS = ITEMS.register("poppy_seeds",
            () -> new PoppySeedsItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new RaspberryItem(VHBlocks.RASPBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> RASPBERRY_LEAVES = ITEMS.register("raspberry_leaves",
            () -> new RaspberryLeavesItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PARSLEY_LEAVES = ITEMS.register("parsley_leaves",
            () -> new ParsleyItem(VHBlocks.PARSLEY.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAGWEED_BUNDLE = ITEMS.register("ragweed_bundle",
            () -> new RagweedItem(VHBlocks.RAGWEED.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1F).saturationMod(0).build()))));

    public static final RegistryObject<Item> RAGWORT_LEAVES = ITEMS.register("ragwort_leaves",
            () -> new RagwortItem(VHBlocks.RAGWORT.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RHUBARB = ITEMS.register("rhubarb",
            () -> new RhubarbItem(VHBlocks.RHUBARB.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> RHUBARB_LEAF = ITEMS.register("rhubarb_leaf",
            () -> new RhubarbLeafItem(VHBlocks.RHUBARB.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> ROSEMARY_BUNDLE = ITEMS.register("rosemary_bundle",
            () -> new RosemaryItem(VHBlocks.ROSEMARY.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RUSH_BUNDLE = ITEMS.register("rush_bundle",
            () -> new RushItem(VHBlocks.RUSH.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SHEEP_SORREL_BUNDLE = ITEMS.register("sheep_sorrel_bundle",
            () -> new SheepSorrelItem(VHBlocks.SHEEP_SORREL.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SORREL_LEAVES = ITEMS.register("sorrel_leaves",
            () -> new SorrelItem(VHBlocks.SORREL.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> STINGING_NETTLE_LEAVES = ITEMS.register("stinging_nettle_leaves",
            () -> new StingingNettleItem(VHBlocks.STINGING_NETTLE.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TREE_SAP = ITEMS.register("tree_sap",
            () -> new TreeSapItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SWEET_SEDGE_BUNDLE = ITEMS.register("sweet_sedge_bundle",
            () -> new SweetSedgeItem(VHBlocks.SWEET_SEDGE.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TANSY_BUNDLE = ITEMS.register("tansy_bundle",
            () -> new TansyItem(VHBlocks.TANSY.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> THYME_BUNDLE = ITEMS.register("thyme_bundle",
            () -> new ThymeItem(VHBlocks.THYME.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TORMENTIL_BUNDLE = ITEMS.register("tormentil_bundle",
            () -> new TormentilItem(VHBlocks.TORMENTIL.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> TORMENTIL_POULTICE = ITEMS.register("tormentil_poultice",
            () -> new TormentilPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> WATERMINT_BUNDLE = ITEMS.register("watermint_bundle",
            () -> new WatermintItem(VHBlocks.WATERMINT.get(), new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> WILLOW_BUNDLE = ITEMS.register("willow_bundle",
            () -> new WillowItem(VHBlocks.WILLOW.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> COOKED_WILLOW = ITEMS.register("cooked_willow",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).build())));

    public static final RegistryObject<Item> WINTERGREEN_BERRY = ITEMS.register("wintergreen_berry",
            () -> new WintergreenBerryItem(VHBlocks.WINTERGREEN_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> WINTERGREEN_LEAVES = ITEMS.register("wintergreen_leaves",
            () -> new WintergreenLeavesItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> WINTERGREEN_LEAF_POULTICE = ITEMS.register("wintergreen_leaf_poultice",
            () -> new WintergreenLeafPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> WOOD_SORREL_LEAF = ITEMS.register("wood_sorrel_leaf",
            () -> new WoodSorrelLeafItem(VHBlocks.WOOD_SORREL.get(), (new Item.Properties().stacksTo(64))));
    public static final RegistryObject<Item> WOOD_SORREL_POULTICE = ITEMS.register("wood_sorrel_poultice",
            () -> new WoodSorrelLeafPoulticeItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> YARROW_BUNDLE = ITEMS.register("yarrow_bundle",
            () -> new YarrowItem(VHBlocks.YARROW.get(), new Item.Properties().stacksTo(64)));



    public static final RegistryObject<Item> BIRCH_SAP = ITEMS.register("birch_sap",
            () -> new BirchSapItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ALDER_BARK = ITEMS.register("alder_bark",
            () -> new AlderTreeBarkItem(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}