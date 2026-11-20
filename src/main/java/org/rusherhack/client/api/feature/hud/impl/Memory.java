package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Memory extends TextHudElement {
   public static long f5128 = Class066.m4320(3946233642813306965L, -2544449816916219854L, MethodHandles.lookup().lookupClass()).m4325(134030575458187L);
   public static String[] f5129;
   public static String[] f5130;
   public static long[] f5132;
   public static Long[] f5133;
   public static Map f5134;
   public static Object[] f5135 = new Object[16];
   public static String[] f5136 = new String[16];

   @Override
   public String getText() {
      long var3 = Runtime.getRuntime().maxMemory();
      long var5 = Runtime.getRuntime().totalMemory();
      long var7 = Runtime.getRuntime().freeMemory();
      var5 -= var7;
      Object[] var10001 = new Object[]{var5 * 100L / var3, null, null};
      boolean var10005 = true;
      var10001[1] = this.m10388(var5);
      var10001[2] = this.m10388(var3);
      return String.format("%2d%% %03d/%03dMB", var10001);
   }

   public long m10388(long var1) {
      return var1 / 1024L / 1024L;
   }

   public Memory() {
      super("Memory");
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
      f5135[0] = "\u0007(\u00015TR\u001b2\u0003iNF\u000b1Hɽ";
      f5135[1] = long.class;
      f5136[1] = "java/lang/Long";
      f5135[2] = "~2[YU4u=J\u0016(,f:C_";
      f5135[3] = "CJ\u0003\u0002Q76j\b\r@xWd\u0003\u0006D\"#";
      f5135[4] = "$\b[\u0011^I/\u0007J^\"P \u001dD\u001d\u0015";
      f5135[5] = "9\u0005\u007f\\;\u00112\nn\u0013Y\u0012=\u0003";
      f5135[6] = ",z\"\u0001)#0` ]37 ckL4$&& Y>87&6Z9% z,M>x\u0010}'\\8$*j ]\u001970m";
      f5135[7] = "&\u001bRbl|-\u0014C-\rr&\u001fGw";
      f5135[8] = ">g85\u001cJk|.LѠ%k&',\\\\,zj1-\u001cbd5=T[>)(L";
      f5135[9] = "/^0LxV\u007f\u001ez\u001f\u001c\u0006y\u001dZZz\u0015u\u0004m''V$\nd\u0018w\u0016nY\u0000";
      f5135[10] = "8qsus6f+sv\u0019=fn\u007fbeS8qsus6f+sv\u0019ic)~kr=k/g\u000b 6hjpn~lhi\u001a";
      f5135[11] = "l\b3=8.6O-4A+>\u00114?\u0006;WLy !$.\u000b%m<Ul\b3=8.6O-4A";
      f5135[12] = "\\p\u00126#\"\f0XeGx\u000e?g0\"z\u001d>\"dwo\u0007>[#+\"\u001aO";
      f5135[13] = "OW\u001f\u0004\r\f\u0002UD\u001am]s\nK\u0014\u0013\u001b\u0016T\u0011\u0014\u0010qJVG\u0003\u0007\u0014\u0014\fG\u0000m";
      f5135[14] = "O\u0000E@<|\u001f@\u000f\u0013X?\u0013C\u001cO\u001d.\u0011X\u000fZXzDM\u0015Z!=\u0018\u0000\b+";
      f5135[15] = ",5F\u0006,%|u\fUHtmg\u001b(%\u007fpp\u0007mq*ej\u0007\u00146v(wv";
   }
}
