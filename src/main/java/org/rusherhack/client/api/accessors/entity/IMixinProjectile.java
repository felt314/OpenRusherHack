package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import java.util.UUID;
import net.minecraft.entity.projectile.ProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ProjectileEntity.class})
public interface IMixinProjectile {
   @Accessor("ownerUUID")
   UUID getOwnerUUID();
}
