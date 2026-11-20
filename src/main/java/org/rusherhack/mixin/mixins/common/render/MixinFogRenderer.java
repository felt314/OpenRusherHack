package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.BackgroundRenderer.FogData;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({BackgroundRenderer.class})
public class MixinFogRenderer {
   @Shadow
   private static float red;
   @Shadow
   private static float green;
   @Shadow
   private static float blue;

   @Inject(
      method = {"setupFog"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogStart(F)V",
         shift = Shift.BEFORE
      )},
      locals = LocalCapture.CAPTURE_FAILSOFT
   )
   private static void onSetupFog(
      Camera var0, FogType var1, float var2, boolean var3, float var4, CallbackInfo var5, CameraSubmersionType var6, Entity var7, FogData var8
   ) {
      MixinHelper.onSetupFog(var8, var5);
   }

   @Inject(
      method = {"setupColor"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V",
         ordinal = 1,
         shift = Shift.BEFORE
      )}
   )
   private static void onSetupFogColor(Camera var0, float var1, ClientWorld var2, int var3, float var4, CallbackInfo var5) {
      float[] var6 = MixinHelper.getFogColor(red, green, blue);
      red = var6[0];
      green = var6[1];
      blue = var6[2];
   }
}
