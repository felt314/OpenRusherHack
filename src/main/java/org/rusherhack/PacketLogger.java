package org.rusherhack;

import java.text.SimpleDateFormat;
import org.rusherhack.core.logging.Logger;

public class PacketLogger extends Logger {
   public static SimpleDateFormat f3575;
   public PacketLogger() {
      super("PacketLogger");
      super.outputs.add(new Class281(this, Class367.f6017.toPath().resolve("logs").resolve("packetlogger")));
   }
}
