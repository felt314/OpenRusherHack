package org.rusherhack.client.api.setting;
import org.rusherhack.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.ui.ElementBase;
import org.rusherhack.core.command.processing.CommandProcessor;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

public class ColorSetting extends Setting<Color> {
   public int f839;
   public ColorSetting$RainbowMode f840;
   public boolean f841;
   public boolean f842;
   public boolean f843;
   public boolean f844;
   public boolean f845;
   public static int[] f846;
   public static long f847 = Class066.m4320(-8540863479894225864L, 3168137226789413541L, MethodHandles.lookup().lookupClass()).m4325(156055866094605L);
   public static String[] f848;
   public static String[] f849;
   public static long f851;
   public static Object[] f852 = new Object[86];
   public static String[] f853 = new String[86];

   public ColorSetting setVisibility(BooleanSupplier var1) {
      return (ColorSetting)super.setVisibility(var1);
   }

   @Override
   public String getDisplayValue() {
        return null;
    }

   public float getSaturation() {
      float[] var10000 = Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null);
      boolean var10003 = true;
      return var10000[1];
   }

   @Override
   public boolean deserializeValue(JsonElement var1) {
        return false;
    }

   public void setBlue(int var1) {
      this.setValue(new Color(((Color)super.getValue()).getRed(), ((Color)super.getValue()).getGreen(), var1, this.getAlpha()));
   }

   public void setRainbowMode(ColorSetting$RainbowMode var1) {
        
    }

   public ColorSetting onChange(Consumer<Color> var1) {
      return (ColorSetting)super.onChange(var1);
   }

   public ColorSetting setThemeSync(boolean var1) {
        return null;
    }

   public Color getValue() {
        return null;
    }

   public ColorSetting(String var1, String var2, int var3) {
      this(var1, var2, new Color(var3));
   }

   public int getAlpha() {
        return 0;
    }

   public ColorSetting(String var1, String var2, Color var3) {
    }

   @Override
   public JsonElement serializeValue() {
        return null;
    }

   public boolean isRainbowAllowed() {
        return false;
    }

   public int getBlue() {
      return this.getValue().getBlue();
   }

   public ColorSetting setAlphaAllowed(boolean var1) {
        return null;
    }

   public float getHue() {
      return Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[0];
   }

   public int getRed() {
      return this.getValue().getRed();
   }

   public boolean isThemeSync() {
        return false;
    }

   public ColorSetting setRainbowAllowed(boolean var1) {
        return null;
    }

   public void setRed(int var1) {
      this.setValue(new Color(var1, ((Color)super.getValue()).getGreen(), ((Color)super.getValue()).getBlue(), this.getAlpha()));
   }

   public int getRainbowWithOffset(int var1) {
        return 0;
    }

   public ColorSetting setThemeSyncAllowed(boolean var1) {
        return null;
    }

   public int getValueRGB() {
      return this.getValue().getRGB();
   }

   public Color parseValue(String var1, boolean var2) {
        return null;
    }

   public ColorSetting setRainbow(boolean var1) {
        return null;
    }

   public ColorSetting(String var1, Color var2) {
      this(var1, "", var2);
   }

   public void setRainbowOffset(int var1) {
        
    }

   public void setHue(float var1) {
        
    }

   public ColorSetting$RainbowMode getRainbowMode() {
        return null;
    }

   public boolean isThemeSyncAllowed() {
        return false;
    }

   public boolean isAlphaAllowed() {
        return false;
    }

   public int getGreen() {
      return this.getValue().getGreen();
   }

   public void setAlphaAllowed(int var1) {
        
    }

   public void setGreen(int var1) {
      this.setValue(new Color(((Color)super.getValue()).getRed(), var1, ((Color)super.getValue()).getBlue(), this.getAlpha()));
   }

   public Color getRealValue() {
      return (Color)super.getValue();
   }

   public boolean isRainbow() {
        return false;
    }

   public int getRainbowOffset() {
        return 0;
    }

   public float getBrightness() {
      return Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[2];
   }

   public ColorSetting setChangeAction(Runnable var1) {
      return (ColorSetting)super.setChangeAction(var1);
   }

   public static void m1913(int[] var0) {
      f846 = var0;
   }

   public static int[] m1914() {
      return f846;
   }

   static {
    }
   public static String m656(byte[] var0) {
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
      f852[0] = "+\u0011\u000e3Zl7\u000b\fo@x'\bG~Gk!M\u001ax\\m-\r\u000e3{|0\u0017\u0000sO";
      f852[1] = "\u0003\u0011ox\u0014\u0011\b\u001e~7u\u001f\u0003\u0015zm";
      f852[2] = void.class;
      f853[2] = "java/lang/Void";
      f852[3] = "Id04w\u0012U~2hm\u0006E}yyi\u000eCx#4d\u0017O8$\u007fq\u0013Ox04F\bJy%I`\u0013R\u007f9}";
      f852[4] = "\u001f\u00167fE\u0005\u0003\f5:_\u0011\u0013\u000f~ȼ";
      f852[5] = boolean.class;
      f853[5] = "java/lang/Boolean";
      f852[6] = "fA";
      f852[7] = "s9w~\u001f\u0011o#u\"\u0005\u0005\u007f >3\u0002\u0016yee$\u0004\boeS?\u0001\u000bn\u001ed9\u0001\u0017";
      f852[8] = "\u0002[!A*l\u001fNycka\u0007H";
      f852[9] = int.class;
      f853[9] = "java/lang/Integer";
      f852[10] = "\u0012C)\u0002\bp\u000eY+^\u0012d\u001eZ`O\u0016l\u0018_:\u0002\u001bu\u0014\u001f=U\tq\u0018\\`o\u0015i\u0012C=";
      f852[11] = "-<OG\u001131&M\u001b\u000b'!%\u0006\n\u000f/' \\G\u00026+`z\u001c\u0010.'<`\b\u0000-\u0003\u001ea";
      f852[12] = "2dky\te,lq6Ae6fiqH~vFrvTe5`o";
      f852[13] = "&\u0004\u001b<\r9:\u001e\u0019`\u0017-*\u001dRq\u0013%,\u0018\b<\u001e< X\u000fw\u000b8 \u0018\u001b<<#%\u0019\u000eA\u001a8=\u001f\u0012u[\u001e(\u001f\u0012p\u0010;\u0004\u0019\u0018w";
      f852[14] = "\u001bRHtPo\u0010]Y;<l\u001e_[t\u0010";
      f852[15] = "\u000e7\u0006]E1{\u0017\rRT~\u0006\u000f\u001eU]7n";
      f852[16] = "|\")\u0014\u0013\tp*(_Z\u0001l\"*\u0014>\u0015p#\u000bX\u001e\u0003|9";
      f852[17] = " O3)a\\+@\"f\u001cD8G+/";
      f852[18] = "?5 O%c4:1\u0000Ez863\\";
      f852[19] = "f\boK8oz\u0012m\u0017\"{j\u0011&\u0006&sl\u0014|K+j`T}\fd_e\u001fe\u0000$nK\u001b{\u0000";
      f852[20] = "\u0019<C9\u0015 \u0005&Ae\u000f4\u0015%\nt\b'\u0013`Gx\n8\u0017 @9\u0017'\u0019-Ad\u0014<\u0018)\nT\b8\u001b/Js7'\u0019-Ad\u0014:\u0004";
      f852[21] = "G?86n\u001eL0)y\t\u001cY;)22";
      f852[22] = "C[()\u0006p6{#&\u0017?Kc0!\u001ev#";
      f852[23] = "\u0010\f";
      f852[24] = "Q\u0006";
      f852[25] = "\u0016\b5h)=\u001d\u0007$'U$\u0012\u0007\"kk4";
      f852[26] = "\u0014UmW\u0014p\n]w\u0018\\p\u0010Wo_UkPvtYV`\u001fZHCJu\u0012]~D";
      f852[27] = "\u001f(";
      f852[28] = "i*i\u0010\u0012he\"h[[`y*j\u0010?te+AR\u0010jo+p";
      f852[29] = float.class;
      f853[29] = "java/lang/Float";
      f852[30] = "?F\u0010qMjj\t\u0017t1mgS\rsv}\u000e\f\u0012e\u000b~2QL#\t\u0013?F\u0010qMjj\t\u0017t1";
      f852[31] = "%Q)/ZY.W}x<WdgrsY[DJtu<\r}@(s\u0000P#\u0006*\u001e";
      f852[32] = "NTR\u0007\u0005I\u001aZSRiAH\b4B\u000ePI\u001e\u0010IiC\u0019\u0006V_\u0019U\u001f_\u00108\u0005\u0014\u001d\u0018\u001d\tTO^\u0006l\u0001\u000eUU\u0015\u000f\u0005\fB\u001ad";
      f852[33] = "o_\u0002r3\u001anYV%U\r<OB.\u000b\u001c1HTC>H7\u000f^3(NnI9x7\u000eoX\u0005%iHm5\u0004>)\u001ce\u000b\\2i\u0015U";
      f852[34] = "i\\K1q8hZ\u001ff\u0017ŃS\r\u0012{-:oPL=/";
      f852[35] = "\u001cjB!A}O4\u0000:9*p1B?\u0003a\u0000'DfE\u0006\u001bg\u001dg^v\raD!9";
      f852[36] = "\u0017+=\u0002\rY\u0016-iUkĊ- x\\\u0019\u000f\u0011p6\t\u00006";
      f852[37] = "V 'vfA\u0002.&#\nIP|A3mXQje8\nK\u0001r#.z]\u0007+eI;Q\\\u007fe0n\u001e[z\u0019pm]MaztoJ\u0002\u0010";
      f852[38] = "MXJ/h\u0012\u001bXL\"\u0006\u0015\u0015\rQ/A\u0005|\u0002\u0011 <\f\f\u0014\u0017yzkMXJ/h\u0012\u001bXL\"\u0006";
      f852[39] = "oi@ns\u001eno\u00149\u0015\u001e8\u007f!6t\u0017?d\u0004\u0000t\r5D\u00151n\u001c)\u0003E\"oNl~Ga{IU=\u0006%*H(?E1-q";
      f852[40] = "\fY\r\u0014\u00027XW\fAn?\n\u0005kQ\t.\u000b\u0013OZn=[\u000b\tL\u001e+]RO+\u0005k\u0004ST[\u0013m]\u00153\u0012\t+\u0017\u0018P\u0016\u000b<Xi";
      f852[41] = "u\u001a\u000bm;E-\u0016Kd\u000b\u0014%\u001b=`v\u0016HY\n~4B5[Ij3{";
      f852[42] = "5\u0003\u0015;P[-\u0010P=1\u000b:\u0000a!p\u0002+|\u0016'K[n\u0001\u0014d_\\W";
      f852[43] = "T\u001e0\u0005\f~\f\u0012p\f</\u0004\u001f\u0016#v@W\u001e6S\u0005=U]\"T<";
      f852[44] = "\t\u0017S\u001d#9_\u0017U\u0010M\fuh|-\t\u001c8\u0017\u0004\u0016 .AA\u0004\u0010-";
      f852[45] = "'\u0018{*$(\u007f\u0014;#\u0014yw\u0019N'lvse9>n)#\u0018;}z.\u001a";
      f852[46] = "\u0007\u0004QAoSFZ\u0014 f]G?@D`];\u0010QZqRE\u0004CI\u001d\t\\\u001cXQ~\r^\u000b\u0017 ";
      f852[47] = "7~\u0001$\u0017\u001av DEԄyexFu\\\u0002s}G>e";
      f852[48] = "#c\u0010Q\fK-{C\u0005m\u0019q~r\u0003\f\u0010veW!\n\u0012{x(P\u0007M-dGQ\u0001\u0019z\u0002\u0016\u0017\u0017I%\u007f\u0014T\u0003N\u001c<U\u0010ROa>\u0016\u0004Uv";
      f852[49] = "y}|jJ\b+.c25\u0018>}c/M\r>yc?Ddzi\u007fk\f\u0019x*kl5Z9n:mHXzz=T\u000b\u0019>+<)\tZ*,\u0005";
      f852[50] = "Ge{4\ruFc/ckҪ}n>j\u0019#A>p?\u0000\u001aDh=t\u001ay@j*;k";
      f852[51] = "\b[\f\u0003\u0003\u000f\\U\rVo\u000e\u000b\u00102WR\fX\fBATU\u001ek\t^\u0014T\u000fWT\u0000RVb";
      f852[52] = "/x?w\u007f;7kzq\u001ee6EyqxC'eo}b\u0004vey,s8+;?.\u001e";
      f852[53] = "[\u0013|uvxC\u00009s\u0017(T\u0010\boU<^\n\u0006~u*R\u0010A~'y\u0006\u0000 *)xSl";
      f852[54] = "Xp\u007fX;IYv+\u000f]]\u000ff\u001a\b&G\b{ \b!Wb{t\u0004%\u001bZw'S`&Xp\u007fX;IYv+\u000f]";
      f852[55] = "kq\u0002\u0010\u0015:*/Gq̘Y9wEA^\"/rD\ng`0i\u000b\u0000\u0004d2~Dq";
      f852[56] = "SPKxBSRV\u001f/$S\u0004F:-YQi\u0004\r3\u001b\u0005\u0014\u0006N'\u001c<";
      f852[57] = "\u0016>U~\u001c\u0016\u000e-\u0010x}F\u0019=!d&U\u000e \u000ep}BI#Rx\rTOz\u0014\u001f";
      f852[58] = "\"\u000f.+y;,\u0017}\u007f\u0018~g\u000fsybwV\trwb\u0006'\u0004-!~i&\u0002yv\u0018";
      f852[59] = "5\u0003\u0011\u0011GA4\u0005EF!Ab\u0015cDYNfi\u0014][\u00116\u0014\u0016\u001eO\u0016\u000f";
      f852[60] = "a|\u00007\u000ec`zT`hw6jpf\u0001j4{rm\u0014m<p;f\u0012b\"/\u0001eRj6\u0016\u0001lS==y\u0000j\u0007j[";
      f852[61] = "iBQ\u0016: hD\u0005A\\ >T0J0OmU\u0010\u0018e2o\u0016\u0004\u001f\\";
      f852[62] = "$!?!eD3i%#\u000bD#|?%LTJ&?24\u00037$|&3:$!?!eD3i%#\u000b";
      f852[63] = "\u0006(mz\u0007E\u001e;(|f\u0015\t+\u0019`,\u001d\u00033=r\u0000z_5+!\u000bF\u0002km#f";
      f852[64] = "F/L2{~\u0010/J?\u0015a\u001e{G_~:\u0015$M/h<Lb*";
      f852[65] = "\u000586\u0019J(\u0004>bN,Δ?ioS\u0016*\u000341\u0015\u0014";
      f852[66] = "beJ\bI\u0015cc\u001e_/\u00155s>CB\u0017>\u000fODUEarM\u0007ABX";
      f852[67] = ")\u0005I\u000bp\u0007(\u0003\u001d\\\u00169\u0013Q\u000f@)QnSLT.";
      f852[68] = "fC'x[EgEs/=Ϝ\\\u0012~2\u0007G`O t\u0005";
      f852[69] = "zj=\u0004\u0017)m\"'\u0006y+s\u0013-\u001d\"+n2&\u0002yii)\u007fT\u0004k*=xm\u0012jvi'\u001d\u0004l//@";
      f852[70] = "Bo:&a_Cinq\u0007[x?sr`\b\t?a)|0Bwdp?ABe?l\u0007";
      f852[71] = "\u007fx\u0000/`\u0011't@&Pu\rO\u0000!\u0010t\b\u0005B;*\u0010{x@x>\u0017B;\u0001<o\u0016?9B(h/|x\u0006yiR~;\u0012~PO|8\u001b::K9a\u0000F0\u0011\u007fb\u0000,4T&y|";
      f852[72] = "k^\u0018\u001cA$1Z\u001a\u0000$*3C\u0006\u0002_AkFYCE|e^\n\u0017$";
      f852[73] = "\u000b%\u0006#&OS)F*\u0016\u001e[$:\u0011\\:Q<\u001d0\u0016\u0012Q7\u001atn\u000e\u0007:\u0019Ju\u0016Y8D2i@T;z)q\u001eVf\u00025'\u0013UXG7j\u0018\u0006f\u001f;*\u00116";
      f852[74] = "+\u0017O(3xyDPpLhl\u0017Pm4}l\u0013P}=\u0014+\u0003J\u007f|*s\u000f\nvL*k\u0004\t/1((\u0010\u000e\u0016qij\u0017\u0006()e*\u001e6";
      f852[75] = "D\n\u001e\u0011w!\u001c\u0006^\u0018Gp\u0014\u000b-\u0002*r\u001fw\\\u0005= @\n^F)'y";
      f852[76] = "?\u000blVV|(Nl\u000420R\\0\n\b{\"J6SN\u001c9\noRUl/\f6\u00142";
      f852[77] = "\u0018mS\u001b/\u000f\u0019k\u0007LIƻ\"6YL$\u000e[`YJ)";
      f852[78] = "dE4\bQpeC`_7p3SQPSb3/2DKvn\u0011jH\u000b\u007f^";
      f852[79] = "\u000e\f~Ta[V\u0000>]Q\n^\rXP=e\r\fx\u0002h\u0018\u000fOl\u0005Q";
      f852[80] = "vdw\u000fI*wb#X/ęL5.E\u0015(php\u0003\u0017";
      f852[81] = "\u0006$&\u007fL8\u0007\"r(*0Z\u0005}'L8QN-4\u0014-Rv~>H6<twu\u001b1Suq!LW";
      f852[82] = "?8ex\u001a\u0011>>1/| \u0005i<2F\u001394btD";
      f852[83] = "2g[\u007fz\u0013fiZ*\u0016\u001d5+e++\u0010b0\u0015=-I.W\u0007?+\u00139h\u001f,n\u0015X";
      f852[84] = "@\u0018}\u001ec A\u001e)I\u0005.\u0001(/Nc%\u001d\rF\u0014g4@\u001fzI9rBr";
      f852[85] = "7`\u0002,7Be3\u001dtHVcs\u0000\u007f\u0003Inn\u0001\u0012#\u0013h3\u001cb5\u00151u{/5Rc9Ew9\u0012j\t";
   }
}
