package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static net.minecraft.core.Registry.BLOCK_REGISTRY;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, BLOCK_REGISTRY);
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
        var location = new ResourceLocation(ColorfulDiamondsMod.MOD_ID, color.toString().toLowerCase() + "_diamond_block");
        var block = BLOCKS.register(location, () -> new Block(BlockBehaviour.Properties.of(Material.METAL, color).requiresCorrectToolForDrops()));
        ModItems.ITEMS.register(location, () -> new BlockItem(block.get(), new Item.Properties().tab(ColorfulDiamondsMod.BLOCK_TAB)));
        return block;
    }
}
