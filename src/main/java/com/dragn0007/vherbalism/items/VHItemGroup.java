package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class VHItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Herbalism.MODID);

    public static final RegistryObject<CreativeModeTab> HERBALISM_GROUP = CREATIVE_MODE_TABS.register("vherbalism",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VHItems.ALDER_BARK.get())).title(Component.translatable("itemGroup.vherbalism"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
