package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.command.exceptions.CommandException;

public enum Enum168 {
   f3309,
   f3311,
   f3313,
   f3315,
   f3316,
   f3317,
   f3319;

   // $VF: synthetic field
   public String f3312;
   public int f3314;
   public int f3318;
   public static long f3320 = Class066.m4320(-1973951260795482473L, -7578439892053004628L, MethodHandles.lookup().lookupClass()).m4325(135181067586567L);
   public static long[] f3321;
   public static Integer[] f3322;
   public static Map f3323;
   public static Object[] f3324 = new Object[25];
   public static String[] f3325 = new String[25];

   public int m5255() {
      return this.f3314;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   Enum168(int var3, String var4, int var5) {
      this.f3314 = var3;
      this.f3312 = var4;
      this.f3318 = var5;
   }

   public int m7047() {
      return this.f3318;
   }

   public String m7048() {
      return this.f3312;
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
      f3324[0] = "*\u0013ze$Z6\tx9>N&\n3ģ";
      f3324[1] = "q#=2\r_z,,}f]n/";
      f3324[2] = "}\u0018\u0018\u0011 Tv\u0017\t^MTv\n\u001d";
      f3324[3] = "M8B}q:F7S2\f\"U0Z{";
      f3324[4] = int.class;
      f3325[4] = "java/lang/Integer";
      f3324[5] = "0\u001a*cZ\r,\u0000(?@\u0019<\u0003c.D\u0011:\u00069cI\b6F89A\u0014,F\"/B\u001d<\u001c>c{\u001b-\u0007!!J\u0019-";
      f3324[6] = "A,7\u0002|\u000eh\u0015+\u0018~Rr\u0001;\u001b5ň!";
      f3324[7] = "D!\u0007&p~X;\u0005zjjH8NkmyN}\u0003gofJ=\u0004&gsH6\u0010|kdE NKmfF2\u000elGsH6\u0010|kdE";
      f3324[8] = "p\"T'\u00106Y\u001bH=\u0012jC\u000fX>YŰ\u0010";
      f3324[9] = "h\u001f3m:]c\u0010\"\"[Sh\u001b&x";
      f3324[10] = "@i\u0007>Z\r\u001fn\u0019^N=@i\u0007>Z\r\u001fn\u0019";
      f3324[11] = "8v(3+\u0011gq6S\u007f!8v(3+\u0011gq6";
      f3324[12] = "6\u0016|\b[j5HgUc)\rN W\t;f\u0004a]\\\u00057JzY]n}\u000bp\fc";
      f3324[13] = "Ug\u001f\u001f$W\n`\u0001\u007f¦gWfE\u001ee\u0002\u0001,\u001aC";
      f3324[14] = "QU66@\u0014XD!_C\u0004ER6\u0018Sm\u0018R1<\r\u0000D\u00167e=W\u001fK1aV\u001d^Ad_M\u0017LF&&D\u0006[/";
      f3324[15] = "=P \u0001\u00107bW>aƞ\u0007?Qz\u0000Qbi\u001b%]";
      f3324[16] = "5@BpQ-jG\\\u0010I\u001d5@BpQ-jG\\";
      f3324[17] = "IZ\u0004q\u0001\u0019\u0016]\u001a\u0011է)NY\u001bnHDO\rVzy";
      f3324[18] = "P)\u000f\u001f\u001e\u0010\u000f.\u0011\u007f( P)\u000f\u001f\u001e\u0010\u000f.\u0011";
      f3324[19] = "X*eOIM\u00018qQ*\u001ee~=G@\f\u000e4|M\u00152_zgI\u0014Y\u0015;m\u001c*";
      f3324[20] = "f\u0000\"%\u0012\u00149\u0007<EϪ$a\u0003=:[I`Wp.";
      f3324[21] = "2i|+A\nmnbK\\:2i|+A\nmnb";
      f3324[22] = "uj\u000e\u0002}/*m\u0010bЩ\u001fvn\b\b;t</\u0002]";
      f3324[23] = "!f[b.W~aE\u0002\u001bg!f[b.W~aE";
      f3324[24] = "\u0013rl]YbLur=kR\u0013rl]YbLur";
   }
   Enum168() {}
}
