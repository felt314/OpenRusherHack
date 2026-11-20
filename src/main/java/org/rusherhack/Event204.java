package org.rusherhack;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.screen.slot.Slot;
import org.rusherhack.core.event.type.Event;

public class Event204 extends Event {
   public DrawContext f3810;
   public Slot f3811;
   public static Object[] f3813 = new Object[6];

   public DrawContext m7917() {
      return this.f3810;
   }

   public Slot m7918() {
      return this.f3811;
   }

   public Event204(DrawContext var1, Slot var2) {
      this.f3810 = var1;
      this.f3811 = var2;
   }

   static {
      m122();
   }
   public static void m122() {
      f3813[0] = "OV\u0014^\u001e3SL\u0016\u0002\u0004'CO]Ǔ";
      f3813[1] = "e\fc\u0012R5e\ftN^:\u007fGtP^/x6&\u000b\fi";
      f3813[2] = "kWKYo\u0005kW\\\u0005c\nq\u001c\\\u001bc\u001fvm\fD0";
      f3813[3] = "\u0015/6q\u0017 \u001e '>v.\u0015+#d";
      f3813[4] = "6b\u0000T\u0014Vj}\u0000(ԛo2x\u001f\u0015\u0006V1hM\u0016";
      f3813[5] = ";V^G\u0005\u0006gI^;ҍ??X\u001e\nHDv\u000bJ[";
   }
}
