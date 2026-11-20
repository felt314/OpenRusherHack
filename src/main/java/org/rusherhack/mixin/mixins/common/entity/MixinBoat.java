package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.vehicle.BoatEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BoatEntity.class})
public class MixinBoat {
   @Inject(
      method = {"setInput"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void setInput(boolean var1, boolean var2, boolean var3, boolean var4, CallbackInfo var5) {
      MixinHelper.setBoatInput(BoatEntity.class.cast(this), var3, var4, var5);
   }
}
