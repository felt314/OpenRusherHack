package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import org.rusherhack.core.event.type.EventCancellable;

public abstract class EventEntity extends EventCancellable {
   public Entity f534;
   public static int[] f535;
   public static Object[] f537 = new Object[9];
   public static String[] f538 = new String[9];

   public Entity getEntity() {
        return null;
    }

   public EventEntity(Entity var1) {
      this.f534 = var1;
   }

   public static void m1207(int[] var0) {
      f535 = var0;
   }

   public static int[] m1208() {
      return f535;
   }

   static {
    }
   public static void m122() {
      f537[0] = "\ncFXge\u0016yD\u0004}q\u0006z\u000f\u0015yy\u0000\u007fUXt`\f?D\u0000p~\u0011b\u000f\u0001zb\tu\u000f3cu\u000bed\u0018ay\u0011h";
      f537[1] = "wc";
      f537[2] = void.class;
      f538[2] = "java/lang/Void";
      f537[3] = "U&";
      f537[4] = "Y9E\u0017{ZY9RKwUCrRUw@D\u0003\u0000\u000b/\u0004";
      f537[5] = "\u0011J\u0006N8\n\u001aE\u0017\u0001Y\u0004\u0011N\u0013[";
      f537[6] = "{\u001b\u007frv\u0012c\u0012 \u001cϡo \u001c2!q\f|\t>`\u0017";
      f537[7] = " U\u0017\r\\~8\\Hcѷ\u0003{RZ^[`'GV\u001f=:!\\_[L>\u007fJVc";
      f537[8] = "f\u001cxM&$~\u0015'#ȅY=\f%N `x\rx\u0012";
   }

   public EventEntity() {}
}
