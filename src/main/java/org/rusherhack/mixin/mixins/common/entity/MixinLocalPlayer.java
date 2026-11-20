package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {ClientPlayerEntity.class},
   priority = 999
)
public class MixinLocalPlayer {
   @Shadow
   private Input input;
   private Vec3d motion = Vec3d.ZERO;

   @Inject(
      method = {"isControlledCamera"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isPlayerControllingCamera(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.isPlayerControllingCamera(ClientPlayerEntity.class.cast(this), var1);
   }

   @Inject(
      method = {"hasEnoughImpulseToStartSprinting"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hasEnoughImpulseToStartSprinting(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.playerHasForwardImpulse(var1);
   }

   @Inject(
      method = {"isUsingItem"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void isUsingItem(CallbackInfoReturnable<Boolean> var1) {
      MixinHelper.multiTaskHook(0, var1);
      MixinHelper.noSlowHook(0, var1);
   }

   @Inject(
      method = {"aiStep"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;canStartSprinting()Z",
         shift = Shift.BEFORE
      )}
   )
   private void preStartSprint(CallbackInfo var1) {
      MixinHelper.noSlowHook(-1, var1);
   }

   @Inject(
      method = {"aiStep"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;canStartSprinting()Z",
         shift = Shift.AFTER
      )}
   )
   private void postStartSprint(CallbackInfo var1) {
      MixinHelper.noSlowHook(1, var1);
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/AbstractClientPlayer;tick()V",
         shift = Shift.BEFORE
      )}
   )
   private void onTick(CallbackInfo var1) {
      MixinHelper.onTick(0);
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;isPassenger()Z",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preTick(CallbackInfo var1) {
      MixinHelper.onPlayerTick(ClientPlayerEntity.class.cast(this), -1, var1);
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "net/minecraft/client/player/LocalPlayer.sendPosition()V",
         shift = Shift.BY,
         by = 2
      )},
      cancellable = true
   )
   private void postTick(CallbackInfo var1) {
      MixinHelper.onPlayerTick(ClientPlayerEntity.class.cast(this), 1, var1);
   }

   @Inject(
      method = {"moveTowardsClosestSpace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushOutOfBlocks(double var1, double var3, CallbackInfo var5) {
      MixinHelper.onPushOutOfBlocks(ClientPlayerEntity.class.cast(this), var5);
   }

   @Inject(
      method = {"move"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preMove(MovementType var1, Vec3d var2, CallbackInfo var3) {
      this.motion = MixinHelper.onPlayerMove(ClientPlayerEntity.class.cast(this), var2, -1, var3);
   }

   @ModifyVariable(
      method = {"move"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/AbstractClientPlayer;move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V",
         shift = Shift.BEFORE
      ),
      ordinal = 0,
      argsOnly = true
   )
   private Vec3d modifyMotion(Vec3d var1) {
      return this.motion;
   }

   @Inject(
      method = {"move"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postMove(MovementType var1, Vec3d var2, CallbackInfo var3) {
      MixinHelper.onPlayerMove(ClientPlayerEntity.class.cast(this), var2, 1, var3);
   }

   @Inject(
      method = {"aiStep"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/Input;tick(ZF)V",
         shift = Shift.AFTER
      )}
   )
   private void postInputTick(CallbackInfo var1) {
      MixinHelper.postInputTick(this.input, 1);
   }
}
