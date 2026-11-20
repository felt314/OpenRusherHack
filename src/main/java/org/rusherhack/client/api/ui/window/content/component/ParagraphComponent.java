package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public class ParagraphComponent extends TextComponent {
   public double heightCache;
   public WindowView parent;
   public int color;
   public double lineSpacing;
   public static Object[] f1005 = new Object[31];
   public static String[] f1006 = new String[31];

   public ParagraphComponent(Window var1, String var2, double var3) {
      super(var1, var2);
      this.lineSpacing = 1.0;
      this.heightCache = 9.0;
      this.color = -1;
      this.lineSpacing = var3;
   }

   public ParagraphComponent(Window var1) {
      super(var1);
      this.lineSpacing = 1.0;
      this.heightCache = 9.0;
      this.color = -1;
   }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public void setLineSpacing(double var1) {
      this.lineSpacing = var1;
   }

   public void updateHeight() {
      this.heightCache = this.getFontRenderer().splitString(this.getText(), this.getWidth()).size() * this.getFontRenderer().getFontHeight() * this.lineSpacing;
   }

   public ParagraphComponent(Window var1, String var2) {
      this(var1, var2, 1.0);
   }

   @Override
   public double getHeight() {
      return this.heightCache;
   }

   public void setColor(int var1) {
      this.color = var1;
   }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
    }

   static {
      m157();
   }
   public static void m157() {
      f1005[0] = "\u0011v\u000f\u0002WO\rl\r^M[\u001doFOIS\u001bj\u001c\u0002DJ\u0017*\u001dE\u000bM\u0017j\fCR\u0014\u001dk\u0006X@T\n*\u000bCHJ\u0011j\rBQ\u0014*a\u0010XfU\u0013t\u0007B@T\n";
      f1005[1] = ":;/!\u000fx\u0013\u00023;\r$\t\u0016#8F5\u000e\u0005%}\u001b3\u0015\u0003)=\u000fx2\u00124'\u00018\u0006L";
      f1005[2] = "X\u0007](\u0019\bD\u001d_t\u0003\u001cT\u001e\u0014e\u0007\u0014R\u001bN(\n\r^[\\c\n\tB\u0007_(\u001c\u0014Y\u0011UqE*^\u001b^i\u001c";
      f1005[3] = "Z\tBgunF\u0013@;ozV\u0010\u000b*krP\u0015Qgfk\\UP )l\\\u0015A&p5C\u0012@>)L\\\u0015A&pM\\\u001eR";
      f1005[4] = "\u0001\u0013\bLMX\u001d\t\n\u0010WL\r\nA\u0001SD\u000b\u000f\u001bL^]\u0007O\u001a\u000b\u0011Z\u0007\u000f\u000b\rH\u0003\r\u000e\u0001\u0016ZC\u001aO\f\rR]\u0001\u000f\n\fK\u0003>\u0000\u001d\u0003X_\u000f\u0011\u0007!P@\u001e\u000e\u0001\u0007QY";
      f1005[5] = "nNH5%\rrTJi?\u0019bW\u0001ɯ";
      f1005[6] = "\u000bE\u0017}g\\\u0017_\u0015!}H\u0007\\^0y@\u0001Y\u0004}tY\r\u0019\u0005:;^\rY\u0014<b\u0007\u0007X\u001e'pG\u0010\u0019':{M\u000b@3<{]\u0001Y\u0004";
      f1005[7] = double.class;
      f1006[7] = "java/lang/Double";
      f1005[8] = int.class;
      f1006[8] = "java/lang/Integer";
      f1005[9] = "NV\t\bUaEY\u0018G(yV^\u0011\u000e";
      f1005[10] = "\u000e:\u001b^!:\u0012 \u0019\u0002;.\u0002#R\u0013?&\u0004&\b^2?\bf\u000e\u0015=+\u0004:R\u0016<!\u0015f56<!\u0015\u001a\u0019\u001e7*\u0013-\u000e";
      f1005[11] = "V#P\u0018&<H+JWD O6";
      f1005[12] = "GV\tNk\u0004LY\u0018\u0001\n\nGR\u001c[";
      f1005[13] = "%Sk8|A'HqYн% \u001103,FfC::\u0016";
      f1005[14] = "$U\u001c/h0&N\u0006Nm9ds\u0011>~T&ILug9~\u0014\u00197\u0002";
      f1005[15] = "j*(R5\u00056=}\u0018\t\u0006>*\u0019\u000en\u0015\r7.\u0016\tSoj\u007fUt\u0010c'|i";
      f1005[16] = "\u0006\u001b~\u0001AV\u0000\u0019+\u0019!]=Li\u001eA\r\u0000\u001dt\u0019[7\u0006\u000es\u001d\u001b\nW\u0013t\u0007!";
      f1005[17] = "\u001b<mU)\"\u001d>8MI,M,\\H%?@P?X&|P\"xR*1 ";
      f1005[18] = "|gF4/\u0017;s\u0011$\u0016\u001a-r41p\t\u001ac\u001c:{\u000f-tzi&\u001eyoB+oDp\u000e";
      f1005[19] = "\u000f~hXy\u0003M72Q\u0018T]2M\u0006~Gp#b\u000exG0rr\u000e'KB5x\u0002j;";
      f1005[20] = "{\u0003BaU,}\u0001\u0017y55)\u0015A{IMzS\u0010!\t09_]\"";
      f1005[21] = "!\"\u000b685ckQ?Yvfv\u0001s\u0002qds\u0006`Y3x\"[j4k%w\u0019\u000fe|q-\u0010}\"v}``0?w!*\u001b7\"}f\u0012";
      f1005[22] = "0_AS4\u0012r\u0016\u001bZUFu\u0006U68Zso\u0014\fe\u0011j\u0002LQ0S\u000fS[\u0005jZ}\u0014Q\t'*3\u001eEU%Xt\u0014I\u0018U\u0017v\tC\u0013mKnU\u0015ji[`PZ\u0018.Ql\u001d*V.E0\u001fX\u0011.I}o\u0016\u001b:\u0015\u007f\u001dQ\u00116X\u000f";
      f1005[23] = "N-'ED\u007f\t9pU}mrxjHBm\u0000?`D\u000f";
      f1005[24] = "a\u001bGTVP&\u000f\u0010Do]0\u000e$W\t^:\r{\u000f\u0013YfN\u0017S\u0004\f,r";
      f1005[25] = "u!gP?\r250@\u0006\u001eIt*]9\u001f;3 Qt";
      f1005[26] = "\u0002:9\u001e?\u001e\u00048l\u0006_\u0014^20\u0018_B@0>\u001bg\u001eXlh";
      f1005[27] = "\u0003\u001b\tt\u000e-\u0004\u0006\u000336-]\u000f\u001eK\u000b/Z\u0014\nsW7\u0006Bs";
      f1005[28] = "$!0<\u007f\u000b\"#e$\u001f\u000e~+3\u001bg\u0003t,8/\u001fVn\"a0m\u0011d.,";
      f1005[29] = "6J'b\u0013\u001fuFja/\ra\nE?B\u001dS\u0017w\"Ob0\u0007ta_\u0010w\rx,/";
      f1005[30] = "~IB<\rHxK\u0017$mI(DC \u0011b,NL-m\u00154J\u00130\u001fR>F^";
   }
}
