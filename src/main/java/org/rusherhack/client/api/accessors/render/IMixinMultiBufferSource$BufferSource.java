package org.rusherhack.client.api.accessors.render;
import net.minecraft.client.render.VertexConsumerProvider;
import org.rusherhack.*;

import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Immediate.class})
public interface IMixinMultiBufferSource$BufferSource {
   @Accessor("sharedBuffer")
   BufferAllocator getSharedBuffer();

   @Accessor("sharedBuffer")
   @Mutable
   void setSharedBuffer(BufferAllocator var1);
}
