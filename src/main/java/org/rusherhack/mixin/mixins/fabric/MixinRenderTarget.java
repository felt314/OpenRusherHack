package org.rusherhack.mixin.mixins.fabric;
import org.rusherhack.*;

import net.minecraft.client.gl.Framebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Framebuffer.class})
public class MixinRenderTarget {
   @ModifyArgs(
      method = {"createBuffers"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/platform/GlStateManager;_texImage2D(IIIIIIIILjava/nio/IntBuffer;)V",
         ordinal = 0
      )
   )
   private void initStencilBuffer(Args var1) {
      var1.set(2, 36013);
      var1.set(6, 34041);
      var1.set(7, 36269);
   }

   @ModifyArgs(
      method = {"createBuffers"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/platform/GlStateManager;_glFramebufferTexture2D(IIIII)V",
         ordinal = 1
      )
   )
   private void initStencilBuffer2(Args var1) {
      var1.set(1, 33306);
   }
}
