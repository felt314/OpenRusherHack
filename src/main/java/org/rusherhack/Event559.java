package org.rusherhack;

import net.minecraft.entity.player.PlayerEntity;
import org.rusherhack.core.event.type.Event;

public class Event559 extends Event {
   public PlayerEntity f9059;
   public static Object[] f9061 = new Object[6];
   public static String[] f9062 = new String[6];

   public Event559(PlayerEntity var1) {
      this.f9059 = var1;
   }

   public int m17271() {
      return this.f9059.getId();
   }

   public PlayerEntity m17272() {
      return this.f9059;
   }

   static {
      m122();
   }
   public static void m122() {
      f9061[0] = "1\u0007\u001bw2<-\u001d\u0019+((=\u001eRՏ";
      f9061[1] = "\u0019BT``H\u0019BC<lG\u0003\tC\"lR\u0004x\u0011x8\u0016";
      f9061[2] = int.class;
      f9062[2] = "java/lang/Integer";
      f9061[3] = "6g\r\u0019v{=h\u001cV\u0017u6c\u0018\f";
      f9061[4] = "\u000f%|\u0000\u000f\rQ,+>\u001dk\t}uX\u0010\u0011O\u007fxP";
      f9061[5] = "\u0003Y\t\u0007\u001cGE[\u0004\u000f|XW\u001d\u0006\u0006\u0010j\u0007_\\Q|\u0004\\\u0002\t\u0013\u0015[_X\u000fa";
   }
}
