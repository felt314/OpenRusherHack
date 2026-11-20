package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.particle.ParticleEffect;
import org.joml.Matrix4f;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({WorldRenderer.class})
public class MixinLevelRenderer {
   @Redirect(
      method = {"renderLevel"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Camera;getEntity()Lnet/minecraft/world/entity/Entity;",
         ordinal = 3
      ),
      require = 0
   )
   private Entity getCameraEntity(Camera var1) {
      return MixinHelper.getCameraEntity(var1);
   }

   @ModifyVariable(
      method = {"setupRender"},
      at = @At("HEAD"),
      ordinal = 1,
      argsOnly = true
   )
   private boolean isSpectator(boolean var1) {
      return MixinHelper.isSpectator(var1);
   }

   @Inject(
      method = {"renderLevel"},
      at = {@At("RETURN")}
   )
   private void postRenderLevel(
      RenderTickCounter var1, boolean var2, Camera var3, GameRenderer var4, LightmapTextureManager var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      MatrixStack var9 = new MatrixStack();
      var9.multiplyPositionMatrix(var6);
      MixinHelper.onRender3D(var9, var1.getTickDelta(false), 0);
   }

   @Inject(
      method = {"addParticleInternal(Lnet/minecraft/core/particles/ParticleOptions;ZZDDDDDD)Lnet/minecraft/client/particle/Particle;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void addParticleInternal(
      ParticleEffect var1,
      boolean var2,
      boolean var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      CallbackInfoReturnable<Particle> var16
   ) {
      MixinHelper.addParticle(var1, var16);
   }
}
