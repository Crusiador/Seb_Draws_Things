package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.util.ModTags;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

// Makes the Tags like what is mine able with what tool.
public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, wegetthere.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SEBONITE_ORE.get())

                .add(ModBlocks.SEB_STAIRS.get())
                .add(ModBlocks.SEB_SLAB.get())

                .add(ModBlocks.SEB_PRESSURE_PLATE.get())
                .add(ModBlocks.SEB_BUTTON.get())

                .add(ModBlocks.SEB_FENCE.get())
                .add(ModBlocks.SEB_FENCE_GATE.get())
                .add(ModBlocks.SEB_WALL.get())

                .add(ModBlocks.SEB_DOOR.get())
                .add(ModBlocks.SEB_TRAPDOOR.get());




        tag(BlockTags.NEEDS_IRON_TOOL);


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SEBONITE_ORE.get())

                .add(ModBlocks.SEB_STAIRS.get())
                .add(ModBlocks.SEB_SLAB.get())

                .add(ModBlocks.SEB_PRESSURE_PLATE.get())
                .add(ModBlocks.SEB_BUTTON.get())

                .add(ModBlocks.SEB_FENCE.get())
                .add(ModBlocks.SEB_FENCE_GATE.get())
                .add(ModBlocks.SEB_WALL.get())

                .add(ModBlocks.SEB_DOOR.get())
                .add(ModBlocks.SEB_TRAPDOOR.get());



        tag(BlockTags.FENCES).add(ModBlocks.SEB_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SEB_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SEB_WALL.get());


        tag(ModTags.Blocks.NEEDS_SEB_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_SEB_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_SEB_TOOL);
    }
}
