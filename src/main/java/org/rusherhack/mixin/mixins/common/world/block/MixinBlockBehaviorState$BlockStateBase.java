package org.rusherhack.mixin.mixins.common.world.block;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractBlockState.class})
public abstract class MixinBlockBehaviorState$BlockStateBase {
   @Inject(
      method = {"getShadeBrightness"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getShadeBrightness(BlockView var1, BlockPos var2, CallbackInfoReturnable<Float> var3) {
      MixinHelper.getBlockShadeBrightness(var3);
   }

   @Inject(
      method = {"canOcclude"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void canOcclude(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.canOccludeBlock(var1);
   }

   @Shadow
   public abstract BlockState asBlockState();

   @Inject(
      method = {"getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getBlockCollisionShape(BlockView var1, BlockPos var2, ShapeContext var3, CallbackInfoReturnable<VoxelShape> var4) {
      MixinHelper.getBlockCollisionShape(var2, this.asBlockState(), var3, var4);
   }
}
