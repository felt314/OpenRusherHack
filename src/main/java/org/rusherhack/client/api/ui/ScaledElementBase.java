package org.rusherhack.client.api.ui;
import org.rusherhack.*;

public abstract class ScaledElementBase extends ElementBase {
   public static boolean f885;
   public static Object[] f887 = new Object[11];
   public static String[] f888 = new String[11];

   public double getScale() {
      return 1.0;
   }

   public double getScaledWidth() {
      return this.getWidth() * this.getScale();
   }

   public double getScaledHeight() {
      return this.getHeight() * this.getScale();
   }

   public static void m2036(boolean var0) {
      f885 = var0;
   }

   public static boolean m2037() {
      return f885;
   }

   public static boolean m2038() {
      boolean var0 = m2037();
      return !var0;
   }

   static {
    }
   public static void m1731() {
      f887[0] = "l[\u0010j\bopA\u00126\u0012{`BY'\u0016sfG\u0003j\u001bjj\u0007\u0002-TI`H\u001b!\u001e_oL\u001a!\u0014nAH\u0004!";
      f887[1] = double.class;
      f888[1] = "java/lang/Double";
      f887[2] = "\u0007T,\u000f49\u001bN.S.-\u000bMeB*%\rH?\u000f'<\u0001\b>Hh\t\u0004C&D(8*G8D";
      f887[3] = boolean.class;
      f888[3] = "java/lang/Boolean";
      f887[4] = void.class;
      f888[4] = "java/lang/Void";
      f887[5] = "|\f+ \fHw\u0003:omF|\b>5";
      f887[6] = "eMwxs\nuA{\u0000ѿi>W{0wU5Lej\u001c";
      f887[7] = "^OC\u001a0\u0018\u000eRTAZ\u0019\nLrO;\u0019\u0007L2\u001beMY\bQO\"\u0007\u00020";
      f887[8] = "q-8[K\u0005a!4#K\u000bl\b8J@\u000b\u0010jl\u0018\u001a^s>+RAf";
      f887[9] = "GM\u001b\u000f\u0006^WA\u0017wȠ=\u001cW\u0017G\u0002\u0001\u0017L\t\u001di\u0006\u001c\f\u0001\b\bV@\\Jw";
      f887[10] = "2\u0014N^#ib\tY\u0005Ihf\u0017`\u0007%{kk\u0006Yr93\bR\u001e8b\u000b";
   }
}
