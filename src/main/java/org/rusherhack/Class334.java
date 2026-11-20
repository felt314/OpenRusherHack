package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.ui.ElementBase;

public class Class334 extends Event515 {
   public static long f5344 = Class066.m4320(158474812177886678L, -3934967725167105866L, MethodHandles.lookup().lookupClass()).m4325(233517844023928L);
   public static String f5345;
   public static Object[] f5346 = new Object[4];

   @Override
   public void setCancelled(boolean var1) {
        
    }

   public Class334(BlockPos var1) {
      super(var1, null);
   }

   static {
   }

   public static String m117(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
   public static void m343() {
      f5346[0] = "72\u0016M,%+(\u0014\u001161;+_\u000029=.\u0005M? 1n\u0004\np\u00154%\u001c\u00060$\u001a!\u0002\u0006";
      f5346[1] = "vD~l\bQ}Ko#uInLfj";
      f5346[2] = ";\u0002\u007f+Io0\rnd(a;\u0006j>";
      f5346[3] = "\u0017\u0007g0uy\u001b^iIc\u0002\u000f\\x#rfM\u0001vI7a\u0005U7-u<\u000b?";
   }
}
