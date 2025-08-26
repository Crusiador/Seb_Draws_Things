package net.crusiador.wegetthere.item.custom;

import net.crusiador.wegetthere.item.ModItems;
import net.crusiador.wegetthere.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;


// Registers the stats for the tools.
public class ModToolTiers {
    public static final Tier SEB = new ForgeTier(2300, 10,4f, 20,
            ModTags.Blocks.NEEDS_SEB_TOOL, () -> Ingredient.of(ModItems.SEBONITE.get()),
            ModTags.Blocks.INCORRECT_FOR_SEB_TOOL);
}
