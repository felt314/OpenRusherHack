package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

public class Gradient extends Renderer106 {
   public ColorSetting top;
   public ColorSetting bottom;
   public static long f7589 = Class066.m4320(1764125849602938108L, -4773441463508479042L, MethodHandles.lookup().lookupClass()).m4325(107471790035692L);
   public static String[] f7590;
   public static String[] f7591;
   public static long f7593;
   public static Object[] f7594 = new Object[37];
   public static String[] f7595 = new String[37];

   public Gradient() {
      super("Gradient");
      this.top = new ColorSetting("Top", ColorUtils.transparency(Color.WHITE, 0));
      this.bottom = new ColorSetting("Bottom", ColorUtils.transparency(Color.CYAN, (int)f7593));
      Setting[] var10001 = new Setting[]{this.top, null};
      boolean var10005 = true;
      var10001[1] = this.bottom;
      this.m5362(var10001);
   }

   @Override
   public void m5363(int var1, int var2, RenderContext var3, IRenderer2D var4) {
      Window var10000 = Globals.mc.getWindow();
      var1 = var10000.getScaledWidth();
      int var7 = var10000.getScaledHeight();
      var4.begin(var3.pose());
      var4.drawGradientRectangle(0.0, 0.0, 0.0, var7, var1, var7, this.top.getValueRGB(), this.bottom.getValueRGB());
      var4.end();
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
   public static void m786() {
      f7594[0] = "I<L=SPU&NaIDE%\u0005pMLC _=@UO`YvOAC<\u0005Zs@H*NaDW\u0014\n";
      f7594[1] = double.class;
      f7595[1] = "java/lang/Double";
      f7594[2] = int.class;
      f7595[2] = "java/lang/Integer";
      f7594[3] = void.class;
      f7595[3] = "java/lang/Void";
      f7594[4] = "CH^b[\u0003_R\\>A\u0017OQ\u0017/E\u001fITMbH\u0006E\u0014J)]\u0002ET^bj\u0019@UK\u001fL\u0002XSW+";
      f7594[5] = "\u001a^cJ\u00175\u001a^t\u0016\u001b:\u0000\u0015t\b\u001b/\u0007d$UJ";
      f7594[6] = "*\u00102d/\b*\u0010%8#\u00070[%&#\u00127*wzvP";
      f7594[7] = "_]mjQVCGo6KBSD$В";
      f7594[8] = "=\u0019\u001a\u0013\u0010t=\u0019\rO\u001c{'R\rQ\u001cn #Z\bE*";
      f7594[9] = "s^DmivoDF1sb\u007fG\r wjyBWmzsu\u0002d/ta}@P";
      f7594[10] = "_Tad\u0017#CNc8\r7SM()\t?UHrd\u0004&Y\bt/\u000b2UT(\u000373^Bc8\u0000$";
      f7594[11] = "]T\u0007@0\u0001AN\u0005\u001c*\u0015QMN\r.\u001dWH\u0014@#\u0004[\b\u0012\u000b,\u0010WTN<'\u001aVC\u0012--\u001aFC\u0018\u001a";
      f7594[12] = "BY|#\u0015a^C~\u007f\u000fuN@5n\bfH\u0005ny\u000ex^\u0005Xb\u000b{_~od\u000bg";
      f7594[13] = "g\u00056\u0005\rez\u0010n'Lhb\u0016";
      f7594[14] = "0b6,kU,x4pqA<{\u007fò";
      f7594[15] = "#K[\u00112!\nrG\u000b0}\u0010fW\b{l\u0017uQM&j\fs]\r2!+b@\u0017<a\u001f<";
      f7594[16] = "\t\u0006,\u0001.I\u0015\u001c.]4]\u0005\u001feL0U\u0003\u001a?\u0001=L\u000fZ-J=H\u0013\u0006.\u0001?S\u000b\u0019*A8\u0012\u0007\u0006,\u0001\u0015H\u0003\u0019\u0019J:Y\u0014\u0011%L9";
      f7594[17] = "6:a1C6=5p~>..2y7";
      f7594[18] = "1#\u0004\tjG-9\u0006UpS=:MDw@;\u007f\u0016Sq^-\u007f5BjA7>\r";
      f7594[19] = "\u001b\u000f\u00150\u001a+\u0010\u0000\u0004\u007f{%\u001b\u000b\u0000%";
      f7594[20] = "\u0003\u007f4zoQ\fc:\nmB\u0007q\u0007phT\u000fc.v[U\u0005r!ln\\\u0003\u000e5fa\u0003Q?vag8\u0013b(1>\tPe.\n|T\u000e5w;?S\b\u000e5fa\u0003Q?vag8\u0013b(1>\tPe.\n|T\u000e5w;?S\b\u000eqdd\\\u000fc2h|Sn7&oeY\u0003t*wj8T3x1mB_|\"n\u0001";
      f7594[21] = "\u00181\u0004\u001a\u0010!GxA\u0017+4O<'\u0013O&O\u001a60+bL%\u001d\u001bF!@=\u0012z";
      f7594[22] = "8\u001e\u0005%\u007f\u0019{G\u0007#\u0004\u0003i^\u0002:h1>\u0018\\m?f8M\u000f:;\u001fu\u0012\u0010/\u0004";
      f7594[23] = "c;Z\u0003Zfah\f\u0017eź^?\u0010\u0000\u0005d$`YE\b";
      f7594[24] = "1\u0013`%!~>\u000fnU%z3\u0003zUrj;\u000b#/(f,\u0004\u001cor'g\u000efd=}8b";
      f7594[25] = "GeWU!:Jc@QC)\rnKI;<\rjKY2UFmC\f\"iHcMWCl\u0019bIS./\u0015zF2r?\u00199L\u000e|1\u0017b-";
      f7594[26] = "\u0019&!t<\u0013\u001buw`\u0003ű$\"kwc\u0011^}\"2n";
      f7594[27] = "\u000bK;s\u001cS\u0005E5(}$kh\u0013ML\u0005T\u001f4qB\u000bZD";
      f7594[28] = "Jxw\u001f5\u0016\u00123p\u0017\tӓ{je\n`T\u001f;&\u0013m(A>+OeRJqq\u0010\t";
      f7594[29] = "\u001f2qUs\u000fRmn@L\u0013N!|U !\u001fa,\fLOM8xS!\fA w2";
      f7594[30] = "j,+\t7\u0017n.2E\u000e\u001f?HhIi\u0002/7+\u0010k\u0004";
      f7594[31] = "#\u000env\u001a0a\u000b}dp9z]\u001e=Md']d6\u0002>x1";
      f7594[32] = ">:\u007foX$km 2gfTorq\u0006.ei}w\u001fJ?jdh\u0003{9ebqg";
      f7594[33] = "\u001927\u0015B\f[&t\u0014)\u000fA6'(\u0014\nA$uRN\u0006V+J";
      f7594[34] = "@4uAzDR6aZ\u0014\u0016+-\u007fEu^\u001a+pCl:@(i\\p\u000bF'oE\u0014";
      f7594[35] = "\u0019\n\u00165 2TU\t \u001f.H\u0019\u001b5s\u001c\u0019XCh\u001frK\u0000\u001f3r1G\u0018\u0010R";
      f7594[36] = "Hw\u000f,@\\Fy\u0001w!?9\\=_!Q\u0013s_s\u001d_\u001d}\u0004";
   }
}
