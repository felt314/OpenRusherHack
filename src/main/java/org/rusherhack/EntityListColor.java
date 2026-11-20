package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.EntityList;
public class EntityListColor extends ColorSetting {
   public static Object[] f4950 = new Object[20];
   public static String[] f4951 = new String[20];

   public EntityListColor(EntityList var1, String var2, Color var3) {
      super(var2, var3);
   }

   @Override
   public Color getValue() {
      return RusherHackAPI.getHudManager().isGlobalColorSynced()
         ? ColorUtils.transparency(RusherHackAPI.getHudManager().getPrimaryColor(), this.getAlpha())
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
      f4950[0] = "|\u0000)X|w`\u001a+\u0004fcp\u0019`Ⱥ";
      f4950[1] = "4)$J)[)<|hhV1:";
      f4950[2] = "K_uJA@WEw\u0016[TGF<\u0007_\\ACfJREM\u0003a\u001d@AA@<-{@@`s\nRRA_";
      f4950[3] = boolean.class;
      f4951[3] = "java/lang/Boolean";
      f4950[4] = "WD\n5\u007f)K^\bie=[]Cɯ";
      f4950[5] = "p~\u0014i5Sld\u00165/G|g]Ɂ";
      f4950[6] = int.class;
      f4951[6] = "java/lang/Integer";
      f4950[7] = "q\nt%0\\m\u0010vy*H}\u0013=h.@{\u0016g%#YwV`n6]w\u0016t%\u0001Fr\u0017aX']j\u0011}l";
      f4950[8] = "P\u0002\u0000y\nYL\u0018\u0002%\u0010M\\\u001bI4\u0017^Z^\u0012#\u0011@L^$8\u0014CM%\u0013>\u0014_";
      f4950[9] = "t\\vYbihFt\u0005x}xE?\u0014|u~@eYqlr\u0000C\u0002ct~\\Y\u0016swZ~X";
      f4950[10] = "a\u00015!G\u0006j\u000e$n&\ba\u0005 4";
      f4950[11] = "hC37\u001c\u0007i\u001fw!w\n*i.4\u001d\u00025m-7\u0010\u0011\nW,8\u001a\u0007Q\u001c34I\u0015!]*\"\u000fk";
      f4950[12] = "k ;F.-ql6>xI;g!\u000fc%` ;_\u0011r;!mL})|;=>";
      f4950[13] = "_\u0005@\r\u000bREIMu[[H'N\u0011I[4\u0004\\EJLDHNN4";
      f4950[14] = "y!f|\u0012+5'?biȍE $b\u0017:>b q\u0014T";
      f4950[15] = "#7.\u0011{/}8{C\u0016)s \fEn&w\\y]y8p';Yj;\u001e";
      f4950[16] = "u\u0000rm\"\u001ct\\6{I\u001179kd,\u001d\u0007\u0002on3+=\u0003`d%pv\u001cl77\u00007\u0005zqI";
      f4950[17] = "Kl.kd7Hm2p\u0002-\f{%bz8\f\u007f%rsQ\u000bisgx!G{x\u0019>-\u0019l-b|)\noCdya\bh3(kjv";
      f4950[18] = "O\u0004u.+j\u0011\f0+Iw\u001cI\u000ek%]\u0018S'y$bq\f+o-s\u001d\rw+;\u0018";
      f4950[19] = "\u0019b]\u0000Z'\u0018>\u0019\u00161$M{|\u001eP.I}U/V/G}$\u0019J{^}TUXp ";
   }
}
