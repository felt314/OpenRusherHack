package org.rusherhack.mixin.mixins.common.entity;
import org.rusherhack.*;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractClientPlayerEntity.class})
public abstract class MixinAbstractClientPlayer {
   @Shadow
   @Nullable
   public abstract PlayerListEntry getPlayerListEntry();

   @Inject(
      method = {"getSkin"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getPlayerSkin(CallbackInfoReturnable<SkinTextures> var1) {
      MixinHelper.getPlayerSkin(var1, AbstractClientPlayerEntity.class.cast(this), this.getPlayerListEntry());
   }
}
