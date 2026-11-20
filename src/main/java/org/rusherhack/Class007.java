package org.rusherhack;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.core.event.stage.Stage;

public class Class007 extends Event515 {
   public BlockState f161;
   public int f162;
   public static Object[] f164 = new Object[8];
   public static String[] f165 = new String[8];

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public BlockState m340() {
      return this.f161;
   }

   public int m341() {
      return this.f162;
   }

   public Class007(BlockPos var1, BlockState var2, int var3) {
      super(var1, null);
      this.f161 = var2;
      this.f162 = var3;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m343();
   }
   public static void m343() {
      f164[0] = "\u0016M\u0014\u001c\u0015c\nW\u0016@\u000fw\u001aT]}";
      f164[1] = "jW\r\u0019b\u0003jW\u001aEn\fp\u001c\u001a[n\u0019wmK\u00017Z";
      f164[2] = int.class;
      f165[2] = "java/lang/Integer";
      f164[3] = "\u0013(/E\\\u000e\u000f2-\u0019F\u001a\u001f1f\bA\t\u0019t-\u001dK\u0015\bt;\u001fO\u001c\u0019t\u001b\u001fO\u001c\u0019";
      f164[4] = "@i|\u0014X\u0014Kfm[9\u001a@mi\u0001";
      f164[5] = ":f5$&Y0b4Vϧ93 /)'Ha#*l";
      f164[6] = "zCsG\u001f\u0012|G1\r\"+\u001ag\u0001MK\u0001p\u0017`KOC:";
      f164[7] = "Of<@\bqEb=2ɞ\u0011Fho\u0003Zz\u0000'\"\t";
   }
}
