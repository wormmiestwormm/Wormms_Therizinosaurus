package com.wormm.wormmstheri.util;

import com.wormm.wormmstheri.WormmsTheri;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_THERI_TOOL = createTag("needs_theri_tool");
        public static final TagKey<Block> INCORRECT_FOR_THERI_TOOL = createTag("incorrect_for_theri_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(WormmsTheri.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath((WormmsTheri.MOD_ID), name));
        }
    }
}
