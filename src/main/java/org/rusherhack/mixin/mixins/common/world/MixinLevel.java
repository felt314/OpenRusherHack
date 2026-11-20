package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({World.class})
public class MixinLevel {
   @Inject(
      method = {"getRainLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getRainLevel(float var1, CallbackInfoReturnable<Float> var2) {
      MixinHelper.getWeatherLevel(var2, 0);
   }

   @Inject(
      method = {"getThunderLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getThunderLevel(float var1, CallbackInfoReturnable<Float> var2) {
      MixinHelper.getWeatherLevel(var2, 1);
   }

   @Redirect(
      method = {"isRainingAt"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/level/Level;isRaining()Z"
      )
   )
   private boolean isRaining(World var1) {
      return MixinHelper.isRaining(var1);
   }

   @Inject(
      method = {"setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preBlockChange(BlockPos var1, BlockState var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      MixinHelper.onBlockChange(var1, var2, var3, var5, -1);
   }

   @Inject(
      method = {"setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postBlockChange(BlockPos var1, BlockState var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      MixinHelper.onBlockChange(var1, var2, var3, var5, 1);
   }
}
