package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.option.Perspective;
import org.rusherhack.client.api.feature.command.arg.ItemReference;

public enum FreeLookCamera {
   f5412,
   f5414;

   public Perspective f5411;
   // $VF: synthetic field
   public static long f5415 = Class066.m4320(1177764186568256383L, 679049268774628450L, MethodHandles.lookup().lookupClass()).m4325(100802906515205L);
   public static Object[] f5416 = new Object[19];

   FreeLookCamera(Perspective var3) {
      this.f5411 = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
      f5416[0] = "aWxh[*}Mz4A>mN1˟";
      f5416[1] = "#?E?\u007f\u0005\n\u0006Y%}Y\u0010\u0012I&6ʲC";
      f5416[2] = "\u0018B\u0017\u0001'\u000b\u0004X\u0015]=\u001f\u0014[^L9\u0017\u0012^\u0004\u00014\u000e\u001e\u001e\u0016J4\n\u0002B\u0015\u00016\u0011\u001a]\u0011A1P\u0016B\u0017\u0001\u0017\u0012\u0018S\u001b}0\u0018\u0012B\u0015A6\u001b";
      f5416[3] = "7Vbo\u001aO<Ys gW/^zi";
      f5416[4] = "\u000b\nY>\u0014p\u000b\nNb\u0018\u007f\u0011AN|\u0018j\u00160\u0018$@!";
      f5416[5] = "\u0016N6DD\t\nT4\u0018^\u001d\u001aW\u007f\tZ\u0015\u001cR%DW\f\u0010\u00127\u000fW\b\fN4DU\u0013\u0014Q0\u0004RR\u0018N6D\u007f\b\u001cQ\u0003\u000fP\u0019\u000bY?\tS";
      f5416[6] = "P\u0017'7{uy.;-y)c:+.2˂0";
      f5416[7] = "]\u00164\u0018`\u0014V\u0019%W\u000b\u0016B\u001a";
      f5416[8] = "i09$cjb?(k\u000ejb\"<";
      f5416[9] = "dL4\f\u00142oC%Cu<dH!\u0019";
      f5416[10] = "C$\u001cYW\u0002\u001e$\u0011\u00006\u0016\u0019$\u0007\faBFw]]6C\u00156Z\u0001L\u001e\u0015;\u0003";
      f5416[11] = "&8lp[0k;zONP&8lp[0k;z";
      f5416[12] = "VRKfTp\u001bQ]YƓ\u0010ZVJ2\u000b\u007f\u0000@I'm";
      f5416[13] = "\tbJag@TbG8\u0006TSbQ4Q\u0000\f1\u000bd\u0006\u0001_p\f9|\\_}U";
      f5416[14] = "_TF1\u001dS\u001a\u001d\u0000'l\u001bd\u0017P5\u001d]YIZ#\u00167^CQ+\u0006\n\u0000IG l";
      f5416[15] = "N\u000b\u001dv`/\u0003\b\u000bI\u0014ON\u000b\u001dv`/\u0003\b\u000b";
      f5416[16] = "r>s!\u001c_~|w#-\u001f&cr\"j\u000fO:r=R\u000e/6m\u007fPaui`>G\\+cv5-\\v{a~\u0013P4\u007fcO";
      f5416[17] = "#P\b~NzdL\u0016x5m\u001a\u0015\u0016*D+'K\u001c<OA A\u00174_|~K\u0001?5";
      f5416[18] = "x\n\fhBf5\t\u001aWˇ\u0006t\u000e\r<\u001di.\u0018\u000e)";
   }
   FreeLookCamera() {}
}
