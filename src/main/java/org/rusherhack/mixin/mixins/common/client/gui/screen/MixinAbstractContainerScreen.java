package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({HandledScreen.class})
public class MixinAbstractContainerScreen {
   @Inject(
      method = {"keyPressed"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;onClose()V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void onContainerClose(int var1, int var2, int var3, CallbackInfoReturnable<Boolean> var4) {
      MixinHelper.onContainerClose(var4);
   }

   @Inject(
      method = {"renderSlot"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphics;renderItem(Lnet/minecraft/world/item/ItemStack;III)V",
         shift = Shift.BEFORE
      )}
   )
   private void preRenderItemSlot(DrawContext var1, Slot var2, CallbackInfo var3) {
      MixinHelper.preRenderItemSlot(var1, var2, var3);
   }
}
