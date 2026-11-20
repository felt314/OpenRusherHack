package org.rusherhack;

import net.minecraft.entity.Entity;
import org.rusherhack.core.event.type.EventCancellable;

public class Event516 extends EventCancellable {
   public Entity f8225;
   public double f8226;
   public double f8227;
   public static Object[] f8229 = new Object[7];
   public static String[] f8230 = new String[7];

   public Event516(Entity var1, double var2, double var4) {
      this.f8225 = var1;
      this.f8226 = var2;
      this.f8227 = var4;
   }

   public Entity m15868() {
      return this.f8225;
   }

   public double m15869() {
      return this.f8227;
   }

   public double m15870() {
      return this.f8226;
   }

   static {
      m122();
   }
   public static void m122() {
      f8229[0] = "0\u0017O2-\u0000,\rMn7\u0014<\u000e\u0006Ҭ";
      f8229[1] = "\u000bOV[q/\u000bOA\u0007} \u0011\u0004A\u0019}5\u0016u\u0013G%q";
      f8229[2] = double.class;
      f8230[2] = "java/lang/Double";
      f8229[3] = "\"\u001bXMBt)\u0014I\u0002#z\"\u001fMX";
      f8229[4] = "\u0016:RMIE\u0011`S*Ђ%\u00100VZLX\u0019cWP";
      f8229[5] = "sW4D#\u0003t\r5#ŷcu[1\\s\u0012=\u000b/O";
      f8229[6] = "\u0003G9\f2/\u0004\u001d8k˹O\u0005M=\u001b72\f\u001e<\u0011";
   }
}
