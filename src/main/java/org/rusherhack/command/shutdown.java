package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class shutdown extends Command {
   public static long f4852 = Class066.m4320(-6957707317922234257L, -8044897771396765728L, MethodHandles.lookup().lookupClass()).m4325(189513143961279L);
   public static String[] f4853;
   public static String[] f4854;
   public static Object[] f4856 = new Object[14];
   public static String[] f4857 = new String[14];

   public shutdown() {
      super("shutdown", "Stop the client");
      String[] var10001 = new String[]{"stop", null};
      boolean var10005 = true;
      var10001[1] = "end";
      this.addAliases(var10001);
   }

   @CommandExecutor
   public String m3909() {
      Globals.mc.scheduleStop();
      return "Stopping";
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
      f4856[0] = "Xc\u0003g5kXc\u0014;9dB(\u0014%9qEYDxh";
      f4856[1] = void.class;
      f4857[1] = "java/lang/Void";
      f4856[2] = "f)<xq\u0011z3>$k\u0005j0u5l\u0016lu89n\th5?xf\u001cj>+\"j\u000bg(u\u0015l\td:52F\u001cj>+\"j\u000bg";
      f4856[3] = "g#\u001ar\u0001 l,\u000b=|8\u007f+\u0002t";
      f4856[4] = "Ej\u0011\nYYYp\u0013VCMIsXGGEOv\u0002\nJ\\C61HDNKt\u0005";
      f4856[5] = "\u0010\u00143e\u00051\f\u000e19\u001f%\u001c\rzȈ";
      f4856[6] = "Ss~F+.Oi|\u001a1:_j7\u000b6)Y/z\u000746]o}F\u00189Ouk\t:/\u007fnt\u000585X";
      f4856[7] = "\u001d&Ls\u001d8h\u0006G|\fw\u0015\u001eT{\u0005>}";
      f4856[8] = "\u0006Q@Uf\u000b\r^Q\u001a\u0007\u0005\u0006UU@";
      f4856[9] = "F\u0011cN)W\u0012Dd@J^\u0016)1\u001e$D\u0012\u0012e\u00100";
      f4856[10] = "hcm>.\u001d+'1l^ҕS a(7@h*t5e itp>>\u001bcaml^";
      f4856[11] = "\u001a6B\u0004\t\u000eN8V{\u0003X\t9K\u00171\fHh\u0016{\u0014N\u00165I\u001e\r\u000b\bY";
      f4856[12] = "St\u0019\u007f& \u0017*B`_9\u0003}4t>9\u0014|\u0006\u0010bn\u0013/\u0005+`iV }b$3\u0003t\u0018{a-o";
      f4856[13] = "nWC\"\u0005K8K\u0019ti\u0018W\u0017\u0012l\u0000Tl\u001d\u0007qR4mC\u0003z\t\u000fgV\u001e(i";
   }
}
