package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.client.option.GameOptions;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameOptions.class})
public class MixinOptions {
   @Inject(
      method = {"<init>"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Options;load()V",
         shift = Shift.BEFORE
      )}
   )
   private void init(CallbackInfo var1) {
      MixinHelper.initOptions(GameOptions.class.cast(this));
   }
}
