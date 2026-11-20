package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntityRenderer.class})
public class MixinLivingEntityRenderer {
   @Inject(
      method = {"shouldShowName(Lnet/minecraft/world/entity/Entity;)Z"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void shouldShowName(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      MixinHelper.shouldShowEntityNametag(var1, var2);
   }

   @Inject(
      method = {"render(Lnet/minecraft/world/entity/LivingEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/LivingEntityRenderer;scale(Lnet/minecraft/world/entity/LivingEntity;Lcom/mojang/blaze3d/vertex/PoseStack;F)V",
         shift = Shift.AFTER
      )}
   )
   private void render(LivingEntity var1, float var2, float var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7) {
      MixinHelper.scaleEntity(var1, var4, var3);
   }
}
