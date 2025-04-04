package com.dragn0007.vherbalism.items;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VHItems.BROOM_BUNDLE.get())).title(Component.translatable("itemGroup.vherbalism"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(VHItems.ALDER_BARK.get());

                        output.accept(VHBlocksNoDatagenLoot.ALDER_LOG.get());
                        output.accept(VHBlocks.ALDER_LEAVES.get());
                        output.accept(VHBlocks.ALDER_PLANKS.get());
                        output.accept(VHBlocks.ALDER_SAPLING.get());
                        output.accept(VHBlocks.ALDER_SLAB.get());
                        output.accept(VHBlocks.ALDER_STAIRS.get());
                        output.accept(VHBlocks.ALDER_FENCE.get());
                        output.accept(VHBlocks.ALDER_FENCE_GATE.get());

                        output.accept(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get());
                        output.accept(VHBlocks.SAPPY_BIRCH_SAPLING.get());
                        output.accept(VHItems.BIRCH_SAP.get());

                        output.accept(VHItems.BINDWEED_BUNDLE.get());
                        output.accept(VHItems.BLACKBERRY.get());
                        output.accept(VHItems.BLACKBERRY_LEAVES.get());
                        output.accept(VHItems.BLACKBERRY_LEAF_POULTICE.get());
                        output.accept(VHItems.BORAGE.get());
                        output.accept(VHItems.BROOM_BUNDLE.get());
                        output.accept(VHItems.BROOM_POULTICE.get());
                        output.accept(VHItems.BURDOCK_ROOT.get());
                        output.accept(VHItems.BURNET_BUNDLE.get());
                        output.accept(VHItems.CATCHWEED_BUNDLE.get());
                        output.accept(VHItems.CATMINT_LEAVES.get());
                        output.accept(VHItems.CELADINE_BUNDLE.get());
                        output.accept(VHItems.CELADINE_JUICE.get());
                        output.accept(VHItems.CAMOMILE_FLOWER.get());
                        output.accept(VHItems.COBWEB.get());
                        output.accept(VHItems.CHERVIL.get());
                        output.accept(VHItems.CHICKWEED.get());
                        output.accept(VHItems.COLTSFOOT_BUNDLE.get());
                        output.accept(VHItems.COMFREY_LEAF.get());
                        output.accept(VHItems.COMFREY_ROOT.get());
                        output.accept(VHItems.DAISY_LEAVES.get());
                        output.accept(VHItems.DANDELION_LEAVES.get());
                        output.accept(VHItems.DANDELION_ROOT.get());
                        output.accept(VHItems.DOCK_LEAF.get());
                        output.accept(VHItems.ELDERBERRY.get());
                        output.accept(VHItems.ELDERBERRY_LEAVES.get());
                        output.accept(VHItems.ELDERBERRY_LEAF_POULTICE.get());
                        output.accept(VHItems.FENNEL_STALK.get());
                        output.accept(VHItems.FEVERFEW_BUNDLE.get());
                        output.accept(VHItems.GARLIC.get());
                        output.accept(VHItems.GOATWEED_BUNDLE.get());
                        output.accept(VHItems.GOLDENROD_BUNDLE.get());
                        output.accept(VHItems.GOLDENROD_POULTICE.get());
                        output.accept(VHItems.HAWKWEED_BUNDLE.get());
                        output.accept(VHItems.HEATHER_BUNDLE.get());
                        output.accept(VHItems.HORSETAIL_BUNDLE.get());
                        output.accept(VHItems.HORSETAIL_POULTICE.get());
                        output.accept(VHItems.IVY_LEAF.get());
                        output.accept(VHItems.JUNIPERBERRY.get());
                        output.accept(VHItems.TOPICAL_POULTICE.get());

                        output.accept(VHBlocks.KITTYPET_SCENT.get());
                        output.accept(VHBlocks.LONER_SCENT.get());
                        output.accept(VHBlocks.MEDIATOR_SCENT.get());
                        output.accept(VHBlocks.ROGUE_SCENT.get());
                        output.accept(VHBlocks.SHARP_SCENT.get());
                        output.accept(VHBlocks.WHARF_SCENT.get());
                        output.accept(VHBlocks.WHISTLE_SCENT.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
