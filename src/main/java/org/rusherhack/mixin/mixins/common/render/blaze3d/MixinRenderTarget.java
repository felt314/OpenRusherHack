package org.rusherhack.mixin.mixins.common.render.blaze3d;
import org.rusherhack.*;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.gl.Framebuffer;
import org.lwjgl.opengl.GL11C;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import org.rusherhack.command.clear;
@Mixin({Framebuffer.class})
public class MixinRenderTarget {
   @Redirect(
      method = {"clear"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/platform/GlStateManager;_clear(IZ)V"
      )
   )
   private void clearStencilBuffer(int var1, boolean var2) {
      GL11C.glClearStencil(0);
      GlStateManager._clear(var1 | 1024, var2);
   }
}
