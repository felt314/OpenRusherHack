package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.core.utils.IOUtils;

import org.rusherhack.client.api.feature.module.impl.render.ESP;
public class Class245 extends outline {
   public static long f4356 = Class066.m4320(1162924422380113979L, 1031824891796396362L, MethodHandles.lookup().lookupClass()).m4325(14818703374451L);
   public static String[] f4357;
   public static String[] f4358;
   public static Object[] f4360 = new Object[37];
   public static String[] f4361 = new String[37];

   @Override
   public void m6551() {
        
    }

   public Class245(ESP var1) {
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
   public static void m786() {
      f4360[0] = "Nh]x@+Rr_.Z?Bq\u0014Ѓ";
      f4360[1] = int.class;
      f4361[1] = "java/lang/Integer";
      f4360[2] = void.class;
      f4361[2] = "java/lang/Void";
      f4360[3] = "L\u0013\u0006LbfP\t\u0004\u0010xr@\nO˼";
      f4360[4] = "\u0006@K,*\f\u001aZIp0\u0018\nY\u0002a7\u000b\f\u001c_g,\r\u0000\\K,\u001a\u0016\u0006^Ic6*\fFXk6\u001e";
      f4360[5] = "Y\u0013/\u0017\u0017XE\t-K\rLU\nfɍ";
      f4360[6] = "\u001cu\u0007\u001bGx\u0017z\u0016T:`\u0004}\u001f\u001d";
      f4360[7] = "gB\u001fv\u001d5{X\u001d*\u0007!k[V;\u00002m\u001e\u000b=\u001b4a^\u001fv!5eR\u001d*<%|D\u00116\b";
      f4360[8] = "4v\u007fRVk(l}\u000eL\u007f8o6\u001fKl>*m\bMr(*Q3qj2hk";
      f4360[9] = "\u0002\u000e8@l{\u001e\u0014:\u001cvo\u000e\u0017qɨ";
      f4360[10] = "5k\u000b\u007f:G)q\t# S9rBž";
      f4360[11] = float.class;
      f4361[11] = "java/lang/Float";
      f4360[12] = "\u0012.bR\u0001K\u0019!s\u001dmH\u0017#qRA";
      f4360[13] = boolean.class;
      f4361[13] = "java/lang/Boolean";
      f4360[14] = "q6'\f(gm,%P2s}/nA5`{j3G.fw*'\f\u001f|k)\u0013G.fw*'";
      f4360[15] = ";GCK\u0010?']A\u0017\n+7^\nƒ";
      f4360[16] = "'i\u0014pl\u000e;s\u0016,v\u001a+p]=q\t-5\u0000;j\u000f!u\u0014pM\u001e<o\u001a0y";
      f4360[17] = ".qj?{1%~{p\u001a?.u\u007f*";
      f4360[18] = "y|V]\f\u0011rsG\u0012k\u0013gxGYP";
      f4360[19] = "pK8=+\u0003wAhTՕagEc$0\u0019b\u001b;Tb\u0004c\u001aq1c\u0010s\u0012\u0003";
      f4360[20] = "z+s\u0015\u001b{}#*P}ї@{l\u0015@:.&{F\u0010";
      f4360[21] = "E@\u0012#\t]\u0011_\u0013pfǑ~\u0001\u000bx\u0018\u001c\u000e\\\r`Y%BG\u0013d_U\u001fA\u000b%f";
      f4360[22] = "\u00056\u0010\u0007\u0003\u0005\u0002>IBeԷ?aJQ[M@6\u001b\b\u0000";
      f4360[23] = "xr2\u001c\u001d\b o?\b'JE3+\u0014Y_5n-\f\u0018fyu3\b\u001e\u0016$s+I'";
      f4360[24] = "\u00189*04/J+!~Oż&j+#1.V7-;p\u0017Ofj(?uHl:A";
      f4360[25] = " Oo\u001f4\u0000'G6ZRҭ\u001a\u001fp\u001foAtBgL?";
      f4360[26] = "\u0000?R\r\u001b@\u00077\u000bH}Ӥ:h\b[C\bE?Y\u0002\u0018";
      f4360[27] = "J'Lb+`Ow\u0003b\u001bg\u000fv\u001czrdudC|kk\ra\u001d$\u001b";
      f4360[28] = "k%\b\u000e#Ql-QKEȎQu\u0017\u000ex\u0010?(\u0000](";
      f4360[29] = "\u0018\u0013n\u001f4:\u001f\u0019>vɻXA\u0012:\b;:KGi\u0016Da\u0014Y4\u0004!`\u0000I<v";
      f4360[30] = "{xpR\u000eZ;{%\u0013gA,m~@\u000eM\u0015c~P\n+zm CW@1:h\u001dg";
      f4360[31] = "+\u0002nI;{,\b> ǽ\u0019sUoN{r8\u0002'\u0010K 'H4R.!3X< ";
      f4360[32] = "iLWr\u0003qnD\u000e7e9S\u001cHrX0=A_!\b";
      f4360[33] = "\n\\icz-\rT0&\u001cȗ0_g8w-V\u0007c5-";
      f4360[34] = "zpm38Ql4a1@Ӫ\u0010sd2\u007f\n*tlk:";
      f4360[35] = ";c\n+\u0016\u000en,Prv\\<.j!\u0012N<R_%\u0007_+?Rx\u0013JQ";
      f4360[36] = "\u0007K\td|9\u0003YUfF&\nJ;k\":\u00016\u001b<&7\u0007N\u001eb~G";
   }
}
