package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Hunger;
public class HungerColor extends ColorSetting {
   public static Object[] f3864 = new Object[20];
   public static String[] f3865 = new String[20];

   @Override
   public Color getValue() {
      return RusherHackAPI.getHudManager().isGlobalColorSynced()
         ? ColorUtils.transparency(RusherHackAPI.getHudManager().getSecondaryColor(), this.getAlpha())
         : super.getValue();
   }

   @Override
   public boolean isThemeSync() {
      if (RusherHackAPI.getHudManager().isThemeColorSynced()) {
         boolean var10002 = true;
         return true;
      } else {
         return super.isThemeSync();
      }
   }

   public HungerColor(Hunger var1, String var2, Color var3) {
      super(var2, var3);
   }

   static {
      m157();
   }
   public static void m157() {
      f3864[0] = "kV#a6QwL!=,EgOj,(MaJ0a%Tm\n767PaIj\u0006\fQ`i%!%CaV";
      f3864[1] = boolean.class;
      f3865[1] = "java/lang/Boolean";
      f3864[2] = "\u0018%;\u001bT\"\u0004?9GN6\u0014<rȳ";
      f3864[3] = int.class;
      f3865[3] = "java/lang/Integer";
      f3864[4] = "Nc}U\"$Ry\u007f\t80Bz4\u0018<8D\u007fnU1!H?i\u001e$%H\u007f}U\u0013>M~h(5%Uxt\u001c";
      f3864[5] = "Wa1\u0001/^K{3]5J[xxL2Y]=#[4GK=\u0015@1DJF\"F1X";
      f3864[6] = "$I!w\u001549\\yUT9!Z";
      f3864[7] = "\u0002\u0004_\u0002\u000e\u0013\u001e\u001e]^\u0014\u0007\u000e\u001d\u0016O\u0010\u000f\b\u0018L\u0002\u001d\u0016\u0004XjY\u000f\u000e\b\u0004pM\u001f\r,&q";
      f3864[8] = "^\u000b$\u0015\u0005\u0006B\u0011&I\u001f\u0012R\u0012mƖ";
      f3864[9] = "=\u0013\u0003)h9!\t\u0001ur-1\nJɳ";
      f3864[10] = "\u0011\u000b\u0005\u0019G/\u001a\u0004\u0014V&!\u0011\u000f\u0010\f";
      f3864[11] = "]ku\t\u0010fUg3o\u001dcq~*\u0005\u0015|u})\b\u0006CO|&\u0002\u0010\u0018Bjs\f\u001cs\u000fsvo";
      f3864[12] = "]H\u0001\u0006Gj\tL^\f)հd\u0012\rVV{\bP\n\u0010F\u0010";
      f3864[13] = "\u001dP\u0006/-lYQ\u0005\"Mt \t\r:*gCHOo}\u001d\u001eM\u001d77~_\u000fH`M";
      f3864[14] = "f .@\u000fWbg6B}U0e\u0019\u001e\u0005Z4\u0019j\u0019CE6u(\u001e\u0005U]";
      f3864[15] = "\u00020Qa\r\u0016F1Rlm\bR+~w\t\u001aRW\u001c!V\u001aV%C}\u001d\u001f?";
      f3864[16] = "O\u0014%B~+G\u0018c$s.p\u0005pA\u007f\u001eK\u0001z^I.J\u000epH\u0012)\\[~DydE^\u001d";
      f3864[17] = "bP{=\u0018\u00068\u0004w!d\u0018$\u0002m:\u001c\r$\u0006m*\u0015dbT0<\r\u0016=\b{9d^=Ut*\b\u001c:\u0013dAX[e\u0016b3\u0007\u0007.\u0013\u000b";
      f3864[18] = "\u0007\u00157zN*\u0004\u001bga<tWVKdP^SLbvQa:Iz!ZwDAvg<";
      f3864[19] = "K\u0013kGo_C\u001f-!lLT9>JdGD\u000b)PHFL\u0005)!?\u001e\u0013\u001f:S`BX\u001aS";
   }
}
