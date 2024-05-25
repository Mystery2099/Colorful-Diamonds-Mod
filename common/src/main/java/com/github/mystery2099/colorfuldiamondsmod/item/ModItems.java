package com.github.mystery2099.colorfuldiamondsmod.item;

import com.github.mystery2099.colorfuldiamondsmod.ColorfulDiamondsMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, RegistryKeys.ITEM);
    public static final List<RegistrySupplier<Item>> GEMS = new ArrayList<>();
    public static final List<RegistrySupplier<Item>> TOOLS = new ArrayList<>();
    public static final List<RegistrySupplier<Item>> WEAPONS = new ArrayList<>();
    public static final List<RegistrySupplier<Item>> ARMOR = new ArrayList<>();
    static {
        for (var color : DyeColor.values()) {
            GEMS.add(gem(color));
        }
        for (var material : ModToolMaterials.values()) {
            registerToolSet(material);
        }
        for (var material : ModArmorMaterials.values()) {
            ARMOR.addAll(registerArmorSet(material));
        }
    }

    private static RegistrySupplier<Item> gem(DyeColor color) {
        return register(color.toString().toLowerCase() + "_diamond", () -> new Item(new Item.Settings().arch$tab(ColorfulDiamondsMod.DEFAULT_ITEM_GROUP)));
    }

    private static List<RegistrySupplier<Item>> registerArmorSet(ArmorMaterial material) {
        var materialName = material.getName();
        var settings = new Item.Settings().arch$tab(ColorfulDiamondsMod.COMBAT_ITEM_GROUP);
        return List.of(
            register(materialName+"_helmet", () -> new ArmorItem(material, ArmorItem.Type.HELMET, settings)),
            register(materialName+"_chestplate", () -> new ArmorItem(material, ArmorItem.Type.CHESTPLATE, settings)),
            register(materialName+"_leggings", () -> new ArmorItem(material, ArmorItem.Type.LEGGINGS, settings)),
            register(materialName+"_boots", () -> new ArmorItem(material, ArmorItem.Type.BOOTS, settings))
        );
    }

    private static void registerToolSet(ToolMaterial material) {
        var materialName = material.toString().toLowerCase();

        WEAPONS.add(register(materialName+"_sword", () -> new SwordItem(material, 3, -2.4F, new Item.Settings().arch$tab(ColorfulDiamondsMod.COMBAT_ITEM_GROUP))));

        var toolSettings = new Item.Settings().arch$tab(ColorfulDiamondsMod.TOOL_ITEM_GROUP);
        var tools = List.of(
                register(materialName+"_shovel", () -> new ShovelItem(material, 1.5F, -3.0F, toolSettings)),
                register(materialName+"_pickaxe", () -> new PickaxeItem(material, 1, -2.8F, toolSettings)),
                register(materialName+"_axe", () -> new AxeItem(material, 5.0F, -3.0F, toolSettings)),
                register(materialName+"_hoe", () -> new HoeItem(material, -3, 0.0F, toolSettings))
        );
        TOOLS.addAll(tools);
    }


    private static RegistrySupplier<Item> register(String id, Supplier<Item> item) {
        return ITEMS.register(new Identifier(ColorfulDiamondsMod.MOD_ID, id), item);
    }
}
