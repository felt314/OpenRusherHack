package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
public class Class329 extends Command {
   public static long f5299 = Class066.m4320(-5456514139158081283L, 7973352515445116463L, MethodHandles.lookup().lookupClass()).m4325(43420113176706L);
   public static String[] f5300;
   public static String[] f5301;
   public static Object[] f5303 = new Object[47];
   public static String[] f5304 = new String[47];

   @CommandExecutor
   public String m10836() {
        return null;
    }

   public Class329() {
      super("plugin", "Manage rusherhack plugins");
      String[] var10001 = new String[]{"plugins", null};
      boolean var10005 = true;
      var10001[1] = "pl";
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
      f5303[0] = "K\u000fvzIrW\u0015t&SfG\u0016?7WnA\u0013ezZwMSd=\u0015pM\u0013u;L)G\u0012\u007f ^\u007fPSR;UsA\u0005e\u0015XsM\u0012\u007f";
      f5303[1] = "\u001e}}KU\f\u0015rl\u0004(\u0014\u0006ueM";
      f5303[2] = "*\u000f\u001c\u0012a\"6\u0015\u001eN{6&\u0016U_|% S\u0018S~:$\u0013\u001f\u0012R56\t\t]p#\u0006\u0012\u0016Qr9!";
      f5303[3] = "M!\u0016G\u0018m8\u0001\u001dH\t\"E\u0019\u000eO\u0000k-";
      f5303[4] = void.class;
      f5304[4] = "java/lang/Void";
      f5303[5] = ".\u001aC$L\u001a2\u0000AxV\u000e\"\u0003\niQ\u001d$FGeS\u0002 \u0006@$[\u0017\"\rT~W\u0000/\u001b\nNW\u001c1\tPiV*9\u000bAzJ\u0006.\u0006";
      f5303[6] = "p\u0007`%\u0018wp\u0007wy\u0014xjLwg\u0014mm=%9A";
      f5303[7] = "6\f:\u000e\u0006.*\u00168R\u001c::\u0015s֢";
      f5303[8] = "!\u000f\b>,q?\u0007\u0012qAk'\u0002\u001b<vm$\u0000";
      f5303[9] = "ys$>DWei&b^CujmŻ";
      f5303[10] = "\u000b`z52\f\u0000okzS\u0002\u000bdo ";
      f5303[11] = "c\u001e\f\\ew\u007f\u0004\u000e\u0000\u007fco\u0007E\u0011{ki\u0002\u001f\\vreB\u001b\u001ebee\u0002E;Gny\u000b\u0002\u001c";
      f5303[12] = "\u00057\rlD5\u0019-\u000f0^!\t.Dɼ";
      f5303[13] = boolean.class;
      f5304[13] = "java/lang/Boolean";
      f5303[14] = "61)\u000b`8*++Wz,:(`ʮ";
      f5303[15] = "%6-v\u0007v9,/*\u001db)/dȬ";
      f5303[16] = "\u000ew\f|\u000ef\u0010\u007f\u00163Sg\u0016s\u001bp\u000e@\u0010d\u001f|M";
      f5303[17] = "=w\u001c\u0019j\u0019#\u007f\u0006V\"\u00199u\u001e\u0011+\u0002yP\u001f\u0016'\u0018>y\u0004";
      f5303[18] = int.class;
      f5304[18] = "java/lang/Integer";
      f5303[19] = "\u0015\u001a/kE+`:$dTd\u00014/oP>u";
      f5303[20] = "Ad:ovKJk+ \u001bOJw\u001fk)RNk/k";
      f5303[21] = "TE8=P>!e32AqLa3.u:~|72E:4";
      f5303[22] = "\u001cWBk5\n\u0017XS$R\b\u0002SSoi";
      f5303[23] = "d\u0002r=\u0019\bz\nhrQ\b`\u0000p5X\u0013 *j(q\b`\u0000p5X\u0013";
      f5303[24] = "\u0007\u001e@&Wor>K)F \u00130@\"Bzg";
      f5303[25] = "b|J\u0005>`?g\\\u0017Ew?mV\u0003\u0012 f>\noye&jI\u0016$~0x";
      f5303[26] = "a-\u000b\u0018Cq78\u0015U|(b:u\u0001MqusJ\u000eC\"tB\u001f\u0005\u0002?4~I\u0010\u001cr\u000b";
      f5303[27] = "T>_f\u0012/\u0004\"[\u007f|ʋiaB;\u001ej\u0012e\tz\u001b\u0011";
      f5303[28] = "\bO\u0006(4|\f\u0004G-O|TMRJ#?MA\u0003$.=WU?";
      f5303[29] = "*BoJ2rnW}A[Φ\u0014\u0003\u007fL2q~Gj^9";
      f5303[30] = "R\u007frF?SZ:q7n8@u$MxV_|)7?\b\u0001?\"Y \u0001\fE";
      f5303[31] = "jY= )KuP0Z}Bm\fh&\u0013X'U{`}G.X\u00015vYx\tm*nDpi|j/_-\u0007cc\"%";
      f5303[32] = "\u001cV=*|BXC/!\u0015с\"\u00140.qF\u001cD,*h(";
      f5303[33] = "k\u000e&6 \u001et\u0007+Ld\u0019rCw\u000btp)\u0001$}p\u0012}\u0005`=\u001a\r&\u0002`vt\u0012/\u000f\u001a";
      f5303[34] = "-g\"\u001dE\u00182n/g\u001d\u001111\u001e\nB\u00196..Y\u0000\u001a<Wp^\u001d\u0016.4o\u0016\u001c\u0018P*.[\u0005L>5'V\u007f";
      f5303[35] = "'i_\u000f\"vzrI\u001dYazxC\t\u000e6#*\u001feesc\u007f\\\u001c8hum";
      f5303[36] = "=r\f\t\u0007\f99M\f|\f|xX\u0002\u0019wjmK\u0019CK<xUT|";
      f5303[37] = "CPAV\u0012\u0014\u001eKWDi\u0003\u001eA]P>TG\u0012\u0000<U\u0011\u0007FBE\b\n\u0011T";
      f5303[38] = "6x\u0000H0H<s\u001b\u0010\u0001]1f\u0003\u001aFMXnF\u000f\u007f\u001f6cD\u0015k#6x\u0000H0H<s\u001b\u0010\u0001";
      f5303[39] = "3;l_\u0001\u001ce.r\u0012>\\>\u001dhWWQY;qC\u0000\u001bc7vWE 61nB^L))sJ>";
      f5303[40] = "f\"\u0005,\te/-C4n`3*5)\u000f`$+\u0007MTh/z\u0011|\u00103& |v\u0002w:w\u0003w\u0000d1F";
      f5303[41] = "L\b1\u001dk\u0001\u001c\u00145\u0004\u0005ՆqZf\u0012uN\u001f\u0001$\u00068?A\u000f?\u00034^A\r<\u0015\u0005";
      f5303[42] = "FI3@\u0012#FK0V#ăvQ`\u0006Yx\u0018Ni\u000b#";
      f5303[43] = "Q\u001a\u0017mDh\u0001\u0006\u0013t*ԳlE\n0H-\u0017AAqMV";
      f5303[44] = "_iu\u0010\u0002\b\\\u007fn\u0016oFdo!V\u0015P\np([o\u0017T.kP\u0001\b]#\u0011";
      f5303[45] = "+c\r\u0016\u0006R/(L\u0013}BquH\u001d\u001cOm\u0013\u000bKC\u0018|q_O\u0007X\u0016\"VKMR}.O\u001fM)";
      f5303[46] = "As\u0012\u00130+\u0016\"\u001f\u0011Z-(%\u0012B+xKq\u0006K1DA(\u001dXf'\u0015<\u0014BZ";
   }
}
