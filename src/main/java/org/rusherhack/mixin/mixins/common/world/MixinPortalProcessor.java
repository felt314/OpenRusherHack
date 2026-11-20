package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import net.minecraft.world.dimension.PortalManager;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PortalManager.class})
public class MixinPortalProcessor {
   @Inject(
      method = {"isInsidePortalThisTick"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void isInsidePortalThisTick(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isInsidePortalThisTick(var1);
   }
}
