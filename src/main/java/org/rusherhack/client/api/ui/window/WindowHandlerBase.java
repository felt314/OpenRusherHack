package org.rusherhack.client.api.ui.window;
import org.rusherhack.*;

import com.google.common.collect.ImmutableList;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.ui.ElementHandlerBase;
import org.rusherhack.client.api.ui.window.view.WindowView;
import org.rusherhack.core.setting.Setting;

public abstract class WindowHandlerBase extends ElementHandlerBase<Window> {
   public static Object[] f947 = new Object[101];
   public static String[] f948 = new String[101];

   @Override
   public boolean consumeMouseClick(double var1, double var3, int var5) {
        return false;
    }

   public WindowHandlerBase() {
      super(false);
   }

   public abstract WindowContentHandlerBase getContentHandler();

   public abstract void renderWindowFrame(Window var1, double var2, double var4);

   public void moveElementToTop(Window var1) {
      RusherHackAPI.getWindowManager().moveToTop(var1);
   }

   @Override
   public void initialize() {
   }

   public abstract int getFramePadding(WindowHandlerBase$WindowSide var1);

   @Override
   public void setDefaultPositions() {
   }

   public boolean consumeElementMouseRelease(Window var1, double var2, double var4, int var6) {
      var1.mouseReleased(var2, var4, var6);
      var1.setDragging(false, 0.0, 0.0);
      return false;
   }

   @Override
   public boolean charTyped(char var1) {
        return false;
    }

   @Override
   public void renderElements(RenderContext var1, double var2, double var4) {
      WindowHandlerBase var8 = this;
      Iterator var10;
      Iterator var10000 = var10 = RusherHackAPI.getWindowManager().getVisibleWindows().iterator();

      while (var10000.hasNext()) {
         Window var9;
         if ((var9 = (Window)var10.next()).isHidden()) {
            var10000 = var10;
         } else {
            var8.renderWindow(var9, var1, var2, var4);
            var10000 = var10;
         }
      }
   }

   public boolean isElementHovered(Window var1, double var2, double var4) {
        return false;
    }

   @Override
   public List<Window> getElements() {
      return ImmutableList.copyOf(RusherHackAPI.getWindowManager().getFeatures());
   }

   public abstract WindowViewHandlerBase getViewHandler();

   public boolean consumeElementMouseClick(Window var1, double var2, double var4, int var6) {
        return false;
    }

   @Override
   public void consumeMouseMove(double var1, double var3) {
        
    }

   public Color getWindowColor(Window var1) {
      Color var5 = RusherHackAPI.colors().primaryColor().getValue();
      return var1.isFocused() ? var5 : var5.darker();
   }

   public void renderWindow(Window var1, RenderContext var2, double var3, double var5) {
        
    }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
        return false;
    }

   static {
      m786();
   }
   public static void m786() {
      f947[0] = "['L9\u0006FG=Ne\u001cRW>\u0005t\u0018ZQ;_9\u0015C]{^~ZD];Ox\u0003\u001dc<Es\u001bDw:Ec\u0011]@\u001dJy\u0010_Q'iv\u0007V";
      f947[1] = "3\u0006";
      f947[2] = void.class;
      f948[2] = "java/lang/Void";
      f947[3] = "LG!d#lP]#89x@^h)=pF[2d0iJ\u001b3#\u007f\\OP+/?maT5/";
      f947[4] = double.class;
      f948[4] = "java/lang/Double";
      f947[5] = "Ni\u0011\u0007J^Rs\u0013[PJBpXJTBDu\u0002\u0007Y[H5\u0003@\u0016\\Hu\u0012FO\u0005vr\u0018MW\\iz\u0018MTNSY\u0017Z]";
      f947[6] = ":\b?Y8\u0000&\u0012=\u0005\"\u00146\u0011vȃ";
      f947[7] = "\u0006\u007fw_\u000f\u0012\u001aeu\u0003\u0015\u0006\nf>\u0012\u0012\u0015\f#c\u0014\t\u0013\u0000cw_.\u0002\u001dyy\u001f\u001a";
      f947[8] = "\u0012\u0014\u0013\u0014<?g4\u0018\u001b-p\u001a,\u000b\u001c$9r";
      f947[9] = "J_\b\u001bG%VE\nG]1FFAVY9@C\u001b\u001bT L\u0003\tPT$P_\n\u001bB9KI\u0000B\u001b\u0007LC\u000bZB";
      f947[10] = "k\u0019";
      f947[11] = boolean.class;
      f948[11] = "java/lang/Boolean";
      f947[12] = int.class;
      f948[12] = "java/lang/Integer";
      f947[13] = "%:\u00079\n#;2\u001dvm\"*)\u0010,K$";
      f947[14] = "4.+xg\u0004?!:7\u0006\n4*>m";
      f947[15] = "hC\u0007T\u0015[vK\u001d\u001bwGqV";
      f947[16] = ":\u0017V4_\u0002&\rThE\u00166\u000e\u001fyA\u001e0\u000bE4L\u0007<KBc^\u00030\b\u001fSz\u001e;\u0001^m`\u0016;\u0004V\u007f_";
      f947[17] = "]@t^y\nAZv\u0002c\u001eQY=\u0013g\u0016W\\g^j\u000f[\u001cA\u0005x\u0017W@[\u0011h\u0014sbZ";
      f947[18] = "\u0011%Pv^\n\r?R*D\u001e\u001d<\u0019;@\u0016\u001b9CvM\u000f\u0017yE=B\u001b\u001b%\u0019\nI\u0011\u001a2E\u001bC\u0011\n2O,";
      f947[19] = char.class;
      f948[19] = "java/lang/Character";
      f947[20] = "\u0000;B,X<\u001e3Xc: \u0019.}9\u0013;\u000b.[?";
      f947[21] = "\u001eRA\u001cp\u001a\u0002HC@j\u000e\u0012K\bQn\u0006\u0014NR\u001cc\u001f\u0018\u000eS[,\u0018\u0018NB]uA\u0007ICE,8\u0018NB]u9\u0018EQ";
      f947[22] = "\u0013\u0019d'}?\u000f\u0003f{g+\u001f\u0000-jc#\u0019\u0005w'n:\u0015Ev`!=\u0015\u0005gfxd+\u0002mm`=4\nmmc/\u000e)bzjn+\u0002mm`=/\u0002gl";
      f947[23] = "\u0018\u0017\r^\u0018N\u0004\r\u000f\u0002\u0002Z\u0014\u000eD\u0013\u0006R\u0012\u000b\u001e^\u000bK\u001eK\u0018\u0015\u0004_\u0012\u0017D99X\u001e\u0016\u0019\u001f\u0018Z\u0015\t\u000f";
      f947[24] = "g\u001au\u0000\u0012s{\u0000w\\\bgk\u0003<M\fom\u0006f\u0000\u0001vaF`K\u000ebm\u001a<g2cf\fw\\\u0005t:,";
      f947[25] = "<]AI?|<]V\u00153s&\u0016V\u000b3f!g\u0001Rj\"";
      f947[26] = "{2pLJ\fg(r\u0010P\u0018w+9\u0001T\u0010q.cLY\t}ne\u0007V\u001dq29\u0004W\u0017`n^$W\u0017`\u0012r\f\\\u001cf%e";
      f947[27] = "fSb\u00193azI`E)ujJ+T-}lOq\u0019 d`\u000fp^oc`OaX6:jNkC$z}\u000fR^/pfVFX/`lOq";
      f947[28] = "BIp[\u0010=^Sr\u0007\n)NP9\u0016\u000e!HUc[\u00038D\u0015e\u0010\f,HI9<0-C_r\u0007\u0003*A^%1";
      f947[29] = "\"&5lhw><70rc.?|!vk(:&l{r$z 'tf(&|\u000bHg#070\u007fp";
      f947[30] = "du=emy\u0011U6j|6lM%mu\u007f\u0004";
      f947[31] = "D\f@\b\u001dwH\u0004ACT{H\u000e@I\u00146D\fAJ\u001f{SMdK\u0017mS\u0002OJ\u001fTN\u0010Y";
      f947[32] = "\u0019u\u001f>xQ\u0012z\u000eq\u001fI\u0016f\b=:X";
      f947[33] = "\u0001&\"v86\u001d< *\"\"\r?k;%1\u000bz#=+7\u001b& v\u0003\u0005\u000b51-8&#5+9-&\u001c";
      f947[34] = "\u00142og\u001a[\b(m;\u0000O\u0018+&*\u0004G\u001e.|g\t^\u0012n{0\u001bZ\u001e-&\n\u0007B\u00142{";
      f947[35] = "\u0012bRw\u001a\u0005\u000exP+\u0000\u0011\u001e{\u001b:\u0004\u0019\u0018~Aw\t\u0000\u0014>F<\u001c\u0004\u0014~Rw+\u001f\u0011\u007fG\n\r\u0004\ty[>";
      f947[36] = "\u0005\u00165HKT\u0018\u0003mj\nY\u0000\u0005";
      f947[37] = "6zjV;_0=/Y[D6{OR6@\u001bjp\\;C[</\u000e?D7>qXk?be|YcEf\u007f(\b[";
      f947[38] = "? vH\u007fB?\"*N\u001aQha\u00184!\u00008y3X#^n-H";
      f947[39] = "kJ\u0004;{M5D\u000be\u0003^P\b\tkjV:M^dm7lS\u000fcb])\u0004\u0000d\u0003";
      f947[40] = "$P\u0012n\u0010_c\u0000Z#n]w\u001do)\u0007Iu\u0000E<n\u0019gY\u0012<\fA$\u000eDSU\u0018'\u0005X?WFqQ#hP\u001b~\u001aOj\u000eM*a\u001a1\u0003L\"\u001b\u001e+W\u001d\u001a";
      f947[41] = "PiCV\u001c\u0011Pk\u001fPy\u0002\u0007(,*BSW0\u0006F@\r\u0001d}";
      f947[42] = "d*)SLM#za\u001e2Q=fc\u0003hY>vq\u0015_XZ &SVO6\"x\u0005\u00024a%%\nIXc{s^2\u0004>|zTT]1ebn\u000bV7q \u0014\u000fLc \u0018";
      f947[43] = "\f6JK\u0007\u0017\u0004qHAj\u0012\u001a$WQ\r\u0017\u001bI\u0018@QZ\u0010'B\rZ\u0015`";
      f947[44] = "@\u001a\u001c95IQ\u0013@(P^B\u001eA.\u000b_N\n[/*4\u0016\u0013M\"hN\u0012\t\u0019sP";
      f947[45] = "7~?8uJ?9=2\u0018W2z\u00049uI:f!8\u0018\b&9m,zPen;C";
      f947[46] = "zx?\u001d7rqlk^Jz}uX\u0004,ywvB\f,|\u007fd}e x-sn\b$kyl\u0007";
      f947[47] = "~\u0013w.N+z\u0000#1')y\u0002\u00043L;o\u0013&\u000bF x\u00195T\u0019w%C4-^'m\u000eJ";
      f947[48] = "rgGf5q,iH8Mq$\u007fA:7T(\u007fA02E3pH:M5x(\u0010)4r(`]Wv5t}V;tk\")-ls6-bAn-`y\u0019\u00145 aqc\u0010/t0I";
      f947[49] = "_Or\u001b3w\u0001A}EKb\tMUN&h\tWdQKd\u0019XcKr3\u001d\u0001`*";
      f947[50] = "b:$\u001dn85>}\u001e\u000fzj5 f?el%w\u0000fju=M";
      f947[51] = "#-L>Ki--\b+za+!<9\u0013r;'\u001f/zk!&B*F7z2JT";
      f947[52] = " =\u001fxcM~3\u0010&\u001b\\|%\u000e4~ZV'\u0018,vQg\u0006\u00124`ZP'\u0014\"x7%rDteNb\"\f9\u001b\f%~\u00112w\u000e{(EI \t&'\u000e%\"Wpsuy\u007fPyy\u0013 pIaCJ4#\u0006t!\u0012wtP\u001b";
      f947[53] = "_TTgX\u000b\u0018\u0004\u001c*&\u0011\f\u00149+^\u001f\reU>A\u0010[\u0003\f1X\baU\u0001=DH\u0007\f\u000e$\\rQ\u0001\u00028\u001c\u0014\b\u000e\u001b &M\u001c]T5D\u0015_\n\u0002Z";
      f947[54] = "\u001fS\u0018#\u0010]\u001f]\u00190wՄ\"Y\u0007h\u0017HN\u0004HkH%";
      f947[55] = "\u0003Zl\u000ev\u001f\u0012S0\u001f\u0013\u000f\n]\u000b\u0014r\u0019\u0017V*\u007f*\u0000\u0001[h\u0005.\u001aU\nP";
      f947[56] = "\u0019qG\u0002\u001e\u000f^!\u000fO`\u0019J<,X\u0007\ny!\u001b@`\u001bZ;\u0013_\u0000\u001d\u001d~\u001c?";
      f947[57] = "uY+\"\fp<\u000b+%tgdL)7\u000e\u000buY+\"\fp<\u000b+%t";
      f947[58] = "RFKLxx\fHD\u0012\u0000m\u0004Dj\u001af~\u0004^]=id\u0005\\L\u0007\u0000f\tW]\u001cp3U\u0003!";
      f947[59] = "jf%\u000bgk-6mF\u0019s/\u0017sHth9;\u0014\r'/0,x\u000fyydW/\b$v/;-Vr\"Thi\u000e(}60*Y~\u0012";
      f947[60] = "l],8|W+\rdu\u0002A?\u0010BdnR2l&;?J)\u0000$ei\u001eR";
      f947[61] = "\u0007 t\u000f{\u000e\u00033 \u0010\u0012\f\u00001\u0017\u0014i\u0002\u0007)$*s\u0005\u0001*6\u000e\u0012\n\u0010$2\u0014+]\u0014}1u";
      f947[62] = "-EiZ!W)V=EH_ V9|/f PT\u001ey\u000bzV-Y)C7(mB%P\u007fRiXq\u0001G";
      f947[63] = "8\u0011^\u000f\n\u0007'\u0006Z\fq\u00164\u001fvrJSd\u0007]\u001eH\r2S&IOP=\u0018JK\u0011\u0006ic";
      f947[64] = "=dAxP\u0003cjN&(\u0012a|P4M\u0014K~F,E\u001fz_L4S\u0014\\wO$A\u0002k\u001a\u0015x\u0019DxcR(Q\t\u0006!\u0015tL\u0002j#K\"\u0018y=$\u0016-S\u0015?z@y(Ib}IsN\u0010mdQI\u0017\u0004>+D+OGi}+";
      f947[65] = "_C\u0019\r\u001e;\rV\u0018_a\u001b|s}4\u000f!\t\u0004^P]4\bV";
      f947[66] = "e\u000bY^bT=Z_M\u001aX=\u0010}MjDTTF\u0018+W6\f\u0005O}8";
      f947[67] = "R5\u0014\u0014u<R;\u0015\u0007\u0012̻o?\u000b_r)\u0003bD\\-DV>\u0017\f*>R.C]\u0012";
      f947[68] = "\u0005xfa\u0017YB(.,iK[ -\u0000\u0018XV%W0\u0013\u0018_(3=\u0013_FIh!Q\u0011T+0b\u0006G;";
      f947[69] = "QP\u0011C?TW\u0017TL_OQQ4G2KcL\u0006Z?4\u0007\u0013WB$X\u0005M\u0001\u0016_\r^@\u0000\u001e%\tD\u0014Q&";
      f947[70] = "~\u0015?ufL&D9f\u001eF\"\u0005!\u000b/PtE-eu\u001d\u007f\n]";
      f947[71] = "QaD\u0014y/\u0004=\u0010hϨ_\nbA\nb#R<\u001a\u0002\u0018fWlAPbbM8\u0010h";
      f947[72] = "\u00012b\t\u0013>Fb*Dm\"X~(Y( An?4Vy\u0002g(XT'T3S\u000fSz[x?\r\r,\u000f\u0003jV\u0000-\u0007ynLT|?";
      f947[73] = "~ykm4V~zl=NGb~ke4NSxjk4?\u007fqca,@#/s2N";
      f947[74] = "\u0004}\u001b\u0002\u001d$Vh\u001aPb\n-_\u007f|'@\u0004}\u001b\u0002\u001d$Vh\u001aP";
      f947[75] = "\u007fa8V\u0014OnhdGqI{k\u007f\\\u0016HZmt'J\f-n\u007fKHR{:\u0004\u001cO\u000ftqh\u001e\u0011Y \n?\u0019LVkf=G\u001a\u0002\u00101:\u001a\u0015I|3dLA2)hiMIH-r=\u001cq";
      f947[76] = ":LR<J\u00062H\u0011lt\n8YM5t\u00007\u0007@+\n\u0019*SSS\u0015\tj\bHi\u000b\u000b(\b,j\u0016\r?\u000eVn\fYn6";
      f947[77] = "\u0004b%\u0010oKVw$B\u0010s-D\u001dGn\u0017Scy\u0015{\u0016\u0001";
      f947[78] = "Xts\n\u0014UUti\u0000d\u001dTnxd\u0004\u0007\u0002ym\u001a\u001d\u001aVj\u0015";
      f947[79] = "\u0017w\no_[Eb\u000b= e8Fr\n Q\u00071\u000b)D\u0003\u00120Y";
      f947[80] = "hR\u0012n.k?VKmO6`T\u0007T3?{F\u0007r5R1K\u001cwu4hD\u0005oO>~L\u0000x269N\n\u0015";
      f947[81] = "(j\u0010\u0004s$vd\u001fZ\u000b?hY\u001eXn3uh:Ru3iy\u001655o\")\u0004Lr?jdz\u000e5cwo\u0016\fk5#\u0014A\u000b6:hxCU`n\u0013+\u0007\r:1qsDZl^";
      f947[82] = "K\"rk-F\fr:&SP\u0018o\u0003;2P\u0015oCmm\u0002\u0011h/o3TE\u0013";
      f947[83] = "w<\u0006LQK)2\t\u0012)^!>\"\u0007@T!\u001a\u0005\u0011EP*-l\u0013W\tu=\bAB\b'B\\\u0019NSv$\u0005\u0016WKL";
      f947[84] = "\u0016o\u0019LY\u001aC3M0X\u0003\u0014c\u0012]b\u0007\u0014c\u001bJs\r\u0014s\u001bVDj\u0013}\u000eMC\u0000\fj\nN8QL2\u0012KTS\u0012dF0\u0003TOk\r\\\u0001\n\u0019?v]E\u0011\u0017o\u0016[\u0002T\u0018\u000fORU\u0000JuKH\u0001Qr";
      f947[85] = "\u007fQ\u001dx\u001e.*\rI\u0004Ӊ^$R\u0018f\u0005\"|\fCn\u007f";
      f947[86] = "\u001cNgT<\u0007\u0017Z3\u0017A\u000b\u0011[8V:`\u0010Y:M;\t\u0010Z=\u001dA";
      f947[87] = "HeHC|\"V5]O\u00064GvvX`'pg^Sk!Gp8^od\u0014n\u0002@m&\u0014\n";
      f947[88] = "L5@,-zCeX!G.NwSV)ELhY!9y\u00103M)G \u0013m\u001f{x/Cu\u0012\u0011";
      f947[89] = "\u0002z\u0014D\u0013{E*\\\tmg[6^\u0014&f] F\u0014\u0001\u0002\u0007u\u0018\u001d\u0016n\u0005+NIm9\u0002vA\u0002\u0001;\\ \u0015y]f[)\u001f\u001f\u0004iB1%F\u0010:\r$G\u001eSm[K";
      f947[90] = "\u001aa,593Meu6Xk\u000fq?'$m\t\u001ct.:t\u000bp,\u007f<gs";
      f947[91] = "6\u001f'vc\u0000h\u0011((\u001b\u001fj\u001f \n\u007f\u0017h\f+;G\u001dQ\u00065G%K<\\3>b\u001bt\u0011M~y\u0017gY7zcC6a";
      f947[92] = "M`\u001b\u0013rN\u0011>\u000b@\u0010^Gr(\u0017tLG\u000e\u000e\u0011qIRuGCqN*";
      f947[93] = "\u0019VM\u001ehz^\u0006\u0005S\u0016b\\'\u001dOznAgC^.2H\u0005\u001b\u001dyd'";
      f947[94] = "\u0010\u0000mDsu\u001eG\u007fS\u001c\"\u0015P\u001f\f~\"\u0019\u0004e\bdvH<";
      f947[95] = "`\u000bvTKy'[>\u00195{3F\t\u000e^}%W+i\n}f\u000b(\u000bR>1]GPWm4\u0002=TM9e:";
      f947[96] = "fi7[#Fy~3XXWjg\u001e&c\u0012:\u007f4JaLl+O\u001df\u0011c`#\u001f8G7\u001b";
      f947[97] = "TZL\u0003\u000b{\u0013\n\u0004Nuc\u0011%\u001aU\by\u0007\u0007}\u0001\b:[\u0004\u001fYKm\rk";
      f947[98] = "\u0003i~\u0000Mv\r.l\u0017\"-\u001b\u001fq\u0010F \u00013cq\u001d1Xdc\u0013Er\u000f2\f";
      f947[99] = "~<\u0005\u000fRb 2\nQ*b($\u0003SPG$$\u0003YU\u0018{s^\u0003Ta<#\u0016N*s$$\u0001N\u001a~$>\u000b>\u0011&x&\u0014R\u0013x.ro\u0005\u0014%!9\u0003\u0007JsuBV\\Gr}8RF\u0013#E";
      f947[100] = ">o!L<> ?4@F(1|\u000b] +1z<JF(&~>\u000e  \"=n0";
   }
}
