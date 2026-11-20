package org.rusherhack;
import net.minecraft.client.render.VertexConsumerProvider;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.util.math.ColorHelper.Argb;

public class Class360 extends Immediate {
   public int f5829;
   public int f5830;
   public Immediate f5831;
   public int f5832;
   public boolean f5833;
   public Immediate f5834;
   public int f5835;
   public boolean f5836;
   public static long f5837 = Class066.m4320(-8661390012781606635L, -4204771418310212728L, MethodHandles.lookup().lookupClass()).m4325(166545097525064L);
   public static String f5838;
   public static long[] f5839;
   public static Integer[] f5840;
   public static Map f5841;
   public static Object[] f5842 = new Object[42];
   public static String[] f5843 = new String[42];

   public void draw(RenderLayer var1) {
      this.f5831.draw(var1);
   }

   public void m11682(int var1, int var2, int var3, int var4) {
      this.f5829 = var1;
      this.f5835 = var2;
      this.f5832 = var3;
      this.f5830 = var4;
   }

   public void m11683() {
      this.f5834.draw();
   }

   public void draw() {
      this.f5831.draw();
   }

   public void m11684(boolean var1) {
      this.f5833 = var1;
   }

   public Class360(Immediate var1) {
      super(null, null);
      this.f5836 = false;
      this.f5833 = true;
      this.f5834 = new Class199(new BufferAllocator(1536));
      this.f5829 = 255;
      this.f5835 = 0;
      this.f5832 = 0;
      this.f5830 = 255;
      this.f5831 = var1;
   }

   public void drawCurrentLayer() {
      this.f5831.drawCurrentLayer();
   }

   public void m11685(boolean var1) {
      this.f5836 = var1;
   }

   public Class501 m9313(VertexConsumer var1) {
      return new Class501(var1, Argb.getArgb(this.f5830, this.f5829, this.f5835, this.f5832));
   }

   public VertexConsumer getBuffer(RenderLayer var1) {
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
   public static void m122() {
      f5842[0] = "\u0018w(>^I\u0004m*bD]\u0014na͡";
      f5842[1] = int.class;
      f5843[1] = "java/lang/Integer";
      f5842[2] = "6[\bt0}6[\u001f(<r,\u0010\u001f6<g+aIhh'|]\u0010;.g\u0007\u000bNoi";
      f5842[3] = "8<|\u0019jQ8<kEf^\"wk[fK%\u0006<\u0002>\u000fr:dVtK\tm=\u000e?";
      f5842[4] = "9#R-w)9#Eq{&#hEo{3$\u0019\u0017:(q";
      f5842[5] = "S:MVj\u001bS:Z\nf\u0014IqZ\u0014f\u0001N\u0000\rM?J";
      f5842[6] = "\u0000s\n&OU\u000b|\u001bi2M\u0018{\u0012 ";
      f5842[7] = "\u00072\u0003P\n=\f=\u0012\u001fg9\f!&TU$\b=\u0016T";
      f5842[8] = boolean.class;
      f5843[8] = "java/lang/Boolean";
      f5842[9] = "^}2*\"@^}%v.OD6%h.ZCGr3}\u0019";
      f5842[10] = "e:ly 'y n%:3i#%ɑ";
      f5842[11] = "g#O/\u0010cy+U`qfy+V _z";
      f5842[12] = "\u0006Z;,NQ\rU*c/_\u0006^.9";
      f5842[13] = "O3e!l\rS)g}v\u0019C*,җ";
      f5842[14] = " ~d\u00079t<df[#`,g-ɝ";
      f5842[15] = "uu_\u0007\u0001\u000fio][\u001b\u001byl\u0016р";
      f5842[16] = void.class;
      f5843[16] = "java/lang/Void";
      f5842[17] = "5\u001d\u0014FX5~\u000bAO\"cb\r3VLbb\u000by\u0011^hhA\u0010LFn4qBR_7\u007f\u001bH\u0016Xj\u000f";
      f5842[18] = "8#u:C2m&&(8;c$7+Y6\u007fBw=V2\u007f q}@m\u0004\u007f)'\t1\u007f#(0ZP";
      f5842[19] = "Xi1\u0018\u0018_\u001ag-\u0018\"ɼg<v\u0001GG\u0017n%F\u001b%";
      f5842[20] = "Os6\u0012\u0015\u0017\u0001w6\u0001|\u0001\nGc\b\u0011f@q{L\u0019X\u0001f\u007f\u0014|V\u000bv8\u0016B\u0017\u001cr`s";
      f5842[21] = ",C+\u0015>\u0012gU~\u001cDN{S&\u001f(|-\u0010\u007f@x+|\u0013{\u001b>J,I(\u0017D";
      f5842[22] = "Fm'-0(\b\"`NêPN\"#+l \u001cqdw";
      f5842[23] = "C\u0016]>HK\rY\u001a]\u05f93I\u001dZf\u0006YCY];v\u0002\u0010\u001dBe\nW\u001c\bF]";
      f5842[24] = "}\u001e@?e\u000f3Q\u0007\\һwv\u0000W1!N=\u0016\u00028";
      f5842[25] = "/n-8lTaj-+\u0005DkOf4~Hvk\u001cdg@!vg8fWr\u0017";
      f5842[26] = "VOy\u0015\u0010\u0015\u000bW\u007fI \u0019\u0001O}\u0015L+V\u000f'C\u001d|QQxCA\u0007\rPo\u0010 ";
      f5842[27] = "&^S`\u001f%mH\u0006ieyqN^j\tK&\b\u000f<Y\u001c&NZjUu{V\\6ev \u000f]w\u0004&z\\Q\r";
      f5842[28] = ";NQ1\u001aM2JB? ǿR\u0014BoX\\0AG<J'nI\u001d)[E;LN; ";
      f5842[29] = "LnWlQJ\u0011vQ0aF\u001bnSl\rtL)\t;P#Ik\u0002j\bR\u0007o\u0002ya";
      f5842[30] = "yd~9!\u0004#+|eJ\\-j{>&nz)$gv9y+e<(I+x\"`J\u0000}h~;:R./\"Ys\u0004>sy)!Wy/\u001b`wG%tk2$\u0000y\u0016\"d4\\\"fp7s\u0000@";
      f5842[31] = "L-\u001d'q}\u0002bZDӵ\u0005G3\n)5<\f%_ ";
      f5842[32] = "\u0019PGH\u0010{W\u001f\u0000+Ù\u0003\u0011\u001fCNLsCL\u0004\u0012";
      f5842[33] = "s\u001dm\u001fH$q\u00132O3= \u0000bA_\u000fw@:\u001d\fXv\u0005\u007f\u001dC2|Ax@3c4\u00019VYip\u0006d&\b!0GrL\u0002e7\u001a\u0002";
      f5842[34] = "</2\r\u0019\u0006w9g\u0004cZk??\u0007\u000fh<ynQX?l\u007fb\u0003\u0019^<%1\u000fc";
      f5842[35] = ">?T`wqpp\u0013\u0003ǟ\t6pPf+yd#\u0017:";
      f5842[36] = "\u0011\u001c\u0012\u0001\u000bkL\u0004\u0014];~L;\n\u001cZdD`J\u0007\u0005zP\u0002\u001f\u0002Vh+";
      f5842[37] = "|\u0014\rL_*2[J/ЧRp\u0004\u0012\u001e\u0000),\u0005\u0005M";
      f5842[38] = "JNSpG\u0013\u0004\u0001\u0014\u0013̇kF^L\"\u0018\u0010\u001a_[q";
      f5842[39] = "<\n\u0013f:HrET\u0005m0d\u0013\fw:Ik\u0013Ya\u0004Yf\u001d\u001b;}VfH\r\u0005";
      f5842[40] = "=o\u0015E1\u0015hjFWJ\u000bfJLB'\rJgPPJK`0SF(\u001eecA=";
      f5842[41] = "FZO\u000f]Z\b\u0015\blӫ\"N\u0015K\t\u0001R\u001cF\fU";
   }
}
