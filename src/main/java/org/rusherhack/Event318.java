package org.rusherhack;

import net.minecraft.client.render.Camera;
import org.rusherhack.core.event.type.Event;

public abstract class Event318 extends Event {
   public Camera f5218;
   public static Object[] f5220 = new Object[4];

   public Camera m10623() {
      return this.f5218;
   }

   public Event318(Camera var1) {
      this.f5218 = var1;
   }

   static {
      m122();
   }
   public static void m122() {
      f5220[0] = "Kz-\f\u007f\u0000W`/Pe\u0014Gcdɕ";
      f5220[1] = "v\u001e`PM\\v\u001ew\fASlUw\u0012AFk$ O\u0018\u0001";
      f5220[2] = "2\u0016\u0015[\u001649\u0019\u0004\u0014w:2\u0012\u0000N";
      f5220[3] = "\bl,_\b+\u000b1?=ЙA\u0010('\u0006I%\u00179?";
   }
}
