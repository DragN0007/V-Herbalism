package com.dragn0007.vherbalism;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.items.VHItemGroup;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Herbalism.MODID)
public class Herbalism
{
    public static final String MODID = "vherbalism";

    public Herbalism()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        VHItems.register(eventBus);
        VHItemGroup.register(eventBus);
        VHBlocks.register(eventBus);
        VHBlocksNoDatagenLoot.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        System.out.println("[V-Herbalism] Registered V-Herbalism.");
    }
}
