package org.rusherhack.client.api.ui.notification;
import org.rusherhack.*;

import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.notification.type.LivingNotification;
import org.rusherhack.core.setting.Setting;

public abstract class RenderableNotification extends LivingNotification implements IRenderable2D, IClickable {
   public static boolean f894;
   public static Object[] f896 = new Object[14];
   public static String[] f897 = new String[14];

   public RenderableNotification(String var1, NotificationType var2, int var3) {
    }

   public RenderableNotification(String var1, NotificationType var2) {
    }

   public static void m2067(boolean var0) {
      f894 = var0;
   }

   public static boolean m2068() {
      return f894;
   }

   public static boolean m2069() {
      boolean var0 = m2068();
      return !var0;
   }

   static {}
   public static void m786() {
      f896[0] = "<\u0010\u0007V\u000ec \n\u0005\n\u0014w0\tN\u001b\u0013d6L\u0013\u001d\bb:\f\u0007V/s'\u0016\t\u0016\u001b";
      f896[1] = "\n\u001d&\\4>\u007f=-S%q\u0002%>T,8j";
      f896[2] = "\\g#\u0016\":@}!J8.P~j[<&V{0\u00161?Z;1Q~!\\a-^9,Ra-W>aap*\\5=Rw(]\u001e G|\"Q3.G|+V";
      f896[3] = boolean.class;
      f897[3] = "java/lang/Boolean";
      f896[4] = void.class;
      f897[4] = "java/lang/Void";
      f896[5] = "|$\u0002S;w`>\u0000\u000f!cp=Kȉ";
      f896[6] = "T\u001c\u0018qAT!<\u0013~P\u001b\\$\u0000yYR4";
      f896[7] = "\u001f\\uUf@\u0014Sd\u001a\u0007N\u001fX`@";
      f896[8] = "{I*\b\u000e<'I:5ՑD+V8Q]:eXkE0";
      f896[9] = "$t0X3\u0012,pv\u000eBԃ\u001d*hOx\u001a#}e\u000f\u007fx";
      f896[10] = "#hAs\u0019M+l\u0007%hɽ\u001a6\u0019dRE$a\u0014$U'!c\u0012dY\u001dwnG#h";
      f896[11] = "G\u000etZ12O\n2\f@1~Q.T+7\u0003\u00145S,XE\n+Z/%\u0000\u0011,]@";
      f896[12] = "eN\tL&\u00189N\u0019qͧ`5Q\u001b\u0015u\u001e{_H\u0001\u0018[fD\t@\"\rk\u0011Nq";
      f896[13] = "/m\u0006PR\u0010'i@\u0006#ԛ\u00163^G\u0019\u0018(dS\u0007\u001ez";
   }
}
