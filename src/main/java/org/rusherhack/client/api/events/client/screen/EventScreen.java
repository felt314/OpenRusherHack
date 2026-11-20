package org.rusherhack.client.api.events.client.screen;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.Screen;
import org.rusherhack.core.event.type.Event;

public abstract class EventScreen extends Event {
   public Screen f394;
   public static String[] f395;
   public static Object[] f397 = new Object[9];
   public static String[] f398 = new String[9];

   public Screen getScreen() {
        return null;
    }

   public EventScreen(Screen var1) {
      this.f394 = var1;
   }

   public static void m877(String[] var0) {
      f395 = var0;
   }

   public static String[] m878() {
      return f395;
   }

   static {
    }
   public static void m122() {
      f397[0] = "9D[7$O%^Yk>[5]\u0012z:S3XH77J?\u0018Yo3T\"E\u0012z:S3XH7%Y.SYwx\u007f SRm\u0005Y$SYw";
      f397[1] = "#^b&=Y#^uz1V9\u0015ud1C>d\";g";
      f397[2] = "\n~\u0000\\~\u001d\u007f^\u000bSoR\u0002F\u0018Tf\u001bj";
      f397[3] = void.class;
      f398[3] = "java/lang/Void";
      f397[4] = "\u0002($U\u0014\"w\b/Z\u0005m\n\u0010<]\f$b";
      f397[5] = "k\u001aS#Z)`\u0015Bl;'k\u001eF6";
      f397[6] = "\u0016YU^nE\u0014\u0005\ff΅#\u0014Y\f\u000by\u001a\u001f\u001fU^\u0001\u0019W\u001aS[j\u001f\u0012\bNf";
      f397[7] = "s}[Q5\u0017q!\u0002iůqs~\r\u001bf\u001ft:_\u0007";
      f397[8] = "}gs2N\u001a\u007f;*\nļ|\u007fg*gYEt!s2!";
   }

   public EventScreen() {}
}
