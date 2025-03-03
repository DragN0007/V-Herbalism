package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.items.custom.*;
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
    public static final RegistryObject<Item> BIRCH_SAP = ITEMS.register("birch_sap",
            () -> new BirchSapItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ALDER_BARK = ITEMS.register("alder_bark",
            () -> new AlderTreeBarkItem(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}