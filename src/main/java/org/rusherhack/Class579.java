package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;

public interface Class579 {
   long f9289 = Class066.m4320(5496211727075118908L, 8408240165735877971L, MethodHandles.lookup().lookupClass()).m4325(250840607902218L);
   Object[] f9290 = new Object[6];
   String[] f9291 = new String[6];

   List<String> m14457();

   int m14455();

   int m14458();

   default int m14454(String var1) {
      return this.m14457().indexOf(var1);
   }

   Map<String, String> m14456();

   public static void m122() {
      f9290[0] = "]<WD7YC4M\u000bUED)";
      f9290[1] = "'\u0003\u0016\u000b9=,\f\u0007DX3'\u0007\u0003\u001e";
      f9290[2] = int.class;
      f9291[2] = "java/lang/Integer";
      f9290[3] = "W\fRp.\u001aK\u0016P,4\u000e[\u0015\u001bԙ";
      f9290[4] = "@\u0012\u0001eiAU\u001c\u001e]gXI\u001b\t\u001ah>_\u0012\t&x\u0004Z\u0007\u001c]?\\GG\u0010$z@\u001c\ny";
      f9290[5] = "BR\ra #FQ\roEĳx^\u0005i}u\u0007K\u000bvE";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
