package org.rusherhack;

import net.minecraft.block.Block;
import org.rusherhack.core.event.type.Event;

public class Event460 extends Event {
   public float f7423;
   public Block f7424;
   public static Object[] f7426 = new Object[6];
   public static String[] f7427 = new String[6];

   public float m14425() {
      return this.f7423;
   }

   public void m14426(float var1) {
      this.f7423 = var1;
   }

   public Block m14427() {
      return this.f7424;
   }

   public Event460(Block var1, float var2) {
      super();
      this.f7424 = var1;
      this.f7423 = var2;
   }

   static {
      m122();
   }
   public static void m122() {
      f7426[0] = "!\rQVu{=\u0017S\noo-\u0014\u0018и";
      f7426[1] = "k\u0007\f{\rPk\u0007\u001b'\u0001_qL\u001b9\u0001Jv=JgT\u0001";
      f7426[2] = float.class;
      f7427[2] = "java/lang/Float";
      f7426[3] = "_\f\u0019/OpT\u0003\b`.~_\b\f:";
      f7426[4] = "7j\u001e<\u0015\u000f =BNɅ0f>\u001d~G\u0001#tI<";
      f7426[5] = "\u000bt'p]]\u001c#{\u0002Ɖb\u0018v!hY\u0002]|\"";
   }
}
