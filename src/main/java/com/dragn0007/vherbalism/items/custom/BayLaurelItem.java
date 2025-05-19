package com.dragn0007.vherbalism.items.custom;

import com.dragn0007.vherbalism.items.VHItems;
import com.dragn0007.vherbalism.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BayLaurelItem extends HerbalNameBlockItem {

    public BayLaurelItem(Block block, Properties properties) {
        super(block, properties);
    }

    public InteractionResult useOn(UseOnContext useOnContext) {
        Level level = useOnContext.getLevel();
        BlockPos pos = useOnContext.getClickedPos();
        BlockEntity blockEntity = level.getBlockEntity(pos);
        BlockState state = level.getBlockState(pos);

        if (blockEntity instanceof BeehiveBlockEntity) {
            Player player = useOnContext.getPlayer();
            int honeyLevel = state.getValue(BeehiveBlock.HONEY_LEVEL);
            if (honeyLevel >= 5 && player != null) {
                level.playSound(player, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);

                level.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, 0), 3);

                player.addItem(new ItemStack(VHItems.HONEY_BAY_LAUREL_LEAF.get()));
                return InteractionResult.PASS;
            }
        }

        return super.useOn(useOnContext);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        BlockHitResult blockhitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        if (blockhitresult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemstack);
        }

        if (blockhitresult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockpos = blockhitresult.getBlockPos();

            if (!level.mayInteract(player, blockpos)) {
                return InteractionResultHolder.pass(itemstack);
            }

            if (level.getFluidState(blockpos).is(FluidTags.WATER)) {
                level.playSound(player, player.getX(), player.getY(), player.getZ(),
                SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);

                level.gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);

                ItemStack result = this.fillItem(itemstack, player, new ItemStack(VHItems.WATER_BAY_LAUREL_LEAF.get()));
                return InteractionResultHolder.sidedSuccess(result, level.isClientSide());
            }
        }

        return InteractionResultHolder.pass(itemstack);
    }


    protected ItemStack fillItem(ItemStack p_40652_, Player p_40653_, ItemStack p_40654_) {
        p_40653_.awardStat(Stats.ITEM_USED.get(this));
        return ItemUtils.createFilledResult(p_40652_, p_40653_, p_40654_);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BOW;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.vherbalism.bay_laurel.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
