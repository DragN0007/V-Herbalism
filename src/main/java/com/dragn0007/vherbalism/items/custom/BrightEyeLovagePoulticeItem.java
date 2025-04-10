package com.dragn0007.vherbalism.items.custom;

import com.dragn0007.vherbalism.items.custom.base.HerbalItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BrightEyeLovagePoulticeItem extends HerbalItem {

    public BrightEyeLovagePoulticeItem(Properties properties) {
        super(properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BRUSH;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.vherbalism.bright_eye_lovage_poultice.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
