package com.dragn0007.vherbalism.datagen.biglooter;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismCropBlock;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

        this.ignore(VHBlocksNoDatagenLoot.WILLOW_LOG.get());
        this.dropSelf(VHBlocks.WILLOW_PLANKS.get());
        this.dropSelf(VHBlocks.WILLOW_SLAB.get());
        this.dropSelf(VHBlocks.WILLOW_STAIRS.get());
        this.dropSelf(VHBlocks.WILLOW_SAPLING.get());
        this.dropSelf(VHBlocks.WILLOW_FENCE.get());
        this.dropSelf(VHBlocks.WILLOW_FENCE_GATE.get());
        this.add(VHBlocks.WILLOW_LEAVES.get(), (block) -> this.createLeavesDrops(block, VHBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropOther(VHBlocks.HANGING_BURDOCK_ROOT.get(), VHItems.BURDOCK_ROOT.get());
        LootItemCondition.Builder lootitemcondition$builder0 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BURDOCK_ROOT.get());
        this.add(VHBlocks.BURDOCK_ROOT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BURDOCK_ROOT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder0).add(LootItem.lootTableItem
                (VHItems.BURDOCK_ROOT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                (Blocks.DIRT))).withPool(LootPool.lootPool().when(lootitemcondition$builder0).add(LootItem.lootTableItem
                (Blocks.DIRT).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BINDWEED.get(), VHItems.BINDWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BINDWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BINDWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BINDWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder1).add(LootItem.lootTableItem
                (VHItems.BINDWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BLACKBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BLACKBERRY_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BLACKBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                (VHItems.BLACKBERRY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BORAGE.get(), VHItems.BORAGE.get());
        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BORAGE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BORAGE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BORAGE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder3).add(LootItem.lootTableItem
                (VHItems.BORAGE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BROOM_SHRUB.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BROOM_SHRUB.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.BROOM_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder4).add(LootItem.lootTableItem
                        (VHItems.BROOM_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BURNET.get(), VHItems.BURNET_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BURNET.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BURNET.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BURNET_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder5).add(LootItem.lootTableItem
                (VHItems.BURNET_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CATCHWEED.get(), VHItems.CATCHWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CATCHWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CATCHWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CATCHWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder6).add(LootItem.lootTableItem
                (VHItems.CATCHWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CATMINT.get(), VHItems.CATMINT_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CATMINT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CATMINT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CATMINT_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder7).add(LootItem.lootTableItem
                (VHItems.CATMINT_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CELADINE.get(), VHItems.CELADINE_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CELADINE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CELADINE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CELADINE_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder8).add(LootItem.lootTableItem
                (VHItems.CELADINE_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CAMOMILE.get(), VHItems.CAMOMILE_FLOWER.get());
        LootItemCondition.Builder lootitemcondition$builder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CAMOMILE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CAMOMILE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CAMOMILE_FLOWER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder9).add(LootItem.lootTableItem
                (VHItems.CAMOMILE_FLOWER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.COBWEB.get(), VHItems.COBWEB.get());

        this.dropOther(VHBlocks.WILD_CHERVIL.get(), VHItems.CHERVIL.get());
        LootItemCondition.Builder lootitemcondition$builder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CHERVIL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CHERVIL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CHERVIL.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder10).add(LootItem.lootTableItem
                (VHItems.CHERVIL.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_CHICKWEED.get(), VHItems.CHICKWEED.get());
        LootItemCondition.Builder lootitemcondition$builder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.CHICKWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.CHICKWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.CHICKWEED.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder11).add(LootItem.lootTableItem
                (VHItems.CHICKWEED.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_COLTSFOOT.get(), VHItems.COLTSFOOT_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.COLTSFOOT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.COLTSFOOT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.COLTSFOOT_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder12).add(LootItem.lootTableItem
                (VHItems.COLTSFOOT_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_COMFREY.get(), VHItems.COMFREY_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.COMFREY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.COMFREY.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.COMFREY_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder13).add(LootItem.lootTableItem
                        (VHItems.COMFREY_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.COMFREY_ROOT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder13).add(LootItem.lootTableItem
                        (VHItems.COMFREY_ROOT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.DAISY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.DAISY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.DAISY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder14).add(LootItem.lootTableItem
                (VHItems.DAISY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.DANDELION.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.DANDELION.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.DANDELION_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder15).add(LootItem.lootTableItem
                        (VHItems.DANDELION_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.DANDELION_ROOT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder15).add(LootItem.lootTableItem
                        (VHItems.DANDELION_ROOT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_DOCK.get(), VHItems.DOCK_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.DOCK.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.DOCK.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.DOCK_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder16).add(LootItem.lootTableItem
                (VHItems.DOCK_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.ELDERBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.ELDERBERRY_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.ELDERBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder17).add(LootItem.lootTableItem
                        (VHItems.ELDERBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.ELDERBERRY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder17).add(LootItem.lootTableItem
                        (VHItems.ELDERBERRY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_FENNEL.get(), VHItems.FENNEL_STALK.get());
        LootItemCondition.Builder lootitemcondition$builder18 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.FENNEL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.FENNEL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.FENNEL_STALK.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder18).add(LootItem.lootTableItem
                (VHItems.FENNEL_STALK.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_FEVERFEW.get(), VHItems.FEVERFEW_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder19 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.FEVERFEW.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.FEVERFEW.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.FEVERFEW_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder19).add(LootItem.lootTableItem
                (VHItems.FEVERFEW_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_GOATWEED.get(), VHItems.GOATWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder20 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.GOATWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.GOATWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.GOATWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder20).add(LootItem.lootTableItem
                (VHItems.GOATWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_GARLIC.get(), VHItems.GARLIC.get());
        LootItemCondition.Builder lootitemcondition$builder21 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.GARLIC.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.GARLIC.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.GARLIC.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder21).add(LootItem.lootTableItem
                (VHItems.GARLIC.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_GOLDENROD.get(), VHItems.GOLDENROD_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder22 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.GOLDENROD.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.GOLDENROD.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.GOLDENROD_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder22).add(LootItem.lootTableItem
                (VHItems.GOLDENROD_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_HAWKWEED.get(), VHItems.HAWKWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder23 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.HAWKWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.HAWKWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.HAWKWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder23).add(LootItem.lootTableItem
                (VHItems.HAWKWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_HORSETAIL.get(), VHItems.HORSETAIL_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder24 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.HORSETAIL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.HORSETAIL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.HORSETAIL_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder24).add(LootItem.lootTableItem
                (VHItems.HORSETAIL_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_IVY.get(), VHItems.IVY_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder25 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.IVY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.IVY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.IVY_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder25).add(LootItem.lootTableItem
                (VHItems.IVY_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder26 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.JUNIPER_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.JUNIPER_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.JUNIPERBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder26).add(LootItem.lootTableItem
                        (VHItems.JUNIPERBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_HEATHER.get(), VHItems.HEATHER_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder27 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.HEATHER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.HEATHER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.HEATHER_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder27).add(LootItem.lootTableItem
                (VHItems.HEATHER_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BAY_LAUREL.get(), VHItems.BAY_LAUREL_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder28 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BAY_LAUREL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BAY_LAUREL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BAY_LAUREL_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder28).add(LootItem.lootTableItem
                (VHItems.BAY_LAUREL_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_LAVENDER.get(), VHItems.LAVENDER_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder29 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.LAVENDER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.LAVENDER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.LAVENDER_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder29).add(LootItem.lootTableItem
                (VHItems.LAVENDER_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_BRIGHT_EYE.get(), VHItems.BRIGHT_EYE_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder30 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.BRIGHT_EYE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.BRIGHT_EYE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.BRIGHT_EYE_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder30).add(LootItem.lootTableItem
                (VHItems.BRIGHT_EYE_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_LOVAGE.get(), VHItems.LOVAGE_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder31 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.LOVAGE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.LOVAGE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.LOVAGE_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder31).add(LootItem.lootTableItem
                (VHItems.LOVAGE_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_LUNGWORT.get(), VHItems.LUNGWORT_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder32 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.LUNGWORT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.LUNGWORT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.LUNGWORT_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder32).add(LootItem.lootTableItem
                (VHItems.LUNGWORT_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_MALLOW.get(), VHItems.MALLOW.get());
        LootItemCondition.Builder lootitemcondition$builder33 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.MALLOW.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.MALLOW.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.MALLOW.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder33).add(LootItem.lootTableItem
                (VHItems.MALLOW.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_MARIGOLD.get(), VHItems.MARIGOLD_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder34 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.MARIGOLD.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.MARIGOLD.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.MARIGOLD_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder34).add(LootItem.lootTableItem
                (VHItems.MARIGOLD_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_MINT.get(), VHItems.MINT_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder35 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.MINT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.MINT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.MINT_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder35).add(LootItem.lootTableItem
                (VHItems.MINT_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(VHBlocks.PREPARED_OAK_LEAVES.get());
        this.dropOther(VHBlocks.DRIED_OAK_LEAVES.get(), VHItems.DRIED_OAK_LEAVES.get());

        LootItemCondition.Builder lootitemcondition$builder36 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.RASPBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.RASPBERRY_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.RASPBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder36).add(LootItem.lootTableItem
                        (VHItems.RASPBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.RASPBERRY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder36).add(LootItem.lootTableItem
                        (VHItems.RASPBERRY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_PARSLEY.get(), VHItems.PARSLEY_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder37 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.PARSLEY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.PARSLEY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.PARSLEY_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder37).add(LootItem.lootTableItem
                (VHItems.PARSLEY_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_RAGWEED.get(), VHItems.RAGWEED_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder38 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.RAGWEED.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.RAGWEED.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.RAGWEED_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder38).add(LootItem.lootTableItem
                (VHItems.RAGWEED_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_RAGWORT.get(), VHItems.RAGWORT_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder39 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.RAGWORT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.RAGWORT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.RAGWORT_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder39).add(LootItem.lootTableItem
                (VHItems.RAGWORT_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_RHUBARB.get(), VHItems.RHUBARB_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder40 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.RHUBARB.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.RHUBARB.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.RHUBARB.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder40).add(LootItem.lootTableItem
                        (VHItems.RHUBARB.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.RHUBARB_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                        (VHItems.RHUBARB_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_ROSEMARY.get(), VHItems.ROSEMARY_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder41 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.ROSEMARY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.ROSEMARY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.ROSEMARY_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder41).add(LootItem.lootTableItem
                (VHItems.ROSEMARY_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_RUSH.get(), VHItems.RUSH_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder42 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.RUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.RUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.RUSH_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder42).add(LootItem.lootTableItem
                (VHItems.RUSH_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_SHEEP_SORREL.get(), VHItems.SHEEP_SORREL_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder43 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.SHEEP_SORREL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.SHEEP_SORREL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.SHEEP_SORREL_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder43).add(LootItem.lootTableItem
                (VHItems.SHEEP_SORREL_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_SORREL.get(), VHItems.SORREL_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder44 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.SORREL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.SORREL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.SORREL_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder44).add(LootItem.lootTableItem
                (VHItems.SORREL_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_STINGING_NETTLE.get(), VHItems.STINGING_NETTLE_LEAVES.get());
        LootItemCondition.Builder lootitemcondition$builder45 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.STINGING_NETTLE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.STINGING_NETTLE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.STINGING_NETTLE_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder45).add(LootItem.lootTableItem
                (VHItems.STINGING_NETTLE_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_SWEET_SEDGE.get(), VHItems.SWEET_SEDGE_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder46 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.SWEET_SEDGE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.SWEET_SEDGE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.SWEET_SEDGE_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder46).add(LootItem.lootTableItem
                (VHItems.SWEET_SEDGE_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_TANSY.get(), VHItems.TANSY_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder47 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.TANSY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.TANSY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.TANSY_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder47).add(LootItem.lootTableItem
                (VHItems.TANSY_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_THYME.get(), VHItems.THYME_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder48 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.THYME.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.THYME.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.THYME_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder48).add(LootItem.lootTableItem
                (VHItems.THYME_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_TORMENTIL.get(), VHItems.TORMENTIL_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder49 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.TORMENTIL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.TORMENTIL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.TORMENTIL_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder49).add(LootItem.lootTableItem
                (VHItems.TORMENTIL_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_WATERMINT.get(), VHItems.WATERMINT_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder50 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.WATERMINT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.WATERMINT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.WATERMINT_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder50).add(LootItem.lootTableItem
                (VHItems.WATERMINT_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_WILLOW.get(), VHItems.WILLOW_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder51 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.WILLOW.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.WILLOW.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.WILLOW_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder51).add(LootItem.lootTableItem
                (VHItems.WILLOW_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder52 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.WINTERGREEN_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.WINTERGREEN_BUSH.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                        (VHItems.WINTERGREEN_BERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder52).add(LootItem.lootTableItem
                        (VHItems.WINTERGREEN_BERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))).add(LootItem.lootTableItem
                        (VHItems.WINTERGREEN_LEAVES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder52).add(LootItem.lootTableItem
                        (VHItems.WINTERGREEN_LEAVES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_WOOD_SORREL.get(), VHItems.WOOD_SORREL_LEAF.get());
        LootItemCondition.Builder lootitemcondition$builder53 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.WOOD_SORREL.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.WOOD_SORREL.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.WOOD_SORREL_LEAF.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder53).add(LootItem.lootTableItem
                (VHItems.WOOD_SORREL_LEAF.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(VHBlocks.WILD_YARROW.get(), VHItems.YARROW_BUNDLE.get());
        LootItemCondition.Builder lootitemcondition$builder54 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (VHBlocks.YARROW.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (HerbalismCropBlock.AGE, 3));
        this.add(VHBlocks.YARROW.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (VHItems.YARROW_BUNDLE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder54).add(LootItem.lootTableItem
                (VHItems.YARROW_BUNDLE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

    }

    public void ignore(Block block) {
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return VHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
