package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum HUDEnablecolor {
   f2618,
   f2619,
   f2620,
   f2621,
   f2622,
   f2625,
   f2626,
   f2627,
   f2628,
   f2629,
   f2630,
   f2631,
   f2632,
   f2633,
   f2634,
   f2635;

   public String f2623;
   // $VF: synthetic field
   public static long f2636 = Class066.m4320(2704493240796926026L, -3942604330983999878L, MethodHandles.lookup().lookupClass()).m4325(188176034221804L);
   public static long[] f2637;
   public static Integer[] f2638;
   public static Map f2639;
   public static Object[] f2640 = new Object[29];

   public String m5890() {
      return this.f2623;
   }

   HUDEnablecolor(char var3) {
      this.f2623 = "§" + var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
      f2640[0] = "a*\u0018R\u001dUj%\t\u001dvW~&";
      f2640[1] = "H.A;\bvC+PtevC6D";
      f2640[2] = "%m_u]\u0000.bN: \u0018=eGs";
      f2640[3] = "^CC\u0017V|BYAKLhRZ\nĢ";
      f2640[4] = "1\u0014.ROw\u0018-2HM+\u00029\"K\u0006łQ";
      f2640[5] = "\u001b\u0005\u0012,uz2<\u000e6w&((\u001e5<ŏ{";
      f2640[6] = "6\u0011~Ka'*\u000b|\u0017{3:\b7ɣ";
      f2640[7] = "B\u0010:}qRI\u001f+2\u0010\\B\u0014/h";
      f2640[8] = "\u000eP#a#\u0004MJ/b_\u001e4\u0012%c#\u0007KQ?o ";
      f2640[9] = "\f8)O\u00028O\"%L~\u00076z/M\u0002;I95A\u0001";
      f2640[10] = "(\u001ctI0]k\u0006xJLF\u0012^rK0^m\u001dhG3";
      f2640[11] = "L\noHr\u001c\u000f\u0010cK\u000e\fvHiJr\u001f\t\u000bsFq";
      f2640[12] = "\u001dcH\t\b\u000e^yD\nt<'!N\u000b\b\rXbT\u0007\u000b";
      f2640[13] = "{7Du\u0016\\%6\u001b\u0005\n\fpt\u0016B\u001ae-c\u001d;\u000b\u0019(8\u0015gt\\hd\u0002h\t\th{\u0001\u0005\u001b[+y\u0019<EZt\t";
      f2640[14] = "_/}>xu\u001c5q=\u0004hem{<xv\u001a.a0{";
      f2640[15] = ".&HXf\u0015m<D[\u001a$\u0014dNZf\u0016k'TVe";
      f2640[16] = ")b^`NDjxRc2Q\u0013 XbNGlcBnM";
      f2640[17] = "VX%%0+\u0015B)&L\u0017l\u001a#'0(\u0013Y9+3";
      f2640[18] = "?(o)g<|2c*\u001bo\u0005ji+g?z)s'd";
      f2640[19] = "/\u0004|^)\u0007l\u001ep]Uҳ\u0015G\u007fI8\u0001t\u0000\u007f\u00138x";
      f2640[20] = "\u001aaKD5.Y{GGIӃ \"HS$(AeH\t$";
      f2640[21] = "{2G@#\u00048(KC_\u0017ApAB#\u0007>3[N ";
      f2640[22] = "x\u0017T4\u0019e;\rX7eVBUR6\u0019f=\u0016H:\u001a";
      f2640[23] = "\u007fn\u0005\u0003\"Y<t\t\u0000^ЉE/\u0007\u0012'K8z\u0007\r$";
      f2640[24] = "\u0005\f=g)VF\u00161dU`?N;e)U@\r!i*";
      f2640[25] = "$=Ub\r'#g\u0013amϤ\u0018dTh\u0014re1Tw\u0017\u001f!!E|\u0000bt!Z\u007fm";
      f2640[26] = "\u007f\u000eR/`}<\u0014^,\u001ccELT-`~:\u000fN!c";
      f2640[27] = "\u0010]\u001d-hSSG\u0011.\u0014L*\u001f\u001b/hPU\\\u0001#k";
      f2640[28] = "U(hPf&\u00162dS\u001a\u0013ojnRf%\u0010)t^e";
   }
   HUDEnablecolor() {}
}
