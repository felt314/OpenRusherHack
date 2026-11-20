package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.entity.projectile.PersistentProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PersistentProjectileEntity.class})
public interface IMixinAbstractArrow {
   @Accessor("inGround")
   boolean isInGround();
}
