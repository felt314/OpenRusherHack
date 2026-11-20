package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({GameRenderer.class})
public interface IMixinGameRenderer {
   @Accessor("renderBlockOutline")
   void setRenderBlockOutline(boolean var1);

   @Invoker("bobView")
   void invokeBobView(MatrixStack var1, float var2);
}
