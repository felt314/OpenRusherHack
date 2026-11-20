package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.FeatureList;
public class FeatureListColor extends ColorSetting {
   public static Object[] f2349 = new Object[21];
   public static String[] f2350 = new String[21];

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

   public FeatureListColor(FeatureList var1, String var2, Color var3) {
      super(var2, var3);
   }

   static {
      m157();
   }
   public static void m157() {
      f2349[0] = "\u0007XY\u0000eK\u001bB[\\\u007f_\u000bA\u0010M{W\rDJ\u0000vN\u0001\u0004MWdJ\rG\u0010g_K\fg_@vY\rX";
      f2349[1] = boolean.class;
      f2350[1] = "java/lang/Boolean";
      f2349[2] = "\u0015\u0017}R6\u0007\t\r\u007f\u000e,\u0013\u0019\u000e4ɺ";
      f2349[3] = int.class;
      f2350[3] = "java/lang/Integer";
      f2349[4] = ",.isU\u001c04k/O\b 7 >K\u0000&2zsF\u0019*r}8S\u001d*2isd\u0006/3|\u000eB\u001d75`:";
      f2349[5] = "bJ2!xO~P0}b[nS{leHh\u0016 {cV~\u0016\u0016`fU\u007fm!ffI";
      f2349[6] = "lJU\u0006=\u001bq_\r$|\u0016iY";
      f2349[7] = "wD\u001a\u001bUVk^\u0018GOB{]SVKJ}X\t\u001bFSq\u0018/@TK}D5TDHYf4";
      f2349[8] = "\u007f20B\\,c(2\u001eF8s+y\u008a";
      f2349[9] = "ND\u0004\r1\"R^\u0006Q+6B]Mɗ";
      f2349[10] = "k\u0004|r:g`\u000bm=[ik\u0000ig";
      f2349[11] = "j\u0014p9Vd~\u00050PMoK\u001c-:EpO\u001f.7VOu\u001e!=@\u0014=@.5\\zk\u001e.9,";
      f2349[12] = "i\\Y<\u0006\\/O\u0002(}ՕP\u0017\u0007z\u0005\u000b=D\\.\u00165";
      f2349[13] = "\u0007\u000fP\u0018'{A\u001c\u000b\f\\ɋ>D\u000e^$,S\u0017U\n7\u0012";
      f2349[14] = "8\u001e}\u0015\\SyE|\u000bcRn\\S\u000e\u001b]j  \tZE=MsR\u000eV\u0003";
      f2349[15] = "!p4od!5at\u0006\u007f*\u0013|ccs\u001a(xi|E )wcj\u001ehwxkvp>)xg\u0006";
      f2349[16] = "g@Q~t.;\u0003F L}7Cwp(o7?\u0015c4,'ABhr~Z";
      f2349[17] = "fF\u0006k!F\"@\t`\u001eW'V\t!fB'R\t1o+aE\u0017dcU6NQ6\u001e\u0011>\u0006\u0017dsBeR\u0004Z\"Q%\u0001\u0012$uZcSo";
      f2349[18] = "Cf7I>d\u0005:%G]q\u0013'\b[1[\u0017=!I0d~5$\u001c4d\u000e!5\\]";
      f2349[19] = "PAT\u0013\u0007w\f\u0002CM?\"m\u0000E\u0012\u0002!PFQ\tRKSWJIUv\u0015CQ\u0019?";
      f2349[20] = "\u001f\u000fydK\u001b\u000b\u001e9\r^\u0006\r;9lT\u0002\u000b\u0012\bjU\f\u000bc\u007fwIU\f\u001d(|\u000f\u0007q";
   }
}
