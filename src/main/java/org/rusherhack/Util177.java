package org.rusherhack;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.utils.MathUtils;

public class Util177 implements Globals {
   public static Object[] f3455 = new Object[51];
   public static String[] f3456 = new String[51];

   public static float m7288(Vec3i var0) {
      return m7289(Vec3d.ofCenter(var0));
   }

   public static float m7289(Vec3d var0) {
      return m7294(Globals.mc.player.getPos(), var0);
   }

   public static float m7290(Vec3d var0) {
      return m7294(Globals.mc.player.getEyePos(), var0);
   }

   public static float m7291(float var0) {
      if ((var0 = var0 % 180.0F) >= 90.0F) {
         var0 -= 180.0F;
      }

      if (var0 < -90.0F) {
         var0 += 180.0F;
      }

      return var0;
   }

   public static float m7292(float var0, float var1) {
      return Math.abs(m7295(var0, var1));
   }

   public static float m7293(Vec3d var0, boolean var1) {
        return 0.0f;
    }

   public static float m7294(Vec3d var0, Vec3d var1) {
      float var7 = (float)(var1.x - var0.x);
      float var4 = (float)(var1.y - var0.y);
      float var5 = (float)(var1.z - var0.z);
      return MathHelper.sqrt(var7 * var7 + var4 * var4 + var5 * var5);
   }

   public static float m7295(float var0, float var1) {
      return m7291(var1 - var0);
   }

   public static Vec3d m7296(float var0, float var1) {
      return new Vec3d(Math.cos(Math.toRadians(var0 + 90.0F)) * var1, 0.0, Math.sin(Math.toRadians(var0 + 90.0F)) * var1);
   }

   public static float m7297(Vec3i var0) {
      return m7290(Vec3d.ofCenter(var0));
   }

   static {
      m194();
   }
   public static void m194() {
      f3455[0] = "HZJK )T@H\u0017:=DC\u0003ğ";
      f3455[1] = "\r\u007f0\u0003\u0000|\r\u007f'_\fs\u00174'A\ff\u0010Ev\u0019^";
      f3455[2] = float.class;
      f3456[2] = "java/lang/Float";
      f3455[3] = "v>kpI\u0014v>|,E\u001blu|2E\u000ek\u0004-m\u001cO";
      f3455[4] = "\\\"TV7\u001d\\\"C\n;\u0012FiC\u0014;\u0007A\u0018\u0013MiF";
      f3455[5] = double.class;
      f3456[5] = "java/lang/Double";
      f3455[6] = "\rG0\b9Y\u0006H!GZT\u0013N";
      f3455[7] = "!Y)w]\u0016!Y>+Q\u0019;\u0012>5Q\f<cjm\u0006";
      f3455[8] = ":IQ\u00175Z&SSK/N6P\u0018ȿ";
      f3455[9] = int.class;
      f3456[9] = "java/lang/Integer";
      f3455[10] = "!3oU:\u000b=)m\t \u001f-*&Đ";
      f3455[11] = "I\u0006\u001e\u0013M\u0006U\u001c\u001cOW\u0012E\u001fW^S\u001aC\u001a\r\u0013^\u0003OZ\fIV\u001fUZ+RK\u0012R\u001d\u0016Sj\u0007O\u0018\n";
      f3455[12] = "Uc";
      f3455[13] = "E>pHc\u0016Y$r\u0014y\u0002I'9Ȓ";
      f3455[14] = "haw\u0003)rt{u_3fdx>N7nb}d\u0003:wn=WA4ef\u007fc";
      f3455[15] = "\u001e_np^\"\u001e_y,R-\u0004\u0014y2R8\u0003e)o\u0003";
      f3455[16] = "Ib\b,v\u000eUx\npl\u001aE{Aʏ";
      f3455[17] = boolean.class;
      f3456[17] = "java/lang/Boolean";
      f3455[18] = "B\u001d\u0013-\t\t^\u0007\u0011q\u0013\u001dN\u0004Z`\u0014\u000eHA\u0001w\u0012\u0010^A9b\u000f\u0014x\u001b\u001do\b";
      f3455[19] = "n\u0014Rt\r\u0013e\u001bC;l\u001dn\u0010Ga";
      f3455[20] = "8\u000e3Yjb=J3\u001e\u0013fnJ8C\u007fT:\u000bc\u0019.\u0003:V7\u0018.ohQaK\u0013:cYd\u0019\u007fhd\u000f7$";
      f3455[21] = "\u0016?Ag@\u000f\u0014<[9qHM\fP;\u0010]L-9l\u0015\tM<XiI]\u0016V\u00023LS@7\u0007o\u0018\b*";
      f3455[22] = "TQ?4\u0006\u0014TS'3~H\u0004\u0015!1\u0012zRW}kB-P\t.jCA\u0002\u000ex9~";
      f3455[23] = "2Ui$\u0013\b\u007fJs6qՓ\u000f\rv$\u000fNaSm}M3";
      f3455[24] = "oWnQSpmTt\u000fb\"9E\u0016X\u0002$o\u0003z\n\u0005r<>/\u0001\rwnR}\u0006[$S";
      f3455[25] = "9\u0000oq\u001a\u0007a[|w#·\u0006\u00012m\\\u00008Yi~Z";
      f3455[26] = "\u0015`\rE\u0004d\u0010$\r\u0002}`C$\u0006_\u0011R\u0017e]\u0005C\u0005\u00178\t\u0004@iE?_W}<N7Z\u0005\u0011nIa\t8DeAd[T\u0016b\u00177f";
      f3455[27] = "'\u000f\u0016y\bC'\r\u000e~p\u001fwK\b|\u001c-!\tT&Mz#W\u0007'M\u0016qPQtp";
      f3455[28] = "fm@zb\u0006(yVd\f\f4nc}p\n%s^|wc`{Gd7\u0003'v\u0005`\fS5~[!g\u0004=o\u0001\u001a";
      f3455[29] = "\u001d\u000e\u000b\u0004roFP\u00189w_\u0011S\u0018_a6\\\b\bZ\u001en\u001c\u0002\u0013Fw#G\u0012\u00169";
      f3455[30] = "(((\n\u0013&sv;7\u008b\u0016,)9\u000bBz~.oX\u007f/u&j\n\u0013}rp97Fvzuk[\u0014q,&V";
      f3455[31] = "\u0013\u001aC\u0011YKHDP,˽{\u0017\u0012CR\u000e\u001bP\u001f\u0001V5BN\u0014\u0001\u0011Y\u0010IBR,";
      f3455[32] = "aR(@b9&_jDY79V2R\u000e`c\u0006n>b=e\\<_ga1\u0007";
      f3455[33] = "\u001a@\tG=w]MKC\u0006yBD\u0013UQ.\u0018\u0014N9=s\u001eN\u001dX8/J\u0015";
      f3455[34] = "p\fs\u0016\u001ey+R`+\bIt\rb\u0017O%&\n4Drp-\u00021\u0016\u001e\"*Tb+";
      f3455[35] = "4h\b_\f) uER~Ʈ^aS\u001a\u0019`<fD\u001eC\u0010";
      f3455[36] = "&8m8\u001cp~c~>%ъ\u0019llw\u0019< xq:\u0014N";
      f3455[37] = "W:oCnc\fd|~ƟSS2o\u000093\u0014?-\u0004\u0002j\n4-Cn8\rb~~";
      f3455[38] = "7!\u000f2\u0019\u001222S?'\u0002-$W('[<3\fiK\t;e_T\u001e\u00023`\r8L\u0005e30mG\r`a\\?@[3\\";
      f3455[39] = "\u001d\u0012]7l8\u001f\u0011Gi]x@\u001d%<9>F\u0011D9ej\u001d{\u001ec`dK\u001a\u001b?4?!";
      f3455[40] = "|uBfz\u0015~vX8KE'g:m/\u0013'v[hsG|\u001c\u00012vI*}\u0004n\"\u0012@";
      f3455[41] = "}:,g<\t}84`DU-~2b(gy3o>t0yk,{\u007fP>fn\u007fD";
      f3455[42] = "*}\u001bq\u0010\u0011c>\u0003}tIp\u0003\u0000l\nM!}\u0019)\b\u0011";
      f3455[43] = "^Mm8BI\u0019@/<yL\nXs!\u0015~]\u0018\"{B)]Fz,I\u0018\rYh=y\u0010\u000eZm}\u0019W\u0003\u0018iF";
      f3455[44] = "rZ\u007f\u001fR\u0001fG2\u0012 Ԩ\u0018\u0001/L\u001c\u0005tS(\u001aO";
      f3455[45] = "n\u001ehX8\b)\u0013*\\\u0003\u00066\u001arJTQlJ,&8\fj\u0010|G=P>K";
      f3455[46] = ",?sUb5,=kR\u001ai|{mPv[*<0\b#\f(nsI!loc1M\u001a";
      f3455[47] = ";s2\u0010\u0016N\"60L,^3`(\u001d{\tm7pq\u0011\b,o4H\u0011\n4h";
      f3455[48] = "gCdg\u001a\u0010<\u001dwZƉ cBufKL1E#5v\u0019:M&g\u001aK=\u001buZO@5\u001e'6\u001dGcM\u001a";
      f3455[49] = "g\b&D\u0019\ts\u0015kIkҸ\rSv\u0017W\ra\u0001qA\u0004";
      f3455[50] = "Mv3/)U\u0016( \u0012\u0002eI~3l~\u0005\u000esqhE\\\u0019i3)%\u001b\u0014+7\u0012|\u0005\u001f+p~.\u0002IxM";
   }
}
