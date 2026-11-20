package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class294;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;

public class DoubleArg implements IArg<Double> {
   public static long f1486 = Class066.m4320(-3422591430857541682L, 3749999531038640860L, MethodHandles.lookup().lookupClass()).m4325(222625835194234L);
   public static String f1487;
   public static Object[] f1488 = new Object[11];
   public static String[] f1489 = new String[11];

   public Double parse(CommandProcessingSink var1, String var2) {
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
      f1488[0] = "l_>l>zpE<0$n`Fw!#}f\u0003:-!bbC=l-}dX4'\"{-]80?jq\u00030/<c-i67.cfl+%";
      f1488[1] = "|.$uq<`4&)k(p7m8l;vr 4n$r2'us;|?&(p };m\u0018l$~=-?S;|?&(p };\u00102m\"";
      f1488[2] = "\f0[&t\u0017\u0007?Ji\t\u000f\u00148C ";
      f1488[3] = "g!V\u001dqyl.GR\u001bzx\"L\u0019";
      f1488[4] = "Fw\u000fADzZm\r\u001d^nJnFȥ";
      f1488[5] = double.class;
      f1489[5] = "java/lang/Double";
      f1488[6] = "kHs~t*`Gb1\u0015$kLfk";
      f1488[7] = "Aia\u001e'\u001cDs?\u0003V\u0005\u0012xt\u0015\u001a\u001a\u0006hk\u0015VD\u0015h3\u0000f\u0005\u0006xsxm\u001f\u0010<f\u0000f\r\u0017;\u000f";
      f1488[8] = "\u001f4j<\tnN87!hϿ%p='T,\u00151.7\u0014T\u001c'9q\u0010d]4)1h";
      f1488[9] = "\u000fupv\bj\no.kyu\\zc}>e5%|{GbM.n|@\u000b\u000fupv\bj\no.ky";
      f1488[10] = "#_|,6L~UlM<O;DnM?]zGzs|F-?:#.\u001a9\u000f{0>ZA\u0005h#\"W \u0000r}?&";
   }
}
