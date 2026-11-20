package org.rusherhack.mixin.mixins.common.render.debug;
import org.rusherhack.*;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.GlDebug;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GlDebug.class})
public class MixinGlDebug {
   @Shadow
   @Final
   private static Logger LOGGER;
   @Unique
   private static long lastMessage = 0L;

   @Inject(
      method = {"printDebugLog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void printDebugLog(int var0, int var1, int var2, int var3, int var4, long var5, long var7, CallbackInfo var9) {
      if (System.currentTimeMillis() - lastMessage > 1000L) {
         lastMessage = System.currentTimeMillis();
         String var10 = GLDebugMessageCallback.getMessage(var4, var5);
         String var11 = String.format("OpenGL debug message (id=%d) (type=%s): %s", var2, GlDebug.getType(var1), var10);
         LOGGER.error(var11);
         StackTraceElement[] var12 = RenderSystem.renderThread.getStackTrace();

         for (StackTraceElement var16 : var12) {
            LOGGER.error("\tat " + var16);
         }
      }

      var9.cancel();
   }
}
