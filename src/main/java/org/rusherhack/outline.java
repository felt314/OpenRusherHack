package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.core.command.exceptions.CommandException;

public abstract class outline extends passthrough {
   public static long f6991 = Class066.m4320(-3814742400415394342L, -4273230742571745211L, MethodHandles.lookup().lookupClass()).m4325(275471113354273L);
   public static String[] f6992;
   public static String[] f6993;
   public static Object[] f6995 = new Object[34];
   public static String[] f6996 = new String[34];

   @Override
   public void m6551() {
        
    }

   public outline() {
      super("outline");
   }

   static {
    }

   public static String m171(byte[] var0) {
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
   public static void m157() {
      f6995[0] = "\u0011D\u0000e7\u0002\u0011D\u00179;\r\u000b\u000f\u0017';\u0018\f~Gzj";
      f6995[1] = "\u0013\u001eMzvX\u0013\u001eZ&zW\tUZ8zB\u000e$\bd/\u0000";
      f6995[2] = "C\u001b=u,g_\u0001?)6sO\u0002tɝ";
      f6995[3] = "4V%\nAz?Y4E<b,^=\f";
      f6995[4] = "a1\u0013`E4}+\u0011<_ m(ZЛ";
      f6995[5] = "\",}\u0016'p>6\u007fJ=d.54Ѱ";
      f6995[6] = "I7Q-P\u0013U-SqJ\u0007E.\u0018ƽ";
      f6995[7] = "\u0002\u0018Wgu\u001c\u001e\u0002U;o\b\u000e\u0001\u001e*h\u001b\bDS&j\u0004\f\u0004Tgb\u0011\u000e\u000f@=n\u0006\u0003\u0019\u001e\nh\u0004\u0000\u000b^-B\u0011\u000e\u000f@=n\u0006\u0003";
      f6995[8] = float.class;
      f6996[8] = "java/lang/Float";
      f6995[9] = void.class;
      f6996[9] = "java/lang/Void";
      f6995[10] = "L@vG\u0016TPZt\u001b\f@@Y?\n\bHF\\eG\u0005QJ\u001cV\u0005\u000bCB^b";
      f6995[11] = int.class;
      f6996[11] = "java/lang/Integer";
      f6995[12] = "8CK\b\n\u0004$YIT\u0010\u00104Z\u0002ʕ";
      f6995[13] = long.class;
      f6996[13] = "java/lang/Long";
      f6995[14] = ">pkzsv\"ji&ib2i\"7nq4,\u007f1uw8lkzRf%ve:f";
      f6995[15] = "V\u0007B\u001a\u001d^]\bSU|PV\u0003W\u000f";
      f6995[16] = "Y!FD.BR.W\u000bC@G%W@x";
      f6995[17] = "-Ep\u000b\u0018\u0017&JaDe\u00024Pc\u0007";
      f6995[18] = "0^\u000b1[I,D\tmA]<GB|FN:\u0002\u001fz]H6B\u000b1gI2N\tmzY+X\u0005qN";
      f6995[19] = "QrC\r$\u001b]u^7y\u001bJ/H[KL\fq\u001f\f\u001cO\u0007$Q]{\u0011F3T7";
      f6995[20] = "\nq$h\u0006/Tsnqwī3;}c\u0011-\\dji\u0006@\t}f2NzRa{jw";
      f6995[21] = "V7D1\u0001D\t<Y=\u007fĠmh]?\u0019\u0017\u00027J5\u000ezW;[6\u0012\u0015\b,Q!\u007f";
      f6995[22] = "BHR53\u0014\u001dZ\u000e1RШ~\u001b\u0003m4\b\u0003D\u001110";
      f6995[23] = "\u0005\u0019X|p\u0003\u0001@@c\u0001V8\u001eIkg\u0017WA^apz\u0002MObl\u0015]ZEu\u0001";
      f6995[24] = "sq\u001b\u0004\u0017n(m\u0006\\.ɫI3T\u0000\u001fl7u\u001b_ETwl\fXU($7\u0015\n.";
      f6995[25] = "\"';i\u0000q&~xkdvv\u001e$&\b)%s(!\u0015";
      f6995[26] = "\"O \u0013/L|\u000e7\u0016ENv\u0002+\n)|'CsSE\u001b&\u0004'\u0000~T%\u0012'm";
      f6995[27] = "\u0012dI3P3^~\\>:Ǜ\")Rx\\uAs\u0001?C";
      f6995[28] = "\u0003TH*w\u0017]\u0015_/\u001d\u0015W\u0019C3q'\u0006Y\u0013e\u001d@\u0007\u001fO9&\u000f\u0004\tOT";
      f6995[29] = "Roj7B,\tswo{Ӏh-%3J.\u0016kjl\u0010\u0016V.\"8Ch\u0010a}b{(\tvzr\u0007{Ro(\t";
      f6995[30] = "\tc!V\naEa$Q41Uf\u0001QP#U\u001a6V]\"\u0005qa\u0004\u000b98";
      f6995[31] = "\u001fv\u001fc\u0011)N2\bl,q\u00131?dHm\u0018MQ0V|\u0018v\u001e3@|u";
      f6995[32] = "la*-+pzq #Agzq+.'p[j4.\u0004mco08A=np78\"g=7(C";
      f6995[33] = "t\\+.\u0011\u0019+Nw*pΞHXtwI\u001bv\u0003/7\u000f";
   }
}
