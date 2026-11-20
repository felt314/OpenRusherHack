package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;

public enum Enum398 {
   f6720,
   f6721;

   // $VF: synthetic field
   public static long f6722 = Class066.m4320(6818400032079019268L, -975879700517649628L, MethodHandles.lookup().lookupClass()).m4325(15770079045952L);
   public static Object[] f6723 = new Object[35];
   public static String[] f6724 = new String[35];

   public static Enum398 m12935(BlockPos var0) {
      int var10000 = Class253.m9154();
      Block var4 = Globals.mc.world.getBlockState(var0.down()).getBlock();
      int var3 = var10000;
      Block var5 = Globals.mc.world.getBlockState(var0.add(0, 0, -1)).getBlock();
      boolean var10006 = true;
      Block var6 = Globals.mc.world.getBlockState(var0.add(1, 0, 0)).getBlock();
      var10006 = true;
      Block var7 = Globals.mc.world.getBlockState(var0.add(0, 0, 1)).getBlock();
      Block var9 = Globals.mc.world.getBlockState(var0.add(-1, 0, 0)).getBlock();
      boolean var10 = var4.equals(Blocks.BEDROCK);
      if (var3 == 0) {
         if (!var10) {
            return f6721;
         }

         var10 = var5.equals(Blocks.BEDROCK);
      }

      if (var3 == 0) {
         if (!var10) {
            return f6721;
         }

         var10 = var6.equals(Blocks.BEDROCK);
      }

      if (var3 == 0) {
         if (!var10) {
            return f6721;
         }

         var10 = var7.equals(Blocks.BEDROCK);
      }

      if (var3 == 0) {
         if (!var10) {
            return f6721;
         }

         var10 = var9.equals(Blocks.BEDROCK);
      }

      return var10 ? f6720 : f6721;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
   public static void m122() {
      f6723[0] = "\u0003->d,2\u001f7<86&\u000f4wΒ";
      f6723[1] = "c\u0015\u000e\u0016@%\u007f\u000f\fJZ1o\fGȾ";
      f6723[2] = int.class;
      f6724[2] = "java/lang/Integer";
      f6723[3] = "\u0004NuMr\u000e\u0004Nb\u0011~\u0001\u001e\u0005b\u000f~\u0014\u0019t7P'";
      f6723[4] = "gc\u001fWrfgc\b\u000b~i}(\b\u0015~|zYYJ,7";
      f6723[5] = "\nT$\u0011]?\nT3MQ0\u0010\u001f3SQ%\u0017nb\t\bf";
      f6723[6] = "OUP0%\u0000SORl?\u0014CL\u0019};\u001cEIC06\u0005I\tpr8\u0017AKD";
      f6723[7] = "l\u0003k\u0010Iql\u0003|LE~vH|REkq9,\u000f\u0014";
      f6723[8] = "\u0019\u001c8U\u0016*\u0019\u001c/\t\u001a%\u0003W/\u0017\u001a0\u0004&~IOu";
      f6723[9] = ")Z\u0019oIs)Z\u000e3E|3\u0011\u000e-Ei4`_s\u0010\"";
      f6723[10] = "\u0001(\t#l4\u001d2\u000b\u007fv \r1@ɹ";
      f6723[11] = "P\u0006Cul\n[\tR:\u0007\bO\n";
      f6723[12] = "t\u0005}\u007f>/\u007f\nl0S/\u007f\u0017x";
      f6723[13] = "oxoM^\u0011dw~\u0002#\twpwK";
      f6723[14] = "^U\b\u0010Ygwl\u0014\n[;mx\u0004\t\u0010Α>";
      f6723[15] = "4f;x\u0011[\u001d_'b\u0013\u0007\u0007K7aXέT";
      f6723[16] = "\u0006Rp\fhe\u001aHrPrq\nK9ѷ";
      f6723[17] = "5f\u0016`*\u0012)|\u0014<0\u00069\u007f_Ч";
      f6723[18] = "K\u0003@\t\u0018P@\fQFy^K\u0007U\u001c";
      f6723[19] = "+\u0006N$\u00100.\\Pf-Ȓ\u0012UH\u007fO y\u001dA%BK";
      f6723[20] = "^\n;/v>G\u0010=R<\\^\n;/v>G\u0010=";
      f6723[21] = "\"{#NNGqg<\u0005\"Htf%SeX\u001d26\u000f[Gzp=\u000f\u001f6,m6\u000f\u0018\u000e~d=C\"\tdy(RSZxfc>";
      f6723[22] = "7\u001cl\u001e,6.\u0006jcȭT5\u0012a\u000fs%7\u0004o\u0001J";
      f6723[23] = "jNo#\u0002\u0014/Y|5>\t=Hv?R;`\u000f,`>WaX*(\u000e\u000f9]gX\u0005\nhHp?\u0000\u00072^\u0016";
      f6723[24] = "\u001bXz3\u001a@C\u0000\u007f~j\u0015M\u0015vh\u0006'\u0019Q.0Vp\u001bXz3\u001a@C\u0000\u007f~j";
      f6723[25] = "t\\S\u0007x\u0004mFUzqft\\S\u0007x\u0004mFU";
      f6723[26] = "`jYv& v8F:[ǻ\n5Fijy2gOb&C;kG6a{ibLz[";
      f6723[27] = "-\u0016\n!KP+\u0018I9+JzrEu[BoJHt\u0014_";
      f6723[28] = "\t\u0004i\u0000\u0019fQ\\lMi3_Ie[\u0005\u0001\u000b\r=\u0002XV\u000bVd^\u0002=C_>SioQTgW\u0002'X\u000ej<P5SWnW\u0018<\tZ\u0005\u0007X:\u000eE5_\u0000?C5";
      f6723[29] = "\r \b\u001bf\u0010^0Z\\\u0002\u001bQ<T\fUD\u0001a\u000f`<\u0015\\7H\u0005o\u0015H6";
      f6723[30] = "=\u000bU/_$0\n\u001a2!raVA.v%>\u000b\u001aB\u001bfy@\u0019:^qjV";
      f6723[31] = "[i\u0013\u0004%\rBs\u0015y*o\u000f&\u000b\u0007:\u0017Kl\n@CP\u0001n\f\u0000;\u0014KoKy";
      f6723[32] = "SL&@)V\bR'\u0018TǶ8\u0012.\u0010e\u0014\u0000@'\u001b).\tL/On\u0016[E$\u0003T";
      f6723[33] = "^:\u0004kd\f[7^}\u0002\u000e\b \\pn<_b\u0006/>k[<Pqz\u000e\b<Dp\u0002";
      f6723[34] = "N\u001f#U;AW\u0005%(ɦ#L\u0011.DdRN\u0007 J";
   }
}
