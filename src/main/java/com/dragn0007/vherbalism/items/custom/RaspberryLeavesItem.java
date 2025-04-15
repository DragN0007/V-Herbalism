package com.dragn0007.vherbalism.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RaspberryLeavesItem extends Item {

    public RaspberryLeavesItem(Properties properties) {
        super(properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BRUSH;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.vherbalism.raspberry_leaves.tooltip").withStyle(ChatFormatting.GRAY));
    }
}
