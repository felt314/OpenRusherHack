package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import java.util.function.Consumer;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public class CheckBoxComponent extends WindowContent {
   public boolean f989;
   public Consumer<Boolean> f990;
   public double f991;
   public String f992;
   public static Object[] f994 = new Object[24];
   public static String[] f995 = new String[24];

   @Override
   public double getHeight() {
        return 0.0;
    }

   public void setValue(boolean var1) {
        
    }

   public boolean getValue() {
        return false;
    }

   public void setValueConsumer(Consumer<Boolean> var1) {
        
    }

   public CheckBoxComponent(Window var1, double var2, String var4, boolean var5) {
      this(var1, var2, var4, var5, null);
   }

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   public void setLabel(String var1) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   public CheckBoxComponent(Window var1, double var2, String var4, boolean var5, Consumer<Boolean> var6) {
    }

   public String getLabel() {
        return null;
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   public CheckBoxComponent(Window var1, String var2, boolean var3) {
      this(var1, 12.0, var2, var3, null);
   }

   public double getSize() {
        return 0.0;
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
   }

   static {
      m194();
   }
   public static void m194() {
      f994[0] = "Xvu\u0016o.SydY\u0003-]{f\u0016/";
      f994[1] = boolean.class;
      f995[1] = "java/lang/Boolean";
      f994[2] = "`\u001c9w\u00041|\u0006;+\u001e%l\u0005p:\u001a-j\u0000*w\u00174f@+0X3f\u0000:6\u0001jl\u00010-\u0013*{@=6\u001b4`\u0000;7\u0002j[\u000b&-5+b\u001e17\u0013*{";
      f994[3] = "\u00109\u0011/b\u00039\u0000\r5`_#\u0014\u001d6+N$\u0007\u001bsvH?\u0001\u00173b\u0003\u0018\u0010\n)lC,N";
      f994[4] = "\u0011hb1VZ\rr`mLN\u001dq+|HF\u001btq1E_\u00174pv\nX\u0017tapS\u0001\u001dukkAA\n4fpI_\u0011t`qP\u0001=r`|Om\u0011bFpI_\u0011t`qP";
      f994[5] = "em\u0007}\\\u001d{e\u001d2\u0014\u001dao\u0005u\u001d\u0006!O\u001er\u0001\u001dbi\u0003";
      f994[6] = "\u0011E0|@t\r_2 Z`\u001d\\y1^h\u001bY#|Sq\u0017\u0019\";\u001cv\u0017Y3=E/\u001dX9&Wo\n\u0019\u0000;\\e\u0011@\u0014=\\u\u001bY#";
      f994[7] = double.class;
      f995[7] = "java/lang/Double";
      f994[8] = "]u,\u0012\u0007\u001cAo.N\u001d\bQleɈ";
      f994[9] = "\f{oyHJ\u0007t~6)D\f\u007fzl";
      f994[10] = void.class;
      f995[10] = "java/lang/Void";
      f994[11] = "fS\u0015!\u0007[zI\u0017}\u001dOjJ\\l\u0019GlO\u0006!\u0014^`\u000f\u0000j\u001bJlS\\i\u001a@}\u000f;I\u001a@}s\u0017a\u0011K{D\u0000";
      f994[12] = "\tJ/)\u001e\u0001\u0002E>fc\u0019\u0011B7/";
      f994[13] = ">,fvC:buxt1ˆ\u0005.3/R=z#b\"_";
      f994[14] = "\"\nJ BG~ST\"0O\u0019\bWaWMgD^tS&$LRz[XhEG~0";
      f994[15] = "+'@<A\u0015<qEP\u0005\u0006#6I\u0017\u0015o=,El\u0014\u0012:'\u0014P\u0017\u0003#'\u001e*\u0000U&K";
      f994[16] = "\u001bl{Z\u0002rPo \u0017xи\"+!K\u0016pNctB\u0014\u0013";
      f994[17] = "V\u000f_\u0011PC\nVA\u0013\"ƃm\f\u0002L\u001eN\u0016M\\\u0017F";
      f994[18] = "\u001a\u0000\u001fVp\u001aFY\u0001T\u0002հ!E\u001c\n>\u0014\\B\u0017[";
      f994[19] = "\u0000\u0007\u0001\u0019d|UL\u0001\u001e\u000b(R\u0000(\u0004q&Y\u0013,\u0019g;_|C\u00176{Z\u001b\u001a\u0019k'?AB\u001ch!@L\u0013\u0011eG";
      f994[20] = "f\u000e\u000fl\u001dx'PT4qj1\\\u0002(\r\u0003dJ\u0005oAh3N\u00052q<6K\n<Lm \u000b\nP";
      f994[21] = "Tgme:e\u0016fs#\u0001u\u0005wL=gf2fd6l`\u0005q\u0002ezh\td901h\u000e\u000b";
      f994[22] = "ENGVA{\u0019\u0017YT3ǽ~ALV\u000f\u007f\u0019\u0018B\u000bS";
      f994[23] = "ic\u0013lA\r+b\r*z\u0013.O\u001b-\u0017\b8c|nK\u00166i\u0003c\u001a\u001b;\u000fAb\u001e\u00113pL3\u0013\u001cUu\u001b2F\u001d(r\u0010cz";
   }
}
