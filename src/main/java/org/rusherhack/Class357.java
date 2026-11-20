package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class357 extends Class236 {
   public static long f5802 = Class066.m4320(3392332650975124497L, -3475338175740278333L, MethodHandles.lookup().lookupClass()).m4325(187195980346501L);
   public static String f5803;
   public static Object[] f5804 = new Object[22];
   public static String[] f5805 = new String[22];

   public Class357(Enum186 var1, String var2) {
      super(var2);
   }

   @Override
   public String m6376() {
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
      f5804[0] = "1_L`bN1_[<nA+\u0014[\"nT,e\r}=\u0016";
      f5804[1] = "\u000e.\"DjJ\u000e.5\u0018fE\u0014e5\u0006fP\u0013\u0014dS1\u0013";
      f5804[2] = "Eg\u000b@,cNh\u001a\u000fQ{]o\u0013F";
      f5804[3] = "\u001e\u0013\u001cE\u0004s\u0002\t\u001e\u0019\u001eg\u0012\nUȡ";
      f5804[4] = "'\u000eN\u001bUP;\u0014LGOD+\u0017\u0007ȳ";
      f5804[5] = int.class;
      f5805[5] = "java/lang/Integer";
      f5804[6] = "\u001aRr\u0014g\u0014\u001aReHk\u001b\u0000\u0019eVk\u000e\u0007h0\t2";
      f5804[7] = "B\u0013J]s;^\tH\u0001i/N\n\u0003\u0010m'H\u000fY]`>DOj\u001fn,L\r^";
      f5804[8] = "N3\u000eb\u0003\bN3\u0019>\u000f\u0007Tx\u0019 \u000f\u0012S\tI}^";
      f5804[9] = "R&u<\u0011\u0002N<w`\u000b\u0016^?<˲";
      f5804[10] = "`c=ZDc|y?\u0006^wlztȀ";
      f5804[11] = "@bN\n&\u000f@bYV*\u0000Z)YH*\u0015]X\r\u0010}";
      f5804[12] = "6}x1>h=ri~_f6ym$";
      f5804[13] = "\u0019\u0012.a\u0007\u0018D\u00048\u0013\u0019\u000e\u0005\u001c5\u007f+YHEm,|\u001c\u0004\f7#E\u0006\u001bDR";
      f5804[14] = "a~c\u00182F{a+}g\u0012bct\u0011UF$3(G\u0002Fl=b\u0005x\u0016\"cs}";
      f5804[15] = "dy^b4E?:_|Lϔ^|H,=\u0007$,\u0006r,\u007fg7\u0004c4\u00057yZrL";
      f5804[16] = "\fF5\u0004h\u0014\u000ePj\u0019UN]U;\u00069|\n\u0016jQn+PG'\u0013.P\rQ1a";
      f5804[17] = "(\u0014\"f. n\u0004\u007f<Hy\u007fd#>:c)\\sdx-";
      f5804[18] = "D\u000fhKRZ\u001c\b>O\"Ճ\u007f]lUX\u0012C\u0004lT\u0018#";
      f5804[19] = "tO}.\u0015\u0014tAc:+DJ\u0011z!ZAvSy6A-uLj\"G\u00117O}9+";
      f5804[20] = "\u0002T2%wKR\u000epkJ\u001d^]$6\u001dJ\u0001\u0000\u007fZv\u001cQU}et\n\u000eH";
      f5804[21] = "B\u001a,\u0010\u0002\u001e\u0012@n^?H\u001e\u0013:\u0003h\u001f@Dbo\u0000WC\u0011<\u001dP\u001b\u000fN";
   }
}
