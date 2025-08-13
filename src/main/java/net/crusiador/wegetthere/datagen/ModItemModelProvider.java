package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.item.ModItems;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, wegetthere.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SEBONITE.get());
        basicItem(ModItems.RAW_SEBONITE.get());



    }
}
