package org.rusherhack.core.utils;
import org.rusherhack.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.rusherhack.core.setting.Setting;

public class MathUtils {
   public static boolean f1727;
   public static Object[] f1729 = new Object[31];
   public static String[] f1730 = new String[31];

   public static long clamp(long var0, long var2, long var4) {
        return 0L;
    }

   public static float hypot(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   public static double round(double var0, double var2) {
      return Math.round(var0 / var2) * var2;
   }

   public static double clamp(double var0, double var2, double var4) {
        return 0.0;
    }

   public static double round(double var0, int var2) {
      return var2 < 0 ? var0 : new BigDecimal(var0).setScale(var2, RoundingMode.HALF_UP).doubleValue();
   }

   public static float clamp(float var0, float var1, float var2) {
        return 0.0f;
    }

   public static double interpolate(double var0, double var2, double var4) {
      return var2 + (var0 - var2) * var4;
   }

   public static double[] calculateIntersection(double[] var0, double[] var1) {
        return null;
    }

   public static double distance(double var0, double var2, double var4, double var6, double var8, double var10) {
      var6 = var0 - var6;
      var2 -= var8;
      var4 -= var10;
      return Math.sqrt(var6 * var6 + var2 * var2 + var4 * var4);
   }

   public static int clamp(int var0, int var1, int var2) {
        return 0;
    }

   public static void m4203(boolean var0) {
      f1727 = var0;
   }

   public static boolean m4204() {
      return f1727;
   }

   public static boolean m4205() {
      boolean var0 = m4204();
      return !var0;
   }

   static {
    }
   public static void m122() {
      f1729[0] = "ggpe\u0013\u001alha*n\u0002\u007fohc";
      f1729[1] = int.class;
      f1730[1] = "java/lang/Integer";
      f1729[2] = "I(V(\u001c/U2Tt\u0006;E1\u001fe\u0001(CtDr\u00076Ut|g\u001a2s.Xj\u001d";
      f1729[3] = "\u0003u\u000b\u000f#M\u001fo\tS9Y\u000flBɕ";
      f1729[4] = char.class;
      f1730[4] = "java/lang/Character";
      f1729[5] = "G0>\u001e5HL?/QVEY9";
      f1729[6] = double.class;
      f1730[6] = "java/lang/Double";
      f1729[7] = "]dd`#\u0018A~f<9\fQ}-->\u001fW8v:8\u0001A8W'<\b@";
      f1729[8] = "'vID<\u001f\u000eOU^>C\u0014[E]uR\u0013HC\u0018(T\bNOX<\u001f/_RB2_\u001b\u0001";
      f1729[9] = boolean.class;
      f1730[9] = "java/lang/Boolean";
      f1729[10] = void.class;
      f1730[10] = "java/lang/Void";
      f1729[11] = "\u0003m\u0016P\u001at\u001fw\u0014\f\u0000`\u000ft_\u001d\u0007s\t1\u0002\u001b\u001cu\u0005q\u0016P;d\u0018k\u0018\u0010\u000f";
      f1729[12] = "O-\n&\u007f\u0004:\r\u0001)nKG\u0015\u0012.g\u0002/";
      f1729[13] = "\u0018Qfx\u0017s1hzb\u0015/+|ja^>,ol$\u000387i`d\u0017s\u0010x}~\u00193$&";
      f1729[14] = long.class;
      f1730[14] = "java/lang/Long";
      f1729[15] = "g\u0007yJ\u0019Nl\u0012g\u0005eLx\bkBYD@\tkN";
      f1729[16] = "K;f`M\n@.x/!\u000eF\u001eub\n\n@6";
      f1729[17] = "S|\fRa%Xs\u001d\u001d\u0000+Sx\u0019G";
      f1729[18] = "Y) Ji0\u0003a<\n\u0005)\u001b\"<490]'\"\no9Z8@\bgm\u001d:~^nj\u0002X";
      f1729[19] = "W\u0002\u0011rRf\u0015\u0003Eslսg\u000f\u0017b\u0013z\n[\u0018|Q\u001c";
      f1729[20] = "E\\W\b^w\u0006SJ\u000f Ϲx\u0006\u000fQR3A\u0007V\u0010\u0018JGXJ\u0010[v\u0006GD\u0013 ";
      f1729[21] = "|\u001c<+6{/\u0000~Z0sv\u001f\u007f:Td!\u0016b&ou~\u0011\u0003";
      f1729[22] = "\rA|7;[U^{2J\u038d4\u001aj24\u000fUEuuu2\u000bKk51\u000eJTe6J";
      f1729[23] = "th\rwK\u0019,w\nr:\u0019M7\u00011\u0003\u0014v7\u00023\u0004pwh^2^Kwk\\5:";
      f1729[24] = "lat\u001d4t4~s\u0018EуU:b\u0018; 4e}_z\u001d";
      f1729[25] = "v;\u0013~:\ru=\u0004#W.V\u001a&K\n6\u001f7\rg5\u0003|4\u000bph";
      f1729[26] = "M\u000b\u0001E\u0005#L\u0010BM`\u007f@\u0013\u0011\u0011\rMN\n\u0006\u0018`/EQ\u0004\u0017^yLV\u001bu";
      f1729[27] = "\n\u0000\u001cWQ\u0002I\u000f\u0001P/ű7ZD\u000e]F\u000e[\u001dO\u0017?";
      f1729[28] = "\u0000jL*\"-\u0001q\u000f\"Gf\u0007smq.y\u0007\u000fL+!|\u00164]t&\u001d\u0003jMx*~\u0000lZ%Gw\u000fu\u0006\u007fwv\u00146\u000e\u001a";
      f1729[29] = "ZN'3_\n\tReBV\u000f_XQ>=\u0015\u0007Dy>\u0006\u0004XC\u0018y\u0000R\t\u0013g?\f\u0015Y\"";
      f1729[30] = "pj\u000e\u001e}@*\"\u0012^\u0011X,f\b\f\u0011\u001e)$\u0011\u0002/H #\u000e`x\u001f5~\nP!L/{n";
   }
}
