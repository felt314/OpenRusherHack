package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public class MixinIteminHandRenderer {
   @Inject(
      method = {"renderHandsWithItems"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preRenderHands(float var1, MatrixStack var2, Immediate var3, ClientPlayerEntity var4, int var5, CallbackInfo var6) {
      MixinHelper.onRenderHands(var1, var2, var3, var4, var5, var6, -1);
   }

   @Inject(
      method = {"renderHandsWithItems"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postRenderHands(float var1, MatrixStack var2, Immediate var3, ClientPlayerEntity var4, int var5, CallbackInfo var6) {
      MixinHelper.onRenderHands(var1, var2, var3, var4, var5, var6, 1);
   }

   @Inject(
      method = {"applyItemArmTransform"},
      at = {@At("RETURN")}
   )
   private void onApplyItemTransforms(MatrixStack var1, Arm var2, float var3, CallbackInfo var4) {
      MixinHelper.onApplyItemTransforms(var1, var2, false, var4);
   }

   @Inject(
      method = {"renderPlayerArm"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;getRenderer(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/client/renderer/entity/EntityRenderer;",
         shift = Shift.BEFORE
      )}
   )
   private void onApplyArmTransforms(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, float var5, Arm var6, CallbackInfo var7) {
      MixinHelper.onApplyItemTransforms(var1, var6, true, var7);
   }
}
