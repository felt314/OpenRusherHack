package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.setting.NumberSetting;

public abstract class ResizeableHudElement extends HudElement {
   public double f653;
   public double f654;
   public NumberSetting<Double> sizeOfThisHudElement;
   public boolean f656;
   public double f657;
   public static long f658 = Class066.m4320(8680808111181620567L, -6400881252293463032L, MethodHandles.lookup().lookupClass()).m4325(129197133873919L);
   public static String[] f659;
   public static String[] f660;
   public static Object[] f662 = new Object[51];
   public static String[] f663 = new String[51];

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public boolean shouldUpdateAlignment() {
        return false;
    }

   @Override
   public double getScale() {
        return 0.0;
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public boolean isResizing() {
        return false;
    }

   public ResizeableHudElement(String var1) {
    }

   public boolean isHoveredOverIndicator(double var1, double var3) {
        return false;
    }

   @Override
   public void mouseMoved(double var1, double var3) {
        
    }

   static {
    }
   public static String m1491(byte[] var0) {
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
   public static void m1499() {
      f662[0] = "\u0019\u0010a\u0001X;\u0005\nc]B/\u0015\t(LF'\u0013\fr\u0001K>\u001fL`JK:\u0003\u0010c\u0001B;\u0012LTJY'\f\u0007gMF+>\u0017bjF+\u001b\u0007h[";
      f662[1] = "\u0000c_508\u001cy]i*,\fz\u0016x-?\n?K~69\u0006\u007f_5\f8\u0002s]i\u0011(\u001beQu%";
      f662[2] = "F3{eS&M<j*9%Y0aa";
      f662[3] = double.class;
      f663[3] = "java/lang/Double";
      f662[4] = "7D\"H$)+^ \u0014>=;]k\u00059.=\u00186\u0003\"(1X\"H\u00059,B,\b1";
      f662[5] = "K 3$<O@/\"k]AK$&1";
      f662[6] = "TZ4(~\u0001H@6td\u0015XC}e`\u001d^F'(m\u0004R\u00065cm\u0000NZ6(d\u0001_\u0006\u001bsh1WM>cb\u0000";
      f662[7] = "9\u0012M[(\\L2FT9\u00131*US0ZY";
      f662[8] = ",l0<FX0v2`\\L uyqXD&p#<U]*01wUY6l2<\\X'0\u001fgPh/{:wZYg_;{SC.{9f";
      f662[9] = boolean.class;
      f663[9] = "java/lang/Boolean";
      f662[10] = void.class;
      f663[10] = "java/lang/Void";
      f662[11] = "n7\u0000\b(fr-\u0002T2rb.Iɒ";
      f662[12] = "_YdV\u0007;CCf\n\u001d/S@-\u001b\u0019'UEwV\u0014>Y\u0005v\u0011[\u001dSJo\u001d\u0011\u000b\\Nn\u001d\u001b:rJp\u001d";
      f662[13] = " %\u0019\u001c[z<?\u001b@An,<PQEf*9\n\u001cH\u007f&y\u000b[\u0007x&9\u001a]^!\u0018>\u0010VFx\f8\u0010FLa;\u001f\u001f\\Mc*%<SZj";
      f662[14] = "^\u0011Q'J4U\u001e@h7,F\u0019I!";
      f662[15] = "<MVn\u0019E WT2\u0003Q0T\u001f#\u0004B6\u0011W%\nD&MTn\"v6^E5\u0019U\u0010P_&\u0002W&MP\"\u0007U";
      f662[16] = "\u0017\u001d\u0013S\u0010z>$\u000fI\u0012&$0\u001fJY7##\u0019\u000f\u000418%\u0015O\u0010z\u001f4\bU\u001e:+j";
      f662[17] = "\"C\u001bfv,>Y\u0019:l8.ZR+k+(\u001f\t<m5>\u001f,)m+";
      f662[18] = "\u0010\u000b~!\u001c9\f\u0011|}\u0006-\u001c\u00127l\u0002%\u001a\u0017m!\u000f<\u0016Wlf@\t\u0013\u001ctj\u00008=\u0018jj";
      f662[19] = "[\u0012y85\u001cP\u001dhwV\u0011E\u001b";
      f662[20] = "0 [G Z89\u001d\u0018\u0011Xm;~MxSm+zG}K`G\u001f\u001bcGcvBL-Z\u0000";
      f662[21] = "+\u001bSc\u001e\nwJMguZu\u0006Z8\u0018h{\u001fM1u\f/\t@?DQxG]\\";
      f662[22] = "Y,M+\u0006XY|K2:\r\b=`/[\r\u0003$D-Fb[xYu@\u001aY%I2:";
      f662[23] = "\u0006x\u0015_rA\b6Fbɲp\r:[\u0012\u007fAPm\u0015\u000f";
      f662[24] = "\u0012X\u001b)-P\u001c\u0016H\u0014\"\u001ayJ\\u1\u0000EH'*%\fAF\u001ax;_\u001e'";
      f662[25] = "!\u0015^4k@!EX-W\u0015p\u0004a(>\u0000a(:nj\bm\u001b\u000b3=Fpx";
      f662[26] = "<I\u000ft}\u001c2\u0007\\Iʹ-7\u000bA9p\u001cj\\\u000f$";
      f662[27] = "?PT{i-hBF$\u0000-9^r+l>4\"\u0017wr27\u0013J </T";
      f662[28] = "U?D\u001f/\u001aUoB\u0006\u0013I\r3O\u0019vM\u000f. A*PW(XCw@\u0010";
      f662[29] = "\u000ba%P<D\u0005/vmǛu\u0004xt\u000f3HVf'P";
      f662[30] = ".Jp\u0013\u0012.)@dX#l*C|Y_{=wp^_w!Cf\"Io{\u0011'M\u001ex\"\\\u001d\u001cQk*OgR\u001e}:,";
      f662[31] = "h8J|2H89S$P\u0019\u0002.\u0013}.P<-\u0010,05kx\u0011>5\u000bh{@ P";
      f662[32] = "Y2'qRa\u000e246bk\rq\b&\u0006m\r\rlr\u0010`\u0003<1%^}`30\"\u0000q]a.q_\u0010^k;-\u0003-\fuhrb.\u0012p;,\u0018`]f+O";
      f662[33] = "\u0010*(X\u0002(G*;\u001f22M|<\u001ew8O\u0015`YCg\u0019d7YP )";
      f662[34] = "bK\u0002C*6?\u0017]\u001aX#4\u000bm\u0014<14w\u000fGd*%GA\u0018h2Y";
      f662[35] = "P\u0006\u0007AKvF\u0001AZ&s]\u0000|\u0018\u001bdL\u0005MEL*QfF\u001fTf_W\u001bH\u001a{<\\APVu\r\u0001\u0016\u001eK\u0016";
      f662[36] = "+\\\u0001i\u0011h)\u0001\u0011.k}l\u0018\u00183\u0010\u0010)_M1\u0017 g\u0000A)k.s\b\u00136V|m[LW";
      f662[37] = ".\u001bd;x& U7\u0006ʮ\u0017&[)8&fq[:\u007f";
      f662[38] = "\u0000\u000e\u007fih/\u0000^ypTɉ<^p0=eN\u001di1n\u0015";
      f662[39] = "|\ry~t;t\u0014?!E9!\u0016\\t,2!\u0006Gr$9,\u0016\u0007%x$<\t6x/j!j";
      f662[40] = "OZ\u0001\rwH\u0018H\u0013R\u001eHIT8Q\u007fHDTx\u0006#UTKI[t\u001bI(";
      f662[41] = "\u0011(\u000fxE\u0014@-\u0019e>C *T?@\n\u001e)Wn^oI|V|[QJ\u007f\u0007b>";
      f662[42] = "iW\u0018Z\r\u0017i\u0007\u001eC1B8F'FXW)k|\u0000\f_%YM][\u00118:";
      f662[43] = "*R^+bL(\u000fNl\u0018hS3yQUzHk\u0010,h\nn\u0013\u0012qxM";
      f662[44] = "2[MfmG2\u000bK\u007fQ\u0016iLSk:\u0001VQRg-\u001ciP)8h\r0LQ:5\u001dw6\u0017?!CtN\u0015b1\u0004\u000e\b[{<\u001etF\u0014m,}";
      f662[45] = "wh\u001f^p\u0010 h\f\u0019@\u0000(<\u0014\r%\f(+\u0007\u0004@[s%\u001e\u0003q\u0006$k\u0003`y^?i^\u0011.^,.n";
      f662[46] = "\u0000Bp\u0017\u0013.\u000e\f#*\u001cdqZ2G\u0007r]z2G\u0007^WQ-A\u0014cVGL\u0010@mA^}M\u0017#\\=v\u0017\u000foR\f+@Ar1\u0003*G\u001f~\fQ4\u0014@\u001f";
      f662[47] = "vy3,e\u0012x7`\u0011a#xw~\u007frC$b5+\u000b\u001c6wahk@#<5\u0011";
      f662[48] = "TAH\u001c~+Z\u000f\u001b!ձ\u001a_\u0003\u0006Qs+\u0002THL";
      f662[49] = "5u?Y|Z#ryB\u0011_0eD\u0000,H)vu]{\u00064\u0015~\u0007cJ:$#P-WY/yHaYhr.\u0006|:";
      f662[50] = "\u000fd\u0004\n2\nS5\u001a\u000eYH_`\u001aX\u001eX6>ZG)U\u0007c\r\t46\u000fd\u0004\n2\nS5\u001a\u000eY";
   }

   public ResizeableHudElement() {}
}
