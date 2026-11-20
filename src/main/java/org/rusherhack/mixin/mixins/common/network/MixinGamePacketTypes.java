package org.rusherhack.mixin.mixins.common.network;
import org.rusherhack.*;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.listener.ServerPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.network.packet.PlayPackets;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayPackets.class})
public class MixinGamePacketTypes {
   @Inject(
      method = {"createClientbound"},
      at = {@At("RETURN")}
   )
   private static <T extends Packet<ServerPlayPacketListener>> void createClientbound(String var0, CallbackInfoReturnable<PacketType<T>> var1) {
      PacketType var2 = (PacketType)var1.getReturnValue();
      MixinHelper.onRegisterPacket(NetworkSide.CLIENTBOUND, var2);
   }

   @Inject(
      method = {"createServerbound"},
      at = {@At("RETURN")}
   )
   private static <T extends Packet<ServerPlayPacketListener>> void createServerbound(String var0, CallbackInfoReturnable<PacketType<T>> var1) {
      PacketType var2 = (PacketType)var1.getReturnValue();
      MixinHelper.onRegisterPacket(NetworkSide.SERVERBOUND, var2);
   }
}
