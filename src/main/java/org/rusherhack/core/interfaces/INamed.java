package org.rusherhack.core.interfaces;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;

public interface INamed {
   long f1616 = Class066.m4320(5937632407118990246L, -5133683398932715921L, MethodHandles.lookup().lookupClass()).m4325(196599601330228L);
   Object[] f1617 = new Object[5];
   String[] f1618 = new String[5];

   String getName();

   default String[] getAliases() {
      String[] var10000 = new String[]{this.getName(), null};
      boolean var10004 = true;
      var10000[1] = this.getDisplayName();
      return var10000;
   }

   default String getDisplayName() {
      return this.getName();
   }

   public static void m3938() {
      f1617[0] = "r<^3|)n&\\of=~%\u0017~a.x`Psz9o(X~k/3\u0007w|c9y";
      f1617[1] = "<[An\u001fX7TP!b@$SYh";
      f1617[2] = "?g[Tt!4hJ\u001b\u0015/?cNA";
      f1617[3] = "GeRQ6f_>\\>=bY\u0019\fE*kL$+W7b%'\u0012_obN-\u0017\u0003R";
      f1617[4] = ";K\u000b\u00046'#\u0010\u0005k=#%=]\u000e?N+\u0004UV?%!\u0001\tk";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m3938();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
