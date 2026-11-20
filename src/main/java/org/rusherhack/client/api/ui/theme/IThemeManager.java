package org.rusherhack.client.api.ui.theme;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.client.gui.screen.Screen;
import org.rusherhack.Class066;
import org.rusherhack.client.api.ui.hud.HudHandlerBase;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;

public interface IThemeManager {
   long f923 = Class066.m4320(7032625486894415936L, 2820630655829623044L, MethodHandles.lookup().lookupClass()).m4325(183603412677830L);
   Object[] f924 = new Object[12];
   String[] f925 = new String[12];

   @Deprecated
   default ITheme getCurrentTheme() {
      return this.getClickGuiTheme();
   }

   default ITheme getClickGuiTheme() { return null; }
   default PanelHandlerBase<?> getClickGuiHandler() {
      return this.getClickGuiTheme().getClickGuiHandler();
   }

   default Screen getHudEditorScreen() { return null; }
   default Screen getClickGuiScreen() { return null; }
   default void registerTheme(ITheme var1) {}

   default WindowHandlerBase getWindowHandler() {
      return this.getWindowsTheme().getWindowHandler();
   }

   default ITheme getWindowsTheme() { return null; }
   default ITheme getHudTheme() { return null; }
   default HudHandlerBase getHudHandler() {
      return this.getHudTheme().getHudHandler();
   }

   default ITheme getDefaultTheme() { return null; }
   default Screen getWindowsScreen() { return null; }
   public static void m122() {
      f924[0] = "{X\u0006\u0004jygB\u0004XpmwAOIteqD\u0015\u0004y|}\u0004\u0014C6x|O\fO6E@B\u0004G}AuD\u0000M}~";
      f924[1] = "YC2\u0012@eEY0NZqUZ{_^yS_!\u0012S`_\u001f U\u001cd^T8Y\u001cYbY0QW";
      f924[2] = "wX\u0010C-6kB\u0012\u001f7\"{AY\u000e3*}D\u0003C>3q\u0004\u0002\u0004q4qD\u0013\u0002(mOC\u0019\t04PK\u0019\t3&jh\u0016\u001e:";
      f924[3] = "\u001f+Z5g\n\u00031Xi}\u001e\u00132\u0013xy\u0016\u00157I5t\u000f\u0019wHr;\u000f\u00117Xw;/\u00117Xw]\u001e\u001e=Q~g=\u0011*X";
      f924[4] = "T\u001c\n2\u0007yH\u0006\bn\u001dmX\u0005C\u007f\u0019e^\u0000\u00192\u0014|R@\u0018u[dN\nCT\u0000hs\u000f\u0003x\u0019iI,\fo\u0010";
      f924[5] = "9\u0018%\u0015)\u001f2\u00174ZH\u00119\u001c0\u0000";
      f924[6] = "8\u000f9}Fkv\u00017\u0017Vk;/-{yo!\u00034zC\u0006}\u001e+z\u0004a\"\f;h9";
      f924[7] = "\nJ~\u0001+qDDpk;q\tas\n?\u007f:Wv+=z\u0019Nz\u0011T&IWmQ.}KP&k";
      f924[8] = "\"-9q>\t1v\u0000n2\u0004\bvaj<7>s\\a2\u001d.\u0012\u007fa6\u0012<\u007f1o8x";
      f924[9] = ">Iy8\\k-\u0012@'Pf\u0000\u0017&$Ze$* %Xw_\t !We2G./=";
      f924[10] = "\u001bK)\t7)UE'c')\u0018t!\u0005$#\u001bk)\u0005$ \tQ@Z.4]Sz\u001e&(\u0019+";
      f924[11] = "<E\tkB%/\u001e0tN(\u001d\u0007\\GC98\u00170dC=7\u0005]*M3]";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
