package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.entity.player.PlayerInventory;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerInventory.class})
public class MixinInventory {
   @Inject(
      method = {"swapPaint"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSwapPaint(double var1, CallbackInfo var3) {
      MixinHelper.onHotbarScroll(var1, var3);
   }
}
