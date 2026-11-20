package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

public class Testing_command extends Command {
   public boolean f2757;
   public static long f2758 = Class066.m4320(-7318499292672775395L, -1504609294818343012L, MethodHandles.lookup().lookupClass()).m4325(214534060216969L);
   public static String[] f2759;
   public static String[] f2760;
   public static Object[] f2762 = new Object[4];

   public Testing_command(String var1) {
      super(var1, "Testing command");
      this.f2757 = true;
   }

//    @CommandExecutor
//    @CommandExecutor$Argument({"enum"})
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
      f2762[0] = "=uQ6&U!oSj<A1l\u0018O";
      f2762[1] = "g#k\u0012cDl,z]\u001e\\\u007f+s\u0014";
      f2762[2] = "S9\u000ed\u0011(X6\u001f+p&S=\u001bq";
      f2762[3] = "1G\u0001L\u000b\u0016<\u001a\u001e}\u000b\u00150Jc\u0001\u0012L)\u001d\u000f\u0001]EU";
   }
}
