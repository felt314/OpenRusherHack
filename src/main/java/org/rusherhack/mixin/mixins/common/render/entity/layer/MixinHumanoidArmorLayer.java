package org.rusherhack.mixin.mixins.common.render.entity.layer;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ArmorFeatureRenderer.class})
public class MixinHumanoidArmorLayer {
   @Inject(
      method = {"render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRender(
      MatrixStack var1,
      VertexConsumerProvider var2,
      int var3,
      LivingEntity var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      CallbackInfo var11
   ) {
      MixinHelper.onRenderArmorLayer(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }
}
