package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.client.api.feature.module.impl.misc.ExtraCraft;
public class Class082 extends StringSetting {
   public static long f2121 = Class066.m4320(6604632490569383691L, -1989441178445840225L, MethodHandles.lookup().lookupClass()).m4325(34642729505420L);
   public static String f2122;
   public static Object[] f2123 = new Object[6];

   public Class082(ExtraCraft var1, String var2, String var3) {
      super(var2, var3);
   }

   @Override
   public String getDisplayValue() {
        return null;
    }

   static {
   }

   public static String m656(byte[] var0) {
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
   public static void m157() {
      f2123[0] = "Gy\u0004Z<'Lv\u0015\u0015A?_q\u001c\\";
      f2123[1] = "Yka8yKRdpw\u0014ORxD<&RVdt<";
      f2123[2] = "0|\u00025ef,f\u0000i\u007fr<eKЫ";
      f2123[3] = "1\u0018y\u0018\u001a\u0017:\u0017hW{\u00191\u001cl\r";
      f2123[4] = "|y\u0017 =\u000f'/PK#\u0006;p\u0003 4k3vTw;\bxlSK)\t}(\b(b\u0013z\u0014U&$\u0000'p\u000epck";
      f2123[5] = "0i\u0005\u00199[tn\b\nUѥ\t8\u0001\u0014>\u0006mcWSU]dz\u0007\r1\u00062=l";
   }
}
