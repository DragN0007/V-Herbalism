package com.dragn0007.vherbalism.datagen.biglooter;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.blocks.crop.BindweedCrop;
import com.dragn0007.vherbalism.blocks.crop.BorageCrop;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class VHBlockLoot extends BlockLootSubProvider {
    public VHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

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

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BLACKBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BindweedCrop.AGE, 3));
        this.add(VHBlocks.BLACKBERRY_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BLACKBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BORAGE.get(), VHItems.BORAGE.get());
        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BORAGE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BorageCrop.AGE, 3));
        this.add(VHBlocks.BORAGE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BORAGE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder3).add(LootItem.lootTableItem
                (VHItems.BORAGE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BROOM_SHRUB.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BindweedCrop.AGE, 3));
        this.add(VHBlocks.BROOM_SHRUB.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.BROOM_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder4).add(LootItem.lootTableItem
                        (VHItems.BROOM_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));
    }

    public void ignore(Block block) {
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return VHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
