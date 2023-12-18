package com.github.mystery2099.colorful_diamonds_mod;

import com.github.mystery2099.colorful_diamonds_mod.item.ModItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ColorfulDiamondsMod {
    public static final String MOD_ID = "colorful_diamonds_mod";
    public static final ItemGroup DEFAULT_ITEM_GROUP = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "default"), () ->
            new ItemStack(ModItems.GEMS.get(0).get()));
    public static final ItemGroup COMBAT_ITEM_GROUP = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "combat"), () ->
            new ItemStack(ModItems.ARMOR.get(0).get()));
    public static void init() {
        ModBlocks.BLOCKS.register();
        ModItems.ITEMS.register();

    }
}
