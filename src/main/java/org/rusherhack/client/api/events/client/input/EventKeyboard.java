package org.rusherhack.client.api.events.client.input;
import org.rusherhack.*;

import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;
import org.rusherhack.core.setting.Setting;

public class EventKeyboard extends EventCancellable {
   public int f350;
   public int f351;
   public int f352;
   public int f353;
   public static Object[] f355 = new Object[18];
   public static String[] f356 = new String[18];

   public int getAction() {
        return 0;
    }

   public int getModifiers() {
        return 0;
    }

   public int getKey() {
        return 0;
    }

   public EventKeyboard(int var1, int var2, int var3, int var4) {
    }

   public int getScanCode() {
        return 0;
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   static {
      m122();
   }
   public static void m122() {
      f355[0] = "8L0]~F.V2\u0001dR4Uy\u0010`Z2P#]mC>\u00102\u0005i]#My\u0010`Z2P#]e]'K#]IE2P#8iJ5Q6\u0001h";
      f355[1] = int.class;
      f356[1] = "java/lang/Integer";
      f355[2] = "A\u001fF(\u0019\u0003]\u0005Dt\u0003\u0017M\u0006\u000fe\u0004\u0004KCRc\u001f\u0002G\u0003F(8\u0013Z\u0019Hh\f";
      f355[3] = "i}P^\u0010\u0004\u001c][Q\u0001KaEHV\b\u0002\t";
      f355[4] = "ZN-J?\u0012FT/\u0016%\u0006VWdȐ";
      f355[5] = "w0\u000eO:Yk*\f\u0013 M{)G\u0002$E},\u001dO)\\ql\f\u0017-Bl1G\u0002$E},\u001dO!Bh7\u001dO\rZ},\u001d,'Yk'";
      f355[6] = "\"MZ[\u001d^)BK\u0014`F:EB]";
      f355[7] = "Gj(K?)2J#D.fOR0C'/'";
      f355[8] = void.class;
      f356[8] = "java/lang/Void";
      f355[9] = "p(U-1*{'DbP.p,@8";
      f355[10] = "l\u0010TQ\u001d\u000f`LA8³c5BYZ\n\u000fjT^\u0007";
      f355[11] = "-*T\u000b!\u0003)=R\u0011BԒ\u0014f\u0011\u0019+\f+=T\b0s";
      f355[12] = "_/tx\u0015\u0007Ssa\u0011\u0001k\u0005ly+T\nC+zshQBx*-\t\u0017\u0005{r\u0011";
      f355[13] = "\u007f}\u000b%USx\"\u000e>.ÏD#[5\u0016D\u007frU2R:";
      f355[14] = "r90ZC>~e%3ңR+k=QT>t}:\f";
      f355[15] = "\\B\u0018x\b[P\u001e\r\u0011Ő7\u0005\u0010\u0015s\u001f[Z\u0006\u0012.";
      f355[16] = "\u0017Vx%#7\u0013A~?@̸.\u001a=7)8\u0011Ax&2G\u0013_=gzyCKn\"@";
      f355[17] = "\u00024\"*rf\u000eh7CŬ\n[f/!ef\u0004p(|";
   }
}
