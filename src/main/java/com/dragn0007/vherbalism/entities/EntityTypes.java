package com.dragn0007.vherbalism.entities;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dragn0007.vherbalism.Herbalism.MODID;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<MossBall>> MOSS_BALL = ENTITY_TYPES.register("moss_ball",
            () -> EntityType.Builder.of(MossBall::new,
                    MobCategory.CREATURE)
                    .sized(0.4f,0.4f)
                    .build(new ResourceLocation(MODID,"moss_ball").toString()));
}

