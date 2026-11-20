package org.rusherhack;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Class593 {
   public static long f9403 = Class066.m4320(-5961141984193487875L, -6277611513942027603L, MethodHandles.lookup().lookupClass()).m4325(264453763715492L);
   public static String[] f9404;
   public static String[] f9405;
   public static Object[] f9407 = new Object[21];
   public static String[] f9408 = new String[21];

   public static File m18028() {
      File var3;
      return (var3 = new File("/home/felt", ".rusherhack")).exists() ? new File(var3, "password") : null;
   }

   public static File m18030() {
      File var3;
      return (var3 = new File("/home/felt", ".rusherhack")).exists() ? new File(var3, "username") : null;
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
      f9407[0] = "FU[\u0006]aZOYZGuJL\u0012Ռ";
      f9407[1] = "Vc\u0004#\u0000~Jy\u0006\u007f\u001ajZzMɹ";
      f9407[2] = "D\u001e\u0004? \"O\u0011\u0015p]:\\\u0016\u001c9";
      f9407[3] = int.class;
      f9408[3] = "java/lang/Integer";
      f9407[4] = char.class;
      f9408[4] = "java/lang/Character";
      f9407[5] = "\u0002{\u000fnHp\u001ea\r2Rd\u000ebFɆ";
      f9407[6] = "s2Zu|Xv}j}>T";
      f9407[7] = boolean.class;
      f9408[7] = "java/lang/Boolean";
      f9407[8] = "\u0018\u001a2_'\u0000\u0004\u00000\u0003=\u0014\u0014\u0003{Ф";
      f9407[9] = "f\u0010;?\u00198m\u001f*pd-\u007f\u0005(3";
      f9407[10] = "G{W~\f\u001a[aU\"\u0016\u000eKb\u001e3\u0011\u001dM'E$\u0017\u0003['c$\f\u0006Fne$\u0017\u0003[";
      f9407[11] = "\u000f%\u001as>^\u0004*\u000b<_P\u000f!\u000ff";
      f9407[12] = "\u0019\u0005>\u0015>tDFcE\u0004Ƭ$A,YbjA\blH4\u0014\u001d\t-OzqTI<\u0019\u0004";
      f9407[13] = "\u0012\u001b!\b9I\u0011\u00147\u0015[\u001dA\u0018\u0001\u0010<\nA\u001e%\u001b[K]\u0014?\u0014>\u0002\u001d\u0005ijb\u0003\\\u0002'\u000f+CMTY";
      f9407[14] = "~\n\u0011\u0010\u0004I%T\u0001\nbՋEQ\u0015\u0007\u0019F,S\u001f\u0016\u0005+";
      f9407[15] = "VKy,\u0010d\r\u0015i6vɟm\u0010};\rk\u0004\u0012w*\u0011\u0006";
      f9407[16] = "/\u001e\u001c\u000fP3o\u000e\u001aAax\u0011VSC\u0007*t\u001f\u0013RQT(\u001eRU\u001f1a^C\u0003a";
      f9407[17] = "=?V\u001d,j84\u001b%yR+fZ\\zn:#M%an&#L\u0019p+1Z";
      f9407[18] = "_dG\u0010*P\r1\u0006PV\r\u0013`\r\u001c-`^a\u000f_._X9L\u001fV";
      f9407[19] = "pSM\\eM9\u0013\\\n\u001bL$DRF{(sDQAvAqN@]\u001b";
      f9407[20] = "Jk\u001b^3\u0013\u0003+\n\bM\u001d\u0013s\u0011q1vI|\u0007C \u001fKv\u0016_MM\u001f$Q\b<\u0012\u001dj\u00178";
   }
}
