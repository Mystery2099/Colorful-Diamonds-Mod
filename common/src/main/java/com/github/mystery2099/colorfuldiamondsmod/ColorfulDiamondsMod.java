package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ColorfulDiamondsMod {
    public static final String MOD_ID = "colorful_diamonds_mod";
    public static final ItemGroup BLOCK_TAB = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "blocks"), () ->
            new ItemStack(ModBlocks.WHITE_DIAMOND_BLOCK.get().asItem()));
    public static final ItemGroup ITEM_TAB = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "items"), () ->
            new ItemStack(ModItems.WHITE_DIAMOND.get().asItem()));
    public static void init() {
        ModBlocks.BLOCKS.register();
        ModItems.ITEMS.register();
    }
}
