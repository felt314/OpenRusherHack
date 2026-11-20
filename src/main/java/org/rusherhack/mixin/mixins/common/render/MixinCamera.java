package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Camera.class})
public class MixinCamera {
   @Inject(
      method = {"setup"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Camera;setPosition(DDD)V",
         ordinal = 0,
         shift = Shift.AFTER
      )}
   )
   private void onCameraSetup(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      MixinHelper.onCameraSetup(Camera.class.cast(this), var2, 0);
   }

   @Inject(
      method = {"getMaxZoom"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onGetMaxZoom(float var1, CallbackInfoReturnable<Float> var2) {
      MixinHelper.getCameraDistance(Camera.class.cast(this), var2);
   }
}
