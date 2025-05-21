package com.dragn0007.vherbalism.entities;

import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class SandClump extends ThrowableItemProjectile {
   public SandClump(EntityType<? extends SandClump> type, Level level) {
      super(type, level);
   }

   public SandClump(Level p43142, Player p43143) {
      super(EntityTypes.SAND_CLUMP.get(), p43143, p43142);
   }

   public Item getDefaultItem() {
      return VHItems.SAND_CLUMP.get();
   }

   public ParticleOptions getParticle() {
      ItemStack itemstack = this.getItemRaw();
      return itemstack.isEmpty() ? (ParticleOptions) ParticleTypes.FALLING_DUST : new ItemParticleOption(ParticleTypes.ITEM, itemstack);
   }

   public void handleEntityEvent(byte b) {
      if (b == 3) {
         ParticleOptions particleoptions = this.getParticle();

         for(int i = 0; i < 8; ++i) {
            this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public void onHitEntity(EntityHitResult result) {
      super.onHitEntity(result);

      RandomSource random = RandomSource.create();

      if (!this.level().isClientSide) {
         Entity entity = result.getEntity();
         if (entity instanceof LivingEntity livingEntity) {
            if (random.nextDouble() < 0.50) {
               entity.hurt(entity.damageSources().fallingBlock(entity), 1F);
            }
            livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 1));
         }
      }

      Entity entity = result.getEntity();
      int i = entity instanceof EnderMan ? 3 : 0;
      entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)i);
   }

   public void onHit(HitResult result) {
      super.onHit(result);
      if (!this.level().isClientSide) {
         this.level().broadcastEntityEvent(this, (byte)3);
         this.discard();
      }

   }
}