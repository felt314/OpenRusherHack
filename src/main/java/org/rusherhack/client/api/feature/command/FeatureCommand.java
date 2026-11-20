package org.rusherhack.client.api.feature.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class FeatureCommand extends Command {
   public IFeatureConfigurable f546;
   public static boolean f547;
   public static long f548 = Class066.m4320(5235079507022176642L, -5754219746663139613L, MethodHandles.lookup().lookupClass()).m4325(236954679216253L);
   public static String[] f549;
   public static String[] f550;
   public static Object[] f552 = new Object[32];
   public static String[] f553 = new String[32];

   @Override
   public boolean isHidden() {
      boolean var10002 = true;
      return true;
   }

   @CommandExecutor
   @CommandExecutor$Argument({"setting", "value"})
   public IFeatureConfigurable getFeature() {
        return null;
    }

   public FeatureCommand(IFeatureConfigurable var1) {
    }

   public static void m1250(boolean var0) {
      f547 = var0;
   }

   public static boolean m1251() {
      return f547;
   }

   public static boolean m1252() {
      boolean var0 = m1251();
      return !var0;
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
      f552[0] = "X\f\u0019\u0016dJF\u0004\u0003Y\u0005OF\u0004\u0000\u0019+S";
      f552[1] = "L5rKx3G:c\u0004\u0019=L1g^";
      f552[2] = "L2[GlEG=J\b\u0000FI?HG,";
      f552[3] = boolean.class;
      f553[3] = "java/lang/Boolean";
      f552[4] = "\u0005kR\u007fir\u0019qP#sf\tr\u001b2tu\u000f7F4os\u0003wR\u007fHb\u001em\\?|";
      f552[5] = void.class;
      f553[5] = "java/lang/Void";
      f552[6] = "%J\u0003\u0001+k.E\u0012NVs=B\u001b\u0007";
      f552[7] = "8]\u001a\u0002OZ$G\u0018^UN4DSOQF2A\t\u0002\\_>\u0001\u001bI\\[\"]\u0018\u0002^@:B\u001cBY\u0001\u0011J\u001cXH]2l\u0012APN9K";
      f552[8] = "V:\u0002!EhJ \u0000}_|Z#Kɻ";
      f552[9] = "!K?vy#=Q=*c7-Rv;g?+W,vj&'\u0017>=j\";K=vh9#T96ox\rV55j8*";
      f552[10] = "\u001cS0\u0012,.\u0000I2N6:\u0010Jy_22\u0016O#\u0012?+\u001a\u000f1Y?/\u0006S2\u0012=4\u001eL6R:u\u0012S0\u0012\r>\u0007U>R9\r\u0012M\"Y";
      f552[11] = "(Oz\u0012\u0007H4UxN\u001d\\$V3_\u001aO\"\u0013nY\u0001I.Sz\u00120S2PNY\u0001I.Sz";
      f552[12] = "MN:*\u007f QT8ve4AWsgb'G\u0012;al!WN8*D\u0013G])q\u007f0aS3bd2WN<fa0";
      f552[13] = "&\u001cmO\u0016\u007fS<f@\u00070.$uG\u000eyF";
      f552[14] = "g]\u0000\u000bp~\u0012}\u000b\u0004a1oe\u0018\u0003hx\u0007";
      f552[15] = "\rtxd\u0007<Te-\r\u0002(J\u000f+0\u0000,Ubwb\t/6";
      f552[16] = "P2\"%h=\t5f'\u001a;\u00007g+]+iip9 y\u0011:*?!EP2\"%h=\t5f'\u001a";
      f552[17] = "E\u0002\u001d\u0017[\u0001EQRU4\u0001\u0013O|BP\u0007\u00133\u001b\u0016Y\u0013\u001d^GDP\u0010~\bAPF\u001dN\bE[\u000fz";
      f552[18] = "U]-\u001a\u0019\u0005U\u000ebXvԟn\u0005~I\u0011C\u0011V+CL~";
      f552[19] = "\u0007[HmS\u0016\u0007\b\u0007/<\u0002Q\u0016;0G\u0015X\u0003\u0006\u000fU\tA\u0007wmX\u0003\u0000[\n4\\T\\j";
      f552[20] = "G[M)x7\u0002\tM&\u00005z[P.:>K\u0016E.<YG\u001aJrgh\n\u000fJt\u0000";
      f552[21] = "~\u000eLl33#KF~Iŋ@L\\}sd8\u001f\u0006{rX";
      f552[22] = "B_@>2MB\f\u000f|]Y\u0014\u00129k8[yR\u001bla\u0007\u0004\u000b\u001f;=6";
      f552[23] = "Nb^\u001a\u0004B\u0017s\u000bs\u000f@8|L\u000f\u001f;OsKIRC\u001c)MHn";
      f552[24] = "Re{W9&R64\u0015V&\u0004(\u001a\u00022 \u0004\u0013.\tVdT9-\b;8\u00060.km>\u0012&#[m:\u0019oD";
      f552[25] = "x?\fC')!8HAU;&9PM<7\u001f7P]8Q{4K\u001ai)(nM\u001bU";
      f552[26] = "\u001bz0W]\b\u0015xwD'\u0013M|rF'T\u0019ufHJ\bK|e+";
      f552[27] = "JMrs2\u0018\u000f\u001fr|Jղw@a{!\u0007\u0014\nun7";
      f552[28] = "nO{e+Fn\u001c4'D͂U\u0017(6#\u0000*D}<~=n\u001d?+#\rn\u00194bD";
      f552[29] = "hv\u000fM\u0000yh%@\u000fom>;n\u0018\u000b\u007f>G\tL\u0002k0*U\u001e\u000bhS";
      f552[30] = "y[\u000b%wn<\t\u000b*\u000fȢD\\\u0000;5<<\u000fZ=4\u0000\u007f\u0005\u00116h0\u007f\u0001\u001a\u007f\u000f";
      f552[31] = "\u0015\fo8P_D\t2:.PC_,5K\\CHVcMJWSfcIA\u001e4";
   }
}
