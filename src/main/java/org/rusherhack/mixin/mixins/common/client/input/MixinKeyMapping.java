package org.rusherhack.mixin.mixins.common.client.input;
import org.rusherhack.*;

import net.minecraft.client.option.KeyBinding;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({KeyBinding.class})
public class MixinKeyMapping {
   @Redirect(
      method = {"releaseAll"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/KeyMapping;release()V"
      )
   )
   private static void releaseKey(KeyBinding var0) {
      MixinHelper.onReleaseKey(var0);
   }

   @Inject(
      method = {"isDown"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void isKeyMappingDown(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isKeyMappingDown(var1, KeyBinding.class.cast(this));
   }
}
