package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({BlockEntityRenderDispatcher.class})
public class MixinBlockEntityRenderDispatcher {
   @Inject(
      method = {"render(Lnet/minecraft/world/level/block/entity/BlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;tryRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/lang/Runnable;)V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preRenderBlockEntity(BlockEntity var1, float var2, MatrixStack var3, VertexConsumerProvider var4, CallbackInfo var5) {
      MixinHelper.onRenderBlockEntity(var1, var2, var3, var4, var5, -1);
   }

   @Inject(
      method = {"render(Lnet/minecraft/world/level/block/entity/BlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;tryRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/lang/Runnable;)V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void postRenderBlockEntity(BlockEntity var1, float var2, MatrixStack var3, VertexConsumerProvider var4, CallbackInfo var5) {
      MixinHelper.onRenderBlockEntity(var1, var2, var3, var4, var5, 1);
   }

   @ModifyArgs(
      method = {"setupAndRender"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderer;render(Lnet/minecraft/world/level/block/entity/BlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II)V"
      )
   )
   private static void setBufferSource(Args var0, BlockEntityRenderer var1, BlockEntity var2, float var3, MatrixStack var4, VertexConsumerProvider var5) {
      MixinHelper.onRenderBlockEntity(var2, var3, var4, var5, var0, 0);
   }
}
