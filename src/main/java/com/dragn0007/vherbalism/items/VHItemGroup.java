package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
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

                        output.accept(VHItems.ALDER_BARK.get());

                        output.accept(VHBlocks.ALDER_LOG.get());
                        output.accept(VHBlocks.ALDER_LEAVES.get());
                        output.accept(VHBlocks.ALDER_PLANKS.get());
                        output.accept(VHBlocks.ALDER_SAPLING.get());
                        output.accept(VHBlocks.ALDER_SLAB.get());
                        output.accept(VHBlocks.ALDER_STAIRS.get());
                        output.accept(VHBlocks.ALDER_FENCE.get());
                        output.accept(VHBlocks.ALDER_FENCE_GATE.get());

                        output.accept(VHItems.BINDWEED_BUNDLE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
