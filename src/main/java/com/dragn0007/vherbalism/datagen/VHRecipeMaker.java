package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.VHBlocks;
import com.dragn0007.vherbalism.blocks.VHBlocksNoDatagenLoot;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class VHRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public VHRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CHARCOAL, 4)
                .requires(VHBlocksNoDatagenLoot.CHARCOAL_LOG.get())
                .unlockedBy("has_charcoal_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocksNoDatagenLoot.CHARCOAL_LOG.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.CHARCOAL_CHUNK.get(), 3)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_charcoal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHARCOAL)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.COAL_CHUNK.get(), 3)
                .requires(Items.COAL)
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COAL)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.MUDBALL.get(), 4)
                .requires(Items.MUD)
                .unlockedBy("has_mud", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MUD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.SAND_CLUMP.get(), 4)
                .requires(Items.SAND)
                .unlockedBy("has_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SAND)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.SNAKEROOT_PETALS.get())
                .requires(VHItems.SNAKEROOT_BUNDLE.get())
                .requires(Items.SUGAR)
                .requires(Items.SUGAR)
                .unlockedBy("has_snakeroot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.SNAKEROOT_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "snakeroot_petals_from_sugar"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.SNAKEROOT_PETALS.get())
                .requires(VHItems.SNAKEROOT_BUNDLE.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_snakeroot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.SNAKEROOT_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "snakeroot_petals_from_honey"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.SNAKEROOT_PETALS.get())
                .requires(VHItems.SNAKEROOT_BUNDLE.get())
                .requires(VHItems.COOKED_WILLOW.get())
                .unlockedBy("has_snakeroot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.SNAKEROOT_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "snakeroot_petals_from_willow"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.DEATHBERRY_SEEDS.get())
                .requires(VHItems.DEATHBERRY.get())
                .requires(VHItems.DEATHBERRY.get())
                .unlockedBy("has_deathberry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.DEATHBERRY.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(VHItems.WILLOW_BUNDLE.get()), RecipeCategory.MISC, VHItems.COOKED_WILLOW.get(), 0.35F, 100)
                .unlockedBy("has_willow", has(VHItems.WILLOW_BUNDLE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "cooked_willow_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(VHItems.WILLOW_BUNDLE.get()), RecipeCategory.MISC, VHItems.COOKED_WILLOW.get(), 0.35F, 200)
                .unlockedBy("has_willow", has(VHItems.WILLOW_BUNDLE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "cooked_willow_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(VHItems.WILLOW_BUNDLE.get()), RecipeCategory.MISC, VHItems.COOKED_WILLOW.get(), 0.35F, 600)
                .unlockedBy("has_willow", has(VHItems.WILLOW_BUNDLE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "cooked_willow_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 2)
                .requires(VHItems.COOKED_WILLOW.get())
                .unlockedBy("has_willow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.COOKED_WILLOW.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "sugar_from_willow"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.WINTERGREEN_LEAF_POULTICE.get())
                .requires(VHItems.WINTERGREEN_LEAVES.get())
                .requires(VHItems.WINTERGREEN_LEAVES.get())
                .requires(VHItems.CATCHWEED_BUNDLE.get())
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_wintergreen_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.WINTERGREEN_LEAVES.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.WOOD_SORREL_POULTICE.get())
                .requires(VHItems.WOOD_SORREL_LEAF.get())
                .requires(VHItems.WOOD_SORREL_LEAF.get())
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_wood_sorrel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.WOOD_SORREL_LEAF.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.POPPY_SEEDS.get(), 3)
                .requires(Blocks.POPPY)
                .unlockedBy("has_poppy", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.POPPY)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHBlocks.PREPARED_OAK_LEAVES.get())
                .requires(Blocks.OAK_LEAVES)
                .unlockedBy("has_oak_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OAK_LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.MOSS_CLUMP.get(), 2)
                .requires(Blocks.MOSS_CARPET)
                .unlockedBy("has_moss", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.MOSS_CARPET)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "moss_clump_from_carpet"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.MOSS_CLUMP.get(), 3)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_moss", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.MOSS_BLOCK)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "moss_clump_from_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.MARIGOLD_POULTICE.get())
                .requires(VHItems.MARIGOLD_BUNDLE.get())
                .requires(VHItems.MARIGOLD_BUNDLE.get())
                .unlockedBy("has_marigold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.MARIGOLD_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.BRIGHT_EYE_LOVAGE_POULTICE.get())
                .requires(VHItems.BRIGHT_EYE_BUNDLE.get())
                .requires(VHItems.LOVAGE_BUNDLE.get())
                .unlockedBy("has_bright_eye", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.BRIGHT_EYE_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.TOPICAL_POULTICE.get())
                .requires(VHItems.JUNIPERBERRY.get())
                .requires(VHItems.JUNIPERBERRY.get())
                .requires(VHItems.DAISY_LEAVES.get())
                .unlockedBy("has_juniper", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.JUNIPERBERRY.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.HORSETAIL_POULTICE.get())
                .requires(VHItems.HORSETAIL_BUNDLE.get())
                .requires(VHItems.HORSETAIL_BUNDLE.get())
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_horsetail", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.HORSETAIL_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.GOLDENROD_POULTICE.get())
                .requires(VHItems.GOLDENROD_BUNDLE.get())
                .requires(VHItems.GOLDENROD_BUNDLE.get())
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_goldenrod", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.GOLDENROD_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.ELDERBERRY_LEAF_POULTICE.get())
                .requires(VHItems.ELDERBERRY_LEAVES.get())
                .requires(VHItems.ELDERBERRY_LEAVES.get())
                .requires(VHItems.CATCHWEED_BUNDLE.get())
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_elderberry_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.ELDERBERRY_LEAVES.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.DANDELION_ROOT.get(), 2)
                .requires(Items.DANDELION)
                .requires(Items.DANDELION)
                .unlockedBy("has_dandelion", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DANDELION)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.DANDELION_LEAVES.get(), 2)
                .requires(Items.DANDELION)
                .unlockedBy("has_dandelion", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DANDELION)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.DAISY_LEAVES.get(), 2)
                .requires(Items.OXEYE_DAISY)
                .unlockedBy("has_daisy", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OXEYE_DAISY)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.COBWEB.get())
                .requires(Items.STICK)
                .requires(Items.STRING)
                .requires(Items.STRING)
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "cobweb_string"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.COBWEB.get())
                .requires(Items.STICK)
                .requires(Blocks.COBWEB)
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(Herbalism.MODID, "cobweb_cobweb"));

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
                .requires(VHItems.COBWEB.get())
                .unlockedBy("has_broom_bundle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHItems.BROOM_BUNDLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHItems.BLACKBERRY_LEAF_POULTICE.get())
                .requires(VHItems.BLACKBERRY_LEAVES.get())
                .requires(VHItems.BLACKBERRY_LEAVES.get())
                .requires(VHItems.CATCHWEED_BUNDLE.get())
                .requires(VHItems.COBWEB.get())
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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VHBlocks.WILLOW_PLANKS.get(), 4)
                .requires(VHBlocksNoDatagenLoot.WILLOW_LOG.get())
                .unlockedBy("has_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocksNoDatagenLoot.WILLOW_LOG.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.WILLOW_STAIRS.get())
                .define('A', VHBlocks.WILLOW_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.WILLOW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.WILLOW_SLAB.get(), 6)
                .define('A', VHBlocks.WILLOW_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.WILLOW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.WILLOW_FENCE.get(), 3)
                .define('A', VHBlocks.WILLOW_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.WILLOW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VHBlocks.WILLOW_FENCE_GATE.get())
                .define('A', VHBlocks.WILLOW_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(VHBlocks.WILLOW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

    }
}