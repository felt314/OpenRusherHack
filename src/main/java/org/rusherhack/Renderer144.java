package org.rusherhack;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;
import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.CheckBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.ComboBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.ui.window.view.ListView$ListItemView;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.utils.ColorUtils;

public class Renderer144 extends WindowContentHandlerBase {
   public Renderer191 f2950;
   public static long f2951 = Class066.m4320(2128393120058865148L, -7527479651979110293L, MethodHandles.lookup().lookupClass()).m4325(253741761946861L);
   public static String[] f2952;
   public static String[] f2953;
   public static Object[] f2955 = new Object[93];
   public static String[] f2956 = new String[93];

   @Override
   public void handleRenderContent(WindowContent var1, double var2, double var4, WindowView var6) {
      super.handleRenderContent(var1, var2, var4, var6);
   }

   @Override
   public boolean handleMouseClicked(WindowContent var1, double var2, double var4, int var6, WindowView var7) {
        return false;
    }

   @Override
   public void renderListItem(ListItemContent var1, double var2, double var4, WindowView var6) {
        
    }

   @Override
   public void renderCheckBox(CheckBoxComponent var1, double var2, double var4, WindowView var6) {
      int var20 = Class253.m9155();
      IRenderer2D var19 = var6.getRenderer();
      IFontRenderer var10 = var6.getFontRenderer();
      int var9 = var20;
      boolean var11 = var1.isHovered(var2, var4);
      Color var12 = this.f2950.getWindowColor(var1.getWindow());
      var2 = var1.getX();
      var4 = var1.getY();
      double var13 = var1.getSize();
      boolean var21 = var11;
      if (var9 != 0) {
         if (var11) {
            var19.drawRectangle(var2, var4, var13, var13, ColorUtils.transparency(-1, 0.1F));
         }

         var19.drawRectangleOutline(var2, var4, var13, var13, 2.0F, var12.getRGB());
         var21 = var1.getValue();
      }

      if (var9 != 0) {
         if (var21) {
            var19.drawLine(var2 + var13 / 4.0 - 0.5, var4 + var13 / 2.0, var2 + var13 / 2.0 - 0.5, var4 + var13 - 2.0, 4.0F, var12.getRGB());
            var19.drawLine(var2 + var13 / 2.0 - 0.5, var4 + var13 - 2.0, var2 + var13 - 2.0 - 0.5, var4 + 2.0, 4.0F, var12.getRGB());
         }

         var21 = var1.getLabel().isBlank();
      }

      if (!var21) {
         var10.drawString(var1.getLabel(), var2 + var13 + 2.0, var4 + var13 / 2.0 - var10.getFontHeight() / 2.0, -1);
      }
   }

   public Renderer144(Renderer191 var1, Renderer191 var2) {
    }

   @Override
   public void renderComboBox(ComboBoxComponent var1, double var2, double var4, WindowView var6) {
        
    }

   @Override
   public void renderTextField(TextFieldComponent var1, double var2, double var4, WindowView var6) {
      int var22 = Class253.m9155();
      IRenderer2D var10 = var6.getRenderer();
      var6.getFontRenderer();
      int var9 = var22;
      TextFieldComponent var23 = var1;
      var1.isHovered(var2, var4);
      Color var11 = this.f2950.getWindowColor(var1.getWindow());
      double var12 = var1.getX();
      double var14 = var1.getY();
      double var16 = var1.getWidth();
      double var18 = var1.getHeight();
      var10.drawRectangle(var12, var14, var16, var18, ColorUtils.transparency(Color.LIGHT_GRAY.getRGB(), 0.1F));
      if (var9 != 0) {
         if (var1.isFocused()) {
            var10.drawRectangleOutline(var12, var14, var16, var18, 2.0F, var11.getRGB());
         }

         var23 = var1;
      }

      var23.renderContent(var2, var4, var6);
   }

   @Override
   public void renderButton(ButtonComponent var1, double var2, double var4, WindowView var6) {
        
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
      f2955[0] = "\tN\u0019E\"F\u0015T\u001b\u00198R\u0005WP\b<Z\u0003R\nE1C\u000f\u0012\f\u000e>W\u0003NP\r?]\u0012\u00127-?]\u0012n\u001b\u00054V\u0014Y\f";
      f2955[1] = "N7~&AsE8oi<kV?f ";
      f2955[2] = double.class;
      f2956[2] = "java/lang/Double";
      f2955[3] = int.class;
      f2956[3] = "java/lang/Integer";
      f2955[4] = "9>m'@U%$o{ZA5'$j^I3\"~'SP?b\u007f`\u001cW?\"nfE\u000e5#d}WN\"b]`\\D9;If\\T3\"~";
      f2955[5] = "g6U/$l{,Ws>xk/\u001cb:pm*F/7iaj@d8}m6\u001cH\u0004|f Ws3k:\u0000";
      f2955[6] = "\u0000CeM\u0004\u0018\u001cYg\u0011\u001e\f\fZ,\u0000\u001a\u0004\n_vM\u0017\u001d\u0006\u001fw\nX\u001a\u0006_f\f\u0001C\f^l\u0017\u0013\u0003\u001b\u001fa\f\u001b\u001d\u0000_g\r\u0002C-Dv\u0017\u0019\u0003,^o\u0013\u0019\u0003\n_v";
      f2955[7] = boolean.class;
      f2956[7] = "java/lang/Boolean";
      f2955[8] = "|m]\u0002\u00188`w_^\u0002,pt\u0014ė";
      f2955[9] = "1EWH\u007f\u001d-_U\u0014e\t=\\\u001eȒ";
      f2955[10] = "F/]\u00121_Z5_N+KJ6\u0014Ⱥ";
      f2955[11] = "\u001fC\u000bo<`\u0003Y\t3&t\u0013ZB\"\"|\u0015_\u0018o/e\u0019\u001f\u0019(`b\u0019_\b.9;'X\u0002%!b8P\u0002%\"p\u0002s\r2+";
      f2955[12] = "+\u0004\u0016=M\r7\u001e\u0014aW\u0019'\u001d_pS\u0011!\u0018\u0005=^\b-X\u0017v^\f1\u0004\u0014=H\u0011*\u0012\u001ed\u0011/-\u0018\u0015|H";
      f2955[13] = "?-E&$\u0010\"8\u001d\u0004e\u001d:>";
      f2955[14] = "2T3}`A.N1!zU>Mz0}F8\b!'{X.\b\u0017<~[/s :~G";
      f2955[15] = float.class;
      f2956[15] = "java/lang/Float";
      f2955[16] = void.class;
      f2956[16] = "java/lang/Void";
      f2955[17] = "\u0002M\f\u001f\u001dl\u001eW\u000eC\u0007x\u000eTEƢ";
      f2955[18] = "~8\u0016F?Ob\"\u0014\u001a%[r!_\u000b!St$\u0005F,Jxd\u0004\u0001cMx$\u0015\u0007:\u0014r%\u001f\u001c(Ted\u0012\u0007 J~$\u0014\u00069\u0014R%\u001c\n\"x~22\u0007 J~$\u0014\u00069";
      f2955[19] = "\u0001\rk\u0016\u0019<t-`\u0019\bs\t5s\u001e\u0001:a";
      f2955[20] = " d3\u0000d/>l)O\u0003./w$\u0015%(";
      f2955[21] = "`\u0006Jb^}k\t[-?s`\u0002_w";
      f2955[22] = "\u000ecLb\na\u0012yN>\u0010u\u0002z\u0005/\u0014}\u0004\u007f_b\u0019d\b?^%Vc\b\u007fO#\u000f:\u0017xN;VX\bb_\u001a\u0011q\u00165g%\u000b`(eN!.}\u0004f";
      f2955[23] = "b\u000ex\u000f\u0001<~\u0014zS\u001b(n\u00171B\u001f h\u0012k\u000f\u00129dRjH]>d\u0012{N\u0004g{\u0015zV]\u0005d\u000fkw\u001a,z";
      f2955[24] = "l@7I;ApZ5\u0015!U`Y~\u0004%]f\\$I(Dj\u001c%\u000egCj\\4\b>\u001a`]>\u0013,Zw\u001c\u001c\u000e:@JF5\n\n[mF5\t=";
      f2955[25] = "a\u000e:][;}\u00148\u0001A/m\u0017s\u0010E'k\u0012)]H>gR(\u001a\u00079g\u00129\u001c^`x\u00158\u0004\u0007\u0002g\u000f)%@+yX\u001e\u001cE;c\u0012";
      f2955[26] = "R\u0012x\bW\u0014L\u001abG5\bK\u0007";
      f2955[27] = "i\u000f\b\u0015\u0018Vu\u0015\nI\u0002Be\u0016AX\u0005QcS\u001aO\u0003OuS&t?Wo\u0011\u001c";
      f2955[28] = "\\\u00071{y\u0018@\u001d3'c\fP\u001ex6g\u0004V\u001b\"{j\u001dZ[#<%\u001aZ\u001b2:|CP\u001a8!n\u0003G[5:f\u001d\\\u001b3;\u007fCg\u0010.!M\u0004V\u00192\u0016d\u0000C\u001a80e\u0019";
      f2955[29] = "s(s\u0010H]o2qLRI\u007f1:]VAy4`\u0010[XutaW\u0014_u4pQM\u0006j3qI\u0014\u007fu4pQM~u?c";
      f2955[30] = "bYEQEY~CG\r_Mn@\f\u001c[EhEVQV\\d\u0005W\u0016\u0019[dEF\u0010@\u0002nDL\u000bRBy\u0005A\u0010Z\\bEG\u0011C\u0002NCG\u001c\\nbSa\u0010Z\\bEG\u0011C";
      f2955[31] = "\u000bt\u001a}|/\u0000}\u0012\"B|\bg=!9o;z\u0014?B|Tu\u0010?=z\u0003qC@";
      f2955[32] = "t\u0010\u0012O\u0005\u001a7\u0005\bJw\u0007\"\u0005+_\u0011\u0004\"\u0003\u001cHwS3\u0012\nSFR!\u0005\b2";
      f2955[33] = "xy<:`\u0017wv3(\u0011\u0016u5\u000b+J\u0005b($?\u0011\u0019g'\u007fnk\u0016fvxP(D$-x1,\u0000%/B";
      f2955[34] = "I\fF8ykG_@|Afw\u000bX)$bGTCx.\u000fINH',?\u0016U\u0019-A";
      f2955[35] = "skL\u0010F\r0~V\u00154\u0010%~a\nR\u0003\u0012oI\u0001Y\u0005%x/\fF\u000f2:\u0015\u000bOCH";
      f2955[36] = "f15r{\u000e`f1!\u0004\u001ed|\u0010|`\flf \u001beHe9*z\u007f\u0001f{[";
      f2955[37] = "\b\u001bi:\\6\u0003\u0004u}7h\u0018.c-Q\t^U'0R6\u0019Siy7";
      f2955[38] = "\u0012=s& \u0003Eh!+LЙymmd6\u000fFfrxq";
      f2955[39] = "v\u0001gN\u000e<rEfL4<4v?CR>O\u0001g\u0016D8pFaX\r]";
      f2955[40] = "\u0012~T\u00136A\u0013lC\u0011W\u001cSk@2:\u001bUkY\u00073\u001dn\u007fC\f6\u0016D\u0002\u0006\f%\u0000\u0015o^\u0002+\u001b);[\u001a'LDcU\u0014<p\u0010fM\u0018k\u001dHhC\u0003WIMpOT:\u0011C~Th>\u001eOf\u0004\u0011>\u000eNm?Rj\u0010[|M\bjKI\u0002U\fk\u0015Q3RR/\b)";
      f2955[41] = "'<aqWH.6*/4I4n70L\\4j7 E5t:19JG.:j+4\\ a5pM\\0`>K\u000e\b.u/9T\bugQ";
      f2955[42] = "gZCJ_]lE_\r4\u0019aTvHY\u0004\f\u0015\r\fD\u00073R\u000bB\rbfL\rULSa\u0012IH4";
      f2955[43] = "K#\"M~O\u0002vp\u0012\u001b<3\u0013\btT*3\u0018K\u0012q\u0019\u0014,t[$KK";
      f2955[44] = "`w\u0004wfZ)\"V(\u0003\n<a7VIek \rk}\u00171 Vy\u0003";
      f2955[45] = "R81{k\u000fY'-<\u0000_T6\u001c`lLYJzer@\u0005'\"k|[9";
      f2955[46] = "F2QjBx\u000fg\u00035'+\u001e\"[i]GF2QjBx\u000fg\u00035'";
      f2955[47] = "\u0004(~LX\u0018\u0011:r\u0019c\u001c\r8[K\t\u001e\u0004D&\u001f_\u0017Z%\"[^\u0015`";
      f2955[48] = "d5\"vhOo*>1\u0003\u001fb;\u0017t\u007f\u0011h!+\fo\u0014v|*uh\u0015a!P";
      f2955[49] = "P\u0016g\u0011L\u000b@\u0019c\u0013<\u0001I6a\u0003A\u001b_\u0014\u0006U\u0000\\B\u001d9\u0012\u0006\u0012\u000bx";
      f2955[50] = "FFW}mI@\u0011S.\u0012YD\u000brsvKL\u0011fu~JIwYk|\u000b\u0017\rVj-\f)N]fb\nD\u0016Shy6";
      f2955[51] = "4{De\r\u0010wn^`\u007f\rbnw\u0018F\u0006}b\u001bu\u001e\bsy'";
      f2955[52] = "pi\u00190*\u000bw`UJ}\\m@\u00150sW~D\b&nQ\u0011\"Tvv\u000bp&\u0010wt1(\u007f\u001b:.\\pq\u0015!\u0012";
      f2955[53] = ";h\u000b85+:z\u001c:Tvz}\u001f\u00199q|}\u0006,0w\u0000-\u00041$&mu\n??\u001a9p\u00123hwa~\u001c(T#df\u0010\u007f9{jh\u000bCm~rd\\.5p|\u007f`yizrj\u0012#i!`\u0014\n'h\u007fx%\ry,b\u0000";
      f2955[54] = ".\u0004k\u001e\u001fW!Ud\u001d R*EB\nPNC\u00038[PW|D>\u0015\u00192";
      f2955[55] = "'eb\u0007\u0001k(jm\u0015pj*)C\f\u001cy'U%\t\u0002u{8}\u0007\fnG";
      f2955[56] = "Ig\u0006\u0013rC\u00150GV\u0012^\u000eDX\u0001x[\u0018e>U.\u0003\u0005l\u0001\u0012(ML\t";
      f2955[57] = "_\t{.b>PXt-]=_ChW3eSO~h;2^I\u0014";
      f2955[58] = "w?C\u0007k4g0G\u0005\u001b0x-b\u0013z0u-\"G\u007f-emO\u001fq#~Q";
      f2955[59] = "v\u0013wf5\u0006q\u001a;\u001caF~\u001e\\`w]q\u000e\u0007%0\u0000s[f!t\u0001qa>x\u007fL+\ffvqW\u0017Xcn}\u0000z\u0000m`f<-\\gnsNw\\<|\r\u0005s\u0013w `]}\u001dl\u001c";
      f2955[60] = "a\u001aUO~\u0013f\u0013\u00195:Sa\r~I<Hf\u0007yR\u0019Hl\u0014E5\u007f\u0014<\f\u001fT{P=\u000e%\f\"[pTHT,Ukh\u001c\bzM:\t\u0018L{O\u0000";
      f2955[61] = ",XL\u001d'Mp\u000f\rXGPkn\u000e\u000b<J}Zt[{\r`SK\u001c}C)6";
      f2955[62] = "\u0012Lsh:WHI?y\u0001Ֆ-J3tsH_\u00103/a6";
      f2955[63] = ",\t8a\u0013&v\ftp(Ȟ\u0013\u000fx}Z9aUx&HG";
      f2955[64] = "\u0012IX\u0007;'\u0015@\u0014}lp\u000fuO\u001b\u007f]\u001eZG\u001d\u007f\u001dJ_Z\r?p\u0012QT\u0016\u0003";
      f2955[65] = "\u001fH#\u0007\\\u0010\u001eZ4\u0005=M^]7 G@MR'\u0018P!\u001dP:\f\u0001LE^4\u0017=\u0018@F8@P@NH#|\u0004EVDt\u0011\\KX_HEYST\b%\u001dW]O4rA]SZF(A\u0006A$^,@XY\u0015Yr\u0004E!";
      f2955[66] = "\u0010f37v\u001eSsq:\u0018\u0014Ba\u0015:~\u0017Hb\u0001<|\u001cU\u001dz8t\u001aMc*!}\u0019/, 2v\u001e\u0010eu`){";
      f2955[67] = "|N\u0017&hmsA\u00184\u0019lq\u0002)!xl|\u0002iu}qlB\u0004-s\u007fw~";
      f2955[68] = "\u000fTo1\t=F\u0001=nlF\u007fqF\u0003;MdwW_]hWPc`\u0014=\u0005\u000f";
      f2955[69] = "%sn\u00172X*|a\u0005CW>\u0018}\u0019.]9.|}~\ny3uB9\f7z\u0010";
      f2955[70] = "\u0005ncJ?\u0003\u000eq\u007f\rTS\u0003`Q]5S\u000e`\u0011\t0N\u001e |Q>@\u0005\u001c";
      f2955[71] = "hb\b<0\fc}\u0014{[Hnl:+:\\clz\u007f?As,\u0017'1Oh\u0010\u0010\"gV{!\u0017|#K\u0003";
      f2955[72] = "zLGT3&{^PVR{;YSh/k%QJB>M,[PF4x%],\u00166e1\fAN8k*0\u0015K g}]ME.|A\tH]\"+,QFS9\u0017xT^_nz ZPDR~/VH\u0014+~?WC/h*!BR]2*zP,\u0015ow3N^Oo,!0FKnr9\u0001A\u0015*oA";
      f2955[73] = "}(j[\u000e~4}8\u0004k+6#lU\u0017,6B2_\u0002/)}{\nPpL";
      f2955[74] = "\t\rc\u0005\reUZ\"@mvX\u001f\u001d\u0017\bt5ZfB\t#T^\"C\u000b\u0019";
      f2955[75] = "\u000f;\rzsI\u001a)\u0001/HM\u0006+2},_\u0006WQ(tR\u000eh\u0016.:\u001bk";
      f2955[76] = "\u0015\u000f-J\u007f\b\u001b\\+\u000eGŢ+]s\\w\u0000L\n&\u000ez";
      f2955[77] = "kh\u0012#UVzrO=;\u0000\n+Ib_\u0016k/\rc],3/H:\u0001M7kI8;";
      f2955[78] = "b\u0002\u0000 _+c\u0010\u0017\">v#\u0017\u0014\u001f_|4~R?Lje\u0013\n1BqYG\u000f)N&4\u001f\u0001'U\u001a`\u001a\u0019+\u0002w8\u0014\u00170>#=\f\u001bgS{3\u0002\u0000[Wt?\u001aP\"Wd>\u0011ka\u0003z+\u0000\u0019;\u0003!9~\u0001?\u0002\u007f!O\u0006aFbY";
      f2955[79] = "\fs\u0010\u000f\u0017\bOf\n\ne\u001bLZ\u0014\f\b\u0000ZvsK\u0001\bG&\u001e\u0013\u000f\u0006\\\u001aJ\u0016\u0017\n\u000bw\u0012\u0018\u0019\u00117'ON\u0015\u001f\b`I\u0000\\z";
      f2955[80] = "{.e:-Gagfx\\Gfzsj A`\u0017d93_%rkh<\\\u001a";
      f2955[81] = "t\u0001J/li7\u0014P*\u001et\"\u0014v3xw(\u0017)b}w.\nW2d~-h";
      f2955[82] = "\u001dm9>\u0019~\b\u007f5k\"z\u0014}\u00031Pxy8<\"R)\u0014`2,I\u0015";
      f2955[83] = "\b3\u001b\u0016\u001d\u0004K&\u0001\u0013o\u0019^&)kV\u0012A*D\u0006\u000e\u001cO1x";
      f2955[84] = "#\u000fR?\u0013g(\u0010Nxx7%\u0001{(\u001c5#\u0001M)? 4\u001cG#xauAD\u007f\u0019e1@FE";
      f2955[85] = "\u000e !n2@Yusc^ϑep?,$LZ{ 0c";
      f2955[86] = "iC\u0019oUmg\u0010\u001f+mϧW\u0011Gy]e0F\u0012+P";
      f2955[87] = "TL\u0010}bNDC\u0014\u007f\u0012_[D\u001dihnQD\ritY6\u001b\u0015vb\u0019[C\u001bxy%\u000fF\u0003t.HWH\ro\u0012F_M\u001a{t\u001aN\u001dO\u0004xA\nG\t5\u007f\u001fNZq";
      f2955[88] = "`\\Put/0EYv\u00160+q[\u007fk*=S<)*m Z\u0003n,#i?";
      f2955[89] = "k\u001cfMD\u00047K'\b$\u0003:\u000e\u0006LI\u0003,\u001f26\u0019Dk\u0002;\t^B%K^\\@D2\no[\u001e\u0000/r";
      f2955[90] = "\u0001+&+~\\]|gn\u001eOP9A1r\\]E'4lP\u0001(\u007f:bK=";
      f2955[91] = "[-Bg7i\u0007z\u0003\"Wz\n?:q6z\u0007?z%3g\u0017\u007f\u0017}=i\fC";
      f2955[92] = "c:E~*\"s5A|Z&l({f65aT\u001dc(9=9Em&\"\u0001";
   }
}
