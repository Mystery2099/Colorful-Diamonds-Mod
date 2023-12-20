package com.github.mystery2099.colorfuldiamondsmod.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WHITE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(0).get(), Items.DIAMOND)),
    ORANGE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(1).get(), Items.DIAMOND)),
    MAGENTA_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(2).get(), Items.DIAMOND)),
    LIGHT_BLUE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(3).get(), Items.DIAMOND)),
    YELLOW_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(4).get(), Items.DIAMOND)),
    LIME_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(5).get(), Items.DIAMOND)),
    PINK_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(6).get(), Items.DIAMOND)),
    GRAY_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(7).get(), Items.DIAMOND)),
    LIGHT_GRAY_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(8).get(), Items.DIAMOND)),
    CYAN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(9).get(), Items.DIAMOND)),
    PURPLE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(10).get(), Items.DIAMOND)),
    BLUE_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(11).get(), Items.DIAMOND)),
    BROWN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(12).get(), Items.DIAMOND)),
    GREEN_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(13).get(), Items.DIAMOND)),
    RED_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(14).get(), Items.DIAMOND)),
    BLACK_DIAMOND(() -> Ingredient.ofItems(ModItems.GEMS.get(15).get(), Items.DIAMOND));
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
