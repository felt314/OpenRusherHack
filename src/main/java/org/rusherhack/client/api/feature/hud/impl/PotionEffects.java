package org.rusherhack.client.api.feature.hud.impl;
import org.rusherhack.*;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.HudElement$Alignment;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement$ListItem;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class PotionEffects extends ListHudElement {
   public BooleanSetting icons;
   public ColorSetting f9257;
   public BooleanSetting parentheses;
   public BooleanSetting duration;
   public static long f9260 = Class066.m4320(7371206191122601912L, -4540714100443410649L, MethodHandles.lookup().lookupClass()).m4325(103211294756604L);
   public static String[] f9261;
   public static String[] f9262;
   public static Map f9263 = new HashMap(13);
   public static long[] f9264;
   public static Integer[] f9265;
   public static Map f9266;
   public static Object[] f9267 = new Object[98];
   public static String[] f9268 = new String[98];
   @Override
   public void postRender(RenderContext var1, double var2, double var4) {
        
    }

   public PotionEffects() {
        super("PotionEffects");
      long var1 = f9260 ^ 61272053075090L;

      int var10009 = 1;
      this.icons = new BooleanSetting("Icons", true);
      boolean var10008 = true;
      this.duration = new BooleanSetting("Duration", true);
      int var10007 = 1;
      this.parentheses = new BooleanSetting("Parentheses", true);
      var10007 = 255;
      var10009 = 255;
      this.f9257 = new PotionEffectsColor(this, "Color", new Color(var10009, var10007, var10009)).setVisibility(() -> {
         long var0 = f9260 ^ 122715311745073L;
         if (!RusherHackAPI.getHudManager().isThemeColorSynced()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }).setAlphaAllowed(false);
      super.colorMode.setVisibility(() -> {
         boolean var10002 = true;
         return true;
      });
      BooleanSetting var10000 = this.duration;
      Setting[] var10001 = new Setting[]{this.parentheses, null};
      boolean var10005 = true;
      var10001[1] = this.f9257;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.icons, null};
      var10005 = true;
      var10001[1] = this.duration;
      this.registerSettings(var10001);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void tick() {
        
    }

   static {
    }

   public static Class316 m116(Class316 var0) {
      return var0;
   }

   public static String m221(byte[] var0) {
      int var1 = 0;
      int var2 = var0.length;
      char[] var3 = new char[var2];

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
            char var12 = (char)((char)(var5 & 15) << 12);
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   public static Object m173(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
        return null;
    }

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(PotionEffects.class, "m173", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Յ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m5165(int var0, long var1) {
        return 0;
    }

   public static int m5166(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m5165(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(PotionEffects.class, "m5166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Յ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m272(long var0, long var2) {
        return 0;
    }

   public static void m273() {
      f9267[0] = "q\u007f+<Nxq\u007f<`Bwk4<~BblEn \u001a\"";
      f9267[1] = int.class;
      f9268[1] = "java/lang/Integer";
      f9267[2] = "\u0015I0y|\\\u0015I'%pS\u000f\u0002';pF\bsqe%\u0001";
      f9267[3] = "\u0012:et_@\u0012:r(SO\bqr6SZ\u000f\u0000#o\u0004\u0018";
      f9267[4] = "[0\\09,G*^l#8W)\u0015Ș";
      f9267[5] = "2\u001f\u0010J,Q9\u0010\u0001\u0005QI*\u0017\bL";
      f9267[6] = "W)g/Z\u0017W)psV\u0018MbpmV\rJ\u0013&3\u0002N";
      f9267[7] = "q=Q\u001cB-q=F@N\"kvF^N7l\u0007\u0013\n\u0017t";
      f9267[8] = "B Z@\b8I/K\u000fi6B$OU";
      f9267[9] = "!\rby\u0007s=\u0017`%\u001dg-\u0014+Ԓ";
      f9267[10] = "!1}\u001eN\u0016=+\u007fBT\u0002-(4Ʉ";
      f9267[11] = "4I\tr\u0016\u001f4I\u001e.\u001a\u0010.\u0002\u001e0\u001a\u0005)sLnBG";
      f9267[12] = "\u0014x*D()\np0\u000bO(\u001bk=Qi.";
      f9267[13] = "}W\u0013\u001ap\u0007aM\u0011Fj\u0013qNZʕ";
      f9267[14] = "\u00049\u001b'\u0010_\u00049\f{\u001cP\u001er\fe\u001cE\u0019\u0003X=K";
      f9267[15] = "\u0002lr\u001b$n\u001cdhTIt\u0004aa\u0019~r\u0007c";
      f9267[16] = "ut\u0012C_mk|\b\f=qla";
      f9267[17] = "agPx/a}}R.5um~\u001951}k{Cx<dg;Q3<`{gRx5aj;{?.`F`S\u00131qcpY\"";
      f9267[18] = "3\r\u0004i\u000b\u0012/\u0017\u00065\u0011\u0006?\u0014M$\u0015\u000e9\u0011\u0017i\u0018\u00175Q\u0005\"\u0018\u0013)\r\u0006i\u0011\u00128Q/.\n\u0013\u0014\n\u0007\u0002\u0015\u00021\u001a\r3]+5\f\u0017\u000e\r\u00021";
      f9267[19] = void.class;
      f9268[19] = "java/lang/Void";
      f9267[20] = "O\u0002>\u000ez\u000eS\u0018<R`\u001aC\u001bwCd\u0012E\u001e-\u000ei\u000bI^\u001eLg\u0019A\u001c*";
      f9267[21] = "B\u0016w~\u0011(B\u0016`\"\u001d'X]`<\u001d2_,0aL";
      f9267[22] = boolean.class;
      f9268[22] = "java/lang/Boolean";
      f9267[23] = "!\u001aX;\u0012\t=\u0000Zg\b\u001d-\u0003\u0011հ";
      f9267[24] = "rC\u0010-Q^nY\u0012qKJ~ZY`LYx\u001f\u0004fW_t_\u0010-aDr]\u0012bMxxE\u0003jML";
      f9267[25] = "\fi\u0018\u0007l2\u0007f\tH\u00001\td\u000b\u0007,";
      f9267[26] = "%9R?^/9#PcD;) \u001brC(/eFtX.#%R?\u007f?>?\\\u007fK";
      f9267[27] = "(_/u\u0007\t\u0001f3o\u0005U\u001br#lND\u001ca%)\u0013B\u0007g)i\u0007\t v4s\tI\u0014(";
      f9267[28] = "{4Z\u0003R\fg.X_H\u0018w-\u0013NO\u000bqhNHT\r}(Z\u0003e\u0017a+nHT\r}(Z";
      f9267[29] = "7:T8o&)2Nw'&38V0.=s\u0019M6-6<5q,1#12G+";
      f9267[30] = "E\u001b\u0014$QfY\u0001\u0016xKrI\u0002]iOzO\u0007\u0007$BcCG\u0000oWgC\u0007\u0014$`|F\u0006\u0001YFg^\u0000\u001dm";
      f9267[31] = ".$DDNr2>F\u0018Tf\"=\r\tSu$xE\u000f]s4$FDuA.7W\u001fNb\u00029M\fU`4$B\bPb";
      f9267[32] = "{\u0010<\u001d\u001b\u0011R) \u0007\u0019MH=0\u0004R\\O.6A\u000fZT(:\u0001\u001b\u0011s9'\u001b\u0015QGg";
      f9267[33] = ":jk\u000b\u0004s&piW\u001eg6s\"F\u0019t06oJ\u001bk4vh\u000b\u0013~6}|Q\u001fi;k\"a\u001fu%yxF\u001eC-{iU\u0002o:v";
      f9267[34] = "\u0001h\u007f9\\k\u001dr}eF\u007f\rq6tBw\u000btl9On\u00074Jb]v\u000bhPvMu/JQ";
      f9267[35] = "X\u001a5$\u0005\u0016D\u00007x\u001f\u0002T\u0003|i\u001b\nR\u0006&$\u0016\u0013^F!s\u0004\u0017R\u0005|C?\u0016S%3d\u0016\u0004R\u001a";
      f9267[36] = "2Z:52!2Z-i>.(\u0011-w>;/`z.g\u007f";
      f9267[37] = "2jIgu!.pK;o5>s\u0000*k=8vZgf$46H,f (jKgo!96f<c\u00111}C,i ";
      f9267[38] = "\u0017%MC\u001a8\u000b?O\u001f\u0000,\u001b<\u0004\u000e\u0004$\u001d9^C\t=\u0011yL\b\t9\r%OC\u00008\u001cyb\u0018\f\b\u00142G\b\u00069\\\u0016F\u0004\u000f#\u00152D\u0019";
      f9267[39] = "\u001b<h4db\u0007&jh~v\u0017%!ɱ";
      f9267[40] = "xYaA`~xYv\u001dlqb\u0012v\u0003ldec$_8/";
      f9267[41] = "\u001e|\u0019sRG\u001e|\u000e/^H\u00047\u000e1^]\u0003FYm\b\u001a";
      f9267[42] = float.class;
      f9268[42] = "java/lang/Float";
      f9267[43] = double.class;
      f9268[43] = "java/lang/Double";
      f9267[44] = "9\u0011&MS(-\u0015as\n&/\u000f;\u001f8vnPlsV m\u0005`H\f:/\u0006\\";
      f9267[45] = "hs<Bc\u00056,.\u000b\u001aȸ\u0007/z\u001ep\tn\u007f|G|{;+'\u0011h\u0012k-~\u001d\u001a";
      f9267[46] = "\u001dgy$?L\\4 .N\u0383#9`r'\u0016Hio-*";
      f9267[47] = "\u0014\u0001t3\u0011'\u0015\u001dj5ch\u001d\u001eif$xt\u0014s5\u0012/\u0014\u0001*f\u001e\u0016\u0014\u0001t3\u0011'\u0015\u001dj5c";
      f9267[48] = "p0N\u0006PzuqW\u0013=vd|a\u0018\\voeE\u001aA\u0019pdF\u001c\u0006bn;Q\u0011=";
      f9267[49] = "Ea!NZ\u0001\u0003f$M4˿?\u007f)\u0017[\u0017\u00049gG[q\u0006l&D\bJ\\vdG4HT9r\u0012\u000f\u0012N{q.\r\u001a\u0001m$\u0015W\u0000Cn\u0018\u0017_OU;#ME\rV\u0007!E\n\u001b\u0003<{_H\u0018?}gDYLX8&J\u0004qS9cAP\u0011[8(W4";
      f9267[50] = "-R b\u000fm`\r<9?=w\u000b#^\u0004j!ne6@h-Res\u0005l\u0010";
      f9267[51] = "~*>!L$?r>n=|)g;xQN~$e!\u0004\u0019xr`q\u0000c%w<'=";
      f9267[52] = "P\t\u0015/,\u0019\u000b\f\u0002']\u0014W\u000ei#!\u0010G\t\u000f2`\u001a]b\u0005v&\u0012_\u0002\rwm\u0004;";
      f9267[53] = "\u0007m|\u001e'p\u001df;F^`\u000eec\u0001\"w\u0019Qo\u0006\"{\u0005eyz;b\u00031;@gpRr\u0002\u0016`a\fnb\u001ea*\u001a\n";
      f9267[54] = "\u0005%\u0007}\u001ceCkW}z;\u0010h^u\u0016\tG.\u000f*A^\u0011*E}\u001e>\u0019+\u000ekz";
      f9267[55] = "\f\\\u0003+KBTF\u0010y0OTQ\u0004wg\u001d\f\f_'0\u001b\u0004Y^j\rZ\\Y\u0011";
      f9267[56] = " \u0019>\u0007M\u0003+\u0019\"\u0007=\n6\b'QQ8bDy\b\u0006ofH<]\rT+\u0017 \u0006=\u0015$\u001e*\u000bZPe\u0010w6";
      f9267[57] = "}h\u0000\u001b\u0011E;&P\u001bw\u001bh%Y\u0013\u001b)?c\bLJ~y;CD\u000e\u0002j)\u0005\tw\u0002g#\t\r\u000b\u0011ueDt\u000b\u001c\u007fi@\b\u0018\u000e9$9\u0018I\u0005j=Y\u0010HN|Y";
      f9267[58] = "y*\u000f\u001ehPp-\u0011BR\u0012v43@)\bq)\t@.\u0018\u001b+\u0015\u001dbQ~,RO iy*\u000f\u001ehPp-\u0011BR";
      f9267[59] = "GJL:V\u0002SN\u000b\u0004\u000f\fQTQh=\\\u0010\u0005\f\u0004\u0004\u0006\u0013E\u000fd\u0011_@I6";
      f9267[60] = "_d\u001dnB\u007f\u001e<\u001d!3'\b)\u00187_\u0015YnDo\nBYm\u001d:A+\tkD63~\fn\u0016mI#\t2@P";
      f9267[61] = "sF:\u0014mz/JnN\u0013kx\\\u001e\u000b\u007fA|F7\u0019~~\u0015G%\tv:\u007f\u001dc\bl\u0004";
      f9267[62] = "`K^\u001bU6~\u0014I\u0016n\u0011^wg?#\u0003E/I\u001f\u0000-\"TW@\u0017 ";
      f9267[63] = "d#\u001d1:\u0017p'Z\u000fc\u0019r=\u0000cQI3bV\u000f;Hu6W4v\u0017img";
      f9267[64] = "DU\u0012<[\u001f\u0002\u001bB<=AQ\u0018K4Qs\u0006^\u001ak\u0001$A]FcB]]X\u0017/=Y\u0005\t\u001b,DE\u0000XWS@\u001dQTT*\\\u0018\u0000\u0018+?\u0003_S\u0000K7\u0002\u0014Ed";
      f9267[65] = "<\u0014JD\u0002\\oH_\u0019mG:(XCU\u0018(QY\u001cPB";
      f9267[66] = "7$\u00153YSvwL9(ĝ\tz\feA\tb*\u0003:L";
      f9267[67] = "kr~6\u001d\u0015vqk/#\u0016b7L'X\fe*v'_\u001c\u000f(jz\u0013Uj/-(Qmkr~6\u001d\u0015vqk/#";
      f9267[68] = "n0~)\u0019/fd|?t/7'\u0000-\u00043^2!~\u0005v>'x-\tO";
      f9267[69] = "SfD\u001aC=\t~@\u001a/&\u0001a^\u0017C\u0014Q \u0000H/y]x\u0000\u0001\u00128\u0005xOp";
      f9267[70] = "KVRpy.A@_.\u0013s.\u001b\u0005(y-GK\u0003qu_\u0012\u001fX'a6B\u0019\u0001+\u0013";
      f9267[71] = "Xn!\u0005G!P:#\u0013*'\u0005rel\u0014~\u0017<$P\u0014;R8\u0019";
      f9267[72] = ";W 5l\\7X,(\rĀ\nM{nb^1\u000b5>b";
      f9267[73] = "\u000bu\\\u0012\u0004|KrF\u001bbն0'LL\b*\u000b}V\u000e\u000b\u0016";
      f9267[74] = "PBYl\u000e,\u0010ECehȟk\u0010I2\u0002zPJSp\u0001F";
      f9267[75] = "*n\\]\u001c\u0007qkKUm\b&aG@(\u0004-h X\u000f\u0001~?\u0019Q\b\u001f\"";
      f9267[76] = "\u001aX,#7\n\u0002H=\"[\u0015\u000fL)''\u0013\t!c\"c\u001d\u001eAkva\u000bs";
      f9267[77] = "T{nG\u0014Z\u00125>Gr\u0004A67O\u001e6\u0016pf\u0010Ca@t,G\u0016\u0001HugQr";
      f9267[78] = "ou~Tl<.&'^\u001dnQ{s\u0002`f?&tO}\u0007n.%C|i3)h^\u001d";
      f9267[79] = "/q_\u0004&\u0004#~S\u0019Gϖ\u001eyK\u001cy\\}mO[";
      f9267[80] = "2\nWc\n\u0011,U@n16\f6nH|,\u0017#c\u0003H\u000e%\u000e\u0002xVQ2\u0003";
      f9267[81] = "\u0015'\u0007\u001fjQN\"\u0010\u0017\u001bZ\u00130>\u0015~_\u00136\u0000xqS\u00037GI$L\u000e0{";
      f9267[82] = "Or#M?\t\u00154\"W\u0001\u0002SU<Ed\u000ecn8O{8Yo7EmcFnbY8\u0003S71U\u0001";
      f9267[83] = "?i-\u0005'1>6(_^-<-uX2\u001fha(\u0007cH*<l\u000e.$!<p\u000e^";
      f9267[84] = "Z\f2\u000e1MT\u0004#\u000b\\FV@\u0002\u001a8TV<bL#\u0017\u0006\u0000b\tf\u0013;";
      f9267[85] = "B+\u000bAs'\\t\u001cLH1B2\fE3\\\u0005p\u001a\u001fu`\u00055_\u001bH2\\q\u0014\u0018('\u0005\"\u0018!";
      f9267[86] = "XT)d\u0006p\u0005Qu2;o\tArmW]]\u0005\"7\u0001\n^\fw4J7\u001fTw{;6\r\u0006|7Ak\bZ*\n";
      f9267[87] = "N\u0003ex]y\u000fP<r,ѫpV;~\\|\bK8kE";
      f9267[88] = "+_\u00050[3'P\t-:ɮ\u001a\u0000S)Qg!M\f5\n";
      f9267[89] = "\u0017)*&m:\u0019!;#\u00007\u001au\u001f&j\u0005\u001be8:f1\r\u0019!#`eO#}11&vuz o:\u0016}{ky^";
      f9267[90] = "h\u001egb4b|JseVul]wz:G?\u0019-#Vyx^zq(ahO{\u001d";
      f9267[91] = "D\u0014P\bn\u001eY\u0017E\u0011P\u001dMQu\u001c(\u0006IdX\u001c7\u0019MA<\u00167XQ\u0014\\\u0003n\u000b]-XA<\u0016\u001eUEB)\u000f ";
      f9267[92] = "+M\fo8#'B\u0000rY(wS9l5;z/\u001b44weV\u00071e;\u001a";
      f9267[93] = " D@zO\u0005u[M}sU6OGh\u000fS0\"\rmK]'B\u00059IKJ";
      f9267[94] = ".*$!XE/6:'*\u001e)6 tC\u0012\u00108 dGt 6zh\u0013\u00145o)d*";
      f9267[95] = "t%=j'3jz*g\u001c\u0002J\u001d\u000fMY\u001fI\f\u001dV\u001c1i/31g/68>";
      f9267[96] = "}%,R-A|z)\bTVrpp\u0004\u0003\u0001,'(h=\u0007cbv\u001a)Swe";
      f9267[97] = "JTC\u001c4@\u000b\u0007\u001a\u0016Eњt\nZJ,\u001a\u001fZU\u0015!";
   }

   public static Class m274(long var0, long var2) {
      Class var5 = null;
      int var4 = m272(var0, var2);
      Object var6 = f9267[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9268[var4]);
            f9267[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m275(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m276(Class var0, String var1, Class var2) {
      Field var3 = m275(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m276(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m277(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f9267[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9268[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m274(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m275(var12, var10, var11);
            if (var13 != null) {
               f9267[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m276(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9267[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new IllegalStateException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = m274(631628532672122L, 0L);
            }
         }
      }
   }

   public static Method m278(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   public static Method m279(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m278(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m279(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m280(long var0, long var2) {
      int var4 = m272(var0, var2);
      Object var5 = f9267[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9268[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m274(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            var11++;
            var12++;
         } while ((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for (int var16 = 0; var16 < var11; var16++) {
            int var17 = var6.indexOf(8, var12);
            var15 = m274(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m278(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f9267[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(631628532672122L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m279(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f9267[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while (var29 < var13) {
                  var28.append(var14[var29].getName());
                  if (++var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new IllegalStateException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m274(631628532672122L, 0L);
            }
         }
      }
   }

   public static MethodHandle m281(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'r' && var8 != 197 && var8 != 'D' && var8 != 244) {
            var11 = m280(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 222) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'P') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m277(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'r') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 197) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'D') {
               var9 = var0.findStaticGetter(var12, var18, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var18, var14);
            }
         }

         return MethodHandles.dropArguments((MethodHandle)var9, var3.parameterCount() - 2, long.class, long.class);
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName())
            .append(" : ")
            .append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null "))
            .append(" : ")
            .append(var15.toString());
         throw new IllegalStateException(var13.toString());
      }
   }

   public static Object m282(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m281(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m1632(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(PotionEffects.class, "m282", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Յ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
