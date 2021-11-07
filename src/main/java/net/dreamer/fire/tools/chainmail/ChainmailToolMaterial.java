package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ChainmailToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5;
    }

    @Override
    public float getAttackDamage() {
        return 0.5F;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}