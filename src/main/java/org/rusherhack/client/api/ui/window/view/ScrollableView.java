package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.setting.Setting;

public class ScrollableView extends SimpleView {
   public double f1064;
   public double dragDeltaY;
   public Scrollbar f1065;
   public boolean f1066;
   public static long f1067 = Class066.m4320(5359357312585088558L, 2791431781397275590L, MethodHandles.lookup().lookupClass()).m4325(62727450637376L);
   public static long[] f1068;
   public static Long[] f1069;
   public static Object[] f1071 = new Object[45];
   public static String[] f1072 = new String[45];

   public ScrollableView(String var1, Window var2, List<? extends WindowContent> var3) {
    }

   @Override
   public void renderViewContent(double var1, double var3) {
        
    }

   public boolean shouldClampToBottom() {
      return false;
   }

   public void setDraggingGrip(boolean var1, double var2) {
        
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public Scrollbar getScrollbar() {
        return null;
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   @Override
   public double getTopOffset() {
        return 0.0;
    }

   public double getContentHeight() {
        return 0.0;
    }

   public boolean isScrollable() {
        return false;
    }

   public ScrollableView(Window var1, List<? extends WindowContent> var2) {
    }

   public boolean isDraggingScrollbarGrip() {
        return false;
    }

   static {
   }
   public static void m786() {
      f1071[0] = "LdejgBP~g6}V@},'y^FxvjtGJ8w-;@Jxf+b\u0019U\u007fg3;d@dm(yVAzg\u0012|RT";
      f1071[1] = double.class;
      f1072[1] = "java/lang/Double";
      f1071[2] = "/]\u001bU-}3G\u0019\t7i#DR\u00180z%\u0001\u001d\u00156e![\u0015\u00141&\u0005N\u000f\u00121o";
      f1071[3] = boolean.class;
      f1072[3] = "java/lang/Boolean";
      f1071[4] = "{5pm+\u001dg/r11\tw,9 5\u0001q)cm8\u0018}ib70\u0004gix!3\rw3dm\n\u000bf({/;\tf";
      f1071[5] = "\u0012kU},|\fcO2K}\u001dxBhm{";
      f1071[6] = ";d|Ur\"0km\u001a\u0013,;`i@";
      f1071[7] = "g[\u0002\t\u000fI{A\u0000U\u0015]kBKD\u0011UmG\u0011\t\u001cLa\u0007\u0010NSKaG\u0001H\n\u0012kF\u000bS\u0018R|\u00072N\u0013Xg^&H\u0013HmG\u0011";
      f1071[8] = "T\u0001hZq_H\u001bj\u0006kKX\u0018!\u0017oC^\u001d{ZbZR]z\u001d-]R\u001dk\u001bt\u0004M\u001aj\u0003-}R\u001dk\u001bt|R\u0016x";
      f1071[9] = "\u0018Ewon:me|`\u007fu\u0010}ogv<x";
      f1071[10] = "\u0010J(\u0015(Q\u000eB2ZJM\t_";
      f1071[11] = "KZ;\u001de\u0017W@9A\u007f\u0003GCrP{\u000bAF(\u001dv\u0012M\u0006)Z9\u0015MF8\\`LRA9D91ME,_r4MM+";
      f1071[12] = void.class;
      f1072[12] = "java/lang/Void";
      f1071[13] = "]}o\u001dKwAgmAQcQd&ɇ";
      f1071[14] = "3{\u0016{\tZ/a\u0014'\u0013N?b_6\u0014]9'\u00020\u000f[5g\u0016{(J(}\u0018;\u001c";
      f1071[15] = "\u0005?QqH[p\u001fZ~Y\u0014\r\u0007IyP]e";
      f1071[16] = "NV\u000ex@\u0016;v\u0005wQYFn\u0016pX\u0010.";
      f1071[17] = "\u0001\u000b\u0002Y\u001c4\u001d\u0011\u0000\u0005\u0006 \r\u0012K\u0014\u0002(\u000b\u0017\u0011Y\u000f1\u0007W\u0003\u0012\u000f5\u001b\u000b\u0000Y\u0019(\u0000\u001d\n\u0000@\u0013\u000b\n\f\r\u000b \f\u0015\u0000 \u0007/\n\u0016\u0012";
      f1071[18] = "^h~\u001ei7Br|Bs#Rq7Sw+Ttm\u001ez2X4\u007fUz6Dh|\u001el+_~vG5\u0015Xt}_l";
      f1071[19] = "\u0016ewDy]Jxp@\u001d[@is;!FRkwE~\u0006\u001dh\u000f";
      f1071[20] = ".T3K\u0014\u001cw\\w\u001ad\u0019\u007fZ\u000e\u001b\u0005\u0019rZNO^\u001f,A~\u0011\u0007Ms&";
      f1071[21] = "+Mk\u0004=*$M=F\u0000ζ\u0015\u001f0\u0001aqe\u0005.Ux\u0010";
      f1071[22] = "x\u0017>^\u001d\n\u007f_%Cy\u0013i?-E\u0018\u0000s\u0003/>C\u0014iT8\u0004\u0010LwX@";
      f1071[23] = "\u001aFm(9]\u0018\u0006d\u0011l%CG{p8\u0018A\u00041!";
      f1071[24] = "\t\u0007J6m \u000bGC\u000f=XZ\u0005Io(!\u0014U\u001cqWiW]Mp.'\u0007\bS\u000f";
      f1071[25] = "s;\u0002O\t'|;T\r4v*eA\u001dRa\tbF\f4\"\"l@\u0012\u0005x?{R";
      f1071[26] = "2}lny 0=eW887>o;\b<9&s\u000b$\u00127?w0&Xj%pf;b9}njC";
      f1071[27] = "-B\bmJv/\u0002\u0001T\u001fc37\b2\fc)\u0000/9\u0011a/\u0000omJgq\u001b_3\u00135.|";
      f1071[28] = "o\u0001^Y-)w\u0007AGKԭ\u0006\u0007A\u001c*-v\u001d_H3L";
      f1071[29] = "6-2\u0000e@4nxQ^\u0006fh$\u0005:}4(*_9Mjqx\u0000^Gkir\u0019d\u00143w~an\u001b<`|\u00118\u0016`yC";
      f1071[30] = "N)(\u0013NUA)~Qs˵p{s\u0016\u0012\u000e\u0000amB\u000bo@w&^L\u001f\u0016zzGs";
      f1071[31] = "~`^?2\u0015'h\u001anB\u001e9RD|/\u0005/~#;x\u0016|u\u0013e!D#\u0012\u001a8+A%\"Day\u001eB(Eys\u0007x{\u001dg\u007f\u007f";
      f1071[32] = "rt=AGzp7w\u0010|,-\")X|}/0}XF.w.q E} u+\u0010\u001b$r*L\u0019F.w,|G\u001f|(K|FM5v;*K\u0011,I";
      f1071[33] = " ~C\u001c@\u0011zcT\u000e\"Ac|V\b^Ge\u0011\u0017\u001dZ_{qK\u0000][\u001f";
      f1071[34] = "TjSC~=[j\u0005\u0001Ch\u0007.,\u0011\"h\n.lEynT5\\\u001b <\u000bR";
      f1071[35] = "qht \u00063s(}\u0019]0H=i~X/z<wt<qu-\"a\u0006\"-3.\u0019";
      f1071[36] = "\u0018D\u0017/\u00005ALS~p0IJ5s\u00163CIjy\fc[\bTbJ5M6";
      f1071[37] = "o+\u0011D\u0015$\"u\u001aRq`8c.K\u001dp>}\u0019\"H&6%\u0011\u0012\u0016\u007fdz";
      f1071[38] = "<\u001e$\rb!>]n\\Ysj]\u000e\u0007#{cE\u0012\u00027gj]UUcu9Fe\u000b:'f!";
      f1071[39] = "r : ps.==$\u0014s '\u00042doIf$$%ks5|:)\u0013";
      f1071[40] = "Ek\u001e\u0011\u000fgG+\u0017(Ǩ\u001f\u001eo\u0010\u0016R/@6BI";
      f1071[41] = "2C\u0019HV30\u0003\u0010q\u000019\u00122\u001c\b79,~HV\"n\u001aN\u0016\u000fp1";
      f1071[42] = "\u00105\u0000mY4]k\u000b{=gGc\u001bf[pxl\u000bg\\jO\u0005^1T2G5\u0000h\u0006m";
      f1071[43] = "\u0014\u0014Yk%[\u0011\u0002\t$Znl.$\u0013\u0000*\u0014\u0014Yk%[\u0011\u0002\t$";
      f1071[44] = "z D#-}x`M\u001aΧ\u0005\"xX+o?q F'";
   }

   public ScrollableView() {}
}
