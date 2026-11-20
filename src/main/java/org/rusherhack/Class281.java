package org.rusherhack;

import java.nio.file.Path;
import java.text.SimpleDateFormat;
import org.rusherhack.core.logging.output.FileOutput;

public class Class281 extends FileOutput {
   public static Object[] f4801 = new Object[4];

   @Override
   public SimpleDateFormat getTimestampFormat() {
      return PacketLogger.f3575;
   }

   public Class281(PacketLogger var1, Path var2) {
      super(var2);
   }

   static {
      m194();
   }
   public static void m194() {
      f4801[0] = "\u0019R\u000b2\u00026\u0005H\tn\u0018\"\u0015KBƚ";
      f4801[1] = "\u000b\n\u0010h!?\u0004\u0013\u0012'\\\"\f\u001b\nlK*\u0015\u000e f}&\u0000\u001f";
      f4801[2] = "}k^$k'vdOk\n)}oK1";
      f4801[3] = "7w!\f$Gw`\u0010ӬZB=\"b\u0006#Al{h";
   }
}
