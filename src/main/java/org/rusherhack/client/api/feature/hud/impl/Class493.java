package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Class493 extends TextHudElement {
   public static long f7990 = Class066.m4320(4916261419736651247L, -450142331994045278L, MethodHandles.lookup().lookupClass()).m4325(203510461378139L);
   public static String f7991;
   public static Object[] f7992 = new Object[7];

   public Class493() {
    }

   @Override
   public String getText() {
      return Class170.f3364.m7107().m14145();
   }

   static {
   }

   public static String m221(byte[] var0) {
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
   public static void m273() {
      f7992[0] = "M\u000ft\u0003Y\u007fQ\u0015v_CkA\u0016=ņ";
      f7992[1] = "\u0019]Rq\u0000i\u0005GP-\u001a}\u0015D\u001bѲ";
      f7992[2] = "\tymI)\u0002\u0002v|\u0006T\u001a\u0011quO";
      f7992[3] = "7\u001b.7\u001d\u0003<\u0014?x|\r7\u001f;\"";
      f7992[4] = "|,.D+9u./.ՔY(gx\u0013/%s`mKN";
      f7992[5] = "-\u0013U>,\u0006$\u0011TTϷf-\u0013U>,\u0006$\u0011T";
      f7992[6] = "5thgf`ns}?\u0007Ҭ\fte1dxo0o(g\u001c";
   }
}
