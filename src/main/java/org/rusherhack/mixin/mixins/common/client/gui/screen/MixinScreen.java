package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.Screen;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Screen.class})
public class MixinScreen {
   @Shadow
   @Final
   private List<Drawable> drawables;

   @Inject(
      method = {"init(Lnet/minecraft/client/Minecraft;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;init()V",
         shift = Shift.BEFORE
      )}
   )
   private void preScreenFirstInit(MinecraftClient var1, int var2, int var3, CallbackInfo var4) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, -1, false);
   }

   @Inject(
      method = {"init(Lnet/minecraft/client/Minecraft;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;init()V",
         shift = Shift.AFTER
      )}
   )
   private void postScreenFirstInit(MinecraftClient var1, int var2, int var3, CallbackInfo var4) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, 1, false);
   }

   @Inject(
      method = {"init(Lnet/minecraft/client/Minecraft;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;repositionElements()V",
         shift = Shift.BEFORE
      )}
   )
   private void preRepositionElements1(MinecraftClient var1, int var2, int var3, CallbackInfo var4) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, -1, true);
   }

   @Inject(
      method = {"init(Lnet/minecraft/client/Minecraft;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;repositionElements()V",
         shift = Shift.AFTER
      )}
   )
   private void postRepositionElements1(MinecraftClient var1, int var2, int var3, CallbackInfo var4) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, 1, true);
   }

   @Inject(
      method = {"resize"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;repositionElements()V",
         shift = Shift.BEFORE
      )}
   )
   private void preRepositionElements2(CallbackInfo var1) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, -1, true);
   }

   @Inject(
      method = {"resize"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;repositionElements()V",
         shift = Shift.AFTER
      )}
   )
   private void postRepositionElements2(CallbackInfo var1) {
      MixinHelper.onScreenInit(Screen.class.cast(this), this.drawables, 1, true);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderScreen(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      MixinHelper.onRenderScreen(Screen.class.cast(this), var1, var2, var3, var4, 0, var5);
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preRenderScreen(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      MixinHelper.onRenderScreen(Screen.class.cast(this), var1, var2, var3, var4, -1, var5);
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postRenderScreen(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      MixinHelper.onRenderScreen(Screen.class.cast(this), var1, var2, var3, var4, 1, var5);
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;renderBlurredBackground(F)V",
         shift = Shift.BEFORE
      )},
      cancellable = true,
      require = 0
   )
   private void preRenderScreenBackground(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      MixinHelper.onRenderScreenBackground(Screen.class.cast(this), var1, var5);
   }
}
