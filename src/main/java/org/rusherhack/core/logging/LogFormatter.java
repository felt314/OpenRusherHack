package org.rusherhack.core.logging;
import org.rusherhack.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.MethodHandles;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class448;

public class LogFormatter extends Formatter {
   public static LogFormatter INSTANCE;
   public static long f1625 = Class066.m4320(3253564982311648770L, -2763799397475282279L, MethodHandles.lookup().lookupClass()).m4325(259056093841889L);
   public static String f1626;
   public static Object[] f1627 = new Object[19];
   public static String[] f1628 = new String[19];

   @Override
   public String formatMessage(LogRecord var1) {
      return super.formatMessage(var1);
   }

   @Override
   public String format(LogRecord var1) {
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
   public static void m122() {
      f1627[0] = "%|\u0010v6V9f\u0012*,B)eY;+Q/ \u001b7#D#`\u0010v\bL-H\u0018*)B>z\u0012*";
      f1627[1] = "#e?\u0005\u0005`=m%JGz.c \nL;\u0005k.6Nv&v-";
      f1627[2] = "w\u00167};\u0014|\u0019&2F\fo\u001e/{";
      f1627[3] = "6x\u0003JZ 37%Y\u001d'(N\u0007B\u0000,.";
      f1627[4] = void.class;
      f1628[4] = "java/lang/Void";
      f1627[5] = "GPx\f'=2ps\u00036rS~x\b2('";
      f1627[6] = "\u0014q5)w\u0005\bk7um\u0011\u0018h|з";
      f1627[7] = "\u0007p>\u0000?\\\f\u007f/OEX\u001f~?\u0000s\\\b";
      f1627[8] = "\u0004%Hpr\u001d\u0001jme.\u001d\u0000#ic5\u0000\u000b6";
      f1627[9] = "SfB^Z\u0006XiS\u0011;\bSbWK";
      f1627[10] = "\u00157\u001e|H*\\=\u0004\u0006w\bw\u0005'@}\u0003,`\u0000vL0H)\nl";
      f1627[11] = "\u0003M,X6DSFwYIYZ,j](CRw/B.D\u0007K-\u001dt\u001f=";
      f1627[12] = "5v j&E||:\u00106Fv}9l\u001dLwc9\u007f5!5s;(\"\u00180(2oX\u0018iu1*d\u001a6%j\u0010";
      f1627[13] = "_+\u0018B\t:Zp\u0011\u0005sl\u000b</\u001a\td\u0019&sF\u0003}\u0019?B\u0010\u000ef\u0001@";
      f1627[14] = "\u001b\u0010\u0001\\uSO\u001a[X\rA[\u001f\u0003Xi_!E\tJ|SC\u0014\\^c9";
      f1627[15] = "a\u001eV}\u001a\u00065\u0014\fyb\u0007?\u0017IhbW7\u001eCo\u0000\u0006b\n\\\u0005";
      f1627[16] = "-f\u0003L}z/9S\u0017G(sy\u000bD;F-f\u0003L}z/9S\u0017G}lj\u0004\u0012x't=\b-~#ybT\u0011||)9n";
      f1627[17] = "(*%\u0002 \nh7f\u0015\\г\u0014j}\u0002=\u000e(h\"Rf4-6u\u000ef\b/i%U\\";
      f1627[18] = "{;}\u001a#*-6f\u0002\\c=*e\u0019\u0007g. `9&r,&\u0003_2\u007f?3i\u000b8%;K8\t2j-)i\\&uG";
   }
}
