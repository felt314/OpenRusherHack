package org.rusherhack.mixin.mixins.common.client.input;
import org.rusherhack.*;

import net.minecraft.client.Mouse;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class MixinMouseHandler {
   @Inject(
      method = {"onPress"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/KeyMapping;set(Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onMousePress(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      MixinHelper.onMousePress(var1, var3, var4, var5, var6, 0);
   }

   @Inject(
      method = {"onPress"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Minecraft;getOverlay()Lnet/minecraft/client/gui/screens/Overlay;",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onMousePress2(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      MixinHelper.onMousePress(var1, var3, var4, var5, var6, -1);
   }

   @Inject(
      method = {"onScroll"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/Minecraft;screen:Lnet/minecraft/client/gui/screens/Screen;",
         ordinal = 0,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      MixinHelper.onMouseScroll(var1, var3, var5, var7);
   }

   @Inject(
      method = {"onMove"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Minecraft;isWindowActive()Z",
         ordinal = 0,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onMouseMove(long var1, double var3, double var5, CallbackInfo var7) {
      MixinHelper.onMouseMove(var1, var3, var5, var7);
   }
}
