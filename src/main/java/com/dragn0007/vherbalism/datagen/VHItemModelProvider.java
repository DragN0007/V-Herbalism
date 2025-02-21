package com.dragn0007.vherbalism.datagen;

import com.dragn0007.vherbalism.Herbalism;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class VHItemModelProvider extends ItemModelProvider {
    public VHItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Herbalism.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {

    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Herbalism.MODID,"item/" + item.getId().getPath()));
    }

    public ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Herbalism.MODID,"item/" + getTextureName));
    }
}