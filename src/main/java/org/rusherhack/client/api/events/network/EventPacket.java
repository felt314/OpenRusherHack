package org.rusherhack.client.api.events.network;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public abstract class EventPacket extends EventCancellable {
   public Packet<?> f406;
   public static boolean f407;
   public static Object[] f409 = new Object[18];
   public static String[] f410 = new String[18];

   public Packet<?> getPacket() {
      return this.f406;
   }

   @Override
   public Stage getPreferredStage() {
        return null;
    }

   public EventPacket(Packet<?> var1) {
    }

   public static void m920(boolean var0) {
        
    }

   public static boolean m921() {
        return false;
    }

   public static boolean m922() {
        return false;
    }

   static {
    }
   public static void m122() {
        
    }

   public EventPacket() {}
}
