package org.rusherhack.client.api.events.player;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
public class EventMove$Mount extends EventMove {
   public Entity f423;
   public static Object[] f425 = new Object[4];

   public EventMove$Mount(Entity var1, Vec3d var2) {
      super(var2);
      this.f423 = var1;
   }

   public Entity getEntity() {
        return null;
    }

   static {
      m786();
   }
   public static void m786() {
      f425[0] = "f\u0002$Y:Jz\u0018&\u0005 ^j\u001bm\u0014$Vl\u001e7Y)O`^&\u0001-Q}\u0003m\u0007$^p\u00151Y\rIl\u001e7:'IlT\u000e\u0018=Q}";
      f425[1] = "~=\u000442A~=\u0013h>Ndv\u0013v>[c\u0007A(f\u001f";
      f425[2] = "2Sz/\u0004D9\\k`eJ2Wo:";
      f425[3] = "\u0005\u0010\u001bF(vQM\u0019?׃K\u0012H\u0010R.1^\u001c\u001b";
   }
}
