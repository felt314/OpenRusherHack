package org.rusherhack;

import java.lang.invoke.CallSite;

public class ZkmDispatch {
   public ZkmDispatch() {
   }

   @SuppressWarnings("unchecked")
   public static <T> T invoke(CallSite site, Object... args) {
      try {
         return (T)site.dynamicInvoker().invokeWithArguments(args);
      } catch (Throwable var3) {
         throw new IllegalStateException(var3);
      }
   }
}
