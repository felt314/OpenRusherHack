package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class142 extends Class236 {
   public static long f2939 = Class066.m4320(-436961003671059842L, 6099750023096674874L, MethodHandles.lookup().lookupClass()).m4325(182445614332047L);
   public static String f2940;
   public static Object[] f2941 = new Object[14];
   public static String[] f2942 = new String[14];

   public Class142(Enum186 var1, String var2) {
    }

   @Override
   public String m6376() {
        return null;
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
   public static void m194() {
      f2941[0] = "ONF8OYSTDdUMCW\u000fį";
      f2941[1] = "f4\f\u001dH0z.\u000eAR$j-Eƹ";
      f2941[2] = "x0 qecd*\"-\u007fwt)iə";
      f2941[3] = int.class;
      f2942[3] = "java/lang/Integer";
      f2941[4] = "\u000fBz\u00178\u001f\u0004MkXE\u0007\u0017Jb\u0011";
      f2941[5] = "sJ)\u001fBloP+CXx\u007fS`ɲ";
      f2941[6] = "KUT)\u001epWOVu\u0004dGL\u001dɳ";
      f2941[7] = "l)UY-Ig&D\u0016LGl-@L";
      f2941[8] = "\u0007)/\u0014N^Rqs\nrҚ<q/\u001e\u001cE\\3}\u0018\u001c/\u0007&/\u001c\u0018OEt)\u001cr";
      f2941[9] = "\u001b(*\u000fd\u000b\u0015xadӧdM.3U*\u0018\u000bd6\u0002";
      f2941[10] = "\u0012\u001a{,&\u007f\u0014Y()Fԡ+Xw!$$DYx7#A";
      f2941[11] = "\u001dutz/2_'rzE,O}ey\u0002<&#~x'7I\"qn R\u001dutz/2_'rzE";
      f2941[12] = "\u0010*s\u0003<,V`vTLȯ)(~^.5F)qH)";
      f2941[13] = "\u0019<\u00070Y\u0002\u0017lL[\u000emJa\u001a \u000e\u0001Jm\n$gQ\u0015m\u000e2\u000bQ\u0019}\n[";
   }
}
