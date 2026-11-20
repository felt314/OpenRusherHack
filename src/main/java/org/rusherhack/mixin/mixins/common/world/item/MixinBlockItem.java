package org.rusherhack.mixin.mixins.common.world.item;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BlockItem.class})
public class MixinBlockItem {
   @Inject(
      method = {"placeBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPlaceBlock(ItemPlacementContext var1, BlockState var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onPlaceBlock(var1, var2, var3);
   }
}
