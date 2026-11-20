package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.Window;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.render.graphic.VectorGraphic;
import org.rusherhack.client.api.ui.notification.RenderableNotification;
import org.rusherhack.core.notification.NotificationType;

public class Renderer248 extends RenderableNotification {
   public Class572 f4372;
   public static int f4373;
   public double f4374;
   public double f4375;
   public double f4376;
   public static int f4377;
   public double f4378;
   public long f4379;
   public static long f4380 = Class066.m4320(-8485617101142967493L, -1517828130230529303L, MethodHandles.lookup().lookupClass()).m4325(251771957179388L);
   public static long[] f4381;
   public static Integer[] f4382;
   public static long[] f4384;
   public static Long[] f4385;
   public static Map f4386;
   public static Object[] f4387 = new Object[66];
   public static String[] f4388 = new String[66];

   @Override
   public boolean isHovered(double var1, double var3) {
      if (var1 >= this.f4378 - this.m8962() && var1 <= this.f4378 && var3 >= this.f4375 - 24.0 && var3 <= this.f4375) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public Renderer248(String var1, NotificationType var2, Class572 var3) {
      this(var1, var2, var2.getTypeID(), var3);
   }

   public Renderer248(String var1, NotificationType var2, int var3, Class572 var4) {
      super(var1, var2, var3);
      this.f4379 = System.currentTimeMillis();
      this.f4372 = var4;
      Window var8;
      this.f4378 = (var8 = Globals.mc.getWindow()).getScaledWidth() + this.m8962();
      this.f4375 = var8.getScaledHeight();
   }

   public double m8962() {
      double var3 = this.getFontRenderer().getStringWidth(this.getText());
      if (this.m8292()) {
         var3 += 30.0;
      }

      double var5;
      return var5 = var3 + 10.0;
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
      IFontRenderer var12 = this.getFontRenderer();
      this.m8963();
      double var8 = this.f4378 - this.m8962();
      double var10 = this.f4375 - 24.0;
      IRenderer2D var10000 = this.getRenderer();
      double var10003 = this.m8962();
      int var10009 = 1;
      var10009 = -2147483648;
      var10000._drawRoundedRectangle(var8, var10, var10003, 24.0, 3.0, true, false, 1.0F, var10009, var10009);
      VectorGraphic var14 = (VectorGraphic)Class572.f9186.get(this.getType());
      this.getRenderer().drawGraphicRectangle(var14, var8 + 5.0, var10 + 12.0 - 10.0, 20.0, 20.0);
      var12.drawString(null, this.getText(), var8 + 20.0 + 10.0, var10 + 12.0 - var12.getFontHeight() / 2.0 + 1.0, -1, false);
   }

   public void m8963() {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.isHovered(var1, var3)) {
         this.getTimer().setTime(System.currentTimeMillis() - this.getLifeSpan() + 700L);
         return true;
      } else {
         return false;
      }
   }

   public boolean m8292() {
      boolean var10002 = true;
      return true;
   }

   @Override
   public IFontRenderer getFontRenderer() {
      return this.f4372.getFontRenderer();
   }

   static {
    }
   public static void m343() {
      f4387[0] = "RPXm\u007f;NJZ1e/^I\u0011Ƹ";
      f4387[1] = double.class;
      f4388[1] = "java/lang/Double";
      f4387[2] = "vj\u0015\u0014_\"vj\u0002HS-l!\u0002VS8kPR\u000b\u0002";
      f4387[3] = "\u0004U:^E\u0010\u0004U-\u0002I\u001f\u001e\u001e-\u001cI\n\u0019o\u007f@\u001cH";
      f4387[4] = int.class;
      f4388[4] = "java/lang/Integer";
      f4387[5] = "\t\u0003m*Mo\u0015\u0019ovW{\u0005\u001a$gSs\u0003\u001f~*^j\u000f_MhPx\u0007\u001dy";
      f4387[6] = long.class;
      f4388[6] = "java/lang/Long";
      f4387[7] = "\"wU-0\u0001)xDbM\u0014;bF!";
      f4387[8] = boolean.class;
      f4388[8] = "java/lang/Boolean";
      f4387[9] = "r\rHe`On\u0017J9z[~\u0014\u0001(~Sx\u0011[esJtQ].|^x\r\u0001-}TiQf\r}Ti-J%v_o\u001a]";
      f4387[10] = "C\u00166\u0015kxH\u0019'Z\u0016`[\u001e.\u0013";
      f4387[11] = "[\u0010m~jSG\no\"pGW\t$3wTQLd?lOR\u000bi1lO[\f$$aVQLD?lOR\u000bi1lO[\f";
      f4387[12] = void.class;
      f4388[12] = "java/lang/Void";
      f4387[13] = "Lgn\u001a\u0006bP}lF\u001cv@~'W\u001beF;g[\u0000~E|jU\u0000~L{'z\u001bcJs`W\u0015cJzg`\rgF";
      f4387[14] = "Ed%rDHIl$9\rDIf%3M\tEd$0FDR%\u00011NRRj*0FjG{";
      f4387[15] = "8F\u0005nH!3I\u0014!)/8B\u0010{";
      f4387[16] = "/|u5&,3fwi<8#e<x80%`f55)) `~:=%|<R\u0006<.jwi1+rJ";
      f4387[17] = float.class;
      f4388[17] = "java/lang/Float";
      f4387[18] = "~1\u0013\u001c\u000bX~1\u0004@\u0007Wdz\u0004^\u0007Bc\u000bS\u0007^\u0006";
      f4387[19] = "U\u00035\u001a@\fI\u00197FZ\u0018Y\u001a|W^\u0010_\u001f&\u001aS\tS_ Q\\\u001d_\u0003|}`\u001cT\u00157FS\u001bV\u0014`p";
      f4387[20] = "i\u0012E_L\u001au\bG\u0003V\u000ee\u000b\fՈ";
      f4387[21] = ";ls?\u0016X'vqc\fL7u:r\bD1p`?\u0005]=0ft\nI1l:v\u0016L$v}rJd\u0013lua\fD7";
      f4387[22] = "s\u0010\u000b2Ifm\u0018\u0011}+zj\u0005";
      f4387[23] = "8*W\u001eE;$0UB_/43\u001eSX<2v^_C'11SQC'86\u001eDN>2v|YA'9?~_C'11SQC'86";
      f4387[24] = ")\u0015\\b~E5\u000f^>dQ%\f\u0015/cB#IN8e\\5Io%aU4";
      f4387[25] = "\u0013\n\n\\c\u0014\u0018\u0005\u001b\u0013\u0000\u0019\r\u0003";
      f4387[26] = "=xj*O8!bhvU,1a#Ȃ";
      f4387[27] = " WqG6%<Ms\u001b,1,N8ȝ";
      f4387[28] = "\u0000U^\u0000\u007f\u0010SP\\kύb\u0005T\u0015Rc\f]\u0002B\u0011\u0013";
      f4387[29] = "t;\b\bB2'>\ncŰ@q:CZ^.)l\u0014\u0019";
      f4387[30] = "\u0017O\u007f`_fE_611~\u0015L\u001aaThx\f(=HhCI+zJ\u0005H\\>dSzD\u0001~y1";
      f4387[31] = "2_)\u0006ZC#V!F.X8CQ\u0001N\u0001kH?Y\u0018V(8hR\u0014\b\"V0\u0004CKR";
      f4387[32] = "\u001e\\-KK\f\u001cP>TtԒ\u007fW>K\u0012\u0000B\t3J\nr";
      f4387[33] = ",~Os8\u0002\u007f{M\u00185\u000bPrJu.\u001d|\u0015\rrdI`{U.3\n\u0010,^(m\u0000~t\b\u007f.p-g\b(2\u000fhqR$T";
      f4387[34] = "oh\f ^Lmd\u001f?aɫ\u000ec\u001f \u0007@3=\u0012!\u001f2";
      f4387[35] = "yb-*\u000e\u001d*g/Aתox{jq\u0004\u0010=m0}b";
      f4387[36] = "&86Gq:f24^\u0017+u>\bEq8X/'Mw8\u0018{,\u0012.4v#zEmD";
      f4387[37] = "<6d\u0012aO:#0P\u0007i:6`\u0016]Y+*e\u0004kd;'u\u0000aQ2!\tPm\u000eo<g\b;Y,L0\u00037\u0007&\"hU`DVucY>N8-5\u000e}>o&9PwP7pn\u0013\u0007\u0007<|0\u0019i_j+si:Lj|o\u0016\u007fZ0p\tTu\u0002f*v\u0011cXjLc\u0017{]ov7Q{_Vv{\taLk(v\by>l>i\u000fu\u000323h\u0017\u0007\u000e:4m\u000bx\u0002gtpi";
      f4387[38] = "e\\p\r5@1Cq\u0000WY2Zv[;kc\u001a&\u0002W\u0006-FpNjX Gh<";
      f4387[39] = "\u00123,A\u001d/R9.X{=V #\u007f\u0007+M/3$\u0010)\u0012pd\u0014K`I.\\\u001b\u0018mJq!BC*\u0016IeNKh\\'=\u0018\u001c+,p6\u0014B!B(`C\u0001Q\u0016;<B\tlH6=Z{l^ulB\u0004)H/`$B;\u001cp,J\u001amK3\\";
      f4387[40] = "7J2!\u0003s7Z/qft8S;\u001a\\}9G$'\u0002p8_V";
      f4387[41] = "WL\u0017\u0005\u001e&\u0004I\u0015n¡TRM\\W\u0002:\n\u001b\u000b\u0014";
      f4387[42] = "40T2]! 3F+4(6/m(Z*\u0000+@/4{5nP$\u000f>6)RI";
      f4387[43] = "L\u001e;Ih\u0014\u001f\u001b9\"Ϋf\u001dK\"P}\u001e\u0002\rqA";
      f4387[44] = "=4\u0011R\"-o$X\u0003L!?7tS)#RwF\u000f5#i2EH7N";
      f4387[45] = "aey\u001d4w2`{v¹\u0005mbz\u0012:za?:\u000fX";
      f4387[46] = "\u001a >v\u0001@\u001a0#&d]\u0012'7=#Rt!c}\u0002Y\u000f!6+\u0001<N9:+\u0016\u0001\u00104;3d";
      f4387[47] = "Eu\u0005\u0019`H\u0000!\u0007\u000e\u0000U\u0011lX\u0004lgF*\u0006S;0Fj^RbL\u0012u__\u0000";
      f4387[48] = "\"Y\u000eX\u0018W6Z\u001cAq^ F/B\u0014\\7:\u001c\\HQ#YNL\u0001\u0000M";
      f4387[49] = "m\u0003%B./>\u0006').]3VoM3 a\u00043SB?oY:X?m=\u0005$)";
      f4387[50] = "\u0015'\u0014!9/\u0015\"\u0003`\u0006{G</i~y*q\u0016h}{L0\u001cjj\u0014";
      f4387[51] = "tTPoE\u0019'QR\u0004[kqU\u001b=Y\u0005)\u0003L~";
      f4387[52] = "8t'n)?nj=)\u0010 9s\u0011tv3\u000eb9\u007f}59u_-j?1i!m`=(\u000f";
      f4387[53] = "%t#V>ep}c\u0010Payp^\u0005i>ri%\u0005<hq\f4V`hqw4\u00036k\u0014";
      f4387[54] = "!+&/hcr.$Dʏ\u0011$*m}t\u007f||:>";
      f4387[55] = "\u00148\u00053M\u0011G=\u0007XN\u000eT\u001d\u0019>]9E5\u00125[\u000eRS@\"Q\u0006N-\u0000(S\u001f(";
      f4387[56] = "\"Zb[s\u001fy\u0012i\u001a\u0003Br*?\u0004>]yRzP<J";
      f4387[57] = "\u0006G!N;eUB#%ě\u0017\u0006Bg\\:,CA ^";
      f4387[58] = "QyRZ54\u0011sPCS%\u0002\u007fyC)+\tl}^?6\u000f\u0003\u001d\\o,W~D\u0007(po:H\u000fj:\u0001b\u001eX)J";
      f4387[59] = "0\u0011]\"+\u0016d\u000e\\/I\u000fg\u0017[t%=6V\u0003)IPx\u000b]at\u000eu\nE\u0013";
      f4387[60] = "Nu=\u0000j8\u0019ud\u001e\u0017n\u000e>&\u000fqy/%9\u000fRd\u0017 =\u0019\u00179\u001dy%\u000f,|\u001e>'b";
      f4387[61] = "(P3j.B~N)-\u001d])W\u0011z{^)Q&m\u001dX>F0ql^+\u0012r\u0017";
      f4387[62] = "yS\r9)%yV\u001ax\u0016q+H6mfbF\u000b\t<p&;RR{,\u001e";
      f4387[63] = "N!^\u0003\u00197Qg\r\u0012`ґ#.D\fY!H{ML\u001f";
      f4387[64] = "M5Vd+QK \u0002&ML]&DP7I_/Zt\u0017ML3Ry\"DJOU v\u001a@t\u0005\u007f=Z'vQ/tPI.\u0007x7 \u001e%\u000b&=NFs\\eM\u0019M\u007f\u0002o#A\u001b(A\u001ftJ\u0017vKq,\u001c@5;/!XC-D#|\u0018^O";
      f4387[65] = "\u0013}J.\t@\f;\u0019?pմ~-C8K]\u0002-S%\u001b8";
   }
}
