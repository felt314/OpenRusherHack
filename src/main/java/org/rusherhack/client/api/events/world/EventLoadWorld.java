package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;

public class EventLoadWorld extends Event {
   public static Object[] f540 = new Object[3];

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   static {
      m122();
   }
   public static void m122() {
      f540[0] = "\u0006=>\fB0\u001a'<PX$\n$wA_7\fa<TU+\u001da*VQ\"\fa\nVQ\"\f";
      f540[1] = "X-\r4z9S\"\u001c{\u001b7X)\u0018!";
      f540[2] = "\u001e(\u001c\u0007l:\r+\t`E\u001c)\u000eu\fg2\u0015#\u0014\u001fd'";
   }
}
