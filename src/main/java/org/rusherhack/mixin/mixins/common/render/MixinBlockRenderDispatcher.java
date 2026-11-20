package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockRenderView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BlockRenderManager.class})
public class MixinBlockRenderDispatcher {
   @Inject(
      method = {"renderBatched"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderBatched(
      BlockState var1, BlockPos var2, BlockRenderView var3, MatrixStack var4, VertexConsumer var5, boolean var6, Random var7, CallbackInfo var8
   ) {
      MixinHelper.onRenderBlock(var1, var8);
   }

   @Inject(
      method = {"renderLiquid"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLiquid(BlockPos var1, BlockRenderView var2, VertexConsumer var3, BlockState var4, FluidState var5, CallbackInfo var6) {
      MixinHelper.onRenderBlock(var4, var6);
   }
}
