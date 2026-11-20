package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderDispatcher.class})
public class MixinEntityRenderDispatcher<E extends Entity> {
   @Unique
   private EntityRenderer<?> extendedEntityRenderer = null;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preRenderEntity(
      E var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, VertexConsumerProvider var11, int var12, CallbackInfo var13
   ) {
      this.extendedEntityRenderer = MixinHelper.onRenderEntity(var1, var2, var4, var6, var8, var9, var10, var11, var12, var13, -1);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postRenderEntity(
      E var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, VertexConsumerProvider var11, int var12, CallbackInfo var13
   ) {
      MixinHelper.onRenderEntity(var1, var2, var4, var6, var8, var9, var10, var11, var12, var13, 1);
      this.extendedEntityRenderer = null;
   }

   @ModifyArg(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/EntityRenderer;render(Lnet/minecraft/world/entity/Entity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"
      )
   )
   private VertexConsumerProvider onRender(Entity var1, float var2, float var3, MatrixStack var4, VertexConsumerProvider var5, int var6) {
      return MixinHelper.onRenderEntityMain(var1, var2, var3, var4, var5, var6);
   }

   @ModifyVariable(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/EntityRenderer;getRenderOffset(Lnet/minecraft/world/entity/Entity;F)Lnet/minecraft/world/phys/Vec3;"
      )
   )
   private EntityRenderer<?> replaceEntityRenderer(EntityRenderer<?> var1) {
      EntityRenderer var2 = this.extendedEntityRenderer != null ? this.extendedEntityRenderer : var1;
      this.extendedEntityRenderer = null;
      return var2;
   }
}
