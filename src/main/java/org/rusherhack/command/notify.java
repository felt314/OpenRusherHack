package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.module.Module;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
public class notify extends Command {
   public static long f6172 = Class066.m4320(-6170572886439975472L, 2725124670906141420L, MethodHandles.lookup().lookupClass()).m4325(12667390702319L);
   public static String[] f6173;
   public static String[] f6174;
   public static Object[] f6176 = new Object[20];
   public static String[] f6177 = new String[20];

   public notify() {
      super("notify", "Toggles module toggle notifications");
   }

   @CommandExecutor
   @CommandExecutor$Argument({"module"})
   public String m12273(Module var1) {
      boolean var10001;
      if (!var1.areNotificationsEnabled()) {
         var10001 = true;
         boolean var10003 = true;
      } else {
         var10001 = false;
         boolean var5 = true;
      }

      var1.setNotifications(var10001);
      Object[] var4 = new Object[]{var1.areNotificationsEnabled() ? "Enabled" : "Disabled", null};
      boolean var10005 = true;
      var4[1] = var1.getName();
      return String.format("%s %s's notifications", var4);
   }

   static {
    }
   public static String m117(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
   public static void m157() {
      f6176[0] = "U\u0003l/\u0002OI\u0019ns\u0018[Y\u001a%դ";
      f6176[1] = "q\u0010oO4-z\u001f~\u0000I5i\u0018wI";
      f6176[2] = "\u001ff=\u0011%\u0000\u0003|?M?\u0014\u0013\u007ft\\;\u001c\u0015z.\u00116\u0005\u0019:<Z6\u0001\u0005f?\u0011:\u001a\u0014a6Zy8\u001fp/S2";
      f6176[3] = boolean.class;
      f6177[3] = "java/lang/Boolean";
      f6176[4] = void.class;
      f6177[4] = "java/lang/Void";
      f6176[5] = "rcO\r\u0012WnyMQ\bC~z\u0006ȥ";
      f6176[6] = int.class;
      f6177[6] = "java/lang/Integer";
      f6176[7] = "y\u0000zh3^\f qg\"\u0011m.zl&K\u0019";
      f6176[8] = "\u0005C\u0002S`F\u0019Y\u0000\u000fzR\tZK\u001e}A\u000f\u001f\u0006\u0012\u007f^\u000b_\u0001SwK\tT\u0015\t{\\\u0004BK>}^\u0007P\u000b\u0019WK\tT\u0015\t{\\\u0004";
      f6176[9] = "\u001b\u0004\u001cqNX\u0007\u001e\u001e-TL\u0017\u001dUϱ";
      f6176[10] = "TPY;\"2HJ[g8&XI\u0010ɡ";
      f6176[11] = "-\u0011Y&#X&\u001eHiBV-\u0015L3";
      f6176[12] = "g\tDt\u001b\bu\u000e\u001e\u000eȿt4HDoE\ta@\u0016g|M5O\u001a7\u0001\u0018=\u001d\u0012\u000e";
      f6176[13] = "\r!\u001cT^RIy[HaDZd W\u001d^Yy\rY\u001d^P~\u001d0[\u0004U&[\n\u0013][uf\u000bY\u0007Wq\u0000\u0001\u001aO\r\u0018";
      f6176[14] = "\u0016-Q\u001fy7Q.\u0012AIԷ-t\u000fC)o\u00172\nQ7W";
      f6176[15] = "wH!wW-3\u0010fkh/ \r\u001dz\r-MHc,\ty0\u001dk~\u0001@";
      f6176[16] = "\u000e\u001b\u000fO\u001f\u0014[\u0013]G&\u0007PYUGZi\u000e\u001b\u000fO\u001f\u0014[\u0013]G&UF[\u000bO_\u000f\u000eBS.\u001fQ\bB\tSJYZJ0";
      f6176[17] = "NwuLw\u0017\n/2PH\u0013\u000e#IO4\u001b\u001a/dA4\u001b\u0013(te.\u0013\u001e*bDH@O,1\u0015r\b\u0016\"b(";
      f6176[18] = "[dz\u0013\to\tbiOu2e`<A\u0014'\u001854\u0013\u001c\u001e\\a;\u001fLc\tii\u0017u";
      f6176[19] = ">f\u00133m\u001fz~\u00143\u0004\u0013\u0000$G;9\u001bjw\u0001/oz?\"\u0015me\u0010ld\u0001;\u0004";
   }
}
