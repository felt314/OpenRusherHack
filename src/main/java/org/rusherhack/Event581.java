package org.rusherhack;

import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import org.rusherhack.core.event.type.Event;

public class Event581 extends Event {
   public ServerInfo f9296;
   public ServerAddress f9297;
   public static Object[] f9299 = new Object[6];

   public ServerAddress m17802() {
      return this.f9297;
   }

   public Event581(ServerAddress var1, ServerInfo var2) {
      this.f9297 = var1;
      this.f9296 = var2;
   }

   public ServerInfo m17803() {
      return this.f9296;
   }

   static {
      m122();
   }
   public static void m122() {
      f9299[0] = "Ym\u007fY>4Ew}\u0005$ Ut6Ծ";
      f9299[1] = "v~\n(\u0019?v~\u001dt\u00150l5\u001dj\u0015%kDH2F";
      f9299[2] = "\u001co?QX\u001f\u001co(\rT\u0010\u0006$(\u0013T\u0005\u0001U}L\f";
      f9299[3] = "\bV+w\u001c\u0017\u0003Y:8}\u0019\bR>b";
      f9299[4] = "O<\u0002B#\r\u001b/P|Ąn\u0019|\u0001\u001c/\tC=\u0001\u0012";
      f9299[5] = "\u0001U+\u000e\u000blUFy0\u0530\u000fWU.SId\u0001R>\f";
   }
}
