package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import net.minecraft.block.Block;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import org.rusherhack.command.disconnect;
@Mixin({ClientWorld.class})
public class MixinClientLevel {
   @Inject(
      method = {"disconnect"},
      at = {@At("HEAD")}
   )
   private void onDisconnect(CallbackInfo var1) {
      MixinHelper.onDisconnect(1, var1);
   }

   @Inject(
      method = {"addEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preAddEntity(Entity var1, CallbackInfo var2) {
      MixinHelper.onEntityAdd(var1.getId(), var1, var2, -1);
   }

   @Inject(
      method = {"addEntity"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postAddEntity(Entity var1, CallbackInfo var2) {
      MixinHelper.onEntityAdd(var1.getId(), var1, var2, 1);
   }

   @Inject(
      method = {"removeEntity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;setRemoved(Lnet/minecraft/world/entity/Entity$RemovalReason;)V",
         shift = Shift.BEFORE
      )},
      cancellable = true,
      locals = LocalCapture.CAPTURE_FAILSOFT
   )
   private void preRemoveEntity(int var1, RemovalReason var2, CallbackInfo var3, Entity var4) {
      MixinHelper.onEntityRemove(var4, var2, var3, -1);
   }

   @Inject(
      method = {"removeEntity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;onClientRemoval()V",
         shift = Shift.AFTER
      )},
      cancellable = true,
      locals = LocalCapture.CAPTURE_FAILSOFT
   )
   private void postRemoveEntity(int var1, RemovalReason var2, CallbackInfo var3, Entity var4) {
      MixinHelper.onEntityRemove(var4, var2, var3, 1);
   }

   @Inject(
      method = {"effects"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getLevelEffects(CallbackInfoReturnable<DimensionEffects> var1) {
      MixinHelper.getLevelEffects(var1);
   }

   @Inject(
      method = {"getSkyColor"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getSkyColor(Vec3d var1, float var2, CallbackInfoReturnable<Vec3d> var3) {
      MixinHelper.getSkyColor(var3);
   }

   @Inject(
      method = {"getCloudColor"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getCloudColor(float var1, CallbackInfoReturnable<Vec3d> var2) {
      MixinHelper.getCloudColor(var2);
   }

   @Inject(
      method = {"getMarkerParticleTarget"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getMarkerParticleTarget(CallbackInfoReturnable<Block> var1) {
      MixinHelper.getMarkerParticleTarget(var1);
   }
}
