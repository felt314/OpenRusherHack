package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import net.minecraft.client.render.DimensionEffects;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DimensionEffects.class})
public class MixinDimensionSpecialEffects {
   @Inject(
      method = {"getSunriseColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getSunriseColor(float var1, float var2, CallbackInfoReturnable<float[]> var3) {
      MixinHelper.getSunriseColor(var3);
   }
}
