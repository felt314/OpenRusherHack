package org.rusherhack.client.api.feature.window;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.interfaces.IPinnable;

public abstract class PinnableWindow extends Window implements IPinnable {
   public boolean f743;
   public static int f744;
   public static long f745 = Class066.m4320(-1029881824396644825L, 6162963914406871740L, MethodHandles.lookup().lookupClass()).m4325(246234897050059L);
   public static String[] f746;
   public static String[] f747;
   public static Object[] f749 = new Object[27];
   public static String[] f750 = new String[27];

   @Override
   public boolean deserialize(JsonElement var1) {
        return false;
    }

   public PinnableWindow(String var1, double var2, double var4) {
    }

   public PinnableWindow(String var1, double var2, double var4, double var6, double var8) {
    }

   @Override
   public JsonElement serialize() {
        return null;
    }

   @Override
   public boolean isPinned() {
        return false;
    }

   @Override
   public void setPinned(boolean var1) {
        
    }

   public static void m1691(int var0) {
      f744 = var0;
   }

   public static int m1692() {
      return f744;
   }

   public static int m1693() {
      int var0 = m1692();
      return var0 == 0 ? 60 : 0;
   }

   static {
    }
   public static String m1491(byte[] var0) {
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
   public static void m157() {
      f749[0] = ":l\u001eiC\u0017&v\u001c5Y\u00036uW$]\u000b0p\riP\u0012<0\u001f\"P\u0016 l\u001ciF\u000b;z\u00160\u001f2<p\u0017&S\u000e0I\u0010)U\r\"";
      f749[1] = boolean.class;
      f750[1] = "java/lang/Boolean";
      f749[2] = "\u0000B\u001fu\u0017\u0019\u000bM\u000e:{\u001a\u0005O\fuW";
      f749[3] = "e\u0003\u0005W0@i\u000b\u0004\u001cyHu\u0003\u0006W\u001d\\i\u0002'\u001b=Je\u0018";
      f749[4] = "\u000f\u0000({e5\u0004\u000f94\u0018-\u0017\b0}";
      f749[5] = void.class;
      f750[5] = "java/lang/Void";
      f749[6] = "\u001bZ#?q^\u0007@!ckJ\u0017CjrlY\u0011\u0006'~nF\u0015F ?bY\u0013])tm_Z{0cjE\u0013k%aw^\u0006M";
      f749[7] = "-\u001c\u0019X%G!\u0014\u0018\u0013lO=\u001c\u001aX\b[!\u001d1\u001a'E+\u001d\u0000";
      f749[8] = int.class;
      f750[8] = "java/lang/Integer";
      f749[9] = "Md1gspQ~3;idA}x\u0004";
      f749[10] = "t]\u0007<C\u000ehG\u0005`Y\u001axDNq]\u0012~A\u0014<P\u000br\u0001\u0006wP\u000fn]\u0005<F\u0012uK\u000fe\u001f,rA\u0004}F";
      f749[11] = "ybu\u000bC:exwWY.u{<ɑ";
      f749[12] = "%f`G <.iq\bA2%buR";
      f749[13] = "l\u001e1S+@kOe>ȫ2s@`C)\rvD:";
      f749[14] = "\u001b<Ra\u0006\u0018Ww\u00193\u007fϳ%}Jg@\u0017\u0015~\u001f?\u0015u\u001e/F=\u001dE\u001dz\u001eh\u007f";
      f749[15] = ",gNLTRd8\rA=E|dH\u001dzU\u0015zQM@\u0002*\u007fU\u0017=\u0002r{\t\u0019TJ-8\u0004p";
      f749[16] = "\u0019$\u0011\u001d\bE\u001euEp_Z\u0007s\u0007\u0011ZS\u001dl\u0010p\u000fF\u0004\u007f\u0003@\tR\u0013w}\nW\n\u0001'B\u000fSP|";
      f749[17] = "51\tF\u0013ar>\u0003^v0c7;Y\u0011!b!\u001fRvbf>\\AFa3f\t#O>tg\nJ\u0007a7jc\u0018\n?`+\u0018CJ0j[";
      f749[18] = "\t\u001fy\u0006 }N\u0010s\u001eE%Z\u000e\u0013X, \f\u0017#[yxYui\u0007x8\nJl\u0003\"E";
      f749[19] = "\u007f'\fw|\u000exvX\u001aŏ|$$\rc$\u0018wa\u0011#GGf{\u000fj<\u001c&t\u0005\u001a";
      f749[20] = ".Y\u001d+F@~X\u001c6w\n\u0012\u0004J+HD\"\u0007\u001fs\u001d&)VFq\u0015\u0016*\u0003\u001e$w";
      f749[21] = "\u001dj#j\f$\\*6g7ä\"hp6N\u007fF;5*\u000e\u001c";
      f749[22] = "9\u0017\tQ\u0007j>F]<Gu&L\fX]j1-YMDy\"\u001d_YSq\\";
      f749[23] = "x*(T\u001b{~>?\\e$)'\u0019N'0#=\u0017_\u0007&/'P\u000f\u000f!!>hH\u0000+9[";
      f749[24] = ")od\u0018dkn`n\u0000\u0001<~y\u000eFh6,g>E=ny\u00052\fy2m54\u0018n:\u0013";
      f749[25] = "ePwj\u0019\bcD`bgW4]Fp-_>Ebb\u00018#E2v^\u0007&Ah\u000b";
      f749[26] = "4^:G\u0010\u000f3\u000fn*B}a]8\u0012\u0014\u0016lZhH+Mh\nn\u0015@@oZ4*";
   }

   public PinnableWindow() {}
}
