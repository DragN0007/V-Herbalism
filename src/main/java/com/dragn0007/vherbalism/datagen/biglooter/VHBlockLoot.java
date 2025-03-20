package com.dragn0007.vherbalism.datagen.biglooter;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.blocks.crop.*;
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

        this.dropOther(VHBlocks.WILD_BURNET.get(), VHItems.BURNET_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BURNET.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (BurnetCrop.AGE, 3));
        this.add(VHBlocks.BURNET.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BURNET_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder5).add(LootItem.lootTableItem
                (VHItems.BURNET_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CATCHWEED.get(), VHItems.CATCHWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CATCHWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (CatchweedCrop.AGE, 3));
        this.add(VHBlocks.CATCHWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CATCHWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder6).add(LootItem.lootTableItem
                (VHItems.CATCHWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CATMINT.get(), VHItems.CATMINT_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CATMINT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (CatmintCrop.AGE, 3));
        this.add(VHBlocks.CATMINT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CATMINT_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder7).add(LootItem.lootTableItem
                (VHItems.CATMINT_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CELADINE.get(), VHItems.CELADINE_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CELADINE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (CatmintCrop.AGE, 3));
        this.add(VHBlocks.CELADINE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CELADINE_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder8).add(LootItem.lootTableItem
                (VHItems.CELADINE_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CAMOMILE.get(), VHItems.CAMOMILE_FLOWER.get());
        LootItemCondition.Builder lootitemcondition$builder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CAMOMILE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (CatmintCrop.AGE, 3));
        this.add(VHBlocks.CAMOMILE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CAMOMILE_FLOWER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder9).add(LootItem.lootTableItem
                (VHItems.CAMOMILE_FLOWER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

    }

    public void ignore(Block block) {
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return VHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
