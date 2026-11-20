package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.render.MapRenderer;
import net.minecraft.client.render.MapRenderer.MapTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({MapRenderer.class})
public interface IMixinMapRenderer {
   @Accessor("maps")
   Int2ObjectMap<MapTexture> getMaps();
}
