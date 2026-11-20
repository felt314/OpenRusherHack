package org.rusherhack.mixin.mixins.common.network.packet;
import org.rusherhack.*;

import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({PlayerInteractEntityC2SPacket.class})
public class MixinServerboundInteractPacket {
}
