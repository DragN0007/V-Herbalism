package com.dragn0007.vherbalism.blocks;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.crop.BindweedCrop;
import com.dragn0007.vherbalism.blocks.crop.BlackberryBush;
import com.dragn0007.vherbalism.blocks.crop.BorageCrop;
import com.dragn0007.vherbalism.blocks.crop.Scent;
import com.dragn0007.vherbalism.items.VHItems;
import com.dragn0007.vherbalism.world.tree.AlderTreeGrower;
import com.dragn0007.vherbalism.world.tree.SappyBirchTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;

public class VHBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Herbalism.MODID);

    public static final RegistryObject<Block> BLACKBERRY_BUSH = registerBlockWithoutItem("blackberry_bush",
            () -> new BlackberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> BINDWEED = registerBlockWithoutItem("bindweed",
            () -> new BindweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BINDWEED = registerBlockWithoutItem("wild_bindweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BORAGE = registerBlockWithoutItem("borage",
            () -> new BorageCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BORAGE = registerBlockWithoutItem("wild_borage",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SAPPY_BIRCH_SAPLING = registerBlock("sappy_birch_sapling",
            () -> new SaplingBlock(new SappyBirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING)));

    public static final RegistryObject<Block> ALDER_LEAVES = registerBlock("alder_leaves",
            () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> ALDER_PLANKS = registerBlock("alder_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_STAIRS = registerBlock("alder_stairs",
            () -> new StairBlock(ALDER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_SLAB = registerBlock("alder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ALDER_PLANKS.get())));
    public static final RegistryObject<Block> ALDER_SAPLING = registerBlock("alder_sapling",
            () -> new SaplingBlock(new AlderTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ALDER_FENCE = registerBlock("alder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_FENCE_GATE = registerBlock("alder_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> KITTYPET_SCENT = registerBlock("kittypet_scent", Scent::new);
    public static final RegistryObject<Block> LONER_SCENT = registerBlock("loner_scent", Scent::new);
    public static final RegistryObject<Block> MEDIATOR_SCENT = registerBlock("mediator_scent", Scent::new);
    public static final RegistryObject<Block> ROGUE_SCENT = registerBlock("rogue_scent", Scent::new);
    public static final RegistryObject<Block> SHARP_SCENT = registerBlock("sharp_scent", Scent::new);
    public static final RegistryObject<Block> WHARF_SCENT = registerBlock("wharf_scent", Scent::new);
    public static final RegistryObject<Block> WHISTLE_SCENT = registerBlock("whistle_scent", Scent::new);

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        VHItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
