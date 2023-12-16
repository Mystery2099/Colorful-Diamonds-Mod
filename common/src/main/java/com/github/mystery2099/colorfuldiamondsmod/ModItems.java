package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> WHITE_DIAMOND = gem(DyeColor.WHITE);
    public static final RegistrySupplier<Item> ORANGE_DIAMOND = gem(DyeColor.ORANGE);
    public static final RegistrySupplier<Item> MAGENTA_DIAMOND = gem(DyeColor.MAGENTA);
    public static final RegistrySupplier<Item> LIGHT_BLUE_DIAMOND = gem(DyeColor.LIGHT_BLUE);
    public static final RegistrySupplier<Item> YELLOW_DIAMOND = gem(DyeColor.YELLOW);
    public static final RegistrySupplier<Item> LIME_DIAMOND = gem(DyeColor.LIME);
    public static final RegistrySupplier<Item> PINK_DIAMOND = gem(DyeColor.PINK);
    public static final RegistrySupplier<Item> GRAY_DIAMOND = gem(DyeColor.GRAY);
    public static final RegistrySupplier<Item> LIGHT_GRAY_DIAMOND = gem(DyeColor.LIGHT_GRAY);
    public static final RegistrySupplier<Item> CYAN_DIAMOND = gem(DyeColor.CYAN);
    public static final RegistrySupplier<Item> PURPLE_DIAMOND = gem(DyeColor.PURPLE);
    public static final RegistrySupplier<Item> BLUE_DIAMOND = gem(DyeColor.BLUE);
    public static final RegistrySupplier<Item> BROWN_DIAMOND = gem(DyeColor.BROWN);
    public static final RegistrySupplier<Item> GREEN_DIAMOND = gem(DyeColor.GREEN);
    public static final RegistrySupplier<Item> RED_DIAMOND = gem(DyeColor.RED);
    public static final RegistrySupplier<Item> BLACK_DIAMOND = gem(DyeColor.BLACK);
    private static RegistrySupplier<Item> gem(DyeColor color) {
        return register(color.toString().toLowerCase() + "_diamond", new Item.Settings().group(ColorfulDiamondsMod.ITEM_TAB));
    }
    private static RegistrySupplier<Item> register(String id, Item.Settings properties) {
        return ITEMS.register(new Identifier(ColorfulDiamondsMod.MOD_ID, id), () -> new Item(properties));
    }
}
