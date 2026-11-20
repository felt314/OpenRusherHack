package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.entity.projectile.thrown.ThrownEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ThrownEntity.class})
public interface IMixinThrowableProjectile {
   @Invoker("getDefaultGravity")
   double invokeGetGravity();
}
