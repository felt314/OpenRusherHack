package org.rusherhack;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.rusherhack.core.event.type.Event;

public class Event537 extends Event {
   public LivingEntity f8631;
   public static Object[] f8633 = new Object[6];

   public LivingEntity m16566() {
      return this.f8631;
   }

   public ItemStack m16567() {
      return this.f8631.getActiveItem();
   }

   public Event537(LivingEntity var1) {
      this.f8631 = var1;
   }

   static {
      m122();
   }
   public static void m122() {
      f8633[0] = "#JoSt\b?Pm\u000fn\u001c/S&Ҙ";
      f8633[1] = "\u007fx\u0003Qv~\u007fx\u0014\rzqe3\u0014\u0013zdbBFL+.";
      f8633[2] = "0\u0012|M\u001f\u001a0\u0012k\u0011\u0013\u0015*Yk\u000f\u0013\u0000-(9TKJ";
      f8633[3] = "L8s\u0001=\\G7bN\\RL<f\u0014";
      f8633[4] = "8\u0018D_[T8SQcQI<\bO\u000fc\u001axS\u0010c\rV:\u0019N\u001d[\u001e'\u0011(";
      f8633[5] = "RW\u000fy\u0007\u0000VK\u0013Aճ`\u0015Y\u0005}T\u0010\u0015\u0012\u0010";
   }
}
