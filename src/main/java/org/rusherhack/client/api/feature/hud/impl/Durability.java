package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.item.ItemStack;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class Durability extends TextHudElement {
   public static long f3897 = Class066.m4320(-6330180929936164991L, -3206621076538400325L, MethodHandles.lookup().lookupClass()).m4325(68186071920979L);
   public static String[] f3898;
   public static String[] f3899;
   public static Object[] f3901 = new Object[22];
   public static String[] f3902 = new String[22];

   public Durability() {
      super("Durability");
   }

   @Override
   public String getText() {
      ItemStack var5;
      return (var5 = Globals.mc.player.getMainHandStack()).isDamageable() ? String.valueOf(var5.getMaxDamage() - var5.getDamage()) : "N/A";
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
      f3901[0] = "ZF\u00041,bZF\u0013m m@\r\u0013s xG|A(x2";
      f3901[1] = int.class;
      f3902[1] = "java/lang/Integer";
      f3901[2] = "09TxrS09C$~\\*rC:~I-\u0003\u0017b)";
      f3901[3] = "j\f^\u0005o8v\u0016\\Yu,f\u0015\u0017ȭ";
      f3901[4] = "b+7\u000b{z~15Wann2~Fefh7$\u000bh\u007fdw%L'xd74J~!Z0>Afx[05RAnc=<@{Ml*5";
      f3901[5] = "1\\=.Cw:S,a>o)T%(";
      f3901[6] = boolean.class;
      f3902[6] = "java/lang/Boolean";
      f3901[7] = "8#\u0019\u00139\u0001$9\u001bO#\u00154:P^'\u001d2?\n\u0013*\u0004>\u007f9Q$\u00166=\r";
      f3901[8] = "UCv\u0017>\u0019UCaK2\u0016O\baU2\u0003Hy1\bc";
      f3901[9] = "$ZV?6\u000b8@Tc,\u001f(C\u001fƠ";
      f3901[10] = "X`\u007fDV\\Dz}\u0018LHTy6Ȟ";
      f3901[11] = "wXaF:\u001c|Wp\t[\u0012w\\tS";
      f3901[12] = "\u001eG76c\u0018C\u0001dDtLR^3(F\u001e\u001f\u0007eD(\u0018SN0t+\\N\u0006T";
      f3901[13] = "\u00150g)C5Mb:} (C\r`z\u001ep\u0015w4xR$";
      f3901[14] = "W\u000bd\u0001ol\u0014\u0019'FP`\u0003\u0018~\u001d<RP\\\"EP5\u0017\u0007l\bihQT\u001e";
      f3901[15] = "\u0014pA4\u0007>I6\u0012F\u0010jXiE*\"8\u00152\u001cFL>YyFvOzD1\"";
      f3901[16] = "\u000b\u0016icA\u001e\fL}i/ԁ1\u0010/s_\u0005\u0001\u0013kn\u0017a";
      f3901[17] = "6{DM&gn~TC\u0019,\r{\u0006\u001a!g7vVA(\u00001{\n\u0012~:<+Q\u001b\u0019";
      f3901[18] = "kOy\bXvf\u001f\"\u0001?2>\u00174]x\"WJpMO(gI4P\u0007LkOy\bXvf\u001f\"\u0001?";
      f3901[19] = "\\#ZD8.\u0001>]VB8bbRC;!\u000f?F]~Q]1@D2<\u0000%^\u0001B";
      f3901[20] = "~t.1\u000fF*vbe2R!'t`e\u0005\u007fp,\f\u000bS:1/eHAyv";
      f3901[21] = "[}\u0016}\u0007b\u0006;E\u000f\u00106\u0017d\u0012c\"dZ:N\u000fI\"\u001bbImDj\u0004yu";
   }
}
