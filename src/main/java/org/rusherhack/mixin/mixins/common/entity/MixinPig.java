package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PigEntity.class})
public class MixinPig {
   @Inject(
      method = {"getControllingPassenger"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getControllingPassenger(CallbackInfoReturnable<LivingEntity> var1) {
      MixinHelper.getPigPassenger(PigEntity.class.cast(this), var1);
   }

   @Inject(
      method = {"getRiddenInput"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getRiddenInput(PlayerEntity var1, Vec3d var2, CallbackInfoReturnable<Vec3d> var3) {
      MixinHelper.getPigInput(PigEntity.class.cast(this), var3);
   }
}
