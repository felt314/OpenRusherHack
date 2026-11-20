package org.rusherhack.client.api.events.client;
import org.rusherhack.*;

import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventQuit extends EventCancellable {
   public EventQuit$Reason f329;
   public static Object[] f331 = new Object[17];
   public static String[] f332 = new String[17];

   public EventQuit(EventQuit$Reason var1) {
    }

   public EventQuit$Reason getReason() {
        return null;
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m122();
   }
   public static void m122() {
      f331[0] = "~cBG10by@\u001b+$rz\u000b\n,7t?@\u001f&+e?V\u001d\"\"t?v\u001d\"\"t";
      f331[1] = "\u0019lMoLS\u0005vO3VG\u0015u\u0004\"RO\u0013p^o_V\u001f0O7[H\u0002m\u0004\"RO\u0013p^o{P\u0013p^\u0010KO\u0002";
      f331[2] = "^~\u000e9+&Bd\fe12RgGt5:Tb\u001d98#X\"\fa<=E\u007fGt5:Tb\u001d9\u001c%Tb\u001dF,:E(;r8 ^b";
      f331[3] = "\u0016L\u00135\u001b\b\nV\u0011i\u0001\u001c\u001aUZx\u0006\u000f\u001c\u0010\u0007~\u001d\t\u0010P\u00135:\u0018\rJ\u001du\u000e";
      f331[4] = "`\\cq*N\u0015|h~;\u0001hd{y2H\u0000";
      f331[5] = "\u0000&sAa\u0002\u001c<q\u001d{\u0016\f?:ț";
      f331[6] = "\u007fd\u0013\f\u0013\u0014c~\u0011P\t\u0000s}ZA\r\bux\u0000\f\u0000\u0011y8\u0011T\u0004\u000fdeZA\r\bux\u0000\f$\u0017ux\u0000w\u0011\u0005qb\u0011";
      f331[7] = "V&\u007frT6#\u0006t}Ey^\u001egzL06";
      f331[8] = void.class;
      f332[8] = "java/lang/Void";
      f331[9] = ",_\u0006\u001c.\u0019Y\u007f\r\u0013?V.g\u001e\u00146\u001fL";
      f331[10] = "\u0011\u000fO\u0006\u0005k\u001a\u0000^Ide\u0011\u000bZ\u0013";
      f331[11] = "6( Ld{17\"6UG\u000e\u0015^Ul~/ %Rs|";
      f331[12] = "j3YxG>kbOq>\u0018Sa]e@j3\"\u000er\u0000";
      f331[13] = "\u0012sa\u0013bWD<}A^Մ(shW%X\u0017=d\u0012;%";
      f331[14] = "rZC+|js\u000bU\"\u0005hK\nW-5d6VM<n\u0001pLI~`|,VX%\u0005";
      f331[15] = "t\n\",\u001fn4L'|cқHM+o\u0018-w\u0003'*\u0006Pu\u000f5xX5-\u000fu|c";
      f331[16] = "3:=C|bs|8\u0013\u0000Ȧ\u000f}4\u0000{!038Ee\\";
   }
}
