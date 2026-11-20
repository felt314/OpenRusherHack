package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.hud.HudElement$SnapPoint;
import org.rusherhack.client.api.feature.hud.TextHudElement;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;

public class FPS extends TextHudElement {
   public BooleanSetting updatesTheFpsCounterAtAFasterRate;
   public int f3109;
   public static long f3110;
   public LinkedList<Long> f3111;
   public static long f3112 = Class066.m4320(-846466447169995648L, -8941863511835475207L, MethodHandles.lookup().lookupClass()).m4325(81744719875113L);
   public static String[] f3113;
   public static String[] f3114;
   public static Object[] f3116 = new Object[54];
   public static String[] f3117 = new String[54];

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      if ((Boolean)this.updatesTheFpsCounterAtAFasterRate.getValue()) {
         this.m6636();
      }
   }

   public void m6636() {
      int var10000 = Class253.m9154();
      long var4 = System.nanoTime();
      int var3 = var10000;
      FPS var8 = this;
      this.f3111.add(var4);

      while (true) {
         long var6 = var8.f3111.getFirst();
         if (var4 - var6 > f3110) {
            var8 = this;
            this.f3111.remove();
            if (var3 == 0) {
               continue;
            }
            break;
         }

         var8 = this;
         break;
      }

      var8.f3109 = var8.f3111.size();
   }

   static {
    }

   @Override
   public String getText() {
      return String.valueOf(this.updatesTheFpsCounterAtAFasterRate.getValue() ? this.f3109 : Globals.mc.getCurrentFps());
   }

   public FPS() {
    }
   public static String m221(byte[] var0) {
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
   public static void m273() {
      f3116[0] = "dFZe\u0017\u0010x\\X9\r\u0004h_\u0013ă";
      f3116[1] = "\f\u0016l\u0006Xf\u0010\fnZBr\u0000\u000f%KEa\u0006JxM^g\n\nl\u0006h|\f\bnID@\u0006\u0010\u007fADt";
      f3116[2] = int.class;
      f3117[2] = "java/lang/Integer";
      f3116[3] = "\u007f\u0000)uL'c\u001a+)V3s\u0019`ɝ";
      f3116[4] = "@>:_R3K1+\u0010/+X6\"Y";
      f3116[5] = "\u0005IC\u007f\u001aY\u000eFR0vZ\u0000DP\u007fZ";
      f3116[6] = boolean.class;
      f3117[6] = "java/lang/Boolean";
      f3116[7] = "\u0013HC\u0015nr\u0013HTIb}\t\u0003TWbh\u000er\u0004\n3";
      f3116[8] = "7.s`\u000b\n+4q<\u0011\u001e;7:-\u0015\u0016=2``\u0018\u000f1rS\"\u0016\u001d90g";
      f3116[9] = "4xS8h\u0015(bQdr\u00018a\u001aɢ";
      f3116[10] = ")\u000f\u0005Q+\u00065\u0015\u0007\r1\u0012%\u0016L\u001c6\u0001#S\u0011\u001a-\u0007/\u0013\u0005Q\n\u00162\t\u000b\u0011>";
      f3116[11] = "cN1\u0001J,hA N+\"cJ$\u0014";
      f3116[12] = "\u0018Y0d\u001ef\u0013V!+|e\u001c_";
      f3116[13] = long.class;
      f3117[13] = "java/lang/Long";
      f3116[14] = "\u0004yAWE3\u001aq[\u0018'/\u0000sRR'/\u001dl";
      f3116[15] = "9V%qxU2Y4>\u0005@ C6}";
      f3116[16] = void.class;
      f3117[16] = "java/lang/Void";
      f3116[17] = "=\t/u\u0012b#\u00015:_x9\u000b,fNr9\u001cw@Uz2=7}H";
      f3116[18] = "2\bR\u0019*v.\u0012PE0b>\u0011\u001bǺ";
      f3116[19] = "Mc\u0000\b~xQy\u0002TdlAzIE`dG\u007f\u0013\bm}K?\u0012ReaQ?\bDfhAe\u0014\b_nP~\u000bJnlP";
      f3116[20] = "5\u0014\n\\>\u0005)\u000e\b\u0000$\u00119\rC\u0011#\u0002?H\u000b\u0017-\u0004/\u0014\b\\\u00056?\u0007\u0019\u0007>\u0015\u0019\t\u0003\u0014%\u0017/\u0014\f\u0010 \u0015";
      f3116[21] = "\f#3\u0001(+%\u001a/\u001b*w?\u000e?\u0018af8\u001d9]<`#\u001b5\u001d(+\u0004\n(\u0007&k0T";
      f3116[22] = "gdO+3#{~Mw)7k}\u0006f-?mx\\+ &a8N` \"}dM+)#l8`p%\u0013dsE`/\"";
      f3116[23] = "\u0014DfC[1\b^d\u001fA%\u0018]/\u000eE-\u001eXuCH4\u0012\u0018g\bH0\u000eDdCA1\u001f\u0018I\u0018M\u0001\u0017Sl\bG0_eo\fY\u0014\u0014_o\u0019";
      f3116[24] = "\u0018kW\u0007(fS`\u0014\nO|Jo\u0017\u000b\bl#7\n\u00183}\u001azSZp\u0002\u0018kW\u0007(fS`\u0014\nO";
      f3116[25] = ";YYG,QoJBECDlBUu*DvI:\u001azK7A\u0002N?Pi$";
      f3116[26] = "=`q&N\fndp9rԕ\u0007=|a\u0003E9em&Hu";
      f3116[27] = "gYA\u0017Xo4]@\bdɏ]\u0004LP\u0015&c\\]\u0017^\u0016";
      f3116[28] = "}k\u001f\u0000\u0017!:f\u0013\nv$/2S\u000414Fo_Q\u0007jx7N\u0016LZ}k\u001f\u0000\u0017!:f\u0013\nv";
      f3116[29] = "n\\~u \u00015@ps\u0010\u000b2A~0}qo\u001d$ hK>]r<\u0010";
      f3116[30] = "\\ _ErcT9U\u001f\u001610`\u0007\u0014\u007f|K'\n\u0018u\u001d\u000bf\u000bLwfLk\u0007F\u0016";
      f3116[31] = "v\u0004\"{>\t|\u001e/\u0005\u00adf|\\1~3\u0001.\u001d.aX";
      f3116[32] = "3\bY\u00195 w\n\u0017[T4b\u0004GD8\u00063G\u001a\u0012eQ6\t\u001fRdon\u0018X\u0019T";
      f3116[33] = "Q6y\u0011\u00141\u0001`yJp7Q7tR\f F\u0003xU\f,Z7n)\u001eu[h.R\u0002&\u0000f\u0015CO.G3r\u0011\u000e1XX";
      f3116[34] = "R?\u0019&\u000fk\u00062\u0007t43R&\u001aJU0V@L/_i^x\u0018jD7;";
      f3116[35] = "G\u0015-j )S\u0013/*A0D\u0005\u00064(3q\u001e<4=KFD/>?p\u0014\u0003&=A!\u0016\u001a&9&sW\u00059R";
      f3116[36] = "eKK|=0oQF\u00022_;V\u0007k1\";B\u0004c[a\u007f\u0010Rh&ak\u0013Z\u0002";
      f3116[37] = "xc\u0015M~(le\u0017\r\u001f1{s)\u0018d!ln\u001d\t~-p\u000f^H.#wt\u0019E\")\u0016eZ\u0016d!q7\u001b\t{J";
      f3116[38] = "\u0010\u0013\u00137hf\u0004\u0015\u0011w\t\u007f\u0013\u0003?hfk\u001a\u0012\u000f\u000f5d\u0000\u0003\u001c6x=B@ce6g\u0005\u0014\u00047wx\u001a\u007f";
      f3116[39] = "1 W[<>4?\u0014\u001d\u0007/c<1Hc=c@_\u0018:.vz\u000eXl2\u000e";
      f3116[40] = "\u00123X(\u0003sI/V.3xB9R\u0013\nr\u001b:\u000f-Rc\\q?";
      f3116[41] = "4q$\u0013Mf.~'\u00121T\u0012V\u001bn}T_v0P\ns6l?S\u000b";
      f3116[42] = "=&fz\u0016\u007f8|m&yƵQ'4+\u0010!*`9'\u001a@j!8s\u0018;-,4yy";
      f3116[43] = ",Q[O\"Q&KV1Ț>u]A]=\u0001=XRW";
      f3116[44] = "(_Y\u0000Po\"ET~Ź\u0000qI\u0011\u000f\u0006>)XVD";
      f3116[45] = "?tiP=\bdhgV\r\u0011b`\u000e[4E`t4\nt\u0013|\f2\u000bs\u0004q5\u007fR1G\u000e";
      f3116[46] = "z)\u0015mc\u0006p3\u0018\u0013ʖi+w\u000e/`Q\u007f2\u0015q";
      f3116[47] = "A\"\u0016}]V[-\u0015|!CM\b\u0007 FD*\u007fW-\u001dZ\u0012+\u00126C?\u001bw\u0005zD\u0007O2\u001e$!";
      f3116[48] = "\ta\u001esq\u0017R}\u0010uA\bUe7);\u001cD\u0019Iq|\t@#\u00181*\u00158";
      f3116[49] = "\u0017\"\bCd&\\)KN\u0003(K%QOj.r+Q_nB\u0010\"K^|{]{\t\u001d\u0003";
      f3116[50] = "qAid\u0001\u0011(G4le\u000f';hn\u001bP-J,lU\u0012";
      f3116[51] = ";L\u0002u*\u001co_\u0019wE\u0013bU\u001ct\u0002\u0003\u000b\u0000Xry\b3T\u001di'm;L\u0002u*\u001co_\u0019wE";
      f3116[52] = "PKMt\u00045ZQ@\nŒZ\u0001TZ1R*ZHT7";
      f3116[53] = "d\u0015\u0013O4f6R\u001aLJ\u0001Lp6g\u0007\u0013W(\u000e\u001e81u\u0013\\Y12";
   }
}
