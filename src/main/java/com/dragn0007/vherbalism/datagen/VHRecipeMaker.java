package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class VHRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public VHRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.CELADINE_JUICE.get())
                .requires(VHItems.CELADINE_BUNDLE.get())
                .requires(VHItems.CELADINE_BUNDLE.get())
                .unlockedBy("has_celadine_bundle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.CELADINE_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.BROOM_POULTICE.get())
                .requires(VHItems.BROOM_BUNDLE.get())
                .requires(VHItems.BROOM_BUNDLE.get())
                .requires(VHItems.CATCHWEED_BUNDLE.get())
                .unlockedBy("has_broom_bundle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.BROOM_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.BLACKBERRY_LEAF_POULTICE.get())
                .requires(VHItems.BLACKBERRY_LEAVES.get())
                .requires(VHItems.BLACKBERRY_LEAVES.get())
                .requires(VHItems.CATCHWEED_BUNDLE.get())
                .unlockedBy("has_blackberry_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.BLACKBERRY_LEAVES.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHBlocks.ALDER_PLANKS.get(), 4)
                .requires(VHBlocksNoDatagenLoot.ALDER_LOG.get())
                .unlockedBy("has_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocksNoDatagenLoot.ALDER_LOG.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.ALDER_STAIRS.get())
                .define('A', VHBlocks.ALDER_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.ALDER_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.ALDER_SLAB.get(), 6)
                .define('A', VHBlocks.ALDER_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.ALDER_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.ALDER_FENCE.get(), 3)
                .define('A', VHBlocks.ALDER_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.ALDER_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.ALDER_FENCE_GATE.get())
                .define('A', VHBlocks.ALDER_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.ALDER_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.BIRCH_PLANKS, 4)
                .requires(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get())
                .unlockedBy("has_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocksNoDatagenLoot.SAPPY_BIRCH_LOG.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

    }
}