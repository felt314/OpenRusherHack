package org.rusherhack.mixin.mixins.common.client.input;
import org.rusherhack.*;

import net.minecraft.client.input.Input;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Input.class})
public class MixinInput {
   @Inject(
      method = {"hasForwardImpulse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hasForwardImpulse(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.playerHasForwardImpulse(var1);
   }
}
