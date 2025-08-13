package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, wegetthere.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.S1);
        blockWithItem(ModBlocks.S2);
        blockWithItem(ModBlocks.S3);
        blockWithItem(ModBlocks.S4);
        blockWithItem(ModBlocks.S5);
        blockWithItem(ModBlocks.S6);
        blockWithItem(ModBlocks.S7);
        blockWithItem(ModBlocks.S8);
        blockWithItem(ModBlocks.S9);
        blockWithItem(ModBlocks.S10);
        blockWithItem(ModBlocks.S11);
        blockWithItem(ModBlocks.S12);
        blockWithItem(ModBlocks.S13);
        blockWithItem(ModBlocks.S14);
        blockWithItem(ModBlocks.S15);
        blockWithItem(ModBlocks.S16);
        blockWithItem(ModBlocks.S17);
        blockWithItem(ModBlocks.S18);
        blockWithItem(ModBlocks.S19);
        blockWithItem(ModBlocks.S20);
        blockWithItem(ModBlocks.S21);
        blockWithItem(ModBlocks.S22);
        blockWithItem(ModBlocks.S23);
        blockWithItem(ModBlocks.S24);
        blockWithItem(ModBlocks.S25);

        blockWithItem(ModBlocks.SHREK);
        blockWithItem(ModBlocks.PY);
        blockWithItem(ModBlocks.COW);
        blockWithItem(ModBlocks.PUY);

        blockWithItem(ModBlocks.SEBONITE_ORE);
        blockWithItem(ModBlocks.SEBONITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.SEBONITE_BLOCK);
        blockWithItem(ModBlocks.SEB_LUCKY_BLOCK);


    }

    private void blockWithItem(RegistryObject<Block>blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
