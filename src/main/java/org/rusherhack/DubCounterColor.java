package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.DubCounter;
public class DubCounterColor extends ColorSetting {
   public static Object[] f2770 = new Object[21];
   public static String[] f2771 = new String[21];

   public DubCounterColor(DubCounter var1, String var2, Color var3) {
      super(var2, var3);
   }

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

   static {
      m157();
   }
   public static void m157() {
      f2770[0] = "$,O%q586Myk!(5\u0006ho).0\\%b0\"p[rp4.3\u0006BK5/\u0013Ieb'.,";
      f2770[1] = boolean.class;
      f2771[1] = "java/lang/Boolean";
      f2770[2] = "Y\u0016l\\Z=E\fn\u0000@)U\u000f%ɴ";
      f2770[3] = int.class;
      f2771[3] = "java/lang/Integer";
      f2770[4] = "WxZ4?\u0004KbXh%\u0010[a\u0013y!\u0018]dI4,\u0001Q$N\u007f9\u0005QdZ4\u000e\u001eTeOI(\u0005LcS}";
      f2770[5] = "K\u0004\tjbpW\u001e\u000b6xdG\u001d@'\u007fwAX\u001b0yiWX-+|jV#\u001a-|v";
      f2770[6] = "\u0015V\u0015M;k\bCMozf\u0010E";
      f2770[7] = "B%UaP\u0017^?W=J\u0003N<\u001c,N\u000bH9FaC\u0012Dy`:Q\nH%z.A\tl\u0007{";
      f2770[8] = "\u0013?V(;h\u000f%Tt!|\u001f&\u001fģ";
      f2770[9] = "\u0010dJ\u0004wG\f~HXmS\u001c}\u0003ɞ";
      f2770[10] = "S\u001a\u000f\u001f .X\u0015\u001ePA S\u001e\u001a\n";
      f2770[11] = "$\u0013\u0013-u\u0015v\u0005AJx_Z\u001a\u0017 p@^\u0019\u0014-c\u007fd\u0018\u001b'u$,\u0014\u001a(eC.\u001f\u000f1\u0019";
      f2770[12] = "uq,X[\f4z7]6ԆL13[P\u001e2z{\b\u0007f";
      f2770[13] = "j\u0015\u00008\u0015})W\u0015\"dq=\u0012&#\u001c~9nU?\u000bx(\u0010\u001ewX/P";
      f2770[14] = "MinML\u001f\fbuH!Ȭt)qNG\r\nb9\u001d\u0010u";
      f2770[15] = "\r^!Si#_Hs4di`S/QhY[W%N^cZX/X\u0005+VY Hb)]L94";
      f2770[16] = "[@\u0005My^\u0001@\u0001\u0010\u0005\b\u000bA%\u001da\u001a\u000b=G\u0016~\u0001\u0019M\u0018\u0016;\rf";
      f2770[17] = "bN*h\u0011Z D:etV#D.p\fC#@.`\u0005*eO3m\u000bZ:Ovat\u0010!B.s\n[i\u0011y\u000bHH\"K7{\u0017HgGH";
      f2770[18] = "\f6-\rzO]$/N\u0010\u001f]4\r\n|5Y.$\u0018}\n0y \u0014w\u001c\u0001+6F\u0010";
      f2770[19] = "\u0007N8\b\u0017OUXjo\u0014\u0013Jx6\u0004\u001c\u0018ZJ!\u001e0\u0019RD!oG\u001cME$\u001f\u0018\u001c\bI[";
      f2770[20] = "T\\\u0000vk0\u000e\\\u0004+\u0017`i\u001f\u0002~,i\u0005\u0019\u001eu,\tW]OtweQADt\u0017";
   }
}
