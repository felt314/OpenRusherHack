package org.rusherhack;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
public class Class438 {
   public static void m13992(ItemStack var0, DefaultedList<ItemStack> var1) {
      if (var0.contains(DataComponentTypes.CONTAINER)) {
         ((ContainerComponent)var0.get(DataComponentTypes.CONTAINER)).copyTo(var1);
      }
   }
}
