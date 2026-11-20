package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.player.BlockBreakingInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({WorldRenderer.class})
public interface IMixinLevelRenderer {
   @Accessor("destroyingBlocks")
   Int2ObjectMap<BlockBreakingInfo> getDestroyingBlocks();
}
