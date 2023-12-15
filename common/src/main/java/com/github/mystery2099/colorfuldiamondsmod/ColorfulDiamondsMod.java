package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ColorfulDiamondsMod {
    public static final String MOD_ID = "colorful_diamonds_mod";
    public static final CreativeModeTab BLOCK_TAB = CreativeTabRegistry.create(new ResourceLocation(ColorfulDiamondsMod.MOD_ID, "blocks"), () ->
            new ItemStack(Blocks.WHITE_DIAMOND_BLOCK.get().asItem()));
    public static final CreativeModeTab ITEM_TAB = CreativeTabRegistry.create(new ResourceLocation(ColorfulDiamondsMod.MOD_ID, "items"), () ->
            new ItemStack(Items.WHITE_DIAMOND.get().asItem()));
    public static void init() {
        Blocks.BLOCKS.register();
        Items.ITEMS.register();
    }
}
