package org.rusherhack.mixin.mixins.fabric;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftClient.class})
public class MixinMinecraft {
   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void preStart(CallbackInfo var1) {
      System.out.println("FABRIC LOADED");
   }
}
