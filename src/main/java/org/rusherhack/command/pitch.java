package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.ClientPlayerEntity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;

public class pitch extends Command {
   public static long f9615 = Class066.m4320(-6025734097193652616L, -1956287258292898773L, MethodHandles.lookup().lookupClass()).m4325(180546053984428L);
   public static String[] f9616;
   public static String[] f9617;
   public static Object[] f9619 = new Object[27];
   public static String[] f9620 = new String[27];

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"value"})
   public String m18416(double var1) {
      label22: {
         if (Globals.mc.world != null) {
            ClientPlayerEntity var10000 = Globals.mc.player;

            try {
               if (var10000 != null) {
                  break label22;
               }
            } catch (Class316 var6) {
               throw m116(var6);
            }
         }

         try {
            throw new IllegalStateException("You must be in-game to use this command.");
         } catch (Class316 var5) {
            throw m116(var5);
         }
      }

      Globals.mc.player.setPitch((float)var1);
      boolean var10003 = true;
      return String.format("Set your pitch to %s", var1);
   }

   public pitch() {
      super("pitch", "(\u0003^\u000bnge your pitch");
   }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
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
      f9619[0] = "F\rM^AbZ\u0017O\u0002[vJ\u0014\u0004\u0013\\eLQH\u0019]s\u0007=C\u001eWZH\u0011K\u0017Vek\u001eY\u0015";
      f9619[1] = "\\3;B\u001b,W<*\rf4D;#D";
      f9619[2] = "*F[<\u001b\u001f6\\Y`\u0001\u000b&_\u0012Ȕ";
      f9619[3] = int.class;
      f9620[3] = "java/lang/Integer";
      f9619[4] = "!\u000054\u000fnT >;\u001e!5.50\u001a{A";
      f9619[5] = ":d5\u0012Q3&~7NK'6}|Ճ";
      f9619[6] = "\u001e4\u001b\u001d&^\u0002.\u0019A<J\u0012-Rɇ";
      f9619[7] = "wh(\u001f\u001cfwh?C\u0010im#?]\u0010|jRk\u0005G";
      f9619[8] = float.class;
      f9620[8] = "java/lang/Float";
      f9619[9] = void.class;
      f9620[9] = "java/lang/Void";
      f9619[10] = "F8K4O^Z\"IhUJJ!\u0002yQBL$X4\\[@dkvRIH&_";
      f9619[11] = "YuY\u0017\u001egYuNK\u0012hC>NU\u0012}DO\u001e\bC";
      f9619[12] = "\u000f\u0006GVD\u001d\u0004\tV\u0019.\u001e\u0010\u0005]R";
      f9619[13] = double.class;
      f9620[13] = "java/lang/Double";
      f9619[14] = "\rl\u0002\u0007=O\rl\u0015[1@\u0017'\u0015E1U\u0010V@\u001ah";
      f9619[15] = "\u0014\u0018qrk\u0018\b\u0002s.q\f\u0018\u00018?v\u001f\u001eDc(p\u0001\bD@9k\u001e\u0012\u0005x";
      f9619[16] = "#:If\u0000<(5X)a2#>\\s";
      f9619[17] = "(I\u001a~f1rO\t.Ynx\t\u0007s5\\.K[)f\u000b(\u0004\u0016wh5\u007f\u0005\u0006\u007fY5r\u0015\u001d*absH\u001d\u0014";
      f9619[18] = "\u0010\"ab\u0000)\u001e'pjetDI3z\u0007jW;4{\u001di";
      f9619[19] = "}i~\u0001\u0015\f$8.>Xa1;$OD\u0004!?5>\u0005X!su[\u0015\\0\u0002";
      f9619[20] = "teU\u0006:Tr6E\u001b\u0006\u0557NeWWt\t%>\u0004\u001b`7";
      f9619[21] = "CS a;IB\u0010xa\u0007[\u001aMci@Ks\u0018#;>B\u001dFof6%CS a;IB\u0010xa\u0007";
      f9619[22] = "O\u0012\u0015J\u0000F_\u0016\u0004;^DDN\u001dG0R\u0007J\u0005\u000bUB\u0003[t\u0000\b\u001d@M\u0018ZU\u0019A+\u0005\u0002QR\u000eN\u0015\u0006@#";
      f9619[23] = "*e~\u001aWi a1H-d\u0011:jF@dpkjES\r-bmHDl|bn[-";
      f9619[24] = "8\u0019\u001fN3s?\u0018\u0005MKof\r\u0019Y\u001c89PB5zq8\u001d\u0005\u000e3qu\u0007";
      f9619[25] = "\u0002U}u\u0007k\u0019B<u~9k\\uj\u000f%\u000eLq{~dRL=;\u001btV]L";
      f9619[26] = "yHA\u0004\u0006\u0019~I[\u0007~\u0005'\\G\u0013)Ry\u000b\u001f\u007fCW;[\u001cE\u0019Q(\u000b";
   }
}
