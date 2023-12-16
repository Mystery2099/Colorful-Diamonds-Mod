package com.github.mystery2099.colorfuldiamondsmod.item;

import com.github.mystery2099.colorfuldiamondsmod.ColorfulDiamondsMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, Registry.ITEM_KEY);
    public static final List<RegistrySupplier<Item>> GEMS = new ArrayList<>();
    public static final List<RegistrySupplier<Item>> ARMOR = new ArrayList<>();
    static {
        for (var color : DyeColor.values()) {
            GEMS.add(gem(color));
        }

        for (var material : ModArmorMaterials.values()) {
            registerArmorSet(material);
        }
    }

    private static void registerArmorSet(ArmorMaterial material) {
        ARMOR.addAll(
            List.of(
                register(material.getName()+"_helmet", () -> new ArmorItem(material, EquipmentSlot.HEAD, new Item.Settings().group(ColorfulDiamondsMod.COMBAT_ITEM_GROUP))),
                register(material.getName()+"_chestplate", () -> new ArmorItem(material, EquipmentSlot.CHEST, new Item.Settings().group(ColorfulDiamondsMod.COMBAT_ITEM_GROUP))),
                register(material.getName()+"_leggings", () -> new ArmorItem(material, EquipmentSlot.LEGS, new Item.Settings().group(ColorfulDiamondsMod.COMBAT_ITEM_GROUP))),
                register(material.getName()+"_boots", () -> new ArmorItem(material, EquipmentSlot.FEET, new Item.Settings().group(ColorfulDiamondsMod.COMBAT_ITEM_GROUP)))
            )
        );

    }

    private static RegistrySupplier<Item> gem(DyeColor color) {
        return register(color.toString().toLowerCase() + "_diamond", () -> new Item(new Item.Settings().group(ColorfulDiamondsMod.DEFAULT_ITEM_GROUP)));
    }
    private static RegistrySupplier<Item> register(String id, Supplier<Item> item) {
        return ITEMS.register(new Identifier(ColorfulDiamondsMod.MOD_ID, id), item);
    }
}
