package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Keystrokes;
public class KeystrokesColor extends ColorSetting {
   public static Object[] f5237 = new Object[20];
   public static String[] f5238 = new String[20];

   public KeystrokesColor(Keystrokes var1, String var2, Color var3) {
      super(var2, var3);
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

   @Override
   public Color getValue() {
      return RusherHackAPI.getHudManager().isGlobalColorSynced()
         ? ColorUtils.transparency(RusherHackAPI.getHudManager().getPrimaryColor(), this.getAlpha())
         : super.getValue();
   }

   static {
      m157();
   }
   public static void m157() {
      f5237[0] = "\n~m#)[\u0016do\u007f3O\u0006g$ȋ";
      f5237[1] = int.class;
      f5238[1] = "java/lang/Integer";
      f5237[2] = "iUYk\u00194uO[7\u0003 eL\u0010&\u0007(cIJk\n1o\tl0\u0018)cUv$\b*Gww";
      f5237[3] = "\u0005\u0015_E,X\u0019\u000f]\u00196L\t\f\u0016\b2D\u000f\tLE?]\u0003IK\u0012-Y\u000f\n\u0016\"\u0016X\u000e*Y\u0005?J\u000f\u0015";
      f5237[4] = "&\u000e\t/TV:\u0014\u000bsNB*\u0017@ɻ";
      f5237[5] = "DO\u001d=['XU\u001faA3HVTɧ";
      f5237[6] = boolean.class;
      f5238[6] = "java/lang/Boolean";
      f5237[7] = "~rhn^Hcg0L\u001fE{a";
      f5237[8] = "V-~t\u0004aJ7|(\u001euZ479\u001a}\\1mt\u0017dPqj?\u0002`P1~t5{U0k\t\u0013`M6w=";
      f5237[9] = "E}\u001aG\u0006qYg\u0018\u001b\u001ceIdS\n\u001bvO!\b\u001d\u001dhY!>\u0006\u0018kXZ\t\u0000\u0018w";
      f5237[10] = "\u001a\u0017+ sc\u0011\u0018:o\u0012m\u001a\u0013>5";
      f5237[11] = "\u0015R\u001fz*O\u0016\u0007\u0001<JA.X\r;#ZN\u0002\u0012>;(\u0015\u0000\u0014(8HO\u001f\u00110J";
      f5237[12] = "A_>5acFN{;\u001cs\u0000~#9v{\u001fz :{h @!5q~{\r?bgb\u0004_x=b\u0012";
      f5237[13] = "\u0010\u0007LJ!G\u0013RR\fAOFJc\u0018%]F6\u0000\u00188_WYL\u0000yQ+";
      f5237[14] = "NIP+QE\u0017]PT\u0557\u007f\u0011[]e\r@\u0013TV37";
      f5237[15] = "\u001f\u0005\u0005\u0014.=HNG^JmLBr\u00012bH>\u0002\u000f83\u001b\u0001\u0000\u00003e!";
      f5237[16] = "\"[7HoO%JrF\u0012_ci.NwSSR*DheiS%N~>$MrXbAv\n-]\u0012";
      f5237[17] = "i\u001e\\$[>i\u0007[5dz-\u0010A.\u001co-\u0014A>\u0015\u0006j\u0010^*\u0018i&\b\u001f$d?=\u000b\u0016o[=2\u0000@UYo.\u0006[:\u0015wo\b'";
      f5237[18] = ">\u0012Ry\u0014Cy\bC`z\u0015j\u0017so\u0016?n\rZ}\u0017\u0000\u0007Q]k\u0011\u0007vVL.\u001fz";
      f5237[19] = "b:S?;\u0013e+\u00161F\r5(r.'\u00071.[\u001f!\u0006?.*i/\u001b'(E%7Z)T";
   }
}
