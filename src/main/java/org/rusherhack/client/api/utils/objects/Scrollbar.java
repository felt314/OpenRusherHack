package org.rusherhack.client.api.utils.objects;
import org.rusherhack.*;

import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.utils.MathUtils;

public class Scrollbar {
   public double f1145;
   public Animation f1146;
   public double f1147;
   public static String[] f1148;
   public static Object[] f1150 = new Object[29];
   public static String[] f1151 = new String[29];

   public void update() {
        
    }

   public double getRenderOffset(double var1, double var3, double var5) {
        return 0.0;
    }

   public Scrollbar(Animation var1) {
    }

   public void clamp(boolean var1, double var2, double var4) {
        
    }

   public double getScrollOffset() {
        return 0.0;
    }

   public void scroll(double var1) {
      boolean var10004 = true;
      this.scroll(var1, true);
   }

   public double getRenderOffset(double var1, double var3) {
      return this.getRenderOffset(var1, var3, var1);
   }

   public double getRenderHeight(double var1, double var3, double var5) {
      var1 /= var3;
      return var5 * var1;
   }

   public void scroll(double var1, boolean var3) {
        
    }

   public void setScrollOffset(double var1) {
        
    }

   public double getRenderHeight(double var1, double var3) {
      return this.getRenderHeight(var1, var3, var1);
   }

   public static void m2706(String[] var0) {
      f1148 = var0;
   }

   public static String[] m2707() {
      return f1148;
   }

   static {
    }
   public static void m122() {
      f1150[0] = "AT\u0004?\u0011\u0005]N\u0006c\u000b\u0011MMMr\u000f\u0019KH\u0017?\u0002\u0000G\b\u0016e\n\u001c]\b\fs\t\u0015MR\u0010?0\u0013\\I\u000f}\u0001\u0011\\";
      f1150[1] = double.class;
      f1151[1] = "java/lang/Double";
      f1150[2] = "93F\fTa%)DPNu5*\u000fɖ";
      f1150[3] = "47\\NrQA\u0017WAc\u001e<\u000fDFjWT";
      f1150[4] = "@6i\u0004,A\\,kX6UL/ I1FJj{^7X\\jCK*\\z0gF-";
      f1150[5] = boolean.class;
      f1151[5] = "java/lang/Boolean";
      f1150[6] = void.class;
      f1151[6] = "java/lang/Void";
      f1150[7] = "\u0011\u001d@+\u0015a\r\u0007Bw\u000fu\u001d\u0004\tf\bf\u001bAFk\u000ey\u001f\u001bNj\t:?\u0001Nh\u0006`\u0017\u0000I";
      f1150[8] = "}<k\r(+\b\u001c`\u00029du\u0004s\u00050-\u001d";
      f1150[9] = "f\u0000k\u00181\u0002m\u000fzWL\u001a~\bs\u001e";
      f1150[10] = int.class;
      f1151[10] = "java/lang/Integer";
      f1150[11] = char.class;
      f1151[11] = "java/lang/Character";
      f1150[12] = "!'J.~E*([a\u001fK!#_;";
      f1150[13] = "\u0012\u0001\u0014L<\u001bAT@\u0007@RK\u0004\u0000}}FJ\\\rL.\u0013\u001e\u0017q";
      f1150[14] = "xLY(\u0017\u0002t\u0015URF_m.W4E_k4W3FRmt\u0003jO\r`M\u0006.SN\u0011M\u00024\u0016C(HF(U2(L\\mX\u000b-\b@.)\u000b)\u0012\u0005#\u0010\u000em\u000eFR";
      f1150[15] = "O2\u001dJ\u000b\u001aCk\u00110҄*\u001f2\u0018\u000fD\u0013\u001av\u0004L";
      f1150[16] = "S\b+\u00029\"_Q'xn\u0012\u0000\tsC:qPLt\u0015\u0007(\u0003\u000bsEdxF\f%x";
      f1150[17] = "B\u0014:\u001e<$NM6dУ\u0014\u0016@<U~%E\u0015h\u001e";
      f1150[18] = "QnYe\u0016J]7U\u001fS\u0011B1^{(C\u00000\u0005n\u0011FD,F\u001f\u0013\u001aJ:_pL\u0000Sn:#L\nD4_.\u0011\u0017ZV";
      f1150[19] = "\b;Zk4?\u0004bV\u0011eb\u001dYTwfb\u001bDW\u007fqb\u001d\u0003\u0000)l0\u0010:\u0005mpsa:\u0001w5~X?Ekv\u000fX;_.{6]\u007fCm\n6Ye\u0006`33\u001dyE\u0011";
      f1150[20] = "^'pkCT\u000e)|+$A\r-ckD%_ kiKB\f1nh$";
      f1150[21] = "tZFo\f*x\u0003J\u0015\u0557\u001a#XT%Ces\u0000Fi2&y\u0012YwW+$\u000fG\u0015";
      f1150[22] = "d\t'ND\n7\\s\u00058T4\u0019BF\u0000]f\u0014{CDA%e";
      f1150[23] = "P_m3&v\\\u0006aIȽF\u0000_hvi\u007f\u0005\u001bt5";
      f1150[24] = "\u0017D_o\u001d~D\u0011\u000b$a5GSF7\u001b3*\u0015V;P3\u001bF\u0003o\u001bO";
      f1150[25] = "l[\u0003=\u0000g`\u0002\u000fGƫW;Y\u0011wO(k\u0001\u0003;>";
      f1150[26] = "%z\u001a\u0016`X`>\u000b\u0016\u0002@x8\n\tzFz-\u001b\u001e\u0002\u0018&\"X\u0002;\u001db>\u001bs;\u0019x{\u0016J>]d8gJ:G!5^O~[bD^Kd\u001eo}[\u000fx]\u001e";
      f1150[27] = "#{\u0004X\u0005ssu\b\u0018bi}~\u0002m\u001e\u0002\"|\u001fZ\reqm\u001a[b=zt\u001bD\u0019{d)\u001c$";
      f1150[28] = "\r`v_\u001amH$g_x\u007fR7nBx-\u000e84KA(J.w:A,Paz\u0003DhL\"\u000b\u0003@r\t/2\u0006\u0004nJ^2\u0002\u001e+Gg7F\u0002h6";
   }

   public static String $(String s) { return s; }
}
