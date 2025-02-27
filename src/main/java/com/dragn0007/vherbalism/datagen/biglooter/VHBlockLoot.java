package com.dragn0007.vherbalism.datagen.biglooter;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.blocks.crop.BindweedCrop;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.function.Function;

public class VHBlockLoot extends BlockLootSubProvider {
    public VHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.ignore(VHBlocksNoDatagenLoot.ALDER_LOG.get());
        this.dropSelf(VHBlocks.ALDER_PLANKS.get());
        this.dropSelf(VHBlocks.ALDER_SLAB.get());
        this.dropSelf(VHBlocks.ALDER_STAIRS.get());
        this.dropSelf(VHBlocks.ALDER_SAPLING.get());
        this.dropSelf(VHBlocks.ALDER_FENCE.get());
        this.dropSelf(VHBlocks.ALDER_FENCE_GATE.get());
        this.add(VHBlocks.ALDER_LEAVES.get(), (block) -> this.createLeavesDrops(block, VHBlocks.ALDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.ignore(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get());
        this.dropSelf(VHBlocks.SAPPY_BIRCH_SAPLING.get());

        this.dropOther(VHBlocks.WILD_BINDWEED.get(), VHItems.BINDWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BINDWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BindweedCrop.AGE, 3));
        this.add(VHBlocks.BINDWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BINDWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder1).add(LootItem.lootTableItem
                (VHItems.BINDWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

    }

    private void ignore(Block block) {
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return VHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
