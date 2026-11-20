package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.PotionEffects;
public class PotionEffectsColor extends ColorSetting {
   public static Object[] f8101 = new Object[20];
   public static String[] f8102 = new String[20];

   @Override
   public Color getValue() {
      return RusherHackAPI.getHudManager().isGlobalColorSynced()
         ? ColorUtils.transparency(RusherHackAPI.getHudManager().getPrimaryColor(), this.getAlpha())
         : super.getValue();
   }

   public PotionEffectsColor(PotionEffects var1, String var2, Color var3) {
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

   static {
      m157();
   }
   public static void m157() {
      f8101[0] = "^/X\u0002\u0010\u0000B5Z^\n\u0014R6\u0011ҵ";
      f8101[1] = "1kc'g\u0006,~;\u0005&\u000b4x";
      f8101[2] = "Bs\u0004\u001bpo^i\u0006Gj{NjMȳ";
      f8101[3] = int.class;
      f8102[3] = "java/lang/Integer";
      f8101[4] = "\u000b4Vp\u0013\u001c\u0017.T,\t\b\u0007-\u001f=\r\u0000\u0001(Ep\u0000\u0019\rhc+\u0012\u0001\u00014y?\u0002\u0002%\u0016x";
      f8101[5] = "q[h\u0000\u001a1mAj\\\u0000%}B!M\u0004-{G{\u0000\t4w\u0007|W\u001b0{D!g 1zdn@\t#{[";
      f8101[6] = "\bL\u0016Co\u0018\u0014V\u0014\u001fu\f\u0004U_ș";
      f8101[7] = boolean.class;
      f8102[7] = "java/lang/Boolean";
      f8101[8] = "8JP\u0015Ge$PRI]q4S\u0019XYy2VC\u0015T`>\u0016D^Ad>VP\u0015v\u007f;WEhPd#QY\\";
      f8101[9] = "psd%\u0013Klify\t_|j-h\u000eLz/v\u007f\bRl/@d\rQmTwb\rM";
      f8101[10] = "8\u001d42s[3\u0012%}\u0012U8\u0019!'";
      f8101[11] = "H=)uUm\u0005vy\u007f<t\u000fHqvV|\u0010Lru[o/vszQyt:(tXmJ;*q\r\u0015";
      f8101[12] = "9\u00009R%l`\u0001=\u0000HԷ\u0000_'Fpm1Y%\u0000xW";
      f8101[13] = "p|\u0019Q\"q.>K\u0016\u001fo#;3Kg`'G@Wa8tvFU'0N";
      f8101[14] = "\bj`bS\u0000\\j!\u0000\u000beP.%aS\u000f]mf:bY\u0010oy1\bTS,\"\u0000";
      f8101[15] = "KeK\u000f=G\u0006.\u001b\u0005T^\f\u0003\u0017\u00061R<8\u0013\f.d\u00069\u001c\u00068?Jb\u0012\u000f,\u0001K`\u0017ZT";
      f8101[16] = ">\u0003\u0004rRYn\u001cKd+^z\u0012]xSKz\u0016]hZ\"r\u0000@jY\\f\u001dA\u0003\u0011Z~C\u00012\u0017X8K;qPYi\tEeMX\u0000";
      f8101[17] = "o>`\u0014I\u0017l'9\u00007E8>B\u0014[o<$k\u0006ZPU~8USC-3s\u0005Y*";
      f8101[18] = "=@t!\u000e(i@5CP %&e'B Y\nw8V?'\u001ej9?";
      f8101[19] = "a\u0018\t34x,SY9]o0^m-<e4XD\u001c:d:X5%&{4PK1;z]";
   }
}
