package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({LivingEntity.class})
public interface IMixinLivingEntity {
   @Invoker("calculateFallDamage")
   int invokeCalculateFallDamage(float var1, float var2);
}
