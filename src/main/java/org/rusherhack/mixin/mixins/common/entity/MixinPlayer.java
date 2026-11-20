package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.player.PlayerEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerEntity.class})
public class MixinPlayer {
   @Inject(
      method = {"blockInteractionRange"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getBlockInteractionRange(CallbackInfoReturnable<Double> var1) {
      var1.setReturnValue(MixinHelper.getBlockReach((Double)var1.getReturnValue()));
   }

   @Inject(
      method = {"entityInteractionRange"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getEntityInteractionRange(CallbackInfoReturnable<Double> var1) {
      var1.setReturnValue(MixinHelper.getEntityReach((Double)var1.getReturnValue()));
   }

   @Inject(
      method = {"isSecondaryUseActive"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void isSecondaryUseActive(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.forcePlaceHook(PlayerEntity.class.cast(this), var1);
   }

   @Inject(
      method = {"isPushedByFluid"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isPlayerPushedByFluid(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isPlayerPushedByFluid(PlayerEntity.class.cast(this), var1);
   }
}
