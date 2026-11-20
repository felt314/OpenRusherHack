package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;

public interface IServerState {
   long f865 = Class066.m4320(4171103209176705036L, -6800360330022814224L, MethodHandles.lookup().lookupClass()).m4325(98345541149886L);
   Object[] f866 = new Object[5];
   String[] f867 = new String[5];

   double getPlayerY();

   boolean isPlayerSneaking();

   boolean isPlayerSprinting();

   int getPlayerSlot();

   default float getTPS() {
      boolean var10003 = true;
      return this.getTPS(true);
   }

   float getTPS(boolean var1);

   float getPlayerPitch();

   float getPlayerYaw();

   double getPlayerZ();

   long getLastUpdate();

   double getPlayerX();

   String getServerIP();

   public static void m194() {
      f866[0] = "\n\u0014\u0016\t: \u0016\u000e\u0014U 4\u0006\r_D$<\u0000\b\u0005\t)%\fH\u0002^;!\u0000\u000b_n\u001b0\u0017\u0010\u0014U\u001b!\u0004\u0012\u0014";
      f866[1] = boolean.class;
      f867[1] = "java/lang/Boolean";
      f866[2] = float.class;
      f867[2] = "java/lang/Float";
      f866[3] = ")K\bpDJ\"D\u0019?%D)O\u001de";
      f866[4] = "\u00186\nsq\u0003@>L\u0012&\u000f\u0005\roII[A-E/$\u001c\u00154\b\u0012p\u000e\t)]h7\u0019\u0018`7";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m194();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
