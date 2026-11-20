package org.rusherhack;

import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.core.event.type.EventCancellable;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public abstract class Event515 extends EventCancellable {
   public BlockPos f8220;
   @Nullable
   public net.minecraft.util.math.Direction f8221;
   public static Object[] f8223 = new Object[6];

   public net.minecraft.util.math.Direction m15854() {
      return this.f8221;
   }

   public Event515(BlockPos var1, net.minecraft.util.math.Direction var2) {
      this.f8220 = var1;
      this.f8221 = var2;
   }

   public BlockPos m15855() {
      return this.f8220;
   }

   static {
      m786();
   }
   public static void m786() {
      f8223[0] = "\u001f3sW\u0000\u0013\u0003)q\u000b\u001a\u0007\u0013*:Ӗ";
      f8223[1] = "\"q\u0003\bq\u001d\"q\u0014T}\u00128:\u0014J}\u0007?KE\u0015/L";
      f8223[2] = "E,\f\"\u007fVE,\u001b~sY_g\u001b`sLX\u0016J?'\u000f";
      f8223[3] = "OJMSXqDE\\\u001c9\u007fONXF";
      f8223[4] = "\u000fg\u0002|5r\rk\u0019GΓ\u0000\u0013x\r%&i\\yH";
      f8223[5] = "\u00149|\";W\u00165g\u0019˧%C<qd#\u001cFa5u";
   }
}
