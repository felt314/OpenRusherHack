package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.misc.Enum186;
public class Class441 extends Class236 {
   public static long f7264 = Class066.m4320(6660967096299402558L, -6469853092590116169L, MethodHandles.lookup().lookupClass()).m4325(39376626830539L);
   public static String f7265;
   public static Object[] f7266 = new Object[20];
   public static String[] f7267 = new String[20];

   @Override
   public String m6376() {
        return null;
    }

   public Class441(Enum186 var1, String var2) {
      super(var2);
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
      f7266[0] = "RG5\u0013\u001a\u0015N]7O\u0000\u0001^^|ՙ";
      f7266[1] = "W_s\u0003-N\\PbLPVOWk\u0005";
      f7266[2] = "VX\u00032D\fJB\u0001n^\u0018ZAJȚ";
      f7266[3] = int.class;
      f7267[3] = "java/lang/Integer";
      f7266[4] = "Y@*9?\u0019Y@=e3\u0016C\u000b={3\u0003Dzi#d";
      f7266[5] = "3\u0001u_S\u00113\u0001b\u0003_\u001e)Jb\u001d_\u000b.;0F\u000eJ";
      f7266[6] = "%j@/?f9pBs%r)s\tb!z/vS/,c#6`m\"q+tT";
      f7266[7] = "d\u000e,[z9d\u000e;\u0007v6~E;\u0019v#y4kD'";
      f7266[8] = float.class;
      f7267[8] = "java/lang/Float";
      f7266[9] = "p<3OtZl&1\u0013nN|%zф";
      f7266[10] = "'LKS-\";VI\u000f76+U\u0002ȉ";
      f7266[11] = "()uP&U#&d\u001fG[(-`E";
      f7266[12] = "c\n{x\u0003l9S.\u0007Ӣ\ff\f\u007fh\u0002v?W~m;5f\n/>Al=\u000b*\u0007";
      f7266[13] = "qL(Jtcp\f|N\u000b>&6\u007fM6<sU,\u001eg!";
      f7266[14] = "afa\u001c]\u00138=`\u0019d\u00171;#\u001e#\u0007Xb8\u0010\u001a\u0014:ebJ\u0006iafa\u001c]\u00138=`\u0019d";
      f7266[15] = "],|6d\u0019\u001a(uz\u0016Ƞdl~vtI\u0001m~)hy";
      f7266[16] = "\u001e\b\u000f%`k\u001f\u0014L+QnH\n\u001d'=\\\u001aKMqQ6C\u0015\u0003=31\u0019O\u001f@";
      f7266[17] = "\u0012:0_\u0000>R,-B8m,a4Y\b>Mg.Y\u0001\u0004\u0013:)\u0010\u0002e\u0015 )\u00198";
      f7266[18] = "Eaf3\u00134\u0011(x;sa\u0013-|:\u001fSAj as?\u0000#yl\u0013>\u001c`w]";
      f7266[19] = "t:\u001fVNL'iNKpA(nF]'\u0016v9\u001e1K\u001f3mB\u0001\u001fV-e";
   }
}
