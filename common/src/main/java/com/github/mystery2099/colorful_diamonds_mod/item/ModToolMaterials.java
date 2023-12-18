package com.github.mystery2099.colorful_diamonds_mod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WHITE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(0).get())),
    ORANGE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(1).get())),
    MAGENTA_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(2).get())),
    LIGHT_BLUE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(3).get())),
    YELLOW_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(4).get())),
    LIME_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(5).get())),
    PINK_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(6).get())),
    GRAY_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(7).get())),
    LIGHT_GRAY_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(8).get())),
    CYAN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(9).get())),
    PURPLE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(10).get())),
    BLUE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(11).get())),
    BROWN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(12).get())),
    GREEN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(13).get())),
    RED_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(14).get())),
    BLACK_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(15).get()));
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(Supplier<Ingredient> repairIngredient) {
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return 1561;
    }

    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    public float getAttackDamage() {
        return 3.0F;
    }

    public int getMiningLevel() {
        return 3;
    }

    public int getEnchantability() {
        return 10;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
