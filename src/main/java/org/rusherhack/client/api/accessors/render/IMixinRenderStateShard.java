package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import net.minecraft.client.render.RenderPhase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({RenderPhase.class})
public interface IMixinRenderStateShard {
   @Accessor("setupState")
   Runnable getSetupState();

   @Mutable
   @Accessor("setupState")
   void setSetupState(Runnable var1);

   @Accessor("clearState")
   Runnable getClearState();

   @Mutable
   @Accessor("clearState")
   void setClearState(Runnable var1);
}
