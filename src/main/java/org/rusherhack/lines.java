package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.utils.StringUtils;

public abstract class lines extends Class253 {
   public static long f9644 = Class066.m4320(-7939165974227887845L, 5816048016451306556L, MethodHandles.lookup().lookupClass()).m4325(183766254932571L);
   public static String[] f9645;
   public static String[] f9646;
   public static Object[] f9648 = new Object[26];
   public static String[] f9649 = new String[26];

   @Override
   public void m6551() {
        
    }

   public lines() {
      super("lines", "pos_color");
   }

   static {
    }

   public static String m656(byte[] var0) {
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
      f9648[0] = "#a\u000f)~8#a\u0018ur79*\u0018kr\">[H6#";
      f9648[1] = "wW\u007f$\u00047wWhx\b8m\u001chf\b-jm::]o";
      f9648[2] = "\u001cI$oop\u0000S&3ud\u0010Pm˳";
      f9648[3] = "\u0006S\u0017L\u0017Z\u0004M^/\u001cA\u001bH\bV\u001b";
      f9648[4] = "\u001f\u001f[6\u00021\u0003\u0005Yj\u0018%\u0013\u0006\u0012Ȟ";
      f9648[5] = "D2\u0000@\u0015-O=\u0011\u000fh5\\:\u0018F";
      f9648[6] = "\nyEP\u0003w\u0016cG\f\u0019c\u0006`\fЫ";
      f9648[7] = void.class;
      f9649[7] = "java/lang/Void";
      f9648[8] = int.class;
      f9649[8] = "java/lang/Integer";
      f9648[9] = "$\u0013tcQ\u00128\tv?K\u0006(\n=.O\u000e.\u000fgcB\u0017\"OT!L\u0005*\r`";
      f9648[10] = "!W#nR\n=M!2H\u001e-Njՠ";
      f9648[11] = "jkn9 Mvqle:Yfr't=J`7|c;Tv7Zc Qk~\\c;Tv";
      f9648[12] = float.class;
      f9649[12] = "java/lang/Float";
      f9648[13] = "mq\"\u000b_Df~3D>Jmu7\u001e";
      f9648[14] = "9x~X\u001b\u001dg#o#\u0013\u0015%)xO!Bcw/\u0018v\u0003&\"g\u0013\u0017\t0p\u001f";
      f9648[15] = "\u0011#a[_#\u001b53#\n/\u0016<mO8~Vl4#Qz[:l_\u0010x\u0003:\n";
      f9648[16] = "\u0015\u0005 ||jUV%,\u0015k@h=$tuF\rc\u007fe";
      f9648[17] = "k-Rxn\u00002)\u0015xWүQ/\u0005\u007fm\u0011i+\u000e\u007fk";
      f9648[18] = "c|RU\f*6s\\\u000fiΐ\\$\u0013U\r,!zT\n\u0011H`%\u0011\u000e\r5>bN\u0012i";
      f9648[19] = "xw c\u000fT$ mmpŀC\"o#\u0014O>|(|\b+\u007ff+|\u0013[8z+xp";
      f9648[20] = "ynXI\nSywZ\fgCF-\f\n\u0003\u000b;sKU\u001foz,\u000eQ\u0003\u0012$kQMg";
      f9648[21] = "\u000e\n{bwGW\u000e<bNɕ4\b,etV\f\f'er";
      f9648[22] = "B `H2b\u001b$'H\u000bȠx\"dN10\u0013{`\t1";
      f9648[23] = "S\u0005}C/rY\u0013/;z~T\u001aqWH/\u0015B,;!+\u0019\u001cpG`)A\u001c\u0016";
      f9648[24] = "\u001f\u0016M08\u0014X\nM4[Ҳ#^Phb\u000eQ\u0014Xm1d\u0013\n\fi1\u0016Y\u0002\t:[YM\tZh4\b\u001aT\u0004P";
      f9648[25] = "T2\tEfk\u0013.\tA\u0005Зhp\u001b\u0018?aPt\u0010\u00189\u001bU$\u0017K=t\u0004sJ\u0015\u0005";
   }
}
