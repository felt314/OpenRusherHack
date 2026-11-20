package org.rusherhack.client.api.events.client.input;
import org.rusherhack.*;

import org.rusherhack.core.event.type.EventCancellable;

public abstract class EventMouse extends EventCancellable {
   public double f368;
   public double f369;
   public static String f370;
   public static Object[] f372 = new Object[9];
   public static String[] f373 = new String[9];

   public double getMouseY() {
        return 0.0;
    }

   public double getMouseX() {
        return 0.0;
    }

   public EventMouse(double var1, double var3) {
      this.f369 = var1;
      this.f368 = var3;
   }

   public static void m809(String var0) {
      f370 = var0;
   }

   public static String m810() {
      return f370;
   }

   static {
    }
   public static void m122() {
      f372[0] = "\u0019=\u0007\u001fYc\u0005'\u0005CCw\u0015$NRG\u007f\u0013!\u0014\u001fJf\u001fa\u0005GNx\u0002<NRG\u007f\u0013!\u0014\u001fBx\u0006:\u0014\u001fn`\u0013!\u0014|Dc\u0005*";
      f372[1] = double.class;
      f373[1] = "java/lang/Double";
      f372[2] = "\u001cc\u0007P&U\u0017l\u0016\u001f[M\u0004k\u001fV";
      f372[3] = void.class;
      f373[3] = "java/lang/Void";
      f372[4] = "\u001a<5x\u0015\u0019\u00113$7t\u0017\u001a8 m";
      f372[5] = "y:X4j#h:P\fΦI#aNj46 iM<";
      f372[6] = "8+\u0019q\u000b=)+\u0011IÄWb`\u0013/Qoe#\u000fp1";
      f372[7] = "HFZ^\u0014mYFRfŪ\u0007\u0012\rP\u0000N?\u0015NL_.=B\u0004L[\u0010w\u001bO\u0004f";
      f372[8] = "#75zJa27=BӜ\u000byl#$\u0014tzd r";
   }

   public EventMouse() {}
}
