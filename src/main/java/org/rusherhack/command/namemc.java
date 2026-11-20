package org.rusherhack.command;
import org.rusherhack.*;

import java.awt.Desktop;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

public class namemc extends Command {
   public static long f8446 = Class066.m4320(6383933004205991269L, -6785761917867328665L, MethodHandles.lookup().lookupClass()).m4325(2474734644041L);
   public static String[] f8447;
   public static String[] f8448;
   public static Object[] f8450 = new Object[23];
   public static String[] f8451 = new String[23];

   public namemc() {
      super("namemc", "Opens up a namemc window with the provided name");
      String[] var10001 = new String[]{"name", null, null, null};
      boolean var10005 = true;
      var10001[1] = "nmc";
      var10001[2] = "names";
      var10001[3] = "oldnames";
      this.addAliases(var10001);
   }

   @CommandExecutor
   @CommandExecutor$Argument({"player"})
   public String m16193(PlayerReference var1) {
      PlayerReference var5 = var1;

      try {
         Desktop.getDesktop().browse(URI.create("https://namemc.com/profile/" + var5.name()));
         return "Opened browser";
      } catch (IOException var4) {
         boolean var10004 = true;
         Class170.f3346.error("Failed to open browser", var4);
         return "Failed to open browser";
      }
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
      f8450[0] = "E\u000f\u0012\u0000(gY\u0015\u0010\\2sI\u0016[M6{O\u0013\u0001\u0000;bCS\u0000GteC\u0013\u0011A-<I\u0012\u001bZ?j^S6A4fO\u0005\u0001o9fC\u0012\u001b";
      f8450[1] = "B7\u0011&TvI8\u0000i)nZ?\t ";
      f8450[2] = "DZQWdmX@S\u000b~yHC\u0018\u001azqNFBWwhB\u0006C\u00108oBFR\u0016a6|AX\u001dyohGX\rsv_`W\u0017rtNZt\u0018e}";
      f8450[3] = "~AK\u0016\u0000,b[IJ\u001a8rX\u0002[\u001d+t\u001dOW\u001f4p]H\u00163;bG^Y\u0011-R\\AU\u00137u";
      f8450[4] = " FJ!*2UfA.;}(~R)24@";
      f8450[5] = void.class;
      f8451[5] = "java/lang/Void";
      f8450[6] = "\u0006PH\tSe\u001aJJUIq\nI\u0001Ō";
      f8450[7] = "JFT&IrV\\VzSfF_\u001dkTu@\u001a_g\\`LZT&whBSVz";
      f8450[8] = "d\u0014\u0001kCWk\u0001Y_?p";
      f8450[9] = "\u001chU\u001d}\u0007\u0001}\r86\u0015\u001d}L\f";
      f8450[10] = "R#~|C9N9| Y-^:71^>X\u007fu=V+T?~|x\u0000R6";
      f8450[11] = "Ba\u0003N\u0004X7A\bA\u0015\u0017VO\u0003J\u0011M\"";
      f8450[12] = "B>X\u001d4@^$ZA.TN'\u0011P*\\H\"K\u001d'EDbYV'AX>Z\u001d%Z@!^]\"\u001bL>X\u001d\u0016YL5ZA\u0014PK)MV(VH";
      f8450[13] = "kh0'1\t`g!hP\u0007kl%2";
      f8450[14] = "|b\\KFO/<L\u0007+H@9ROL\u00139;S\n@";
      f8450[15] = "\\\u001aR\rl9][\u0003]\u0013-\u0018N\u0003K~F\u0019QPO**\u001b]R7-\u007fZ\u0019\u0015H,>\u000bIj";
      f8450[16] = "\"?s*]\u000ee05\":\u0003f11>Wi\"ov\u007fE\u0016#.'/:U'.>=C\u0014`1 E";
      f8450[17] = "lM\u0005c\u0001+zTV^UT}E\u0000&@8\u007fI\u0002^\u0002&<O\u00032\u0000*>7";
      f8450[18] = "!B\u0015\u0006v7'\u0001F\u000fMj\u0018C_G5\u007ftASEM=j\u0002UD!?f\u0000-";
      f8450[19] = "C\u0000EN\fh\u0012\u0012@]r>\u0015\u0007t@\u0013>\u0002\u0006F$Ig\u000b\n\u0004\u0018\u001d:B\u000b=\u0018I/\t\u0013DY\u000e0\u0017k";
      f8450[20] = "\u0019}vfL(W(0k!~\\8nu!hTxq6MjXz\t?\u001f/M\"lm]t\u001aB54Yc^;tsF}&";
      f8450[21] = "eS\u0017\u0014h\u001f\"\\Q\u001c\u000f\u00176Ff\u0016t\u001b']R{1\u0011fUM\u001cv\u001e ]*";
      f8450[22] = "X\u001e\u0007'0fYCY$J8\u0001\u0016V\u001d1,R\u000b\u0002q3 Ps";
   }
}
