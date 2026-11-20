package org.rusherhack.launcher;
import org.rusherhack.*;

public class Bootstrap {
   public static boolean attemptedSetup = true;
   public static boolean isSetup = true;

   public static boolean isSetup() {
      return true;
   }

   public static void execMain(Runnable runnable) {
      ClassLoader var1 = Thread.currentThread().getContextClassLoader();
      Thread.currentThread().setContextClassLoader(Bootstrap.class.getClassLoader());
      runnable.run();
      Thread.currentThread().setContextClassLoader(var1);
   }
}
