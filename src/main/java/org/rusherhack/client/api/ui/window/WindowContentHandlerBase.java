package org.rusherhack.client.api.ui.window;
import org.rusherhack.*;

import org.rusherhack.client.api.ui.window.content.ListItemContent;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.client.api.ui.window.content.component.ButtonComponent;
import org.rusherhack.client.api.ui.window.content.component.CheckBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.ComboBoxComponent;
import org.rusherhack.client.api.ui.window.content.component.TextFieldComponent;
import org.rusherhack.client.api.ui.window.view.WindowView;

public abstract class WindowContentHandlerBase {
   public static int[] f938;
   public static Object[] f940 = new Object[31];
   public static String[] f941 = new String[31];

   public abstract void renderButton(ButtonComponent var1, double var2, double var4, WindowView var6);

   public abstract void renderTextField(TextFieldComponent var1, double var2, double var4, WindowView var6);

   public abstract void renderListItem(ListItemContent var1, double var2, double var4, WindowView var6);

   public abstract void renderComboBox(ComboBoxComponent var1, double var2, double var4, WindowView var6);

   public abstract void renderCheckBox(CheckBoxComponent var1, double var2, double var4, WindowView var6);

   public boolean handleMouseClicked(WindowContent var1, double var2, double var4, int var6, WindowView var7) {
      return var1.mouseClicked(var2, var4, var6);
   }

   public void handleRenderContent(WindowContent var1, double var2, double var4, WindowView var6) {
        
    }

   public static void m2189(int[] var0) {
      f938 = var0;
   }

   public static int[] m2190() {
      return f938;
   }

   static {
    }
   public static void m122() {
      f940[0] = "\u0018\t\u00180}\u0014\u0004\u0013\u001alg\u0000\u0014\u0010Q}`\u0013\u0012U\u0016p{\u0004\u0005\u001d\u001e}j\u0012Y2<rf\u0002\u001c\u001a\u001drj";
      f940[1] = double.class;
      f941[1] = "java/lang/Double";
      f940[2] = int.class;
      f941[2] = "java/lang/Integer";
      f940[3] = boolean.class;
      f941[3] = "java/lang/Boolean";
      f940[4] = "hl8\u001a\u0019%tv:F\u00031duqW\u00079bp+\u001a\n n0*]E'np;[\u001c~Pw1P\u0004'Dq1@\u000e>sV>Z\u000f<bl\u001dU\u00185";
      f940[5] = "n\u000b";
      f940[6] = void.class;
      f941[6] = "java/lang/Void";
      f940[7] = "He";
      f940[8] = "\\|YK%tWsH\u0004XlDtAM";
      f940[9] = "\u0007\u0016KutH\u001b\fI)n\\\u000b\u000f\u0002ȯ";
      f940[10] = char.class;
      f941[10] = "java/lang/Character";
      f940[11] = "1&y-k:-<{qq.=?0`u&;:j-x?7zkj787:zlna=;pw|!*zRjj;\u0017 {nZ 0 {mm";
      f940[12] = "\u0004\u0005\u0018\u000bCB\u0018\u001f\u001aWYV\b\u001cQF]^\u000e\u0019\u000b\u000bPG\u0002Y\nL\u001f@\u0002\u0019\u001bJF\u0019\u001d\u001e\u001aR\u001f`\u0002\u0019\u001bJFa\u0002\u0012\b";
      f940[13] = ",R\u00169 00H\u0014e:$ K_t>,&N\u0005935*\u000e\u0004~|2*N\u0015x%k O\u001fc7+7\u000e&~<!,W2x<1&N\u0005";
      f940[14] = "7d\bAA\u0000+~\n\u001d[\u0014;}A\f_\u001c=x\u001bAR\u000518\u001a\u0006\u001d\u00021x\u000b\u0000D[;y\u0001\u001bV\u001b,8\f\u0000^\u00057x\n\u0001G[\u001b~\n\fX77n,\u0000^\u00057x\n\u0001G";
      f940[15] = "DR\u0006@\u000elXH\u0004\u001c\u0014xHKO\r\u0010pNN\u0015@\u001diB\u000e\u0014\u0007RnBN\u0005\u0001\u000b7HO\u000f\u001a\u0019w_\u000e\u0002\u0001\u0011iDN\u0004\u0000\b7hO\f\f\u0013[DX\"\u0001\u0011iDN\u0004\u0000\b";
      f940[16] = "N#\u0004og^R9\u00063}JB:M\"yBD?\u0017ot[H\u007f\u0016(;\\H?\u0007.b\u0005B>\r5pEU\u007f\u0000.x[N?\u0006/a\u0005c$\u00175zEb>\u000e1zED?\u0017";
      f940[17] = "cSQVf$\u007fIS\n|0oJ\u0018\u001bx8iOBVu!e\u000fC\u0011:&eOR\u0017c\u007foNX\fq?x\u000fU\u0017y!cOS\u0016`\u007fXDN\fR8iMR;{<|NX\u001dz%";
      f940[18] = "_<]m1UT3L\"P[_8Hx";
      f940[19] = "WtE(\u000ei\u0000dH{u,\u0001\u007fD(\u000f\u001d\ftC&?1\u001c\u0019Ay\to\u0000`Z}\u00042l`Z|\u001f5\u0006~U\"u/\u001e B&\u001f1\u0011~(u\u000e<\u0005bQ,\u001a4\r\u0019\u0014tE<\u0007zB?\u001anl";
      f940[20] = "so\u0011\u0014uj$\u007f\u001cG\u000eΥH?M\u0018rn-iB\u0018aUt3L\u0013e6\"x\u0013A\u000e";
      f940[21] = "\u001c`\u0010d\u0015tKp\u001d7n!'3\u0018s^ GrLf\tK\u0019h\u00079\u0005+X<\u0012nn";
      f940[22] = "{\u0006\tnm0zO\u0004Pe/lF\u0005\u001bd)z^\u0005<\u00001c\u0004\u00023j/lZh)rq{^\u00027}/\u0011\u0004\b-0\"u\f\u0019?aH+^\u000b1;9\u007f\u0003\u000f.\u0000";
      f940[23] = "\n\u0016\u0017\r\"!]\u0006\u001a^Yd\\\u001d\u0016\r#UV\u001e\u0010\u0007\u0013yA{\u0013\r wH\u0018\u0010\u000e>r1\u0002\bY3}[\u001c\u0007\u0007YgCB\u0010\u00033yL\u001czP\"tX\u0000\u0003\t6|P{FQitZ\u0018\u0010\u001a6&1";
      f940[24] = "!\u0011$\u0016\t_v\u0001)Er\u001aw\u001a%\u0016\b${\u00075:\u000e\r\u007f|v\u0002\u000b\u0011a\u0010u\u0011\u0017\u000e\u001a\u0005;B\u0018\u0003p\u001b4\u001cr\u0019hE#\u0018\u0018\u0007g\u001bIK\t\ns\u00070\u0012\u001d\u0002{|uJB\nq\u001f#\u0001\u001dX\u001a";
      f940[25] = ";`#\u000eBAlp.]9\u0004mk\"\u000eC4}q2\u0004_~jop\u0007H\u00061b5Y9\u0007r4$\u0000S\u0019}jN\u001aKGjn$\u0004D\u0019\u0000=5\tP\u0005yd!\u0001X~<<~\tR\u001djw![9";
      f940[26] = "\u0017iIQ>[@yD\u0002EӒ,9\u0015]9_Io\u001a]*d";
      f940[27] = "\u0005:\tTb]R*\u0004\u0007\u0019\u0018S1\bTc>S'\u0018wx\u000fZ;dR'\u001bL-\u0006Wu\u000b\u0002W\u001dK \b]=\u0003D~bG%]Sz\bY*\u00039)\u0019T>\u001f@p\r\\6d\u0005(RT<\u0007Sc\r\u0006W";
      f940[28] = "#.w~YC|*ev#ApqjlC%$wx IA,fjq#";
      f940[29] = ":Kh\r\n\u000beOz\u0005p\u0006d\u001b`*\fm=\u0012gS\u001a\t5\u0003u\u0002pRf\u0019x\b\u0013Qv\u001c#c";
      f940[30] = "H\u001f?\u001d~;\u0003\u0016b\u0000Gy\u0014Hj\u0010=H\u001eHz\u0010!\u007fyWtD-`\u0013I{\u001aGz\u000b\u0017l\u001e-d\u0004I\u0006M<i\u0010U\u007f\u0014(a\u0018.:Lwi\u0012Ml\u0007(;y";
   }
}
