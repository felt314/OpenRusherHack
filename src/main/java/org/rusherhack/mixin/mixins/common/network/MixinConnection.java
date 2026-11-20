package org.rusherhack.mixin.mixins.common.network;
import org.rusherhack.*;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.packet.Packet;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.rusherhack.command.disconnect;
@Mixin(
   value = {ClientConnection.class},
   priority = 999
)
public class MixinConnection {
   @Inject(
      method = {"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preChannelRead0(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      MixinHelper.onReceivePacket(var2, var3, false);
   }

   @Inject(
      method = {"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void postChannelRead0(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      MixinHelper.onReceivePacket(var2, var3, true);
   }

   @Inject(
      method = {"sendPacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preSendPacket(Packet<?> var1, PacketCallbacks var2, boolean var3, CallbackInfo var4) {
      MixinHelper.sendPacket(var1, var4, false);
   }

   @Inject(
      method = {"sendPacket"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postSendPacket(Packet<?> var1, PacketCallbacks var2, boolean var3, CallbackInfo var4) {
      MixinHelper.sendPacket(var1, var4, true);
   }

   @Inject(
      method = {"disconnect(Lnet/minecraft/network/DisconnectionDetails;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onDisconnect(CallbackInfo var1) {
      MixinHelper.onDisconnect(0, var1);
   }
}
