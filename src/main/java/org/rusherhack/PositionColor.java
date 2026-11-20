package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Position;
public class PositionColor extends ColorSetting {
   public static Object[] f3132 = new Object[20];
   public static String[] f3133 = new String[20];

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

   public PositionColor(Position var1, String var2, Color var3) {
      super(var2, var3);
   }

   static {
      m157();
   }
   public static void m157() {
      f3132[0] = "6\"\u0018\u007fb.*8\u001a#x::;QĜ";
      f3132[1] = " ^y@~Y=K!b?T%M";
      f3132[2] = "\u001e\u001bEMM\u0010\u0002\u0001G\u0011W\u0004\u0012\u0002\f\u0000S\f\u0014\u0007VM^\u0015\u0018GQ\u001aL\u0011\u0014\u0004\f*w\u0010\u0015$C\r^\u0002\u0014\u001b";
      f3132[3] = boolean.class;
      f3133[3] = "java/lang/Boolean";
      f3132[4] = "a[U\u0013/S}AWO5GmB\u001cȻ";
      f3132[5] = int.class;
      f3133[5] = "java/lang/Integer";
      f3132[6] = "_)rD\n\bC3p\u0018\u0010\u001cS0;\t\u0014\u0014U5aD\u0019\rYuf\u000f\f\tY5rD;\u0012\\4g9\u001d\tD2{\r";
      f3132[7] = "yTsNJ\teNq\u0012P\u001duM:\u0003W\u000es\ba\u0014Q\u0010e\bW\u000fT\u0013ds`\tT\u000f";
      f3132[8] = "S 2\tO<O:0UU(_9{DQ Y<!\t\\9U|\u0007RN!Y \u001dF^\"}\u0002\u001c";
      f3132[9] = "\u0000jwc\u000fY\u001cpu?\u0015M\fs>ȹ";
      f3132[10] = "s\u001e\u000e{k\fx\u0011\u001f4\n\u0002s\u001a\u001bn";
      f3132[11] = "Cs\u00168 ;KwZ5^g\u0001YN14o\u001e]M29|!gL=3jz,Al;}\u0002{K;>\u0006";
      f3132[12] = "(2i>|M~5~%@Վ\u00132\u007f?xI*fhf9.";
      f3132[13] = "5\u001d8>\u001fXo\r`'zId\u001cM\"\u0002F``?<\u001f\u001enYk+F_\t";
      f3132[14] = "@\u0003l7{[\b\u001bi]iW\u0005?c9{WyX:#;C\u0001\u000bn-z:";
      f3132[15] = "2]/:[F:Yc7%\u001apds9@\u0016@_w3_ z^x9I{1S)1^\u0003fY~4%";
      f3132[16] = "\u0017\u001f~\u001d#<_\u0007{w7]\u0010\u0000`\u000e#%L\u0016{\u001b^cS\u0005a\n&?E\u001etw";
      f3132[17] = "b<\u0004$\n&6o\u0017dz&%j\u001d!\u00023%n\u001d1\u000bZf3\u0005g\u0003\"5g\u000b&za%fC=C52?\u0002ZCj!>\u0002\"\u0010>/\u007f{";
      f3132[18] = "w|\u001e\u000ei=!#\u001b\u000f\u000b3'c'\u000bg\u0019#y\u000e\u0019f&J&\u0002Je\"w.\u0006\u0006h\\";
      f3132[19] = "$\u0004n\u0018X\u007f,\u0000\"\u0015&-p\u001d\t\u001bM%{\r;\fW\tz\u00055\f&{-\u001fo\u000f^(y\u0011.v";
   }
}
