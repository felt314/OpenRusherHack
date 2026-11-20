package org.rusherhack.mixin.mixins.common.render.entity;
import org.rusherhack.*;

import net.minecraft.client.render.entity.ItemFrameEntityRenderer;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.ItemStack;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({ItemFrameEntityRenderer.class})
public class MixinItemFrameRenderer {
   @Redirect(
      method = {"render(Lnet/minecraft/world/entity/decoration/ItemFrame;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/decoration/ItemFrame;isInvisible()Z"
      ),
      require = 0
   )
   private boolean isItemFrameInvisible(ItemFrameEntity var1) {
      return var1.isInvisible() || MixinHelper.shouldCancelItemFramePart(0);
   }

   @Redirect(
      method = {"render(Lnet/minecraft/world/entity/decoration/ItemFrame;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/item/ItemStack;isEmpty()Z"
      ),
      require = 0
   )
   private boolean isItemFrameStackEmpty(ItemStack var1) {
      return var1.isEmpty() || MixinHelper.shouldCancelItemFramePart(1);
   }
}
