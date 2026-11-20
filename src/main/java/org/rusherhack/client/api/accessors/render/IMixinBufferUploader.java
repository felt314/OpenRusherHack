package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.gl.VertexBuffer;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({BufferRenderer.class})
public interface IMixinBufferUploader {
   @Accessor("lastImmediateBuffer")
   static VertexBuffer getLastImmediateBuffer() {
      return null;
   }

   @Invoker("bindImmediateBuffer")
   static VertexBuffer bindImmediateBuffer(VertexFormat var0) {
      return null;
   }
}
