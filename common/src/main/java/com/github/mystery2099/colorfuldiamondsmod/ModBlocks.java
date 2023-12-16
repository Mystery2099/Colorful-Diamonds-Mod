package com.github.mystery2099.colorfuldiamondsmod;

import com.github.mystery2099.colorfuldiamondsmod.item.ModItems;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, Registry.BLOCK_KEY);
    public static final RegistrySupplier<Block> WHITE_DIAMOND_BLOCK = register(DyeColor.WHITE);
    public static final RegistrySupplier<Block> ORANGE_DIAMOND_BLOCK = register(DyeColor.ORANGE);
    public static final RegistrySupplier<Block> MAGENTA_DIAMOND_BLOCK = register(DyeColor.MAGENTA);
    public static final RegistrySupplier<Block> LIGHT_BLUE_DIAMOND_BLOCK = register(DyeColor.LIGHT_BLUE);
    public static final RegistrySupplier<Block> YELLOW_DIAMOND_BLOCK = register(DyeColor.YELLOW);
    public static final RegistrySupplier<Block> LIME_DIAMOND_BLOCK = register(DyeColor.LIME);
    public static final RegistrySupplier<Block> PINK_DIAMOND_BLOCK = register(DyeColor.PINK);
    public static final RegistrySupplier<Block> GRAY_DIAMOND_BLOCK = register(DyeColor.GRAY);
    public static final RegistrySupplier<Block> LIGHT_GRAY_DIAMOND_BLOCK = register(DyeColor.LIGHT_GRAY);
    public static final RegistrySupplier<Block> CYAN_DIAMOND_BLOCK = register(DyeColor.CYAN);
    public static final RegistrySupplier<Block> PURPLE_DIAMOND_BLOCK = register(DyeColor.PURPLE);
    public static final RegistrySupplier<Block> BLUE_DIAMOND_BLOCK = register(DyeColor.BLUE);
    public static final RegistrySupplier<Block> BROWN_DIAMOND_BLOCK = register(DyeColor.BROWN);
    public static final RegistrySupplier<Block> GREEN_DIAMOND_BLOCK = register(DyeColor.GREEN);
    public static final RegistrySupplier<Block> RED_DIAMOND_BLOCK = register(DyeColor.RED);
    public static final RegistrySupplier<Block> BLACK_DIAMOND_BLOCK = register(DyeColor.BLACK);
    private static RegistrySupplier<Block> register(DyeColor color) {
        var location = new Identifier(ColorfulDiamondsMod.MOD_ID, color.toString().toLowerCase() + "_diamond_block");
        var block = BLOCKS.register(location, () -> new Block(AbstractBlock.Settings.of(Material.METAL, color).requiresTool()));
        ModItems.ITEMS.register(location, () -> new BlockItem(block.get(), new Item.Settings().group(ColorfulDiamondsMod.DEFAULT_ITEM_GROUP)));
        return block;
    }
}
