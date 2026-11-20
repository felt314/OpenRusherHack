package org.rusherhack.client.api.accessors.packet;
import org.rusherhack.*;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({EntityVelocityUpdateS2CPacket.class})
public interface IMixinClientboundSetEntityMotionPacket {
   @Accessor("xa")
   int getMotionX();

   @Accessor("xa")
   @Mutable
   void setMotionX(int var1);

   @Accessor("ya")
   int getMotionY();

   @Accessor("ya")
   @Mutable
   void setMotionY(int var1);

   @Accessor("za")
   int getMotionZ();

   @Accessor("za")
   @Mutable
   void setMotionZ(int var1);
}
