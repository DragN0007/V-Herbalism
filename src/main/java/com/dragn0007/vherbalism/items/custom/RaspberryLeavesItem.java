package com.dragn0007.vherbalism.items.custom;

import com.dragn0007.vherbalism.items.custom.base.HerbalItem;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RaspberryLeavesItem extends HerbalItem {

    public RaspberryLeavesItem(Properties properties) {
        super(properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.EAT;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {

        RandomSource random = RandomSource.create();

        if (random.nextDouble() < 0.40) {
            if (!level.isClientSide) entity.heal(2F);
        } else if (random.nextDouble() > 0.40) {
            if (!level.isClientSide) entity.heal(1F);
        }

        if (entity instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (entity instanceof Player && !((Player)entity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.vherbalism.raspberry_leaves.tooltip").withStyle(ChatFormatting.GRAY));
    }
}
