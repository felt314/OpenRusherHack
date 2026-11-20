package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({PlayerEntityRenderer.class})
public class MixinPlayerRenderer {
   @Redirect(
      method = {"setupRotations(Lnet/minecraft/client/player/AbstractClientPlayer;Lcom/mojang/blaze3d/vertex/PoseStack;FFFF)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/phys/Vec3;horizontalDistanceSqr()D"
      )
   )
   private double getSpin(Vec3d var1) {
      return MixinHelper.shouldCancelElytraSpin() ? 0.0 : var1.horizontalLengthSquared();
   }
}
