package org.rusherhack.client.api.feature.command.arg;
import org.rusherhack.*;

import net.minecraft.item.Item;
public class ItemReference {
   public static Item[] f572;
   public static String f573;
   public static Object[] f575 = new Object[12];
   public static String[] f576 = new String[12];

   ItemReference(Item[] var1, String var2) {
    }

   public ItemReference(Item var1) {
        this(new Item[]{var1}, var1.getTranslationKey());
      boolean var10003 = true;

   }

   public Item[] items() {
        return null;
    }

   public String description() {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
        
    }
}
