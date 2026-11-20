package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class510 extends Class236 {
   public static long f8161 = Class066.m4320(-108586050506591398L, 5913138854790679260L, MethodHandles.lookup().lookupClass()).m4325(127757433604671L);
   public static String f8162;
   public static Object[] f8163 = new Object[18];
   public static String[] f8164 = new String[18];

   @Override
   public String m6376() {
        return null;
    }

   public Class510(Enum186 var1, String var2) {
      super(var2);
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
      f8163[0] = "\u001e=\u0007\u001d2B\u0002'\u0005A(V\u0012$Nȵ";
      f8163[1] = int.class;
      f8164[1] = "java/lang/Integer";
      f8163[2] = "]\u0001OY<z]\u0001X\u00050uGJX\u001b0`@;\fCg";
      f8163[3] = "^U{\u0015\u001bH^UlI\u0017GD\u001elW\u0017RCo=\u000e@\u0010";
      f8163[4] = "\u0010JXc\u0005\u001a\u001bEI,x\u0002\bB@e";
      f8163[5] = "Rcq#@$Nys\u007fZ0^z8ҫ";
      f8163[6] = "_\u0019\reu\u001eC\u0003\u000f9o\nS\u0000Dȿ";
      f8163[7] = "zA\u0010\u001dqzf[\u0012AknvXYPofp]\u0003\u001db\u007f|\u001d0_lmt_\u0004";
      f8163[8] = "^g\u0019\u0001L\u001b^g\u000e]@\u0014D,\u000eC@\u0001C]^\u001e\u0011";
      f8163[9] = "z!\u0005~o#f;\u0007\"u7v8Lй";
      f8163[10] = "K HB\u001fN@/Y\r~@K$]W";
      f8163[11] = "OA:3\u0019\u0000MF>ns\u000f\u0018P\u0004+\t\u0001\u0013C_lJ[MR#&J\u001e\u001e,";
      f8163[12] = "na0'Rl8}ltjtU=('\u0006ci8,%S\u001dizlt\u0014!l~n!j";
      f8163[13] = "Xt\u0011\u0012KQ\\,\u0006\u001e{\b\u000eHU\u0002AP\u00009\u0017I\u0017\u000f";
      f8163[14] = "0Pa@Z@-G~{ɢ,h\u0007|\u0010X\u0014:W,\u0014;";
      f8163[15] = "\u000e]~:ZNL\u0016(e?QR@ kh\u0006\f\u0017x\u0007\u0006B\u0002\u0013'gP\\M\u0016";
      f8163[16] = "\u0015j\u0011xx\u0019LcQ{\u001fǾ+aU9'XW+U|t&\u0010cW:aZZc\u0012i\u001f";
      f8163[17] = "=Bs5oMk\\<0\fHiC\"l`z9\u0003}4\f\u0017iZ&al\u0015n^{\u000b";
   }
}
