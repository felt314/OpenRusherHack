package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.feature.IFeature;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.setting.Setting;

public class reset extends Command {
   public static long f8748 = Class066.m4320(2302827293240115290L, -5382849170465428627L, MethodHandles.lookup().lookupClass()).m4325(133631130168114L);
   public static String[] f8749;
   public static String[] f8750;
   public static Object[] f8752 = new Object[55];
   public static String[] f8753 = new String[55];

   public reset() {
      super("reset", "mZLZK\u001f^\u001fYZ^KJ\u0019\u0018e's settings to their defaults");
      this.addAliases("default");
   }

   @CommandExecutor(
      subCommand = {"all"}
   )
   @CommandExecutor
   @CommandExecutor$Argument({"feature", "setting"})
   public void m16786() {
        
    }

   public void m16787() {
        
    }

   @CommandExecutor(
      subCommand = {"modules"}
   )
   public String m16788() {
        return null;
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
      f8752[0] = "\u0014JK? +\nBQpG*\u001bY\\*a,";
      f8752[1] = "\"hu;W!)gdt6/\"l`.";
      f8752[2] = "m{\u0015;\u007fpft\u0004t\u0018hbh\u00028=y";
      f8752[3] = "JM0&c)VW2zy=FTyţ";
      f8752[4] = "H2{\u000f\u0011<T(yS\u000b(D+2B\f;BnzD\u0002=R2y\u000f*\u000fB!hT\u0011,";
      f8752[5] = boolean.class;
      f8753[5] = "java/lang/Boolean";
      f8752[6] = "~\ryQ\f\fb\u0017{\r\u0016\u0018r\u00140Ѥ";
      f8752[7] = " %xb\b`<?z>\u0012t,<1Ҹ";
      f8752[8] = "1P-Hu\u0018-J/\u0014o\f=IdȒ";
      f8752[9] = void.class;
      f8753[9] = "java/lang/Void";
      f8752[10] = "*txl[%!{i#&=2|`j";
      f8752[11] = "h\bTk\u0019^t\u0012V7\u0003Jd\u0011\u001dɻ";
      f8752[12] = "\u0003={h(V\u001f'y42B\u000f$2\u000b";
      f8752[13] = "vz\u0004\r\\nj`\u0006QFzzcMЎ";
      f8752[14] = "Z\u0015\u001b`w[D\u001d\u0001/\u0015GC\u0000";
      f8752[15] = "\u0011^R\u000744\rDP[. \u001dG\u001bJ)3\u001b\u0002SL'5\u000b^P\u0007\u000f\u0007\u001bMA\\4$=C[O/&\u000b^TK*$";
      f8752[16] = "\u0017j\u0016\rKN\u000bp\u0014QQZ\u001bs_@VI\u001d6\u0012LTV\u0019v\u0015\rxY\u000bl\u0003BZO;w\u001cNXU\u001c";
      f8752[17] = "C!8`)h6\u00013o8'K\u0019 h1n#";
      f8752[18] = "'\f'l\u001a>;\u0016%0\u0000*+\u0015nԒ";
      f8752[19] = "_\u0007rmyEA\u000fh\"4_[\u0005q~%U[\u0012*O8@L)j[%YA\u0003E~%QL*m\u007f#";
      f8752[20] = "\u0018\u0000\"h(%\u0006\b8'I \u0006\b;gg<";
      f8752[21] = "s{+\u0005\u0016\u0002oa)Y\f\u0016\u007fbbȭ";
      f8752[22] = int.class;
      f8753[22] = "java/lang/Integer";
      f8752[23] = "'?}b.\t;%\u007f>4\u001d+&4/3\u000e-cs\"(\u0019:+{/9\u000ff\u0004T-1\u0019,";
      f8752[24] = "\u0003\u0007\u0000n\f\u0019v'\u000ba\u001dV\u0017)\u0000j\u0019\fc";
      f8752[25] = "\u0007[qG:t\u001bAs\u001b `\u000bB8\n's\r\u0007e\f<u\u0001GqG\u001bd\u001c]\u007f\u0007/";
      f8752[26] = "GU}bzf\u001fYw\u000f\u007f4\u000eYFst=\u000fU6e&f~";
      f8752[27] = "fp\n\r\u0011k2s\u0019\u0013,ΝV%\u0005\u0003Le$jW\u001d\u0012\u001biw\u0007\fRi&%\u0019R,";
      f8752[28] = "85\u00034\t\u0014%,\u001d({\u001296f:\u0016\u0019%:\u0016,DBT";
      f8752[29] = "f\u0004f\u0007\n2f\u000bfKfʡ[Wg\u000b\f<5\u001bf[\u0019\u0002";
      f8752[30] = "\u00045aj,WA.~oAԠ>gz0+\u0003Q:h4q:";
      f8752[31] = "\t;L\u0018'a\t4LTKȬ4iXK+/F&\nUuQ";
      f8752[32] = "h$W4q-g.Op\u0014շ\u0005,H-qwzsK=n\u0017";
      f8752[33] = "\u0014\u0000\fG^#Q\u001b\u0013B3ϰ.Y\u001d\b\u000e#C\u001c\u0006\u0017\u000b";
      f8752[34] = "8P\u00046V|eQ\u00050?f(ZO2C`.7\f+\u0004j7\bT'\u000e\u0007";
      f8752[35] = "95$\b4\u0001(ab\rQ\u0007;$\u001e\u001d4\u0005Vg5\u001b1\u0016$(g\u0005oh";
      f8752[36] = "Q\u0003a1\u000bnPQ\"eyd\u0007Dqpy%\u0017\u000f#6H`\u0010Ay\f";
      f8752[37] = "\u001e76\u0007R(Qe(Y,4F <\u000ePZ\u001e76\u0007R(Qe(Y,:\u001f8d\u001cSg\u001a;ig\u00137N:'\u0015\\ePdY";
      f8752[38] = "%C/!eu4\u0005\"8\u0019a(B#;\u0019 8\tq}(e?G+G'cuSp)kb%FN";
      f8752[39] = "\u0016|\u0014\b\u001f%\u0007:\u0019\u0011c$\u001bz3\u0007\u0006&v9\u0018\u0001\u00035\u0004vJ\u001f]K";
      f8752[40] = "jf]a)0w\u007fC}[8}AB~ 4`e8(&i9#\tm!'c\u0019";
      f8752[41] = "8\u001e>X\u0018c}\u0005!]uǟ\u0002A%\u001fHw3F5\\K\u000e";
      f8752[42] = "\u0014cy.B \u0014lyb.y)3~wSqPk=*P\u0010\u0014peoOiL38l.";
      f8752[43] = "Uj\u001e2\u0016r\bx\u001ah/Ƃd2\t%Of\u0006x\u0016%E\u001d";
      f8752[44] = "\u0001.,\u0017A*Q'0\u0003-Bj0)K@z\u0011m(JF\u0013";
      f8752[45] = "FM\u0001\u0006*9FB\u0001JFľ{\u001e\u0000\n,7\u0015R\u0001Z9\t";
      f8752[46] = "\u0016\u0015s+%IL_u6\u0015RS\nw\"iTUg4;.^LXl7.3";
      f8752[47] = "|fPz\u0016\u001e6yPpm\u001d1{Ws\u0011\u001b7\u0016\u0014jV\u0011.)Lf\\|";
      f8752[48] = "\u0014&m3Tg\u00136.0-9E3YcD*U5zu-oZ1w>W5\u00107j\u000e";
      f8752[49] = ",\bo7#Q<\u0003k'FN(\u0014I#:]$\u000e}NyL*\bl<6\u001e4V\u0012.<@#\u0014|?zM:h";
      f8752[50] = "\u0005\u0015\rj\u0014^@\u000e\u0012oyŶ?\u001d\r5\u0014_\u0006M\u0004)\u00003";
      f8752[51] = "\u001a#\u001cQ2\u0003\u000f*\u0007G\u0002R\u001c)'NcR\u000b(\u0015*h@\u001e%\u001f\u0010kQ\u0013*n\u0014z\u000b\u001a{\u0000X{[\u000fE";
      f8752[52] = "\u001cHVopPDD\\\u0002s\u0006^~\u0000roo\u001eE]=)^[B\u0013g\u0013";
      f8752[53] = "} aD`3qv DZɎM#1I:3?lcWdMrq3F$?=#-\u0018Z";
      f8752[54] = "?A\u001f}ij/J\u001bm\f`;Z\u000fx\f!+\u0011]>=d,_\u0007\u0004";
   }
}
