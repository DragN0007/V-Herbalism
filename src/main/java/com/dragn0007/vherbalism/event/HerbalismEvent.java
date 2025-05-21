package com.dragn0007.vherbalism.event;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.entities.EntityTypes;
import com.dragn0007.vherbalism.entities.MossBall;
import com.dragn0007.vherbalism.entities.MossBallRender;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = Herbalism.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HerbalismEvent {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypes.MOSS_BALL.get(), MossBall.createAttributes().build());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityTypes.MOSS_BALL.get(), MossBallRender::new);
        EntityRenderers.register(EntityTypes.MUDBALL.get(), ThrownItemRenderer::new);
    }

}