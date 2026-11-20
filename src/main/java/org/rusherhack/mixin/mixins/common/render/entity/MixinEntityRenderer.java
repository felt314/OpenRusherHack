package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityRenderer.class})
public class MixinEntityRenderer<T extends Entity> {
   private Text component;

   @Inject(
      method = {"renderNameTag"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;isDiscrete()Z",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preRenderNametag(T var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, float var6, CallbackInfo var7) {
      this.component = MixinHelper.onRenderEntityNametag(var1, var2, var3, var4, var5, var7, -1);
   }

   @ModifyVariable(
      method = {"renderNameTag"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;isDiscrete()Z",
         shift = Shift.AFTER
      ),
      ordinal = 0,
      argsOnly = true
   )
   private Text modifyComponent(Text var1) {
      return this.component;
   }

   @Inject(
      method = {"renderNameTag"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/PoseStack;popPose()V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void postRenderNametag(T var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, float var6, CallbackInfo var7) {
      MixinHelper.onRenderEntityNametag(var1, var2, var3, var4, var5, var7, 1);
   }

   @Inject(
      method = {"shouldShowName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void shouldShowName(T var1, CallbackInfoReturnable<Boolean> var2) {
      MixinHelper.shouldShowEntityNametag(var1, var2);
   }
}
