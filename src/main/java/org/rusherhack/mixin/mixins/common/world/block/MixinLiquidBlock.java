package org.rusherhack.mixin.mixins.common.world.block;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({FluidBlock.class})
public class MixinLiquidBlock {
   @Inject(
      method = {"getShape"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getShape(BlockState var1, BlockView var2, BlockPos var3, ShapeContext var4, CallbackInfoReturnable<VoxelShape> var5) {
      MixinHelper.getLiquidBlockShape(var1, var2, var3, var4, var5);
   }
}
