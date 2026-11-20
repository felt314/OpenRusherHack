package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.dimension.DimensionType;
import org.joml.Vector3f;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({LightmapTextureManager.class})
public class MixinLightTexture {
   @Inject(
      method = {"updateLightTexture"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LightTexture;clampColor(Lorg/joml/Vector3f;)V",
         ordinal = 2,
         shift = Shift.AFTER
      )},
      locals = LocalCapture.CAPTURE_FAILSOFT,
      require = 0
   )
   private void onUpdateLightmapTexture(
      float var1,
      CallbackInfo var2,
      ClientWorld var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Vector3f var11,
      float var12,
      Vector3f var13,
      int var14,
      int var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      boolean var21
   ) {
      MixinHelper.onUpdateLightmapTexture(var13, var14, var15);
   }

   @Inject(
      method = {"getBrightness"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void getBrightness(DimensionType var0, int var1, CallbackInfoReturnable<Float> var2) {
      MixinHelper.getLightmapBrightness(var2);
   }
}
