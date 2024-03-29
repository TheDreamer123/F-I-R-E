package net.dreamer.fire.mixin;

import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(DamageSource.class)
public interface AccessDamageSource {
    @Invoker("<init>")
    static DamageSource createDamageSource(String name) {
        throw new RuntimeException("Evil invoker exception! >:)");
    }

    @Invoker
    DamageSource callSetBypassesArmor();

    @Invoker
    DamageSource callSetFire();
}