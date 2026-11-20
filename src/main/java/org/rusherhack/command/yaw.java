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
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.ValidationException;

public class yaw extends Command {
   public static long f3044 = Class066.m4320(1008906355268010629L, 392356073463206121L, MethodHandles.lookup().lookupClass()).m4325(162849600235584L);
   public static String[] f3045;
   public static String[] f3046;
   public static Object[] f3048 = new Object[34];
   public static String[] f3049 = new String[34];

   public yaw() {
      super("yaw", "Change your yaw");
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @CommandExecutor
   @CommandExecutor$Argument({"value"})
   public String m6532(double var1) {
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

      Globals.mc.player.setYaw((float)var1);
      boolean var10003 = true;
      return String.format("Set your yaw to %s", var1);
   }

   @CommandExecutor
   @CommandExecutor$Argument({"waypoint"})
   public String m6533(Class086 var1) {
      return this.m6532(RotationUtils.getRotations(var1.m4943())[0]);
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
      f3048[0] = "qi\r\u007fl\\qi\u001a#`Sk\"\u001a=`FlSNe7";
      f3048[1] = float.class;
      f3049[1] = "java/lang/Float";
      f3048[2] = void.class;
      f3049[2] = "java/lang/Void";
      f3048[3] = "`337{g|)1kasl*zȟ";
      f3048[4] = int.class;
      f3049[4] = "java/lang/Integer";
      f3048[5] = "8R\"\u0006\u000e\u0002$H Z\u0014\u00164KkŪ";
      f3048[6] = "p\u001f\u0018\u001dT`l\u0005\u001aANt|\u0006Qɇ";
      f3048[7] = "\u0006\b(J\u0013~\r\u00079\u0005nf\u001e\u00000L";
      f3048[8] = "^i!c$t+I*l5;JG!g1a>";
      f3048[9] = "EW.VDNYM,\n^ZINg\u001bYIO\u000b(\u0016_VKQ \u0017X\u0015kK \u0015WOCJ'";
      f3048[10] = "$\f+$at8\u0016)x{`(\u0015bi\u007fh.\u00108$rq\"P\u000bf|c*\u0012?";
      f3048[11] = "UOZvn\u007fUOM*bpO\u0004M4beHu\u001di3";
      f3048[12] = "STaw\n\u0007X[p8`\u0004LW{s";
      f3048[13] = double.class;
      f3049[13] = "java/lang/Double";
      f3048[14] = "f\u0007\u0011hthf\u0007\u00064xg|L\u0006*xr{=Su!";
      f3048[15] = "[\raD#\fG\u0017c\u00189\u0018W\u0014(\t>\u000bQQs\u001e8\u0015GQP\u000f#\n]\u0010h";
      f3048[16] = ")%cT4U5?a\b.A%<*\u0019*I#9pT'P/yq\u000e/L5yV\u00152A2>k\u0014\u0013T/;w";
      f3048[17] = ">la\";q>lv~7~$'v`7k#V'8e";
      f3048[18] = "Q<";
      f3048[19] = "f\u001b\u0001Bz\u0012z\u0001\u0003\u001e`\u0006j\u0002H½";
      f3048[20] = "7\u0006\u001eU,'<\t\u000f\u001aM)7\u0002\u000b@";
      f3048[21] = "yTZA;4z\u000eY~,gb\n\\\u0012\u001e1 V\u0006@I3/W[C*vg\u0015F~pja\u0006@Ayi%R;";
      f3048[22] = "~\u000f[\u001f\u0017()\u001a]\u001de\u0530D^_A]*;\u0018\u001fE\fP";
      f3048[23] = "8Sa=A+=N|2:z\u0003\u000f,-\nzdPx)H\u0013?\u0002ccSt`Vg!:";
      f3048[24] = "-9(&|\u000f!w70\u0007Xw}=0{6-9(&|\u000f!w70\u0007\u000bkv$\"vK`xeY:\b`x#`6F\u007fnX";
      f3048[25] = "M*yl}(\u001bu{>@5J2L:<3[/q;;ZM1}!,a\u0019-vc@1G-s#}'X\"t]";
      f3048[26] = "@}'wH8F{uq8s~;sjG$G7=uQ_C8=eCfOv\"s8";
      f3048[27] = "M\r^NmOH\u0010CA\u0016Եv\\HJ}\u0006\u000f\\D\u001cowKSR_mNG\u001dMI\u0016";
      f3048[28] = "5q\u0002YmQ7,\u0006W\u0004Da\u0012^X9Ec/\u0019DfO";
      f3048[29] = "\u0002V!\u0013@MRZcP0in\r`\u0006L[UY|\r\u000e7";
      f3048[30] = "[D\u0012(\n+\u0016\u000e\fou4\u0002Z\u0015>2$k\u000f\u00029\u001e;\u0012\u000f\u000eo\fJ[D\u0012(\n+\u0016\u000e\fou";
      f3048[31] = "LI>7f:\u000bUa=\u000fi\u0012Zg?X>M\u0007<Sf=\u0013\t<>\u007f\u007f\u0013\t";
      f3048[32] = "\u001c \b\u0014[\u000e\u001ad\b[e\u001au`Q[\u001aMLl\u001fD\f6Hc\u001fT\u001e\u000fD-\u0000Be";
      f3048[33] = "4\u0012\u0001\u0018\u0015 s\u000e^\u0012|sj\u0001X\u0010+$4V\u0000|\u001b#jSNB\u0018yi";
   }
}
