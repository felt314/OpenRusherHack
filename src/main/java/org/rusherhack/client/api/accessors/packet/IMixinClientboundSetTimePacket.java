package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({WorldTimeUpdateS2CPacket.class})
public interface IMixinClientboundSetTimePacket {
   @Mutable
   @Accessor("dayTime")
   void setDayTime(long var1);
}
