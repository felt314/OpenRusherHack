package org.rusherhack.command;
import org.rusherhack.*;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Util;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.config.Configuration;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

public class openfolder extends Command {
   public static long f5195 = Class066.m4320(8206148420293590829L, -4334404812973405731L, MethodHandles.lookup().lookupClass()).m4325(45937159129949L);
   public static String[] f5196;
   public static String[] f5197;
   public static Object[] f5199 = new Object[44];
   public static String[] f5200 = new String[44];

   @CommandExecutor
   @CommandExecutor$Argument({"subfolder"})
   public openfolder() {
      super("openfolder", "Opens a folder to the rusherhack directory");
      this.addAliases("folder");
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
      f5199[0] = "G}qsaR[gs/{FKd8ȗ";
      f5199[1] = "+\u000e\u0015XuS \u0001\u0004\u0017\bK3\u0006\r^";
      f5199[2] = "f4c1#1z.am9%j-*|>6lhgp<)h(`1\u0010&z2v~20J)ir0*m";
      f5199[3] = "3\u001f'9I\tF?,6XF;'?1Q\u000fS";
      f5199[4] = void.class;
      f5200[4] = "java/lang/Void";
      f5199[5] = "\u001e\"~\\Ec\u00028|\u0000_w\u0012;7ԗ";
      f5199[6] = "(1\u0017?\u0004]69\rpc\\'\"\u0000*EZ";
      f5199[7] = "\u00049\rtam\u000f6\u001c;\u0000c\u0004=\u0018a";
      f5199[8] = "(\u0014\u0012#\\\"4\u000e\u0010\u007fF6$\r[Ε";
      f5199[9] = "\u000fBE!\u0007\u0011\n\ru)E\u001d";
      f5199[10] = "P_rY-gNWh\u0016LbNWkVb~";
      f5199[11] = "4P\u0001B\u0017h(J\u0003\u001e\r|8IHɪ";
      f5199[12] = int.class;
      f5200[12] = "java/lang/Integer";
      f5199[13] = "[Az;(\u0011EI`tU\u0001E";
      f5199[14] = "I\u0007MvltU\u001dO*v`E\u001e\u0004Ȫ";
      f5199[15] = "p|\u0015\u0011!\u000elf\u0017M;\u001a|e\\ɋ";
      f5199[16] = boolean.class;
      f5200[16] = "java/lang/Boolean";
      f5199[17] = "^t\u0001OyvBn\u0003\u0013cbRmH\u0002gjTh\u0012OjsX(\u0005\u000eeeXaH\"dmWo\u0001\u0014ybEo\t\u000f";
      f5199[18] = "\u001a1l5u\u0016\u0019?422\u0014\u0015~J5/\u0010";
      f5199[19] = "?Ce!\u0012H#Yg}\b\\3Z,l\fT5_v!\u0001M9\u001fEc\u000f_1]q";
      f5199[20] = "$Z_\u001f2z$ZHC>u>\u0011H]>`9`\u0018\u0000o";
      f5199[21] = "\u0012\u0006@JR\u0019\u0012\u0006W\u0016^\u0016\bMW\b^\u0003\u000f<\u0005Q\tT\u001f\u000fU\u0017L/MV\f";
      f5199[22] = "\u000fd\nk\u0016l\u000fd\u001d7\u001ac\u0015/\u001d)\u001av\u0012^OpM";
      f5199[23] = "\u001f\u0003W\u0017GzKZUC:ɜ$\u0013KWVz^^__:mH\u001bKH@ \\\u0013'";
      f5199[24] = "W!}o\u000br\u000ftvmvf\u0006>m\tK8\u0010 `l\b:\u00177\u0011";
      f5199[25] = "Qw1#96\u000bv9{DΌow> #h\u001f;9zy";
      f5199[26] = "#!>/T,b,{'k?qm\u0007`S+r`b#Q,e\u0011";
      f5199[27] = "LC3cNd\u0017R8\fϙ\u001c\u0000_-`\u0017fMK%\f\u0000p\b_2vMd\u00003";
      f5199[28] = "!\b\u0001\u001ad|z\u0014\u0002\\\u000eղ\u001eC\u000b\u0017?{sK\u0012\rh\u0012";
      f5199[29] = "'R0\r!9fCeWAbjS.]=dl>h[-ekL0\u000e&g\u0016";
      f5199[30] = "11\u000e[`W{1\u000fN\u000e[\u0000&UYkXg=\\V|2i(^PdUr!QG\u000e";
      f5199[31] = "C)WKK\u0013\u00028\u0002\u0011+N\u001cE\u000eJPG\u0003 MHWPrx\u000b\tEX\u0017;\t\u000eR)O}H\u001cZL\f\u007fO\u000b+\u0018\u001e!\n\u0012\u0011Y\u000ftPr";
      f5199[32] = "\"vx\u0019A\u000fnq\"C|\u0012l{8\u0002\u0007\u007fv\u007f/@\u0017\u001cp~r\u0015|";
      f5199[33] = "\u0017-NJC,[*\u0014\u0010~=R\r\u0014W\u00137U&\u000f\\~6L-KF\u001d0Mp\u001e-";
      f5199[34] = "v()80c7%l0\u000f~2Uu2snIru&1t*tt{d\u001f";
      f5199[35] = "T4ym$\u0018\u000ffwaO6x\u001b^\\\u0000*s\u001cJP\u0004!x\u0007A\u001d$\u0001R`+-!\u0016D<";
      f5199[36] = "%sqf0' dg:\u000bm#t{?uzN}p!gr40d)\u000b|2b!`;y%t}[";
      f5199[37] = "B\u0002Q\rs\u000eDIWXJ\u000bEyBT{\u000fE\u0004O\u0014w\u0001";
      f5199[38] = "\u0010\u0010\u000edt]\u0000D^z\u001fR\u0013U\u0000ls`@\u0016Z\u000b![EN]{m\\\u001f\u0014`0u]\u001aT[{nND)";
      f5199[39] = "X\u000b\u001b{nn\u001cM\u0017{\u001f>\r\u001acy~>\u001a\u001bQ\u001d%4]\u0006Wrzf\u0001\u0011*&u=\u0005\u000b\u0011mn.[v";
      f5199[40] = "*\u001e\u000eUsR'^\u0002[\u0018A&C[XO\u0016y\u001f\u00004&C|I\u0002DjD&\u0013";
      f5199[41] = "Ap.A\b9\u0019%%Cu+\u0014d\u0004J\u00057}u'KK \u001es&\u0016\u001eK";
      f5199[42] = "_Aj\u001eYPI^fR5_\\^xGYm\u000f\u001c( [\u0003_MsJKW\u000fS\u0018";
      f5199[43] = "`S1\u000e-\u0000eD'R\u0016Lla=W{05CgT+@yD=\u000e\u0016";
   }
}
