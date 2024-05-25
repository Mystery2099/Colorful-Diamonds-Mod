package com.github.mystery2099.colorfuldiamondsmod;

import com.github.mystery2099.colorfuldiamondsmod.item.ModItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ColorfulDiamondsMod {
    public static final String MOD_ID = "colorfuldiamondsmod";
    public static final CreativeTabRegistry.TabSupplier DEFAULT_ITEM_GROUP = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "default"), () ->
            new ItemStack(ModItems.GEMS.get(0).get()));
    public static final CreativeTabRegistry.TabSupplier TOOL_ITEM_GROUP = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "tools"), () ->
            new ItemStack(ModItems.TOOLS.get(0).get()));
    public static final CreativeTabRegistry.TabSupplier COMBAT_ITEM_GROUP = CreativeTabRegistry.create(new Identifier(ColorfulDiamondsMod.MOD_ID, "combat"), () ->
            new ItemStack(ModItems.WEAPONS.get(0).get()));

    public static void init() {
        ModBlocks.BLOCKS.register();
        ModItems.ITEMS.register();
    }
}
