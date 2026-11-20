package org.rusherhack.core.command;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.setting.Setting;

public class CommandUtils {
   public static Setting[] f1458;
   public static long f1459 = Class066.m4320(-2690792136943461128L, -7763875767966404926L, MethodHandles.lookup().lookupClass()).m4325(702568628573L);
   public static String[] f1460;
   public static String[] f1461;
   public static long[] f1463;
   public static Integer[] f1464;
   public static Map f1465;
   public static Object[] f1466 = new Object[51];
   public static String[] f1467 = new String[51];

   public static List<String> generateSyntaxList(CommandData var0, boolean var1, boolean var2) {
        return null;
    }

   public static List<String> processArguments(String var0, boolean var1) {
        return null;
    }

   public static void m3491(Setting[] var0) {
      f1458 = var0;
   }

   public static Setting[] m3492() {
      return f1458;
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
   public static void m122() {
      f1466[0] = "0\rJbj2,\u0017H>p&<\u0014\u0003/w5:QN#u*>\u0011Ib[(2\u0012L\"|\u0012+\u0016A?";
      f1466[1] = "1n\u001fIw'-t\u001d\u0015m3=wVȓ";
      f1466[2] = "\u0000\u0018Jx'&\u001c\u0002H$=2\f\u0001\u0003Բ";
      f1466[3] = ")7\tn+B\"8\u0018!VZ1?\u0011h";
      f1466[4] = ";*:S)\"N\n1\\8m/\u0004:W<7[";
      f1466[5] = "\u0004X9:\nj\u000fW(uwr\u001cP!<fs\u0007U+>V";
      f1466[6] = "fX\u00014|\u0011zB\u0003hf\u0005jAHЪ";
      f1466[7] = "=#;I\u0003|!99\u0015\u0019h1:r\u0004\u001e{7\u007f?\b\u001cd3?8I2f?<=\t\u0015M3%=C0{5$1\u0002\u001f}\u00160(\u0006";
      f1466[8] = boolean.class;
      f1467[8] = "java/lang/Boolean";
      f1466[9] = "+w~o\u0013/7m|3\t;'n7\"\u000e(!+z.\f7%k}o 87qk \u0002.\u0007jt,\u00004 ";
      f1466[10] = "\n\u007fKG\u001f\u0016#FW]\u001dJ9RG^V[>AA\u001b\u000b]%GM[\u001f\u0016\u0002VPA\u0011V6\b";
      f1466[11] = "\u000bUKNj\b\u0015]Q\u0001\b\u0014\u0012@";
      f1466[12] = ";*\u0014(p\u00010%\u0005g\u0011\u000f;.\u0001=";
      f1466[13] = int.class;
      f1467[13] = "java/lang/Integer";
      f1466[14] = void.class;
      f1467[14] = "java/lang/Void";
      f1466[15] = char.class;
      f1467[15] = "java/lang/Character";
      f1466[16] = "\\\u000e\b1%\u0018B\u0006\u0012~H\u0002Z\u0003\u001b3\u007f\u0004Y\u0001";
      f1466[17] = "S\r\u0003b\u0011tO\u0017\u0001>\u000b`_\u0014J/\fsYQ\u0007#\u000el]\u0011\u0000b nQ\u0012\u0005\"\u0007E]\u000b\u0005";
      f1466[18] = "qTe\fO\u0018Xmy\u0016MDByi\u0015\u0006UEjoP[S^lc\u0010O\u0018y}~\nAXM#";
      f1466[19] = "\u0006,6\u0015p4\u0018$,Z\u00175\t?!\u000013";
      f1466[20] = "Z@\u0017r\u001feFZ\u0015.\u0005qVY^?\u0002bP\u001c\u00133\u0000}T\\\u0014r.\u007fX_\u00112\tTTF\u0011x uAZ\u001f8)qAS";
      f1466[21] = "1d\u0005\u0010Fd/l\u001f_\u000ed5f\u0007\u0018\u0007\u007fuF\u001c\u001f\u001bd6`\u0001";
      f1466[22] = "]?\u001c:*\u0013Zx\t}\u0013\u001dZ>6~y9P'\bju\u001eLBRd*\u0017U}\u0000ys\u001d7";
      f1466[23] = "I\u0010G.!B]AEc\u001dOH^W\u001f-NWNG{bI\u001e\u0017+";
      f1466[24] = "\u000e2\u0003\u0017#\fV/WJ[\u00170:\u001aH$\t\u000b5\u0016\u000b+r";
      f1466[25] = "P=tc5\"\u0002 -iWt\u00036M60o\u000f6)y7&VZp`:{\u001eg0mglo";
      f1466[26] = "0\u0005\u0010\u00043;s\u0016\u0006\rCҎ\t^V\u00043'9\u0005\u0011S~W3Y\f\u00133gh\u001e[^C";
      f1466[27] = "i@r\u0018\rS6Q6\u001ch\u0018?_\u000b\b\u000e\f.COTT\u001d3\u001f/\u001f\u0013\u0018l#~\u001bY\u001e+\u001et\u0002\b\u0004R";
      f1466[28] = "FndS\u001a?\u0019\u007f W\u007fs\u001aV%T\u001ei\u0012\rc\u0013\u0018\u007f\r=8TO2}";
      f1466[29] = "?\u0002g\u000ee\u0005m\u001f>\u0004\u0007Tg\u001f\u0013\u0002lZ\u0000\b\"\u00067\u0005r\u0017!\u0010`:1\u001bo\u0016~\u0007;\u0002>\f\u0007";
      f1466[30] = "X8*\u0003\u00184\u0003\u007f}Nhj\u0005\u007f(\u001a\u0014\u0004X8*\u0003\u00184\u0003\u007f}Nh>\u001fav\u0014\u0014o\u001ff5sR9\u0005u=C\t~R8M";
      f1466[31] = "Zt?~4h\u0005e{zQ1\u0019ooe=X[*es!h\u0000m2>Qc\u0002*\u007ffa<\u0013n{\u0003";
      f1466[32] = "\u001c5`d\u0001aN(9nc7O>\u0010e\u0007^I5;{\no\u001dncnccE??p^#Hb(\u0001";
      f1466[33] = "s$S]\u0001\n(c\u0004\u0010q^$\u007f[Q\u0011:x%JLMZ3bO\u0013q";
      f1466[34] = "-rw2_grc36:6pj'5FW'-4.\u00067lj1q:m+v:?\n6l!wO\u00014+l/\u007f^%ohJ";
      f1466[35] = "fs:\u0011\u001fr\"ch\u0012uk2z;qO0<o&A\u0014wk\"V";
      f1466[36] = "cD[_VH8\u0003\f\u0012&\u00139\u0010FfZxhEBN\u001a\u0018#\u0002G\u0011&\u0011=\u0017GM\u0017\u001ciC\u0005/";
      f1466[37] = "eE'\u0017<x5S<i>\u001c\"\u0002=\rn,+\u00019i,\"$XyY%! <";
      f1466[38] = "\u0015vU\t\b_\u00134PKuO\u0002)\u0016\u0012\u0018@\u0004=kH\u0012\u001f\u001d$T\u001a\u000fF\u0017F";
      f1466[39] = "LO1=\u001fi\u0013^u9z0\u000fTa&\u0016Y\u001eHb;\u0018h\u0013\u001c6yzb\u0014\u0011q%J=\u0005Uu@";
      f1466[40] = "R\u0007\u0007c\u001bc\u0011Z@1dЕn\r\u0000f\u0014b^VG1Y\u0012T\nZq\u0014\"\u000fM\r<d";
      f1466[41] = "*!\u0011\u001c}[-f\u0004[DU- 8L>W& `O9Kye\u0001H~^>\\";
      f1466[42] = "WP\u000e!*\u001f\u0005MW+HA\u0014ZM-4G\u00127[z$\u0011T\\O+&\\h";
      f1466[43] = "gZle\u0007\u000f7Lw\u001b\u0003\u0006=Nqr\u0010\u0006\u0000Rmg\u0005\u001b\u001fBpgl\u0001&R2\"\r\u0006aGu\u001bQ\r6Ez&\u0011\u0000kR\u000b&\n\u0006=R6f\u0007[*#4|U\u000e9\u001cfa\f\u0004[";
      f1466[44] = "'\u000enjOq|I9'?=gRl\u001a\u0005|zCy*^;-\u000e\t";
      f1466[45] = "\u0013\u0019i&/&\u0014^|a\u0016(\u0014\u0018^vs*y^%xf7I\u0005b/+G";
      f1466[46] = "\u0018\\+DP]HJ0:[9OYpE@\u0002@U3J;\bZ\u00141C\u0006\u0002CE+:";
      f1466[47] = "gw\u0006\bM|`0\u0013Otr`v2\\\b}jf\f1Kz4o\u0015\u000e\u0019gmew";
      f1466[48] = "W\u0000?n%b\u0013\u0010mmOz\u0012\u00102i)t\u000elnh\"{\u001bQ.e\u007flj";
      f1466[49] = "w8\u0001,r\u0005ci\u0003aN\u000er}+p>\u0012\u001b;\u000bp(\u001f&{\u0006-?n";
      f1466[50] = "D\u001907&z\u001b\bt3C+\u00047h2?;\u007fGk'%;B\u0007fz2J";
   }

   public static String $(String s) { return s; }
}
