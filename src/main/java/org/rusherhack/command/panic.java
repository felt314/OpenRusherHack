package org.rusherhack.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.interfaces.IToggleable;

public class panic extends Command {
   public static long f6132 = Class066.m4320(-3991949170620659600L, 2879642737518013862L, MethodHandles.lookup().lookupClass()).m4325(215856777066691L);
   public static String[] f6133;
   public static String[] f6134;
   public static Object[] f6136 = new Object[34];
   public static String[] f6137 = new String[34];

   @CommandExecutor
   public String m12204() {
        return null;
    }

   public panic() {
      super("panic", "Turn off all modules");
      String[] var10001 = new String[]{"alloff", null};
      boolean var10005 = true;
      var10001[1] = "disable";
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
      f6136[0] = "WqsXu\u0003Kkq\u0004o\u0017[h:\u0015k\u001f]m`XϞ";
      f6136[1] = "*\u0004R9y\b!\u000bCv\u0004\u00102\fJ?";
      f6136[2] = "\u0014@\u0003u\tS\bZ\u0001)\u0013G\u0018YJ8\u0017O\u001e\\\u0010u\u001aV\u0012\u001c\u00112UQ\u0012\\\u00004\f\b,[\n?\u0014Q-[\u0001,3G\u0015V\b>\td\u001aA\u0001";
      f6136[3] = ";\u007f(@\u007f\u000f'e*\u001ce\u001b7fa\rb\b1#,\u0001`\u00175c+@L\u0018'y=\u000fn\u000e\u0017b\"\u0003l\u00140";
      f6136[4] = "~\u000by\u0003fY\u000b+r\fw\u0016v3a\u000b~_\u001e";
      f6136[5] = void.class;
      f6137[5] = "java/lang/Void";
      f6136[6] = "gIL1\u001aqyAV~}phZ[$[v";
      f6136[7] = "Z1B\u001d\u0006\"Q>SRg,Z5W\b";
      f6136[8] = "\u0017i8\u0001Oo\u000bs:]U{\u001bpqLQs\u001du+\u0001\\j\u001159J\\n\ri:\u0001Pu\u001cn3J\u0013W\u0017\u007f*CXY\u0019o:HRh\u0001";
      f6136[9] = ")|x\u0015&)5fzI<=%e1Ő";
      f6136[10] = "dP=\nwAxJ?VmUhItЉ";
      f6136[11] = "}y\u0006*t%ac\u0004vn1q`OȂ";
      f6136[12] = int.class;
      f6137[12] = "java/lang/Integer";
      f6136[13] = "fz&VI/z`$\nS;jco\u001bT(l&(\u0016O?{n \u001b^)'A\u0015\u0017\\=em \u001aW?";
      f6136[14] = boolean.class;
      f6137[14] = "java/lang/Boolean";
      f6136[15] = "C;cY\u0017N]3y\u0016uRZ.";
      f6136[16] = "P`i\u0007\u00144Lzk[\u000e \\y \u0380";
      f6136[17] = "rZV_B6n@T\u0003X\"~C\u001fȅ";
      f6136[18] = "C\t\u0001P&t_\u0013\u0003\f<`O\u0010H\u001d8hI\u0015\u0012P5qEU\u0000\u001b5uY\t\u0003P9nH\u000e\n\u001bzHa\u0014\u0002\u000b8d";
      f6136[19] = "\u001eIV\u0015\u00073[\\\u0002\u001ew)OS\u0015sJqGA\t\u001aL?HXi";
      f6136[20] = "\\Q\u0019\\wb\u0000\b\u001e^\u001aW&*.zF\u001c\\Q\u0019\\wb\u0000\b\u001e^";
      f6136[21] = "%p\u001a\u0011\u000eN3k\u001bnˣ2vg\u0015S\u0003P~kC\u0005~\u000b#dG\u0013\u001c\u0003/2\u0011n";
      f6136[22] = "t\u001f2z?$p\u00133eFԎJF)')-3\u0012**<\u0014";
      f6136[23] = "\u0006j\tx>.\\qYhBԿ9 \u000bu ?[vT ,_";
      f6136[24] = "IW.:]W@Ryo!\u001cp\u0001{m\u001cM\u0012\tw;J0ITx?\\RAX.i!";
      f6136[25] = "5k\u00187\u0012\f1g\u0019(k\u0382\u000b3\u0006.\nE;7\n/\u0015";
      f6136[26] = "AnBWKj\u000b<EF7k\u001dpu[X\u007f\u0014aE<\u0006aL6R\u0004\u000bvAc)\u0007S.\u0013m[_Ur\u0017\f";
      f6136[27] = "\u007f7> 6(&7bl\u0006%j;%wz#lVct9\"f*&am)\u0016";
      f6136[28] = "5e]<A%<g\u001e?y=_wZ%\u0013>%{L9\u0015T5fD*\u0013.9pX,y";
      f6136[29] = "\u001eA\u0013{\u007f2\u0015M\u0004!\u001deHG*||e_F\u0018\u0018&g_Y\u0011jd~J\u0016c#y2GJ\u0011{\u007fnC+";
      f6136[30] = "h|\fB{ir6\u000e\f\u001binq?Ugklj\u000eM\u001b89w\u0014Qed`p\u0016<";
      f6136[31] = "+ZwzO>nO#q?\"~K\u000eqO>\u0017\u00019 \u00059/\f.-PB";
      f6136[32] = "V<[V\u001d)\ne\\Tp:\u0011{HR\u000bWU8DT\u0010>SvKMpf\u0019:\u001bMHk\u000e7N6";
      f6136[33] = ")`b3o\u0017}co&VǱ\u0016j?=h^z3?a$n";
   }
}
