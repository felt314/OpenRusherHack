package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.Class031;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.TextComponent;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.client.api.ui.window.view.WindowView;

import org.rusherhack.command.clear;
public class Alt_Manager extends ResizeableWindow {
   public ListView<Login> f4151;
   public static Alt_Manager f4152;
   public List<Login> f4153;
   public List<Login> f4154;
   public TextComponent f4155;
   public TabbedView f4156;
   public boolean f4157;
   public ListView<Login> f4158;
   public static long f4159 = Class066.m4320(662018589741828498L, -7579058943022375665L, MethodHandles.lookup().lookupClass()).m4325(155712233118723L);
   public static String[] f4160;
   public static String[] f4161;
   public static long[] f4163;
   public static Integer[] f4164;
   public static Map f4165;
   public static Object[] f4166 = new Object[88];
   public static String[] f4167 = new String[88];

   @Override
   public WindowView getRootView() {
      return this.f4156;
   }

   @Override
   public void tick() {
      int var3 = Class253.m9154();
      Alt_Manager var5 = this;
      if (this.f4157) {
         this.f4153.clear();
         this.f4154.clear();
         Iterator var4 = Class170.f3364.m7111().m2747().iterator();

         while (var4.hasNext()) {
            Class031 var6;
            Class031 var10000 = var6 = (Class031)var4.next();
            var5.f4153.add(new Login(var6, var5.f4151));
            if (var10000.favorite) {
               var5.f4154.add(new Login(var6, var5.f4158));
               if (var3 != 0) {
                  break;
               }
            }
         }

         var5.f4151.resort();
         var5.f4158.resort();
         var5.f4157 = false;
      }

      var5.tick();
   }

   public void m8558(String var1) {
      this.f4155.setText(var1);
   }

   public void m8561() {
      this.f4157 = true;
   }

   public Alt_Manager() {
    }

   static {
    }
   public static String m5835(byte[] var0) {
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
   public static void m1499() {
      f4166[0] = "C%vaC>_?t=Y*O<?ƛ";
      f4166[1] = boolean.class;
      f4167[1] = "java/lang/Boolean";
      f4166[2] = "w\u0000iRg\u0006k\u001ak\u000e}\u0012{\u0019 \u001fy\u001a}\u001czRt\u0003q\\{\u0015;\u0004q\u001cj\u0013b]{\u001d`\bp\u001dl\\m\u0013x\u0003w\u001ck\u0012a]L\u0017v\bV\u001cu\u0002a\u0012p\u001dl";
      f4166[3] = "\u001fZ0WYQ\u0014U!\u0018$I\u0007R(Q";
      f4166[4] = void.class;
      f4167[4] = "java/lang/Void";
      f4166[5] = "9WQ:bW%MSfxC5N\u0018w|K3KB:qR?\u000bdacJ3W~usI\u0017u\u007f";
      f4166[6] = "E@WSalYZU\u000f{xIY\u001e\u001e\u007fpO\\DSriC\u001cC\u0004`mO_\u001e4DpDV_\n^xDSW\u0018a";
      f4166[7] = "u\u001b~HU#i\u0001|\u0014O7y\u00027\u0005K?\u007f\u0007mHF&sG\u007f\u0003F\"o\u001b|HP?t\rv\u0011\t\u0006u\u0019l\u0016p?t\rv\u0011";
      f4166[8] = "B\u000f9\fQP^\u0015;PKDN\u0016pAOLH\u0013*\fBUDS+K\rRD\u0013:MT\u000b[\u0014;U\rqL\u001f<GGsD\u0018)";
      f4166[9] = "68X!VH*\"Z}L\\:!\u0011lHT<$K!EM0dJf\nJ0$[`S\u0013/#Zx\nj0$[`Sk0/H";
      f4166[10] = "T\u001f,@\u0001(H\u0005.\u001c\u001b<X\u0006eą";
      f4166[11] = "\u0011.u\u001cf^\r4w@|J\u001d7<QxB\u001b2f\u001cu[\u0017rg[:\\\u00172v]c\u0005\b5wE:g\u0017/fd}N\t";
      f4166[12] = "\u0013\u0019\u0017F*1\u000f\u0003\u0015\u001a0%\u001f\u0000^\u000b4-\u0019\u0005\u0004F94\u0015E\u0005\u0001v3\u0015\u0005\u0014\u0007/j\u001f\u0004\u001e\u001c=*\bE<\u0001+05\u001f\u0015\u0005\u001b+\u0012\u001f\u0015\u0006,";
      f4166[13] = "D0\u001f?E5X*\u001dc_!H)Vr[)N,\f?ö";
      f4166[14] = "\"\u0004Z8xr>\u001eXdbf.\u001d\u0013Ҁ";
      f4166[15] = "P]\u001aasSLG\u0018=iG\\DS,mOZA\taȩ";
      f4166[16] = "\u0017Ei_\u0014;\u000b_k\u0003\u000e/\u001b\\ ȅ";
      f4166[17] = "-lc(q.3dyg\u0016/\"\u007ft=0)";
      f4166[18] = "\u00183V@&\u0007\u0013<G\u000fG\t\u00187CU";
      f4166[19] = "\u0013<Z\u0011e*\r4@^\u00076\n)";
      f4166[20] = "P*\u0004L \rL0\u0006\u0010:\u0019\\3Mɤ";
      f4166[21] = int.class;
      f4167[21] = "java/lang/Integer";
      f4166[22] = "s5x\u007f]Bo/z#GV\u007f,12@Eyis>HPu)x\u007fcX{ z#";
      f4166[23] = "*w@e?t_WKj.;>Y@a*aJ";
      f4166[24] = "e\u000b$dZ~y\u0011&8@ji\u0012m)Dbo\u00177dI{cW%/I\u007f\u007f\u000b&d_bd\u001d,=\u0006\\c\u0017'%_";
      f4166[25] = "-\u000eVD>j1\u0014T\u0018$~!\u0017\u001f\t v'\u0012ED-o+RC\u000f\"{'\u000e\u001f\r>~2\u0014X\tbV\u0005\u000eP\u001a$v!";
      f4166[26] = "Vvb2IUJl`nSAZo+\u007fWI\\jq2ZPP*pu\u0015WPjasL\u000eZkkh^NM*FsVBVGjrOEWp";
      f4166[27] = "yz\"Wd}e` \u000b~iuck\u001azasf1Wwx\u007f&0\u00108\u007f\u007ff!\u0016a&ug+\rsfb&\u0012\u0010xly\u007f\u0006\u0016x|sf1";
      f4166[28] = "%[_\"\u000fp9A]~\u0015d)B\u0016o\u0011l/GL\"\u001cu#\u0007MeSr#G\\c\n+)FVx\u0018k>\u0007{c\u0010g%jWb\t`$]\u001cM\u0013f\"FJ_\u0014a/";
      f4166[29] = "V\u0011\u0004)1VH\u0019\u001ef\\LP\u001c\u0017+kJS\u001e\u0001";
      f4166[30] = "bD,4Gf~^.h]rn]eԺ";
      f4166[31] = "\u001b]-v%\u0013\u001b]:*)\u001c\u0001\u0016:4)\t\u0006gjix";
      f4166[32] = "N\u0003\u000e<k\u0007N\u0003\u0019`g\bTH\u0019~g\u001dS9I 6";
      f4166[33] = "%?V\u0016\u0013t9%TJ\t`)&\u001f[\u000es/cTN\u0004o>ctN\u0004o>\u000fDK";
      f4166[34] = "< \u0015{(K :\u0017'2_09\\65L6|\u001e:=Y:<\u0015{\u0013r<5";
      f4166[35] = "\u0001-gTJvt\rl[[9\u0015\u0003gP_ca";
      f4166[36] = "Y\u00161N3*E\f3\u0012)>U\u000fx\u0003-6S\n\"N /_J0\u0005 +C\u00163N66X\u00009\u0017o\rS\u0017?\u001a$>T\b37(1R\u000b!";
      f4166[37] = double.class;
      f4167[37] = "java/lang/Double";
      f4166[38] = "3R6hM>/H44W*?K\u007f%S\"9N%h^;5\u000e7#^?)R4h\\$1M0([e=R6h}'3C:\u0014Z-9R4(\\.";
      f4166[39] = "\u0007b:0u~\u001bx8loj\u000b{s}kb\r~)0f{\u0001>\u001arhi\t|.";
      f4166[40] = ">\nHZ\u0018H\"\u0010J\u0006\u0002\\2\u0013\u0001\u0017\u0006T4\u0016[Z\u000bM8VZ\u001dDJ8\u0016K\u001b\u001d\u00132\u0017A\u0000\u000fS%VL\u001b\u0007M>\u0016J\u001a\u001e\u0013\u0013\r[\u0000\u0005S\u0012\u0017B\u0004\u0005S4\u0016[";
      f4166[41] = "ub>\u0002\u0002\u0015kj$MJ\u0015q`<\nC\u000e1S:\u0006H\t|b<\u0006";
      f4166[42] = "Za\u001cH(U\u001e8NL\u0012\u000b\t&l_n\u0005\u001a7y]x:\u00057Z4,\u000b\u00046F\u000fjZ^1%";
      f4166[43] = "a\u0005\u0004\u000e;\u00114\r\u0001_K\u0011f\u0007\u001co \u0017kN\u0006S!\u00105F`";
      f4166[44] = "oM\u0012\u0015MIg\u000bO\u0016wNo\u001f*F\u0017G:\u0015\u0016G\u0010\u00192s\u0013F\u000f[o\u0010Z]\u0007J\u0003";
      f4166[45] = "\nX\u007f.BjKWq(~~5X{p\u0013mK\\ }\u001d";
      f4166[46] = "G\\J?&OJ@MCǙ(\u001a\u0018[<-\u0017\u001a[\u001a#";
      f4166[47] = ",L\u0019s\tUmC\u0017u5Δ\u0013\u001d\u0018\"\u000b\u0016l\\\u0017,\r";
      f4166[48] = "1m2H7\u0000&+yI]ȶ\\8>U$\u0001le.Dgo";
      f4166[49] = "qd&5\u001au|x!IИ\u0012, 76\u0011-,cv)";
      f4166[50] = "9gF\u001fj\u001bfwALR\u0004d}HL.j9gF\u001fj\u001bfwALR\rcu\u0010Y3\u000b~lG%h\nh=\u0015T7\u001aon-";
      f4166[51] = "GZ4\u0011\u001dAG\u0019u\u000ez\u0004\u001a\u001f(\u0014\u0006~L[\u007f\u0011\u0003@\u0007\n2\u0013z";
      f4166[52] = "\u0002fO@gw\b{WJ^c\u0000g|A9~m{FA9d\u0015qA\u0016\"\u0018V$\rU'&\u001du@W^";
      f4166[53] = "/\u007fJ73#npD1\u000fȟ\u0010 D7`7)k\u0018f4\\";
      f4166[54] = "1\u0006$\u0014TDzZu@?Ϲ\u0000\u000b$C\u0007Gn\u0003b\u001e\u0004}";
      f4166[55] = "TqBZ()YmE&ǠNTqBZ()YmE";
      f4166[56] = "n\bpp^\u0017w\u000b6:%Nc\u0000EeC[b\nr\u0002G\u001ef\u0005nx\u001d\u0018`\u0006\u000e`A]tWlsWG5l5=\u0015XvR~lXZ\u000f";
      f4166[57] = "\u001b\u0018\u0005xrs\u0010\u001d\u001bp\u0018uM\u0005;\u007f~vG\u0006!w~sO\u0014\u001e\u001e$wJ\u0014\u0005frdR\u0001d";
      f4166[58] = "}&8]W3b5r\u000fj&o)(\f\u0010:x.1\u0001\u0006\u0019\u007f4?l\u0006c&wy\u0002\u000e%{tC\u0000Te&u-\b\u00128%O";
      f4166[59] = "e\u0016\nN>\fv\u0000\u0010\u000f\u00054F=0i\u0005\fc\b\u000b\u000eg\u001fu\u0012J";
      f4166[60] = "p9BD+bk+\u0010PWϚ\u0014l\u001fPm:e3\u000fW>\u0002.6\u0014\u0001osq&\u0013RW";
      f4166[61] = "F<EWx\u001cK B+ɛ{Gx\u0017\u0013.\u0015O>J\u0010";
      f4166[62] = "{sXA\u0001Tvo_=\u0002^jSUZ\u0011mwdM=S\\veQ\u0006\u0015\r,b2";
      f4166[63] = "y'\u0010h\u007f%ykDt\r,qf@ca\u001e%'\u001c4\r,s$\u001d;fr'wG\u0004";
      f4166[64] = "1Uv\u0016s\u00079\u0013+\u0015I\u00029\u0006'TIRb[1Ww\u00193\u00163.";
      f4166[65] = "8\u0002\u0019\u0001\u000b\"n\u0011\u0001\u0014j\"c\u0017\u000e\u00145;b\u0003\u0014\u0013jg5\r\r\u0014\u0018:9\u0006\u001dlQe4\u0010\nR\u001a4y\u0012s";
      f4166[66] = "\b-P$\u0017EI\"^\"+Ӡ7&@yASX/\u0002\u007f\u0010";
      f4166[67] = "9,>@RI4+a\b#\u001e9+6CB\f=UhR[\f<6!IS\u001d";
      f4166[68] = "O\u0019>\u0018M\u0018B\u00059dʮ\u007f\u001cXm\u0018\u001bNX\u0001?\u001c";
      f4166[69] = "+jP\\85&vW άR\u007fnZ\u001a08:tVY";
      f4166[70] = "5w\u0004\nJL<m\u0007\u000f$J)h\u0019\u000b$\u001d3yDIUB#~\u0017qCG!/\u0002\u0010EZ8x~J\u001b\u0017,k@\u0001JZ.\u0012";
      f4166[71] = "Vt!Q5\\M'|\u000b\tCC8[WoxC%qVu8Wt.Nc\u0007D?bY\t\u0003\u0011taO7H@9c6";
      f4166[72] = "T\n\bEv;]H\u000e\u0014\u001f/L\u001f\u0010De5[\u0018kD\u007f4\b\u0013WExj\u0000uP\u0010/+HK\u001bAb)1";
      f4166[73] = "zn\u001de\u001flz-\\zx<',=w\u001c>!,\u000bv9/'5f*\u0004o6o\u0001zBl;P";
      f4166[74] = "^T#&,-\u0000\u0000p|\u0013#VG}|\u007f\u0011\u0002\u0005\"%\u0013|[P'#b#KWt\u001b";
      f4166[75] = "m\u000euu9&eH(v\u0003)}]7$\u007f/{0'?g)qVr7bx\u0001";
      f4166[76] = "bU$,\":e]w!\u001e&\u001b\u000bx,$2jTh+w\n!Qs}&{~At.\u001e";
      f4166[77] = "3\u0007\u0005l^\u0006(TX6b\u0019&K\u007fj\u0004=*[Fkb\u001b{\u0007Ba]\b0KU\u000bY]{HC5\u0012\f6J:";
      f4166[78] = "}-{\u0017\u00060a{hJy+l\u001dsHI\"uqs\u0004\u001d>";
      f4166[79] = "T\u0011p6VY^\u0010>5.Ԟ=By\"WX\u0004O~}\u001f";
      f4166[80] = " j\u0011zR\u0015c|[}o\u001c7lr=\u0002\u000b;{C;\u0002g!~I5T]e+G6o\\e U>Q\u00174mWG";
      f4166[81] = "Wod\r\u0019\u0016ZscqΞq\u0003~v\r\u0019\u0012Je~\u001c";
      f4166[82] = "~\u0006jTPis\u001am(ȣ\u000e\u007fB8\u0010\u0006`w\u0004e\u0013";
      f4166[83] = "\n\n\u0004Ao4_\u0002\u0001\u0010\u001f2\t\u0003&Mo.`A\u000bXc>\u0003\b\u0010PrR";
      f4166[84] = "YW\\!Q\bTK[]So^U\r;C\u000b\t\u001c\na=\u0005L\u0016P#YR\u0005\u0011\n]";
      f4166[85] = "GGa_cMO\u0001<\\YDEy2\u00079\u001aME3\u0000g\u0012+\u00129\u0007`E\u0017\u0013>Yh#@\u00199^?\u001fA\u001egVYHK\u0019`\u0001eILGhg5\u001d\u0013Ac\t=[NBY";
      f4166[86] = "$i>GMdas2\u0004)upk\u0002\u0010Yr\u001d->\u0016\u00136lr.\u0011@\u000e&(n\u0002P0my#\u0000)";
      f4166[87] = "]X%{D\u0002\u0016\u0004t//ӚlPb{VJU]e$\u001e;W\u0006+kV\u0005\u001cWfi/";
   }
}
