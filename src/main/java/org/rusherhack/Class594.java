package org.rusherhack;

import com.mojang.blaze3d.platform.GlStateManager;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gl.Framebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.rusherhack.client.api.Globals;

import org.rusherhack.client.api.feature.module.impl.client.ShaderTest;
public class Class594 {
   public Class153 f9409;
   public Class476 f9410;
   public Class476 f9411;
   public static Class594 f9412;
   public Class294 f9413;
   public static String f9414;
   public static long f9415 = Class066.m4320(1920337407166577350L, -496283531179000125L, MethodHandles.lookup().lookupClass()).m4325(26334894155576L);
   public static String[] f9416;
   public static String[] f9417;
   public static long[] f9419;
   public static Integer[] f9420;
   public static Map f9421;
   public static Object[] f9422 = new Object[71];
   public static String[] f9423 = new String[71];

   public void m18048() {
      this.f9413.m10033();
   }

   public void m18050(Framebuffer var1, Framebuffer var2) {
      GL30.glBindFramebuffer(36008, var1.fbo);
      GL30.glFramebufferTexture2D(36008, 36064, 3553, var1.getColorAttachment(), 0);
      GL11.glReadBuffer(36064);
      GL30.glBindFramebuffer(36009, var2.fbo);
      GL30.glFramebufferTexture2D(36009, 36065, 3553, var2.getColorAttachment(), 0);
      GL11.glDrawBuffer(36065);
      GL30.glBlitFramebuffer(0, 0, var1.textureWidth, var1.textureHeight, 0, 0, var2.textureWidth, var2.textureHeight, 16384, 9728);
   }

   public void m18051(Framebuffer var1, int var2) {
      Framebuffer var7 = var1;
      int var9 = 0;
      this.f9411.m14920(Class083.f2125);

      for (int var6 = 0; var9 < var2; var9 = var6) {
         f9412.m18054(var7, var7, 0.5F, 0.0F);
         var6++;
         f9412.m18054(var7, var7, 0.0F, 0.5F);
      }

      if (ShaderTest.f8479) {
         ShaderTest.m16284(var7, "real");
         ShaderTest.m16284(this.f9411, "copy");
         ShaderTest.f8479 = false;
      }
   }

   public void m18052() {
      this.f9413.m10030();
   }

   public void m18053(int var1) {
      this.m18051(Globals.mc.getFramebuffer(), var1);
   }

   public void m18054(Framebuffer var1, Framebuffer var2, float var3, float var4) {
      this.m18050(var1, this.f9411);
      this.f9411.m14919(false);
      GlStateManager._activeTexture(33984);
      GlStateManager._bindTexture(var1.getColorAttachment());
      Class083.f2125.m9150("image").m14721(0);
      Class083.f2125.m9150("resolution").m14724(Globals.mc.getWindow().getFramebufferWidth(), Globals.mc.getWindow().getFramebufferHeight());
      Class083.f2125.m9150("direction").m14724(var3, var4);
      this.f9413.m10031(null);
      this.f9411.m14917(var2);
      this.f9411.m14916();
   }

   public Class153 m18055() {
      return this.f9409;
   }

   public Class594() {
      super();
      boolean var10006 = true;
      this.f9409 = new Class153(Enum112.f2465, Class153.f3140);
      this.f9413 = new Class294(this.f9409);
      this.f9410 = new Class476();
      this.f9411 = new Class476();
   }

   public static void m10347(String var0) {
      f9414 = var0;
   }

   public static String m16717() {
      return f9414;
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
      f9422[0] = "\u000e?1>az\u0012%3b{n\u0002&xյ";
      f9422[1] = "\u001c6.C\u0007I\u001c69\u001f\u000bF\u0006}9\u0001\u000bS\u0001\fhZ\\";
      f9422[2] = void.class;
      f9423[2] = "java/lang/Void";
      f9422[3] = "pcuzL\u0002lyw&V\u0016|z<Ё";
      f9422[4] = int.class;
      f9423[4] = "java/lang/Integer";
      f9422[5] = "\u0004\u001d\u0000LXB\u0004\u001d\u0017\u0010TM\u001eV\u0017\u000eTX\u0019'GS\u0005";
      f9422[6] = "0~e'Zt0~r{V{*5reVn-D 9\u0003,";
      f9422[7] = "\u0001~\u0002U \u0015\u001dd\u0000\t:\u0001\rgKФ";
      f9422[8] = "N\u0006\u0005U\u0006-R\u001c\u0007\t\u001c9B\u001fL\u0018\u001b*DZ\u0017\u000f\u001d4RZ+4!,H\u0018\u0011";
      f9422[9] = "\t\u0016x\u0013 @\u0002\u0019i\\]X\u0011\u001e`\u0015";
      f9422[10] = "\u0000r\"P\u000e\u0005\t|!\u0019M\b\u000f|5\u001bP\u000eMm#\u001f\u0017\f\fo\"P$\u00060i.\n\u0006'\u0002s.\u0019\u0006\u0018";
      f9422[11] = "b\u001d)\u000b\u0001\u001d~\u0007+W\u001b\tn\u0004`é";
      f9422[12] = "\u007f{>\u0003YEca<_CQsbwȫ";
      f9422[13] = boolean.class;
      f9423[13] = "java/lang/Boolean";
      f9422[14] = "\rDy\u0007\u0012\u007f\u0011^{[\bk\u0001]0ɣ";
      f9422[15] = "^L7vb.BV5*x:RU~;|2TP$vq+X\u0010\u00174\u007f9PR#";
      f9422[16] = "%Pb\t\tS9J`U\u0013G)I+D\u0014T/\ffH\u0016K+La\t\u001aT-WhB\u0015RdqqU\u0012H-adW\u000fS8G";
      f9422[17] = float.class;
      f9423[17] = "java/lang/Float";
      f9422[18] = "Xq\u000erILDk\f.SXThGȨ";
      f9422[19] = char.class;
      f9423[19] = "java/lang/Character";
      f9422[20] = "S%<\u001d|EV07\u001d\u007fBY9<_>updi";
      f9422[21] = "OJ\"\b\\=SP TF)CSkĦ";
      f9422[22] = "}Hy\u0004\rfaR{X\u0017rqQ0ź";
      f9422[23] = "\u0014ku_cm\bqw\u0003yy\u0018r<Ȳ";
      f9422[24] = "\u0002=l\u0006gR\u001e'nZ}F\u000e$%Ӥ";
      f9422[25] = "i{V6\u001d\"btGy|,i\u007fC#";
      f9422[26] = "\u0007hX\u000bM$[m\u0014iА\u0015B?OY\u0002$\u0006oEi\b(_2XXLxU\u0002\u0013SL\u007fV{Q\u0016Be9";
      f9422[27] = "\u0000\u001f\u0004/CA\u0005\u000bT%~Ԧ:A\f#\u0014G\u000b\u001e\u000e`\u0011(\u0000@Zt\u0011QB\u0005Tn~";
      f9422[28] = "q\u0015U5}]qJ_!\u0007ӑL\u0010\npm\u000f5RO~w`";
      f9422[29] = "!\r9\t\\Zx\r?VgՂ\u0011T*\u0004\rM \u000b(G\b\"";
      f9422[30] = "d8y~\u0003~e8tj2վTasyVto`stB";
      f9422[31] = "p8K\u00068y)8MY\u0003Ū@dS\nb=|(ALg\u0001z?P\u0007>h\u007f+\u0000\r\u0003";
      f9422[32] = "rF\u0018\"6\u0019r\u0019\u00126LŞO\u0002@>|U~F\u00104L\u001euF\u001775\\0H\rX";
      f9422[33] = "pG'\u001c6|d\f*\u000fHly6>\u001f4Mg\u0015?\u0013\"~s\u00127\u0004H8tA0\u0011ygv\u00025~sj \u00165O,hc\u0013ZE!>w\u0013k\u001a#}r|a\u0017uirM>\u00156l\u001dG3C\"l,\u00181\u0000'\u0003&\u0015g\u0014'2y\u0017$\u0011H8tA0\u0011ygv\u00025~sj \u00165O,hc\u0013ZE!>w\u0013k\u001a#}r|a\u0017uirM>\u00156l\u001dF`A\"ld\u0004%O8\u0003";
      f9422[34] = "cU=32\u0011gV}d\u0002ʞ\u0003]c%bJe\n> x";
      f9422[35] = "X\u0000\u001e)m\"X_\u0014=\u0017ճe\u000e\u001a/w#\u0003YG*m\u001f_\u0005D9xf\u001d@J#\u0017";
      f9422[36] = "85\b\\\u0010Ot'NY,\u0017k1[ALs=>\tWCBb<JR,";
      f9422[37] = "\\HCXZ\u0014\u0000M\u000f:\r%\u000e\u001e\bH\u000e\u0014_ZJ_dI^\u0018@PU\u0018\u001aZW:";
      f9422[38] = "\\\u00070?Vs]W*!*X2\u0001!\u007fQrM\u0005 <Z";
      f9422[39] = "G\n-dx\u000e\u001b\u000fa\u0006ȯ?\u0002]:67\u000eF\r0\u0006}VD\n37\"T\u0007\u000f\\<|\u0000\u0013\u000f%~9\u000e\t`";
      f9422[40] = "ltia;u($cQ/)k)h=\u001d\u007f/s0nJ\u007f~te>{ |7`Q";
      f9422[41] = "\u001b\u00043=IZBZ5s-Ͽr\b1y\u001dQ\nQ1\u007fBjH\u0002liB\u0013\nGbs-";
      f9422[42] = "3T\u001a?@\u0019oQV]Ɲ(d\u0002\u000bc\u001a\u0018=\\\r-";
      f9422[43] = "1+13a,k*<<\rj[ucolzg9q)iFe)=21z);{7\r";
      f9422[44] = "B\u001ec\u000fs'VUn\u001c\r7Ko\u007f\u000ba\u0016UL{\u0000g%AKs\u0017\rcF\u0018t\u0002<<D[qm61\u0012Oq\\i3QJ\u001eW7gEJg\u0015ri_%";
      f9422[45] = "O UQd\u0001\u000bp_a{QYy_6,\f\u0004'3Z|\r^r\u0002\u0005~N[";
      f9422[46] = "U%\u0016b5$\r/\u00198X\f\u0003-\u001b=&66+\u0017 %!\u0007F\\5e1\u0005w\u00037&4j|]c24\u0013>\u0018m([";
      f9422[47] = "\u0002n\u0003XF\u0003\u0001}\u0011\u001f8_Sj\u001f\u0000Tm\u0002+GY8\u0001W+\u0015\b\t^Uh\u0010g";
      f9422[48] = "xm\u0013*%M{~\u0001m[\u0011)i\u000fr7#x)_$[O-(\u0005zj\u0010/k\u0000\u0015";
      f9422[49] = "\u0003\u0004lG \u001fO\u0016*B\u001cH]\u000f*o`#\u0006\u000fmLs\u0012Y\r.I\u001cOG\u001f2Yu\u0019\u0004\u0014l&";
      f9422[50] = "\u001a\u0016\u0013W)\u000bCH\u0015\u0019MǇs\u0010IV'T\nR\fX=;";
      f9422[51] = "ZEs\u001cU2^F3KeҺ:\u0007q\u0010U$\u000bC!\u001aekX@-JY'J\u0006(v_o\u0005\u0016#\u000f\u001d*\u000b\fL";
      f9422[52] = "$m0Fgg0&=U\u0019w-\f MuR48#Ic\u0018r?pNv)-=3K\u0019\"si'K``6g=$";
      f9422[53] = "MoWsr\\GiD{Mw#?\u0011m+\u0002B5\u0017~#";
      f9422[54] = "9\u001a\u0000l.>:V\u0018uM7o\u0016\u001c{!\u00058PB,vR>\u0012\u0000#3k=\u0001\u0012dM";
      f9422[55] = "[*6)\u001bhOa;:exR_1\"\u0000z\\l%%\bmj|;7\u0018m[+\u0007K^~\u000b{$z\u0001|H~Kp\f*\\~z/\u000eiY\u0011p\"X}Y / \u001bx6*\"v\u000fx\u0007u 5\n\u0017\rxv!\n&Rz5.e-\f.!$\u001coI ;K";
      f9422[56] = "\u0004Qa:\u0005\u000eA\ry98\u001d9\beiY\r\u0005Dw/\\1\u0007T;4\u0004\rKF}18";
      f9422[57] = "[\u0019\u00141po\u0003\u0013\u001bk\u001dG\u000e\u001b\u0003cA}\u0014\u0006\u0018up\u0010_\u0013Xer!\u0000\u0011\u001b`\u001d*^E\u000f`dh\u001bK\u0015\u000f";
      f9422[58] = "\u000b\u0007XHsYW\u0002\u0014*Еh\bRLP7U\b\rFD";
      f9422[59] = "HH7\u0018Xu\f\u0018=(G%^\u0011=\u007f\u0010x\fKQ\u0013@yY\u001a`LB:\\";
      f9422[60] = "_\u0014)\ncf\u0003\u0011ehЙW_\u001cd\tak\u0013\u000e\"\f]m[A2\u0007$/\u001eO(h";
      f9422[61] = "E\tF2\fiQBK!ryL~A9\r\\U\\U=\b\u0016\u0013[\u0006:\u001d'LYE?r,\u0012\rQ?\u000bnW\u0003KP";
      f9422[62] = "f#\u0002F\u0013Lf|\bRi˼[,\u0005FYJ#u\u0005@\u0006qa&XV\u0006\b#cVLi";
      f9422[63] = "hc_0\u007f\u0010,3U\u0000`@~:UW7\u001d#g9;g\u001cy1\bde_|";
      f9422[64] = "0~\u001d\u001e5d dNAGa2\u0007\u001e\u000e;t:k\u001dB#m";
      f9422[65] = "Ez\u0018d[EF6\u0000}8L\u0013v\u0004sT~G7^.8RClTe\t\u0016\u0013fd";
      f9422[66] = "]t:cuu\u0001qv\u0001тD\u0018#-1:u\\s'\u00010y\u0005.:0t)\u000f\u001e o&/\b/v\u007f/ cu%l /R#5e/DY.tk$=\u001bazqK";
      f9422[67] = "\u0005\u0013\u0019S%\u0000Y\u0016U1Ҩ1\u0005\u0013\u0019S%\u0000Y\u0016U";
      f9422[68] = "b\u0016c}#E>\u0013/\u001fȝt2\u0015bga\u00043Exy";
      f9422[69] = "\u0002gni\u001d`[9h'yКka4h\u0013?\u0012#qf\tP";
      f9422[70] = "\u0004\u001cZXj+\u0001\b\nRWҔ>\u0012U\u0004<)\u000fDE\r3BU\u0017V\u0002<s\u0003\u0007_\rWx\u0004FQ\u0006.:AHKi";
   }
}
