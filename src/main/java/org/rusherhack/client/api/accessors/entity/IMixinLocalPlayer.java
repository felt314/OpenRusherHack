package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientPlayerEntity.class})
public interface IMixinLocalPlayer {
   @Accessor("xLast")
   double getLastX();

   @Accessor("yLast1")
   double getLastY();

   @Accessor("zLast")
   double getLastZ();

   @Accessor("lastOnGround")
   boolean wasLastOnGround();

   @Accessor("jumpRidingScale")
   void setJumpRidingScale(float var1);

   @Accessor("usingItemHand")
   Hand getUsingItemHand();

   @Invoker("sendPosition")
   void invokeSendPosition();

   @Invoker("canStartSprinting")
   boolean invokeCanStartSprinting();
}
