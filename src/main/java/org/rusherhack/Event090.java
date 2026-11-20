package org.rusherhack;

import org.rusherhack.client.api.bind.key.GLFWKey;
import org.rusherhack.client.api.events.client.input.EventKeyboard;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.type.Event;

import org.rusherhack.command.bind;
public class Event090 extends Event {
   public Enum385 f2251;
   public int f2252;
   public static Object[] f2254 = new Object[14];
   public static String[] f2255 = new String[14];

   public Event090(EventKeyboard var1) {
      this(Enum385.f6245, var1.getKey());
   }

   public Enum385 m5026() {
      return this.f2251;
   }

   public Event090(Enum385 var1, int var2) {
      this.f2251 = var1;
      this.f2252 = var2;
   }

   public Event090(EventMouse$Key var1) {
      this(Enum385.f6244, var1.getButton());
   }

   public int m5027() {
      return this.f2252;
   }

   public boolean m5028(IKey var1) {
      if (!(var1 instanceof GLFWKey)) {
         return false;
      } else if (var1 instanceof Class545) {
         if (this.f2251 == Enum385.f6245 && this.f2252 == ((Class545)var1).getKeyCode()) {
            boolean var8 = true;
            return true;
         } else {
            boolean var7 = true;
            return false;
         }
      } else if (var1 instanceof Class489) {
         if (this.f2251 == Enum385.f6244 && this.f2252 == ((GLFWKey)var1).getKeyCode()) {
            boolean var6 = true;
            return true;
         } else {
            boolean var10002 = true;
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      m122();
   }
   public static void m122() {
      f2254[0] = "\b_Bt_\u0017\u0014E@(E\u0003\u0004F\u000b\u0083";
      f2254[1] = int.class;
      f2255[1] = "java/lang/Integer";
      f2254[2] = "\u0017O\u0016(\u000ey\u000bU\u0014t\u0014m\u001bV_ξ";
      f2254[3] = "B#%\u001a-R^9'F7FN:lȲ";
      f2254[4] = "\u0014G8%z\u0001\b]:y`\u0015\u0018^qhd\u001d\u001e[+%i\u0004\u0012\u001b=bf\u0010U^:r&37s\b@m\r";
      f2254[5] = "k&,b9ow<.>#{g?eȸ";
      f2254[6] = "PyO\u0012\u001dQ[v^]|_P}Z\u0007";
      f2254[7] = "O_\u0013k14L\u001b\n\u0015ĝ\u0005\u0015F\u0018jpiTW\u0019s";
      f2254[8] = "yq\u0004&\u001e|\u007fcY`bԬCaZc\u001b(;\u007f]$b";
      f2254[9] = "\u0007\u000f<-\u001c3\u0004K%SǙ\u0002\u0019Ha*\u0002z\u0007O&";
      f2254[10] = "C77v\u0002\u0018\u0002&6o9\u001bzn9gFO\u0016/(f_";
      f2254[11] = "c$it^B\"5hme\u0002Z}ge\u001a\u00156<vd\u0003";
      f2254[12] = ">\u000f (\u0004{4Q-(uthL\u0000)\u0004Pb\\.D\b%=I'<\u0016\"z0";
      f2254[13] = "0~\u0004\u0016<\u001a3:\u001dh/+hv\b\u0019/U!\u007f\u0010\u0018F\u0010\"n\u0010\u00018Y+v\u0011h";
   }
}
