package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.passive.AbstractHorseEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractHorseEntity.class})
public class MixinAbstractHorse {
   @Inject(
      method = {"isSaddled"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isSaddled(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isHorseSaddled(var1);
   }
}
