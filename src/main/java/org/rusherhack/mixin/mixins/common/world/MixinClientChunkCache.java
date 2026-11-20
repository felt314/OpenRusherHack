package org.rusherhack.mixin.mixins.common.world;
import org.rusherhack.*;

import java.util.function.Consumer;
import net.minecraft.client.world.ClientChunkManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.s2c.play.ChunkData.BlockEntityVisitor;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.WorldChunk;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ClientChunkManager.class})
public class MixinClientChunkCache {
   @Shadow
   @Final
   private ClientWorld world;

   @Inject(
      method = {"replaceWithPacketData"},
      at = {@At("HEAD")}
   )
   private void preLoadChunk(
      int var1, int var2, PacketByteBuf var3, NbtCompound var4, Consumer<BlockEntityVisitor> var5, CallbackInfoReturnable<WorldChunk> var6
   ) {
      MixinHelper.onLoadChunk(var1, var2, this.world.getChunk(var1, var2), var6, -1);
   }

   @Inject(
      method = {"replaceWithPacketData"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/ClientLevel;onChunkLoaded(Lnet/minecraft/world/level/ChunkPos;)V",
         shift = Shift.BEFORE
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void postLoadChunk(
      int var1,
      int var2,
      PacketByteBuf var3,
      NbtCompound var4,
      Consumer<BlockEntityVisitor> var5,
      CallbackInfoReturnable<WorldChunk> var6,
      int var7,
      WorldChunk var8
   ) {
      MixinHelper.onLoadChunk(var1, var2, var8, var6, 0);
   }

   @Inject(
      method = {"replaceWithPacketData"},
      at = {@At("RETURN")}
   )
   private void postLoadChunk(
      int var1, int var2, PacketByteBuf var3, NbtCompound var4, Consumer<BlockEntityVisitor> var5, CallbackInfoReturnable<WorldChunk> var6
   ) {
      MixinHelper.onLoadChunk(var1, var2, this.world.getChunk(var1, var2), var6, 1);
   }

   @Inject(
      method = {"drop"},
      at = {@At("RETURN")}
   )
   private void postUnloadChunk(ChunkPos var1, CallbackInfo var2) {
      MixinHelper.onUnloadChunk(var1.x, var1.z, var2);
   }
}
