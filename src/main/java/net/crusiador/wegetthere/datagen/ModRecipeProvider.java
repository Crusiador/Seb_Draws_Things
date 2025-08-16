package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.item.ModItems;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> SEB_SMELTABLES = List.of(ModItems.RAW_SEBONITE.get(),
                ModBlocks.SEBONITE_ORE.get(), ModBlocks.SEBONITE_DEEPSLATE_ORE.get());

        List<ItemLike> SEB_SOIL = List.of(ModBlocks.SOIL.get());
        List<ItemLike> SEB_SOILER = List.of(ModItems.CRISPY_SOIL.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEBONITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SEBONITE.get())
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEBFORMER.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.DIAMOND)
                .define('B', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SEBONITE.get(),9)
                .requires(ModBlocks.SEBONITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SEBONITE_BLOCK.get()), has(ModBlocks.SEBONITE_BLOCK.get())).save(pRecipeOutput);


        oreSmelting(pRecipeOutput, SEB_SMELTABLES, RecipeCategory.MISC, ModItems.SEBONITE.get(),0.25f,200,"sebonite");
        oreBlasting(pRecipeOutput, SEB_SMELTABLES, RecipeCategory.MISC, ModItems.SEBONITE.get(),0.25f,100,"sebonite");

        oreSmelting(pRecipeOutput, SEB_SOIL, RecipeCategory.MISC, ModItems.CRISPY_SOIL.get(),0.25f,200,"crispy_soil");

        oreSmelting(pRecipeOutput, SEB_SOILER, RecipeCategory.MISC, ModItems.BURNED_SOIL.get(),0.25f,200,"burned_soil");

        stairBuilder(ModBlocks.SEB_STAIRS.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEB_SLAB.get(), ModItems.SEBONITE.get());

        buttonBuilder(ModBlocks.SEB_BUTTON.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.SEB_PRESSURE_PLATE.get(), ModItems.SEBONITE.get());

        fenceBuilder(ModBlocks.SEB_FENCE.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.SEB_FENCE_GATE.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEB_WALL.get(), ModItems.SEBONITE.get());

        doorBuilder(ModBlocks.SEB_DOOR.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.SEB_TRAPDOOR.get(), Ingredient.of(ModItems.SEBONITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.SEBONITE.get()), has(ModItems.SEBONITE.get())).save(pRecipeOutput);




    }




    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, wegetthere.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

