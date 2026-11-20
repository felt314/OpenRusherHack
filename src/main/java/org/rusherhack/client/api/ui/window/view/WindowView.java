package org.rusherhack.client.api.ui.window.view;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.client.api.ui.window.WindowViewHandlerBase;
import org.rusherhack.client.api.ui.window.content.WindowContent;
import org.rusherhack.core.interfaces.INamed;

public abstract class WindowView extends WindowContent implements INamed {
   public String f1085;
   public double f1086;
   public List<? extends WindowContent> contentList;
   public double f1087;
   public static String[] f1088;
   public static long f1089 = Class066.m4320(7797084041909622942L, 327607986283603081L, MethodHandles.lookup().lookupClass()).m4325(198557359147150L);
   public static String f1090;
   public static Object[] f1091 = new Object[54];
   public static String[] f1092 = new String[54];

   public void setViewWidth(double var1) {
        
    }

   public double getViewHeight() {
      return this.getHeight();
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
        
    }

   public WindowViewHandlerBase getViewHandler() {
      return RusherHackAPI.getWindowManager().getWindowHandler().getViewHandler();
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   public WindowHandlerBase getHandler() {
      return RusherHackAPI.getWindowManager().getWindowHandler();
   }

   public WindowView(Window var1, List<? extends WindowContent> var2) {
      this(f1090, var1, var2);
   }

   public double getViewWidth() {
      return this.getWidth();
   }

   @Override
   public double getHeight() {
        return 0.0;
    }

   @Override
   public void unfocus() {
        
    }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
        return false;
    }

   @Override
   public double getWidth() {
        return 0.0;
    }

   public abstract void renderViewContent(double var1, double var3);

   @Override
   public String getName() {
        return null;
    }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   public void setViewHeight(double var1) {
        
    }

   public WindowView(String var1, Window var2, List<? extends WindowContent> var3) {
    }

   @Override
   public void renderContent(double var1, double var3, WindowView var5) {
      var5 = this;
      synchronized (this.getContent()) {
         IRenderer2D var8;
         (var8 = var5.getRenderer()).scissorBox(var5.getX(), var5.getY(), var5.getWidth(), var5.getHeight());
         var5.getViewHandler().handleRenderViewContent(var5, var1, var3);
         var8.popScissorBox();
      }
   }

   @Override
   public void tick() {
        
    }

   public List<WindowContent> getContent() {
        return null;
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      return this.getViewHandler().handleViewMouseClicked(this, var1, var3, var5);
   }

   public void setContentList(List<? extends WindowContent> var1) {
      this.contentList = var1;
   }

   public static void m2531(String[] var0) {
      f1088 = var0;
   }

   public static String[] m2532() {
      return f1088;
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
      f1091[0] = "y\u0016$2C%g\u001e>}$$v\u00053'\u0002\"";
      f1091[1] = ")V8\u001aO|\"Y)U.r)R-\u000f";
      f1091[2] = "\u0010n.\u0004\u00125\ft,X\b!\u001cwgI\u000f2\u001a2 D\u0014%\rz(I\u00053QU\u001aI\u0012/\u0013p(H\f%";
      f1091[3] = double.class;
      f1092[3] = "java/lang/Double";
      f1091[4] = boolean.class;
      f1092[4] = "java/lang/Boolean";
      f1091[5] = "t(I\u0018'\u001dh2KD=\tx1\u0000U9\u0001~4Z\u00184\u0018rt[_{\u001fr4JY\"Fm3KA{?r4JY\">r?Y";
      f1091[6] = "GZLb\u0000\u001c2zGm\u0011SObTj\u0018\u001a'";
      f1091[7] = "OMF9~rSWDedfCT\u000fɣ";
      f1091[8] = "5\u0017\u001d\u0017l\u001c+\u001f\u0007X\u000e\u0000,\u0002";
      f1091[9] = "3nbI798as\u0006J!+fzO";
      f1091[10] = "V;y\u0014\u001fYJ!{H\u0005MZ\"0Y\u0002^\\gwT\u0019IK/\u007fY\b_\u0017\u0000JC\u001dIX+r_";
      f1091[11] = int.class;
      f1092[11] = "java/lang/Integer";
      f1091[12] = "j(\u0017\u001bl\u0011\u001f\b\u001c\u0014}^b\u0010\u000f\u0013t\u0017\n";
      f1091[13] = void.class;
      f1092[13] = "java/lang/Void";
      f1091[14] = "x+\u0018P15d1\u001a\f+!t2Q\u001d/)r7\u000bP\"0~w\n\u0017m7~7\u001b\u00114n@0\u0011\u001a,7_8\u0011\u001a/%e\u001b\u001e\r&";
      f1091[15] = "\u00132[Xp\u000e\u000f(Y\u0004j\u001a\u001f+\u0012\u0015n\u0012\u0019.HXc\u000b\u0015nI\u001f,\f\u0015.X\u0019uU+)R\u0012m\f*)Y\u0001J\u001a\u0012$P\u0013p9\u001d3Y";
      f1091[16] = "T2\bf$\u0019H(\n:>\rX+A+:\u0005^.\u001bf7\u001cRn==%\u0004^2')5\u0007z\u0010&";
      f1091[17] = "I^{=G\u0007UDya]\u0013EG2pY\u001bCBh=T\u0002O\u0002ojF\u0006CA2Zb\u001bHHsdx\u0013HM{vG";
      f1091[18] = "3\bmb\bS/\u0012o>\u0012G?\u0011$/\u0016O9\u0014~b\u001bV5T\u007f%TQ5\u0014n#\r\b?\u0015d8\u001fH(T]%\u0014B3\rI#\u0014R9\u0014~";
      f1091[19] = "\u0014/ \n\u000b\u0010\b5\"V\u0011\u0004\u00186iG\u0015\f\u001e33\n\u0018\u0015\u0012s5A\u0017\u0001\u001e/im+\u0000\u00159\"V\u001c\u0017I\u0019";
      f1091[20] = "7T~\u001eO;+N|BU/;M7SQ'=Hm\u001e\\>1\bkUS*=T7yn-1Uj_O/:J|";
      f1091[21] = char.class;
      f1092[21] = "java/lang/Character";
      f1091[22] = "`m\u00058HO|w\u0007dR[ltLuUHj1\u000bxN_}y\u0003u_I!V!zSYd~\u0000z_";
      f1091[23] = "\u0005jL\u0013~2\u0019pNOd&\ts\u0005^c5\u000f6BSx\"\u0018~J^i4DQ\u007fTo,\u000bzGX";
      f1091[24] = "\u0017\u0005BOxt@\r]%|zZ\u001e#W++X\u0004\u001bJwe*";
      f1091[25] = "q+vr\u001ea6.h0d1'/H.\t!\n:p#\u000030S\u007f*\u0007/#*ys\u00043J";
      f1091[26] = "\u000f{G|\u0013MT=\u00034hI\t|\"(\u000eJ\tz\u0015?hJ\u001dm\u0007(\bEZx\u001eE";
      f1091[27] = "d6D,v8\"1\u000b1\u000fl;;N\f~\u007f6>4>7=%lV7f`#R\u000fi\u007fy7;Pmt;[";
      f1091[28] = "\u0001\ft(U\u000bF\tjj/Β:DvjF\b@\f)o^4";
      f1091[29] = "?n&K#xxk8\tYϙ\u0004(>\u000f%+=d4\u0012&";
      f1091[30] = "m\u001afTz8pI3N\u0018 k\u0017-T\u007f!J\u0011&/\"d8\u0011&L!\"e\u000fV\u0015'cg\u00065\u0016a>yvl\u0010 <p\u0015oV}\"\u0000Li\u0017\u007f+cO/Ja[1H7Pt!|\u001ffL\u0018";
      f1091[31] = "}gO\u000f/\u0000`1\u001a\u0018C\u0018s<AbrZs(N\u0018?\r\"4\"";
      f1091[32] = "-\f2\u0013\u000bSj\t,Qq\u0003{\b\rO\u001d\u0010vth\u0011I\u000bf\u0017kW\u0014\u0015\u0016";
      f1091[33] = "\u001eJ\u0005T/jMTX\u0005\u001en\u0019Rf\\xm\u0013Q|Txh\u001bCC=umNOHFph\u001aC9";
      f1091[34] = "TW.\u0002hQR\u000e-\u001e\u0001HTT!\u0017lrPT!\u001e{v\\_28fNA_+\u000f\u0001\u0013ERp\t>T@L2s;\u0017\u0005U=\u00108QXKMI>\u0010ZB.JxMD2|M`WQH1\u001a1K=";
      f1091[35] = "gG\u0006\u0004ON B\u0018F5\u001a;Y\u001aTS\r\u0018^\u001dE5L'XXH\t\u0017aXY";
      f1091[36] = "\u000eMT0(;U\u000b\u0010xS-\u0003X\fb.+e\u0007Uh,<\u001fJ\u000290P";
      f1091[37] = "\u0007!&-`@@$8o\u001aդ<cy(}\u000f_`?uc";
      f1091[38] = "iY\n#BK.\\\u0014a8ЀR\u001bU&_\u00041\u0018\u0013{A";
      f1091[39] = "kJAG9rkYF\u001bH\u007f7O#\u001c%o\u001aZ\u001b\u0011,} 3\u0014\u0018+a3J\u0012A(}Z";
      f1091[40] = "VkWi,\u0005\u0007i\u0002xU\u001d_o\u0012t\u000f\u0015\\\u007f\u0000b8\u00148(V!2\b[+\u0010|,x\u0002-Q~%\u001b\u0001k\f`UH\bnS&l\u0003Ab\u0007\u0019dFYm\u0005c)\u0011\bqi";
      f1091[41] = "-hY\u0015\",+1Z\tK5-kV\u0000&\u000b%`E!,(?`q\u0000*>'`Vdp-$0@[7(:r:^tm#}Y]20=\r\u0000[s24n\u0003\u001d.,D=\n\u0018qj}vC\u0014%U\u007f4J\u001a'< 0AXK";
      f1091[42] = "w\u0014N\u007f6\\0\u0011P=L\f!\u0010e%*\u001f!\nRBq\u0018+R_~*^+S.";
      f1091[43] = "JV*i\u001bq\t\u0014%uv$\u0014R2v-*\tH-\u007f\u001b-s\u0015v#\u00111\u0010\u00160~\u000fAI\u0010q|\u0006\"JV,bv{L\u0017.k\u0015x\nJ0\u001bMx\u0003Q%r\u0012|\b\u0013I";
      f1091[44] = "\u0018\u0010/c8M_\u00151!B˨#X-!+NY\u0010r$3r\u0012V.!.\b_\u0001\u007f=B";
      f1091[45] = "1\r^uVsw\n\u0011h//c\u0018rxW!bi\u001e9Sv1PUp_\"\u000eY\u001eu\u0015s7\u0012WyAL>YR3\u0010uu\u0010^g/w7\u0019PeF(3\u0012\u0012\t";
      f1091[46] = "^6\u0019T1nCeLNSuT\"rD2vH=Se4}3k\u0017N,aI&@\u001f0\r";
      f1091[47] = "`\u001b\u0017F\t$'\u001e\t\u0004sw[_\u0006\u0011\u001f#d^\u001aE\r\u001bg\u0012\u001d\u0017K$f\u000eI\u0005s";
      f1091[48] = "[K\u001a2\u0007\u0007\u0000\r\u001a3vZ\u001a]\u0007e\n\\\u001c0@k\u0017Q\u0004S\u0017c\b;";
      f1091[49] = "sR!rk\u00064W?0\u0011V%V\u0001\"pV(VAu.\u0001/Z\"vh\\1*";
      f1091[50] = "w\u001a\u0013\u0007kK,\\WO\u0010Oq\u001d|>*\u001f$\u0006\\])Yy\u0018,";
      f1091[51] = "t\b\u000b=7R/NOuLVr\u000fe\u0004v\u0006'\u0014Dgu@z\n4";
      f1091[52] = "CHfbL\u001fFM2n=\u000bEX\u0003b[\bO[\u001cj[\bLI&\u0003\f\u001d\u0014\u001e-a\f\u000e\u0013B\\";
      f1091[53] = "\bt=FL._|\",N.NU1\\RG\u000e*,RB.Q.'\u0010.";
   }

   public WindowView() {}
}
