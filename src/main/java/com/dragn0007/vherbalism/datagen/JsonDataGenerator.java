package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.datagen.biglooter.VHLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Herbalism.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new VHRecipeMaker(packOutput));
        generator.addProvider(event.includeServer(), VHLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new VHBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new VHItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new VHWorldGenerator(packOutput, lookupProvider));
    }
}
