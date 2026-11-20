package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.command.argument.StringCapture;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class152 extends Class236 {
   public static long f3134 = Class066.m4320(8470732160976303660L, 8009528961667221373L, MethodHandles.lookup().lookupClass()).m4325(120603845204817L);
   public static String f3135;
   public static Object[] f3136 = new Object[18];
   public static String[] f3137 = new String[18];

   @Override
   public String m6376() {
        return null;
    }

   public Class152(Enum186 var1, String var2) {
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
      f3136[0] = "7\u0004fssn7\u0004q/\u007fa-Oq1\u007ft*>%i(";
      f3136[1] = float.class;
      f3137[1] = "java/lang/Float";
      f3136[2] = ">*\u001f}.\u001b\"0\u001d!4\u000f23Vɕ";
      f3136[3] = int.class;
      f3137[3] = "java/lang/Integer";
      f3136[4] = "\u0004?){NE\u000f0843]\u001c71}";
      f3136[5] = ",\u0012v\u0013\u001ad0\btO\u0000p \u000b?Ų";
      f3136[6] = ".OKzSc2UI&Iw\"V\u0002Ƞ";
      f3136[7] = "p47Hd1l.5\u0014~%|-~\u0005z-z($Hw4vh\u0017\ny&~*#";
      f3136[8] = "gBh3AYgB\u007foMV}\t\u007fqMCzx/,\u001c";
      f3136[9] = "i7(1o:u-*mu.e.a|r=ck,pp\"g++1|=a0\"zs;(\u0016;mt!a\u0006.oi:t ";
      f3136[10] = "\u001b6~2[a\u00109o}:o\u001b2k'";
      f3136[11] = "\u000b,\\i-cX'\u0018`Qj]B\u0018y+cZ(Ljm4";
      f3136[12] = ":GP!$\u001fjNF\u0011#\u000f/CJ}\u0011\\k\u0018\u0017\u0011\u007f\u000e5C\u0015+w\u0005hM-";
      f3136[13] = "\u0012\u0002a\u00067$RM?\u000fQչ+I9_(zSC/\u001bn\u0019";
      f3136[14] = "TOq2\u001ao\u000eSb$|*j\u000e&k\u0010k\u0006Lq M\u0006Q\t*7\u0011j\u0013^aj|";
      f3136[15] = "|\r{cU\n>Z0>8\u0018.U6b\u007f\bG\u000b/1A\u0005?\u00019u\u0007f|\r{cU\n>Z0>8";
      f3136[16] = "\u001e\u001c0?0+J\u000fvh\\/B\u000e.?\u000bx\u001cYvS5%^S(.e,H";
      f3136[17] = "C/VGm7\u0006{W]\u000fgxv\u0018Ct3\t*WG1\u000eD{J[2\u007f\u00184N\u001e\u000f";
   }
}
