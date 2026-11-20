package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({Screen.class})
public interface IMixinScreen {
   @Accessor("initialized")
   boolean isInitialized();

   @Invoker("addRenderableWidget")
   <T extends Element & Drawable & Selectable> T invokeAddRenderableWidget(T var1);

   @Invoker("removeWidget")
   void invokeRemoveWidget(Element var1);
}
