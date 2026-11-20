package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({AbstractClientPlayerEntity.class})
public interface IMixinAbstractClientPlayer {
   @Accessor("playerInfo")
   void setPlayerInfo(PlayerListEntry var1);

   @Invoker("getPlayerInfo")
   PlayerListEntry invokeGetPlayerInfo();
}
