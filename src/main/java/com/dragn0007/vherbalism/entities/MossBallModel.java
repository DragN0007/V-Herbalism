package com.dragn0007.vherbalism.entities;

import com.dragn0007.vherbalism.Herbalism;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MossBallModel extends GeoModel<MossBall> {

    public static final ResourceLocation MODEL = new ResourceLocation(Herbalism.MODID, "geo/moss_ball.geo.json");
    public static final ResourceLocation ANIMATION = new ResourceLocation(Herbalism.MODID, "animations/moss_ball.animation.json");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Herbalism.MODID, "textures/entity/moss_ball.png");

    @Override
    public ResourceLocation getModelResource(MossBall object) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(MossBall object) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(MossBall animatable) {
        return ANIMATION;
    }
}

