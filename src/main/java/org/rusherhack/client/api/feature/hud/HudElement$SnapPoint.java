package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;

public enum HudElement$SnapPoint {
   TOP_RIGHT,
   BOTTOM_RIGHT,
   BOTTOM_LEFT,
   TOP_LEFT,
   TOP_CENTER;

   // $VF: synthetic field
   public double f592;
   public double f593;
   public static long f594 = Class066.m4320(-4777671190434894006L, 7851407110251952846L, MethodHandles.lookup().lookupClass()).m4325(82263886013959L);
   public static Object[] f595 = new Object[19];

   HudElement$SnapPoint(double var3, double var5) {
      this.f592 = var3;
      this.f593 = var5;
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
      f595[0] = "n*D4'\u001cr0Fh=\bb3\ry9\u0000d6W44\u0019hvVs{\u001eh6Gu\"GV1M~:\u001eB7Mn0\u0007u\u0010Bt1\u0005d*a{&\f";
      f595[1] = "\u007fC\u0003/\f\u000ftL\u0012`q\u0017gK\u001b)";
      f595[2] = "\u000b-aU*8\u00177c\t0,\u00074(\u00184$\u00011rU9=\rq`\u001e99\u0011-cU08\u0000qN\u000e<\b\b:k\u001e69@\fh\u001a(\u001d\u000b6h\u000f";
      f595[3] = "JjfICQcSzSA\ryGjP\n\u001c}OlUPQpV`\u0015B\u001apR|IAQySm\u0015l\nuce^I\u001a\u007fR-hJ\u001eavfRJ\u000b*";
      f595[4] = "D^@\u0001lxXDB]vlHG\tLq\u007fN\u0002D@s`JBC\u0001{uHIW[wbE_\tkw~[MSLvHSOB_jdDB";
      f595[5] = "4.:\t&\u000e\u001d\u0017&\u0013$R\u0007\u00036\u0010oC\u0003\u000b0\u00155\u000e\u000e\u0012<U'E\u000e\u0016 \t$\u000e\u0007\u00171U\tU\u000b'9\u001e,E\u0001\u0016q(/A\u001f2:\u0012/TT";
      f595[6] = "V\u0018\u0007kO(]\u0017\u0016$$*I\u0014";
      f595[7] = "-\u000eQ@\rs&\u0001@\u000f`s&\u001cT";
      f595[8] = "\u0005i\u0007%6\u001a\u000ef\u0016jW\u0014\u0005m\u00120";
      f595[9] = "x0EX{x\"?\\^\u000bL\u0006\u0002z'NQ\u0005\u0013h<\u000b?/=\u001e\u0010ue $\u0018";
      f595[10] = "=B\u001e]\u0015bgM\u0007[eVCp!\" K^m2%9\u001c=B\u001e]\u0015bgM\u0007[";
      f595[11] = "|(OKY?&'VM)\u001d\u0002\u001e{)h\u000e\u0005\u001a,JG\"}6R\u0010H;{";
      f595[12] = "~|\u001f(\u0012~k|\u0003\u0016L\u0006)4G\u007f^j)c\u0006w`?*1\u0011(\f?}p\u0019\u0016";
      f595[13] = "4\u0005jktDn\nsm\u0004ѧ\rPxl?Us[u74:";
      f595[14] = "\b7[_,\u0005R8BY\\'v\u0001o,\u0011=m\u0014bge\u0015RaH\u0019?\u001aKg";
      f595[15] = "xC8^\"\u000e$N$\tA\u0019-D;\u000f\u0006\tD\u001dx\u00029\t!\u001a6Z'g}\u001ay\u000b\u007f\u000b}M8\u0003A['^z\u0001(\u0007*B-b";
      f595[16] = "\tAN\u0003~|N\u001fI\u0013\u000f*2C\u000b\\f8^C\\\u001dn\u0006\u000b@\u000e\n1j\u000b\u0017O\u0002\u000f";
      f595[17] = "C\u0012Z3\u0007*\u0019\u001dC5w\b=$nO:\u001a&|\u0000e\u0014l\n\u0002Zj\rj";
      f595[18] = "Po)[\\\n\n`0],(i:;\\\u0017\u001b\u001716\u0007\u001c";
   }

   HudElement$SnapPoint() {}
}
