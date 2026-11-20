package org.rusherhack;

import java.awt.Color;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class DirectionColor extends ColorSetting {
   public static Object[] f1784 = new Object[21];
   public static String[] f1785 = new String[21];

   public DirectionColor(Direction var1, String var2, Color var3) {
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
      f1784[0] = "08ph*\u0004,\"r40\u0010<!9ɀ";
      f1784[1] = int.class;
      f1785[1] = "java/lang/Integer";
      f1784[2] = "\u000bR|\u0012L5\u0017H~NV!\u0007K5_R)\u0001No\u0012_0\r\u000eIIM(\u0001RS]]+%pR";
      f1784[3] = "T`\u0002Fu\u001cHz\u0000\u001ao\bXyK\u000bk\u0000^|\u0011Ff\u0019R<\u0016\u0011t\u001d^\u007fK!O\u001c__\u0004\u0006f\u000e^`";
      f1784[4] = boolean.class;
      f1785[4] = "java/lang/Boolean";
      f1784[5] = "\u0004\u00172~)s\u0018\r0\"3g\b\u000e{6";
      f1784[6] = "VDX6J#J^ZjP7Z]\u0011ɬ";
      f1784[7] = "<\u001d|L\"\u001d \u0007~\u00108\t0\u00045\u0001<\u00016\u0001oL1\u0018:Ah\u0007$\u001c:\u0001|L\u0013\u0007?\u0000i15\u001c'\u0006u\u0005";
      f1784[8] = "70Hs5\u000b+*J//\u001f;)\u0001>(\f=lZ).\u0012+ll2+\u0011*\u0017[4+\r";
      f1784[9] = "}\u001fk\u0019\\~`\n3;\u001dsx\f";
      f1784[10] = "D\u0011\t\u001b\u0006wO\u001e\u0018TgyD\u0015\u001c\u000e";
      f1784[11] = "\\\u000bv\u0014\u0013\u000e\u0019\u0017'Iu\u0002\n\nI\u001f\u0011\u0010\nv)\u0010NVW\u0012v\u0007\u0011\u001cg";
      f1784[12] = "x\u000b~O>$$YrHLt9zgP&|&~dS+o\u0019De\\!yB\u000ejE6\u007f2I`\u000b2\u0015";
      f1784[13] = "@f(\u000309\u0005v?{Ԩ[\u0004u.\u001637\u001aq%{";
      f1784[14] = "PoNrDK\u0015\u007fY\nɥ)\u0014|HgGE\nxC\n";
      f1784[15] = "#\u001eO6j\u0013q\u0016\u001e4\r\u0005s\bj0u\nwt^:m\u0007e\u0018@>fj";
      f1784[16] = "fRdUTX:\u0000hR&\b'0y@C\u0004\u0017\u000b}J\\2-\nr@Jig\u0005kWL\u0019 \u000f%S&";
      f1784[17] = "}9\u001d\fD\u001f8%LQ\"\u0015Fx\u0012\u0011^\u0016!<\u001e\u0015\u001c|z*\u0003\u0012H\u001b>&\u0007P\"";
      f1784[18] = "Y_#x^C\u0001\bzw$\u000e\u001d\u000e\"g\\\u001b\u001d\n\"wUrY\u0001\u007f'\u0014\u0016\u0006\u0016 m$\u000f\t\u0007)gH\u0011\r\fD\"BI\\W }U\u0016\u0016g";
      f1784[19] = "\u0016\b(&\u000b/@\u000f\"ps-B\b\u0012`\u001f\u0007F\u0012;r\u001e8/Nl`\u000b0\u001e\u0012>l\fB";
      f1784[20] = "\bv\u0019\u0013[\bT$\u0015\u0014)V_4?\u0006B^T$\r\u0011XrU,\u0003\u0011)\u0007Ts_[MXC,\u0015k";
   }
}
