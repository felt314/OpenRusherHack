package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({MobEntityRenderer.class})
public class MixinMobRenderer {
   @Inject(
      method = {"shouldShowName(Lnet/minecraft/world/entity/Entity;)Z"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void shouldShowName(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      MixinHelper.shouldShowEntityNametag(var1, var2);
   }
}
