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
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class modules extends Command {
   public static long f5173 = Class066.m4320(5298839664405145039L, -5892271403783894353L, MethodHandles.lookup().lookupClass()).m4325(147715808377897L);
   public static String[] f5174;
   public static String[] f5175;
   public static Object[] f5177 = new Object[51];
   public static String[] f5178 = new String[51];

   public modules() {
      super("modules", "G5d\u001f\u0018K^\u000b list of modules");
      String[] var10001 = new String[]{"modulelist", null};
      boolean var10005 = true;
      var10001[1] = "module";
      this.addAliases(var10001);
   }

   @CommandExecutor
   public String m10496() {
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
      f5177[0] = "iHG\b{\u001aw@]G\u001c\u001bf[P\u001d:\u001d";
      f5177[1] = "?_F%\u0003;4PWjb5?[S0";
      f5177[2] = "\u001ed\u000eoyf\u001ed\u00193ui\u0004/\u0019-u|\u0003^Ks ";
      f5177[3] = ",h6e\u001a\u001a0r49\u0000\u000e q\u007f(\u0004\u0006&t%e\t\u001f*47.\t\u001b6h4e\u0005\u0000'o=.F\",~$'\r,\"n4,\u0007\u001d:";
      f5177[4] = "\u0003CX|cQ\u001fYZ yE\u000fZ\u0011ȿ";
      f5177[5] = ".>V$\u0000\u00052$Tx\u001a\u0011\"'\u001fɾ";
      f5177[6] = "Dmd\u0018)IZe~WTH\\e|\u001eMSGbw\u000b";
      f5177[7] = "(\u0005x9r\u000e#\niv\u001f\n#\u0016]=-\u0017'\nm=";
      f5177[8] = "5\t\u000f\u000f\rK)\u0013\rS\u0017_9\u0010FŊ";
      f5177[9] = "=](\u001f\u0017\u0004!G*C\r\u00101DaМ";
      f5177[10] = "^g8`\u001a\u0010B}:<\u0000\u0004R~q-\u0007\u0017T;='\u0006\u0001\u001fW6 \f(P{>)\r\u0017st,+";
      f5177[11] = "kq{\u0000\\c`~jO!{syc\u0006";
      f5177[12] = "$?l\r[\b8%nQA\u001c(&%ȥ";
      f5177[13] = int.class;
      f5178[13] = "java/lang/Integer";
      f5177[14] = "cY\f$\u001d;\u007fC\u000ex\u0007/o@Ei\u0000<i\u0005\u0002d\u001b+~M\ni\n=\"b%k\u0002+h";
      f5177[15] = "Nu-peA;U&\u007ft\u000eZ[-tpT.";
      f5177[16] = "\u0000Bh\u0004nH\u001cXjXt\\\f[!IpT\n^{\u0004}M\u0006\u001ezC2x\u0003UbOrI-Q|O";
      f5177[17] = "Z\u0011HZ\u0004TD\u0019R\u0015fHC\u0004";
      f5177[18] = "s-xX|To7z\u0004f@\u007f41\u0015aSyqv\u0018zDn9~\u0015kR2\u0016W\u001fjD}=s\u0013";
      f5177[19] = boolean.class;
      f5178[19] = "java/lang/Boolean";
      f5177[20] = "90#aQz%*!=Kn5)j,Of3,0aB\u007f?l\"*B{#0!aN`27(*\r[9%##Fn4.!\u0002Lk#.!";
      f5177[21] = "W\u0007.$a\u000b\\\b?k\u0006\tI\u0003? =";
      f5177[22] = ")\u0003S]R\r5\u0019Q\u0001H\u0019%\u001a\u001a\u0010L\u0011#\u001f@]A\b/_R\u0016A\f3\u0003Q]M\u0017\"\u0004X\u0016\u000e1\u000b\u001eP\u0006L\u001d";
      f5177[23] = "d[\r'\u0005.xA\u000f{\u001f:hBDj\u0018)n\u0007\tf\u001a6jG\u000e'69x]\u0018h\u0014/HF\u0007d\u00165o";
      f5177[24] = "\u001ce\bN\u0007\riE\u0003A\u0016B\u0014]\u0010F\u001f\u000b|";
      f5177[25] = void.class;
      f5178[25] = "java/lang/Void";
      f5177[26] = "grQUs|d2]+-p}0`\u0012u!1+\u0002U2acL";
      f5177[27] = "S\\t\u0007gaUJl\u000b\u001e7\u000b_r\rI`R\f.a'7\bToY!!\u0010X";
      f5177[28] = "m\u000e}~\u001b2<\u0011 ?p\b\u0013!\r\u0000,Cm\u000e}~\u001b2<\u0011 ?";
      f5177[29] = ":Jl\u0004\u0014Nm\u00178Yy\u001a\u0001I9\rF\u0013c\niO\u0013s=I=\n\u0019\u0011~\u0019\u007f_y";
      f5177[30] = "_ddi\u0012;\u001ae3jtՓa`$+\u0014\"\u0013/7-\u0006I";
      f5177[31] = "f\u000ez^9A,@zCHɥVM\u007fOtV)\u001b\u007fU3<";
      f5177[32] = "8O?Z\u0011c}NhYwί\u0006K8\u001b\u000bwt\u000e9L\b";
      f5177[33] = "q_Z\u00116[/Q\\KFL-Q|\u001b#N@\u001d\u0003N)Q;ATNv#";
      f5177[34] = "4\u0003\u0007\u000fj\u0001hT\u0007P\u0018\u0014c@^\tdz4\u0003\u0007\u000fj\u0001hT\u0007P\u0018\u0013z@V_jA?\u0007P`(C8UI\u001bt\u00148\n;";
      f5177[35] = "np\u0017L4==iQM\fi\u0004+V\u000bc7\u007fw\u0001\u000b<E4\"SX~>huS\u0007\f";
      f5177[36] = "kk\u0010qA-`~\u0016z*!{S\u001d&F-f\u0013\u0010,\u0016'?w\u001ew\u0012\"\u0000";
      f5177[37] = ">]\u007f;p\u0014)V~gNK(o%9!N>_B:(\u00164\f&4s\u001213";
      f5177[38] = "N_{WPnHIc[)8\u0016\\}]~oO\u000f 1\u00108\u0015W`\t\u0016.\r[";
      f5177[39] = "r\u0000WxR\u001f LXyi^v\u0019J).N\u001fLU8UJ`\u001aU\"\u0012 r\u0000WxR\u001f LXyi";
      f5177[40] = "p\rdRRnv\u001b|^+8(\u000ebX|oq\\94\u00128+\u0005\u007f\f\u0014.3\t";
      f5177[41] = "\u0005Nj\u0004N;J]l\u0016%ǖ;X=\u000eL3\u000b\u000b=\u0014\u0014I";
      f5177[42] = "!9h|:\u001e%w>iY\u0017qeR:'\u0011pk0c4Ee\tn6c\u0004~ijx5\u0011\u001d";
      f5177[43] = "\u0014\u0015j\u0005HxS\u001d\u007fY4:*T4\t[dQ\bc\t\u0004\u0016\u001a]1ZFmF\n1\u00054";
      f5177[44] = "'\u0019\u0007\u0010+\b!\u000f\u001f\u001cR^\u007f\u001a\u0001\u001a\u0005\t&HTvk^|\u0011\u001cNmHd\u001d";
      f5177[45] = "~\u001b\fe.\t\"L\f:\\\f'FMg\u001b\u001cN\u001b\u000e6`\u0015,\\Iv2r~\u001b\fe.\t\"L\f:\\";
      f5177[46] = "\u0005uPU\u0007O\u0003cHY~\u0019]vV_)N\u0004$\n3G\u0019^}K\u000bA\u000fFq";
      f5177[47] = "D\u0003'A?G\u0017\u0003=\u0019E\u0016S\u00077A9\u0010Uj'\u0016t\t\u0017\u000b$Vxw";
      f5177[48] = "o145;Re/emKRl=B4*R{<pP+\u0002x?jmu\u0006yh\u000b02D;<w59\\kQ";
      f5177[49] = "mdmZ&/?94SE.ny\u0018\\9,lb)DE{m8k^4*re*5";
      f5177[50] = "\u0013Ht\u0016k3\u0010\bxh3;\u00020(\u0018/R\u0015\u0010y\u000fl6\u001bK}\nS";
   }
}
