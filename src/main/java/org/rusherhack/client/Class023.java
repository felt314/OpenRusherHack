package org.rusherhack.client;
import org.rusherhack.*;

import org.rusherhack.client.api.render.RenderContext;

public abstract class Class023 extends Renderer020 {
   public static Object[] f1194 = new Object[12];
   public static String[] f1195 = new String[12];

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      this.getFontRenderer().drawString(this.m2823(), 2.0, 1.5, -1);
   }

   @Override
   public double getHeight() {
      return this.getFontRenderer().getFontHeight() + 2.0;
   }

   public Class023(Renderer034 var1) {
      super(var1);
   }

   public abstract String m2823();

   @Override
   public double getWidth() {
      return this.getFontRenderer().getStringWidth(this.m2823()) + 4.0;
   }

   static {
      m194();
   }
   public static void m194() {
      f1194[0] = "\u0010yd^KX\fcf\u0002QL\u001c`-\u0013UD\u001aew^ð";
      f1194[1] = "\u000eu7`\u000e\u0006\u0012o5<\u0014\u0012\u0002l~-\u0010\u001a\u0004i$`\u001d\u0003\b)\"+\u0012\u0017\u0004u~(\u0013\u001d\u0015)\u0019\b\u0013\u001d\u0015U5 \u0018\u0016\u0013b\"";
      f1194[2] = "x\bO\u007f+?d\u0012M#1+t\u0011\u000625#r\u0014\\\u007fć";
      f1194[3] = "JDn\u0011\u0004tAK\u007f^ylRLv\u0017";
      f1194[4] = double.class;
      f1195[4] = "java/lang/Double";
      f1194[5] = int.class;
      f1195[5] = "java/lang/Integer";
      f1194[6] = "\u0019rc/L\"\u0012}r`-,\u0019vv:";
      f1194[7] = "~\u001f5B\u001c3x\u000b<F}ɕGJ3E\u0007cz\u00026\u0001\u0016\r";
      f1194[8] = "h\thA\u0017\u001c:S?J/K+\\p|S]0S`'\u0015\u0019/Oa\u001a]\u001ck^\u000f\u001c\u0010Lo\u0004pNQ\u001b!54\u0018D\u0019`JfY\u0013WQ\t3AQM4WrJ\u0015'j\nd\u0019\u001eX8K3W/";
      f1194[9] = "\u001f<\u00068x;MfQ3@oK|:\":a@o>?,|F\u0000[`>zH=\u0013ezk&;^5~1Yi\u001fb0\u0000";
      f1194[10] = "X\r\u0015\u0016\rF\nWB\u001d5\u0012\fM<\u0017S\u0001!\\\u0013\u001fU\u0001a\nM\u001b\u000bL\u001eX\fLE}";
      f1194[11] = "\nwgH!y\u0014t+6w%\u0015PqPd\u0012\u0004xz[b%\u0013\u001e/\n\u007f.Q%}P(%i";
   }
}
