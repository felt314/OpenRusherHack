package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.ShulkerBoxSlot;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ShulkerBoxSlot.class})
public class MixinShulkerBoxSlot {
   @Inject(
      method = {"mayPlace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void mayPlace(ItemStack var1, CallbackInfoReturnable<Boolean> var2) {
      MixinHelper.mayPlaceInShulkerSlot(var2);
   }
}
