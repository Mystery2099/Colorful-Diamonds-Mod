package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static net.minecraft.core.Registry.ITEM_REGISTRY;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, ITEM_REGISTRY);
    public static final RegistrySupplier<Item> WHITE_DIAMOND = register("white_diamond", new Item.Properties().tab(ColorfulDiamondsMod.ITEM_TAB));

    private static RegistrySupplier<Item> register(String id, Item.Properties properties) {
        return ITEMS.register(new ResourceLocation(ColorfulDiamondsMod.MOD_ID, id), () -> new Item(properties));
    }
}
