package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.items.custom.AlderTreeBarkItem;
import com.dragn0007.vherbalism.items.custom.BindweedItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VHItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Herbalism.MODID);

    public static final RegistryObject<Item> BINDWEED_BUNDLE = ITEMS.register("bindweed_bundle",
            () -> new BindweedItem(VHBlocks.BINDWEED.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ALDER_BARK = ITEMS.register("alder_bark",
            () -> new AlderTreeBarkItem(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}