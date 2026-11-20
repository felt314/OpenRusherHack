package org.rusherhack.mixin.mixins.common.client.gui.overlay;
import org.rusherhack.*;

import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.option.GameOptions;
import net.minecraft.text.MutableText;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerListHud.class})
public class MixinPlayerTabOverlay {
   @Inject(
      method = {"getPlayerInfos"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getPlayerInfos(CallbackInfoReturnable<List<PlayerListEntry>> var1) {
      MixinHelper.getTabListPlayers(var1);
   }

   @ModifyConstant(
      method = {"getPlayerInfos"},
      constant = {@Constant(
         longValue = 80L
      )},
      require = 0
   )
   private long getPlayerListLimit(long var1) {
      return MixinHelper.modifyPlayerListLimit(var1);
   }

   @Inject(
      method = {"decorateName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void decorateName(PlayerListEntry var1, MutableText var2, CallbackInfoReturnable<MutableText> var3) {
      MixinHelper.decorateName(var1, var2, var3);
   }

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Options;getBackgroundColor(I)I"
      )
   )
   private int getTablistItemColor(GameOptions var1, int var2) {
      return MixinHelper.getTabListItemColor(var1, var2);
   }

   @ModifyConstant(
      method = {"render"},
      constant = {@Constant(
         intValue = 20
      )},
      require = 0
   )
   private int changeHeight(int var1) {
      return MixinHelper.getTabListHeight(var1);
   }

   @ModifyConstant(
      method = {"render"},
      constant = {@Constant(
         intValue = Integer.MIN_VALUE
      )}
   )
   private int changeBackgroundColor(int var1) {
      return MixinHelper.getTabListBackgroundColor(var1);
   }

   @Inject(
      method = {"renderPingIcon"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderPingIcon(DrawContext var1, int var2, int var3, int var4, PlayerListEntry var5, CallbackInfo var6) {
      MixinHelper.onRenderTablistPingIcon(var1, var2 + var3, var4, var5, var6);
   }
}
