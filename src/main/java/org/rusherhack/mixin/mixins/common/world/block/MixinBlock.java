package org.rusherhack.mixin.mixins.common.world.block;
import org.rusherhack.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Block.class})
public class MixinBlock {
   @Inject(
      method = {"shouldRenderFace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void shouldRenderFace(BlockState var0, BlockView var1, BlockPos var2, Direction var3, BlockPos var4, CallbackInfoReturnable<Boolean> var5) {
      MixinHelper.shouldRenderBlockFace(var0, var5);
   }

   @Inject(
      method = {"getFriction"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getBlockFriction(CallbackInfoReturnable<Float> var1) {
      MixinHelper.getBlockFriction(Block.class.cast(this), var1);
   }

   @Inject(
      method = {"getSpeedFactor"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getBlockSpeedFactor(CallbackInfoReturnable<Float> var1) {
      MixinHelper.getBlockSpeedFactor(Block.class.cast(this), var1);
   }
}
