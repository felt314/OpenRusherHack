package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({Entity.class})
public abstract class MixinEntity {
   @Inject(
      method = {"isNoGravity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isNoGravity(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isNoGravity(Entity.class.cast(this), var1);
   }

   @Shadow
   public abstract int getId();

   @Inject(
      method = {"turn"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onTurn(double var1, double var3, CallbackInfo var5) {
      Entity var6 = Entity.class.cast(this);
      MixinHelper.onTurn(var6, var1, var3, var5);
   }

   @Inject(
      method = {"push(DDD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushed(double var1, double var3, double var5, CallbackInfo var7) {
      MixinHelper.onEntityPushed(Entity.class.cast(this), var1, var3, var5, var7);
   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Vec3d onEntityMove(Vec3d var1) {
      return MixinHelper.onEntityMove(Entity.class.cast(this), var1);
   }

   @Inject(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;collide(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;"
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void preStep(MovementType var1, Vec3d var2, CallbackInfo var3) {
      MixinHelper.onEntityStep(Entity.class.cast(this), 0.0, -1);
   }

   @Inject(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;setPos(DDD)V",
         ordinal = 1
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void onStep(MovementType var1, Vec3d var2, CallbackInfo var3, @NotNull Vec3d var4) {
        
    }

   @Inject(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/profiling/ProfilerFiller;pop()V",
         ordinal = 0
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void postStep(MovementType var1, Vec3d var2, CallbackInfo var3) {
      MixinHelper.onEntityStep(Entity.class.cast(this), 0.0, 1);
   }

   @Inject(
      method = {"getSharedFlag"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isFallFlying(int var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 == 7) {
         MixinHelper.isElytraFlying(LivingEntity.class.cast(this), var2, -1);
      }
   }

   @Inject(
      method = {"hasPose"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void hasElytraFlyPose(EntityPose var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 == EntityPose.FALL_FLYING) {
         MixinHelper.isElytraFlying(LivingEntity.class.cast(this), var2, -1);
      }
   }

   @ModifyArg(
      method = {"moveRelative"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;getInputVector(Lnet/minecraft/world/phys/Vec3;FF)Lnet/minecraft/world/phys/Vec3;"
      ),
      index = 2
   )
   private float getMoveYaw(float var1) {
      return MixinHelper.getMoveYaw(Entity.class.cast(this), var1);
   }

   @Inject(
      method = {"canSpawnSprintParticle"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void canSpawnSprintParticle(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.canSpawnSprintParticle(var1);
   }
}
