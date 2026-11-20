package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Main.class})
public class MixinMain {
   @Inject(
      method = {"main"},
      at = {@At("HEAD")},
      remap = false
   )
   private static void preMain(CallbackInfo var0) {
      if (!"Linux".toLowerCase().contains("mac")) {
         System.setProperty("java.awt.headless", "false");
      }
   }
}
