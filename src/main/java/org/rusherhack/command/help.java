package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.hud.HudElement;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.command.CommandData;
import org.rusherhack.core.command.CommandUtils;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.feature.IFeature;

public class help extends Command {
   public static long f7510 = Class066.m4320(452662564117202830L, 5479890082156025460L, MethodHandles.lookup().lookupClass()).m4325(50319054181558L);
   public static String[] f7511;
   public static String[] f7512;
   public static Object[] f7514 = new Object[46];
   public static String[] f7515 = new String[46];

   @Override
   public boolean isHidden() {
      boolean var10002 = true;
      return true;
   }

   @CommandExecutor
   public String m14604() {
      Class291 var7 = Class170.f3364.m7105();
      StringJoiner var4 = new StringJoiner(", ");
      int var5 = 0;
      Iterator var8;
      Iterator var10000 = var8 = var7.getFeatures().iterator();

      while (var10000.hasNext()) {
         AbstractCommand var6;
         if ((var6 = (AbstractCommand)var8.next()).isHidden()) {
            var10000 = var8;
         } else {
            String var10001 = String.valueOf(Formatting.GREEN);
            String var10002 = var6.getName();
            var5++;
            var4.add(var10001 + var10002 + Formatting.RESET);
            var10000 = var8;
         }
      }

      Object[] var9 = new Object[]{var5, null};
      boolean var10005 = true;
      var9[1] = var4;
      return String.format("Commands {%s}: %s", var9);
   }

   public help() {
      super("help", "Shows a list of all commands");
   }

//    @CommandExecutor
//    @CommandExecutor$Argument({"feature"})
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
      f7514[0] = "k\\Zf21uT@)U0dOMss6";
      f7514[1] = "\u0003qdk\u0002M\b~u$cC\u0003uq~";
      f7514[2] = "\u001eUp8Bp\u0002OrdXd\u0012L9u_w\u0014\tty]h\u0010Is8sj\u001cJvxTH\u0010IvqUw";
      f7514[3] = "]HqhL#ARs4V7QQ8%Q.W\u0014u)S;STrh\u007f4ANd']\"qU{+_8V";
      f7514[4] = "C#\rZu\u001d_9\u000f\u0006o\tO:D\u0017h\u001aI\u007f\t\u001bj\u0005M?\u000eZD\u0007A<\u000b\u001ac,M%\u000b";
      f7514[5] = "Tb{Fh\u0010Hxy\u001ar\u0004X{2ɮ";
      f7514[6] = int.class;
      f7515[6] = "java/lang/Integer";
      f7514[7] = "r6:9\u001b>n,8e\u0001*~/sż";
      f7514[8] = "n\u001d\u0017N\u0011ar\u0007\u0015\u0012\u000bub\u0004^\u0003\u000f}d\u0001\u0004N\u0002dhA\u0005\u0014\nxrA\u001f\u0002\tqb\u001b\u0003N0ws\u0000\u001c\f\u0001us";
      f7514[9] = "q^\u00033\u0019gzQ\u0012|d\u007fiV\u001b5";
      f7514[10] = "IM5;2NUW7g(ZET|v/IC\u0011;{4^TY3v%H\bv\u001ct-^B";
      f7514[11] = "\u000e d\f\u001d3\u0010(~C\u007f/\u00175";
      f7514[12] = ";o\u0007ACZ'u\u0005\u001dYN7vNȫ";
      f7514[13] = "sH\u0002l\u0004soR\u00000\u001eg\u007fQKЏ";
      f7514[14] = "^\u00005\u001cWsB\u001a7@MgR\u0019|Ɇ";
      f7514[15] = "\u0002\u001d4k-r\u001e\u0007677f\u000e\u0004}&0u\bA0*2j\f\u00017k\u001ch\u0000\u00022+;R\u0019\u0006?6";
      f7514[16] = boolean.class;
      f7515[16] = "java/lang/Boolean";
      f7514[17] = ":A#p./&[!,4;6Xj=3(0\u001d\";=. A!p\u0015\u001c0R0+.?";
      f7514[18] = "8`$dcO$z&8y[4ym)}S2|7dpJ><%/pN\"`&drU:\u007f\"$u\u00146`$dTT4z\"$eh2t&8tT4w";
      f7514[19] = "\u0016}`t\u00125\u0016}w(\u001e:\f6w6\u001e/\u000bG%hK";
      f7514[20] = "FF\u0003r!<XN\u0019=\\=^N\u001btE&EI\u0010a";
      f7514[21] = "\t|\"\u001bRT\u0002s3T?P\u0002o\u0007\u001f\rM\u0006s7\u001f";
      f7514[22] = "\u000b0rv\\c~\u0010yyM,\u001f\u001errIvk";
      f7514[23] = "Y\fx\u0006%\u0013R\u0003iIB\u0011G\bi\u0002y";
      f7514[24] = ",o?\u001fcz'xx|{(gxB\f\"$v`9\u001fe<\u0017";
      f7514[25] = "+q\u00011z\u000e+#\rp\u001c\f&p\u0014aK[\u007f#H\rp\u000e6!\u0016ap\\:`";
      f7514[26] = "5E.Tz\u0011`I.\u0019\u001f\u0015aH^Bz\u001feRyiv\u0006e4/\u0015x\u0013l\n/NpA\f\u000f{_n\u0017u\brEvz";
      f7514[27] = "\u0016\u001b\u001f-\u0015P\u0012\u001e\u001cf)C\u0017Lxr\u0013C\u001c\u0011\u0012%W\u0015\u001e \u0015'N\u001bGZ\u0011\"MP{";
      f7514[28] = "\u0016$\u0016H,\u001cOzBE^Ȫ*\"SV \u001d\u0015nOE!s";
      f7514[29] = "\u007fSG\f[)%R\u0012R$ϭC\u0011\tSK,9K\b\u0006\u0015";
      f7514[30] = "\u001b\u0015;u,\u0010CHpxKX%\u0017vw*\u001bICds4t\u001bUnr$\u0018OGjlK";
      f7514[31] = "LY\u0011d\u001f5L\u0002\u00196\u007fj\r)\u0017a\u0013f\u0010i\u001cn\u0007p\u0015\rI1\u001a0v";
      f7514[32] = "mu!5iv+{-4\u0002`>x\u0005?gbS:?2c`?n-6}\u000f";
      f7514[33] = "sg\r\u001e~J'u\t\u0000\u0011H*a\f\u0016m&sg\r\u001e~J'u\t\u0000\u0011H.f\u0012\u0004o\u0018}'R\u007f/Z)z\u0006\u0013{H-di";
      f7514[34] = "\u0001Gs,\fvUUw2cdV_j $t?K(,\u0002~DXo4c.C_v\"\u000fpQ[hM";
      f7514[35] = "D^T\u00039,D\fXB_.I_AS\by\u0010\r\u001d?3,Y\u000eCS3~UO";
      f7514[36] = "\r\u0012(hKX\u0005\\(#4PAN zHVG#axIRC\u001cjo\u000e1";
      f7514[37] = "@\r7=55\u001a\fbcJҥ|C\u007f>r#\u0000Ok6,O";
      f7514[38] = "\u0010|xO\fD\u001e/n\u00194\u001c!+8\u0019O\n^>h\u001eNuH}=XK\n]-:Y4";
      f7514[39] = "J^\"\u001c}eETj\rB`N]v\u000f+sN`j\u0013>fS\u007fz\u000e>\u000f\u0018Ua\u0004/v\u001f\\{\u001cBe@C`\u0016&0\u001f^ u(l[@x\u0011}3F\u0000\u001bEs}XDrM=}\u0013;";
      f7514[40] = "rlR$N`r7Zv.1% s$K3HbI)O1.6[-Q^";
      f7514[41] = "\tc5\u00036$_u\"TI!\u000fn4W\u000e1f63D71Yz/W6_\tc5\u00036$_u\"TI";
      f7514[42] = "S\u0000\u0006>z%X\u0017A]ds\u0013-\u0016-x\u001a\u0002\b\u0003&g~WW\u001ef\u0004";
      f7514[43] = "\tg\u0005u&t\\k\u00058Cp]jpi*cMlS\u007fC/\u0001dE{*'Od\u000e\u0004";
      f7514[44] = "(\rC[8_$\r\u0005\u000e\\P/\u000es_'T8\u0013GN=X.r\u0001N8^-\u001eU\\<@B";
      f7514[45] = "QyJjw4Y&\fg\n!=}MokbQ)_ku\r\u0003?UjeaW-Qt\n";
   }
}
