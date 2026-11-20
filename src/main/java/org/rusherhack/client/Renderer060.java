package org.rusherhack.client;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.command.send;
public class Renderer060 extends Renderer020 {
   public Window f1382;
   public static long f1384 = Class066.m4320(5381726144812650544L, 5138843353377479086L, MethodHandles.lookup().lookupClass()).m4325(220165910352295L);
   public static long f1385;
   public static Object[] f1386 = new Object[75];
   public static String[] f1387 = new String[75];

   @Override
   public boolean m2770() {
      int[] var3 = Class055.m3218();
      boolean var10000 = this.f1382.isHidden();
      if (var3 == null) {
         if (!var10000) {
            boolean var10002 = true;
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public Renderer060(Class025 var1, Class025 var2, Window var3) {
    }

   @Override
   public void m550() {
      Window var10000;
      boolean var10001;
      label15: {
         int[] var3 = Class055.m3218();
         var10000 = this.f1382;
         var10001 = this.f1382.isHidden();
         if (var3 == null) {
            if (!var10001) {
               var10001 = true;
               boolean var4 = true;
               break label15;
            }

            var10001 = false;
         }

         boolean var10003 = true;
      }

      var10000.setHidden(var10001);
      Globals.mc.send(() -> {
         long var1x = f1384 ^ 101015883630256L;
         org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "c", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7121(),  this.f1382,  -4971051622173252029L,  var1x);
      });
   }

   @Override
   public double getWidth() {
        return 0.0;
    }

   @Override
   public double getHeight() {
        return 0.0;
    }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   static {
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1387[var4] != null) {
         return var4;
      } else {
         Object var5 = f1386[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 29;
               case 1 -> 40;
               case 2 -> 44;
               case 3 -> 7;
               case 4 -> 48;
               case 5 -> 45;
               case 6 -> 37;
               case 7 -> 46;
               case 8 -> 12;
               case 9 -> 62;
               case 10 -> 0;
               case 11 -> 14;
               case 12 -> 9;
               case 13 -> 28;
               case 14 -> 16;
               case 15 -> 56;
               case 16 -> 26;
               case 17 -> 51;
               case 18 -> 57;
               case 19 -> 41;
               case 20 -> 54;
               case 21 -> 61;
               case 22 -> 15;
               case 23 -> 35;
               case 24 -> 49;
               case 25 -> 30;
               case 26 -> 43;
               case 27 -> 17;
               case 28 -> 59;
               case 29 -> 33;
               case 30 -> 60;
               case 31 -> 6;
               case 32 -> 4;
               case 33 -> 21;
               case 34 -> 25;
               case 35 -> 50;
               case 36 -> 10;
               case 37 -> 39;
               case 38 -> 55;
               case 39 -> 20;
               case 40 -> 38;
               case 41 -> 42;
               case 42 -> 5;
               case 43 -> 36;
               case 44 -> 11;
               case 45 -> 13;
               case 46 -> 2;
               case 47 -> 18;
               case 48 -> 1;
               case 49 -> 47;
               case 50 -> 34;
               case 51 -> 24;
               case 52 -> 22;
               case 53 -> 19;
               case 54 -> 58;
               case 55 -> 31;
               case 56 -> 52;
               case 57 -> 8;
               case 58 -> 53;
               case 59 -> 27;
               case 60 -> 3;
               case 61 -> 63;
               case 62 -> 32;
               default -> 23;
            };
            int[] var7 = new int[6];

            for (int var8 = 0; var8 < 6; var8++) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for (int var14 = 0; var14 < var13.length; var14++) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            f1387[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f1386[0] = "\u007f`xM`5czz\u0011z!sy1\u0000~)u|kMպ";
      f1386[1] = "J2\n\u0012\u001f\u0012V(\bN\u0005\u0006F+CɈ";
      f1386[2] = "/\u0015<\u0000Aa3\u000f>\\[u#\fuM_}%\t/\u0000Rd)I=KR`5\u0015>\u0000D}.\u00034Y\u001dC)\t?AD";
      f1386[3] = "\u0004\fUX\u001fM\u0018\u0016W\u0004\u0005Y\b\u0015\u001c\u0015\u0001Q\u000e\u0010FXӒ";
      f1386[4] = "g\u0011";
      f1386[5] = "\u0002\u0005~g<\u0016\u0002\u0005i;0\u0019\u0018Ni%0\f\u001f?9xa";
      f1386[6] = "\u0016V7*Z+\u001dY&e&2\u0012Y )\u0018\"";
      f1386[7] = void.class;
      f1387[7] = "java/lang/Void";
      f1386[8] = "\r)\u001fjwj\u00113\u001d6m~\u00010V'iv\u00075\fjdo\u000bu?(j}\u00037\u000b";
      f1386[9] = boolean.class;
      f1387[9] = "java/lang/Boolean";
      f1386[10] = "*\u001axpez6\u0000z,\u007fn&\u00031={f \u0006kpƝ";
      f1386[11] = double.class;
      f1387[11] = "java/lang/Double";
      f1386[12] = "x(\u0003\\\r\\d2\u0001\u0000\u0017Ht1Ję";
      f1386[13] = "&\u001e@3~\r:\u0004Bod\u0019*\u0007\tІ";
      f1386[14] = int.class;
      f1387[14] = "java/lang/Integer";
      f1386[15] = "LcU\u0012\u0006ePyWN\u001cq@z\u001c_\u0018yF\u007fF\u0012\u0015`J?GUZUOt_Y\u001adapAY";
      f1386[16] = "72\fw\u0018J+(\u000e+\u0002^;+E:\u0006V=.\u001fw\u000bO1n\u0019<\u0004[=2E?\u0005Q,n\"\u001f\u0005Q,\u0012\u000e7\u000eZ*%\u0019";
      f1386[17] = "\u001b\u0012F_O#\u0010\u001dW\u00102;\u0003\u001a^Y";
      f1386[18] = "\u0006Hp\tPO\u001aRrUJ[\nQ9DMH\f\u0014~IV_\u001b\\vDGIGsYFO_\r";
      f1386[19] = "\u0015\u0012U\u0007\u001aG\u0015\u0012B[\u0016H\u000fYBE\u0016]\b(\u0015\u001cO\u0019";
      f1386[20] = "\n\u00017\u001e2i\u0016\u001b5B(}\u0006\u0018~S,u\u0000\u001d$\u001e\u0089";
      f1386[21] = "a\u0006F6K%}\u001cDjQ1m\u001f\u000f{U9k\u001aU6X gZS}W4k\u0006\u000fQk5`\u0010Dj\\\"<0";
      f1386[22] = "i8&flqu\"$:vee!o+rmc$5f\u007ftod3-p`c8o\u001a{jb/3\u000bqjr/9<";
      f1386[23] = "u\u0010x]<+h\u0005 \u007f}&p\u0003";
      f1386[24] = "c\u000f\u001f,\u0016~\u007f\u0015\u001dp\fjo\u0016Vμ";
      f1386[25] = "\u0011~\u0001t\u00128\rd\u0003(\b,\u001dgH9\f$\u001bb\u0012t\u0001=\u0017\"\u00133N9\u0016i\u000b?N\u0004*d\u00037\u0005";
      f1386[26] = "&`\u001d2\u0015B:z\u001fn\u000fV*yT\u007f\bE,<\ty\u0013C |\u001d24R=f\u0013r\u0000";
      f1386[27] = "\u00062-^\u0011hs\u0012&Q\u0000'\u000e\n5V\tnf";
      f1386[28] = float.class;
      f1387[28] = "java/lang/Float";
      f1386[29] = "y#;8EOe99d_[u:ru[Ss?(8θ";
      f1386[30] = "zo\u0017\u0010EQfu\u0015L_Evv^][Mps\u0004\u0010VT|3\u0002[Y@po^YEEeu\u0019]\u0019mRo\u0011N_Mv";
      f1386[31] = "@X.p+\u001d5x%\u007f:RH`6x3\u001b ";
      f1386[32] = "\u0011p}l\u0007_\rj\u007f0\u001dK\u001di4!\u001aX\u001b,o6\u001cF\r,Y-\u0019E\fWn+\u0019Y";
      f1386[33] = "=+{*-\u00016$jeL\u000f=/n?";
      f1386[34] = "4\u0004\u000biZA8\u000b\\6<^0\u001c`W\f\fc\u001eB4B\u000f$X0";
      f1386[35] = "A\u0014.LPeQ\u001cf\t\"jQM!l^|JB17H{\u0012F&\u000eZeLU^\u0007\u001f8UV=I\u001c\u007f\u0013$n\n\u001cxYG \t[>+Mb\tF|DN4XH\u0006\u001b\u0019`IPeU\u001a'\u000f\"";
      f1386[36] = "\u0010O\u0016\u001c\f\u0000\\R\u001a\n1φ \u001e\u0019\u0018[EXR\u0004\u0014M";
      f1386[37] = "v\u0003\u0015v\u0004:j\f\u0001\u001cR\u000bg\u0012\u000b,\u0006n-_\u0011\u001cJ{mRMy\u00006wb";
      f1386[38] = ":dWH a&kC\"χPe>QI~;bkC\u0013";
      f1386[39] = "5,\u0010\u0014;\u000b7l\u001eE^\u00034m\"\u0014%\u0014=x\u001f37\t4\u0011\u0004\bg\u000e!(\u0016\u00169\u001dY";
      f1386[40] = "'5#)33+:tvU,#-I\u0017e~p/jt+}7i\u0018";
      f1386[41] = "*yO1[Y+%W50Ք\u0010%\u0004iI\u0015q|M*[(";
      f1386[42] = "V\u000b\\&N'Q^N|/ϖi\u000f\u0004.D-\u0002\bQ<\u001eL\u0000\f\u0001)U#\u0003ZP'/";
      f1386[43] = "\n3eWTc\u001a;-\u0012&o\r\u007f[K@| ntCF|`3(\u0012Xr\u0003}+U\u001e\u0000";
      f1386[44] = "I='\u0006\u0000?KbtR;%H\"\u007f\u000bW\u0017\u001fd.T\n@\u0019/sRW2_`r\u0016;";
      f1386[45] = "\u0004x(o*GA>j-QMU=u5=\u007f\u0001q%oa(\u0004+gl`I\u0000,u>Q\u0014I-+>#R\u0006,oR";
      f1386[46] = "\fk\u00149o{Q;\b9\nr\f.6nla;?\u001eegg\f(xc:m\u001a \u001bs2%_R";
      f1386[47] = "{\u000b!\u00140?|^3NQΠD\u000fy\u001c:5/\b,\u000e`T-\f|\u001b+;.Z-\u0015Q";
      f1386[48] = "~C[`\u000e^y\u0016I:oƯAH\u00055\u0011G\"\u0006\u0006rW5";
      f1386[49] = " c]\u0003\u0013\u0013\"<\u000eW(\t!|\u0005\u000eD;v:TQ\u0013lpq\tWD\u001e6>\b\u0013(";
      f1386[50] = "ZGyi|\u000f\u0007\u0017ei\u0019\u0006Z\u0002O4\u007f\u0005Z\u0004x#\u0019\u0004L\u001c/fw\u0005S\u0000eY";
      f1386[51] = ":\u0014\u000eh\r-&\u001b\u001a\u0002]q&5\u0006c]|&u[?\fb(\u0016\u0015<K.Z";
      f1386[52] = "Srk2w&\u001fog$JƏc\">54?Sc:gw^";
      f1386[53] = "D\u0010\u0006&^\u0012\u0012\u000fD0b\u0005M\t\u0019W\u000e\u001e\u0012\u0018O(\fAALt";
      f1386[54] = "W\u001c\u0015D\u001e\r\u0006\u0011\u0017\u001c \u0007U\\+0jhQ\u001cO\u001bZ\u0007RJ\u001e\u0015 ";
      f1386[55] = "7Y#F\u0012u\"]gEx*5CAK\u001e)?@ev\u0018(=R\u001eJ\u001d:\"Z&J\u0019:7?";
      f1386[56] = "=sY9.D:&KcOҾ\u0002x\u0007l1]a6\u0004+w/";
      f1386[57] = "S:ru\u0018oU4\u007f$xբ2oiy\u00118\rm|x\u0011\u0003";
      f1386[58] = "g\u00101\u0000\u0002\u0001eObT9\u001bf\u000fi\rU)1I8R\u0004~i\u0012c\n\u0003\u0012t\ri\u00069\u001cj\u0019iPU\u0001u\u0013ej[\u001fa\u00133\u0006F\u0000k\u001f\tVH\u00125\u001f{\u0010\u0007\u0013qs";
      f1386[59] = "p\u00143_\u0014\\l[vNkҰ\u0013M\"XR_qC7Y\u000e";
      f1386[60] = "o[,\u000e,\u0014*Iq\b\u0010\u0016;M!\u001bj-=L+v QhU?\u0015nR/\u0013MF-R(Y.\b.\u0015n+}K.\u0012$H3HiTV\u001bpHn\u001e5Us\u000f(lhH \t)\u00146\u001bp\u0019\u0010";
      f1386[61] = "\u0002w\u007f\ta\u0014\u001exkc1H\u001eI{\u000f\"Eb&'] W\u0001h$\u001af%";
      f1386[62] = "\\p\u0019+L\u0012[%\u000bq-ƵctA#F\u0018\bs\u00141\u001cy\nwD$W\u0016\t!\u0015*-";
      f1386[63] = "JNK\u0012\u000b\u0011VA_x˞ \u0013_O\u0000\bXVM\u0012\u0006";
      f1386[64] = ")$;q{;) ;d\u001el$=\u001cq\u007ff ;5@yg.;Dd\"gr\u007f!5/e*A";
      f1386[65] = "J\u0018F\u0018vD\u0006\u0005J\u000eKэz\u0016NO'VJ\u0003J\u000b$<";
      f1386[66] = "\u001fr\u00150\"C\u001d-Fd\u0019Y\u001emM=ukI+\u001cb%<C,\u0013$k_\r/Tb\u0019\fN/S(zBMh\u0015Z)\u0001Mo_9g\u0002\n)-fhPM}_ 'Q\t\u0011";
      f1386[67] = "s8,\tQ-'bg\t`v&\u0002*T].6mo\u0012\u001fl";
      f1386[68] = "7d%8!Nrvx>\u001dWuT%,q[h\u0014z#pI7l$p Y\u000e";
      f1386[69] = "MKk7\u0005~LTw}:|ZYvWW{\\Yob^} \u000043DbCN7t\u0002\u0010\u0010\r7sHs^\u000ep5: \u001d\u000ew\u007fYn\u001eI1\r\n-\u001eN{nD.Y\b\td\u0006.DJfgP\u007fJ05|V.LBs3Wj ";
      f1386[70] = "/Z\\Ozs)TQ\u001e\u001a͠N\u000fGCs$q\rRBs\u001fr\u001aOAvm4UN\u0005\u001a";
      f1386[71] = "l_Ogvs)M\u0012aJp8Sn~&g8I.!)f*\u0016V\u007fz6:/\u0012n&59]T!'qU";
      f1386[72] = "\u0011?)O/y\u0011ljUJ|\u000e54P6p\u0019/ 0#*J0!_ |\u001b>[R+|\u0014n7O4v\u0018T2\ftr\u000e;1Z%|t";
      f1386[73] = "L-y>\u0014-\r)+}ux\u001ahy\u001c\u0012A\u001an\u0014y\u0005|\u0005*l<\u0017!\u0003\u0016(1\u0019#\u0011dn~\u0018g}";
      f1386[74] = "z\u001a\u0005\n#s{\u0005\u0019@\u001cqm\b\u0018\u007ffto\u0001\u0006[Fp|\u001d\u000eVsyza\u0003]r$o\u0003\rHsx\u0017QZ\u000ebot\u001fYI$\u001d'\\YNn~i_\u001e\b\u001c-*_\u0019B\u007fc)\u0018_0, )\u001f\u0015Sb#nYg\fmq)\r\u0015J\"pma";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f1386[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1387[var4]);
            f1386[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1386[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1387[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f1386[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1386[var4] = var13;
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
               var12 = m195(2383495151948302L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f1386[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1387[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1386[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(2383495151948302L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1386[var4] = var19;
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
               var23 = m195(2383495151948302L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 198 && var8 != 'v' && var8 != 228 && var8 != 252) {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'c') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 255) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 198) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'v') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 228) {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer060.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ը" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
