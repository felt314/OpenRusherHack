package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class425 extends Class236 {
   public static long f7074 = Class066.m4320(-8108982167122376508L, 9193966960024926759L, MethodHandles.lookup().lookupClass()).m4325(20529597862907L);
   public static String f7075;
   public static Object[] f7076 = new Object[14];
   public static String[] f7077 = new String[14];

   @Override
   public String m6376() {
        return null;
    }

   public Class425(Enum186 var1, String var2) {
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
      f7076[0] = "$YLiMJ8CN5W^(@\u0005Ɗ";
      f7076[1] = "zARCv'qNC\f\u000b?bIJE";
      f7076[2] = "\u0007x\rd\u0019g\u001bb\u000f8\u0003s\u000baDу";
      f7076[3] = "K\u0016jlIqW\fh0SeG\u000f#ǈ";
      f7076[4] = "\u001eta\\Op\u0002nc\u0000Ud\u0012m(ɴ";
      f7076[5] = int.class;
      f7077[5] = "java/lang/Integer";
      f7076[6] = ",\u001f`%$\u00000\u0005by>\u0014 \u0006)ɿ";
      f7076[7] = "%\bAf@P.\u0007P)!^%\fTs";
      f7076[8] = "'bt\u0001jm%#xhǶW;eyYxfxd7hqjxi3Y2k6X";
      f7076[9] = "eOxY#B3Mk\u0006Oɪ\\\u0007pM?Sc\u0007qG3";
      f7076[10] = "_.\u0006\u0011\u0017G\t A\u0015~ɧd$H\f\u0010S\u0001~\u0007\u0018B>";
      f7076[11] = "v/\u0017x805.YI=h`oK\u000e-\u0001?b_'.de-KuCs9#\u00172r08m&";
      f7076[12] = "\u001e 0i\u0004a\u001e!:e|Ƙ$b1`\u00123A8~t@";
      f7076[13] = "FIg-^*\u0010Ktr2*\u007f\u0007n$\u0002$\u0003GsrHCCCzxU?\u0003^,22";
   }
}
