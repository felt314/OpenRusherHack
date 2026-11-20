package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.core.event.type.Event;

public abstract class EventRender extends Event {
   public MatrixStack f444;
   public float f445;
   public static boolean f446;
   public static Object[] f448 = new Object[10];
   public static String[] f449 = new String[10];

   public EventRender(MatrixStack var1, float var2) {
      this.f444 = var1;
      this.f445 = var2;
   }

   public float getPartialTicks() {
        return 0.0f;
    }

   public MatrixStack getMatrixStack() {
        return null;
    }

   public static void m1003(boolean var0) {
      f446 = var0;
   }

   public static boolean m1004() {
      return f446;
   }

   public static boolean m1005() {
      boolean var0 = m1004();
      return !var0;
   }

   static {
    }
   public static void m122() {
      f448[0] = "\n\f\"ea \u0016\u0016 9{4\u0006\u0015k(\u007f<\u0000\u00101er%\fP =v;\u0011\rk9v;\u0001\u001b7eV#\u0000\u00101\u0019v;\u0001\u001b7";
      f448[1] = "2EY\u0010\u0013\u000b2ENL\u001f\u0004(\u000eNR\u001f\u0011/\u007f\u0019\u000bFU";
      f448[2] = boolean.class;
      f449[2] = "java/lang/Boolean";
      f448[3] = void.class;
      f449[3] = "java/lang/Void";
      f448[4] = float.class;
      f449[4] = "java/lang/Float";
      f448[5] = "E,\u0019sH\\N#\b<)RE(\ff";
      f448[6] = "~h%h:\u0000`~e\u0019ѹ>#ae%,\u000fxrc~";
      f448[7] = ",:#Q\u001822,c ν\fr8}D\u001cqtzgIq";
      f448[8] = "#\f\u000f^\fh=\u001aO/ɵV>\u0005P\u0014\u001am?OP";
      f448[9] = "=\u0001ya\b\t#\u00179\u0010\u00947c\u0003't\fJeA=ya\r5G/l_Ie\u0004}\u0010";
   }
}
