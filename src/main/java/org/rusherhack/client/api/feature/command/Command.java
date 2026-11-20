package org.rusherhack.client.api.feature.command;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.setting.Setting;

public abstract class Command extends AbstractCommand implements Globals {
   public static boolean f542;
   public static Object[] f544 = new Object[12];
   public static String[] f545 = new String[12];

   public Command(String var1, String var2) {
    }

   public static void m1233(boolean var0) {
      f542 = var0;
   }

   public static boolean m1234() {
      return f542;
   }

   public static boolean m1235() {
      boolean var0 = m1234();
      return !var0;
   }

   static {
    }
   public static void m786() {
      f544[0] = "\b\"6-(X\u001484q2L\u0004;\u007f`6D\u0002>%-;]\u000e~7f;Y\u0012\"4-9B\n=0m>\u0003$?<n;C\u0003";
      f544[1] = boolean.class;
      f545[1] = "java/lang/Boolean";
      f544[2] = void.class;
      f545[2] = "java/lang/Void";
      f544[3] = "&y8\u0007KR:c:[QF*`qJVU,%,LMS e8\u0007jB=\u007f6G^";
      f544[4] = "\u0013e\u0007\t0\u001efE\f\u0006!Q\u001b]\u001f\u0001(\u0018s";
      f544[5] = "JK)^yyVQ+\u0002cmFR`Ȅ";
      f544[6] = "\u001b>y}T!\u00101h25/\u001b:lh";
      f544[7] = "\u0000\u0016\u001c(=_\\\b\u00133@ԁ:JA=&\u0019J\u0001\u00108}`";
      f544[8] = "x3\u001c\\j-,w\u0002eѿJx\"N\f.;3;\u0003\u0005R";
      f544[9] = "&w=l3+r3#U`L#581:/vl'n\u000bp'k:dh%~teU";
      f544[10] = "\u0016)\u0002(w~Bm\u001c\u0011մ\u0019\u00168Px3h]!\u001dqO L\"Yn&&\u0015.\u001c\u0011";
      f544[11] = "Fx\u0007w+#\u0012<\u0019NĀDFiU'o5\rp\u0018.\u0013";
   }

   public Command() {}
}
