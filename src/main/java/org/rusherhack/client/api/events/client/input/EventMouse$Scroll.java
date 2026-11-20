package org.rusherhack.client.api.events.client.input;
import org.rusherhack.*;

import org.rusherhack.client.api.utils.InputUtils;

public class EventMouse$Scroll extends EventMouse {
   public double f363;
   public double f364;
   public static Object[] f366 = new Object[5];
   public static String[] f367 = new String[5];

   public double getScrollDeltaX() {
        return 0.0;
    }

   public EventMouse$Scroll(double var1, double var3) {
      super(InputUtils.getMouseX(), InputUtils.getMouseY());
      this.f363 = var1;
      this.f364 = var3;
   }

   public double getScrollDeltaY() {
        return 0.0;
    }

   static {
      m786();
   }
   public static void m786() {
      f366[0] = "A\u0018\u0000/\rN]\u0002\u0002s\u0017ZM\u0001Ib\u0013RK\u0004\u0013/\u001eKGD\u0002w\u001aUZ\u0019Ib\u0013RK\u0004\u0013/\u0016U^\u001f\u0013/:MK\u0004\u0013L\u0010N]\u000fCR\u001cIA\u0006\u000b";
      f366[1] = double.class;
      f367[1] = "java/lang/Double";
      f366[2] = "!\u0006\u0012\u000bzS*\t\u0003D\u001b]!\u0002\u0007\u001e";
      f366[3] = "o\n&u\u000eR4\u000f9Hиmr\u001665H\u000f1\u0010 ";
      f366[4] = "L@BK\u0003)\u0017E]vϾ\u0016Q\\R\u000bEt\u0012ZD";
   }
}
