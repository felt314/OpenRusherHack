package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.client.render.RenderTickCounter.Dynamic;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Dynamic.class})
public class MixinTimer {
   @Shadow
   private float lastFrameDuration;

   @Inject(
      method = {"advanceGameTime"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/DeltaTracker$Timer;lastMs:J",
         opcode = 181,
         ordinal = 0
      )}
   )
   private void advanceTime(long var1, CallbackInfoReturnable<Integer> var3) {
      this.lastFrameDuration = this.lastFrameDuration * MixinHelper.getTimerSpeed();
   }
}
