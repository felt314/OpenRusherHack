package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.util.BufferAllocator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({BufferAllocator.class})
public interface IMixinByteBufferBuilder {
   @Accessor("pointer")
   long getPointer();
}
