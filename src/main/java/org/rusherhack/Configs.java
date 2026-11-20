package org.rusherhack;

import java.io.File;
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
public class Configs extends ResizeableWindow {
   public TabbedView f5159;
   public static Configs f5160;
   public ListView$Column f5161;
   public ListView<HudItem553> f5162;
   public ArrayList<HudItem553> f5163;
   public static long f5164 = Class066.m4320(-7274000079228640612L, -7581957258482102079L, MethodHandles.lookup().lookupClass()).m4325(199787363868259L);
   public static String[] f5165;
   public static String[] f5166;
   public static long[] f5168;
   public static Integer[] f5169;
   public static Map f5170;
   public static Object[] f5171 = new Object[81];
   public static String[] f5172 = new String[81];

   public Configs() {
    }

   @Subscribe
   public void m10473(Class263 var1) {
      this.m10475();
   }

   @Override
   public WindowView getRootView() {
      return this.f5159;
   }

   public void m10475() {
      Configs var4 = this;
      int var10000 = Class253.m9154();
      this.f5163.clear();
      int var3 = var10000;
      Iterator var6;
      Iterator var7 = var6 = Class170.f3364.m7107().m14148().iterator();

      while (true) {
         if (!var7.hasNext()) {
            var4.f5162.resort();
            break;
         }

         File var5 = (File)var6.next();
         if (var3 != 0) {
            break;
         }

         var7 = var6;
         var4.f5163.add(new HudItem553(var4, var4, var5));
      }
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
      f5171[0] = "tnAka\u0003htC7{\u0017xw\bȩ";
      f5171[1] = "3\u001bW\u001du@/\u0001UAoT?\u0002\u001ePk\\9\u0007D\u001dfE5GEZ)B5\u0007T\\p\u001b*\u0000UD)a=\u000bRVcc5\fG";
      f5171[2] = "\u0019-\u0010\u001b#U\u0007%\nTLR\u0001-\u001f6dS\u0007";
      f5171[3] = "~y 8m\u0012`q:w\u000f\u000egl";
      f5171[4] = "\u001d,[\t-&\u0016#JFL(\u001d(N\u001c";
      f5171[5] = boolean.class;
      f5172[5] = "java/lang/Boolean";
      f5171[6] = "fG9F7\fz];\u001a-\u0018j^pă";
      f5171[7] = "t9\u0002jB~h#\u00006Xjx K'_y~e\t+Wlr%\u0002j|d|,\u00006";
      f5171[8] = "-c :/\\1y\"f5H!ziհ";
      f5171[9] = "{K8\u0010\rmpD)_pucC \u0016";
      f5171[10] = ",[\u0001f/80A\u0003:5, BH+2?&\u0007\n':**G\u0001f\u0014\u0001,N";
      f5171[11] = "B6+L!f7\u0016 C0)V\u0018+H4s\"";
      f5171[12] = void.class;
      f5172[12] = "java/lang/Void";
      f5171[13] = "'J\u0012bX\u0010;P\u0010>B\u0004+S[/F\f-V\u0001bK\u0015!\u0016\u0013)K\u0011=J\u0010b]\f&\\\u001a;\u00047-K\u001c6O\u0004*T\u0010\u001bC\u000b,W\u0002";
      f5171[14] = double.class;
      f5172[14] = "java/lang/Double";
      f5171[15] = "\u001e\u000b9\u0019/]\u0002\u0011;E5I\u0012\u0012pT2Z\u0014W;A8F\u0005W\u001bA8F\u0005;+D";
      f5171[16] = "6U#Z,Y*O!\u00066M:Lj\u00172E<I0Z?\\0\t\"\u0011?X,U!Z)E7C+\u0003p{0I \u001b)";
      f5171[17] = "*\u0007lN/\u007f6\u001dn\u00125k&\u001e%\u00031c \u001b\u007fN<z,[y\u00053n \u0007%\u0007/k5\u001db\u0003sC\u0002\u0007j\u00105c&";
      f5171[18] = "a4e&79}.gz--m-,k)%k(v&$<ghwak;g(fg2bx/g\u007fk\u0000g5v^,)y";
      f5171[19] = "\u0002u\u0013!&c\u001c}\tnnc\u0006w\u0011)gxFW\n.{c\u0005q\u0017";
      f5171[20] = "\u0012(u'y,\u000e2w{c8\u001e1<jg0\u00184f'j)\u0014tg`%.\u00144vf|w\u001e5|}n7\ttQff;\u0012\u0019}g\u007f<\u0013.";
      f5171[21] = ":dp3k,&~roq86}9~u00xc3x)<8bt7.<xsrnw6yyi|7!8@tw=:aTrw-0xc";
      f5171[22] = "+k\u001e[MB7q\u001c\u0007WV'rW\u0016S^!w\r[^G-7\f\u001c\u0011@-w\u001d\u001aH\u0019'v\u0017\u0001ZY07:\u001aRU+Z\u0016\u001bKR*m]4QT,v\u000b&VS!";
      f5171[23] = "OXh\u000e\u001d\"SBjR\u00076CA!C\u0003>ED{\u000e\u000e'I\u0004zIA IDkO\u0018yCEaT\n9T\u0004lO\u0002'ODjN\u001byb_{T\u00009cEbP\u00009ED{";
      f5171[24] = "E0V@w|[8L\u000f?|A2TH6g\u0001\u0001RD=`L0TD";
      f5171[25] = "-'\"u\u0006~1= )\u001cj!>k8\u001by'{0/\u001dg1{\u0016/\u0006b,2\u0010/\u001dg1";
      f5171[26] = "&[j&\ny:Ahz\u0010m*B#k\u0014e,Gy&\u0019| \u0007xaV{ Gig\u000f\"?@h\u007fV@ Zy^\u0011i>\rNg\u0014y$G";
      f5171[27] = "\u0001{\u0013mPY\u001da\u00111JM\rbZɅ";
      f5171[28] = int.class;
      f5172[28] = "java/lang/Integer";
      f5171[29] = "}vkA\u001b ali\u001d\u00014qo\"\f\u0005<wjxA\b%{*y\u0006G\"{jh\u0000\u001e{qkb\u001b\f;f*@\u0006\u001a![pi\u0002*:|pi\u0001\u001d";
      f5171[30] = "Q\u0014:2\u0002\u001fM\u000e8n\u0018\u000b]\rsԑ";
      f5171[31] = "qD)N\u001b!m^+\u0012\u00015}]`Ȕ";
      f5171[32] = "]Eb#m\u0007A_`\u007fw\u0013Q\\+ns\u001bWYq#~\u0002[\u0019Wxl\u001aWEMl|\u0019sgL";
      f5171[33] = "\u001cp4 0]\u0000j6|*I\u0010i}m.A\u0016l' #X\u001a, w1\\\u0016o}G\u0015A\u001df<y\u000fI\u001dc4k0";
      f5171[34] = "y-\u0019{Rfe7\u001b'Hru4P6Lzs1\n{Ac\u007fq\u00180Agc-\u001b{Wzx;\u0011\"\u000eCy/\u000b%wzx;\u0011\"";
      f5171[35] = "\n4\u0011R\u00171\u000f{!ZU=";
      f5171[36] = "5y.Om2+q4\u0000\n3:j9Z,5";
      f5171[37] = "]-u$\u001bOA7wx\u0001[Q4<Ч";
      f5171[38] = "\u000ex\u000f?IK\u0014?Sw0F\u001b2\u0015N\nQ\u0018sV-\u000b\u001b\u0004%i";
      f5171[39] = " \u0018W[O@}D[f\u0530z{XM\u0017L\u0005r\u0018I\u001c";
      f5171[40] = "\u007flk=vz~\"q\"Ik)<\u0015~8ltov\u007frp\"P.:4i<lq>qkE";
      f5171[41] = "8\ntSO2v\rp\u001424\u0004]eUO#y\fzM\r";
      f5171[42] = "1m\n\u001eHm>6J\\9ӏ\u000fi\\\u001bBxllI\u0002\u0006\u00161>I\u001cWu4+PX9";
      f5171[43] = "\u001c*\u000b7qaR-\u000fp\fԖ 8]%e~\u00113\u001a0j\f";
      f5171[44] = ">\u001e~a%Z?Pd~\u001aEj\":it\u0013;A;#hE\u0004\u0018qv+\u001dg\u0019;j}\">Sn)%A?\u0019r\u007f\u001a\u00188\\y'b\u0019vFf\u0018";
      f5171[45] = "._\u001a\u0011vX \u0005IC\u0006ՕLW\u0015A9\u000euL\u0001\u0016z5";
      f5171[46] = "c+@YPwmq\u0013\u000b Ƀ\u0001#O\t\u001f!88[^\\\u001a";
      f5171[47] = ">\u00120<\u001f\u0005p\u00154{bϖ\u0002E5-\u001d\u0015o\u000b2)Z";
      f5171[48] = "|5)\u0010Z`og=\u00145c{x\u0004\u001eR~\u0016o*\u0010Ygsh9\u0011G\u0018&v{KHt-a+\u00045";
      f5171[49] = "\u000eK!\u0015T<ZJ`@$<\bKySXFUB \u0017Y*^UpX$";
      f5171[50] = "|0H\u0005\nZ{gW@aʢ\u0018j[\u001c\u0001I$sSI^";
      f5171[51] = "\u0012u#.\\aO)/\u0013Æ[\u001b?`/P!O>!z";
      f5171[52] = "WTO=hS\u0003\fWz\u0018ZVQ`&~OW[WAuO\u0002Y[~v\\TG+/rLA\r\u0016}&RV=\u001b3&\rGQ\u0010$vB:";
      f5171[53] = "i\u0000\u00111]&nW\u000et6Е\r\u0006\u00130]41Y\u0017u_M";
      f5171[54] = "\u0007\u0006V\u001b\u0004r\u000b\u000eD\u0017d\u007f\u000f\u0016jJ\u0002|\u0005\u0015pB\u0002y\r\u0007O+\u0002!\u0007QDO\u0001oS\u000e5";
      f5171[55] = "\u001d\"*W4[Ov4@\u0004<2\u0007\u0015p\u0004\b\u00197.\u001c9ZM)9";
      f5171[56] = "dO*cJom\u000f.h5{9S%h5 /\u0000roY+8P=\u0012";
      f5171[57] = "0\u0005_,`F;BJ#\u0012\fI\u0003[9i\u0019*\u0006N -wrCO.kK-G\n,\u0012G;\u0003\f8~L,SCE";
      f5171[58] = "i&.R\rWie>PjF\tg6V\u0011\u0004jb#OUj70#Q\u0004\t2%:\u0015j";
      f5171[59] = "\u0011Od\u0018\u0016\u001c\u0016\u0018{]}ӅuLq\u0018\u0006\u0019\u0016Id\u0001Bw";
      f5171[60] = "6?\u0013Gv\nb>R\u0012\u0006\u00191(g\u001cb\r8\",Eo\f&*O@z\u0015bDMK=\u001b$~\u0010\u0001kO]";
      f5171[61] = "4\u000fuz5T7A!%DH5Fm9\u001bQ4Rw>DV)\u000fs:&WoQ{AtBl\u0000m-\u007fU<O\u0010";
      f5171[62] = "\u00187?\f\tkV0;KtӜ$5/MO<A36\u0003K";
      f5171[63] = "MQjY=B\u0010\rfd/xK\u0002x\t!\u0019@Xg\u001bA\u001cM\u000e{\u0004 \u0017\u0017\u0011id";
      f5171[64] = ",9}\u000e\u001e\b\"ps\b{\u0000ix~L{Sz~bX\u0018Vog&6KRqlaDE\u0000)l\u0019\u0006\tS-\u007fu\r\u001e\u0003b\u0002";
      f5171[65] = "*n}\u0003'\nx:t\u001c\u001e\bv)\t\u001fx3v4#\u001ebsrd4\fq\u0001r+tE\u001eCikr\u0003rH~;=~";
      f5171[66] = "Op&J&WIihN\u001cI[dc\u001afSLc\u0018Km\\\u00171{J'@A\u000e(\u0003\"\f[b#\u0014rC&";
      f5171[67] = "@9\u001f9F\u0019\u00148^l6\fF>{hR\u000e@>Miw\u001fF' f\u0006\u001fA#]jY[\u0011B";
      f5171[68] = "\u001d9)E^zI8h\u0010.{\u001b>Z\u0014Jm\n/]\u0010Jd\u001c+}\u001a.l\u0013>q\u0015T:\u001b'fy\u001erH|k\u0015\u0015e\u00183\u0016";
      f5171[69] = " w\u001d\"B\u0014}+\u0011\u001fØ.r4_!CBy#\u000fn>";
      f5171[70] = "\u0016~/6f!\u001f>+=\u00197CcI}h0\u001e0*|\",H\u000fr9d5V3-=!7/";
      f5171[71] = "\u0019\u00070\u001a\u001fq\u0018I*\u0005 h_V4\n\\nY;6YFxZP,\u001e\u001a0#";
      f5171[72] = "\u0003\u000eq\u001dZ2QZx\u0002c0_I\u0005\u0001\u0005\u0014SY<\u0000c\"\u0003M2\u000f\u0011\"L\r{`S9\f\u000b=\fX.\\D@";
      f5171[73] = "}[L!Dp,XMh.q\u007f\u001ez#Ifs\tK%I\n}\u0013K\"C5)\u0018\u001e<$:`\\\u001c$H1w\fSY";
      f5171[74] = "8ycnO\b!q617X2rkrZ4dh{eN\b;l>g7";
      f5171[75] = "21\u001f\u0001WHom\u0013<ƭr21\u001f\u0001WHom\u0013";
      f5171[76] = "mC\u0013#fJw\u0004Ok\u001fA|\u00023?o]\u0015B\u000b/tX)\u001d\u000fjv!";
      f5171[77] = "\nq\u0003\u0013\u0006eW-\u000f.щ_Q*\u000e\u0013\u0007 \u0007*\u0012N";
      f5171[78] = "(s\u0016(Q6;!\u0002,>5/>:,R\"/$zv@3);F)Dv+BJ?\u0000p?.A(P?B";
      f5171[79] = "Kk)%+rHx\u007f;[\"KkZ&=1Kgm\u00046+[\u0017+}%4\u0019o*3?+&";
      f5171[80] = "JWy>91A\u0010l1KȰ3U()2?KTf3-\u0000";
   }
}
