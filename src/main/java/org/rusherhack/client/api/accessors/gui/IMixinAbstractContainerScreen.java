package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({HandledScreen.class})
public interface IMixinAbstractContainerScreen {
   @Accessor("hoveredSlot")
   Slot getHoveredSlot();

   @Accessor("imageWidth")
   int getImageWidth();

   @Accessor("imageHeight")
   int getImageHeight();
}
