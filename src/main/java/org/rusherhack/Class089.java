package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;

public class Class089 extends TextComponent {
   public static long f2247 = Class066.m4320(2852447619107416112L, -785761741053632573L, MethodHandles.lookup().lookupClass()).m4325(127470890355768L);
   public static String f2248;
   public static Object[] f2249 = new Object[7];

   public Class089(Configs var1, Window var2) {
      super(var2);
   }

   @Override
   public String getText() {
      return f2248 + Class170.f3364.m7107().m14145();
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
   public static void m157() {
      f2249[0] = "cQ1\u0013Aq\u007fK3O[eoHxŖ";
      f2249[1] = "\u0012\b(\u0019>E\u000e\u0012*E.Q\u001e\u0011aК";
      f2249[2] = "[\n\u001a1e=P\u0005\u000b~\u0018%C\u0002\u00027";
      f2249[3] = "t,^9t1\u007f#Ov\u0015?t(K,";
      f2249[4] = "\u0003\ne0*n\u0005Fo\r՚\u0012\u0018Fv4?+]\u001e#\r";
      f2249[5] = "aT@m\u001eIg\u0018JPϊ5aT@m\u001eIg\u0018J";
      f2249[6] = "m\u000e[e^j(V\u000e\\ґS)N\u000fd\u001f6q\u0003V!!";
   }
}
