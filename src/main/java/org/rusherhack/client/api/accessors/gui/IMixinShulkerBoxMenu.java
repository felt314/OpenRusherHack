package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ShulkerBoxScreenHandler.class})
public interface IMixinShulkerBoxMenu {
   @Accessor("container")
   Inventory getContainer();
}
