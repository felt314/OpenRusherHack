package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.interfaces.IToggleable;

public class toggle extends Command {
   public static long f2158 = Class066.m4320(1280808492014183298L, -8919032569658333165L, MethodHandles.lookup().lookupClass()).m4325(61221910257141L);
   public static String[] f2159;
   public static String[] f2160;
   public static Object[] f2162 = new Object[26];
   public static String[] f2163 = new String[26];

   @CommandExecutor
   @CommandExecutor$Argument({"feature", "state"})
   public toggle() {
      super("toggle", "Toggle features on/off");
      this.addAliases("t");
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
      f2162[0] = "\u0001H\u0016b\"\u0010\u001dR\u0014>8\u0004\rQ_/?\u0017\u000b\u0014\u0012#=\b\u000fT\u0015b\u0011\u0007\u001dN\u0003-3\u0011-U\u001c!1\u000b\n";
      f2162[1] = "d(w\u001e&c\u0011\b|\u00117,l\u0010o\u0016>e\u0004";
      f2162[2] = void.class;
      f2163[2] = "java/lang/Void";
      f2162[3] = "Rj\\Q$[Np^\r>O^s\u0015\u001c:GXvOQ7^T6]\u001a7ZHj^Q5APuZ\u00112\u0000\\j\\Q\u0006B\\a^\r\u0004K[}I\u001a8MX";
      f2162[4] = "Vn/xM\u0017]a>70\u000fNf7~";
      f2162[5] = "\rpQ1\u0004Q\u0013xK~eT\u0013xH>KH";
      f2162[6] = "|U|DpFb]f\u000b8FxW~L1]8weK-F{Qx";
      f2162[7] = "\u0005QLq<D\u000e^]>@]\u0001^[r~M";
      f2162[8] = "\u001cYCE9\u0000\u0000CA\u0019#\u0014\u0010@\nɭ";
      f2162[9] = int.class;
      f2163[9] = "java/lang/Integer";
      f2162[10] = "^g\u007f<\u0018-B}}`\u00029R~6q\u0005*T;q|\u001e=Csyq\u000f+\u001f\\Vs\u0007=U";
      f2162[11] = "'\u0000\u0003\u0003?C;\u001a\u0001_%W+\u0019Jÿ";
      f2162[12] = "\"N'\u001c[\u0012>T%@A\u0006.WnɆ";
      f2162[13] = "\u00011\b\u001e:s\u001f9\u0012Q[d\u00015\u001d\u000bg";
      f2162[14] = "\u0017;\u0001X V\u001c4\u0010\u0017AX\u0017?\u0014M";
      f2162[15] = "~z\u0000J?%b`\u0002\u0016%1rcI\u0007\"\"t&\u000e\n95cn\u0006\u0007(#?A3\u000b*7}m\u0006\u0006!5";
      f2162[16] = boolean.class;
      f2163[16] = "java/lang/Boolean";
      f2162[17] = "|\n\u001a\u001b\u001f+~\u0019\u0005F/z) \u0018ITv!\u0004%^b\u007f<\u0015b\u0018M'v\u001c\u0012\u0015Qu7x_FM 8\u0000\u0006VIqGA\u0010T\u0016a>C]\u001e@\u001b";
      f2162[18] = "\u0001\r]\u0000lVTPU\u001e\rD1\r\u0013AmQUXP\u001f|-\u0001CR\u001eqIT\u0000\f\u000f\r";
      f2162[19] = "\u001fKc\u0019liX\t'\u0010TȀ!M{\u00028?]\u001dt\tnY";
      f2162[20] = "|\u001a&\u001d/\f}\u000f&l$^|/?\r$I}\u001d[Up^l\u0004#\b5O(fb\u001e=\u000bj\u001f`Sw]\u0010";
      f2162[21] = "ps\u001aDzK\u007fq\f@\u0014O\"d7OqMO#A\u001dt\u001e/cAOv ";
      f2162[22] = "\u0015Pl\t%ER\u0012(\u0000\u001dΎ+S\"C}KK\u0013\"\u0011\u007fu\u0010X)\u0018#\u0015PX{\u001a\u001d";
      f2162[23] = "\u0002<B%{\u001aP>\b&\u0000\u0005^,\u0007)z\u0012u2\u001c\u000e}\u001bWUK:=\u0011ZkK(\u007f\u00033d\bun\u0016\rd\u001a7|\u007f";
      f2162[24] = "N:Y]\u001cgN5A\u0019x td\r\u001e\u00182\u0014$\rL\u001a\fOo\u0006EFl\u000foTGx";
      f2162[25] = "\\W8qM\u0016LM5*}MNln.\u0012HX\\\t+L^_Yk1\u001cFM0";
   }
}
