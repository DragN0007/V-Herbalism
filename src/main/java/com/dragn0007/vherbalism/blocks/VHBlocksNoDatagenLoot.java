package com.dragn0007.vherbalism.blocks;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.items.VHItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class VHBlocksNoDatagenLoot {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Herbalism.MODID);

    public static final RegistryObject<RotatedPillarBlock> SAPPY_BIRCH_LOG = registerBlock("sappy_birch_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)));
    public static final RegistryObject<RotatedPillarBlock> ALDER_LOG = registerBlock("alder_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> WILLOW_LOG = registerBlock("willow_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

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
