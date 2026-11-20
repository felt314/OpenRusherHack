package org.rusherhack.core.utils;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.setting.Setting;

public class Version implements Comparable<Version> {
   public int f1748;
   public int f1749;
   public int f1750;
   public static long f1751 = Class066.m4320(2999810648505296720L, -745681839093315661L, MethodHandles.lookup().lookupClass()).m4325(136724038874861L);
   public static String[] f1752;
   public static String[] f1753;
   public static long[] f1755;
   public static Integer[] f1756;
   public static Map f1757;
   public static Object[] f1758 = new Object[31];
   public static String[] f1759 = new String[31];

   public static Version fromString(String var0) {
      String[] var3 = var0.replaceAll("[^0-9.]", "").split("\\.");
      int[] var6 = new int[3];

      int var5;
      for (int var10000 = var5 = 0; var10000 < var3.length; var10000 = var5) {
         int var10001 = var5;
         int var10002 = Integer.parseInt(var3[var5]);
         var5++;
         var6[var10001] = var10002;
      }

      int var7 = var6[0];
      boolean var10006 = true;
      return new Version(var7, var6[1], var6[2]);
   }

   public Version(int var1, int var2, int var3) {
      this.f1750 = var1;
      this.f1748 = var2;
      this.f1749 = var3;
   }

   public int compareTo(Version var1) {
        return 0;
    }

   public int getPatch() {
        return 0;
    }

   public String getString(boolean var1) {
        return null;
    }

   @Override
   public int hashCode() {
        return 0;
    }

   @Override
   public boolean equals(Object var1) {
        return false;
    }

   public int getMinor() {
        return 0;
    }

   @Override
   public String toString() {
      boolean var10003 = true;
      return this.getString(true);
   }

   public int getMajor() {
        return 0;
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
      f1758[0] = "\u0012C75:@\u0019L&zGX\nK/3VY\u0011N%1f";
      f1758[1] = "ht>D\u001c\u007fc{/\u000bagp|&B";
      f1758[2] = "=2N\u0001\u0011\u0007!(L]\u000b\u00131+\u0007L\f\u00007n\\[\n\u001e!n\u007fJ\u0011\u0001;/G";
      f1758[3] = "gY^A)\u000f{C\\\u001d3\u001bk@\u0017ț";
      f1758[4] = int.class;
      f1759[4] = "java/lang/Integer";
      f1758[5] = ",\u0016x\u0003\n\u007f0\fz_\u0010k \u000f1Н";
      f1758[6] = "XV\u0011(?0DL\u0013t%$TOXȸ";
      f1758[7] = ";&C\u0016Y\u001a'<AJC\u000e7?\n[D\u001d1zQLB\u0003'zpQF\n&";
      f1758[8] = "v\u0000Ll3\u007f_9Pv1#E-@uz2B>F0'4Y8Jp3\u007f~)Wj=?Jw";
      f1758[9] = boolean.class;
      f1759[9] = "java/lang/Boolean";
      f1758[10] = char.class;
      f1759[10] = "java/lang/Character";
      f1758[11] = "N\u000f E\u0015:;/+J\u0004uF78M\r<.";
      f1758[12] = "z\u0015\u001f=>dq\u001a\u000erYfd\u0011\u000e9b";
      f1758[13] = ")c\u001cgE\f\"l\r($\u0002)g\tr";
      f1758[14] = "Pq7\u0003 \u001aV|,\u0005ZO\u000ev?\u0013 I5tGC8T\u0010iyE5O\u0016\u0013}\u0000*\u001b\u0003o%G*@i";
      f1758[15] = "/4T~{8 $I\u0007mz5/Q\u0007hx(7@=gh5N\u0012|/>n)\u0011yf;Q";
      f1758[16] = "e#\"Y/\u000e0k;)=\u0013W.\"H'\u001b\f,\"P8\u00196#2MA";
      f1758[17] = "\u007f]~w\fUyPeqv\u0002F\u0005?k\u000b\u00114\u000e>0Fk|\u000eks\f\u0019w\u000f0>v";
      f1758[18] = "\u001bJ\u0018XETN\u0002\u0001(BV\nV\u0004D+P\bB\u001bE\u0011_\u0018_bAZT\u0002U\u0018\u0014\u0012Mr";
      f1758[19] = "2MBJ\f34@YLvʎ\u000b\u0015HCIgwM\u000fC\u0012";
      f1758[20] = "M\u001aRK4:B\nO2=mU\u000fWRY:I\u0010\u0014X%b\u000e\u0010O2";
      f1758[21] = "\u0013\u0018`xs)A\u0017gaIџ(\u0016x|05\u0012\u0019haI&R\u0011{hs)B\f\u0002";
      f1758[22] = ")g\u0010\u00046\u0004|/\tt1\u00068{\f\u0018XD:fU\u001e$\u001c}f\u000et1\u000f:f\u0004\u000edG#\u0016";
      f1758[23] = "\u001aFv\u0019\u0010S\u001cKm\u001fj\u0002NX]\u001c\u0010\fEK\u0006^\u0013\u0002\\F}Y\u0003\u001c\u001c$x\u001a\u0013\u0014N\u001ew\n\u000em";
      f1758[24] = "(\u007f*d{D'o7\u001dl\u0013.a:v{72aScl\u0007/hil|\u001aV{)do\u0013lt9y\u0016\u0000,|*p,\u000f<aS";
      f1758[25] = "\u0018U\u001a\u00117N\u0015\u0017\u001fSGZAT\u0019\u0005\u0006DT.\u001c\u0012>[E\u0014\u0013\u0002#\"\u0012T\u0012W-^J\u0013\u0012\fG";
      f1758[26] = "K=\u0019\n*dM0\u0002\fPҷre\u0013\u0003o0\u000e=T\u00034";
      f1758[27] = "\u001d|FB|\tXb\u0012\u0011\u001dɻ!zV\nd\u0015\u001buF\u0017\u001d\u0006[}U\u001e'\tK`,";
      f1758[28] = "\u0006\u001f\u0010T#H[\rUJDŹ;KRZ:\bQ\n\u0014\u0010+7";
      f1758[29] = "U5\u000f+AGZ%\u0012RG\u001dB5?.,GQ?I8P\u001f\u0016?\u0012R\u0013ADw\u0013lA\u0019I\"v";
      f1758[30] = "yF+#~]\u007fK0%\u0004<@\u001e!*;\t<Ff*`";
   }

   public static String $(String s) { return s; }
}
