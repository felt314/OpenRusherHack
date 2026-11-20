package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.util.BufferAllocator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({BufferBuilder.class})
public interface IMixinBufferBuilder {
   @Accessor("building")
   boolean isBuilding();

   @Accessor("buffer")
   BufferAllocator getBuffer();
}
