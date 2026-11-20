package org.rusherhack.core.command.exceptions;
import org.rusherhack.*;

public class ArgumentException extends CommandException {
   public static Object[] f1516 = new Object[7];

   public ArgumentException(String var1) {
      super(var1);
   }

   @Override
   public boolean shouldPrintSyntax() {
      if (this.getContext() != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public ArgumentException(String var1, Throwable var2) {
      super(var1, var2);
   }

   static {
      m194();
   }
   public static void m194() {
      f1516[0] = "\u0004m\u0019y\\K\u0018w\u001b%F_\btP4AL\u000e1\u001d8CS\nq\u001ayKF\bz\u000e#GQ\u0005lP\u0016\\Y\u001er\u001b9Z{\u0013|\u001b'ZW\u0004q";
      f1516[1] = "s*P>\u0012Ho0Rb\b\\\u007f3\u0019ɤ";
      f1516[2] = "\u001d\tZS-\"\u0001\u0013X\u000f76\u0011\u0010\u0013\u001e0%\u0017U^\u00122:\u0013\u0015YS:/\u0011\u001eM\t68\u001c\b\u0013>0:\u001f\u001aS\u0019\u001a/\u0011\u001eM\t68\u001c";
      f1516[3] = "t\u0017^\u0013\u0001Dh\r\\O\u001bPx\u000e\u0017^\u001cC~KZR\u001e\\z\u000b]\u0013\u0003Ct\u0006\\N\u0000Xu\u0002\u0017~\u001c\\v\u0004WY#Ct\u0006\\N\u0000Xu\u0002jT\u001dZ";
      f1516[4] = "\r\u0012\u0010%[.\u0006\u001d\u0001j: \r\u0016\u00050";
      f1516[5] = "lj\u0002&>M?uL4ZL8vw<<_8z@[`A?5L??]<5<";
      f1516[6] = "\u0000<pWNE\u0010w->\u001e#[8wS\u000b\u001d\u0005:3\u0006w\u001a_? BID]{u>";
   }
}
