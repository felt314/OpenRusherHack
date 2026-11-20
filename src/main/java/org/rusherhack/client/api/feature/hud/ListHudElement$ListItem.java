package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;

public abstract class ListHudElement$ListItem {
   public Animation f625;
   public ListHudElement f626;
   public boolean f628;
   public static long f629 = Class066.m4320(8336400545336523709L, -4147951292076505461L, MethodHandles.lookup().lookupClass()).m4325(193914633754478L);
   public static long f630;
   public static long f631;
   public static Object[] f632 = new Object[58];
   public static String[] f633 = new String[58];

   public Animation getAnimation() {
        return null;
    }

   public abstract Text getText();

   public void render(RenderContext var1, int var2) {
      this.getFontRenderer().drawString(this.getText(), 0.0, 0.0, this.getColor(var2));
   }

   public IFontRenderer getFontRenderer() {
        return null;
    }

   @Override
   public boolean equals(Object var1) {
        return false;
    }

   public double getHeight() {
      return this.getFontRenderer().getFontHeight();
   }

   public void tick() {
        
    }

   @Override
   public String toString() {
      return Formatting.strip(this.getText().getString());
   }

   public ListHudElement getParent() {
        return null;
    }

   public double getWidth() {
      return this.getFontRenderer().getStringWidth(this.toString());
   }

   public ListHudElement$ListItem(ListHudElement var1, ListHudElement var2) {
    }

   public abstract boolean shouldRemove();

   public int getColor(int var1) {
        return 0;
    }

   public IRenderer2D getRenderer() {
        return null;
    }

   static {
   }
   public static void m122() {
      f632[0] = "T\\'>\u0013/HF%b\t;XEns\r3^@4>\u0000*R\u0000&u\u0000.N\\%>\t/_\u0000\fy\u0012.s[$U\r?VK.dE\u0016R]4Y\u0015?V";
      f632[1] = "(i~\r\tj4s|Q\u0013~$p7@\u0017v\"um\r\u001ao.5\u007fF\u001ak2i|\r\u0013j#5UJ\bk\u000fn}f\u0017z*~wW";
      f632[2] = ":9t\u001a\u007ff&#vFer6 =Waz0%g\u001alc<euQlg 9v\u001aef1e[AiV9.~Qcg";
      f632[3] = ":/\u0014\u0000,,&5\u0016\\6866]M2003\u0007\u0000?)<s\u0001K0=0/]H17!s:h17!\u000f\u0016@:<'8\u0001";
      f632[4] = "ytupU\u001cytb,Y\u0013c?b2Y\u0006dN4m\fM";
      f632[5] = double.class;
      f633[5] = "java/lang/Double";
      f632[6] = int.class;
      f633[6] = "java/lang/Integer";
      f632[7] = "=\u0019^Z2D=\u0019I\u0006>K'RI\u0018>^ #\u0018Ai\u001c";
      f632[8] = "#@J3\u0016\u0013?ZHo\f\u0007/Y\u0003~\b\u000f)\\Y3\u0005\u0016%\u001c_x\n\u0002)@\u0003T6\u0003\"VHo\u0005\u0004 W\u001fY";
      f632[9] = "E<\u001c^;3Y&\u001e\u0002!'I%U\u0013%/O \u000f^(6C`\t\u0015'\"O<U9\u001b#D*\u001e\u0002,4\u0018\n";
      f632[10] = "Q~~;I%Md|gS1]g7vT\"[\"x{R=_xpzU~\u007fbpxZ$Wcw";
      f632[11] = boolean.class;
      f633[11] = "java/lang/Boolean";
      f632[12] = "1\"\u0011RUz:-\u0000\u001d9y4/\u0002R\u0015";
      f632[13] = "J\r\u001d\u000e* V\u0017\u001fR04F\u0014TC7'@Q\tE,!L\u0011\u001d\u000e\u000b0Q\u000b\u0013N?";
      f632[14] = "\u0002,g\u0003E\u0013\t#vL$\u001d\u0002(r\u0016";
      f632[15] = "i6A\u001dS*u,CAI>e/\bPN-cjG]H2g0O\\OqC%UZO8";
      f632[16] = "p\u0002~/'Al\u0018|s=U|\u001b7b:Fz^jd!@v\u001e~/\u0017[p\u001c|`;gz\u0004mh;S";
      f632[17] = "\u0017Xn\u000fke\u001cW\u007f@\u0016}\u000fPv\t";
      f632[18] = "!z\u0006M\u0001dTZ\rB\u0010+)B\u001eE\u0019bA";
      f632[19] = "6/4\u0012o\u0006*56Nu\u0012:6}Ɉ";
      f632[20] = "}\u000b\t9XS}\u000b\u001eeT\\g@\u001e{TI`1L%\u0001";
      f632[21] = "SSn*E\u0007OIlv_\u0013_J'g[\u001bYO}*V\u0002U\u000fzaC\u0006UOn*t\u001dPN{WR\u0006HHgc";
      f632[22] = "Gg8\u0003i0[}:_s$K~qNw,M{+\u0003z5A;9Hz1]g:\u0003s0L;\u0013Dh1``;hw Ep1Y?\u0006Gy0_V*Lp";
      f632[23] = "!K<|GA=Q> ]U-Ru1ZF+\u0017(7A@'W<|pZ;T\b7A@'W<";
      f632[24] = "|\u000bt!jz%\bf7\u0017x'Zo](8)Oc'q;;Y\u001e";
      f632[25] = "bm'1 `.dJr#;o{&S.9ua'\tsax&:8(3~aJ";
      f632[26] = "@3$>\u0014 \u001906(i;\u0004Q#<\u0004 \u0004f\"BYg\u00152>s\u00025\u0013uN";
      f632[27] = "PFd\u001d!\u0018\u000f\u00113\b\u0019N\u000eIi\u0000\\B\u0005@\u000e\u0015(]\u0016\u001dgF$[\n";
      f632[28] = "RNEe8Z\r\u0019\u0012p\u0000\f\fAHx\u0000\n\u0010G_~r\b\u0016\u0015\u0014";
      f632[29] = "|!\u000b\u0019ZY#qV\u001d4[+b{\u0002RH\u0006sT\nTHF%M\u001aTK7gH\u000f\f4";
      f632[30] = "kpkuz!4 6q\u0014 +&*Rh60):\t/p.708v0n\u007fU2l310$pi&iOnqk,.>,t~tQsjix545:r*Lj7*ik=(2?1\u0014";
      f632[31] = "\u0010Jm\u0005q7\u0012L?N\r*\u0010MU\u001cl#\u0017Vp*l9\u001dva\u001bv(\u000113Jm)\u0004Tu\u001av{}\r0\u0015a<\u0018K`\u000e3E";
      f632[32] = "><s[_\u0013g?aM\"\u0006lx\u0019\u001cZ\u0016a{h^_\u00039\u0004";
      f632[33] = "I:\u00157jh\u00109\u0007!\u0017i\u001b~3*m\u007f\u001d~\u001e,q\u0012F?\u0015rg#\u001dm\u00135\u0017-Nh\u00036mtMz\u0015K";
      f632[34] = "Q{1[L=\u001dr\\\t/mDx!S\u001ek@u'cCdPtlRE`]r\\";
      f632[35] = "qQ\u0012\u001c\u001f<|\u0001V\\c3-\u0011t\r\u0007!-mCZ\t>x\u0004Q\u0018\u001a&@";
      f632[36] = "\u0012\u000el\u0001P\u0005^\u0007\u0001V^E)\u001be^I9^CaUJ\\\u0018\u0013z\u00073\u0005]\u001cm@VC\r\u0007?9";
      f632[37] = "=C\u0011^Y\u001fb\u0014FKaKbI\u001eP\u001dCcN\u00009\u000b\u001dh\u0015\u0000\t[\u001eo\u0013";
      f632[38] = "Jr\u000e\u0014Yu\u0006{cP]\u0012Fz\u0002JUIQ<\u0019\u0017W+\u0006g[R:";
      f632[39] = "B0.h\u001er@6v#boB7\u0018q\u0006}B\u0011\tRb<\u0010+*a\u0007z@0x\u0018";
      f632[40] = "qL\u001e('wmW\u0010:W'fJF<,Jv\tE:o#dKV\"Wz\"]\u0016(f!p[QX";
      f632[41] = "W&\u0005^\u0004h\u000e%\u0017Hys\u0013F\u000bK\bs\u000eqo\u0012DxQn^I\u0016~\u0016\u001e";
      f632[42] = "Y\u0010E|S\u001a\u0015\u0019(Ȕ0\u0016\u0014\b\u00114\u0001MF\u000eV";
      f632[43] = "5*<m\u0001\u001dt?7ukȰ\f%>w\u0005\u000fq#2(\u0007l";
      f632[44] = "r\u001c\u0018\u007f\u00051>\u0015uɺf4i\u0004\u0012\u007f[k>S\u0007";
      f632[45] = "@9U _|\f08wQ<l&Hd<}QvZ%FqI&V\u0018";
      f632[46] = "v\\m\u0013Vr7If\u000b<l\"DG\nZ\u007f\u0015Uo\u0001Qy\"B\tW\u0003=3Vd\bS`78";
      f632[47] = "\u00182\u000f\tHNM:\u0018\u000f+VO>\r\u001dBZv0\r\rF<\u0018d\u0003I[\rC6\u0005\u000e+";
      f632[48] = "\u0006Qv{r9\u001aJxi\u0002_4c\u001bJI\u0004\u0006Qv{r9\u001aJxi";
      f632[49] = "#)zV{R/1*ZFGs4\u001cH<Ix'G_zR%%%\b!\u0010`H";
      f632[50] = "^\u001bzQU.\u0001K'U;,\tX\u001fQA\"\u0002K\u001bLW?\u0004$/\u0011Ax\tFxJ\u0003=d\u001f<R[<\u0015]9G\u0003C";
      f632[51] = "\u0011\rW\f,\u0004]\u0004:ļO\u0007Y\u0015FI5^Z\u0007P";
      f632[52] = "#\u001bf\u001d&\u0017sHn\u0016\u001f\t#V|\u0011s;s\u0011-vtP4\u0011q\u0014#\u000bvT\u001c\u001d#\u0016uG~JxT0*";
      f632[53] = "k7Lz\u0002I'>!-\f\tU\"G>;\u0018})L8\f\u000f\u001b\u007f\u001e|\u001d\u001bv N!\u0019u";
      f632[54] = "\u0013\u001d)!\"oQF8q_iC\u0002\u000bs9jC\u0004<d_8H\u001e/f3k\u0010E/\u001e";
      f632[55] = ".2\u0015<\u000e||7\u001b73@\u0006\tf\u0015i\u0004.2\u0015<\u000e||7\u001b7";
      f632[56] = "@h~fD~Bn,-8mVIuw^fJl\u001c&\u0005f\u0014c-}W`S\u0013";
      f632[57] = "\rk7.9\fAbZyZ\t\u0016s=.gVA$(";
   }

   public ListHudElement$ListItem() {}
}
