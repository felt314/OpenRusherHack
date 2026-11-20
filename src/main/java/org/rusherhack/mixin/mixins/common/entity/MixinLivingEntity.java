package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import org.rusherhack.command.travel;
@Mixin(
   value = {LivingEntity.class},
   priority = 999
)
public class MixinLivingEntity {
   @Inject(
      method = {"completeUsingItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/LivingEntity;triggerItemUseEffects(Lnet/minecraft/world/item/ItemStack;I)V",
         shift = Shift.AFTER
      )}
   )
   private void onCompleteUsingItem(CallbackInfo var1) {
      MixinHelper.onCompleteUsingItem(LivingEntity.class.cast(this));
   }

   @Inject(
      method = {"travel"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/LivingEntity;getLookAngle()Lnet/minecraft/world/phys/Vec3;",
         shift = Shift.BEFORE
      )}
   )
   private void preElytraTravel(Vec3d var1, CallbackInfo var2) {
      MixinHelper.onElytraTravel(LivingEntity.class.cast(this), var1, -1);
   }

   @Inject(
      method = {"travel"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/world/entity/LivingEntity;horizontalCollision:Z",
         ordinal = 3,
         shift = Shift.BEFORE
      )}
   )
   private void postElytraTravel(Vec3d var1, CallbackInfo var2) {
      MixinHelper.onElytraTravel(LivingEntity.class.cast(this), var1, 1);
   }

   @Inject(
      method = {"isFallFlying"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void isFallFlying(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isElytraFlying(LivingEntity.class.cast(this), var1, 0);
   }

   @Inject(
      method = {"jumpFromGround"},
      at = {@At("HEAD")}
   )
   private void preGetJumpYaw(CallbackInfo var1) {
      MixinHelper.getJumpYaw((Entity)LivingEntity.class.cast(this), -1);
   }

   @Inject(
      method = {"jumpFromGround"},
      at = {@At("RETURN")}
   )
   private void postGetJumpYaw(CallbackInfo var1) {
      MixinHelper.getJumpYaw((Entity)LivingEntity.class.cast(this), 1);
   }

   @Inject(
      method = {"spawnItemParticles"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void spawnItemParticles(ItemStack var1, int var2, CallbackInfo var3) {
      MixinHelper.spawnItemParticles(var1, var3);
   }

   @Inject(
      method = {"addEatEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void addEatEffect(CallbackInfo var1) {
      MixinHelper.addEatEffect(var1);
   }

   @ModifyArgs(
      method = {"checkAutoSpinAttack"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/phys/Vec3;scale(D)Lnet/minecraft/world/phys/Vec3;"
      ),
      require = 0
   )
   private void modifyTridentCollision(Args var1) {
      MixinHelper.modifyTridentCollision(var1, LivingEntity.class.cast(this));
   }
}
