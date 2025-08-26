package net.crusiador.wegetthere.util;

import net.crusiador.wegetthere.wegetthere;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


// Makes Tags to tag different Items like Tools.
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SEB_TOOL = createTag("needs_seb_tool");
        public static final TagKey<Block> INCORRECT_FOR_SEB_TOOL = createTag("incorrect_for_seb_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID, name));
        }
    }


    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(wegetthere.MOD_ID, name));
        }
    }
}