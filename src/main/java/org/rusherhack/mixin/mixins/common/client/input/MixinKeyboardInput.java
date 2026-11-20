package org.rusherhack.mixin.mixins.common.client.input;
import org.rusherhack.*;

import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({KeyboardInput.class})
public class MixinKeyboardInput {
   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/KeyMapping;isDown()Z",
         ordinal = 5,
         shift = Shift.AFTER
      )}
   )
   private void onInputTick(boolean var1, float var2, CallbackInfo var3) {
      MixinHelper.postInputTick((Input)KeyboardInput.class.cast(this), 0);
   }
}
