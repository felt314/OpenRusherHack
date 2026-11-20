package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PlayerInputC2SPacket.class})
public interface IMixinServerboundPlayerInputPacket {
   @Accessor("isShiftKeyDown")
   @Mutable
   void setIsShiftKeyDown(boolean var1);
}
