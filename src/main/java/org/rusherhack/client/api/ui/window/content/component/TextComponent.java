package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public class TextComponent extends WindowContent {
   public String text;
   public static Setting[] f1007;
   public static Object[] f1009 = new Object[20];
   public static String[] f1010 = new String[20];

   public String getText() {
      return this.text;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   public TextComponent(Window var1) {
      super(var1);
      this.text = "";
   }

   @Override
   public double getHeight() {
      return this.getFontRenderer().getFontHeight();
   }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   public TextComponent(Window var1, String var2, boolean var3) {
      super(var1);
      this.text = "";
      this.text = var2;
   }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
    }

   public TextComponent(Window var1, String var2) {
      this(var1, var2, false);
   }

   public void setText(String var1) {
      this.text = var1;
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   @Override
   public double getWidth() {
      return this.getFontRenderer().getStringWidth(this.getText());
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      return false;
   }

   public static void m2367(Setting[] var0) {
      f1007 = var0;
   }

   public static Setting[] m2368() {
      return f1007;
   }

   static {
    }
   public static void m194() {
      f1009[0] = "lSE8N+pIGdT?`J\fuP7fOV8].j\u000fW\u007f\u0012)jOFyKp`NLbY0w\u000fAyQ.lOGxHpWDZb\u007f1nQMxY0w";
      f1009[1] = "bh\u0000\u00034\u001big\u0011LI\u0003z`\u0018\u0005";
      f1009[2] = "\n|\u001a\u0018`\u000e#E\u0006\u0002bR9Q\u0016\u0001)C>B\u0010DtE%D\u001c\u0004`\u000e\u0002U\u0001\u001enN6\u000b";
      f1009[3] = "4o)\u0003PT\u001dV5\u0019R\b\u0007B%\u001a\u0019\u0019\u0000Q#_D\u001f\u001bW/\u001fPT<F2\u0005^\u0014\b\u0018";
      f1009[4] = void.class;
      f1010[4] = "java/lang/Void";
      f1009[5] = "}t'A\b/an%\u001d\u0012;qmn\f\u00163wh4A\u001b*{(5\u0006T-{h$\u0000\rtqi.\u001b\u001f4f(\u0017\u0006\u0014>}q\u0003\u0000\u0014.wh4";
      f1009[6] = "Qb\u0003\u0005olMx\u0001Yux]{JHqp[~\u0010\u0005|iW>\u0016Ns}[bJMrwJ>-mrwJB\u0001Ey|Lu\u0016";
      f1009[7] = double.class;
      f1010[7] = "java/lang/Double";
      f1009[8] = int.class;
      f1010[8] = "java/lang/Integer";
      f1009[9] = "E\u0005>}tnN\n/2\u0015`E\u0001+h";
      f1009[10] = "F\u001c.\u0005oU\u001aBvdծnM\u0018#\u0016w^\r\u001d-\u0018\u000bUI\u001es^gQ\u000fDxd";
      f1009[11] = "\u001fH7\u0017\u007fQC\u0016ovаj\u0014L:\u0004gZTI4\n\u001b";
      f1009[12] = "ZTM\t46\u0006\n\u0015h?`\u0017lG\u0018,\rRZ\u0012S=\u007f\u0019[\u0012RP";
      f1009[13] = "%[xe\u0018\u0003i\f,{u\u0002c_bF\t\u0014xPr\u001dL\u0004!\rpo\u0007\u0005!\f\u001d I\u0014vGr-\u000e\u0003v6 !\u000f\u0001hY-f\u0018\u0001\u0019\u000b{\"\u0011Pz\u000fst\u0013n$\ngr\u0004\u0001)Mpru";
      f1009[14] = "v;M\u001f@\u007f-y^V\"vMt\u0000\u001cMv\"yG\u000bM";
      f1009[15] = "+V\u0001\u00108Pg\u0001U\u000eURzG?\u0014/\\qT;\t9Aw;]\u0002m\u0006zI\u0016\u0003m\u0007\u0017\u0006X\u0012:Lx\u000b\u001f\u0005:=";
      f1009[16] = "\u0006\"D\r}P]`WD\u001fGP,{\u0013yTg=S\u0018rRP*5HrME=X\u0004%\u0019[P";
      f1009[17] = "E\u0003`;z>\tT4%\u0017<\u0014\u0012K$q/9\u0003d,w/yS99x\"\u0016^~.xS";
      f1009[18] = "P\\ycod\f\u0002!\u0002w2\u0011D\u001e;agZUlp`g[";
      f1009[19] = "&\tu-y\"}Kfd\u001b*\u001dF8.t+rK\u007f9t";
   }
}
