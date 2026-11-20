package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.setting.Setting;

public class PlayerUtils implements Globals {
   public static long f1119 = Class066.m4320(3679720849873645079L, -4373633759396661643L, MethodHandles.lookup().lookupClass()).m4325(104769947854286L);
   public static long[] f1120;
   public static Integer[] f1121;
   public static Object[] f1123 = new Object[33];
   public static String[] f1124 = new String[33];

   public static double[] getDirectionalSpeed(ClientPlayerEntity var0, float var1, double var2) {
      return getDirectionalSpeed(var0, var1, var2, var0.input.movementForward, var0.input.movementSideways);
   }

   public static double[] getDirectionalSpeed(ClientPlayerEntity var0, float var1, double var2, float var4, float var5) {
        return null;
    }

   public static BlockPos getEyeBlockPos() {
      return new BlockPos(Globals.mc.player.getBlockX(), MathHelper.floor(Globals.mc.player.getEyeY()), Globals.mc.player.getBlockZ());
   }

   public static double[] getDirectionalSpeed(float var0, double var1) {
      return getDirectionalSpeed(Globals.mc.player, var0, var1);
   }

   public static double[] getDirectionalSpeed(double var0) {
      return getDirectionalSpeed(Globals.mc.player, Globals.mc.player.getYaw(), var0);
   }

   public static boolean hasHorizontalInput() {
        return false;
    }

   static {
    }
   public static void m194() {
      f1123[0] = "YZTv77YZC*;8C\u0011C4;-D`\u0017ln";
      f1123[1] = float.class;
      f1124[1] = "java/lang/Float";
      f1123[2] = "cZRr\"\u001ccZE..\u0013y\u0011E0.\u0006~`\u0011hy";
      f1123[3] = "~\u001e0:\u0007<b\u00042f\u001d(r\u0007yw\u0019 t\u0002#:\u00149xB\"`\u001c%bB\u0007x\u00140t\u001e\u0002`\u001c%b";
      f1123[4] = "\u0014Dd761\b^fk,%\u0018]-ɭ";
      f1123[5] = "\u001b.\u0019H\u001c\u0012\u00074\u001b\u0014\u0006\u0006\u00177P\u0005\u0002\u000e\u00112\nH\u000f\u0017\u001dr9\n\u0001\u0005\u00150\r";
      f1123[6] = "O+b)\u0006)O+uu\n&U`uk\n3R\u0011%6[";
      f1123[7] = "\u0005\u0002f!hE\u0019\u0018d}rQ\t\u001b/lvY\u000f\u001eu!{@\u0003^t{s\\\u0019^V`h\\\u000e%ufvC";
      f1123[8] = "kpH\u0019S/BIT\u0003QsX]D\u0000\u001ab_NBEGdDHN\u0005S/cYS\u001f]oW\u0007";
      f1123[9] = double.class;
      f1124[9] = "java/lang/Double";
      f1123[10] = "\u0016c";
      f1123[11] = int.class;
      f1124[11] = "java/lang/Integer";
      f1123[12] = "X57a,xX5 = wB~ # bE\u000fpzr#";
      f1123[13] = "{1\u0013\u001bUup>\u0002T6xe8";
      f1123[14] = "=_";
      f1123[15] = "\u0016\u001c\"o\u0004\u0002\u001d\u00133 e\f\u0016\u00187z";
      f1123[16] = "\u001d\u0002k\u0005.\u0017A\u0005&XWZK9>\u00056OJ\u0018WW(\u001a\u0010].\u0000kGWci\u0016k\u001a\u0012\u001a>U6],";
      f1123[17] = "]PG\\')\u0018KAM\u0019q\tIFPuC_\u000b\u001a\n%\u0014]\r\u001fJ|t\rJF\b\u0019";
      f1123[18] = "\u0007lA\tSR[k\fT*\u0018Wk}[U_\n3\u0004\f\u0016\u0002M\rC\u001a\u0016_\bt\u0014YK\u00186";
      f1123[19] = "\u000eV8m`.RQu0\u0019tXL\u0004?f#\u0003\t}h%~D7:~%#\u0001Nm=xd?";
      f1123[20] = "51n2$RmjpT'B?6{\u0003r\u0012jm\u0017mq\u001a/7w=6Cm";
      f1123[21] = "BR\u0001\u001dA+\u0007I\u0007\f\u007fs\u0016K\u0000\u0011\u0013A@\u000e\\IN\u0016DL\u0002NN&\u0001L\u0000\u0014\u007f";
      f1123[22] = "_\u001b\u0005\u0000$[\u001a\u0000\u0003\u0011\u001a\b\u0007\u0013\u0000\u0007M]WG_k}\u0005\u001f\u0018\t\u001a%^\u0001";
      f1123[23] = "Qlcp\u0016/\t7}\u0016\u0015?[kvA@o\u000e2\u001a/CgKjz\u007f\u0004>\t";
      f1123[24] = "\u0006G\u000et\u0010\u0011@HOxh\u0019<\u001dC\u007fPLPIDu\u000fp\u0007\u001a\u001b#T\u001cS\u001d\u0011|h";
      f1123[25] = "uFr2]X Jeg \u0002%:5a[Xu@k-_\r";
      f1123[26] = "v~\u0005kh20:Z4\u0005ѕK|\u0007n9'tyRdw@";
      f1123[27] = "U=\u0010\u0017\u0006\u001b\f&\u000bN|F\b#\fK\u0010t\\bW\u0011C#[ P\u0010BZ\fc\rW|\u001c\u001e=T\u001dLY\u001e?\u000e,";
      f1123[28] = "`uxm{\u0018&z9a\u0003\u00167hEcy\u00141hhee\u0010>Oqon\u0015Z-lchGghweyyc,0\u007ff\u00193ki=\u0003G%(5<z\u0010fur\u0002jHd~wamC0\u007f\t";
      f1123[29] = "\"\u0016uIl2g\rsXRjv\u000ftE>X J(\u001dm\u000f$\bv\u001ac?a\bt@R";
      f1123[30] = "-NLOQbs\u0002H\u001ajvp\u001dS\u001c=!.J\u000bpS}p\u001b\tM\u0016fv\n";
      f1123[31] = "gg\u0000Ayn!hAM\u0001`0z=O{b6z\u0010Igf9]\tClc]?\u0014Oj1`z\u000fI{\u000fd>HSdo4y\u0011\u0011\u00011\":M\u0010xfag\n.87d{\u0014Nhp=9q\u001796 c\u0011G~ob\u0006\u0018\u001f?e#e\u001f\u0014kd]";
      f1123[32] = "\u0010\u0001<\u00073\u0014U\u001a:\u0016\rLD\u0018=\u000ba~\u0013_fV5)\u0017\u001baP3P@X<\u0017\r";
   }
}
