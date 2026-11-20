package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.content.component.ParagraphComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ScrollableView;
import org.rusherhack.client.api.ui.window.view.SimpleView;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.client.api.ui.window.view.WindowView;

import org.rusherhack.client.api.feature.hud.impl.Test;
public class Tab_Test extends ResizeableWindow {
   public TabbedView f2857;
   public List<WindowContent> f2858;
   public static long f2859 = Class066.m4320(-6017746985798124705L, 4919556359164190843L, MethodHandles.lookup().lookupClass()).m4325(126876667324443L);
   public static String[] f2860;
   public static String[] f2861;
   public static long f2863;
   public static Object[] f2864 = new Object[26];
   public static String[] f2865 = new String[26];

   public Tab_Test() {
    }

   @Override
   public WindowView getRootView() {
      return this.f2857;
   }

   @Override
   public String getDescription() {
      return null;
   }

   static {
    }
   public static String m5835(byte[] var0) {
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
   public static void m1499() {
      f2864[0] = "]R)./2CZ3aM.DG";
      f2864[1] = "Nn\u0017I1IEa\u0006\u0006PGNj\u0002\\";
      f2864[2] = boolean.class;
      f2865[2] = "java/lang/Boolean";
      f2864[3] = "y<K\u0007<(e&I[&<u%\u0002ȯ";
      f2864[4] = int.class;
      f2865[4] = "java/lang/Integer";
      f2864[5] = "/\u001dl\u001fai3\u0007nC{}#\u0004%R\u007fu%\u0001\u007f\u001fÒ";
      f2864[6] = "cj=C\rOhe,\fpW{b%E";
      f2864[7] = "\u000ef<Y-\u001d\u0012|>\u00057\t\u0002\u007fuř";
      f2864[8] = "v5\u0018\b?\u0002j/\u001aT%\u0016z,Qɒ";
      f2864[9] = ",yK2Oz0cInUn `\u0002\u007fQf&eX2\\\u007f*%Jy\\{6yI2^`.fMrY!\"yK2\u007fc,hGNXi&yIr^j";
      f2864[10] = "9ZJ\u001c0i%@H@*}5C\u0003Q.u3FY\u001c#l?\u0006X[lk?FI]525GCF'r\"\u0006z[,x9_n],h3FY";
      f2864[11] = void.class;
      f2865[11] = "java/lang/Void";
      f2864[12] = "Y\nj5\u0001jR\u0005{z|\u007f@\u001fy9";
      f2864[13] = "\u0007?z\u0016/J\u0002p\\\u0005hM\u0019\rx\u0005dB\u0000";
      f2864[14] = "?Sq_Ew#Is\u0003_c3J8\u0012[k5Ob_Vr9\u000fc\u0018\u0019u9Or\u001e@,&Hs\u0006\u0019V1Ct\u0014ST9Da";
      f2864[15] = "j\u0000bJ\t\u001e3\u0007'2\u0004J;\u007f&\u0002\u0000\u00197BcR\u000f&n\u001dcO\u0002Yk\u0012\"Vm";
      f2864[16] = "5A>A\u0004hzF\u007fVfqgQE_\u0000vg]r}\u000blw-3G]rn\u0015j@\u0018\n5Sh\u0002YgaW7Yf";
      f2864[17] = "\u00128\u0013:S.E<\u001emkɊ(f\u001dm\b-E'\u0013m\t\u0013";
      f2864[18] = "*\u001ef-wDw\u0015|4\u001c\u001bg\u0010\u0018{sEt\u0003%5n\u0018e";
      f2864[19] = "W\u0011H?}n\u0007HD=FЍlJZkxfS\u0006\u001aa$\u0007P\u000f\u0018n'8\u001cO\u00122F";
      f2864[20] = "&Z>y.*cT9yHժ\u001bY:900#\u0000=|";
      f2864[21] = "6CL-\u0004QsMK-bբ\u000bLK<\u001d_2C\f5^";
      f2864[22] = "%G D&?kZ}UIznI\u007fV-d\u0014\u0014`\u0011wc+X \u001b+\u0002+V\u007f\u0010vo\u007fR KI";
      f2864[23] = "M\u001f;\u001cT\u0003\b\u0011<\u001c2\u0013p\u001c>\u0007\n\u000f\u0010L1\u0003N}M_ _@\u001d\u001dP$\u001b2";
      f2864[24] = "l!nkq<5&+\u0013rjQ!e~*dld5q\u00159.e-w-`) U";
      f2864[25] = "-\u0019\u0019=!\u001a\u007fV\u0006`MV\u0013\u0014\u001efs\u001b,X^l/z/Q\\c,Ec\u0011V?M";
   }
}
