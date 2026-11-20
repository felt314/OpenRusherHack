package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({FireworkRocketEntity.class})
public class MixinFireworkRocketEntity {
   @Redirect(
      method = {"tick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/phys/Vec3;add(DDD)Lnet/minecraft/world/phys/Vec3;",
         ordinal = 0
      ),
      require = 0
   )
   private Vec3d modifyMotion(Vec3d var1, double var2, double var4, double var6) {
      return MixinHelper.stopFireworkBoost() ? var1 : var1.add(var2, var4, var6);
   }
}
