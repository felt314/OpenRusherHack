package org.rusherhack.client.api.ui.window.content.component;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.client.api.utils.objects.TextField;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
public class TextFieldComponent extends WindowContent {
   public TextField f1011;
   public double f1012;
   public boolean f1013;
   public Predicate<Character> f1014;
   public Consumer<String> f1015;
   public Timer f1016;
   public String f1017;
   public boolean f1018;
   public Timer f1019;
   public double f1020;
   public boolean f1021;
   public static long f1022 = Class066.m4320(-4172429937582323665L, 8796485982110797439L, MethodHandles.lookup().lookupClass()).m4325(60061315606874L);
   public static long f1023;
   public static Object[] f1024 = new Object[80];
   public static String[] f1025 = new String[80];

   public boolean isFocused() {
        return false;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public TextFieldComponent(Window var1, String var2, double var3) {
      this(var1, var2, var3, false);
   }

   public TextFieldComponent(Window var1, double var2) {
      this(var1, "", var2);
   }

   public void setCharacterFilter(Predicate<Character> var1) {
        
    }

   public TextFieldComponent(Window var1, String var2, double var3, boolean var5) {
    }

   public String getLabel() {
        return null;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   public void setWidth(double var1) {
        
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public void setValue(String var1) {
        
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   @Override
   public void unfocus() {
        
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
        
    }

   public String getValue() {
        return null;
    }

   public void setFocused(boolean var1) {
        
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   public String getDisplayValue() {
        return null;
    }

   public void setReturnCallback(Consumer<String> var1) {
        
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   public void setLabel(String var1) {
        
    }

   static {
   }
   public static void m194() {
      f1024[0] = "'\u0016\u000bA7\u0017;\f\t\u001d-\u0003+\u000fB\f)\u000b-\n\u0018A$\u0012!J\u0019\u0006k\u0015!\n\b\u00002L+\u000b\u0002\u001b \f<J\u000f\u0000(\u0012'\n\t\u00011L\u001c\u0001\u0014\u001b\u0006\r%\u0014\u0003\u0001 \f<";
      f1024[1] = "\b\\.%W*!e2?Uv;q\"<\u001eg<b$yCa'd(9W*\u0000u5#Yj4+";
      f1024[2] = "g@\u0013\u0012J={Z\u0011NP)kYZ_W:m\u001c\u0007YL<a\\\u0013\u0012k-|F\u001dR_";
      f1024[3] = "R-.{\b\u0012'\r%t\u0019]Z\u00156s\u0010\u00142";
      f1024[4] = "\u0016uE\u0017i^\noGKsJ\u001al\fZwB\u001ciV\u0017z[\u0010)WP5\\\u0010iFVl\u0005\u001ahLM~E\r)AVv[\u0016iGWo\u0005-bZM]B\u001ckFztF\thL\\u_";
      f1024[5] = double.class;
      f1025[5] = "java/lang/Double";
      f1024[6] = "|$UIXE`>W\u0015BQp=\u001cȓ";
      f1024[7] = boolean.class;
      f1025[7] = "java/lang/Boolean";
      f1024[8] = "sc/\u0005e'ZZ3\u001fg{@N#\u001c,jG]%Yql\\[)\u0019e'{J4\u0003kgO\u0014";
      f1024[9] = void.class;
      f1025[9] = "java/lang/Void";
      f1024[10] = "r\f^-y3y\u0003Ob\u0004+j\u0004F+";
      f1024[11] = "m+9S\"\u0007s##\u001cj\u0007i);[c\u001c)\t \\\u007f\u0007j/=";
      f1024[12] = "a:hz5\t\u007f2r5}\te8jrt\u0012%\u000bl~\u007f\u0015h:j~";
      f1024[13] = "e\u000eZ\u0014G\ry\u0014XH]\u0019i\u0017\u0013YY\u0011o\u0012I\u0014T\bcRHS\u001b\u000fc\u0012YUBVi\u0013SNP\u0016~RjS[\u001ce\u000b~U[\fo\u0012I";
      f1024[14] = "_1\f\r\u0017qC+\u000eQ\reS(E@\tmU-\u001f\r\u0004tYm\u001eW\fhCm\u0004A\u000faS7\u0018\r1aH7-J\u0000hT";
      f1024[15] = "B\u000f?SCx^\u0015=\u000fYlN\u0016v\u001e^\u007fHS-\tXa^S\f\u0014\\h_";
      f1024[16] = "\u0013\u007fs3D\u0016\u0018pb|)\u0012\u0018ld1\u001e\u001f\u000b";
      f1024[17] = char.class;
      f1025[17] = "java/lang/Character";
      f1024[18] = "N\u001c~h|GE\u0013o'\u001dIN\u0018k}";
      f1024[19] = "\u001f9\t;cN\u0003#\u000bgyZ\u0013 @v}R\u0015%\u001a;pK\u0019e\u001cp\u007f_\u00159@s~U\u0004e'S~U\u0004\u0019\u000b{u^\u0002.\u001c";
      f1024[20] = "j\u000b\nYI\u001bv\u0011\b\u0005S\u000ff\u0012C\u0014T\u001c`W\u0018\u0003R\u0002vW$8n\u001al\u0015\u001e";
      f1024[21] = int.class;
      f1025[21] = "java/lang/Integer";
      f1024[22] = "w88^V\u0001k\":\u0002L\u0015{!q\u0013H\u001d}$+^E\u0004qd-\u0015J\u0010}8q9v\u0011v.:\u0002A\u0006*\u000e";
      f1024[23] = "T:\tJ\u00101H \u000b\u0016\n%X#@\u0007\u000e-^&\u001aJ\u00034Rf\u001c\u0001\f ^:@-1'R;\u001d\u000b\u0010%Y$\u000b";
      f1024[24] = "C\u000feXK&^\u001a=z\n+F\u001c";
      f1024[25] = "\fG7\f.hyg<\u0003?'\u0004\u007f/\u00046nl";
      f1024[26] = "1XbC?#0Ua\u001a_2mNG\u001491mHp\u0003_3fQ}\u0010?4~\u0002wy";
      f1024[27] = "WuDWQ_O*K\n?SS4z\u0016G]REK\u0001\u000f\u0001DyL]MS>(@W\u000eJ\u0002/\u001c\u0015\\0S#\u0016VE\fT\u007fT\u0004?\fL5X\u001ePQZ%Gg";
      f1024[28] = "w#\u0015N>Uo|\u001a\u0013PUso<\u0003*Ayi/\u0019+[br\u0010\u0018PWx#F\u0004lP$a\u0014~";
      f1024[29] = "o\r\u001f\n6In\u0000\u001cSVX3\u001b.W0K\u0004\n\u0006\\;M3\u001d`\\=[4\u0001]\\:Feg";
      f1024[30] = "\u0016Z\"{zA\u000e\u0005-&\u0014O\u0019\u0011-1hr\u0012\u001a<K+B\u001eR0)kA\u001c\u0016@uz\u0011F\u0011p$zE\u0004j";
      f1024[31] = "E\u001a\u0012{/GD\u0017\u0011\"OItK\u0010y=A\u0015N\u0007'+";
      f1024[32] = "Y\u0013_AS8\u0019\u000eQpՊE^\u0011U\u0002\u0017\"\u0019\u0019S\u0016/{\rH\r\u000b\u001f*\r\u001cOp";
      f1024[33] = "BY(cg1\u0002Z*'\u0017(\u0000_2'm2\u001bZI6qcLOu1-!\u001e5$='b\u0007\t#ae0}\n%:/#\u001fJ&8kS";
      f1024[34] = "&e\tX\\.+e\u0006^m#{gK>\u0006-/qZ\u0002\r3k-7\u0002\u001f/heX_\t?w\u001c";
      f1024[35] = "-C(&\u001a]5\u001c'{t])\u000f\nw\u001bR \u0012%v\b_(suz\u0015\n4\u00115y\u0017ND";
      f1024[36] = "\u0001V\u0007rP.\u000e\u0000R!7z\f@c\u0004}\u0015\fZ\tzM)\u000b\u0006K(7";
      f1024[37] = "#^V7\u001a+;\u0001Yjt>'\u0015Y{tz$Q\r|D+$\u0005O\u0007";
      f1024[38] = "\u0001\n\u001c,\u000bUS\u001c]({u:Z\u0013e\u0005RU\u0007\u0005u\u001a";
      f1024[39] = ";pHDrX87\u0013S\u0017Շ\u0002iMBg\u0016}wCC|&";
      f1024[40] = "6M\\!\u0003+d[\u001d%sҎ\rH\u0011zC;bPNu\u001e";
      f1024[41] = "Tc\fg<\u000f\u0006uMcLǚo4\ff>\t\u000e1\u001b8(";
      f1024[42] = "J\n\u0001QF\u0004RU\u000e\f(\u0004NF/\u0000S\u0013GS\u0012=E\u001b_:\\\rISSX\u001c\u000eK\u0017#";
      f1024[43] = "C/}\u0014+O\u0003,\u007fP[L\u0007\u000eyT'\\|\u007fn\\%T\u0013\"xL:-";
      f1024[44] = "aph.\u0011\u00073f)*a\u0010Z qq\u001f\u0015`yqw\byfxsi\rC?xu~a";
      f1024[45] = "dK\u0018wt#6]Ys\u0004<$i\u0002%y&2Kerv-!^\n/`=>'";
      f1024[46] = "&i\fX;\r\"|SO\u0003M.|2XbN2c\u0013ydEI:\u0007\f:Nyk\u0007Xx5";
      f1024[47] = "b\u0001|\b\u000e,c\f\u007fQn#SP~\n\u001c*2UiT\n";
      f1024[48] = "\u0006;O)pI\u001ed@t\u001eI\u0002wmxqF\u000bjBybk\tgu~e&\u0002m\u001d(d\u001a\u00051_z\u001e";
      f1024[49] = "&RJ(.~tD\u000b,^opBix:}p>\b}?8m\\H~=|\u001d";
      f1024[50] = "YIP \u001c#YNMqzqX^g6\u0000\u007fSMc+\u0016bU\"\u0003&\u001b&E@C%\u0019b5\u0019Ar\bfT\u001cV,\u001e\u001e";
      f1024[51] = "K3w\b\u0017gL+$\u0002~k_<k2\u0013lY<r\u0007\u001aj%niP\f\u007fDk~\u000e\u001a\u0007\u001e(,\u001a\u0006f\u001b?r\f~<Xmf\u0010\u001f9O3phEz\u001d'l\t@mC1\u0014\u0005\u00187\u0014/(\u0002DuFU*\u0006A>^e{\u0006\u0015|%";
      f1024[52] = "H7\fY\u00165KpWNs̴q.\t_\u0003{\u000e0\u0007^\u0018KO V\u000b\b{\u001e \u0002Is";
      f1024[53] = "5>8\b\u0013Hg(y\fcƭ\u000en7A\u001dOa3!Q\u0002";
      f1024[54] = "%\u0013iI_Kw\u0005(M/Zs\u0003T\u001dNZ~\u0003\u0014KR\rl\u0007uNESz\u007f";
      f1024[55] = "\u0018jPV/!Xw^gѸ\\\u001fhZ\u0015k;X`\\\u0001S";
      f1024[56] = "W\u001a*1yDW\u001d7`\u001f\u0015A\u00189\u0000c\u0003Z\u0017)[ \u0015ZI69`\u0016X\rF`bAI\t'eu\u001f_q}&'\u000bC\u0010x1y\u001d;\u001c k.\u0003\u0007\u001b|)|y\u0000\f~)g\u0018\u0005\u001b ?\u001f";
      f1024[57] = "sT6&bawAi1Z\"wX(6=#V^#Ma$$K+,d3z]Sv'anA2s0?x9h0b+dXm'<=\u001c\u0002.u(!}\u00079+>Y\"Wlt!isW86Z";
      f1024[58] = "\u0011\u0004<z\u0010!\u0011\u0003!+vs\u0010\u0013\u001ew\u0010`=\u00021\u007f\u0016`}T-(\u0004d\u001cQ:v\u0012\u001c";
      f1024[59] = "\u0007\u0002e\u001eL\u001bG\u0001gZ<\u0002E\u0004\u007fZF\u0018^\u0001\u0004KZI\t\u00148L\u0006\u000b[n;J]AH\f{I_\u00058";
      f1024[60] = "Z:p@7\\]j,\u000f\u000bF^/,\u0002\u000b\u0002]kx\u0005;S]?:~";
      f1024[61] = "EMK/\u0010Y]\u0012Dr~YA\u0001i~\u0011VH\u001cF\u007f\u0002mP\u0014Sc&QW}DyN\u0007VAC%\fU,";
      f1024[62] = "M1g@x?Unh\u001d\u0016;Dh\u007f,g(Im\u0005\u001ai1Adc\u0019}nJ\u00019\u0002f.]nd\u0014v1$";
      f1024[63] = "c\u0018@!8g#\u001bBeH\u007f1\fEp#h\u0015\u0010E\u0019wi=LQ{7j?\b!&$dd\u0004Cf'f t\u001eu)=,\u0016^v+y\\";
      f1024[64] = "\nU,\u0012\u000bhXCm\u0016{й1\u0006=JCfSF>H\u0007";
      f1024[65] = "Ov\u0019o)(\u001d`XkYëts\nggj\u0014tZ;(";
      f1024[66] = "!;hwN!s-)s>ӄ\u001aglpXnkjl\u007f^";
      f1024[67] = "-38az\u001e\u007f%ye\n\u000f{#\t9q\u0018r64\u0006c\u0004k2Egf\u0001./''e\u0003j_";
      f1024[68] = "y@\u001ewv\u0019+V_s\u0006ƢB\u0017\u001evt\u001f#\u0012\t(b";
      f1024[69] = "Tlj\"\u001c+\u0006z+&lкoiy*Ri\u000fn)v\u001d";
      f1024[70] = "\u0000URd\u001a8UNYx|,m\u0001X}Dp\u000fA[\u007f\u0000\u0000RRU$\fb\u0012QW`|";
      f1024[71] = "B\u0013\u001ayu\u0006MEO*\u0012rx0u@rW\u001c@C{}\u0001I\u0013";
      f1024[72] = "3\u000bAE6.2\u0006B\u001cV1y!Y\u0001;*o\r>D+hp\u0019_A<6fa\u0005\u0002n\"z\u0000\u0000\u001504\u0002]L\u000f()m\u0000Z\u001f7P";
      f1024[73] = "5pj\u001fk\u007fgf+\u001b\u001bԏ\u000e eVexa}sFz";
      f1024[74] = "b\u000fX\u001e\u0016)e_\u0004Q*1b\u001a\u0012MFI0\u001cQRR(5\u000b\u000fD*uy\u0011\u0017YE(o\u0001\b ";
      f1024[75] = "\u0015w\t+\u0018\u0014\u0002 \u0014k$\u0011\u0016\"\u0016vc\u0001\u007f,\u0014zA\n\u0019/\u0000%Jo\u0015w\t+\u0018\u0014\u0002 \u0014k$";
      f1024[76] = "\u00139e\tw'A/$\r\u0007Ӻ(jg_n`C.fIk";
      f1024[77] = "\u0017cDd\u001c_SbRa%]CwFuY4Cn\u0012`H\bHpV<%\nF#\u0012v\u0015[FwP\r";
      f1024[78] = "65[%GAd#\u001a!7D`%h{\\Bv4J\u001c\u000bM}'_sV[m8&\"Y\u00004\"\u0016sYTvY";
      f1024[79] = "_\u001d\u0004i$m\r\u000bEmT|\t\r&18o\u0004qB-la\u001c\u0010G:2wd";
   }
}
