package org.rusherhack.client.api.accessors.client;
import org.rusherhack.*;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientConnection.class})
public interface IMixinConnection {
   @Accessor("channel")
   Channel getChannel();

   @Invoker("doSendPacket")
   void invokeDoSendPacket(Packet<?> var1, @Nullable PacketCallbacks var2, boolean var3);

   @Invoker("channelRead0")
   void invokeChannelRead0(ChannelHandlerContext var1, Packet<?> var2);

   @Invoker("genericsFtw")
   static <T extends PacketListener> void invokeGenericsFtw(Packet<T> var0, PacketListener var1) {
   }
}
