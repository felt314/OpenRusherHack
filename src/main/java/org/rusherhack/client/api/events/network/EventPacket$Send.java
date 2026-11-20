package org.rusherhack.client.api.events.network;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import org.rusherhack.core.setting.Setting;

public class EventPacket$Send extends EventPacket {
   public static int[] f402;
   public static Object[] f404 = new Object[16];
   public static String[] f405 = new String[16];

   public EventPacket$Send(Packet<?> var1) {
    }

   public static void m905(int[] var0) {
      f402 = var0;
   }

   public static int[] m906() {
      return f402;
   }

   static {
    }
   public static void m786() {
      f404[0] = "M\u001d3j<MQ\u000716&YA\u0004z'\"QG\u0001 j/HKA12+VV\u001cz*+LU\u0000&/`}T\n:0\u001eYA\u000410jkG\u00010";
      f404[1] = "\u00052";
      f404[2] = void.class;
      f405[2] = "java/lang/Void";
      f404[3] = "^j";
      f404[4] = ";$\t@\u0003z'>\u000b\u001c\u0019n7=@\r\u001e}1x\u001d\u000b\u0005{=8\t@\"j \"\u0007\u0000\u0016";
      f404[5] = "9-\u007f\u000b\u0012\u0019L\rt\u0004\u0003V1\u0015g\u0003\n\u001fY";
      f404[6] = "4>L\u0010zq($NL`e8'\u0005]dm>\"_\u0010it2bNHmj/?\u0005Pmp,#YU&A-)EJXe8'NJ";
      f404[7] = boolean.class;
      f405[7] = "java/lang/Boolean";
      f404[8] = "0#3\u000bK#,91WQ7<:zɑ";
      f404[9] = "]kU^'XVdD\u0011FV]o@K";
      f404[10] = "XK!N7\u0019ZU.EGľd\fqX J\u0007\t`U<'";
      f404[11] = "Uk0\th<\u0010(m\\\u0012լo//\u0010iv\u0000rb\u0001k\r";
      f404[12] = "sE+\u0013A2aB|aÒC'Fz\u000f\u001f1,D=\u0010 zfB(]\u0018xa\u0001>a";
      f404[13] = "|\u0002KSQ'n\u0005\u001c!ZV/[K\u0018S;}\u0003\u0018\u00100kuS\u001dB]9-\u0000\u0015!";
      f404[14] = "\u007f])##g}C&(SǀC\u001ay544 \u001fh8(Yz\\/5oax[l#S";
      f404[15] = "X7\u007fS\u0006\\J0(!Ӥ-\f4.OX_\u00076iPg";
   }
}
