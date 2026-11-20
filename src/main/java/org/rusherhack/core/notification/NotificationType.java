package org.rusherhack.core.notification;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.Class467;
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;
import org.rusherhack.core.setting.Setting;

public enum NotificationType {
   ERROR,
   INFO,
   DEBUG,
   WARNING,
   HINT;

   // $VF: synthetic field
   public long f1648;
   public int f1649;
   public static Setting[] f1650;
   public static long f1651 = Class066.m4320(-5093619790323991456L, 5169098760448287239L, MethodHandles.lookup().lookupClass()).m4325(273919682094486L);
   public static Object[] f1652 = new Object[38];
   public static String[] f1653 = new String[38];

   public long getLifeSpan() {
        return 0L;
    }

   public int getTypeID() {
        return 0;
    }

   public static NotificationType fromTypeID(int var0) {
        return null;
    }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   NotificationType(int var3, long var4) {
      this.f1649 = var3;
      this.f1648 = var4;
   }

   public static void m2659(Setting[] var0) {
      f1650 = var0;
   }

   public static Setting[] m4024() {
      return f1650;
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
      f1652[0] = "\u0010\u000b\u0001m\bH\f\u0011\u00031\u0012\\\u001c\u0012H \u0015O\u001aW\b,\u000eT\u0019\u0010\u0005\"\u000eT\u0010\u0017H\r\u0015I\u0016\u001f\u000f \u001bI\u0016\u0016\b\u0017\u0003M\u001a";
      f1652[1] = int.class;
      f1653[1] = "java/lang/Integer";
      f1652[2] = "O\u0010O-\u000e*S\nMq\u0014>C\t\u0006`\u0013-EL[f\b+I\fO-/:T\u0016Am\u001b";
      f1652[3] = "szg\u000bd\b\u0006Zl\u0004uG{B\u007f\u0003|\u000e\u0013";
      f1652[4] = "F?%\"5Ho\u0006987\u0014u\u0012);|\u0005r\u0001/~!\u0003i\u0007#>5HN\u0016>$;\bzH";
      f1652[5] = "+B=R|t7X?\u000ef`'[tȈ";
      f1652[6] = "/ *R&N\u0006\u00196H$\u0012\u001c\r&Ko\u0003\u001b\u001e \u000e/\u000f\u0000\u0005#I\"\u0001\u0000\u0005*No.\u001b\u0018,F(\u0003\u0015\u0018,O/4\r\u001c \u001b";
      f1652[7] = "\u0016\f56Nzc,>9_5\u001e4->V|v";
      f1652[8] = void.class;
      f1653[8] = "java/lang/Void";
      f1652[9] = "hu\u0002Q\f\u001fAL\u001eK\u000eC[X\u000eHER\\K\b\r\u0018TGM\u0004M\f\u001f`\\\u0019W\u0002_T\u0002";
      f1652[10] = "|(OQa\u0015`2M\r{\u0001p1\u0006\u001c\u007f\tv4\\Qr\u0010zt]\u0016=\u0017z4L\u0010dND3F\u001b|\u0017P5F\u000bv\u000eg\u0012I\u0011w\fv(j\u001e`\u0005";
      f1652[11] = ".\r\b\u001f9w%\u0002\u0019PDo6\u0005\u0010\u0019";
      f1652[12] = "SM[\u001450OWYH/$_T\u0012Ѳ";
      f1652[13] = "%df\u00016I\f]z\u001b4\u0015\u0016Ij\u0018\u007f\u0004\u0011Zl]?\b\nAo\u001a2\u0006\nAf\u001d\u007f)\u0011\\`\u00158\u0004\u001f\\`\u001c?3\u0007XlH";
      f1652[14] = "\u000eU+\u000376'l7\u00195j=x'\u001a~{:k!_>w!p\"\u00183y!p+\u001f~V:m-\u00179{4m-\u001e>L,i!J";
      f1652[15] = long.class;
      f1653[15] = "java/lang/Long";
      f1652[16] = "\u0001\u0003R$Ft\n\fCk-v\u001e\u000f";
      f1652[17] = "{BSFV;pMB\t;;pPV";
      f1652[18] = ";\u0006KM>V0\tZ\u0002_X;\u0002^X";
      f1652[19] = "6$rp\u001filb/\u0019J?q\u0002eaH\u0013A^-(D\"i#-}Z>\r";
      f1652[20] = "#Z\u0003\u0015,Ay\u001c^|Čz!\u0011\u0004\fr\u0007!D\u001a\u0010";
      f1652[21] = "\u001a- rkZ@k}\u001b\u001c;{\u0010\u001c\u001bj\u001bG>| 0]\u001a";
      f1652[22] = "\u0018\u001a\u0005\u0018\u0002\u007f\u001d\u0014\r\u00033դ!U\u0003\u001d\b;[\f\u0003\u0010H\u0005";
      f1652[23] = "\u0005=\u0000gun_{]\u000e҂U\u0000 \u001cw**\u0003|\rkOhF*\u0004qvn_:Y\u000e";
      f1652[24] = "<^R\u0003 \u000bf\u0018\u000fjZqAx4Q`Vn\u001e\u000f\u000b&\u000b";
      f1652[25] = "Z\u001d\u007fY2J\u001e\u0015\u007f\bSZeG?\b*\u0013Z\u001a9CovUJ9J6I\bLr\u000fS";
      f1652[26] = "]\u0018^BTt\u0011\u0006K\u001a?ŔmJ\u001d\u001eFkR\u0017\u001bU\u0003\u000e]G\u001b\\Z1\u0000AP\u0019?";
      f1652[27] = "oN\f;\u001en;O\u001fi|(lN\u0001;;8\u0005A\u0016l\u001e<eHF2\u0017V5\u0017G/\u0019ih\u0011\fj|<aZ\u00114Dh`ICV";
      f1652[28] = "\u0019z2Kr\u0011C<o\"\u0557*\u001cg.[-U\u001f;?GH";
      f1652[29] = "!\r\u0013m\u0016\u0007{KN\u0004E<&J\u0017~^\r*\u0014\u000e?,\u0000'\u0015\u000fv\u001d\fy\fN\u0004";
      f1652[30] = "6H^\u000bF\u0014l\u000e\u0003bӮ/g\u000bR\u001e\fR|BY\u0018";
      f1652[31] = "bni\u0014{C8(4}»x0,>F3\u0000:e\u007fLA";
      f1652[32] = "qKY\u001fh1+\r\u0004v,c.LR\rRcr\u0000\u0004\u0004*i;A\u000ev";
      f1652[33] = ";\u0002)\u001cp\baDtu\u0006~J%\u0000uqIf\u0011uN+\u000f;";
      f1652[34] = "?UeH)\u0013:[mS\u0018̖\u0006\u001acM#W|Cc@ci;_b@gP=Fr\u001d\u0018";
      f1652[35] = "y?Lg'P#y\u0011\u000eѠk+}\u001b5o\u0013!4Z?";
      f1652[36] = "kG\u000br\u0016f1\u0001V\u001bs\u0014\n{,]c]kG\u000br\u0016f1\u0001V";
      f1652[37] = "Qi\u000by\u001fw\u000b/V\u0010d\n$Tm+_*\u0003)Vq\u0019w";
   }
   NotificationType() {}
}
