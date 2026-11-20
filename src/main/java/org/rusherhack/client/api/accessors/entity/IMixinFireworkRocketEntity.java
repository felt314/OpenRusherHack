package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({FireworkRocketEntity.class})
public interface IMixinFireworkRocketEntity {
   @Accessor("attachedToEntity")
   LivingEntity getAttachedEntity();

   @Accessor("life")
   int getLife();

   @Accessor("lifetime")
   int getLifeTime();
}
