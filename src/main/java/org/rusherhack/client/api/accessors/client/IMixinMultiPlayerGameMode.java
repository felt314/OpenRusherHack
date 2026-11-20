package org.rusherhack.client.api.accessors.client;
import org.rusherhack.*;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientPlayerInteractionManager.class})
public interface IMixinMultiPlayerGameMode {
   @Accessor("connection")
   ClientPlayNetworkHandler getConnection();

   @Accessor("destroyBlockPos")
   BlockPos getDestroyBlockPos();

   @Accessor("destroyProgress")
   float getDestroyProgress();

   @Accessor("destroyProgress")
   void setDestroyProgress(float var1);

   @Accessor("destroyDelay")
   int getDestroyDelay();

   @Accessor("destroyDelay")
   void setDestroyDelay(int var1);

   @Accessor("isDestroying")
   void setIsDestroying(boolean var1);

   @Invoker("startPrediction")
   void invokeStartPrediction(ClientWorld var1, SequencedPacketCreator var2);

   @Invoker("ensureHasSentCarriedItem")
   void invokeEnsureHasSentCarriedItem();

   @Invoker("performUseItemOn")
   ActionResult invokePerformUseItemOn(ClientPlayerEntity var1, Hand var2, BlockHitResult var3);
}
