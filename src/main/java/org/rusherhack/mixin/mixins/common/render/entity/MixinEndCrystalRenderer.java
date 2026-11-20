package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EndCrystalEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.decoration.EndCrystalEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EndCrystalEntityRenderer.class})
public class MixinEndCrystalRenderer {
   @Inject(
      method = {"render(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/PoseStack;scale(FFF)V",
         shift = Shift.AFTER
      )}
   )
   private void render(EndCrystalEntity var1, float var2, float var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7) {
      MixinHelper.scaleEntity(var1, var4, var3);
   }
}
