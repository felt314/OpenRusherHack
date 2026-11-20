package org.rusherhack.mixin.mixins.common.render.model;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ModelPart.class})
public class MixinModelPart {
   @Unique
   private Color rh_currentModelColor = null;

   @Inject(
      method = {"render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"},
      at = {@At("HEAD")}
   )
   private void preRenderModelPart(MatrixStack var1, VertexConsumer var2, int var3, int var4, int var5, CallbackInfo var6) {
      this.rh_currentModelColor = MixinHelper.getCurrentModelColor();
   }

   @ModifyVariable(
      method = {"render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"},
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/model/geom/ModelPart;visible:Z",
         shift = Shift.BEFORE
      ),
      argsOnly = true,
      ordinal = 2,
      require = 0
   )
   private int modifyColor(int var1) {
      return this.rh_currentModelColor != null ? this.rh_currentModelColor.getRGB() : var1;
   }
}
