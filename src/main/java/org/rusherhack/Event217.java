package org.rusherhack;

import net.minecraft.block.Block;
import org.rusherhack.core.event.type.Event;

public class Event217 extends Event {
   public Block f4040;
   public float f4041;
   public static Object[] f4043 = new Object[6];
   public static String[] f4044 = new String[6];

   public void m8314(float var1) {
      this.f4041 = var1;
   }

   public Event217(Block var1, float var2) {
      super();
      this.f4040 = var1;
      this.f4041 = var2;
   }

   public float m8315() {
      return this.f4041;
   }

   public Block m8316() {
      return this.f4040;
   }

   static {
      m122();
   }
   public static void m122() {
      f4043[0] = "Zy,w`aFc.+zuV`eǦ";
      f4043[1] = "OGnh\t\u0006OGy4\u0005\tU\fy*\u0005\u001cR}(tPW";
      f4043[2] = float.class;
      f4044[2] = "java/lang/Float";
      f4043[3] = "'wz4!2,xk{@<'so!";
      f4043[4] = "A\u000fCsM\u0017\u0010\u0017_\tő{\u0014\u0003\u001fg@\u001dL\u001f\u0019m";
      f4043[5] = "\u0013Eh\u0011|cB]tkў\u000fFK8\u0004\u007fdFK8\u0016";
   }
}
