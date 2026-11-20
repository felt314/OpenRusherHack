package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import org.rusherhack.core.event.stage.Stage;

public class EventEntity$Add extends EventEntity {
   public static Object[] f528 = new Object[3];

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   public EventEntity$Add(Entity var1) {
      super(var1);
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m786();
   }
   public static void m786() {
      f528[0] = "s @`\u001afo:B<\u0000r\u007f9\t-\u0007ay|B8\r}h|T:\tty|t:\tty";
      f528[1] = "\u001aGm\u0012|M\u0011H|]\u001dC\u001aCx\u0007";
      f528[2] = "3{/_P\u0005jo+!5}\rXTD\u0012A(9k\u001d\u0006E";
   }
}
