package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import java.io.File;
import java.util.function.Consumer;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.ScreenshotRecorder;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ScreenshotRecorder.class})
public class MixinScreenshot {
   @Inject(
      method = {"_grab"},
      at = {@At(
         value = "NEW",
         target = "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;",
         shift = Shift.BEFORE
      )},
      locals = LocalCapture.CAPTURE_FAILSOFT,
      cancellable = true,
      require = 0
   )
   private static void preSreenshot(File var0, @Nullable String var1, Framebuffer var2, Consumer<Text> var3, CallbackInfo var4, NativeImage var5) {
      MixinHelper.onScreenshot(var5, var4);
   }
}
