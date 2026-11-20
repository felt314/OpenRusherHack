package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum Enum112 {
   f2465,
   f2469;

   public int f2466;
   public int f2467;
   // $VF: synthetic field
   public static long f2470 = Class066.m4320(-1818326381220818367L, -2274302938443754647L, MethodHandles.lookup().lookupClass()).m4325(5525348891072L);
   public static long[] f2471;
   public static Integer[] f2472;
   public static Map f2473;
   public static Object[] f2474 = new Object[20];
   public static String[] f2475 = new String[20];

   Enum112(int var3, int var4) {
      this.f2466 = var3;
      this.f2467 = var4;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   public int m5548(int var1) {
      Enum112 var7 = this;

      try {
         switch (var7.ordinal()) {
            case 0:
               break;
            case 1:
               return var1 / 4 * 6;
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var5) {
         var5.printStackTrace();
      }

      int var8 = var1;

      try {
         return var8;
      } catch (MatchException var4) {
         var4.printStackTrace();
      }
      return 0;
   }

   public static MatchException m285(MatchException var0) {
      return var0;
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
      f2474[0] = "?H\u00177'\u001f#R\u0015k=\u000b3Q^ę";
      f2474[1] = "\u007f\tCyb6V0_c`jL$O`+Ę\u001f";
      f2474[2] = "+>t\t\u000eq 1eFes42";
      f2474[3] = "G\u001dCUFFL\u0012R\u001a+FL\u000fF";
      f2474[4] = "NL=\n|HEC,E\u0001PVD%\f";
      f2474[5] = int.class;
      f2475[5] = "java/lang/Integer";
      f2474[6] = "\u001f\u000b\u0010#n\u0015\u0014\u0004\u0001l\r\u0018\u0001\t\u000e\u00078\u001a\u0010\u001a\u0012+/\u0017";
      f2474[7] = "_Z\nL\u0017HC@\b\u0010\r\\SCCԇ";
      f2474[8] = "d7f5\u0019Dx-di\u0003Ph./V";
      f2474[9] = "UTPs>;|mLi<gfy\\jwĕ5";
      f2474[10] = "G\u0015JgBfL\u001a[(#hG\u0011_r";
      f2474[11] = "g_!PROgS4U/ȵZ\tq]L\b$\u000fp\u0003Mva\u000f}\u000fQ\bg\u000e#\u000e/";
      f2474[12] = "[[\u001cC\u0004k\u0000RA?r\u0013[[\u001cC\u0004k\u0000RA";
      f2474[13] = "\t\u0004A\u0019oBL\u0001[^\u0001ϴ7\u0003\u001cVb\fI\u0005\u001d\bcr\f\u0005\u0010\u0004\u007f\f\n\u0004N\u0005\u0001";
      f2474[14] = "S*\r\u0002NW\b#P~\u0015U\u0006,S\u0017\u0016/Q)L\u0014\u0011K\u000e0\n\u0017r";
      f2474[15] = "\u001b#(\u0011F.@*umVV\u001b#(\u0011F.@*u";
      f2474[16] = "[!`zbx\u0000(=\u00067\u0000^-8f'<\u001f9$y^<\t&8\u007fb}\u001d:'\u0006";
      f2474[17] = "\"#RM\u001d\u0015vuQ\u0010v\u000eq\u007fL\u00111\u001e\u0018!\u0000\u001b\f\u0000)uK\u0005\u0011p#&\u0000\u001f\b\u000e%'^\u001evJ x\u0000\u0017\u0013\u001ev{]|";
      f2474[18] = "\u0011\u0007m\r:FJ\u000e0qԋ>\u0016\u0000m\u001ea\u000fG\\8\u0018\u0006";
      f2474[19] = "\blyVZ\rSe$*Ŗu\u000fkyE\u0001D^7,C";
   }
   Enum112() {}
}
