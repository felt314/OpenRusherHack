package org.rusherhack;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public class Class366 implements ThreadFactory {
   public AtomicInteger f5999;
   public ThreadGroup f6000;
   public static AtomicInteger f6001;
   public String f6002;
   public Class366(String var1) {
    }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var5;
      if ((var5 = new Thread(this.f6000, var1, this.f6002 + this.f5999.getAndIncrement(), 0L)).isDaemon()) {
         var5.setDaemon(false);
      }

      if (var5.getPriority() != 5) {
         var5.setPriority(5);
      }

      return var5;
   }
}
