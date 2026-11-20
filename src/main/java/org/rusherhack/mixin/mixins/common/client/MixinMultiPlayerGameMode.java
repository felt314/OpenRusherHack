package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ClientPlayerInteractionManager.class})
public class MixinMultiPlayerGameMode {
   @Inject(
      method = {"destroyBlock"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/level/block/Block;playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;",
         shift = Shift.AFTER
      )}
   )
   private void onDestroyBlock(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      MixinHelper.onDestroyBlock(var1, var2);
   }

   @Inject(
      method = {"performUseItemOn"},
      at = {@At("HEAD")}
   )
   private void preInteract(ClientPlayerEntity var1, Hand var2, BlockHitResult var3, CallbackInfoReturnable<ActionResult> var4) {
      MixinHelper.forcePlaceItemHook(var1, var2);
   }

   @Inject(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;ensureHasSentCarriedItem()V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preAttack(PlayerEntity var1, Entity var2, CallbackInfo var3) {
      MixinHelper.onAttack(var1, var2, var3, -1);
   }

   @Inject(
      method = {"attack"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postAttack(PlayerEntity var1, Entity var2, CallbackInfo var3) {
      MixinHelper.onAttack(var1, var2, var3, 1);
   }

   @Inject(
      method = {"interact"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;ensureHasSentCarriedItem()V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preInteract(PlayerEntity var1, Entity var2, Hand var3, CallbackInfoReturnable<ActionResult> var4) {
      MixinHelper.onInteract(var1, var2, null, var3, var4, -1);
   }

   @Inject(
      method = {"interact"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postInteract(PlayerEntity var1, Entity var2, Hand var3, CallbackInfoReturnable<ActionResult> var4) {
      MixinHelper.onInteract(var1, var2, null, var3, var4, 1);
   }

   @Inject(
      method = {"interactAt"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;ensureHasSentCarriedItem()V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preInteractAt(PlayerEntity var1, Entity var2, EntityHitResult var3, Hand var4, CallbackInfoReturnable<ActionResult> var5) {
      MixinHelper.onInteract(var1, var2, var3, var4, var5, -1);
   }

   @Inject(
      method = {"interactAt"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postInteractAt(PlayerEntity var1, Entity var2, EntityHitResult var3, Hand var4, CallbackInfoReturnable<ActionResult> var5) {
      MixinHelper.onInteract(var1, var2, var3, var4, var5, 1);
   }

   @Inject(
      method = {"startDestroyBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preStartDestroyBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onHitBlock(var1, var2, var3, -1);
   }

   @Inject(
      method = {"startDestroyBlock"},
      at = {@At("RETURN")}
   )
   private void postStartDestroyBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onHitBlock(var1, var2, var3, 1);
   }

   @Inject(
      method = {"continueDestroyBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preContinueDestroyBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onDamageBlock(var1, var2, var3, -1);
   }

   @Inject(
      method = {"continueDestroyBlock"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/tutorial/Tutorial;onDestroyBlock(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)V",
         shift = Shift.BEFORE
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void onContinueDestroyBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onDamageBlock(var1, var2, var3, 0);
   }

   @Inject(
      method = {"continueDestroyBlock"},
      at = {@At("RETURN")}
   )
   private void postContinueDestroyBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      MixinHelper.onDamageBlock(var1, var2, var3, 1);
   }

   @Inject(
      method = {"stopDestroyBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onStopDestroyBlock(CallbackInfo var1) {
      MixinHelper.onStopDestroyBlock(var1);
   }

   @Inject(
      method = {"releaseUsingItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void releaseUsingItem(PlayerEntity var1, CallbackInfo var2) {
      MixinHelper.onReleaseUseItem(var2);
   }
}
