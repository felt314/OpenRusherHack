package org.rusherhack.mixin.mixins.common.network;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientPlayNetworkHandler.class})
public class MixinClientPacketListener {
   @Inject(
      method = {"sendChat"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChat(String var1, CallbackInfo var2) {
      MixinHelper.sendChatMessage(var1, var2, ClientPlayNetworkHandler.class.cast(this));
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")}
   )
   private void onDisconnect(CallbackInfo var1) {
      MixinHelper.onDisconnect(1, var1);
   }

   @Inject(
      method = {"handleSetHealth"},
      at = {@At("RETURN")}
   )
   private void handleSetHealth(HealthUpdateS2CPacket var1, CallbackInfo var2) {
      MixinHelper.onHealthUpdate(var1.getHealth());
   }
}
