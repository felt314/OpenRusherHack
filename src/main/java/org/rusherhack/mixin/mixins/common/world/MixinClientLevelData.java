package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import net.minecraft.client.world.ClientWorld.Properties;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Properties.class})
public class MixinClientLevelData {
   @Inject(
      method = {"getClearColorScale"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getClearColorScale(CallbackInfoReturnable<Float> var1) {
      MixinHelper.getClearColorScale(var1);
   }
}
