package com.github.mystery2099.colorful_diamonds_mod.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial  {

    WHITE_DIAMOND("white_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(0).get(), Items.DIAMOND)),
    ORANGE_DIAMOND("orange_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(1).get(), Items.DIAMOND)),
    MAGENTA_DIAMOND("magenta_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(2).get(), Items.DIAMOND)),
    LIGHT_BLUE_DIAMOND("light_blue_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(3).get(), Items.DIAMOND)),
    YELLOW_DIAMOND("yellow_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(4).get(), Items.DIAMOND)),
    LIME_DIAMOND("lime_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(5).get(), Items.DIAMOND)),
    PINK_DIAMOND("pink_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(6).get(), Items.DIAMOND)),
    GRAY_DIAMOND("gray_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(7).get(), Items.DIAMOND)),
    LIGHT_GRAY_DIAMOND("light_gray_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(8).get(), Items.DIAMOND)),
    CYAN_DIAMOND("cyan_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(9).get(), Items.DIAMOND)),
    PURPLE_DIAMOND("purple_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(10).get(), Items.DIAMOND)),
    BLUE_DIAMOND("blue_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(11).get(), Items.DIAMOND)),
    BROWN_DIAMOND("brown_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(12).get(), Items.DIAMOND)),
    GREEN_DIAMOND("green_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(13).get(), Items.DIAMOND)),
    RED_DIAMOND("red_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(14).get(), Items.DIAMOND)),
    BLACK_DIAMOND("black_diamond", () -> Ingredient.ofItems(ModItems.GEMS.get(15).get(), Items.DIAMOND));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int[] protectionAmounts = new int[]{3, 6, 8, 3};
    private final Supplier<Ingredient> repairIngredientSupplier;

    ModArmorMaterials(String name, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 33;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return 10;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return 2.0F;
    }

    public float getKnockbackResistance() {
        return 0.0F;
    }
}
