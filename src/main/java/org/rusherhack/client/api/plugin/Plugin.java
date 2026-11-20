package org.rusherhack.client.api.plugin;
import org.rusherhack.*;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.setting.Setting;

public abstract class Plugin implements IPlugin {
   public ILogger logger;
   public static boolean f788;
   public static Object[] f790 = new Object[21];
   public static String[] f791 = new String[21];

   @Override
   public ILogger getLogger() {
      return this.logger;
   }

   public Plugin() {
    }

   public static void m1762(boolean var0) {
      f788 = var0;
   }

   public static boolean m1763() {
      return f788;
   }

   public static boolean m1764() {
      boolean var0 = m1763();
      return !var0;
   }

   static {
    }
   public static void m122() {
      f790[0] = "3gZgI\u0017/}X;S\u0003?~\u0013*W\u000b9{IgZ\u00125;M%N\u00055{\u0013\u0019W\u0017;|S";
      f790[1] = boolean.class;
      f791[1] = "java/lang/Boolean";
      f790[2] = void.class;
      f791[2] = "java/lang/Void";
      f790[3] = "\u001f^,!oj\u0003D.}u~\u0013Gelrm\u0015\u0002'`zx\u0019B,!TS\u001fK,jo";
      f790[4] = "?\u0013L7\\O#\tNkF[3\n\u0005zBS5\u000f_7OJ9Oyl]R5\u0013cxMQ\u00111b";
      f790[5] = "P_!\u001ch][P0S\u0015EHW9\u001a";
      f790[6] = "\u001eEa\u000e9\u0006\u0002_cR#\u0012\u0012\\(C$\u0001\u0014\u0019uE?\u0007\u0018Ya\u000e\u0018\u0016\u0005CoN,";
      f790[7] = "\u0010\u0001>H\u0003\te!5G\u0012F\u00189&@\u001b\u000fp";
      f790[8] = "$(Ctbo82A(x{(1\nȮ";
      f790[9] = "g>Nc\b\u001el1_,e\u001el,K";
      f790[10] = "L)u]E=9\t~RTrD\u0011mU];,";
      f790[11] = "\t2X#NE\u0002=Il/K\t6M6";
      f790[12] = "|1o{\u0013\u0019 *tn*\u0000<!xmG/!#~|Pk}4rqO\u00148pwq*Qy0cxA\u0017&2m\u0011";
      f790[13] = "p]hh)~*S/)Oz#\u0010\nv*m*\u0001\u0017~*xNW)t/p1\u0012mq/\u0015";
      f790[14] = "K\u000bJ\"E:H\\HZϏU\u0018\u0005\u0003+L1NPSj+";
      f790[15] = "Invl,#J9t\u0014ӅL\u001a`?e%(L5o.B";
      f790[16] = "d\u0007sq3I\"\u0004}sSՄXR>u4N?\\fql%";
      f790[17] = "!&-\u001c!O\"q/d& u+6\u001bpM1w3\u0000O\u001ev\u007f [\"Z*z;d";
      f790[18] = "\u0017E\u007fda\u0015\u0014\u0012}\u001cբzDK6mh\u001e\u0012\u001ef,\u000f@D\fm#e\u0014\u0001\u00194\u001c";
      f790[19] = "\u0004;Ia\u0018l\u0007lK\u0019\u0012d\u0001dVcv9QwIp\u001d\u007f\u000euG";
      f790[20] = "cJ@exE%INg\u0018͖_\u001f\ra\u007fB8\u0011Ue')e\u0019Kc'C1\\^:\u0018";
   }
}
