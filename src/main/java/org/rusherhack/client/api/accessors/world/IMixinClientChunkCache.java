package org.rusherhack.client.api.accessors.world;
import org.rusherhack.*;

import net.minecraft.client.world.ClientChunkManager;
import net.minecraft.client.world.ClientChunkManager.ClientChunkMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ClientChunkManager.class})
public interface IMixinClientChunkCache {
   @Accessor("storage")
   ClientChunkMap getStorage();
}
