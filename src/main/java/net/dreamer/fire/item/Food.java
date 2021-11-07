package net.dreamer.fire.item;

import net.minecraft.item.FoodComponent;

public class Food {

    public static final FoodComponent FIRE = (new FoodComponent.Builder()).hunger(1).saturationModifier(.1f).alwaysEdible().build();

    public static final FoodComponent SOUL_FIRE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.2f).alwaysEdible().build();
}
