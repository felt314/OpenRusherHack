package org.rusherhack.mixin.mixins.common.client.input;
import org.rusherhack.*;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Keyboard.class})
public class MixinKeyboardHandler {
   @Shadow
   @Final
   private MinecraftClient client;

   @Inject(
      method = {"keyPress"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/Minecraft;screen:Lnet/minecraft/client/gui/screens/Screen;",
         ordinal = 0,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preKeyPress(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      MixinHelper.onKeyPress(var1, var3, var4, var5, var6, var7, -1);
   }

   @Inject(
      method = {"keyPress"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/platform/InputConstants;getKey(II)Lcom/mojang/blaze3d/platform/InputConstants$Key;",
         ordinal = 0,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onKeyPressInGame(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (this.client.currentScreen == null) {
         MixinHelper.onKeyPress(var1, var3, var4, var5, var6, var7, 0);
      }
   }

   @Inject(
      method = {"keyPress"},
      at = {@At("RETURN")}
   )
   private void postKeyPress(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      MixinHelper.onKeyPress(var1, var3, var4, var5, var6, var7, 1);
   }
}
