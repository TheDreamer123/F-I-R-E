package net.dreamer.fire;

import net.dreamer.fire.mixin.AccessDamageSource;
import net.minecraft.entity.damage.DamageSource;

public class Damage {

    public static final DamageSource EAT_FIRE = ((AccessDamageSource)((AccessDamageSource) AccessDamageSource.createDamageSource("eatFire")).callSetBypassesArmor()).callSetFire();

}
