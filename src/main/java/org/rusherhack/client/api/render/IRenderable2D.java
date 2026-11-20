package org.rusherhack.client.api.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.render.font.IFontRenderer;

public interface IRenderable2D {
   long f792 = Class066.m4320(3267854824392318913L, 8013959238176861562L, MethodHandles.lookup().lookupClass()).m4325(247109392974678L);
   Object[] f793 = new Object[13];
   String[] f794 = new String[13];

   void render(RenderContext var1, double var2, double var4);

   default void render(RenderContext var1) {
      this.render(var1, -1.0, -1.0);
   }

   default IRenderer2D getRenderer() {
      return RusherHackAPI.getRenderer2D();
   }

   default IFontRenderer getFontRenderer() {
      return RusherHackAPI.fonts().getFontRenderer();
   }

   public static void m157() {
      f793[0] = "\u0012)Db=l\u000e3F>'x\u001e0\r/#p\u00185Wb.i\u0014uq9<q\u0018)k-,r<\u000bj";
      f793[1] = "\u0006-\n\u0010O\"\u001a7\bLU6\n4C]Q>\f1\u0019\u0010\\'\u0000q\u001f[S3\f-Cwo2\u0007;\bLX%[\u001b";
      f793[2] = "\u0017A~\u000b0|\u000b[|W*h\u001bX7F.`\u001d]m\u000b#y\u0011\u001dj\\1}\u001d^7c-g\f@";
      f793[3] = "U=z=\u001e6I'xa\u0004\"Y.3p\u0000*_!i=\r3Saov\u0002'_=3u\u0003-NaTU\u0003-N\u001dx}\b&H*o";
      f793[4] = "\u001e3VQ\b\\\u0002)T\r\u0012H\u0012*\u001f\u001c\u0016@\u0014/EQ\u001bY\u0018oC\u001a\u0014M\u00143\u001f6(L\u001f%T\r\u001bK\u001d$\u0003;";
      f793[5] = "%78Y\u000f09-:\u0005\u0015$).q\u0014\u0011,/++Y\u001c5#k-\u0012\u0013!/7q%\u0018+. -4\u0012+> '\u0003";
      f793[6] = double.class;
      f794[6] = "java/lang/Double";
      f793[7] = void.class;
      f794[7] = "java/lang/Void";
      f793[8] = "y=\u0019]\u0012\u001br2\b\u0012s\u0015y9\fH";
      f793[9] = ".wrFM\u000by`m+@\ti@fMC\towq\u0011cd, pE\u0017X({pF/";
      f793[10] = "w\u000e!\u0013)1 \u0019>~%9*\u001f#~r%(\u0000d\u00153#p\u0004X";
      f793[11] = "\u007f\u001e0\u000f\u007f\\+DlNB\\)ImZ8&\u007f^p\r3\u001euI1\fB\u001a#E:\u000f'\u001b+Jz7~A.\u00149R\u007fI!T\u0001\n|B8FoU3\u001d</";
      f793[12] = "'\u0007;F\u0000\bf\u0001cB<\fs\u0000\u0011BZ\u001fD\u00119IQ\u0019s\u0006_\u001fF\u000fb\u0015;T\u0003\u0018.|";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m157();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
