package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import java.util.Arrays;
import java.util.function.Consumer;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

public class ComboBoxComponent extends WindowContent {
   public String[] f996;
   public boolean f997;
   public double f998;
   public Consumer<String> f999;
   public int f1000;
   public static Object[] f1002 = new Object[29];
   public static String[] f1003 = new String[29];

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   public String getSelectedOption() {
        return null;
    }

   @Override
   public void unfocus() {
      this.setOpen(false);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      return false;
   }

   public ComboBoxComponent(Window var1, Enum<?> var2) {
      this(var1, (String[])Arrays.stream((Enum[])var2.getClass().getEnumConstants()).map(Enum::name).toArray(), var2.ordinal(), null);
   }

   public boolean isOpen() {
        return false;
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public ComboBoxComponent(Window var1, String[] var2) {
      this(var1, var2, 0, null);
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      return false;
   }

   public ComboBoxComponent(Window var1, String[] var2, int var3, Consumer<String> var4) {
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public String[] getOptions() {
        return null;
    }

   public void setSelected(int var1) {
        
    }

   @Override
   public boolean charTyped(char var1) {
      return false;
   }

   public int getSelected() {
        return 0;
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
   }

   public void setOpen(boolean var1) {
        
    }

   public void setCallback(Consumer<String> var1) {
        
    }

   public void setHeight(double var1) {
        
    }

   public Consumer<String> getCallback() {
        return null;
    }

   static {
      m194();
   }
   public static void m194() {
      f1002[0] = "m\u0016\bC\u001dxq\f\n\u001f\u0007la\u000fA\u000e\u0003dg\n\u001bC\u000e}kJ\u001a\u0004Azk\n\u000b\u0002\u0018#a\u000b\u0001\u0019\ncvJ\f\u0002\u0002}m\n\n\u0003\u001b#A\u000b\u0002\u000f\u0000Om\u001c,\u0002\u0002}m\n\n\u0003\u001b";
      f1002[1] = boolean.class;
      f1003[1] = "java/lang/Boolean";
      f1002[2] = void.class;
      f1003[2] = "java/lang/Void";
      f1002[3] = "2Z\u0007}nC,R\u001d2&C6X\u0005u/Xvx\u001er3C5^\u0003";
      f1002[4] = int.class;
      f1003[4] = "java/lang/Integer";
      f1002[5] = double.class;
      f1003[5] = "java/lang/Double";
      f1002[6] = "`\u000fx=t/|\u0015zan;l\u00161pj3j\u0013k=g*fSjz(-f\u0013{|qtl\u0012qgc4{S||k*`\u0013z}rt[\u0018ggE5b\rp}c4{";
      f1002[7] = "\tm1qF( T-kDt:@=h\u000fe=S;-Rc&U7mF(\u0001D*wHh5\u001a";
      f1002[8] = "\u0006C8xf\u0014\u001aY:$|\u0000\nZq5x\b\f_+xu\u0011\u0000\u001f*?:\u0016\u0000_;9cO\n^1\"q\u000f\u001d\u001f\b?z\u0005\u0006F\u001c9z\u0015\f_+";
      f1002[9] = "k\u0013\u001f\u000e\u0016lw\t\u001dR\fxg\nVC\bpa\u000f\f\u000e\u0005imO\nE\n}a\u0013VF\u000bwpO1f\u000bwp3\u001dN\u0000|v\u0004\n";
      f1002[10] = "\u001cX\u001d~\u0013\u000bix\u0016q\u0002D\u0014`\u0005v\u000b\r|";
      f1002[11] = "h&F4\u001f;c)W{b#p.^2";
      f1002[12] = "i%\u0019:MMu?\u001bfWYe<Pɠ";
      f1002[13] = "z\u000f\u0003\u007fz8q\u0000\u00120\u001b6z\u000b\u0016j";
      f1002[14] = "|;wy+\u0016`!u%1\u0002p\">46\u0011vge#0\u000f`g]6-\u000bF=y;*";
      f1002[15] = "bu@6\u0018\u000e<p\u001c`wш^\"Ku\u0013\u001a7mJjJc";
      f1002[16] = "rY\u000f,F&7^YB\u0010\"5wW&\u001b% W]BE$ ]L|C59]>";
      f1002[17] = "m!J\u0002?=(&\u001clŹTm}\u0018\u0013ko<4\n\u0017";
      f1002[18] = "UtWo\u001bg\u0004}Jdku\u0005z{d\rf2kSo\u0006`\u0005|5=\u0004~\u0001?YlTc\f\u0006";
      f1002[19] = "\rGv\u0003\u0011~H@ mā\u0017\n\u0019#UMf\u000eY{\u000f";
      f1002[20] = "\f<]\\\u0014X\u0004 \n\u0005kZ\u00019T\u001ck\n\\3N\tP[\u0015!JdP\b\u0006/\\_\u0001A\u0014+1_RR\u001a=\n\u000e\u001b@\u001eP\n]\bN\bk[\u0014\u001aJe";
      f1002[21] = "\u0018N\u0018_\u000b\u0012]IN1Հ{\u001cA\u0013AM\tX@\u0010O";
      f1002[22] = "f\u0003\u007f)8B#\u0004)GnF!=##l@!\u000b\"\u0000yW<\u0001(G1\u0011;\t#yj[9VN";
      f1002[23] = "R=R+\u001b~\u0017:\u0004EYz\u0015\u001f\u001b(D\u0017Pc\u0005:Fj\u00156\u0001.\".\u0014e\u0001=\\~\rc\rE";
      f1002[24] = "ML\u0007rxr\u001c\u001c\u001a\u007fAq\u001e_8g;\u007f\u0015L<z-b\u0013#S!'q\u001e\u001d\bk%.s\u001fX\u007fy{\u0002\u001b\u0018'#\u001e";
      f1002[25] = "$\u0004G|\u0010$\"\u0015^|bsu\u0004Ce\u001e\u001a/_O$Y.a\u001fHfb#cRLe\u001cszT@\u001d";
      f1002[26] = "G\t\u0013Ee;\u0002\u000eE+ΧRF\u0007KJ.l@\u0016RJ";
      f1002[27] = "4\u0004@8D(q\u0003\u0016V\u0014A?\u000b\u00150\u0013&5\u0001A1}qe\u0005\u00178\u001a{oQ\u0016V";
      f1002[28] = "/I:pm\u0007jNl\u001eѠn-\u0017ma0\u0013hBiu";
   }
}
