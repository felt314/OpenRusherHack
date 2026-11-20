package org.rusherhack;

import java.util.Arrays;

public class Class506 implements Class140 {
   public int f8131;
   public boolean f8132;
   public String[] f8133;
   public static Object[] f8135 = new Object[24];
   public static String[] f8136 = new String[24];

   public Class506(int var1, String[] var2, boolean var3) {
      this.f8131 = var1;
      this.f8133 = var2;
      this.f8132 = var3;
   }

   @Override
   public String[] m6355() {
        return null;
    }

   @Override
   public String m6352(int var1) {
      return Class448.m14199(this.f8133[this.f8131 + var1], this.f8132);
   }

   @Override
   public String[] m6353() {
      Class506 var4 = this;
      if (!this.f8132) {
         return Arrays.copyOfRange(this.f8133, this.f8131, this.f8133.length);
      } else {
         String[] var6 = new String[this.f8133.length - this.f8131];

         int var5;
         for (int var10000 = var5 = 0; var10000 < var6.length; var10000 = var5) {
            int var10001 = var5;
            String var10002 = Class448.m14193(var4.f8133[var5 + var4.f8131]);
            var5++;
            var6[var10001] = var10002;
         }

         return var6;
      }
   }

   @Override
   public String m6354(int var1) {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
      f8135[0] = "\u000b\\\u0007^\\d\u0017F\u0005\u0002Fp\u0007ENɶ";
      f8135[1] = int.class;
      f8136[1] = "java/lang/Integer";
      f8135[2] = "f}\u001e+C@mr\u000fd>X~u\u0006-";
      f8135[3] = boolean.class;
      f8136[3] = "java/lang/Boolean";
      f8135[4] = ";Tq(jC'NstpW7M8ҙ";
      f8135[5] = "\"i;}e$WI0rtk*Q#u}\"B";
      f8135[6] = "7&@\n\u0012`+<BV\bt;?\tɐ";
      f8135[7] = "\u007f6\u0000V*Zc,\u0002\n0Ns/Iш";
      f8135[8] = "Fx^6aZ3XU9p\u0015N@F>y\\&";
      f8135[9] = "b\u000fbb\u001c>|\u0007x-s9z\u000fmp";
      f8135[10] = "GwB\t|\u001e2WI\u0006mQSYB\ri\u000b'";
      f8135[11] = "`F0=GO\u0015f;2V\u0000th09RZ\u0000";
      f8135[12] = "D9R\u0010i\u001bO6C_\b\u0015D=G\u0005";
      f8135[13] = "\r\u001c=\u0017_<[H0\u0012!;6\u0019>@SkFG,EAR\nJo\f\u0018\"TXj\u001e!";
      f8135[14] = "l\u000eRBzl`@\u001dXGĹQ\u0006\u0014\\+\"2V\u001fB$RhD\u0017H718O\tGG";
      f8135[15] = "\u0000\u0017pjbTYJsTԹnZ\u0017be9_\b\u001dh=Y";
      f8135[16] = "\u0016Be\u0016\"OO\u001ff(ɀuLBw\u0019yD\u001eH}A\u0019";
      f8135[17] = "\u0001t4\u000b-bQ\u007f*\u0004]`CB)\u001f!p85-^m<\u0000r\"\t$\u0001";
      f8135[18] = "vZ1\n\u0006\u001fz\u0014~\u0010;ȳKRw\u0014WQ(\u0002|\nX!q\n5\\\u0006\u00196\u0005b\u0015;\u00180\u0013`\u001cXH;\rol";
      f8135[19] = "/u\u0016w\u0015\u0003y!\u001brkɽ\u0014rEzWSj\"\u0015s\u0011";
      f8135[20] = "\u001c-Kl/\u0007F(J3W\u0010E:[M9!K.EgWDS%@6f\u0017X|Q\nnKRsJ;<AX+*3g\u000b\u0013\"\u001bam\u0001KB\u0015{0\u0011\u001esFpi\u0000\"";
      f8135[21] = "\u0004pAG(\u0011R$LBVɥ?w\u0012JjAA'BC,\u007f";
      f8135[22] = "\u0014P\nN\u00038B\u0004\u0007K}ӊ/PVWL6\u001e\u0002\\]\u0014";
      f8135[23] = "y:xQG /nuT9ҿB9u\u0001\tsz~zV@";
   }
}
