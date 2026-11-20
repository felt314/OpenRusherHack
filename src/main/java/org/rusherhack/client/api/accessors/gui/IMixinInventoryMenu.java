package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.screen.PlayerScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PlayerScreenHandler.class})
public interface IMixinInventoryMenu {
   @Accessor("craftSlots")
   RecipeInputInventory getCraftSlots();

   @Accessor("resultSlots")
   CraftingResultInventory getResultSlots();
}
