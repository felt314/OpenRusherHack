package org.rusherhack.mixin.mixins.common.world.item;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({TridentItem.class})
public class MixinTridentItem {
   @Unique
   private boolean rusherhack$oldInWater;

   @Inject(
      method = {"use"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preUseTrident(World var1, PlayerEntity var2, Hand var3, CallbackInfoReturnable<TypedActionResult<ItemStack>> var4) {
      if (var2 == MinecraftClient.getInstance().player) {
         this.rusherhack$oldInWater = var2.isTouchingWater();
         if (MixinHelper.shouldTridentBoost()) {
            IMixinEntity var5 = (IMixinEntity)var2;
            var5.setTouchingWater(true);
         }
      }
   }

   @Inject(
      method = {"use"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postUseTrident(World var1, PlayerEntity var2, Hand var3, CallbackInfoReturnable<TypedActionResult<ItemStack>> var4) {
      if (var2 == MinecraftClient.getInstance().player) {
         IMixinEntity var5 = (IMixinEntity)var2;
         var5.setTouchingWater(this.rusherhack$oldInWater);
      }
   }

   @Inject(
      method = {"releaseUsing"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preReleaseUsingTrident(ItemStack var1, World var2, LivingEntity var3, int var4, CallbackInfo var5) {
      if (var3 == MinecraftClient.getInstance().player) {
         this.rusherhack$oldInWater = var3.isTouchingWater();
         if (MixinHelper.shouldTridentBoost()) {
            IMixinEntity var6 = (IMixinEntity)var3;
            var6.setTouchingWater(true);
         }
      }
   }

   @Inject(
      method = {"releaseUsing"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postReleaseUsingTrident(ItemStack var1, World var2, LivingEntity var3, int var4, CallbackInfo var5) {
      if (var3 == MinecraftClient.getInstance().player) {
         IMixinEntity var6 = (IMixinEntity)var3;
         var6.setTouchingWater(this.rusherhack$oldInWater);
      }
   }

   @ModifyVariable(
      method = {"releaseUsing"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private int modifyTimeCharged(int var1) {
      return MixinHelper.shouldInstantTrident() ? 0 : var1;
   }
}
