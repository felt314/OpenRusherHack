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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.hud.ShortListHudElement;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class Hunger extends ShortListHudElement {
   public BooleanSetting colon;
   public BooleanSetting label;
   public DecimalFormat f2306;
   public ColorSetting f2307;
   public BooleanSetting saturation;
   public static long f2309 = Class066.m4320(3457937625552655265L, 644749149788661595L, MethodHandles.lookup().lookupClass()).m4325(18884421740767L);
   public static String[] f2310;
   public static String[] f2311;
   public static long[] f2313;
   public static Integer[] f2314;
   public static Map f2315;
   public static Object[] f2316 = new Object[68];
   public static String[] f2317 = new String[68];

   public Hunger() {
        super("Hunger");
      long var1 = f2309 ^ 82964948879486L;

      boolean var10007 = true;
      this.label = new BooleanSetting("Label", true);
      this.f2307 = new HungerColor(this, "Color", new Color(0, m5165(6188, 7814632691883238472L ^ var1), m5165(29415, 8140987238023696002L ^ var1)))
         .setVisibility(() -> {
            return RusherHackAPI.getHudManager().isThemeColorSynced();
         })
         .setAlphaAllowed(false);
      boolean var10008 = true;
      this.colon = new BooleanSetting("Colon", true);
      var10008 = true;
      this.saturation = new BooleanSetting("Saturation", true);
      this.f2306 = new DecimalFormat("#.#");
      boolean var10003 = true;
      this.label.addSubSettings(this.f2307);
      Setting[] var10001 = new Setting[]{this.label, null, null};
      boolean var10005 = true;
      var10001[1] = this.colon;
      var10001[2] = this.saturation;
      this.registerSettings(var10001);
   }

   @Override
   public Text[] getComponents() {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9163;
      if (f2314[var3] == null) {
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
         long var5 = f2313[var3];
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
         Object[] var9 = (Object[])f2315.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2315.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/â", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2314[var3] = var15;
      }

      return f2314[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Hunger.class, "m5166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/â" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f2316[0] = "xcFuP^dyD)JJtz\u000fɝ";
      f2316[1] = int.class;
      f2317[1] = "java/lang/Integer";
      f2316[2] = "m\u0010}\u0019J@q\n\u007fEPTa\t4Õ";
      f2316[3] = "2LW\u0000*W.VU\\0C>U\u001eɚ";
      f2316[4] = ",S\u000eCBG0I\f\u001fXS JG\u000e\\[&O\u001dCQB*\u000f;\u0018CZ&S!\fSY\u0002q ";
      f2316[5] = "|{14Hj`a3hR~pbxyVvvg\"4[oz'%cIkvdxSrjwD7t[xv{";
      f2316[6] = boolean.class;
      f2317[6] = "java/lang/Boolean";
      f2316[7] = "@R.6A\u0016^Z4y#\nYG";
      f2316[8] = "d4Sn(Vo;B!IXd0F{";
      f2316[9] = "0/?H7t,5=\u0014-`<6v\u0005)h:3,HΜ";
      f2316[10] = "O\u000e[\u0010C\u0019D\u0001J_>\u0001W\u0006C\u0016";
      f2316[11] = "d\u0013\tf1\u0006x\t\u000b:+\u0012h\n@+/\u001an\u000f\u001af\"\u0003bO\u001d-7\u0007b\u000f\tf\u0000\u001cg\u000e\u001c\u001b&\u0007\u007f\b\u0000/";
      f2316[12] = "L2,\"k\fL2;~g\u0003Vy;`g\u0016Q\bj9>V";
      f2316[13] = "cvp$\fm\u007flrx\u0016yoo9i\u0011ji*do\nlejp$<wchrk\u0010Kipcc\u0010\u007f";
      f2316[14] = "\u0018$9z7vm\u00042u&9\f\n9~\"cx";
      f2316[15] = ")@1Pwt\\`:_f;=n1TbaI";
      f2316[16] = "j$5T;\u0005j$\"\b7\npo\"\u00167\u001fw\u001esO`]";
      f2316[17] = "gL2P \u001cgL%\f,\u0013}\u0007%\u0012,\u0006zvsLxE";
      f2316[18] = "O$\u0015KF4O$\u0002\u0017J;Uo\u0002\tJ.R\u001eVQ\u001d";
      f2316[19] = "ur\tl7Gur\u001e0;Ho9\u001e.;]hHLuj\u001c";
      f2316[20] = "85W%(u7,UjBd1=L%jG=&L%r";
      f2316[21] = double.class;
      f2317[21] = "java/lang/Double";
      f2316[22] = "\ry?+\u000eN\u0011c=w\u0014Z\u0001`vf\u0013I\u0007%-q\u0015W\u0011%\u000bq\u000eR\fl\rq\u0015W\u0011";
      f2316[23] = "\u0013~5`D\f\u000fd7<^\u0018\u001fg|-Y\u000b\u0019\"!+B\r\u0015b5`e\u001c\bx; Q";
      f2316[24] = "<xM)8k7w\\fTh9u^)x";
      f2316[25] = "O\u0014C>>sS\u000eAb$gC\r\ns oE\bP>-vIHc|#dA\nW";
      f2316[26] = "G<lFF G<{\u001aJ/]w{\u0004J:Z\u0006+Y\u001b";
      f2316[27] = float.class;
      f2317[27] = "java/lang/Float";
      f2316[28] = "9\t'*~\\\u00100;0|\u0000\n$+37\u0011\r7-vj\u0017\u00161!6~\\1 <,p\u001c\u0005~";
      f2316[29] = void.class;
      f2317[29] = "java/lang/Void";
      f2316[30] = "\u0014=T\u0005'\u0007\b'VY=\u0013\u0018$\u001dH:\u0000\u001eaUN4\u0006\u000e=V\u0005\u001c4\u001e.G^'\u00178 ]M<\u0015\u000e=RI9\u0017";
      f2316[31] = "ycUdk\u001aPZI~iFJNY}\"WM]_8\u007fQV[Sxk\u001aqJNbeZE\u0014";
      f2316[32] = "\u0018b\u0015\u0006\u001eq\u0006j\u000fIVq\u001c`\u0017\u000e_j\\A\f\b\\a\u0013m0\u0012@t\u001ej\u0006\u0015";
      f2316[33] = "XZlb8A\u001a\u000fkx[B\t\u000f\u00177g\u0012\u0006\rz8>S\u001cc+u:\u0012\u001a\\i5:Qe";
      f2316[34] = "\u0019\u0003epA\u0018\u0019\ftg?˺'Yvt@Z]\u0019r#\u000eg\u0018\rv`\u0002\u001dX\t!.?";
      f2316[35] = "my\u001aRA\u0012k0HC=\u000fd-_Pz\u001f\ru^\\\u0004\u000e27\u001e\\Gqmy\u001aRA\u0012k0HC=";
      f2316[36] = "Cc\u001f'pk\u0011u\r\"\u001eŘz'\u0016%}*\u0002b\u001ag#";
      f2316[37] = "4\u0015`<R1>\ta}iki\u0015l$\u0005Y?W5xX\u000ex\u0004|-\u0015mxXuCYrh\u00167|SniW\f";
      f2316[38] = "\u0011\u000bRjz-FK\t\u0004ɈQW^\u001ajm2W\u0002\u0013\u0004";
      f2316[39] = "h8cA\f\u0001:.qDbԊQr2\b^\u001c`xh_Y";
      f2316[40] = "r@\u0017}]F2D@3`B.O\u0001o'RMW\u0011r\u000e@.WM{`\u0003&@\u0003?\u001aC\"\u0017M\u0002";
      f2316[41] = "[#~u\u00167\u0019vyou!\u0001S\u007fd\u001c,fsh/K\"\t!c`\u000b]\u000fw4 \n2]|{`u";
      f2316[42] = "T_[1E\u0016D_L4+NSMJ(G|\u0002\n\u0016p\u0010+TOA?M@F]T +";
      f2316[43] = "\u0014\u0017\u0011bUr\u0005\u0018\rt(q\u0012\u000e\u001fnDC@IC5(xA\u0010D4NvC\u001dC\t";
      f2316[44] = "2 t~\u0011$`6f{\u007fʴ\u000b6%xN97$tv\u0000";
      f2316[45] = "~~I`F5c.\u0015\"4=w{\u0012$H*`O\u001e#H&|{\b_P5x)\u0016:\u000bw*ys<_+fy\u000b`X*!\u0014";
      f2316[46] = "!n91\u007fJ3?7\u007f\u0019\u0018+)#iev!5)ih\u00190=|8\u0019I'89=c\t#ow\u0000";
      f2316[47] = "\u0016\"x~\u000e)\u0012=q$nyx\u007f\u007f\u007f\u0011h\u0002?{(_UG+\u007fkS/\u0007/(%n";
      f2316[48] = "HR^\f\u0003*XRI\tmrO@O\u0015\u0001@\u001e\u0007\u0013MU\u0017\u001dWD\rPm]S\u0013Cm}\\W_\u0014\u0006oNB@r";
      f2316[49] = "8 Mkcs=&\fm\u0011px\u0006\u0014>t|H=\u00104kJr<\u001f>}\u0011?&\u0015jn.}f\u0015)\u0011";
      f2316[50] = "!VKbdys@Yg\nΥ\u0018\u001c\u001a+6d)\u0016@|1";
      f2316[51] = "a;~\t/ |/lO\u00166c+R\u001cr$cW2I/:`:=\u0010n \u000e";
      f2316[52] = "G>iHh\nU,|W\u000e\u0004@<b_b6\u0017\u007f<\t5a\u0012+iG3\u001bR/>\t\u000e\u000bS+r^e\u0019A>m8";
      f2316[53] = "$(W1'k6:B.Ae#*\\&-Wwn\f|{\u0000$8M?/=48Z:Aj0=L'*x\"(SA";
      f2316[54] = "P\u0006#=\u0001=\u0015\nac;*\u0002\u001f\u00067_8\u00029\u0017\u0014;9\u0002\u00136\"X9^\u001aX";
      f2316[55] = "p\u0006\u0004{4+\"\u0010\u0016~ZʺILU2f6xF\u000fea";
      f2316[56] = "jt}S\u0001\u0000w`o\u00158\u0010itTRR\"hdsN^\u0016~\u0018k]ZD`}0\u001f\b\u0014\u0005{dCD\u0014}'cB\u0003y";
      f2316[57] = "MJC]uz\u001f\\QX\u001bht\u000b\u0012Ft\u007f\u0019RC^$\u0001N\fMKel\u0017]U\u001b\u001b";
      f2316[58] = "+u'\u000b*\u001cnyeU\u0010\u001fyl\u0015\fh\u0004}Y8\fw\u001by|\\Tl\u0005-oc\u0016,\u0005n\u0010c\rk\u0007.h&\u0001)Y\u0014";
      f2316[59] = "<\u001en_Dgu\u000b*\b!hj\r\u0010KMBn\u00179YL}\u0007J*\u000f\u0019ueO,N\u001f\u0007";
      f2316[60] = "\u00104[Hum\u001e6VOHn\u0011vY\u0014$\\C7\tMHw\u0011zW\u000f+wMs9";
      f2316[61] = "zDlQ\rQpXm\u00106\u0000+UdBaTv\u0003>\u00166^6T\u007f\u0015\tT*U>";
      f2316[62] = "m%w3\u000fCkl%\"sJjr+1\u001aFS|+!\u001e 1i.e\f\u001fs).&s";
      f2316[63] = "\u00138m;5bH6wnMe\u0018Sne2c\u000fjc>/8";
      f2316[64] = "\u000bJ \fbo\u0005H-\u000b_l\n\b\"P3^XIr\u0006_kY\u0018&\u000652\u0018\u001d=7";
      f2316[65] = "\u001d\u007fO3g4Xs\rm]7Ofj1&-H{P1!=\"\u007fW4d3GgEh3L\u001d\u007fO3g4Xs\rm]";
      f2316[66] = "1b\"LN\r<9?\u00172Z1j9Ce\ro=a/YQ>l IH^\"z";
      f2316[67] = "Em_\u007f\u0011\nW\u007fJ`w\u0004BoTh\u001b6\u0015,\n>Ia\u001foXpL^\u0015sY1w\u000bQxDi\u001c\u0019Cm[\u000f";
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
