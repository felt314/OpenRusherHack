package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.message.LastSeenMessagesCollector;
import net.minecraft.network.message.MessageChain.Packer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ClientPlayNetworkHandler.class})
public interface IMixinClientPacketListener {
   @Accessor("lastSeenMessages")
   LastSeenMessagesCollector getLastSeenMessages();

   @Accessor("signedMessageEncoder")
   Packer getSignedMessageEncoder();
}
