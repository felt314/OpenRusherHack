package org.rusherhack.mixin.mixins.common.client.gui;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameHud.class})
public class MixinGui {
   @Inject(
      method = {"lambda$new$0"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/components/BossHealthOverlay;render(Lnet/minecraft/client/gui/GuiGraphics;)V",
         shift = Shift.BEFORE
      )}
   )
   private void onRenderHud(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      MixinHelper.onRender2D(var1, var2.getTickDelta(false), 0);
   }

   @Inject(
      method = {"renderTextureOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderTextureOverlay(DrawContext var1, Identifier var2, float var3, CallbackInfo var4) {
      MixinHelper.onRenderOverlay(var4, 0);
   }

   @Inject(
      method = {"renderPortalOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderPortalOverlay(DrawContext var1, float var2, CallbackInfo var3) {
      MixinHelper.onRenderOverlay(var3, 1);
   }

   @Inject(
      method = {"renderEffects"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderPotionEffects(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      MixinHelper.onRenderOverlay(var3, 3);
   }

   @Inject(
      method = {"displayScoreboardSidebar"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderScoreboardSidebar(CallbackInfo var1) {
      MixinHelper.onRenderOverlay(var1, 4);
   }

   @Inject(
      method = {"renderCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderCrosshair(CallbackInfo var1) {
      MixinHelper.onRenderOverlay(var1, 5);
   }
}
