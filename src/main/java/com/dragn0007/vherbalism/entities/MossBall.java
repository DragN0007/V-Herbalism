package com.dragn0007.vherbalism.entities;

import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class MossBall extends Mob implements GeoEntity {

    public MossBall(EntityType<? extends Mob> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 12.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.255F)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.0F)
                .add(Attributes.ARMOR, 5)
                .add(Attributes.ARMOR_TOUGHNESS, 8);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource p_21239_) {
        super.getHurtSound(p_21239_);
        return SoundEvents.SLIME_BLOCK_BREAK;
    }

    @Override
    public float getStepHeight() {
        return 1F;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
    }

    public int regenHealthCounter = 0;

    @Override
    public void tick() {

        regenHealthCounter++;

        if (this.getHealth() < this.getMaxHealth() && regenHealthCounter >= 150 && this.isAlive()) {
            this.setHealth(this.getHealth() + 2);
            regenHealthCounter = 0;
            this.level().addParticle(ParticleTypes.HEART, this.getRandomX(0.6D), this.getRandomY(), this.getRandomZ(0.6D), 0.7D, 0.7D, 0.7D);
        }

        super.tick();
    }

    private static final float FRICTION = 1.2f;
    private static final float GRAVITY = 0.08f;

    @Override
    public void aiStep() {

        Vec3 velocity = this.getDeltaMovement();
        double dx = velocity.x * FRICTION;
        if(Math.abs(dx) < 0.001) dx = 0;

        double dz = velocity.z * FRICTION;
        if(Math.abs(dz) < 0.001) dz = 0;

        double dy = velocity.y + (this.onGround() ? 0 : -GRAVITY);

        this.setDeltaMovement(dx, dy, dz);

        super.aiStep();
    }

    public final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public <T extends GeoAnimatable> PlayState predicate(software.bernie.geckolib.core.animation.AnimationState<T> tAnimationState) {
        double currentSpeed = this.getDeltaMovement().lengthSqr();
        double speedThreshold = 0.02;
        double x = this.getX() - this.xo;
        double z = this.getZ() - this.zo;
        boolean isMoving = (x * x + z * z) > 0.00001;

        AnimationController<T> controller = tAnimationState.getController();

        if (isMoving) {
            if (currentSpeed >= speedThreshold) {
                controller.setAnimation(RawAnimation.begin().then("roll", Animation.LoopType.LOOP));
                controller.setAnimationSpeed(2.0);
            } else {
                controller.setAnimation(RawAnimation.begin().then("roll", Animation.LoopType.LOOP));
                controller.setAnimationSpeed(1.0);
            }
        } else {
            controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
            controller.setAnimationSpeed(0.8);
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (super.hurt(source, amount)) {
            Entity attacker = source.getEntity();

            if (attacker.isCrouching()) {
               this.setHealth(getHealth() - 6);
            }

            if (attacker != null) {
                double dx = this.getX() - attacker.getX();
                double dz = this.getZ() - attacker.getZ();
                double angle = Math.atan2(dz, dx);
                float yaw = (float)(Math.toDegrees(angle)) - 90F;
                this.setYRot(yaw);
                this.yBodyRot = yaw;
                this.yHeadRot = yaw;
            }

            return true;
        }
        return false;
    }


    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    public void dropCustomDeathLoot(DamageSource source, int p_33575_, boolean p_33576_) {
        super.dropCustomDeathLoot(source, p_33575_, p_33576_);
        this.spawnAtLocation(VHItems.MOSS_BALL.get());
    }
}
