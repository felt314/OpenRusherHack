package org.rusherhack.client.api.ui.window.content;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.List;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.IScrollable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.setting.Setting;

public abstract class WindowContent implements IClickable, ITypeable, IScrollable, ITickable {
   public Window f973;
   public List<ContextAction> contextMenu;
   public double f974;
   public double f975;
   public static boolean f976;
   public static Object[] f978 = new Object[25];
   public static String[] f979 = new String[25];

   public void unfocus() {
   }

   public List<ContextAction> getContextMenu() {
      return this.contextMenu;
   }

   public abstract double getHeight();

   public double getX() {
        return 0.0;
    }

   public double setY(double var1) {
        return 0.0;
    }

   public abstract void renderContent(double var1, double var3, WindowView var5);

   public IFontRenderer getFontRenderer() {
        return null;
    }

   public abstract double getWidth();

   public double getY() {
        return 0.0;
    }

   public void setContextMenu(List<ContextAction> var1) {
      this.contextMenu = var1;
   }

   public Window getWindow() {
        return null;
    }

   public double setX(double var1) {
        return 0.0;
    }

   public IRenderer2D getRenderer() {
        return null;
    }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   public WindowContent(Window var1) {
    }

   public static void m2299(boolean var0) {
      f976 = var0;
   }

   public static boolean m2300() {
      return f976;
   }

   public static boolean m2301() {
      boolean var0 = m2300();
      return !var0;
   }

   static {
    }
   public static void m122() {
      f978[0] = "z.\u0000\u0013Uif4\u0002OO}v7I^Kup2\u0013\u0013Fl|r\u0012T\tk|2\u0003RP2v3\tIBrar0TIxz+$RIhp2\u0013";
      f978[1] = double.class;
      f979[1] = "java/lang/Double";
      f978[2] = "Fm\u000b3O\u0015Zw\toU\u0001JtB~Q\tLq\u00183\\\u0010@1\nx\\\u0014\\m\t3J\tG{\u0003j\u00137@q\brJ";
      f978[3] = "\r\u00018*u_\u0011\u001b:voK\u0001\u0018qgkC\u0007\u001d+*fZ\u000b]-aiN\u0007\u0001qbhD\u0016]\u0016BhD\u0016!:jcO\u0010\u0016-";
      f978[4] = "b2T3FE~(Vo\\Qn+\u001dɩ";
      f978[5] = boolean.class;
      f979[5] = "java/lang/Boolean";
      f978[6] = void.class;
      f979[6] = "java/lang/Void";
      f978[7] = "2\u001bMSP\f.\u0001O\u000fJ\u0018>\u0002\u0004\u001eM\u000b8GY\u0018V\r4\u0007MSq\u001c)\u001dC\u0013E";
      f978[8] = ">\u001daJpRK=jEa\u001d6%yBhT^";
      f978[9] = "\":fT)e<2|\u001bKy;/";
      f978[10] = "QtjX=NMnh\u0004'Z]m#\u0015#R[hyX.KW(\u007f\u0013!_[t#?\u001d^Pbh\u0004*I\fB";
      f978[11] = ")\u0015;?'S\"\u001a*pF])\u0011.*";
      f978[12] = "v04\u0004,1t?)eȚQwx'\u0004~-w1:\u000f";
      f978[13] = "vA\u0006,\u0010!tN\u001bM\u0010,1p\t,\u0010!10\u001c5D8uL\u001dq\u0013A";
      f978[14] = "\u0018F.\"\u0018[\u001aI3C\u05fa;\u0018L}\"HDF\u000bp$w\u0007N\u0006t-\nJ\u001a\r#C";
      f978[15] = "V@1^pgTO,?q\u0007V[8Pmf\u000bLb\u0002\u001f<\u0007Z<M~a\u0010\u0000n?";
      f978[16] = " \u001cH\u0001gy UU\nZjwYw\u0007<y@H_\f7\u007fw_9Z1fw\\C]4yh%";
      f978[17] = "1\u0014\u0013\n\u001b-b\u001aJWeԩ\f\u0019\u0001\u001fUs7X\u000f\u001b\u0007H";
      f978[18] = "m}#N\u0002dor>/\u0002i*S C\u0011dVt9\u0014\u0014<*u}Cm";
      f978[19] = "\b\u001d\f_:W\bT\u0011T\u0007JId\u001a@jQ_H}F\u007f\u0010K\u001c\u0001G;G2\\\u0005\u0005~\u0013N]AR\u0007\u0010I\u0015\u001c\u0001xN\u000e\u0018\u001a>";
      f978[20] = "!b=Pt\r#m 1kmbkdH#\u0011c/3";
      f978[21] = "6b}af46+`j['a'Vm=$a!az[wg?u90(bke\u0000";
      f978[22] = "\u0004\u0006dsG>\u0006\ty\u0012C9Y\u000bkbT\u001bR\u0011{\u0012\u0016#\u0000\u0015yn\u0017;ZH";
      f978[23] = "C\n.]'-A\u00053<9M\u0000\u0003wEp1\u0001G ";
      f978[24] = "U8r\u0003n1W7obÏQU2!\u0003>.\u000bu,\u0005\u0001";
   }

   public WindowContent() {}
}
