package org.rusherhack.client.api.ui;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.IDraggable;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.interfaces.INamed;
import org.rusherhack.core.interfaces.IScrollable;
import org.rusherhack.core.interfaces.ITickable;
import org.rusherhack.core.interfaces.IToggleable;
import org.rusherhack.core.interfaces.ITypeable;
import org.rusherhack.core.serialize.Class062;
import org.rusherhack.core.setting.Setting;

public abstract class ElementHandlerBase<T extends ElementBase> implements Globals, IRenderable2D, IDraggable, IScrollable, ITypeable, ITickable, Class062 {
   public boolean positionsInitialized;
   public boolean f877;
   public static boolean f878;
   public static long f879 = Class066.m4320(-939596378419977233L, 3871708996640335146L, MethodHandles.lookup().lookupClass()).m4325(238044700057634L);
   public static String[] f880;
   public static String[] f881;
   public static Object[] f883 = new Object[125];
   public static String[] f884 = new String[125];

   public boolean consumeElementMouseScroll(T var1, double var2, double var4, double var6) {
        return false;
    }

   public boolean isElementHovered(T var1, double var2, double var4) {
        return false;
    }

   public boolean isEnabled(T var1) {
        return false;
    }

   public float getScale() {
        return 0.0f;
    }

   public abstract List<T> getElements();

   public abstract void setDefaultPositions();

   public boolean consumeElementKeyTyped(T var1, int var2, int var3, int var4) {
        return false;
    }

   public boolean consumeElementCharTyped(T var1, char var2) {
        return false;
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   public boolean consumeElementMouseMove(T var1, double var2, double var4) {
        return false;
    }

   public void consumeMouseRelease(double var1, double var3, int var5) {
        
    }

   public Optional<T> getElement(String var1) {
        return null;
    }

   @Override
   public void tick() {
        
    }

   public boolean consumeMouseScroll(double var1, double var3, double var5) {
        return false;
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      float var10 = this.getScale();
      var1 /= var10;
      var3 /= var10;
      return this.consumeMouseScroll(var1, var3, var5);
   }

   public abstract void initialize();

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public ElementHandlerBase(boolean var1) {
      super();
      this.positionsInitialized = false;
      this.f877 = var1;
   }

   @Override
   public void mouseMoved(double var1, double var3) {
      float var8 = this.getScale();
      var1 /= var8;
      var3 /= var8;
      this.consumeMouseMove(var1, var3);
   }

   public void renderElements(RenderContext var1, double var2, double var4) {
        
    }

   public boolean consumeElementMouseRelease(T var1, double var2, double var4, int var6) {
        return false;
    }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
      float var9 = this.getScale();
      var1 /= var9;
      var3 /= var9;
      this.consumeMouseRelease(var1, var3, var5);
   }

   public boolean deserialize(JsonElement var1) {
        return false;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      float var9 = this.getScale();
      var1 /= var9;
      var3 /= var9;
      return this.consumeMouseClick(var1, var3, var5);
   }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   public abstract void moveElementToTop(T var1);

   public void consumeMouseMove(double var1, double var3) {
        
    }

   public boolean consumeMouseClick(double var1, double var3, int var5) {
        return false;
    }

   @Override
   public boolean shouldSerialize(boolean var1) {
      return this.positionsInitialized;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public JsonElement serialize() {
        return null;
    }

   public boolean consumeElementMouseClick(T var1, double var2, double var4, int var6) {
        return false;
    }

   public static void m2016(boolean var0) {
      f878 = var0;
   }

   public static boolean m2017() {
      return f878;
   }

   public static boolean m2018() {
      boolean var0 = m2017();
      return !var0;
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
   public static void m194() {
      f883[0] = "&\u000fX\u000b?L&\u000fOW3C<DOI3V;5\u001f\u0014b";
      f883[1] = "jQ-HP2jQ:\u0014\\=p\u001a:\n\\(wkhV\tj";
      f883[2] = "2;|\u0016a0.!~J{$>\"5[\u007f,8'o\u0016r54gnQ=\u00001,v]}1\u0015(u\\\u007f /\u000bzKv";
      f883[3] = boolean.class;
      f884[3] = "java/lang/Boolean";
      f883[4] = double.class;
      f884[4] = "java/lang/Double";
      f883[5] = "~J$?\u001a6bP&c\u0000\"rSmr\u0004*tV7?\t3x\u0016\u0004}\u0007!pT0";
      f883[6] = "(Dw\fB\u00074^uPX\u0013$]>ɖ";
      f883[7] = "\u0014\u0010~)-U\b\n|u7A\u0018\t7d0R\u001eLjb+T\u0012\f~)\fE\u000f\u0016pi8";
      f883[8] = "\u001d~\u00043m\u0016h^\u000f<|Y\u0015F\u001c;u\u0010}";
      f883[9] = "gr&\u001a)-gr1F%\"}91X%7zHf\u0001|s";
      f883[10] = float.class;
      f884[10] = "java/lang/Float";
      f883[11] = void.class;
      f884[11] = "java/lang/Void";
      f883[12] = "g\u007f7\u0001\u001bS{e5]\u0001Gkf~L\u0005Omc$\u0001\bVa#%FGcdh=J\u0007RJl#J";
      f883[13] = "f\u0018&zC<m\u001775>$~\u0010>|";
      f883[14] = "\u0015mp|6\u0000\twr ,\u0014\u0019t91(\u001c\u001fqc|%\u0005\u00131e7*\u0011\u001fm9\u0000!\u001b\u001eze\u0011+\u001b\u000ezo&";
      f883[15] = "W\u0013\r|`\u0011\"3\u0006sq^_+\u0015tx\u00177";
      f883[16] = int.class;
      f884[16] = "java/lang/Integer";
      f883[17] = "\u0000~dH)\u0004\u001ev~\u0007K\u0018\u0019k[]b\u0003\u000bk}[";
      f883[18] = "%Vkw\u000bw.Yz8jy%R~b";
      f883[19] = "9U%\f`\u0005']?C\u0002\u0019 @";
      f883[20] = ":&Z\nd%&<XV~16?\u0013Gy\"0zTJb5'2\\Gs#{\u001dnGd?98\\Fz5";
      f883[21] = ")_h;&\u00127WrtA\u0013&L\u007f.g\u0015";
      f883[22] = "30;O\u0010\u0016/*9\u0013\n\u0002?)r\u0002\u000e\n9,(O\u0003\u00135l.\u0004\f\u000790r(0\u00062&9\u0013\u0007\u0011";
      f883[23] = "\r0.SY\f\u0011*,\u000fC\u0018\u0001)g\u001eG\u0010\u0007,=SJ\t\u000bl;\u0018E\u001d\u00070g4y\u001c\f&,\u000fJ\u001b\u000e'{9";
      f883[24] = "8N78b_$T5dxK4W~u|C2R.8qZ>\u0012\"s~N2N~_BO9X5duXex";
      f883[25] = "G ,w0\u001b[:.+*\u000fK9e:-\u001cM|\"76\u000bZ4*:'\u001d\u0006\u001b\u001f 2\u000bI0'<";
      f883[26] = char.class;
      f884[26] = "java/lang/Character";
      f883[27] = "zb~\b1Qfx|T+Ev{7E,Vp>jC1Mt|p\\&\n\\C|T*EyycG!Hp";
      f883[28] = "=G\u001e\u001f<Z!]\u001cC&N1^WR!]7\u001b\u0010_:J S\u0018R+\\||1X*J3W\u0015T";
      f883[29] = "v~\u0019]Y\u001ajd\u001b\u0001C\u000ezgP\u0010D\u001d|\"\u0017\u001d_\nkj\u001f\u0010N\u001c7E*\u001cL\bui\u001f\u0011G\n";
      f883[30] = "\u0002\u0002:\\QL\u001e\u00188\u0000KX\u000e\u001bs\u0011LK\b^4\u001cW\\\u001f\u0016<\u0011FJC9\t\u001b@R\f\u00121\u0017";
      f883[31] = "*LquT;&Dp>\u001d3:Lruy'&MY7V9,Mh";
      f883[32] = "\u000e|t\u001fF,\u0002tuT\u000f$\u001e|w\u001fk0\u0002}XCS\"\u0014";
      f883[33] = "hG\u0010<7qvO\nsVtvO\t3xh";
      f883[34] = "$X\u0017\u0010~X:P\r_6X Z\u0015\u0018?C`z\u000e\u001f#X#\\\u0013";
      f883[35] = "fW YL\u0010mX1\u00160\tbX7Z\u000e\u0019";
      f883[36] = "\u000e\u0003\u001ey@T\u0002\u000b\u001f2\t\\\u001e\u0003\u001dymH\u0002\u0002<5M^\u000e\u0018";
      f883[37] = "\u0004/\u0011&\u001d4\u00185\u0013z\u0007 \b6Xk\u0003(\u000e3\u0002&\u000e1\u0002s\u0010m\u000e5\u001e/\u0013&\f.\u00060\u0017f\u000bo\n/\u0011&&5\u000e0$m\t$\u00198\u0018k\n";
      f883[38] = "\u0013 \u0016\u001fx\u001e\u000f:\u0014Cb\n\u001f9_Re\u0019\u0019|\u0014Go\u0005\b|\u0002Dh\u0018\u001f \u0018SoE/'\u0013Bi\u0019\u00150\u0014CH\n\u000f7";
      f883[39] = "zVmz_\u0013fLo&E\u0007vO$7B\u0014p\nc:Y\u0003gBk7H\u0015;mN&L\u0001rEh8H";
      f883[40] = "\u001fY>1K\u001a\u0003C<mQ\u000e\u0013@w|V\u001d\u0015\u00050qM\n\u0002M8|\\\u001c^b\u001asP\f\u001bJ;s\\";
      f883[41] = "YKRs-OEQP/7[UR\u001b>0HS\u0017\\3+_D_T>:I\u0018p}2)_DXW1:";
      f883[42] = "\u0002.;}p|\u001e49!jh\u000e7r0n`\b2(}cy\u0004r):,Z\u000e=06fL\u0001916l}/=/6";
      f883[43] = "U\u0003j/<<I\u0019hs&(Y\u001a#b!;__do:,H\u0017lb+:\u00148C`#,^";
      f883[44] = "3/\u0012Nu=$ HC\u0012j\">-N{a\".)D~y/BMJtn-.\u001f\u001d(dO";
      f883[45] = "C'MV>\u001eI-F@\u000f\r\u001e>x14\r\u0015)J]fZI#(";
      f883[46] = "6Yo\u00056\r1Qs\u0003\u0007ȏ\u000f\u0002i\u0002g\u0014lH}\tj";
      f883[47] = "\\\tZ/(tB\r\u00046B\"U\u000fc13\"R\f\u001c8?wYcSe?([\u0001Ye899";
      f883[48] = "\u0001\nM#!r\u000b\u0000F5\u0010a\\\u0013yD+aW\u0004J(y6\u000b\u000e(";
      f883[49] = "Tn\u001aS\u0012*\u0010)^AoyD,cU\n{)aFAPwC*[L^\u0016";
      f883[50] = "N#j^\u001e/Wrc^c9_u$\u000e\u0004<^\u00181\u0010\u0003#\u0018e6P_}%";
      f883[51] = "\u00138^\bTQ\u00140B\u000eeSM?Z\u0010\u0000Ug=L\b\b^V\u0012A\u0004\u001fd[!L\u0001e\bO<F\\\u0019\u0002E7Pm\u0004\u0003\u0015h\u001f\b_DI2!W\u001cZJ)B\u001d\bQGY";
      f883[52] = "m/\"U@dj'>Sql/\u0003;Y\u001bi9\"]\u0000\u0014h3\u007f!\n\u001ec%NgI\u0013m$--]\u0018`T";
      f883[53] = "TB\u0018{w!\u0013^Uw\u001a9I_\\|_;POK\u0011!3HIE}sd\u0014C'*u:E@Kx\"fO\"\u0017!g?L@\u001d!`..";
      f883[54] = "Gr\"F\u001c4^#+Fa:E2J\r\f$M.o\fa`U+r\u0007\u0002*A \u007fw";
      f883[55] = "#DY\u0010?2q\u0018Y\u0013\\7p\b@\u00120\u0005'N\u0011MgR-D]\u0016>0'DZ\u0007\\";
      f883[56] = "\u0001<\rs3U\u00064\u0011u\u0002W_;\tkgQ}:\u000fmogS'\u0015rf<\u00032\u0014}`PQeHw\u0002\u0007W;\u0019tnU\u0000g\u0013\u00169S^6\u0010zk\u0004\u0002<r,{^X-\u0011foUU]";
      f883[57] = "l<Ala\u0013|n\u001bmQ\u000e\u00152\u001c(nC\u007fy\u0001%`\"$`\u0002j0Ho}\u000fdQ";
      f883[58] = "**=+Y\u007f;<1qcx'1=M\t3,r  \u0002jz.P";
      f883[59] = "+RFTp\u000b,ZZRA\u0007uMT|%\u000fw^_M\u001d\u0005NTA1q\u0007wT\bM{\r|B9\u0001q\u001fqQ[\u000bq\u0018`3";
      f883[60] = "c3D\u0017P8b?F\u001f>2a7\u0017\u0015DHel\u0017\u0011\u0002ua`\u0016\b>sc7\u0010\u001aR!4k\u001ax\u0005'j:\u0019\u0014Wp60{H\u000e5o3\u0019B\u000e2~Q";
      f883[61] = "]\u0019{I'\u0013\u001a\u0003 \rF\u0006$K \nyKN\u0000=\u0007w*\u0015\u0019>H'@^\u00043FF";
      f883[62] = "j\u0002=1\u0015\nm\n!7$\b4\u00059)A\u000e\u0016\u0004?/I(7\u0002)7$X<\u0005)6H\nkY#T\u001f\f5\b 8M[i\u0002B>\u0014\tb\u0013/5M_>cx-F\u0003#\u000029M\u000eS";
      f883[63] = "d\u0019`LHP8\u0016r\u000ev[kS\u007f[\u0012AtD\u001eY\t@d\u0014c^I\u001c:)";
      f883[64] = "^%+\b\u001a\u001a[%\u007fUy\u0016Bih\b#\u001eAyz\u001e\u0014\u001f%/|\u0003\u0012\u0011I}+_\u0018s\u001e{u\u000e\u001b\u001fL,)\u0004y\u0019\u0015~\"\u0015\u0014\u0012L(~eICXwq\u0007CC_f\u0013";
      f883[65] = "\u007fTr3\b\u0005 X,gc՜BTm,\u001c]2]w4Y=";
      f883[66] = "i\u0003\u001f\rqT;_\u001f\u000e\u0012Q:O\u0006\u000f~cm\tWP/4hZ\f\u0003~H&J\u0006\u0012\u0012\u000b>Y\r\u0004nE.S\u001ch-]=X\n\u0014cM7IfX\"I4Q\u0004R\"N%3";
      f883[67] = "\u0015[R-!:\u0018\u0005\f&\u0019d\u001f\u0019K0Bj\u0002\u0003T9tmx__;rc\u0014\r\bgx\u0001C\u000bV6{m\u0011\\\n<\u0019:\u0017\u0002[?uh@^Q]#x\u001a\u0004@>il\u0011\t0";
      f883[68] = "9_GPC$.^J\u0003\"w:^\u0017\u000f\"-gL\u0015\u000b@'gK\u0004i";
      f883[69] = "\\+*\u0014!w[#6\u0012\u0010u\u0002,.\fus(.8\u0014}x\u0019\u000f2\fks..4\u001as\u001eU/0\u0016!b_%;\u0000\u0010%\n,>\u0013|w]p4q+q\u0003!7\u001dy&_+U\u001b tT:8\u0010y\"\bJo\br~\u0015)%\u001cyse";
      f883[70] = "b;J6T\u0011k7\u001f=;\u0001k6j&y\u0015a,j'A\u0007wJF7\u0002\u0014luX3\\\r\u0006";
      f883[71] = ":)\u000eSUg=!\u0012Udш\u0003r\bT\u0004~`8\u001c_\t\u000e3x\fU\u0006l9x\u000bDd";
      f883[72] = "NqS!v<IyO'G>\u0010vW9\"82wQ?*\u000f\u001atA-<8w+C\",7\u001by\u0014~&UL\u007fJ/%9\u001e(\u0016%G?Gz\u001d4*4\u001e,ADwe\nsN&}e\rb,";
      f883[73] = "\u001a\u0018m>\u000eG\u001d\u0010q8?ED\u001fi&ZCn\u001d\u007f>RH_<u&DCf\u001el6?\u001eF\u001cujC\u0014L\u0017c[\u0004AE\u0012p7V\u0016\u0019\u0018\u0012`PHH\u001b~2\u0007\u0014By(\"]NS\u001ab6VC#";
      f883[74] = "\tV\u0005E\u000bp\u000e^\u0019C:rWQ\u0001]_t}S\u0017EW\u007fLr\u001d]AtjZ\u001eMSb]7JE_~\u0001K@OTh0\f\u0015FQ{\\^B\u001a[\u0019\u000bX\u001cKXuY\u000f@A:s\u0000]KPWxY\u000b\u0017 \u0000`RW\nCJtYZz";
      f883[75] = "w#OMeVj&\u000eX\u0003\u0007f8q\u000e`\u001a0\"\u001bE}\u0017>CKFa\u0007\u007f \u0001Rj\n\u000f";
      f883[76] = "~3g'j\u001c,og$\t\u0019-\u007f~%e+z9/z5|{lx)k\u0010);$#\tG/eu e\u0015x9\u007fB2\u0013&h|.`Dzb\u001er9\u0001#a|x9\u00062\u0003";
      f883[77] = "\"m^4!d%eB2\u0010f|jZ,u`^k\\*}H|rLQ+b}gC=y5!m!j\u007fkpnM8(7z\f\u0011amnyn\u001baj\u007f\u001b";
      f883[78] = "$\fRqGrt_Hd~is0HxErw\u0000Yp\u0004";
      f883[79] = "r\u0018NJ:\u0003{\u0014\u001bAU\u001dm+\\F3;|\u000bJJ)|,\u0010EA%\u001ff\u0004NLU";
      f883[80] = "l\u001a[B\u0007Wk\u0012GD6Q8\u0007iC[[8\u001dX'\u0007](DEML@%J.A\\\u0000,\u0004NE\fQj{";
      f883[81] = "/nu\u0005n?&b \u000e\u0001/&cU\u0015C;,y[\u0004c- c\u001c\u0016a~9y-\u000bd?,\u001f";
      f883[82] = "\u0012\f\r\u0016Wp\u0016\\\\P(w\u0011\u001eO\u001e(|\u001eXJ\u0010BxN\t\fo";
      f883[83] = "6(Xfq\u0011i$\u00062\u001a͖\u000b(GyeI{!]a );qB`xK1qEq\u001a";
      f883[84] = "Hb\u0004nO<\u001bg\u0012$><La>;N % \u00014^,Fj\u0015?S\\";
      f883[85] = "[\r\u0001&WfX_A$*{\\t\u001a$G`JX}aE|LV\u00113\u0012 F4F5LqEX\u0014b\u0010{'\u000e\u00048JjDD\u00103G\u001a";
      f883[86] = "z\nZ{g\u000f}\u0002F}V\t.\u0017hz;\u0003.\rYeV\n*\u0006C$*\u001b<\n\u0019\u001e";
      f883[87] = "+|?\u001a1F\"pj\u0011^V\"q\u001f\n\u0005E5l0\u001e^\b,pi\u00104C1}gq";
      f883[88] = "V<W\u0002 jQ4K\u0004\u0011h\b;S\u001atn\"9E\u0002|e\u0013\u0018O\u001ajn46R\u0000ugomM\u0002v2\u0013gG\t`\u0003T2N\fso\u0006e\u0012\u0006\u00118\u0000;C\u0005}jWgIg*l\t6J\u000bx;U<(]ha\u000f-K\u0017|j\u0002]";
      f883[89] = "t\u0002L5\u001ev~[D.dwlcB:\u000brzS%o\u001dtwOF%\t\u007fz?";
      f883[90] = "\u0004kpE1RWnf\u000f@T\u0004cp}+M\tq1\u0000,\rU/\f";
      f883[91] = "Ofh3epE~%h\u0018*Onb_i9Bk\u0018b#~\u001e9}9d\"D\u0007\"zz!_dhnq,/";
      f883[92] = "a\u0003\\g\nTeS\r!u_i1\u0018s\u000eSa\u0015%d8Z|\u0004bx\bP>V\u001brMR}i\u0005x\u0012U?\u001b\u001e#\u0014W\u0007YRc\u0016\\eSRd\u0007>";
      f883[93] = "\f<x]Xq\b)*\u0013>}\t=p/\u000e1\u00155qM\u00041\u0012$\u0013";
      f883[94] = "sZkQXhtRwWiz'Au]\r`8V\u0014P\u0018h!TkY\u0014=*;";
      f883[95] = "S]/\u001d\nF\u0001\u0001/\u001eiC\u0000\u00116\u001f\u0005qWWg@X&]]+\u001b\u000bDW],\ni";
      f883[96] = "\u0017o4rE\u0006\u0013-bg?ZC.lqSh\u0012n=+?\u0004A4gtSV\u0016hm\u0016";
      f883[97] = "\u0016\u0007y\u0019BP\u0011\u000fe\u001fsRH\u0000}\u0001\u0016Tb\u0002k\u0019\u001e_S%k\r/HW\u000bj|C\\J\u00017\u0000IVA\u0017\u0006\u0016CS\u001e\u0016k\u001d\u001a\u0005BflL\u0019\b_\u000bg\u0015OT/\f6\u0016BIB\u0007o@\u001e9\u0015\u001fd\u001c\u0003Z_\u000bo\u0011s";
      f883[98] = "WRz7AK]Xq!pX\nK@1\u001cK\u00077$?\u0016\\\u0005[vhJVg";
      f883[99] = "9jG\u000bRg7;O\u0011h? DC\u001a\u00043=\u0004\u0018\u000f\n>+gR\u001b\u00013[";
      f883[100] = "qG@(_\u0001u\u0017\u0011n \fy-\u0015.@\t*P\u0012n\u001cW\u0017K\u0014oY\u0014}OD>\u001fk";
      f883[101] = "\u001aC!\u000bk=\u001eO \u0012Wx\u0014\u0005 bi0\n\u001b.\u0002;l\n\u0018M";
      f883[102] = "KzVbp\u001aAp]tAƴ{.Px~\u0007\u0011eMupfK/Nf#\u0004A/IwA";
      f883[103] = "<e%\u001e.qwx(\u0010Ovt{1E4Zb`?[\"Pd}5!~xp99K5e}7X\u001b6ymv;Q\"r`\u0006";
      f883[104] = "rK\u0011l\u0004?lOOunakLR\u007f\u0012gm!En\u00128fA\u0016k\u0004r\u0017";
      f883[105] = "(f':\ns9p+`0k%t6\u001dLb>f6;J\u000f.? m@b%fv10d\u007f?{!^}.6{\\";
      f883[106] = "Z\u0003AFt%K\u000b\u00008~xG\u000e\u001dTL/\u0001PJ\u0003\u001b,\u0006V\u001eB\"(D\u0000\u000b8";
      f883[107] = "=\u001c}\u0010+^:\u0014a\u0016\u001a[i\u0006o\u000f{^`\u001cp\u0018\u001aSu\u0014i\u001aeZyAbu Nf\u001dr\u0016jZm\u0010\u0002";
      f883[108] = "Qf,\u0002,\u0015\ri>@\u0012\t^-?\u0006s\fW7 \u0011\u0012\u000eL60Ao\t\fjn|(\u001cQ6\"\u001fb\bZ;R";
      f883[109] = "r%)\t\u0011p.*;K/{pr*\u0013C[}o6\u001eKabxWMVbpe4\u0007Bi}\u0015m\u000eM``v'\u001aFm\u0010";
      f883[110] = "6snL!\u0002<yeZ\u0010\u0011kjKFq\u0011fj\u000b\u0010\u007f\u0018mtgB(Dg\u0016";
      f883[111] = "=V\u0018\u0011cW*YB\u001c\u0004\u0000,G'\u0011m\u000b,W<\u0017e\u0000!G|Ak\t*Y\u0010\u0013<U ;";
      f883[112] = "\u0019<PlY7\u0013$\u001d7$e\u0014,|-\\k\u0015]JlN7\t0A5\u0018ky7\u00106\u0015v\u0014<I`I\u0006\u0013mJmTk\u00184\u001c1$<\u0000?@,Gv\u00144M\\";
      f883[113] = "`,\u001f[$$j&\u0014M\u0015˜Px\u0019A*9:3\u0004L$X";
      f883[114] = "[\u0000o\u0004o(J\u0016c^U5K\u0004x\u000b)3Mio\u001a)lF\t<\u001f?&7";
      f883[115] = "\u00012H8\u0014^\u0006:T>%O_(V!DP^(v;DKY:S<WZTS\r$GWH0G0LZ";
      f883[116] = "|K\n%+[kJ\u0007vJ\u000ftI;,z\u001fqGY&z\u0018`%";
      f883[117] = "S\"\u0018\u0019,bV\"LDOnOn[\u0019\u0004oIxC\u0019#\u000b\u0013|F\u001f-gA+\u001a\u0015O0GuK\u0016#b\u0010)At%;B\"P\u0019.b\u0014~ N6iHcC\u0004\"bE\u0013";
      f883[118] = "\u000ezi\u0019M\u0004\tru\u001f|\u0002ZgM\u0017\u0015\tZ\u001b)\u0015\u0016\u0006[gg\u0005\u001c\u00177";
      f883[119] = "RN(\u007f0%UF4y\u0001&k\u00139e{.\u0005\u0016ka=LWA(`c\"R\u0013,&\u0001";
      f883[120] = "{\b\u0018? 5f\rY*Fkn\u0014&|%y<\tL78t2hB</ol\u0017K0zd\u0003";
      f883[121] = "z\u001a\u0006iY2(F\u0006j:7)V\u001fkV\u0005x\u0014C5\u0004R{C\u0015gV.5S\u001fv:m-@\u0014`F#=J\u0005\f\u0005;.A\u0013pK+$P\u007f<\n/'H\u001d6\n(6*";
      f883[122] = ";D+?+&,E&lJ~.`gg.s4Lu\u0006pf7Jje:r<G\u001a";
      f883[123] = "\u001a\u0014p=0\u0015\u001d\u001cl;\u0001\u0006N\u0013c5{1G\u0018j5g\u0000Xufem\u0015\u001fHbil\f#N`>j\u001eO\u001c7b`|\u0018\u001ai3c\u0010JM59\u0001L\u0013\bl:cF\u0013\u000f}X";
      f883[124] = "\u001eb\u00103`\u001d\u001fn\u0012;\u000e\u0002\u001c|u1h\u0001\u001czB&\u000e\rJ`N9q\u0014\u0018aO\\";
   }

   public ElementHandlerBase() {}
}
