package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.RotatingCubeMapRenderer;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RotatingCubeMapRenderer.class})
public class MixinPanoramaRenderer {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderPanorama(DrawContext var1, int var2, int var3, float var4, float var5, CallbackInfo var6) {
      MixinHelper.onRenderPanorama(var4, var5, var6);
   }
}
