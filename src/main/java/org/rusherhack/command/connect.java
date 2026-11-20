package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.ServerInfo.ServerType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

public class connect extends Command {
   public static long f4931 = Class066.m4320(-4101577308421113566L, -4423902801145329752L, MethodHandles.lookup().lookupClass()).m4325(138178002174996L);
   public static String[] f4932;
   public static String[] f4933;
   public static Object[] f4935 = new Object[37];
   public static String[] f4936 = new String[37];

   @CommandExecutor
   @CommandExecutor$Argument({"server"})
   public String m10011(String var1) {
      if (Globals.mc.world != null) {
         Globals.mc.world.disconnect();
      }

      Globals.mc.send(() -> {
         ConnectScreen.connect(Globals.mc.currentScreen, Globals.mc, ServerAddress.parse(var1), new ServerInfo("server", var1, ServerType.OTHER), false, null);
      });
      boolean var10003 = true;
      return String.format("Attempting to connect to %s", var1);
   }

   public connect() {
      super("connect", "\u001d100;=*~*1*Jservers");
      String[] var10001 = new String[]{"join", null};
      boolean var10005 = true;
      var10001[1] = "server";
      this.addAliases(var10001);
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
      f4935[0] = "Q\u0013Q#\u0019fM\tS\u007f\u0003r]\n\u0018ը";
      f4935[1] = "`M:RN\fkB+\u001d3\u0014xE\"T";
      f4935[2] = "'<fa_\u0006;&d=E\u0012+%/,A\u001a- uaL\u0003!`t&\u00036$+l*C\u0007\n/r*";
      f4935[3] = "PUkfRDLOi:HP\\L\"+OCZ\to'M\\^IhfaSLS~)CE|Ha%A_[";
      f4935[4] = "\u0015\u0006\u0010;I\u0005`&\u001b4XJ\u001d>\b3Q\u0003u";
      f4935[5] = void.class;
      f4936[5] = "java/lang/Void";
      f4935[6] = "qRP3BFmHRoXR}K\u0019ɔ";
      f4935[7] = "vHm\u0019Y\u001bjRoEC\u000fzQ$Ƀ";
      f4935[8] = "@M\u0000)ex\\W\u0002u\u007flLTIȁ";
      f4935[9] = int.class;
      f4936[9] = "java/lang/Integer";
      f4935[10] = "$=\f/I2Q\u001d\u0007 X}0\u0013\f+\\'D";
      f4935[11] = "_ \u0017dE\u0012_ \u00008I\u001dEk\u0000&I\bB\u001aP{\u0018";
      f4935[12] = "\u0000)\u0018h\nQ\u000b&\t'vH\u0004&\u000fkHX";
      f4935[13] = "s`^\\g<oz\\\u0000}(\u007fy\u0017\u0011y y|M\\t9u<~\u001ez+}~J";
      f4935[14] = "\u000eI[a(V\u000eIL=$Y\u0014\u0002L#$L\u0013s\u0019|}";
      f4935[15] = "R\n\u0018xATR\n\u000f$M[HA\u000f:MNO0Zb\u001e\u0019_\u0003\r%_b\u0004Y[n";
      f4935[16] = "++Jw8\u0016++]+4\u00191`]54\f6\u0011\bjl";
      f4935[17] = "L(3P$tL($\f({Vc$\u0012(nQ\u0012sO{";
      f4935[18] = "px.t\u0012\fpx9(\u001e\u0003j396\u001e\u0016mBniH";
      f4935[19] = "\u0017\\\u0006\u0006\u0016I\u0017\\\u0011Z\u001aF\r\u0017\u0011D\u001aS\nfD\u001cI";
      f4935[20] = boolean.class;
      f4936[20] = "java/lang/Boolean";
      f4935[21] = "M\rN:\u007f\u0015M\rYfs\u001aWFYxs\u000fP7\u0003%#N";
      f4935[22] = "\u0006[E\u0001?,\rTTN^\"\u0006_P\u0014";
      f4935[23] = "l\u0014\u000f\u0001\u0016\u0010i\n\u001aoɮ}v^C\u001fK\u001eo\u001e@oUL2\u001f\u0019\fL\f1o";
      f4935[24] = ">#\u0004\u000eI+nm\\Ep(6?^\u0013'zjl\u0003Fp/&lKF\u001d\u007fh4\u0000";
      f4935[25] = "?W4\u000ejMdD-\u0015\u0007\u001c\u0003\u0003vXwD`Nu\u000euu>\u0005p\u00156\u0016s\u0006&\u0017\u0007";
      f4935[26] = "U\u001deUHR\f\u0019,\b:Ռk\u001fwR\u0001R\n\\\u007f\u001b\u0006,";
      f4935[27] = "!k\u0016\u001c\u0000#}q\u0015A=>\u0018qG\u0019Mt{h\u0007\u001a=j)5\u0006C^si6v";
      f4935[28] = "\u0012[sn>p\u000b\u001bp\u001e6t\u0010\u000f&bXk[V?x;r\u001bUO!`v\tV%|:-\nj7/dc\f\t.og\u0013";
      f4935[29] = "\u001ao\u001bH\u000fJ\u00137\u0000^e\u0012Gz\u0006_\t \u00136V\u0005Uw\u001adZ\\UI\u0012v_FeK\u0016k\u0003\u0000\u0003\u0011\u00148\\8";
      f4935[30] = "gp\b:\u0010+s)\u0000,|~`0Q9\u0010L7}\ff|c<pA8\u001fz|s14@\"i \u0001 \u0019*\u007fL";
      f4935[31] = "\t\u0007*\u0011{f\bA/\u001b\u0005y\u000e\u0004s\u000eiKXF#V:\u001c\b\tjPg \u001c@-\u0017\u0005,\n\u0005c\u00038%R\u001euio Z\u001c\u007fY{yR\n\u0013\u0005:\u007f\fA~Rtz\u0003x~\bnf\f\u001f#\u000f`{c\u0015p\u0007|%[\u0004,\u0013k\u001c_D~\f=z\u0005F-S\u0005";
      f4935[32] = "D]r([\u0013\u0017]qz#\b\u001eg=|^\u001d\u001fZ4$E\u000b";
      f4935[33] = "MNI1H\u0003D\u0016R'\"P\u001cJP-u\u0007B\u001a\tAIO\u0004\u001eV}]\u0006CY";
      f4935[34] = "sz\u0017\u0010{\u0017%~\u000eM\u0011Hw9\rJ}z*xW\u0010\u0011\u0011&(\b\u0015wK${W-";
      f4935[35] = "uW\u0017`,s4CJ4G~#_ei&~4^W\r|-\u007f_Jk=t=\u000f,1{z*\u000bJky)u3";
      f4935[36] = ")\u0016;\u0015\u0003F N \u0003i\u0015x\u0012\"\t>B'Oye\u0000DcB,_V@z\u001f";
   }
}
