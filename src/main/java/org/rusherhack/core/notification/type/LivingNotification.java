package org.rusherhack.core.notification.type;
import org.rusherhack.*;

import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

public abstract class LivingNotification extends Notification implements ITickable {
   public Timer f1654;
   public boolean f1655;
   public long f1656;
   public static Object[] f1658 = new Object[24];
   public static String[] f1659 = new String[24];

   public boolean shouldKillSelf() {
        return false;
    }

   public long getLifeSpan() {
        return 0L;
    }

   public LivingNotification(String var1, NotificationType var2) {
    }

   public LivingNotification(String var1, NotificationType var2, int var3) {
    }

   public Timer getTimer() {
        return null;
    }

   public void kill() {
        
    }

   static {}
   public static void m194() {
      f1658[0] = "Sn\u0012O5bOt\u0010\u0013/v_w[\u0002(eY2\u001b\u000e3~Zu\u0016\u00003~Sr[\u0015>gY29\b1~R{;\u000e3~Zu\u0016\u00003~Sr";
      f1658[1] = "\fof8^\u000b\u0010uddD\u001f\u0000v/uC\f\u00063tbE\u0012\u00103U\u007fA\u001b\u0011";
      f1658[2] = "I_(\u0001I5UE*]S!EFaLT2C\u0003<JO4OC(\u0001h%RY&A\\";
      f1658[3] = "Y&\u0003sbm,\u0006\b|s\"Q\u001e\u001b{zk9";
      f1658[4] = "A5\u001a\u0018D\u0005]/\u0018D^\u0011M,SUY\u0002Ki\u0013YB\u0019H.\u001eWB\u0019A)SBO\u0000Ki3YB\u0019H.\u001eWB\u0019A)";
      f1658[5] = "\"A\u0007K= )N\u0016\u0004@8:I\u001fM";
      f1658[6] = void.class;
      f1659[6] = "java/lang/Void";
      f1658[7] = "&U<\u0019\u0001\u000f:O>E\u001b\u001b*LuT\u001c\b,\t5X\u0007\u0013/N8V\u0007\u0013&Iuy\u001c\u000e A2T\u0012\u000e H5c\n\n,";
      f1658[8] = long.class;
      f1659[8] = "java/lang/Long";
      f1658[9] = "\bA\u0018Im4\u0014[\u001a\u0015w \u0004XQȓ";
      f1658[10] = boolean.class;
      f1659[10] = "java/lang/Boolean";
      f1658[11] = "|X0=Cm\tx;2R\"t`(5[k\u001c";
      f1658[12] = double.class;
      f1659[12] = "java/lang/Double";
      f1658[13] = "\fh3\u001cwY\u0007g\"S\u0016W\fl&\t";
      f1658[14] = "O\u000e\u0010Weq\u001dD_R\u001dǦt\t]W#\u007f\u0018\b\nJxNHPXGv HW\u0003V\u001d";
      f1658[15] = "<b%\u0018kAzweV\u000bJls\u0011\teHZw<\u000e\u000b\u001b=s+\u0004pYlplh";
      f1658[16] = ";`E^O;i*\n[7N\u0000g\b^\t5lf_CR\u0004";
      f1658[17] = "!Qdm\u0002>/\u0003.\u0015ϊ\u0004{\u0007hk\u0016\u007f9Vk,";
      f1658[18] = "p\n\u0019g\u001bsw\u0004\u001a% ԭIY\\>Y+u\u001bY`\u001bL";
      f1658[19] = "oy&qdaa+l\tv[5h46p02i,c\u001cepqiewbqi<\t";
      f1658[20] = "|39).\u0007rasQ,='fr)1Da:p+";
      f1658[21] = "\u0000wX h=\u0007y[bSͽ9$\u001dy*e\u0005f\u0018'h\u0002\u0005q\u0019c8l\u0005vBrS";
      f1658[22] = "#\t\\J^9-[\u00162\u0382\u00036XA[Dj?\u0018E";
      f1658[23] = ":5}\u000e\t\u000b3uyg\u0013\u000b0u}\u000bkR:0{\u0016\u0010\u0006uv,gT]pvw\u001e\u0012\u0001rt\u0010";
   }

   public LivingNotification() {}
}
