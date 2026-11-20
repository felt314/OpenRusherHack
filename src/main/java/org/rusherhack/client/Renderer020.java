package org.rusherhack.client;
import org.rusherhack.*;

import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.core.utils.ColorUtils;

public abstract class Renderer020 extends ElementBase implements IRenderable2D {
   public int f1171;
   public Renderer034 f1172;
   public static Object[] f1174 = new Object[25];
   public static String[] f1175 = new String[25];

   public Renderer020(Renderer034 var1) {
      super();
      this.f1171 = 1;
      this.f1172 = var1;
   }

   public abstract void m550();

   @Override
   public IRenderer2D getRenderer() {
      return this.f1172.getRenderer();
   }

   @Override
   public IFontRenderer getFontRenderer() {
      return this.f1172.getFontRenderer();
   }

   public void m2769(IRenderer2D var1, boolean var2, double var3, int var5) {
      boolean var12 = Renderer034.m2998();
      int var10 = this.f1171 = ColorUtils.interpolateColor(this.f1171, var5, 0.3F);
      boolean var8 = var12;
      if (var8) {
         if (var2) {
            double var10003 = this.getWidth();
            double var10004 = this.getHeight();
            boolean var10009 = true;
            var1._drawRoundedRectangle(0.0, 0.0, var10003, var10004, var3, true, false, 1.0F, var10, -1);
            return;
         }

         var1.drawRectangle(0.0, 0.0, this.getWidth(), this.getHeight(), var10);
      }
   }

   public boolean m2770() {
      return false;
   }

   static {
      m122();
   }
   public static void m122() {
      f1174[0] = "@sr_\u001c_\\ip\u0003\u0006KLj;\u0012\u0002CJoa_§";
      f1174[1] = "\\8;uU @\"9)O4P!r8K<V$(uʢ";
      f1174[2] = "Do\u0005(\u001f|Xu\u0007t\u0005hHvLe\u0001`Ns\u0016(\fyB3\u0010c\u0003mNoLO?lEy\u0007t\fkGxPB";
      f1174[3] = "\u0001![G\"(\u001d;Y\u001b8<\r8\u0012\n<4\u000b=HG1-\u0007}N\f>9\u000b!\u0012 \u00028\u00007Y\u001b5/\\\u0017";
      f1174[4] = "sQS\u0000\u001d3oKQ\\\u0007'\u007fH\u001aM\u0003/yM@\u0000\u000e6u\rAGA\u0003pFYK\u00012^BGK";
      f1174[5] = double.class;
      f1175[5] = "java/lang/Double";
      f1174[6] = int.class;
      f1175[6] = "java/lang/Integer";
      f1174[7] = boolean.class;
      f1175[7] = "java/lang/Boolean";
      f1174[8] = float.class;
      f1175[8] = "java/lang/Float";
      f1174[9] = void.class;
      f1175[9] = "java/lang/Void";
      f1174[10] = "wEt=(Dk_va2P{\\=ɧ";
      f1174[11] = "?oh^\u0012\\#uj\u0002\bH3v!\u0013\u000f[53z\u0004\tE#3L\u001f\fF\"H{\u0019\fZ";
      f1174[12] = "Z#H\u00141eF9JH+qV:\u0001Y/yP?[\u0014\"`\\\u007f]_-tP#\u0001\\,~A\u007ff|,~A\u0003JT'uG4]";
      f1174[13] = "q\u001d&Ugsz\u00127\u001a\u0006}q\u00193@";
      f1174[14] = "X{(\u0018\u00052\u001f0-\u000e\u007fc\u000e=U\u001f\u001ec\u0003=\u0015I\u00194\u0011:pN\u0000}\u0002A";
      f1174[15] = "@}Z\u0016V\b]fM.Ĳ9\u0019eKDWP]?WN";
      f1174[16] = "{bt4WB/|vr,ɴB3{&GB9?*-V&";
      f1174[17] = "M}[\rt\u0004PfL5É5\u0011m\bMbQEs\n\u000b";
      f1174[18] = "IX^uj2O\n\u001c}\tg\t\\\u001cWd`\u000f\\\u0005bmfs\u000e\u00055{p\u0016\t\u001c|h\u000bHS[\u007frnOJ\u0012l\t0\u0015\r\u0011vl7\fD\u0002\r2mKG\u0018h5t\u0002Tc1mv\u0019Y\nu7j\u00135]rjkO\r\rusos";
      f1174[19] = "\u000f\\\f@YPK\u001d\t\u001beR[Z.\u001b\u0003AlK\u0006\u0010\bG[\\`L\u0006\u0004W\u0016\u0010\u0019\t\u0007[&";
      f1174[20] = "WY%#~<\\\u00120g\u0018;\u0001\u001e0``=\u0003\u000b!wS=\u0003\u0005'\u001a$>\u001a\b1s`d\u0006\u0002]&|'\r\u000e4b&;\u0007bf| (\u001c\u0007aei;g^9gr6\u000e\u001ac{xZ";
      f1174[21] = "D0p.7\u0002Bb2,Tl\u0012'$#\u000e\\\u0003;!18a\u00136152T\u001a0Mg2\u0003\f&(`+J\u001f]v:lI\u00058q#%Z~f+d&@\u001ba2-5;E;u./^B\"<=T\u0000\u0018e?'1\u0007\u0001,,\\i\u000b\u00146)'eZ\u001f'MadQ\u001596m5Z\u0004]sc?W\u001b#&6.K~a)!>W\u0017%s=4;B9068R\u0006c,<T\u0005\u0001>-`lU\u0006')\\";
      f1174[22] = "\r\b(\u0019\u001czII-B xY\u000e\u001eHF{Y\b)_ -YO<F\u0019+\u000b\r4%";
      f1174[23] = "N\u0006\u0001Q\u0011\u0010\tM\u0004GkA\u0018@cZ\u0007R\u0015<\u0007]S\\\u000eY\u0000D\u001aOu";
      f1174[24] = "$(q\u0014w\u001493f,p%~7,VhK(6 \u0013\u001a\u001a\"eg^tL#i\",";
   }

   public Renderer020() {}
}
