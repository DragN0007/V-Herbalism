package com.dragn0007.vherbalism.event;

import com.dragn0007.vherbalism.Herbalism;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = Herbalism.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HerbalismEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

    }


}