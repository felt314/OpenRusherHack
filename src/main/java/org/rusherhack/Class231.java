package org.rusherhack;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.collection.DefaultedList;
import org.rusherhack.client.api.Globals;

public class Class231 extends HandledScreen<CraftingScreenHandler> {
   public static Identifier f4185;
   public void drawBackground(DrawContext var1, float var2, int var3, int var4) {
        
    }

   Class231(Pair<DefaultedList<ItemStack>, ItemStack> var1) {
      super(null, null, net.minecraft.text.Text.empty());
    }

   public void onMouseClick(Slot var1, int var2, int var3, SlotActionType var4) {
        
    }
}
