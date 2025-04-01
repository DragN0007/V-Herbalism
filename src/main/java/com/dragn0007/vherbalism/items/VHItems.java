package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.items.custom.*;
import io.netty.handler.codec.compression.FastLzFrameEncoder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VHItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Herbalism.MODID);

    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new ItemNameBlockItem(VHBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
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
            () -> new ItemNameBlockItem(VHBlocks.ELDERBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
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




    public static final RegistryObject<Item> BIRCH_SAP = ITEMS.register("birch_sap",
            () -> new BirchSapItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ALDER_BARK = ITEMS.register("alder_bark",
            () -> new AlderTreeBarkItem(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}