package org.rusherhack.client.api.render.graphic;
import org.rusherhack.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.StackWalker.Option;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.Class049;
import org.rusherhack.core.setting.Setting;

public class VectorGraphic implements IGraphic {
   public int f822;
   public int f823;
   public InputStream f824;
   public int f825;
   public int f826;
   public static boolean f827;
   public static long f828 = Class066.m4320(-7551361044654565659L, 5604469169470205981L, MethodHandles.lookup().lookupClass()).m4325(254862808255902L);
   public static String f829;
   public static Object[] f830 = new Object[23];
   public static String[] f831 = new String[23];

   @Override
   public int getXOffset() {
      return 0;
   }

   @Override
   public InputStream getInputStream() {
        return null;
    }

   public VectorGraphic(InputStream var1, int var2, int var3) {
    }

   public int getSvgWidth() {
        return 0;
    }

   public VectorGraphic(String var1, int var2, int var3) {
      this(StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE).getCallerClass().getClassLoader().getResourceAsStream(var1), var2, var3);
   }

   @Override
   public int getWidth() {
        return 0;
    }

   @Override
   public int getYOffset() {
      return 0;
   }

   public void setSvgWidth(int var1) {
        
    }

   @Override
   public int getHeight() {
        return 0;
    }

   public int getSvgHeight() {
        return 0;
    }

   public void setSvgHeight(int var1) {
        
    }

   public static void m1869(boolean var0) {
      f827 = var0;
   }

   public static boolean m1870() {
      return f827;
   }

   public static boolean m1871() {
      boolean var0 = m1870();
      return !var0;
   }

   static {}
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
      f830[0] = "}3GA\u0002ma)E\u001d\u0018yq*\u000e\f\u001cqw/TA\u0011h{oR\n\u001e|w3\u000e\b\u0002yb)I\f^Nw\"T\u0000\u0002_` P\u0007\u0019{";
      f830[1] = "/6\u007f\\9)*y@Sg51\u0004}Or!(";
      f830[2] = int.class;
      f831[2] = "java/lang/Integer";
      f830[3] = boolean.class;
      f831[3] = "java/lang/Boolean";
      f830[4] = void.class;
      f831[4] = "java/lang/Void";
      f830[5] = "\u0011\b>t\u0006x\u001a\u0007/;{`\u001a\n#BIx\u0010\f:1gd\u000f\u0000'{";
      f830[6] = "8\u0014wrL`$\u000eu.Vt4\r>?R|2\bdrϧ";
      f830[7] = "\b\u0012=0}y\u0003\u001d,\u007f\u0000a\u0010\u001a%6";
      f830[8] = "-<\u0016\u0005+\f1&\u0014Y1\u0018!%_H6\u000b'`\u0002N-\r+ \u0016\u0005\n\u001c6:\u0018E>";
      f830[9] = ":Q\u000f\u000f\u001cJOq\u0004\u0000\r\u00052i\u0017\u0007\u0004LZ";
      f830[10] = "{_\u0003)\u0015lgE\u0001u\u000fxwFJɳ";
      f830[11] = "?o\u007fy\f24`n6m<?kjl";
      f830[12] = "M\fYpBh\u0017K@h%ˎqKWeH,\n\rHvISM\u0005JgZ(\u000b\u001aYf%";
      f830[13] = "\rCBF1@\u0011LxȈJ\u001c\u001cK\u0002O;]W\u0015I";
      f830[14] = "<<QaLP{-B#*Ւ\u0001y\f#IC1\u007f\u00070\u00163";
      f830[15] = "jhf?NB(<2n+)\u001cQ\u0014\u0015m$\u001aI\u0014\u000fp$\u000b@\u0013\u0019q>\u0017F\u0010T\u0010\u0016jf8eRB>7";
      f830[16] = " \u000fNT\u001cv<\u0000tĬg*1\u0007\u000e]\u0016kzYE";
      f830[17] = "&ck$\f=:lQ5wf5t8>\u00076<{m\\I*9c3,\u0019#66Q";
      f830[18] = "^|#fxaBs\u0019ą\u0003tF{fa>v\u000er";
      f830[19] = "\u0007\u0002!\u0011N)\u001b\r\u001b\f5v\u001eR!\u0013U2^W}i";
      f830[20] = "d9v\u0000B'x6Lѓ9{u16\tH:>o}";
      f830[21] = "BwNm\u0013\u001a^xtЍhFS\u007f\u000ed\u0019\u0007\u0018!E";
      f830[22] = "8_/mT#$P\u0015Ӽ/|!\u000f/oO8a\ns\u0015\u0015:`V\u007fdU<>K\u0015";
   }
}
