package org.rusherhack.client.api.utils.objects;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.StringHelper;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.Class066;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.reset;
public class TextField implements ITypeable {
   public int f1152;
   public int f1153;
   public String f1154;
   @Nullable
   public Consumer<String> f1155;
   public boolean f1156;
   public int f1157;
   public static long f1158 = Class066.m4320(-593011213490952672L, 799286104340966909L, MethodHandles.lookup().lookupClass()).m4325(112407031105564L);
   public static long[] f1159;
   public static Integer[] f1160;
   public static Object[] f1162 = new Object[78];
   public static String[] f1163 = new String[78];

   public String getHighlighted() {
        return null;
    }

   public int getHighlightEndPos() {
        return 0;
    }

   public void moveCursor(int var1) {
        
    }

   public void deleteWords(int var1) {
        
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public String getDisplayText() {
        return null;
    }

   public void setConsumer(Consumer<String> var1) {
        
    }

   public int getCursorPosition() {
        return 0;
    }

   public void deleteChars(int var1) {
        
    }

   public TextField() {
      this(null);
   }

   public void setHighlightPos(int var1) {
        
    }

   public int getWordPosition(int var1) {
        return 0;
    }

   public int getHighlightStartPos() {
        return 0;
    }

   public void moveCursorTo(int var1) {
        
    }

   public void moveCursorToEnd() {
        
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public void setCursorPosition(int var1) {
        
    }

   public void moveCursorToStart() {
      this.moveCursorTo(0);
   }

   public void insertText(String var1) {
        
    }

   public void reset() {
        
    }

   public TextField(Consumer<String> var1) {
    }

   static {
    }
   public static void m122() {
      f1162[0] = "m\u001f\bmo\u000eq\u0005\n1u\u001aa\u0006A q\u0012g\u0003\u001bm|\u000bkC\u001a7t\u0017qC\u0000!w\u001ea\u0019\u001cmI\u001ez\u0019)*x\u0017f";
      f1162[1] = int.class;
      f1163[1] = "java/lang/Integer";
      f1162[2] = "#;\u0000Ia\u000f(4\u0011\u0006\u001c\u0017;3\u0018O";
      f1162[3] = "Lb.R\u0019/Lb9\u000e\u0015 V)9\u0010\u00155QXiIGt";
      f1162[4] = "ff\u001d,q]ff\np}R|-\nn}G{\\X7*";
      f1162[5] = ">},\u0010?` u6_w`:\u007f.\u0018~{z_5\u001fb`9y(";
      f1162[6] = "l\"N\u001b'Bg-_TFLl&[\u000e";
      f1162[7] = void.class;
      f1163[7] = "java/lang/Void";
      f1162[8] = "\u001a\u0012us\n\u0013\u0006\bw/\u0010\u0007\u0016\u000b<>\u0014\u000f\u0010\u000efs\u0019\u0016\u001cNg)\u0011\n\u0006N}?\u0012\u0003\u0016\u0014as+\u0005\u0007\u000f~1\u001a\u0007\u0007";
      f1162[9] = "*\u001cI}bY_<Brs\u0016\"$Quz_J";
      f1162[10] = "\u0007_\u001cWZP\u001bE\u001e\u000b@D\u000bFUȍ";
      f1162[11] = "R?,a\tLR?;=\u0005CHt;#\u0005VO\u0005kzP\u0011";
      f1162[12] = char.class;
      f1163[12] = "java/lang/Character";
      f1162[13] = boolean.class;
      f1163[13] = "java/lang/Boolean";
      f1162[14] = "6q9Z5m=~(\u0015Xi=b.Xod.";
      f1162[15] = "\nk$\u0001\u001b4\u0001d5Nx9\u0014b";
      f1162[16] = "d\u000f\u0011D6\u0018d\u000f\u0006\u0018:\u0017~D\u0006\u0006:\u0002y5QYl";
      f1162[17] = "Z['\u0004jpFA%XpdVBnIwwP\u00073Olq\\G'\u0004K`A])D\u007f";
      f1162[18] = "BS\b\u001eHI7s\u0003\u0011Y\u0006Jk\u0010\u0016PO\"";
      f1162[19] = "U\u0006fH1\u001b^\tw\u0007L\u0003M\u000e~N]\u0002V\u000btLm";
      f1162[20] = "Gxk>wo2X`1f O@s6oi'";
      f1162[21] = "Y67]}\u000bG>-\u0012\u001c\u001cY2\"H ";
      f1162[22] = "\u0012ynbf\u0014\u0012yy>j\u001b\b2y j\u000e\u000fC)|2";
      f1162[23] = "X[$f\u0004#X[3:\b,B\u00103$\b9EacyY";
      f1162[24] = "\u0018\u000f*\u001e\u000e8\u0006D9pѿCCTc\u0001\b?E\u0005cH5z\u0010\u000e\"MI|A\u000ekp\u0004y\u0003\u0001>\u001bV<\u0017USI_s\u000b\u0003/O\u000esB>";
      f1162[25] = "(\u0000\u0003-\u0002O\"\u0005\u0001\"kC+\u001e?e\u0001\u001a0XCcP\u001aye\u00066[[|\u0019\u0000g[\u0012A";
      f1162[26] = "0D\u0014\u007f;?.\u000f\u0007\u0011o).>\u0010k{#(-\nja83\u0012\u000b\u00119.b\u0004Pm?\u007fbMm";
      f1162[27] = "d\b\u0015#u\fzC\u0006M!\u001azf\u000b7\"/aB\r1/\u0010`9U'~\u0006;ESv~O\u0006\u0000\u0006}?Jz\u0006W}vw";
      f1162[28] = "?\u0002W\u0015-(5\u0007U\u001aD(7\u0001k].}'Z\u0017[\u007f}ngR\u000et<k\u001bT_tuV^\u0001T5p*XPT|M";
      f1162[29] = "i%\u000byC\u0014`rZb\u007f\u0001b\u0012Mh\u001e\u001bjI\bp\u001a\u0001os\t)\u0014\u001d\u0005";
      f1162[30] = "\u0005Fw\b6\u0013\u0004\u001fy\u0014\\MQB}\b<)\u0005N\"\u0005aU\u0003\u001f\"L\\";
      f1162[31] = "\u0001f]UV^\u001f-N;\fC\u0018:^G1H\u0013+$\u0002\u000f@\u001f=\u001e\u0003VN\u0003W\u0019V\u0012GZ:YG\u000fFc";
      f1162[32] = "\u000775\u0017Yy\u0019|&y\u0007e\u001bk\u0007\u0004\u0018y\u0002|\u0010\u001e9~\f|0y_o\u001adu\u0014\u001f~\u0007eL";
      f1162[33] = "@mK\u0018z\u0019^&Xv$\u0005\\1y\u000b;\u0019E&2O+RSaNIzR\u001a\\\u000f\u001b>\u0000\u001b1O\n#\u0001\"";
      f1162[34] = "\\^$\u0010`LL\u0010/\u0014\u0005T[\u001e4\u000fif\f_hS41\u000f\bd\u00198M\tYdP\u0005\u0000\f\u001bk\u0005nRI\u000f?h";
      f1162[35] = "39\u0007\teV2`\t\u0015\u000f\u0017w1\u0019\tu\rl4bLe\\{f\u001eJ4\\2[[\u001f?\u001d7']N?T\nb\u0000\u0010s\u00060cY\u001eol";
      f1162[36] = "\u0010\u001e4ZTT\u0019IeAhG\u0011\njX\u0003P|Kd\u0001\u0019\u0000\u0000M5\u0001P=E\u0018>@UACI>\th\u0004\u001e\u0017r[R\u0005G\u0019n1\u0004QF\u00192X\r\u0006\u0017\u0002\u000e";
      f1162[37] = "S\u0012\u001f4\r!L_\u0000h2$S\u001a\u00138H3x\u0004\b\u001fO:ZcR!\tc\u000e\u000e\b2L`>_\u0016b\u000fnS\u0005\u0005'\f^";
      f1162[38] = "S\u001fh\u001ewBMT{p#TMnp\u001f,]PAq\f!U1\u0017s\u00150S\u000b\u0016*\u001b,9";
      f1162[39] = "},=\u0003$\u0010qp-CAJ~`!T-x* |\u000eA\u0016qy=Y{\u0017(w!3|Bl~x^<Sq\u007fA";
      f1162[40] = "\\z\u000by8OB1\u0018\u0017Ҫ4\u0005.\rkyZW9\u001fs";
      f1162[41] = "h\\rLH:d\u0000b\f-`k\u0010n\u001bAR?P0D-<d\tr\u0016\u0017==\u0007n|";
      f1162[42] = "^\u00173\u0014{*\u000fT2\u0012\tԹ4\u0007%J2i_\u0017~FyX";
      f1162[43] = "g}\u001f%\u0007\u0004f$\u00119m_%R\u001f!\u0011O^.@ RS5|\u00054\u0006>";
      f1162[44] = "i\\\u0018mcsgT\u000e,\rxkA\btaJ?\u0000U*\rrgM\u0016}c|o[W\u0013";
      f1162[45] = "$)\u001f\u0019#?:b\fwөD\u007frV\u0006%8y#VO";
      f1162[46] = "S5o\"C\u0014]=yc-\u0014]9{0zC\u0003k#\\CJ@dzcO\u0016P$";
      f1162[47] = "\u0015\u001a\u0015\u0003\u0001'\u0005T\u001e\u0007d?\u0012Z\u0005\u001c\b\rE\u001bYG^ZN\u001c\u001cD\t1\u001cY\b\u0010d";
      f1162[48] = ")\u0001<s\bd#\u0004>|ad)\u0014\u0000;\u000b11Y|=Z1xd9hQp}\u0018?9Q9@]j2\u0010<<[;2Y\u0001";
      f1162[49] = "4K>\u001c;=*\u0000-rԽFo\u0018\"\u000ej|nA,\u0012";
      f1162[50] = "$'Db8\u001b:lW\fx\r:V\\cc\u0004'y]p[\u0007=\u0016\u0004f3\u0011{j\u000273XF+PsaY+kAn``";
      f1162[51] = "T\u0015ada J^r\nՀ[\u000fF}v0a\u000e\u001fsjZf[[z37&JF{\n";
      f1162[52] = "T\r\u0014xCUDC\u001f|&MSM\u0004gJ\u007f\u0004\fX;\u0018(\u0007[Tq\u001bT\u0001\nT8&\u0019\u0004H[mMKA\\\u000f\u0000";
      f1162[53] = "Q\u0001o\u0005\u00102\u0000Bn\u0003b̿;\u0011y[YqP\u0001\"W\u0012@\u0006\u0011mX[-F\u0000pYb";
      f1162[54] = "t bV\\\u0014jkq8\u000b\u0002r|gU,\u000f\u007fk`8^\u0005&`&DXT&)\u001b\u0005\n\u0010t(vE\u001b\ru\u0011";
      f1162[55] = "'\u0014\u000f3'j9_\u001c]ϑ\u0011|OF,!mz\u001eFe\u001c,(Z\u0014dql9G\u0015]";
      f1162[56] = ":i\u0012\n~\u0011a:\u0010\u0017@\u000el)\u000f\f,<;jPUyk87\n\u0017*Q9n\u0004\u000b@Rke\u001eV<T:eWky\u00011$R\u0017\u007fP1moR*[ph\u0013T{[9U";
      f1162[57] = "Y6\u000f\u0014QtG}\u001cz\u0006b_j\n\u00175hAk\rzSe\u000bvK\u0006U4\u000b?vG\u0007pY>\u001b\u0007\u0016mX\u0007";
      f1162[58] = "\u001a6;\u0012\u0015n[s3\u0015uƟ'!>\u001eN;L1e\u0012\u0005\n";
      f1162[59] = "#0adx\u000b!ea'I\u000b-Uz (\u0011%\u000e6?&\u000bwdm6'\u001eJ7d?5\u001dp6=1)w";
      f1162[60] = "7\u007fp\n\u0014\u0005'1{\u000eq\u001d0?`\u0015\u001d/g~<INxd)0\u0003L\u0004bx0JqIg:?\u001f\u001a\u001b\".kr";
      f1162[61] = "d\u001e9x}\u000feG7d\u0017^=\u0015&Mk5d\u0016lu*IbGl<\u0017\u00058\u0013 9}^1\u00125\u0004";
      f1162[62] = "6%eb36&knfV.1eu}:\u001cf$)&oKm#l%; ?fxqV";
      f1162[63] = "\u0005a5_M`\u001b*&1\u001f\u001bX?,J\u000fc].6Mv$\b07H\u000e!\u0019*01";
      f1162[64] = ":+J\n\u001bX$`YdED&wx\u0019ZX?`o\u0003mE4\u001a\u000e\t_AawN\u0018B@X";
      f1162[65] = "~lf\u001fL|w;7\u0004py\u007fd1\b\u001d\u0015+jl\u0005Mi-;lLp,x0-I\f*)0dt\u001cy(k`\u001d\u0015.yp\\";
      f1162[66] = "\\1.oC7Bz=\u0001®L\u0007jgpE0\u0001;g9xuT0&<\u0004s\u00050o\u0001";
      f1162[67] = "\nRX\u0017\u0010{\u0014\u0019KyD\u0000Q\t\u0011\b\u0016|WX\u0011A";
      f1162[68] = "Q\t\u000e\u00001\fOB\u001dnĞw\u0002\u0002\u000eQg\u001cPG\u001a\u0005";
      f1162[69] = "p\u0017\u001d*r*n\\\u000eD2<nm\u0019>26h~\u0003?(-sA\u0002Dp;\"WY8vj\"\u001edy$.p\u001f\t953q&";
      f1162[70] = "9$?$fG)j4 \u0003_>d/;omi%sg3:jr\u007f->Fl#\u007fd\u0003\u000biap1hY,u$\\";
      f1162[71] = "\u000erS^\u000f\"T.Q\rm$S2QU\u0001\u0016\u0003q\b\rPA\u000e+^NP+U\"_[mp\u00047\u000e_\u0006\"A#Z2";
      f1162[72] = "C5<H\u0003\u0004]~/&]\u0018_i\u000e[B\u0004F~\u0019A8FK44\u001bD@\u001a4}&\u0005\u0012^f|KE\u0003CgE";
      f1162[73] = "hO\n@?\b2\u0013\b\u0013]\u000e5\u000f\bK1<eLQ\u001ceka\u0011\rP7Q`H\u0003L]R:\u0016\u0014FgSc\u0018\b,";
      f1162[74] = "!r\u0013*qU +\u001d6\u001b\u000e~|\u001b&\\\u0001\u0018)\u001cfjRd/Mf#o!zF'&\u0013'+Fn\u001bVr \u0007kgP# NV";
      f1162[75] = "\u0006\u0002,[^-T\u0015>C$*V\f>_XC\u0001\u001fh\u001a\u0014.[\f-\u0019$~P\u00181\u001eI>A\u00050'";
      f1162[76] = "Gw*!RpY<9Oρ\u000b\u001c,c>Tw\u001a}cwi2Ov\"r\u00154\u001evkOPa\u00157n3V0\u0015~S";
      f1162[77] = "PD.5v\t\u0017B!}G\u0002\u0007R+b+0S\u0013p9\u007fgSD{tz\u001bU\u0015{=G^\u0000\u001e:8;XQ\u001es\u0005~\rZ_vyx\\Z\u0016K<-W\u001b\u00137:|WR.";
   }
}
