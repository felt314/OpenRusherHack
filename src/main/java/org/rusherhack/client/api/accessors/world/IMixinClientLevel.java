package org.rusherhack.client.api.accessors.world;
import org.rusherhack.*;

import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientWorld.class})
public interface IMixinClientLevel {
   @Invoker("getBlockStatePredictionHandler")
   PendingUpdateManager invokeGetBlockStatePredictionHandler();
}
