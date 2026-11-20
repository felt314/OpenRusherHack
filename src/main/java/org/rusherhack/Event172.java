package org.rusherhack;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.rusherhack.core.event.type.Event;

public class Event172 extends Event {
   public List<Text> f3423;
   public ItemStack f3424;
   public static Object[] f3426 = new Object[6];

   public Event172(ItemStack var1, List<Text> var2) {
      this.f3424 = var1;
      this.f3423 = var2;
   }

   public List<Text> m7224() {
      return this.f3423;
   }

   public ItemStack m7225() {
      return this.f3424;
   }

   static {
      m122();
   }
   public static void m122() {
      f3426[0] = ":w]T?\u0000&m_\b%\u00146n\u0014ċ";
      f3426[1] = "\u0004?@\u0015Eh\u0004?WIIg\u001etWWIr\u0019\u0005\u0005\f\u00118";
      f3426[2] = "67WxP=(?M72!/\"";
      f3426[3] = "14S;Zs:;Bt;}10F.";
      f3426[4] = ">Jl#@B2\u0003oHʫ\"7JosMInC{2";
      f3426[5] = "\u0002HP\",x\u000e\u0001SIԘ\u0018L^X1k.LGV";
   }
}
