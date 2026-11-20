package org.rusherhack.core.command.argument.parser.impl;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class316;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.utils.ColorUtils;

public class ColorArg implements IArg<Color> {
   public static long f1482 = Class066.m4320(3557622030187542663L, 7884079576330544175L, MethodHandles.lookup().lookupClass()).m4325(240700564721664L);
   public static String f1483;
   public static Object[] f1484 = new Object[24];
   public static String[] f1485 = new String[24];

   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
      ArrayList var7 = new ArrayList();
      Iterator var6;
      Iterator var10000 = var6 = ColorUtils.COLOR_MAP.keySet().iterator();

      while (var10000.hasNext()) {
         String[] var5 = (String[])var6.next();
         var10000 = var6;
         var7.add(var5[0]);
      }

      return var7;
   }

   public Color parse(CommandProcessingSink var1, String var2) {
      String var6 = var2;
      Color var7;
      Color var10000 = var7 = ColorUtils.parseColor(var2);

      try {
         if (var10000 == null) {
            throw new IllegalStateException(f1483 + var6);
         } else {
            return var7;
         }
      } catch (Class316 var5) {
         var5.printStackTrace();
      }
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
      f1484[0] = "\u0015+\u0013\u001b\u0011%\t1\u0011G\u000b1\u00192ZV\f\"\u001fw\u0017Z\u000e=\u001b7\u0010\u001b\u0002\"\u001d,\u0019P\r$T)\u0015G\u00105\bw\u001dX\u0013<T\u001a\u001bY\f\";+\u0013";
      f1484[1] = "\u0016E\u0001kkP\n_\u00037qD\u001a\\Hȱ";
      f1484[2] = "&Q7 \nk:K5|\u0010\u007f*H~m\u0017l,\r3a\u0015s(M4 \u0019l.V=k\u0016jgS1|\u000b{;\r9c\brgp$|\u0011p.`1~\fk;F\"O\ny";
      f1484[3] = int.class;
      f1485[3] = "java/lang/Integer";
      f1484[4] = "\t=3\r@=\u0015'1QZ)\u0005$z@]:\u0003a!W[$\u0015a\u0017L^'\u0014\u001a J^;";
      f1484[5] = "/Sa*~\u001f$\\pe\u0003\u00077[y,";
      f1484[6] = "\u0003je!\tA\u001e\u007f=\u0003HL\u0006y";
      f1484[7] = "\u001aZL1\t=\u0004RV~n<\u0015I[$H:";
      f1484[8] = "yk4C\\4rd%\f=:yo!V";
      f1484[9] = "c4a\u0001}E}<{N\u001fYz!";
      f1484[10] = boolean.class;
      f1485[10] = "java/lang/Boolean";
      f1484[11] = "!Tzfsw?\\`)\u000eg?";
      f1484[12] = "\"T'1\u001d<<\\=~{(;]\u001c1C";
      f1484[13] = ";+x\t)z'1zU3n721D4}1w|H6b57{\t+};:zT(f:>1d4b98qC\u000b};:zT(f:>LN5d";
      f1484[14] = "\u0014Dr7G%O\u0018}0'.D\n\u007f\t\u001a7QC:kLu\u0010J\u0003";
      f1484[15] = "I\n]J>z\u0016\u0007ULLc\u001b\u00024\b3rNWV^q3Gn\u000b^46L\u001c\fUwuw";
      f1484[16] = "\u00045rx/X\u000bke?HKHcd.4MN\u000e#y9\u0014Tcx%6\u00134";
      f1484[17] = "_[>^\nsNF5\"\u001cNISmMH!JA9\"\u000e%\u000fWmM\r7[8";
      f1484[18] = "\u000b\r\u001aSBh\u000bV\u0014\u0003!fV\u0017~S]\u0005\u000b]I\u0001Fw\u0004\u0003^F!";
      f1484[19] = "\r\u0002\t\u0014\u0017]\u000bE\u0002\u0019yhqz\"(.f\u007ffeB\u0012\u001c[]\bBI\u0012\u000b";
      f1484[20] = "[A.\nGc\u000eC/\n}ƬaA6J\f?Y\u001blH\f\\";
      f1484[21] = "\u00035\u0007\u0000\u001dnXi\b\u0007}cWp0S\r\u007f>4\u001dFA8L3\u0016\u0005\u0002\u0003";
      f1484[22] = "Sa~\rpAB|uqw\u0015Dy}q>L\u0003iu\u0000n\u0017\u00068\u0010Jh\u0016U:uLs\u000eN\u0002,\u00123\rZmaMp\u0006>";
      f1484[23] = "pu2\u000eu)v29\u0003\u001b/\"3%\u0005P0/.$h 0!\"f\r&+99^Txk:-1\u0019'(1I";
   }

   public static IllegalStateException a(Throwable var0) {
      return var0 instanceof IllegalStateException ? (IllegalStateException)var0 : new IllegalStateException(var0);
   }
}
