package org.rusherhack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
public class Class568 {
   public static ExecutorService f9131;
   public static ExecutorService f9132;
   public static ScheduledThreadPoolExecutor f9133;
   public static Future<?> m17439(Runnable var0) {
      return f9131.submit(var0);
   }

   public static Future<?> m17440(Runnable var0) {
      return f9132.submit(var0);
   }
}
