package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.item.ModItems;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, wegetthere.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SEBONITE.get());
        basicItem(ModItems.RAW_SEBONITE.get());

        basicItem(ModItems.CRISPY_SOIL.get());
        basicItem(ModItems.BURNED_SOIL.get());


        fenceItem(ModBlocks.SEB_FENCE, ModBlocks.SEBONITE_BLOCK);
        wallItem(ModBlocks.SEB_WALL, ModBlocks.SEBONITE_BLOCK);
        buttonItem(ModBlocks.SEB_BUTTON, ModBlocks.SEBONITE_BLOCK);

        simpleBlockItem(ModBlocks.SEB_DOOR);

        handheldItem(ModItems.SEB_SWORD);
        handheldItem(ModItems.SEB_PICKAXE);
        handheldItem(ModItems.SEB_SHOVEL);
        handheldItem(ModItems.SEB_AXE);
        handheldItem(ModItems.SEB_HOE);
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID,"item/" + item.getId().getPath()));
    }
}
