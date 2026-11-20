package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.hud.TextHudElement;

public class PlayerCount extends TextHudElement {
   public static long f6874 = Class066.m4320(-3303735743891359835L, -7490247177095194125L, MethodHandles.lookup().lookupClass()).m4325(213189830469609L);
   public static String[] f6875;
   public static String[] f6876;
   public static Object[] f6878 = new Object[16];
   public static String[] f6879 = new String[16];

   @Override
   public String getLabel() {
      return "Players";
   }

   public PlayerCount() {
      super("PlayerCount");
   }

   @Override
   public String getText() {
      return String.valueOf(Globals.mc.player.networkHandler.getPlayerList().size());
   }

   static {
    }

   public static String m221(byte[] var0) {
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
   public static void m273() {
      f6878[0] = "=R[F=h!HY\u001a'|1K\u0012ɖ";
      f6878[1] = "?\u001a\u001d\u001ef}4\u0015\fQ\u001be'\u0012\u0005\u0018";
      f6878[2] = "[\u0001h\t\u001d\u0018E\trFp\u0002]\f{\u000bG\u0004^\u000e";
      f6878[3] = int.class;
      f6879[3] = "java/lang/Integer";
      f6878[4] = "bw.\u0000}\u0018bw9\\q\u0017x<9Bq\u0002\u007fMl\u001d$";
      f6878[5] = "P\r4x\b\u0006L\u00176$\u0012\u0012\\\u0014}5\u0016\u001aZ\u0011'x\u001b\u0003VQ\u0014:\u0015\u0011^\u0013 ";
      f6878[6] = "J\b=9e\u0014J\b*ei\u001bPC*{i\u000eW2z&8";
      f6878[7] = "fA]zMSfAJ&A\\|\nJ8AI{{\u001e`\u0016";
      f6878[8] = "Y6%#spR94l\u0012~Y206";
      f6878[9] = "L \u0013m\fRI;\u001c|rP\u001cEPf\u0011L\u0014\u007fQ;N_";
      f6878[10] = "\u0014miV\u007f\u001dJu%@\r\u001dLm9&7\u0006@x&J1V_|T";
      f6878[11] = "\u0000q4fA\u000f\u000b%}6;\bV7%8W:\u0001{ug;TIv5-@\nQ:#_";
      f6878[12] = "w\u000e\u00105\\\u00051\u0001Uf'\u0001'\u0006\u0013f`\u0011NX\u000ef@\r\"^^yD\u007fw\u000e\u00105\\\u00051\u0001Uf'";
      f6878[13] = "\r)*A>\"M+-pɗ\u0013\u000b?hN/iM0-\u001dT*^-(\u000b.lQh{p";
      f6878[14] = "7&v[\r\\6{)Hn\bj+qN9_4|)\"S_2)z\u001d\u0012\u001fux";
      f6878[15] = ")\u0015:=u@hU}l\u001a\u0011uAg>MD%\u0010?R!Ee\u0015y0*\u0011,E";
   }
}
