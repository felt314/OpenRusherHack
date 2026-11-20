package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Util040;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class reload extends Command {
   public static long f7417 = Class066.m4320(8503158445637654422L, -5564748863017288243L, MethodHandles.lookup().lookupClass()).m4325(54173902515164L);
   public static String[] f7418;
   public static String[] f7419;
   public static Object[] f7421 = new Object[16];
   public static String[] f7422 = new String[16];

   public reload() {
      super("reload", "Reloads RusherHack");
   }

   @CommandExecutor
   public void m14407() {
      if (Globals.mc.currentScreen instanceof Util040) {
         Globals.mc.currentScreen.close();
      }

      Globals.mc.send(Class170::m6358);
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
      f7421[0] = "2\u000b]\u0013Kn.\u0011_OQz>\u0012\u0014Ȼ";
      f7421[1] = int.class;
      f7422[1] = "java/lang/Integer";
      f7421[2] = "j+E'5=j+R{92p`Re9'w\u0011\u00028h";
      f7421[3] = "c{s\u001f:6htbPF/gtd\u001cx?";
      f7421[4] = void.class;
      f7422[4] = "java/lang/Void";
      f7421[5] = "&\u000eh\u001b8\u0001:\u0014jG\"\u0015*\u0017!V&\u001d,\u0012{\u001b+\u0004 RHY%\u0016(\u0010|";
      f7421[6] = "a\u0000ww\u001a\na\u0000`+\u0016\u0005{K`5\u0016\u0010|:7j@";
      f7421[7] = "TZ0l\u0015*H@20\u000f>XCyѽ";
      f7421[8] = "/<[-d[3&Yq~O#%\u0012ɷ";
      f7421[9] = "Xx\u0001\u001b~\u001bSw\u0010T\u001f\u0015X|\u0014\u000e";
      f7421[10] = "'MlC\u0015\u000e%K Wr\u0000w+%MM\u0014qF%MN\\";
      f7421[11] = "\u0019*TY\u000ev\u0019*W\u0011cuA'\u000fD4\"\u001fwV(_%Ew\u0005M\u0013{Q#";
      f7421[12] = ",+v}H[vn$\u0011Ց0~9! TB\u007f-5*1";
      f7421[13] = "E?M<SQ\u001a3Q:5Dyq\u0015*L@\u0016rM4\u000e-GvU*XBD.Kh5";
      f7421[14] = "w{V\u0019.#;%BM@#&9SC,\u0011qx\u000f\u001dqFq>\\\u001f)*\"\u007fB\\@";
      f7421[15] = "\u00052t\u001c\u0004(\u00052wTi Q.+\n\u0005\u0012\u0005b{PYE\u00065;\u0010\u0018yWot\u0016i\u007fG=p\u0004\u0005,\u0006#3m";
   }
}
