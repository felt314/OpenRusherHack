package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.ResizeableWindow;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.window.content.ComboContent;
import org.rusherhack.client.api.ui.window.content.ComboContent$AnchorSide;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.context.ContextAction;
import org.rusherhack.client.api.ui.window.view.ListView;
import org.rusherhack.client.api.ui.window.view.ListView$Column;
import org.rusherhack.client.api.ui.window.view.TabbedView;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.clear;
public class Waypoints extends ResizeableWindow {
   public ListView$Column f6506;
   public static Waypoints f6507;
   public ListView<HudItem141> f6508;
   public TabbedView f6509;
   public ArrayList<HudItem141> f6510;
   public ListView$Column f6511;
   public ListView$Column f6512;
   public static long f6513 = Class066.m4320(8019602974031458099L, -3790393775689084352L, MethodHandles.lookup().lookupClass()).m4325(61822611706211L);
   public static String[] f6514;
   public static String[] f6515;
   public static long[] f6517;
   public static Integer[] f6518;
   public static Map f6519;
   public static Object[] f6520 = new Object[72];
   public static String[] f6521 = new String[72];

   @Subscribe
   public void m12771(Class263 var1) {
      this.m12772();
   }

   public void m12772() {
      Waypoints var4 = this;
      int var10000 = Class253.m9155();
      this.f6510.clear();
      int var3 = var10000;
      Iterator var6;
      Iterator var7 = var6 = Class170.f3364.m7116().m14530().iterator();

      while (true) {
         if (!var7.hasNext()) {
            var4.f6508.resort();
            break;
         }

         Class086 var5 = (Class086)var6.next();
         if (var3 == 0) {
            break;
         }

         var7 = var6;
         var4.f6510.add(new HudItem141(var4, var4, var5));
      }
   }

   @Override
   public WindowView getRootView() {
      return this.f6509;
   }

   public Waypoints() {
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
      f6520[0] = "\b\\MR\n\u0004\u0014FO\u000e\u0010\u0010\u0004E\u0004\u001f\u0014\u0018\u0002@^R\u0019\u0001\u000e\u0000x\t\u000b\u0019\u0002\\b\u001d\u001b\u001a&~c";
      f6520[1] = "f\u00126JF\u0018z\b4\u0016\\\fj\u000b\u007f\u0007X\u0004l\u000e%JU\u001d`N\"\u001dG\u0019l\r\u007f-c\u0004g\u0004>\u0013y\fg\u00016\u0001F";
      f6520[2] = "*,\u0019\\l\u001666\u001b\u0000v\u0002&5P\u0011r\n 0\n\\\u007f\u0013,p\u0018\u0017\u007f\u00170,\u001b\\i\n+:\u0011\u000503*.\u000b\u0002I\n+:\u0011\u0005";
      f6520[3] = void.class;
      f6521[3] = "java/lang/Void";
      f6520[4] = "R#.$lfN9,xvr^:gϘ";
      f6520[5] = "[i\u000f\u0013\\\u001aGs\rOF\u000eWpF^B\u0006Qu\u001c\u0013O\u001f]5\u001dT\u0000\u0018]u\fRYABr\rJ\u0000;Uy\nXJ9]~\u001f";
      f6520[6] = "\nZ\f2\u00190\u0014R\u0016}~1\u0005I\u001b'X7";
      f6520[7] = "`=V`w\u000fk2G/\u0016\u0001`9Cu";
      f6520[8] = "\u0010;\t\u0007\u0018U\f!\u000b[\u0002A\u001c\"@ɝ";
      f6520[9] = "hi\u007f9R{vaev=|pip\u0014\u0015}v";
      f6520[10] = "\u00172\u001c?hb\u000b(\u001ecrv\u001b+Uљ";
      f6520[11] = "\u0007\u0006hQuq\u0019\u000er\u001e\u0017m\u001e\u0013";
      f6520[12] = ",;\u001eLQy0!\u001c\u0010Km \"Wɤ";
      f6520[13] = int.class;
      f6521[13] = "java/lang/Integer";
      f6520[14] = "t)O\b\u00051h3MT\u001f%x0\u0006ō";
      f6520[15] = "\u001e\u001f+\\dw\u0002\u0005)\u0000~c\u0012\u0006b\u0011zk\u0014\u00038\\wr\u0018C9\u001b8u\u0018\u0003(\u001da,\u0007\u0004)\u00058N\u0018\u001e8$\u007fg\u0006";
      f6520[16] = boolean.class;
      f6521[16] = "java/lang/Boolean";
      f6520[17] = "m_V\u000b|LqETWfXaF\u001fĝ";
      f6520[18] = "\u0006Qh@ N\u001aKj\u001c:Z\nH!¿";
      f6520[19] = "L!TD@]P;V\u0018ZI@8\u001dԏ";
      f6520[20] = "\u0011q&\\%-\u001a~7\u0013X5\ty>Z";
      f6520[21] = "\u0010S\u0016V-\u0004\fI\u0014\n7\u0010\u001cJ_\u001b0\u0003\u001a\u000f\u001d\u00178\u0016\u0016O\u0016V\u0013\u001e\u0018F\u0014\n";
      f6520[22] = "\u0005|]^\u001b\u001b\u0019f_\u0002\u0001\u000f\te\u0014\u0013\u0006\u001c\u000f V\u001f\u000e\t\u0003`]^ \"\u0005i";
      f6520[23] = "!3; \fXT\u00130/\u001d\u00175\u001d;$\u0019MA";
      f6520[24] = "|'6qV\u0010`=4-L\u0004p>\u007f<H\fv;%qE\u0015z{7:E\u0011f'4qS\f}1>(\n7v&8%A\u0004q94\bM\u000bw:&";
      f6520[25] = double.class;
      f6521[25] = "java/lang/Double";
      f6520[26] = "\u0018\u0005e5\u000f\n\u0004\u001fgi\u0015\u001e\u0014\u001c,x\u0012\r\u0012Ygm\u0018\u0011\u0003YGm\u0018\u0011\u00035wh";
      f6520[27] = "j%m\u001askv?oFi\u007ff<$Wmw`9~\u001a`nlylQ`jp%o\u001avwk3eC/Il9n[v";
      f6520[28] = "dCBO}\u0006xY@\u0013g\u0012hZ\u000b\u0002c\u001an_QOn\u0003b\u001fW\u0004a\u0017nC\u000b\u0006}\u0012{YL\u0002!:LCD\u0011g\u001ah";
      f6520[29] = "^&\"z8%@.85p%Z$ ry>\u001a\u0004;ue%Y\"&";
      f6520[30] = "\u000b4ItAR\u0017.K([F\u0007-\u00009_N\u0001(ZtRW\rh[3\u001dP\r(J5D\t\u0012/K-\u001dk\r5Z\fZB\u0013bm5_R\t(";
      f6520[31] = "\u0015SS&1\u0005\tIQz+\u0011\u0019J\u001ak/\u0019\u001fO@&\"\u0000\u0013\u000fAam\u0007\u0013OPg4^\u0019NZ|&\u001e\u000e\u000fwg.\u0012\u0015b[f7\u0015\u0014U";
      f6520[32] = "}\u001c#\u0018\u007f-a\u0006!De9q\u0005jUa1w\u00000\u0018l({@1_#/{\u0000 Yzvq\u0001*Bh6f@\u0013_c<}\u0019\u0007Yc,w\u00000";
      f6520[33] = "\u0018\rd \u0002$\u0004\u0017f|\u00180\u0014\u0014-m\u001c8\u0012\u0011w \u0011!\u001eQvg^&\u001e\u0011ga\u0007\u007f\u0014\u0010mz\u0015?\u0003Q@a\u001d3\u0018<l`\u00044\u0019\u000b'O\u001e2\u001f\u0010q]\u00195\u0012";
      f6520[34] = "Sq)'jsOk+{pg_h`jtoYm:'yvU-(lyrIq+'{iQn/g|(]q)'KcHw'g\u007fP]o;l";
      f6520[35] = "$dr\u00078\t'p\"\u001e\u0001\u0011up3z<\u0018h`~\u0011l\u0015b=O";
      f6520[36] = "|\\\u001f\u0011r\u0016!\u000eA\u0001\u001fȸ\u0010_\\\u0016$\u0006*\bZ\u001e|{|LYWbA+JQ\u000f\u001f";
      f6520[37] = "Z~N\rl:[8Z\u001c\u001eՈax[\u001ff1\u0004~X\bz";
      f6520[38] = "G&gTlD\f'bO\nK\u001bw\u0005\teR\u0017*nYhXJ\u001bo\u000fkYMtzXfXw";
      f6520[39] = "\u001e9\u0010\u0019\u0017\u001bP \u000fDiA/*]A\u0007MP$\u0006@Q";
      f6520[40] = "/wy^BX/{f[/Ԉ\u001f4\"_HPp}}\u000f^h";
      f6520[41] = "n\u0005P^\u000b1 \u001cO\u0003uξ_I\\\u0011K~n\u0007E\u000e\u0016";
      f6520[42] = "{Z&>\n(z\u001c2/xΙ@X;8\u0018i*[5cEY";
      f6520[43] = "{\u0019w\u0000\u0017#n\u0015\u007f\u000bld\u007f\u0002r\u001b\u0010\u001e(\u0016\u007f\u0001\\t+\u0018$\\l";
      f6520[44] = "\u001d`\u000b]y\u001d\u001c&\u001fL\u000b˽&1\u0019Sj\u0017\u001b$\u0015[a";
      f6520[45] = "\u000fLDce\u0011PL_{\u001e\u000f\u0000Z|oy\u0012mD\\;`\u001eUJ_=ttWIWd.\u001eTG\f9\u001e";
      f6520[46] = "2YUJj\t'U]A\u0011]7U|LuI>_7GnN`D\r\u0010hF89WM|\u000b;[PVsF[]\fB*Tj_\rHw4";
      f6520[47] = "\u001cD9c\u001f%\u001f\u00029ysw\u0015\u0013\u001eg\u0015b\u0014\u0019)\u0000\u0016e\u001e\u001d?\u007fLu\u0007\u0000UfOq\t\u00162c\u0002|\u0012\u007foo\u0019~I\u0015laB#y";
      f6520[48] = "Fy\u0001\u0016\n\u007f@r\u0004)_/YIYO\\%ZSQOY-Hl8\u0010\u000e=Ns\u0005WS#X\u0016";
      f6520[49] = "5\u0007W\u0014Pv3\u0004@\b*xo\r@\u0016*)d\nI\\@*jQ\u0014l";
      f6520[50] = "\bS\u0016\"X>\r\u001e\u001b91\u0003/ 9\u000e1?R\u0000\t;V:\u001f\r\u0012";
      f6520[51] = "2;cD\u001c\u00163}wUnſ\t8)Z\u0002\u0015x9oN\u0013";
      f6520[52] = "Zr2qO\u0015\u0006li`+ϝeu'pVI\u0006{(/\u0010(_q<p\u001bB\\\u007fg-+";
      f6520[53] = "wg\u001c\b\f<0:\u0002\u001eiy)!\u001e\u001b6`(5\u0004\u001ci;t>R]\u0011d/b^cSn$9S\tP`\u007fdc";
      f6520[54] = "P\u0012w~\u0017QE\u001e\u007ful\u0005U\u001e^x\b\u0011\\\u0014\u0015s\u0013\u0016\u0002\u000f/$\u0015\u001eZrq$\u0005WYCs%\u000f\n9";
      f6520[55] = "g&YX.W)?F\u0005ZҼV:\u0019\u001be\u00012*\u0011\n$";
      f6520[56] = "sO\tz{vr\t\u001dk\tiHJ\u0004}0vu\u001c\u0011w3\u0007u\b\u0010/x:#\u001d\u001a,\t";
      f6520[57] = "\u000b/?\u0016^0\ni+\u0007,Ⱦ0,1\n\u001d;\u000e-w\u0019\u0013";
      f6520[58] = ".?\u0005Y5\rr!^HQ\u007f\u0011c\\Z1Vw(]_*0";
      f6520[59] = "\\ap &nQrlrO=HaudO<Ma)cukKiq\u001e >\t jx%=Wb\u0012$ :R+x'.a\u000f\u001b";
      f6520[60] = "qqLr<IsiW/Z\u000bssb~<0snH\u007f&p~iJ :\u0012yrEmZJqeG/0I\u007f>\u001a\u001f";
      f6520[61] = "Q:cf\u0013wA2r'thMae2\u000erZf\u001ed\u001bcP:u4\u0016i\r\u000b$6\u001es\u0000a'8E.0";
      f6520[62] = "G~rnZfA}er j\u0015u\f+Os\u0019(g{ByD\u0019f-AxCvszLyy";
      f6520[63] = "TF\u0012N\\^AJ\u001aE'\u0018PZ<BC\u000eAK;FC\u0007WO\u001bL'\u0000^M\r\u0016\u001e\u0007FY\u001e/\u001d\fWF@E\u001e\u0002\f\u001bp";
      f6520[64] = " \u00170m\u001e,k\u00165vx+lG(d\u0004-j*niE7)Tm}\u0015.\u0010";
      f6520[65] = "R:C}!aP\"X G#P8mq!\u0007\\(TpG8[)\u0017p%?@&Z\u0010}7W$\u0018z~9\fy(";
      f6520[66] = "az4.\u0006Co$=!7ԩ\n*}'JKi.rx\f";
      f6520[67] = "L\\,#v2\u0007])8\u00103\u0012as,`4M\n#!ji|\\!3pe\u0017\f,9-TL\\,#v2\u0007])8\u0010";
      f6520[68] = "8\u000f\u0000;F!;\u001bP\"\u007f?m\u0010{+\u000f#\u0004\u0001\u0006'\u0004ek\u0014Q*\u0005_";
      f6520[69] = "\"ew&<!l|h{Bĩ\u0013'j|#t.{t'2\u0010";
      f6520[70] = "&n,6$8|~5+N(.i\u00003(;.e7\u0011#!>\u0015{i,'%s0h)<C";
      f6520[71] = "ku\rQ@\u0000j!\u0001P9W\f\"\u000fR\u0002\u00066u\tZZ{`1\n\u0013DA77\u0002K9";
   }
}
