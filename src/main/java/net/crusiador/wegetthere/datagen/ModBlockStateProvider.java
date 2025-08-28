package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Makes the .json files for the textures for the Blocks.
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

        blockWithItem(ModBlocks.SEBONITE_BLOCK);
        blockWithItem(ModBlocks.SEB_LUCKY_BLOCK);

        blockWithItem(ModBlocks.SOIL);

        blockWithItem(ModBlocks.SEBFORMER);

        blockWithItem(ModBlocks.SEB_LOG);
        blockWithItem(ModBlocks.SEB_PLANK);


        stairsBlock(ModBlocks.SEB_STAIRS.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));
        slabBlock(ModBlocks.SEB_SLAB.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));

        buttonBlock(ModBlocks.SEB_BUTTON.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));
        pressurePlateBlock(ModBlocks.SEB_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));

        fenceBlock(ModBlocks.SEB_FENCE.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));
        fenceGateBlock(ModBlocks.SEB_FENCE_GATE.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));
        wallBlock(ModBlocks.SEB_WALL.get(), blockTexture(ModBlocks.SEBONITE_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.SEB_DOOR.get(), modLoc("block/seb_door_bottom"), modLoc("block/seb_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SEB_TRAPDOOR.get(), modLoc("block/seb_trapdoor"), true, "cutout");

        blockItem(ModBlocks.SEB_STAIRS);
        blockItem(ModBlocks.SEB_SLAB);
        blockItem(ModBlocks.SEB_PRESSURE_PLATE);
        blockItem(ModBlocks.SEB_FENCE_GATE);
        blockItem(ModBlocks.SEB_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("wegetthere:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("wegetthere:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
