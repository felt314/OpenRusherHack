package org.rusherhack;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.graphic.TextureGraphic;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Class124;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class BouncingLogo extends Renderer106 {
   public int f8858;
   public NumberSetting<Double> speed;
   public int f8860;
   public int f8861;
   public NumberSetting<Float> scale;
   public BooleanSetting colorize;
   public long f8864;
   public double f8865;
   public double f8866;
   public static long f8867 = Class066.m4320(-5141368112859616326L, 2700366061064632638L, MethodHandles.lookup().lookupClass()).m4325(112120981120756L);
   public static String[] f8868;
   public static String[] f8869;
   public static long f8871;
   public static Object[] f8872 = new Object[63];
   public static String[] f8873 = new String[63];

   public BouncingLogo() {
      super("BouncingLogo");
      this.speed = new NumberSetting<>("Speed", 5.0, 1.0, 10.0);
      this.scale = new NumberSetting<>("Scale", 1.0F, 0.1F, 1.0F);
      boolean var10008 = true;
      this.colorize = new BooleanSetting("Colorize", true);
      Setting[] var10001 = new Setting[]{this.speed, null};
      boolean var10005 = true;
      var10001[1] = this.scale;
      this.m5362(var10001);
      this.f8866 = this.f8865 = 0.0;
      boolean var10004 = true;
      this.f8860 = this.f8861 = 1;
   }

   @Override
   public void m5363(int var1, int var2, RenderContext var3, IRenderer2D var4) {
      TextureGraphic var13;
      if ((var13 = Class124.f2580.m5807()) != null) {
         if (this.f8858 >= (int)f8871) {
            this.f8858 = 0;
         }

         Window var12 = Globals.mc.getWindow();
         int var8 = (int)(Class124.f2580.f2577 / var12.getScaleFactor() * this.scale.getValue().floatValue());
         int var9 = (int)(Class124.f2580.f2578 / var12.getScaleFactor() * this.scale.getValue().floatValue());
         if (this.f8866 < 0.0) {
            this.f8866 = 0.0;
         }

         if (this.f8865 < 0.0) {
            this.f8865 = 0.0;
         }

         if (this.f8866 + var8 > var12.getScaledWidth()) {
            this.f8866 = var12.getScaledWidth() - var8;
         }

         if (this.f8865 + var9 >= var12.getScaledHeight()) {
            this.f8865 = var12.getScaledHeight() - var9;
         }

         long var10 = System.currentTimeMillis() - this.f8864;
         double var15 = this.speed.getValue() / 50.0 * var10;
         BouncingLogo var10000;
         if (!(this.f8866 + var8 >= var12.getScaledWidth()) && !(this.f8866 <= 0.0)) {
            if (this.f8865 + var9 >= var12.getScaledHeight() || this.f8865 <= 0.0) {
               this.f8861 *= -1;
               boolean var10004 = true;
               this.f8858++;
            }

            var10000 = this;
         } else {
            var10000 = this;
            this.f8860 *= -1;
            boolean var10005 = true;
            this.f8858++;
         }

         var10000.f8866 = var10000.f8866 + var15 * this.f8860;
         this.f8865 = this.f8865 + var15 * this.f8861;
         var4.begin(var3.pose());
         var4.drawGraphicRectangle(var13, this.f8866, this.f8865, var8, var9);
         var4.end();
         this.f8864 = System.currentTimeMillis();
      }
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
      f8872[0] = "u\")Klc~-8\u0004\u0006`j!3O";
      f8872[1] = double.class;
      f8873[1] = "java/lang/Double";
      f8872[2] = "ee\r?vzy\u007f\u000fclni|Dć";
      f8872[3] = int.class;
      f8873[3] = "java/lang/Integer";
      f8872[4] = "|L7\u0018(>`V5D2*pU~Ȱ";
      f8872[5] = "q-3{:!m71' 5}4z\u0557";
      f8872[6] = "I\u0019%yW+U\u0003'%M?E\u0000lȣ";
      f8872[7] = " 2nbvF+=\u007f-\u001eF%2l";
      f8872[8] = float.class;
      f8873[8] = "java/lang/Float";
      f8872[9] = "w\u0004'L\fqw\u00040\u0010\u0000~mO0\u000e\u0000kj>bRU)";
      f8872[10] = long.class;
      f8873[10] = "java/lang/Long";
      f8872[11] = "?u\u0013\b\u001dN#o\u0011T\u0007Z3lZE\u0003R5i\u0000\b\u000eK9)\u0006C\u0001_5uZt\nU4b\u0006e\u0000U$b\fR";
      f8872[12] = "Wy?}j\u0017Wy(!f\u0018M2(?f\rJC\u007ff?I";
      f8872[13] = "\fh]\u000f`I\u0010r_Sz]\u0000q\u0014B}N\u00064IDfH\nt]\u000fAY\u0017nSOu";
      f8872[14] = "\"q;\u001e\u0018\u001f)~*Qy\u0011\"u.\u000b";
      f8872[15] = ")\u0018\n\bF^)\u0018\u001dTJQ3S\u001dJJD4\"M\u0017\u001b";
      f8872[16] = "v\u001bLn\njj\u0001N2\u0010~z\u0002\u0005#\u0014v|\u0007_n\u0019opGY%\u0016{|\u001b\u0005'\n~i\u0001B#VK|\u0011_5\nz^\u001bJ0\u0010vz";
      f8872[17] = "\b6\u001f\u0010&H\u0014,\u001dL<\\\u0004/V];O\u0002j\u000b[ I\u000e*\u001f\u0010\u001aH\n&\u001dL\u0007X\u00130\u0011P3";
      f8872[18] = "@\u001a&X\u001c~\\\u0000$\u0004\u0006jL\u0003o\u0015\u0002bJ\u00065X\u000f{FF3\u0013\u0000oJ\u001ao?<nA\f$\u0004\u000by\u001d,";
      f8872[19] = void.class;
      f8873[19] = "java/lang/Void";
      f8872[20] = "\u0018(\b%j\u0003\u00042\nyp\u0017\u00141Aht\u001f\u00124\u001b%y\u0006\u001et(gw\u0014\u00166\u001c";
      f8872[21] = "#y.\u000b\u0017\u0002?c,W\r\u0016/`gF\t\u001e)e=\u000b\u0004\u0007%%;@\u000b\u0013)ygl7\u0012\"o,W\u0000\u0005";
      f8872[22] = "Nj\u0013p~^Ee\u0002?\u0003KW\u007f\u0000|";
      f8872[23] = "(\u0014\u0006\u0005Jj4\u000e\u0004YP~$\rOHTv\"\b\u0015\u0005Yo.H\u0013NV{\"\u0014OLJ~7\u000e\bH\u0016V\u0000\u0014\u0000[Pv$";
      f8872[24] = "G\u007f\u001d\u000b{kLp\fD\u0017hBr\u000e\u000b;";
      f8872[25] = boolean.class;
      f8873[25] = "java/lang/Boolean";
      f8872[26] = " Vn@\u0004\"<Ll\u001c\u001e6,O'\r\u001a>*J}@·";
      f8872[27] = "rh\u0019f\fNyg\b)qVj`\u0001`";
      f8872[28] = "\u0006\b\u0014r3\u007f\u001a\u0012\u0016.)k\n\u0011]¬";
      f8872[29] = "AK\u001c9U$hr\u0000#Wxrf\u0010 \u001ciuu\u0016eAons\u001a%U.Ib\u0007?[d}<";
      f8872[30] = "w\u0004\u001e]\u001a{g\u0004Cc\u0010uj\u0016\u0016\u000e\"{s\u0001\u001fcE(w\u001bK\u0012Fsq\u0010r";
      f8872[31] = "}!J[M\u001cj&K\u0003=\u000e{>X\u0007z\u001e\u0012:@\u0013@\u0002tfDW\rp}!J[M\u001cj&K\u0003=";
      f8872[32] = "\u001a7fjO\u0005Y$:3rЇ#o>j\u0010B\u0012)%4N";
      f8872[33] = "..M#gqe~\u0015\"\u0007ɍ\u0015/\u0010\"en$i\u000b|;\u0014";
      f8872[34] = "H\u0014}X\u0019-N\u000fiW$О)\u001feX\u001bv\u0019GaKM\u0014K\u0014e\u000eF$\u0013\u0010vX$";
      f8872[35] = "\bMg(DEK^;qyΦ1\u0016?+@E\fU,w\u0019";
      f8872[36] = "\u0004IsLUBFUtD'L?\u0017sK\u0019N\u0006W\"\u001aF'\u0003Ft\u001fN\u001eC\u0017%@'";
      f8872[37] = "UOD\u000e\u001ax\u000bZC\n`r\fEDM>u\f_@1]\u007f\u000f\\WC\u000b'W\u001a-";
      f8872[38] = "Y\u0004\u0000F\u001f!\u0019\u0013R\u0018a4\n\u001e]\u001f\r\u0006[^\fEah]\u0002ZA\u0010k\u0006\u0004Qx";
      f8872[39] = "\u000b'-D*\"\u0019&tHZӡi!2A*h\u0017(wF`\u001a\u0005!.\\'`R0s]Z";
      f8872[40] = "f:al=Q&-32CD5 <5/vd`llC\u001b:e>(r]!;`R";
      f8872[41] = "=A\"nMNcT%j7TiH6<pD\u0000\u0011(6IPrGpn\u000f*=A\"nMNcT%j7";
      f8872[42] = "Fw.nRK\u0004k)f Ĉ}*x2LD\u0006t)i_";
      f8872[43] = "3*H\t8\u00112)\r\u001d\u0000Vd;\u001ef0Oj|B\u0004:L>;s";
      f8872[44] = "C\u0012\u001cOSR\u0016K\u0015_,F\u001f\u000bzXHT\u001fwMXWP\u001bK@UT\u0012r";
      f8872[45] = "\n?\u0005\u0004Y\u001bH#\u0002\f+Ů1g\nPI\u0004\u0000!\u0011\u000e\u0017";
      f8872[46] = "?G@?:\u000b+[_6J\u0001;GB7&3l\u0001\u001c`qdh]\u001fn4\u0014(JM0J";
      f8872[47] = "q~\u0005;\u0017|2mYb*¶Hv]fC3%$Ug\u001aA";
      f8872[48] = "~U\u0007oxd<I\u0000g\nőE\\S`t1)\n\u000f2{";
      f8872[49] = "+TU\rQ>+\u0003JF=7*\u0003O\u001b=m&\u0005\u0012L_g%QU}Q>!\nS\u0007\u0006/|\u000b.";
      f8872[50] = "lo|>\u001b\u0001.s{6iԫWf(1\u0017T;0tc\u0018";
      f8872[51] = "6{\\F)Gd~\u0014\u001a[\u00180\u0015M\n9\u0012+zY\u0016&\u001b";
      f8872[52] = "\u007f2jQ3Hv0|MT\u001dwc\u0003\\7\u0016wry\u000b&Kv\u000f";
      f8872[53] = "\u001e!JM5}\u000e!\u0017s-}\u001a$K4=\u0014GcF\u0014jeD8@\u001fSt\u00065\u0018\u0015:d\u0006h&";
      f8872[54] = "5\b\u001e*M\u0006v\u001bBspć\fPF*\u0012A=\u0016]tL";
      f8872[55] = "\u001a08SW@X,?[%ϡ!h7\u0007G_\u0010.,Y\u0019";
      f8872[56] = " t\u0010J@Bk.HK Ϝ\u001b-F\u001b\u001fE+uB\bI'y&FMB\u0017!\"U\u001b ";
      f8872[57] = "T>*\u007f|\u001e\u0016\"-w\u000eɱof%+l\u0001^ >u2";
      f8872[58] = "@\u0016Zd#{\u0000\u0001\b:]n\u0013\f\u0007=1\\BM_`]1\u001cI\u0005 lw\u0007\u0017[Z";
      f8872[59] = "/,v~T\u000bm0qv&ӛ\u0014w!sAWetzuJ";
      f8872[60] = "^Kqi\u001d+\u000b\u0011dz-.MVtiK9lMkih.THo\u007f-z\u000b\u001dbnV$ZFq\u0004";
      f8872[61] = "\u000b:\u0005\u0016[gI&\u0002\u001e)Ǿ0aR\u001bN;Ab\t\u001dE";
      f8872[62] = "\u0013\u0006\u0016\r)2\u0013Q\tFE=\u0005W\u00122?8\u0007^\f\u0016\u001f<\u0014B\u0004\u001b*5\u0012>\u0002\u0019\u007f,\u0011\u0002\f\rx3\u007f\u0007W\u001d\"h\u000e\u0004\f\u001b)QF\u0004\r\u001a| E_\u000b\u0011EhE^\nD4k\u001eX\u0001}|k\u001fYT\f\u007f0\u0019Rm\u0011&7\u0019C\u0017F7j\u0018>";
   }
}
