package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.bind.BindManagerBase;

import org.rusherhack.command.bind;
import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class304 extends Class236 {
   public static long f5029 = Class066.m4320(8114484868473733635L, -1445059056514832887L, MethodHandles.lookup().lookupClass()).m4325(71665319674664L);
   public static String f5030;
   public static Object[] f5031 = new Object[19];
   public static String[] f5032 = new String[19];

   public Class304(Enum186 var1, String var2) {
      super(var2);
   }

   @Override
   public String m6376() {
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
      f5031[0] = "e7\u000fw*\u000ey-\r+0\u001ai.F:7\tok\n06\u001f$\u0007\u00017<6k+\t>=\tH$\u001b<";
      f5031[1] = "b#P\u0017\u007fTi,AX\u0002Lz+H\u0011";
      f5031[2] = "\u0017|\t4\u0010\u0017\u000bf\u000bh\n\u0003\u001be@Ȝ";
      f5031[3] = int.class;
      f5032[3] = "java/lang/Integer";
      f5031[4] = "5Cm0BK5CzlND/\bzrNQ(y.*\u0019";
      f5031[5] = "Iz\u0019\u000f6.Iz\u000eS:!S1\u000eM:4T@\\\u0016ku";
      f5031[6] = "W\u001bDU`tK\u0001F\tz`[\u0002\r\u0018~h]\u0007WUsqQGd\u0017}cY\u0005P";
      f5031[7] = "XK\u0019W\u0005UXK\u000e\u000b\tZB\u0000\u000e\u0015\tOEq^HX";
      f5031[8] = "r{b!eTna`}\u007f@~b+ɖ";
      f5031[9] = "9.fy\u000b\u000f%4d%\u0011\u001b57/ȣ";
      f5031[10] = "\f<|9\u0017\n\u00073mvv\u0004\f8i,";
      f5031[11] = "2\u001a]]\u001ezq\u001aIK$det\u0018AO{>J[AUo";
      f5031[12] = "T\u001a-:uqLO)]&K\u0004\u001d!&06S\u00153a\nr\u0005G8gw%\rU\u007f]";
      f5031[13] = "'L+[*zcT/DTԥ\u001e\n\u007fZ)\u007f\"\n1@/E";
      f5031[14] = "\u001d\u0019`/DsJ\u0011rh~pME\u007f99`$\u001b37\u00034\u0018\u001b}-\u0005\u000e\u001d\u0019`/DsJ\u0011rh~";
      f5031[15] = "?0%{\u007f\u0005|3&c\u0019\u001fh>#au-:y\u007f:\u0019F>+yma\u00185z8\u0006";
      f5031[16] = " |\u001eBGV~{\u0005_(]\u001d?\u0012SUUr;\u0006UY4#q\u000fCI['e\tO(";
      f5031[17] = "+\f~B\u00143h\fdV$cv\u0011qTs4(F)8\u001e\u007fq\u0001sG]|r\u0019";
      f5031[18] = ":\u0007sQ/\u001fd\f\"\u0010D\u0002k@z\f(09\u0001*UD]7_gQx]yEak";
   }
}
