package org.rusherhack;

import net.minecraft.client.option.KeyBinding;
import org.rusherhack.core.event.type.Event;

public abstract class Event249 extends Event {
   public KeyBinding f4389;
   public static Object[] f4391 = new Object[4];

   public Event249(KeyBinding var1) {
      this.f4389 = var1;
   }

   public KeyBinding m8984() {
      return this.f4389;
   }

   static {
      m122();
   }
   public static void m122() {
      f4391[0] = "\u001888\u0011P\u0014\u0004\":MJ\u0000\u0014!qǂ";
      f4391[1] = "Wr\u0000y\fkWr\u0017%\u0000dM9\u0017;\u0000qJHGgU";
      f4391[2] = "7\ngeL\u0006<\u0005v*-\b7\u000erp";
      f4391[3] = "c\u001eAP@dc]Z4ǭ\u0004}\u001bYEDgg^A";
   }
}
