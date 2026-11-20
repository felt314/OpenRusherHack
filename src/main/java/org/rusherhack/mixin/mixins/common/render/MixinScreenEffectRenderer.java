package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameOverlayRenderer.class})
public class MixinScreenEffectRenderer {
   @Inject(
      method = {"renderScreenEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onRenderScreenEffect(MinecraftClient var0, MatrixStack var1, CallbackInfo var2) {
      MixinHelper.onRenderOverlay(var2, 2);
   }
}
