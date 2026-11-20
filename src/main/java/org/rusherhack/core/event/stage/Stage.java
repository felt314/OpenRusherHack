package org.rusherhack.core.event.stage;
import org.rusherhack.*;

public enum Stage {
   DEFAULT,
   ON(1),
   f1569,
   POST,
   PRE,
   ALL;

   // $VF: synthetic field
   public int f1571;
   public static boolean f1572;
   public int getId() {
        return 0;
    }

   Stage(int var3) {
      this.f1571 = var3;
   }

   public static Stage getStage(int var0) {
        return null;
    }

   public static void m3809(boolean var0) {
      f1572 = var0;
   }

   public static boolean m3810() {
      return f1572;
   }

   public static boolean m3811() {
      boolean var0 = m3810();
      return !var0;
   }
   Stage() {}
}
