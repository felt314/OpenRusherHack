package org.rusherhack.client.api.utils;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

public class EntityUtils implements Globals {
   public static long f1103 = Class066.m4320(-3163416771252467204L, -6104540663217860555L, MethodHandles.lookup().lookupClass()).m4325(231241089943372L);
   public static String f1104;
   public static Object[] f1105 = new Object[30];
   public static String[] f1106 = new String[30];

   public static String getNameForEntity(Entity var0) {
        return null;
    }

   public static Vec3d interpolateEntityVec(Entity var0, float var1) {
      double[] var5 = interpolateEntityPosition(var0, var1);
      double var10002 = var5[0];
      boolean var10006 = true;
      return new Vec3d(var10002, var5[1], var5[2]);
   }

   public static double[] interpolateEntityPosition(Entity var0, float var1) {
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
   public static void m194() {
      f1105[0] = "kYh\b\tLwCjT\u0013Xg@!E\u0017PaE{\b\u001aIm\u0005zR\u0012Uw\u0005JH\u000fPpRZR\u0012Uw";
      f1105[1] = ",!kGxp0;i\u001bbd 8\"ȝ";
      f1105[2] = "t*)\u0006%Lt*>Z)Cna>D)Vi\u0010o\u001d~\u0014";
      f1105[3] = "\nM^2#T\u0001BO}^L\u0012EF4";
      f1105[4] = ",(,R r,(;\u000e,}6c;\u0010,h1\u0012iKt\"";
      f1105[5] = int.class;
      f1106[5] = "java/lang/Integer";
      f1105[6] = "\"R_a\u0014\u0004>H]=\u000e\u0010.K\u0016,\n\u0018(NLa\u0007\u0001$\u000eM;\u000f\u001d>\u000eo \u0014\u001d)uL&\n\u0002";
      f1105[7] = "\u000b\u0016\\\u000b4\u0003\"/@\u00116_8;P\u0012}N?(VW H$.Z\u00174\u0003\u0003?G\r:C7a";
      f1105[8] = "N*\u0013>\u001e1N*\u0004b\u0012>Ta\u0004|\u0012+S\u0010V\"Jo";
      f1105[9] = "&D(\r!z&D?Q-u<\u000f?O-`;~m\u0016x!";
      f1105[10] = float.class;
      f1106[10] = "java/lang/Float";
      f1105[11] = "Ky";
      f1105[12] = double.class;
      f1106[12] = "java/lang/Double";
      f1105[13] = "t4MnC\u0011h.O2Y\u0005x-\u0004#^\u0016~h_4X\bhhg!E\fN2C,B";
      f1105[14] = "b%.yh<i*?6\t2b!;l";
      f1105[15] = "`\\V%(~;Q\f:\u0018.<@\n(O}l\u0013_D(/`QW5#/ \u0013";
      f1105[16] = "O o\u0002E'\u0014-5\u001duw\u0013<3\u000f\"'JhmcNf\u0010:'\r\u000b|B#";
      f1105[17] = "~(kx-w%%1g\u001d,.%3~q\u001eybh#$Is6ne.8x6.'\u001d";
      f1105[18] = ":?H\u0018\u0013\u0005a2\u0012\u0007#^j2\u0010\u001eOl=uK@\u001c;7!M\u0005\u001aJ<!\rG#";
      f1105[19] = "\u0010Ea\u0014U\\\u001dY|zUc\u000fTs\b\r\u0002\u0012\u0004pzE\r\u0016H\"\u001bX]\u0015:";
      f1105[20] = "$qX=VV\u007f|\u0002\"f\rt|\u0000;\n?#;[eVh)o] _\u0019\"o\u001dbf";
      f1105[21] = "^!W\rED\u000b0O\u000b+A\n,w\tQO\u0001?,OS\u0016\u001f*\u0014\u001bVTVP";
      f1105[22] = "0`IL4aql[RO|fpEL#N4=\u0019\u0014O\"tnN[!gn<W+";
      f1105[23] = "Kfw\u0011<JK=jYDдw01K5\u001f\u001c\u007fp\u0015t!";
      f1105[24] = "ACT\u001d\u0003\t\u001aN\u000e\u00023Y\u001d_\b\u0010d\tD\u000bP|\u0003XANU\r\bX\u0001\f";
      f1105[25] = "~&\u0017S>W%+ML\u000e\f.+OUb>~k\u0010\r\u000eP2,W\\d\u0005#4Q2";
      f1105[26] = "\u0017RNjL~EMZ6tkDWHk\u0018Y\u0017\u001a\u00187t5EGOw\ftIUQ\f";
      f1105[27] = " N\\v64-RA\u0018>m:\\T`8o/MCU9w'M_@8p'MO\u007f9\u000b{@\u0016yo5 MLf_4xWNh>;)_S\u0018`q&V\u0013{o36A.";
      f1105[28] = " /9 \u0017x)h5z&vwj=b^pu\u007f,u&'~+,!W,~kn\u0018\u0016x,jii\u001dxl(P(I*m/!#Ij/\u0016`w\u001bk(gkw[)\u0011";
      f1105[29] = "-4\u0000ux\u001fv9ZjHOq(\\x\u001f\u001f(~\u0006\u0014xN-9\u0001esNm{";
   }
}
