package org.rusherhack.core.animation;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

public class Animation {
   public long f1388;
   public boolean f1389;
   public double f1390;
   public boolean f1391;
   public boolean f1392;
   public long f1393;
   public long f1394;
   public Easing f1395;
   public static int f1396;
   public static long f1397 = Class066.m4320(4925784454358253604L, 4197833893416960545L, MethodHandles.lookup().lookupClass()).m4325(23215571238565L);
   public static long[] f1398;
   public static Long[] f1399;
   public static Object[] f1401 = new Object[39];
   public static String[] f1402 = new String[39];

   public Animation() {
    }

   public Animation play() {
        return null;
    }

   public Animation(Easing var1, long var2) {
    }

   public Animation setLoop(boolean var1) {
        return null;
    }

   public Animation setDirection(boolean var1) {
        return null;
    }

   public boolean isReversed() {
        return false;
    }

   public Animation restart() {
        return null;
    }

   public Animation setDuration(long var1) {
        return null;
    }

   public Animation reverse() {
        return null;
    }

   public Animation setTween(Easing var1) {
        return null;
    }

   public double get() {
        return 0.0;
    }

   public boolean isPlaying() {
        return false;
    }

   public static void m3333(int var0) {
      f1396 = var0;
   }

   public static int m3334() {
      return f1396;
   }

   public static int m3335() {
      int var0 = m3334();
      return var0 == 0 ? 83 : 0;
   }

   static {}
   public static void m122() {
      f1401[0] = "\u0004+MTZR\u00181O\b@F\b2\u0004\u0019GU\u000ewK\u0014AJ\n-C\u0015F\t*7C\u0017IS\u00026D";
      f1401[1] = boolean.class;
      f1402[1] = "java/lang/Boolean";
      f1401[2] = long.class;
      f1402[2] = "java/lang/Long";
      f1401[3] = "\u001bo\u0005\\u\"\u0010`\u0014\u0013\u001f!\u0004l\u001fX";
      f1401[4] = double.class;
      f1402[4] = "java/lang/Double";
      f1401[5] = "c`\u0013pIJ\u007fz\u0011,S^oyZ=TMi<\u00150RRmf\u001d1U\u0011Is\u00077UX";
      f1401[6] = "\"NE\u0000\u001dU>TG\\\u0007A.W\fɚ";
      f1401[7] = int.class;
      f1402[7] = "java/lang/Integer";
      f1401[8] = "PjO\u0006P^[e^I-KI\u007f\\\n";
      f1401[9] = "n*z\u0001\b[r0x]\u0012Ob33L\u0015\\dvh[\u0013BrvPN\u000eFT,tC\t";
      f1401[10] = "\u000bX\u000fT9\u0000\u0017B\r\b#\u0014\u0007AF\u0019$\u0007\u0001\u0004\u001b\u001f?\u0001\rD\u000fT\u0018\u0010\u0010^\u0001\u0014,";
      f1401[11] = "R\t\u0019\u0013Pp')\u0012\u001cA?Z1\u0001\u001bHv2";
      f1401[12] = void.class;
      f1402[12] = "java/lang/Void";
      f1401[13] = "OA}(\u0002YDNlg\u007fAWIe.";
      f1401[14] = char.class;
      f1402[14] = "java/lang/Character";
      f1401[15] = "(\\F:\n^]|M5\u001b\u0011 d^2\u0012XH";
      f1401[16] = "(|L\u000ej\u001a#s]A\u000b\u0014(xY\u001b";
      f1401[17] = "*FSBA~tD\u0000]=pw]\u0005VPByD\u0012_=&nF\u001d[\u0005%,Q\u00112";
      f1401[18] = "`o\u001e5\u001a\f\"pA3{Ԓ_i]-\u0005\u0019`q\u001f?Es";
      f1401[19] = "?M,#y_*\u0018g\u001dͳ8m\u001e1$yR2Bg&";
      f1401[20] = "y[\u0004iB|l\u000eOWА\u001b+Y\u0012+K})NM>";
      f1401[21] = "d\u0002@7ZAaOIv3\u0010 F@;3C>\u0002T6Q\u001d<QKJ\t\u001fdNX(W\u001d7Q$";
      f1401[22] = "a\b)~#\u000ft]b@˅h6[==8P3\u00164|";
      f1401[23] = "^_/fE$\u0004C+r$+\u0002U&sDOR\r&2M1\u0010A\"k$";
      f1401[24] = "|\u0017\u0003'\u000btiBH\u0019\u0010\u0013+\u001b\u0003hFkwDN$y/t\b\u0002&\u0001s+EN\u0019";
      f1401[25] = "\u0019P\u0005m\u001f\u0001\f\u0005NSˡfO\u0001\u001an\u0004\u0018\rM\u001e7m";
      f1401[26] = "\u0000=[0EL\u0015h\u0010\u000eÉ+Q,M|^\u0013RnZp";
      f1401[27] = "*,b.m-i!-v\u0012$~.t\u0014s'zH*%t>l.(2++\u0017";
      f1401[28] = "nqw;cM{$<\u0005Ջ*8 h8xTzlla\u0011";
      f1401[29] = "s%or/Rfp.Lχ5!vru/_~*$w";
      f1401[30] = "A!kSO\u000eTt mĲi\u0017ptPT\u0017U<p\t=YO1d\u001dO\u0011K4*m";
      f1401[31] = "\u0015YCC5G\u0000\f\b}ȼ G[U\u0001<FEL\n\u0014";
      f1401[32] = "\u0001'<uhW_%oj\u0014KR%}hS[;{~cf\\\u0003x<tj5\u0001'<uhW_%oj\u0014";
      f1401[33] = "N!\u000fL$r\u0001w\u0017RH{\u0014$\n[H)\u001d+\u0013X.+\nt\u0006#q}\u00161\u0014EsjI$o\u001a%v\f6\t\u00182)\u0019MVN.l\u000b+TYqyp";
      f1401[34] = "\u0004L\u001dU8\u0005FSBSY̅;J^M'\u0010\u0004R\u001c_gz\u000bFZI)\bCB_\u0007Y";
      f1401[35] = "w8x\u0004^B-$|\u0010?B&=d$C){jqPVW9&u\t?@z=r\f_S%;em";
      f1401[36] = "'YHL,\f2\f\u0003rˮku[^\u000e%\rwL\u0001\u001b";
      f1401[37] = "(WsKm4=\u00028uɞSz\u0004nLm9%X8N";
      f1401[38] = "=7I\u000f\u0017k8z@N~\u0017@M`;$S=7I\u000f\u0017k8z@N";
   }
}
