package org.rusherhack.core.command.exceptions;
import org.rusherhack.*;

import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.setting.Setting;

public class CommandException extends Exception {
   public CommandProcessingSink f1524;
   public static int f1525;
   public static Object[] f1527 = new Object[20];
   public static String[] f1528 = new String[20];

   public CommandException(String var1, Throwable var2) {
    }

   public boolean shouldPrintSyntax() {
      return false;
   }

   public CommandException(String var1, CommandProcessingSink var2) {
    }

   public CommandProcessingSink getContext() {
        return null;
    }

   public CommandException(String var1, CommandProcessingSink var2, Throwable var3) {
    }

   public void setContext(CommandProcessingSink var1) {
        
    }

   public CommandException(String var1) {
    }

   public static void m3696(int var0) {
      f1525 = var0;
   }

   public static int m3697() {
      return f1525;
   }

   public static int m3698() {
      int var0 = m3697();
      return var0 == 0 ? 67 : 0;
   }

   static {}
   public static void m122() {
      f1527[0] = "\r-Z+)\u000b\u00117Xw3\u001f\u00014\u0013f4\f\u0007q^j6\u0013\u00031Y+>\u0006\u0001:Mq2\u0011\f,\u0013F4\u0013\u000f>Sa\u001e\u0006\u0001:Mq2\u0011\f";
      f1527[1] = "=\u007fl=8K!ena\"_1f%p%L7#h|'S3co=:L=nn`9W<j%P%S?lew\u001aL=nn`9W<jXz$U";
      f1527[2] = int.class;
      f1528[2] = "java/lang/Integer";
      f1527[3] = void.class;
      f1528[3] = "java/lang/Void";
      f1527[4] = "bF^N-\u000e~\\\\\u00127\u001an_\u0017Ȕ";
      f1527[5] = "\u00048\u000f\u0017,<\u0018\"\rK6(\b!FZ1;\u000ed\u001b\\*=\u0002$\u000f\u0017\r,\u001f>\u0001W9";
      f1527[6] = "\u0014ATNc=aa_Arr\u001cyLF{;t";
      f1527[7] = "LS}\u001b\u000469sv\u0014\u0015yDke\u0013\u001c0,";
      f1527[8] = "\u000e\"\u0019oVt\u0005-\b +l\u0016*\u0001i";
      f1527[9] = char.class;
      f1528[9] = "java/lang/Character";
      f1527[10] = "!G!vW\u0014*H096\u001a!C4c";
      f1527[11] = "\u0018Dj\n\u0014\u0016KHs7\u001eyLEkI\u0004F\u0019\u0002`MtC\nYuGK\u0016MRq7";
      f1527[12] = "\b\u007f\u001b\f3?\\8I\tLԺ3>\u0014OpgAzNJ*[";
      f1527[13] = ")\u0017=+s\u0003z\u001b$\u0016Rl}S>vo\b6R {\u0013V%\u0014mvc\u0000&P6\u0016";
      f1527[14] = "HaRV.u\u001c&\u0000SQͮs ]\u0015m-\u0001d\u0007\u00107\u0011I\u007f\u001c^1a\u001f|X\u0005Q";
      f1527[15] = "F7\u001dPe\u0010\u0015;\u0004mκ\u007fYq\u0001\u0006`\u000e\u0015q\u0003";
      f1527[16] = "@G(J+u\u0013K2XTw\u0010D-G4\u0013G\u001b [(w\f\u001a>VT";
      f1527[17] = "8<\u0003y\u0018Kk0\u001aDɳ$lx\u0000$\u0004@'y\u001e)x";
      f1527[18] = "JY[974\u0019UA+H9\u0017UK\u00014RM\u0005S(46\u0006\u0004M%Hl\u0010X_2%kMN\u000fH";
      f1527[19] = "=\u0001c'rvn\rz\u001aР\u0019iE`zn}\"D~w\u0012";
   }
}
