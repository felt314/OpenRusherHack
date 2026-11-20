package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.client.particle.BlockDustParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ParticleManager.class})
public class MixinParticleEngine {
   @Shadow
   private ClientWorld world;

   @Inject(
      method = {"add"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void add(Particle var1, CallbackInfo var2) {
      if (!(var1 instanceof BlockDustParticle)) {
         MixinHelper.addParticle(var1, var2);
      }
   }

   @Inject(
      method = {"destroy"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void destroy(BlockPos var1, BlockState var2, CallbackInfo var3) {
      MixinHelper.addParticle(new BlockDustParticle(this.world, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, this.world.getBlockState(var1), var1), var3);
   }

   @Inject(
      method = {"crack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void crack(BlockPos var1, Direction var2, CallbackInfo var3) {
      MixinHelper.addParticle(new BlockDustParticle(this.world, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, this.world.getBlockState(var1), var1), var3);
   }
}
