package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.render.RenderLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({RenderLayer.class})
public interface IMixinRenderType {
   @Accessor("sortOnUpload")
   boolean isTranslucent();
}
