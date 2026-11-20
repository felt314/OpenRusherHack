package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PlayerInteractEntityC2SPacket.class})
public interface IMixinServerboundInteractPacket {
   @Accessor("entityId")
   int getEntityId();
}
