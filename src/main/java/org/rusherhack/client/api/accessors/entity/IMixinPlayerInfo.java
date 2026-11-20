package org.rusherhack.client.api.accessors.entity;
import org.rusherhack.*;

import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.world.GameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({PlayerListEntry.class})
public interface IMixinPlayerInfo {
   @Invoker("setGameMode")
   void invokeSetGameMode(GameMode var1);
}
