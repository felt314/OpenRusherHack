package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class567 extends Class236 {
   public static long f9125 = Class066.m4320(736107954713569070L, -886023388910273171L, MethodHandles.lookup().lookupClass()).m4325(243810533152577L);
   public static String[] f9126;
   public static String[] f9127;
   public static Object[] f9129 = new Object[20];
   public static String[] f9130 = new String[20];

   public Class567(Enum186 var1, String var2) {
      super(var2);
   }

   @Override
   public String m6376() {
      if (Globals.mc.world == null) {
         return "Unknown";
      } else {
         return Globals.mc.getCurrentServerEntry() == null ? "Singleplayer" : Globals.mc.getCurrentServerEntry().address;
      }
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
      f9129[0] = ".hht/ .h\u007f(#/4#\u007f6#:3R*np";
      f9129[1] = "\u001c,o* #\u0017#~e];\u0004$w,";
      f9129[2] = "\u0010.\u0007F\u0010l\f4\u0005\u001a\nx\u001c7N\u000b\u000ep\u001a2\u0014Fλ";
      f9129[3] = "\u007fEN\t~:c_LUd.s\\\u0007ԁ";
      f9129[4] = "\u0015dh\u001f\u0018\u0014\t~jC\u0002\u0000\u0019}!Ʌ";
      f9129[5] = "\u000b`.J\u000es\u000b`9\u0016\u0002|\u0011+9\b\u0002i\u0016ZiUS";
      f9129[6] = "YJn';\u0004EPl{!\u0010US'ȏ";
      f9129[7] = int.class;
      f9130[7] = "java/lang/Integer";
      f9129[8] = "qTYy\u001b^mN[%\u0001J}M\u00104\u0005B{HJy\b[w\bK>G\\wHZ8\u001e\u0005IOP3\u0006\\HO[ !JpBR2\u001bi\u007fU[";
      f9129[9] = "\u0006+\u0019(\u007f-\u001a1\u001bte9\n2Pea1\f7\n(l(\u0000w9jb:\b5\r";
      f9129[10] = "\u001aX\u0004Va{\u001aX\u0013\nmt\u0000\u0013\u0013\u0014ma\u0007bFK4";
      f9129[11] = "_\u000eAb\u001cRT\u0001P-}\\_\nTw";
      f9129[12] = "`z4u9x6%(\f8$7|![mzd!M5i!(q4ah%:";
      f9129[13] = "is?\u001czr\"3>\u000fFʔP:k\u00004`)nj\u0004&\ti<0\u0016/p==4\u0004F";
      f9129[14] = "}8\u0019C\u0012&{5RP#,(WX\\@&\u007fn[\u0018I ";
      f9129[15] = "\u000f3H+U.\u00056\u000fu1~5hL*\b/V/[tV\u0017\u000f)\f(\ttH>Rv1";
      f9129[16] = "Z\u0000EX;YYDL^\u0007\u0005\f\u0001FPk7X@\u001b\u0007\u0007Z\u0003\u0004_X:\f\\\u0018&";
      f9129[17] = "\u000ezchM!P>9w/Ժ2=qwL\"\bsm-JZ";
      f9129[18] = "\u001b \u000bh_\n\u0015o\u0011|:W%'^~H\u0012\\s_zZ{\u001c!\u0005hS\u0002H \u0001z:";
      f9129[19] = "*0yi\u001a\u0013)tpo&Dp ~jq\u0013/}%\u0006\u0018Zp)htYSnq";
   }
}
