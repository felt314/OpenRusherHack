package org.rusherhack;

import org.rusherhack.core.logging.ILog;
import org.rusherhack.core.notification.NotificationType;

import org.rusherhack.command.send;
public class Class084 implements ILog {
   public Class572 f2130;
   public static Object[] f2132 = new Object[13];
   public static String[] f2133 = new String[13];

   @Override
   public void warn(String var1) {
      this.f2130.send(NotificationType.WARNING, var1);
   }

   public Class084(Class572 var1) {
      this.f2130 = var1;
   }

   @Override
   public void info(String var1) {
      this.f2130.send(NotificationType.INFO, var1);
   }

   @Override
   public void error(String var1) {
      this.f2130.send(NotificationType.ERROR, var1);
   }

   @Override
   public void debug(String var1) {
      this.f2130.send(NotificationType.DEBUG, var1);
   }

   static {
      m122();
   }
   public static void m122() {
      f2132[0] = "\u000e\bN\t1\u0011\u0012\u0012LU+\u0005\u0002\u0011\u0007D/\r\u0004\u0014]\t\"\u0014\bTZ^0\u0010\u0004\u0017\u0007n\r\u000b\u0015\u0013ON \u0005\u0015\u0013FI\u000e\u0005\u000f\u001bNB1";
      f2132[1] = ".\r4\u001f432\u00176C.'\"\u0014}R)4$Q=^2/'\u00160P2/.\u0011}\u007f)2(\u0019:R'2(\u0010=e?6$";
      f2132[2] = "p\t/f?A{\u0006>)BYh\u00017`";
      f2132[3] = void.class;
      f2133[3] = "java/lang/Void";
      f2132[4] = "G'1q\u0018\"[=3-\u00026K>x\u0092";
      f2132[5] = "\u0016}dKh9\ngf\u0017r-\u001ad-՜";
      f2132[6] = "OEio/\rDJx N\u0003OA|z";
      f2132[7] = "*8RF\\b~fK>Cjrh6\u0007\u00047h5H_Wg%\u0004\u000f\\]:)eO\u0004Eg\u0014>U\u0001Q~yyN\u0005F\u0007";
      f2132[8] = "V 73%B\u000esg~\u0014q5F@\u0015\u0014\u0005S,{~j]\u0000|6";
      f2132[9] = "\u0012B`\u0016e\u001cU\\}\u0017\nը(\u0007{\u0011z\tLQj\u0014f";
      f2132[10] = "Ap4sXw\u0019#d>iE5\u0006Y@i0D|x>\u0017h\u0017,5";
      f2132[11] = "\u0000\u0004m,{wXW=aJH\u007fv\u001aPs5\tDl.+fY\t";
      f2132[12] = "HV(b[\u001c\u0010\u0005x/j=80^_,-qS$.\u0016S\u000f\u000bw~[";
   }
}
