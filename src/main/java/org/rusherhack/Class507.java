package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Class507 {
   public static boolean f8137 = true;
   public static boolean f8138 = false;
   public static String f8139;
   public static long f8140 = Class066.m4320(-1350446922358659024L, -7858633415494844631L, MethodHandles.lookup().lookupClass()).m4325(106232224819905L);
   public static Object[] f8141 = new Object[9];
   public static String[] f8142 = new String[9];

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
   public static void m122() {
      f8141[0] = "S\u0017\u001a\"[vX\u0018\u000bm&nK\u001f\u0002$";
      f8141[1] = int.class;
      f8142[1] = "java/lang/Integer";
      f8141[2] = ">\u0013)}c\u0015\"\t+!y\u00012\n`ӳ";
      f8141[3] = "\u000fl\u0019?Q[\u0013v\u001bcKO\u0003uPɥ";
      f8141[4] = char.class;
      f8142[4] = "java/lang/Character";
      f8141[5] = "@\u0007g-HFK\bvb)H@\u0003r8";
      f8141[6] = "\u0015v97M\u007f\u001dw5<p},#>t\u001aiSx}c\r\u0014\u0016c=g\rkM *pp";
      f8141[7] = "m]k}c=t\u0016w\u001bn\"j\bo{\n4k\u001cwcm51\u001b\u0013";
      f8141[8] = "`ML9\u0014Vy\u0006P_\u0016Dh\r}#}_f\fP'\u001a^<\u000b4dEN\u007fMJ.\u0004_;w";
   }
}
