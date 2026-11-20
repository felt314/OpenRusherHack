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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.HudElement$SnapPoint;
import org.rusherhack.client.api.feature.hud.ShortListHudElement;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class Position extends ShortListHudElement {
   public DecimalFormat f8386;
   public BooleanSetting decimals;
   public DecimalFormat f8388;
   public DecimalFormat f8389;
   public BooleanSetting comma;
   public DecimalFormat f8391;
   public BooleanSetting interdimensionaly;
   public BooleanSetting colon;
   public EnumSetting<PositionInterdimensional> interdimensional;
   public ColorSetting f8395;
   public BooleanSetting label;
   public static Position f8397;
   public static long f8398 = Class066.m4320(-5331009200209606581L, 2489036558274818943L, MethodHandles.lookup().lookupClass()).m4325(254914145329432L);
   public static String[] f8399;
   public static String[] f8400;
   public static long[] f8402;
   public static Integer[] f8403;
   public static Map f8404;
   public static Object[] f8405 = new Object[106];
   public static String[] f8406 = new String[106];

   @Override
   public Text[] getComponents() {
        return null;
    }

   public Position() {
        super("Position");
      long var1 = f8398 ^ 74972399989104L;

      this.f8389 = new DecimalFormat("0.00");
      this.f8386 = new DecimalFormat("###,###,##0.00");
      this.f8388 = new DecimalFormat("#");
      this.f8391 = new DecimalFormat("###,###,##0");
      this.interdimensional = new EnumSetting<>("Interdimensional", PositionInterdimensional.f2263);
      this.interdimensionaly = new BooleanSetting("InterdimensionalY", false).setVisibility(() -> {
         return this.interdimensional.getValue().equals(PositionInterdimensional.f2262);
      });
      boolean var10007 = true;
      this.label = new BooleanSetting("Label", true);
      var10007 = true;
      this.colon = new BooleanSetting("Colon", true);
      this.f8395 = new PositionColor(this, "Color", new Color(0, m5165(6019, 2256418022919274985L ^ var1), m5165(7944, 1724938370069694819L ^ var1)))
         .setVisibility(() -> {
            if (!RusherHackAPI.getHudManager().isThemeColorSynced()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         })
         .setAlphaAllowed(false);
      this.comma = new BooleanSetting("Comma", false);
      boolean var10011 = true;
      this.decimals = new BooleanSetting("Decimals", true);
      f8397 = this;
      this.setToggled(true);
      this.setSnapPoint(HudElement$SnapPoint.BOTTOM_LEFT);
      BooleanSetting var10000 = this.label;
      Setting[] var10001 = new Setting[]{this.colon, null};
      boolean var10005 = true;
      var10001[1] = this.f8395;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.interdimensional, null, null, null, null};
      var10005 = true;
      var10001[1] = this.interdimensionaly;
      var10001[2] = this.label;
      var10001[3] = this.comma;
      var10001[4] = this.decimals;
      this.registerSettings(var10001);
   }

   public String m16088() {
        return null;
    }

   static {
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
   public static int m5165(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25447;
      if (f8403[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f8402[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f8404.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f8404.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ҿ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f8403[var3] = var15;
      }

      return f8403[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Position.class, "m5166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ҿ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f8405[0] = "/7\u0011/\t@1?\u000b`tA7?\t)mZ,8\u0002<";
      f8405[1] = "L i:z\u0007G/xu\u0017\u0003G3L>%\u001eC/|>";
      f8405[2] = "5f]B4&)|_\u001e.29\u007f\u0014Ӓ";
      f8405[3] = "<e9^g\u0013 \u007f;\u0002}\u00070|pȄ";
      f8405[4] = "\u001f0Q4I\u0019\u0003*ShS\r\u0013)\u0018Ȝ";
      f8405[5] = int.class;
      f8406[5] = "java/lang/Integer";
      f8405[6] = "+\u007f\\\u0007ac+\u007fK[ml14KEmy6E\u001a\u001c:;";
      f8405[7] = "[EP7jbPJAx\u0017zCMH1";
      f8405[8] = "\r->\u001e\u0017\b;\b>\u001e\u0000T7\u0007$U\u0000J7\u0012#$Q\u0013`Pk";
      f8405[9] = "\u0005\u0011\u0013\u0016n!\u0005\u0011\u0004Jb.\u001fZ\u0004Tb;\u0018+V\n7";
      f8405[10] = "\u0004[\r&\b~\u0018A\u000fz\u0012j\bBDѡ";
      f8405[11] = "\u007f*r{fjc0p'|~s3;6{muvf0`ky6r{Vp\u007f4p4zLu,a<zx";
      f8405[12] = "\u000e]\u001bo/r\u000e]\f3#}\u0014\u0016\f-#h\u0013g^xq,";
      f8405[13] = "\\RppA%\\Rg,M*F\u0019g2M?Ah1m\u001e}";
      f8405[14] = "\u0004\u0005o\u001b$\u0017\u0018\u001fmG>\u0003\b\u001c&V:\u000b\u000e\u0019|\u001b7\u0012\u0002YnP7\u0016\u001e\u0005m\u001b>\u0017\u000fY[]9\u0010\u001f;aF\"*\u001e\u0013MY3\u000f\u000e\u0019|";
      f8405[15] = ";&W\u0017/\u000f;&@K#\u0000!m@U#\u0015&\u001c\u0011\fzU";
      f8405[16] = "G#5f\u000bfH:7)awN+.fITB0.fQ";
      f8405[17] = "\u0012\u001ey^\u0013\u0015\u000e\u0004{\u0002\t\u0001\u001e\u00070\u0013\r\t\u0018\u0002j^\u0000\u0010\u0014Bm\u0015\u0015\u0014\u0014\u0002y^\"\u000f\u0011\u0003l#\u0004\u0014\t\u0005p\u0017";
      f8405[18] = "|k\u0013\u00143p|k\u0004H?\u007ff \u0004V?jaQR\bk)";
      f8405[19] = "R[^rcL'{U}r\u0003Fu^vvY2";
      f8405[20] = "K}<D\u001e\u0005K}+\u0018\u0012\nQ6+\u0006\u0012\u001fVGyXJ[";
      f8405[21] = double.class;
      f8406[21] = "java/lang/Double";
      f8405[22] = "HnwrqCHn`.}LR%`0}YUT0m,";
      f8405[23] = "\u001enf\\MC\u001enq\u0000AL\u0004%q\u001eAY\u0003T$A\u0018";
      f8405[24] = "gx;\t1v{b9U+bkarD,qm$/B7wad;\t\u0010f|~5I$";
      f8405[25] = "\u001a(j\u007f\u0006/\u0011'{0g!\u001a,\u007fj";
      f8405[26] = "?\u0016\u0016K3\u0003!\u001e\f\u0004\\\u0004'\u0016\u0019ft\u0005!";
      f8405[27] = "{BcX\u0001k\u000ebhW\u0010$olc\\\u0014~\u001b";
      f8405[28] = "X\u0004\u0015^\u000bZ-$\u001eQ\u001a\u0015L*\u0015Z\u001eO8";
      f8405[29] = "Xm7_;\u0006Dw5\u0003!\u0012Tt~\u00ad";
      f8405[30] = boolean.class;
      f8406[30] = "java/lang/Boolean";
      f8405[31] = "V\u001cb\n@iJ\u0006`VZ}Z\u0005+G]n\\@gM\\x\u0017,lJVQX\u0000dCWn{\u000fvA";
      f8405[32] = "#*\b\u0003wO?0\n_m[/3ANjH)v\u001cHqN%6\b\u0003@T95<HqN%6\b";
      f8405[33] = "\u0003+OS@I\b$^\u001c,J\u0006&\\S\u0000";
      f8405[34] = "nZSf%Wr@Q:?CbC\u001a+;KdF@f6Rh\u0006s$8@`DG";
      f8405[35] = "\u0002@3!L2\u001eZ1}V&\u000eYzlR.\b\\ !_7\u0004\u001c\u0006zM/\b@\u001cn],,b\u001d";
      f8405[36] = "\bNKi8g\u0014TI5\"s\u0004W\u0002$&{\u0002RXi+b\u000e\u0012_>9f\u0002Q\u0002\u000e\u0002g\u0003qM)+u\u0002N";
      f8405[37] = "j5Ym1KC\fEw3\u0017Y\u0018Utx\u0006^\u000bS1%\u0000E\r_q1Kb\u001cBk?\u000bVB";
      f8405[38] = void.class;
      f8406[38] = "java/lang/Void";
      f8405[39] = "n\u001fa\nN\u007fp\u0017{E\u0006\u007fj\u001dc\u0002\u000fd*<x\u0004\foe\u0010D\u001e\u0010zh\u0017r\u0019";
      f8405[40] = "slruBGovp)XS\u007fu;8\\[ypauQBu0s>QFilpuXGx0].Twp{x>^F8M{:@bsw{/";
      f8405[41] = "\u0014ZfhzI\b@d4`]\u0018C/%gN\u001e\u0006g#iH\u000eZdhAz\u001eIu3zY8Go a[\u000eZ`$dY";
      f8405[42] = ";->&!j\u0012\u0014\"<#6\b\u00002?h'\u000f\u00134z5!\u0014\u00158:!j3\u0004% /*\u0007Z";
      f8405[43] = "b\u0003*\u0006Ly~\u0019(ZVmn\u001acKReh\u001f9\u0006_|d_+M_xx\u0003(\u0006Vyi_\u0005]ZIa\u0014 MPx";
      f8405[44] = ",'Y\n$=/c\u0004\u000eOϷ\u0015aL\u00172(.5\u0005\u00041";
      f8405[45] = "\u00057\u001bB/\u0019\u000fy\u0001B\u0012\u0015\t,\u0004UU\u0005`,DJy\u0012\u0018)\u0012E+k\u00057\u001bB/\u0019\u000fy\u0001B\u0012";
      f8405[46] = "+5\n\u001e\u0016\u001czb]\u000b-2\u0005Ht2z\"\u000fUx!d%\u0005Wf0j<\u001aJw6k%B1\u0000\u0007M\u00183kC\u001eL";
      f8405[47] = "DTx\u0014X^G\u0010%\u00103Ј}GyAMS\u0018]u\u001dX";
      f8405[48] = "`\u000eMo\u000f87]\u001do}c`CL4\u0011Q7\u0004\u0017iD\u0006`AT-\u0011~3VSn}";
      f8405[49] = "Lj?n\b0Dvi9x<Os`4\u0014\u000e\u001b2>kx4\u0013n<!Fc@><S";
      f8405[50] = "\u0017mUf45\u0014)\bb_ռ.~T3!8KdXo4";
      f8405[51] = "^k\u007fy'X^wxu^\u001fHu%g\"\b_A)`\"\u0004Cu?\u001c\"^Bx5l1YYyDe'\u001bZs-s'\tJ\u001a";
      f8405[52] = "W\u001bb\f\u000b3M\u0017>\u0019v8Z\r=\u001b\nVP\t \f\u001a.\u0003\u001e'OvkT\u00064\b\u000f$\u0004\u0015&r";
      f8405[53] = "%r\u0005/s>wmF;\u001f!tn\u001e=Hu(:Jh\u001f~vh\u001fi'>k{\u001f";
      f8405[54] = "KWWB=#H\u0013\nFV<\u001fRqJ3+\u0015HWK*(r\u0010\u0005\u0015?\"\u0015\u0010\u0002P+S";
      f8405[55] = ">UHO\u0001\td\u0016QN`\u001do\u0018TH\f/>_\b\u0010Xx?\rEC\u001a\u0001p]VQ`\u0013|\rMK\u000b\u0011p\bM/";
      f8405[56] = "Ho\u001cXn<@sJ\u000f\u001e;GgG\tIl\u0018:\u001ceqh\\pC\u001cs2[m";
      f8405[57] = "\\zpB\u001cT[x\u007fG\"]L>^YMIE/n>F\u001bS){FCM\\{\u0002G[X^+kQ[JNB";
      f8405[58] = "[[\u0012\u0003dwM\\\r\u0011\u000b$]L6\u0007o6]j'$\u000bpBTQ\u0015;4Q]Wn";
      f8405[59] = "\u000bLaR\u0016?^\u0013!\u0016u\u007fo\u0016w\u001e\u0019)\u0016Y'\r\u000bSRBo\u0003\u000f*\u001d\u0012|\u0011u";
      f8405[60] = "Sv\u0004\u0013\u00112P2Y\u0017zɨj0\u0011\u000e\u0007'QdX\u001d\u0004";
      f8405[61] = "'H:\f\u001a\u001f<U9\u0000$\u000eDM=\\\u0015_:V _\u0019";
      f8405[62] = "z`\u0015\f,|an\u0019\u001eC,p}7\t/\u0006tg\u001e\u001b.9\u001df\u0005\u0004y!\"oI\u001a.C";
      f8405[63] = "w]\u007f=/\u0000/Y~lQ\u000b\u007fJk;\u0006_\"\u001c1oQ\fdWe)4T`V4";
      f8405[64] = "EX+9{f\u0012\u000b{9\t=E\u0015*be\u000f\u0012Rq<9XE\u00172{e \u0016\u000058\t";
      f8405[65] = "\"(z>Bn|&+>+a.\u0018+*\u001495q#6Bn";
      f8405[66] = ">HDpzz(O[b\u0015=8_`|n'?BZ|i7UYQyq,>\u0019A%sF>HDpzz(O[b\u0015";
      f8405[67] = "^\u001cr[fB\\\u0010w[\u0002LX\u001e{En~\u000f]%\u0013<)\\\u0018kH|L\u0004\u001cj\u0019\u0002BK\u000bbFi@G\u000eb\"";
      f8405[68] = "\u007f Ip%n-?\ndIq.<Rb\u001e%rh\u00066I.,:S6qn1)S";
      f8405[69] = "\u0019?a?J\u0011\u001b!j}-Պ#{\"$\u0014Q\u0013?1-\u0012*";
      f8405[70] = "\u001d#Vq<\u0019E'W B\u0019\u0019%F|.+Og\u001f s|O+B\"9L\u000b8K$B\u0015\u000e)Le'M\n(\u001d\u001b";
      f8405[71] = "(6#A\u001b@+r~Epȩ\u0011%\"\u0014\u000eMt?.H\u001b";
      f8405[72] = "'>>N\u000bE% 5\flȧ\u001dz}UU\u0005->n\\S~";
      f8405[73] = "cO\u0011`\u001d[`\u000bLdvɇZ\t\u0004}\u000bNa]Mn\b";
      f8405[74] = "'Y2<[d$\u001do80ǘ\u001eK4)]{\"]36O";
      f8405[75] = "rupG\u00162(6iFw&#8l@\u001b\u0014r\u007f0\u0018LC%:e^\u0013('6`^w";
      f8405[76] = "bKw$+|-\u001bd6Qk8Xc!-\u0005bKw$+|-\u001bd6Qg%I|#0|bObHll.N|1#<=\\\u0006";
      f8405[77] = "~TX|e\u000e)\u0007\b|\u0017U~\u0019Y'{g)^\u0002y(0~\u001bA>{H-\fF}\u0017";
      f8405[78] = "-\u000bmXRKyB~[7\u000b\u007f\u000fADL\u0011x\u0012{DK\u0001\u0012\tpAS\u001ayI`\u001dQp-\u000bmXRKyB~[7";
      f8405[79] = "*}:2V\u000b('=/6\u0017(< /Z%\u007f\u007fqx\rrt#+-\u000eJ4>8-6";
      f8405[80] = ":PO7%G!ML;\u001btYUHg*\u0007'NUd&";
      f8405[81] = "5L4\u0017T\u00196\bi\u0013?ı\f\f \u0015P\u0002|\u000fdHT";
      f8405[82] = "`YR:\u0002ri\u0015Lm`,|wBm\u0005 LLFg\u001a\u0016vMIm\fMc\u0016Pk\u00195f@_9`";
      f8405[83] = "\u0011Z/@te\u0016X EJl\u0001\u001e\u0006Z#o4\u0005<Z6\u0017\u0016\u0010<X:e\f\u000f8\u0004Jn\u0015\u001c\"U#x\u0015\u000e2<";
      f8405[84] = "\bj'&6VY*5#GƵ7m!1+\u0017N\"q\"9m\n99,=\u0014Ei*>G";
      f8405[85] = "\u0018\u0001\u0015W\"\t\u0007\u0019\u0011]G\u001e\u001a\u00076Y#\f\u001a{\b^z\u0018\u0014\u001a\u000f_5\u0018w";
      f8405[86] = "+EO\u0006yx,Z\u0011W\u001fb-iVAvoJBVPeu+Y\u0011V{\u001e(ZGAt\u007f3\u001dA_\u001f";
      f8405[87] = "2n7&KS0b2&/]4l>8Coc/`n\u00148dy/3UA+)<!/S'y';DQ+|'_";
      f8405[88] = "CHp\u001aW+ADu\u001a3%EJy\u0004_\u0017\u0011\u000e)^\t@\u0014\u0007e\u0003R1ND|\u00023+V_`\u0007X)ZZ`c";
      f8405[89] = "\u0001 w{yh\u001a=twG{\u001b;\u007f.<\u0016\u0002(+#$w\u0005)d#Gr_4}3?w\t;/J";
      f8405[90] = ":\u0017xu\f\u00184F8\u0013\u0015\b8/t\"\u0001\u001ek\u001f9m\u0001d:\u0017xu\f\u00184F8\u0013";
      f8405[91] = "\u0016w$%O\u001a\u00153y!$\u0003/4%;U\fP|1;Hj\u0015b8;B\u0015]v8&$";
      f8405[92] = "\u0018Brlf&\u0007Zvf\u00037\u001bTTvi\u0005\u001aDsje1\f8s0d<\u0006H`7\u007f=wAvu|7\u001eWvgl^";
      f8405[93] = "zUuR 8y\u0011(VKѫCFt\u000755&\\x[ ";
      f8405[94] = "Z\u0019jW<RL\u001euES\u0015\\\u000eY^+\u000eX;t^4\u0011\\\u001e\u0010^n\u001cZ\u000bh[8\u0013\br{Q)\u0003^NmV6\u00111";
      f8405[95] = "9]*$J&>Btu,)4TIyB}1[(~C218-$^+!@(rQyX";
      f8405[96] = "\u001a\u001f(C\u0017c\u0019[uG|Ӻ#Y=^\u0001v\u0018\rtM\u0002";
      f8405[97] = " V/n\u001a\u001arIlzv\u0005qJ4|!Q-\u001eo!vZsL5(N\u001an_5";
      f8405[98] = "\u0015=\u0019\u0017]\u001f\u0016yD\u00136ϐ,!\rE\t\u001eI#D\u001b\r";
      f8405[99] = "g\u000e,%\u0013\\}\u0011(ycdZ \u0011\u0006&yY1\u0003\u001dcTo\u001d)1\u0011Np\u0019u";
      f8405[100] = "?\u0002C}b\u00185LY}_\u0000=\u001aEj6\f\u0004\u0014Ez2j>@Sl&\u0012;\u0016\\>_";
      f8405[101] = "2\u0011d\u0010\u001dwhR}\u0011|ic\\C\f\u0006ghO\u0018M\u0015wbZa\u0002Edp ";
      f8405[102] = "3(;?wH=y{Y{S\u0006l08a[]-#(kN$bs;y4";
      f8405[103] = "\u0013u>Y>F]oj\u000bEG@l2\u0002)u\u0010+cexK\\|(\u001c7\u001bOnRX,SAj+\u0017|@S\u0010";
      f8405[104] = "-=2R\u001f\\6 1^!E472\u0005HFN`!\u0007\u0018Y~$2\u000e\u001e\"";
      f8405[105] = "B+1qH^Aolu#Ѩ{m$l^K@9m\u007f]";
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
}
