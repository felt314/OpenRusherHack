package org.rusherhack.client.api.feature.command.arg;
import org.rusherhack.*;

import net.minecraft.enchantment.Enchantment;
import org.rusherhack.core.setting.Setting;

public record EnchantReference(Enchantment[] enchantments, int[] levels) {
   public static Enchantment[] f567;
   public static int[] f568;
   public static Object[] f570 = new Object[21];
   public static String[] f571 = new String[21];

   public EnchantReference {}

   EnchantReference(Enchantment var1, int var2) { this(new Enchantment[]{var1}, new int[]{var2}); }

   static {
      m122();
   }
   public static void m122() {
        
    }
}
