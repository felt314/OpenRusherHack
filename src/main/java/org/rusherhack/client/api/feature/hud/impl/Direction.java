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
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.feature.hud.ShortListHudElement;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.objects.Scrollbar;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.pitch;
import org.rusherhack.command.yaw;
public class Direction extends ShortListHudElement {
   public BooleanSetting colon;
   public BooleanSetting facing;
   public BooleanSetting pitch;
   public BooleanSetting label;
   public ColorSetting f4737;
   public BooleanSetting yaw;
   public DecimalFormat f4739;
   public static long f4740 = Class066.m4320(-6232814543085236251L, -3840107186506612977L, MethodHandles.lookup().lookupClass()).m4325(37829168984986L);
   public static String[] f4741;
   public static String[] f4742;
   public static long[] f4744;
   public static Integer[] f4745;
   public static Map f4746;
   public static Object[] f4747 = new Object[76];
   public static String[] f4748 = new String[76];

   public String m9595() {
        return null;
    }

   @Override
   public Text[] getComponents() {
        return null;
    }

   public String m9596() {
        return null;
    }

   public Direction() {
        super("Direction");
      long var1 = f4740 ^ 75792265081266L;

      boolean var10007 = true;
      this.label = new BooleanSetting("Label", true);
      this.f4737 = new DirectionColor(this, "Color", new Color(0, m5165(1896, 6343786596151352668L ^ var1), m5165(12126, 6219062563931223403L ^ var1)))
         .setVisibility(() -> {
            return RusherHackAPI.getHudManager().isThemeColorSynced();
         })
         .setAlphaAllowed(false);
      boolean var10010 = true;
      this.colon = new BooleanSetting("Colon", true);
      var10010 = true;
      this.yaw = new BooleanSetting("Yaw", true);
      boolean var10009 = true;
      this.pitch = new BooleanSetting("Pitch", true);
      boolean var10008 = true;
      this.facing = new BooleanSetting("Facing", true);
      this.f4739 = new DecimalFormat("0.0");
      boolean var10003 = true;
      this.label.addSubSettings(this.f4737);
      Setting[] var10001 = new Setting[]{this.label, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.colon;
      var10001[2] = this.yaw;
      var10001[3] = this.pitch;
      var10001[4] = this.facing;
      this.registerSettings(var10001);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21118;
      if (f4745[var3] == null) {
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
         long var5 = f4744[var3];
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
         Object[] var9 = (Object[])f4746.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4746.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ȩ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f4745[var3] = var15;
      }

      return f4745[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Direction.class, "m5166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ȩ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   public static void m273() {
      f4747[0] = "\"T\f~i:<\\\u00161\u000b&;A";
      f4747[1] = "\u007f=\niH-t2\u001b&)#\u007f9\u001f|";
      f4747[2] = boolean.class;
      f4748[2] = "java/lang/Boolean";
      f4747[3] = "\u0015Yzz%Y\u0015Ym&)V\u000f\u0012m8)C\bc9`~";
      f4747[4] = float.class;
      f4748[4] = "java/lang/Float";
      f4747[5] = "\b0hq\u000eg\b0\u007f-\u0002h\u0012{\u007f3\u0002}\u0015\n.j[=";
      f4747[6] = int.class;
      f4748[6] = "java/lang/Integer";
      f4747[7] = "KK~{3^WQ|')JGR7ɓ";
      f4747[8] = "{\u0019\u0013\u0014\u001b,{\u0019\u0004H\u0017#aR\u0004V\u00176f#T\u000fEw";
      f4747[9] = "WcR(c*\"CY'reCMR,v?7";
      f4747[10] = ")\u007f\u007f&?\"\\_t).m=Q\u007f\"*7I";
      f4747[11] = "\u001d\u001dp[\u0000\"\u0001\u0007r\u0007\u001a6\u0011\u00049\u0016\u001e>\u0017\u0001c[\u0013'\u001bAb\u0001\u001b;\u0001Ax\u0017\u00182\u0011\u001bd[!4\u0000\u0000{\u0019\u00106\u0000";
      f4747[12] = "Z.0JHVQ+!\u00055NB,(L";
      f4747[13] = "Y\u0000\f$YNY\u0000\u001bxUACK\u001bfUTD:J?\u0002\u0016";
      f4747[14] = ":.&-BC:.1qNL e1oNY'\u0014g1\u001a\u001a";
      f4747[15] = "\u0001*\u0017gH\u0006t\n\u001chYI\u0015\u0004\u0017c]\u0013a";
      f4747[16] = "\u001b \u0001\tpT\u0007:\u0003Uj@\u00179Hȏ";
      f4747[17] = "H\u000bh\rF~T\u0011jQ\\jD\u0012!@XbB\u0017{\rU{NW|F@\u007fN\u0017h\rwdK\u0016}pQ\u007fS\u0010aD";
      f4747[18] = "!\u0011E\"f\n.\bGm\f\u001b(\u0019^\"$8$\u0002^\"<";
      f4747[19] = double.class;
      f4748[19] = "java/lang/Double";
      f4747[20] = "\n7\u000b+I\"\u0016-\twS6\u0006.BfT%\u0000k\u001f`O#\f+\u000b+y8\n)\tdU\u0004\u00001\u0018lU0";
      f4747[21] = "[w_l\rCGm]0\u0017WWn\u0016!\u0010DQ+K'\u000bB]k_l,S@qQ,\u0018";
      f4747[22] = "\u0006m?pY?\u001aw=,C+\ntv=G#\fq,pJ:\u00001>;J>\u001cm=pH%\u0004r90Od\bm?p{&\bf=,y/\u000fz*;E)\f";
      f4747[23] = "e0{@k'y*y\u001cq3i)2Ț";
      f4747[24] = "\u0004}&e0\u0017\u000fr7*\\\u0014\u0001p5ep";
      f4747[25] = "B=0TT#^'2\bN7N$y\u0019J?H!#TG&Da\u0010\u0016I4L#$";
      f4747[26] = "V\r\u0014k\u0016^V\r\u00037\u001aQLF\u0003)\u001aDK7StK";
      f4747[27] = "yj\rvYiep\u000f*C}usD;Gusv\u001evJl\u007f68-Xtsj\"9HwWH#";
      f4747[28] = "dDAnyyx^C2cmh]\b#genXRnj|b\u0018U9xxn[\b\tCyo{G.jknD";
      f4747[29] = "A\u0017=\u0012:Dh.!\b8\u0018r:1\u000bs\tu)7N.\u000fn/;\u000e:DI>&\u00144\u0004}`";
      f4747[30] = void.class;
      f4748[30] = "java/lang/Void";
      f4747[31] = "/Vt)A13Lvu[%#O=d\\6%\nubR05Vv)z\u0002%EgrA!\u0003K}aZ#5Vre_!";
      f4747[32] = ">^Ka?T\u0017gW{=\b\rsGxv\u0019\n`A=+\u001f\u0011fM}?T6wPg1\u0014\u0002)";
      f4747[33] = "]==i/=C5'&g=Y??an&\u0019\u001e$gm-V2\u0018}q8[5.z";
      f4747[34] = "\u0018yA\"=\u0013M9\u000eB?NK\u0005B(<]\u001d>Z\u007f9\"\u001ew\\~:YNoY(V";
      f4747[35] = "\u0001N\\{OW\u0002\u001b]=,\u000fV\u0002\u0004\"@=\u0000@Xx\u0010j\u0000O\u0006~V\u0013D\u0002\u001b*,";
      f4747[36] = "`\u0016p\u0006Vm9\u001dl\u00180\"iIw\u001bw2\u0000\u0014x\u0015\f0{D`\u0010Z\\`\u0016p\u0006Vm9\u001dl\u00180";
      f4747[37] = "\u0014j\u0006\u0002}{Jb\u0001\u0019\u0011!Bd\u0006\u0005}\u0013\u0014&_Y D\u0013x\u0005\u0002~5Ue\u000f[\u0011\u007f]x\u0006\u000e.!U\u007f\u001db";
      f4747[38] = "%\u000f(z&ey^+ Lյ\u0018Z.!,zi\u001c3+u\u0015";
      f4747[39] = "\b*UK\bV\u000b*I\nm\nX$Q\u001d\u00018\fe\nKVo\u000eiSA\u0017\u0016J$N\u0015mT\u0004:\n\u0000\u0014\u0010I'^z";
      f4747[40] = "9tV\bGee%UR-Ɍ\u0004!PSMzugMY\u0014\u0015";
      f4747[41] = "4\u001fa\n/~a_.j8(B\u0019e\u00035Ob\u0002oP%t0Z}\rD&j\u0013%\u000b\u007ft2\u0001xj";
      f4747[42] = "\u00035.\u0012\u0019 Z. L\"0<u#\u001aLlB&%\u0002S\u001c\f!-\u001eRb_'5\u0001\"";
      f4747[43] = "!p)3p'((irK0}7y-'\u0002,p%upU!:&**ik7'%K";
      f4747[44] = "\\\u000bOPS\u000f_^N\u00160W\u000bG\u0017\t\\e]\u0005KS\r2]\n\u0015UJK\u0019G\b\u00010";
      f4747[45] = "Kq%NC2\u0018w=Q3\"\u001co*IOLKq%NC2\u0018w=Q3%\u001aeuA\bwBw( \u0003(\u0011{?^P.\tdO";
      f4747[46] = "\u0006E\u0019\u0003R0\fO\bT Ȟl\u0012\u0001TN{\u0012A\u0007LQ\u000b";
      f4747[47] = "71g#7F=;vtEĴ]<k{+F8+&o ";
      f4747[48] = ")I\u001b\u001a8D}FI\u0007\tE Y\u0015\u0003uR7m\u0019\u0004u^+Y\u000fxlC&Q\u0019\u0007r\\4Ot\u001c8@(P\u0004\t7S46";
      f4747[49] = "`set\rUoizuv_lq~\u007f\n1g`b)\u0012Qapkpv\u0001oauf\bRiyj\u0016";
      f4747[50] = "\bt#BZ#\u0001,c\u0003a4T3s\\\r\u0006\u0005t/\u0004YQ\t+yU\u0011/Z-aJa`HpsZ]*Eq|;";
      f4747[51] = "AI\fN.GKC\u001d\u0019\\ȸ+B\u0001Lf\u0017RC\u001fH9";
      f4747[52] = "J\u00129FI\u0001X\u001e4\u001e8PS32K]\\c\b6ABjY\t9KT1\u0011\u001d1\u001aTJA\u00054L8";
      f4747[53] = "PRu- cZXdzRԹ:Yx/h3CXf+7";
      f4747[54] = "qfpSu!x,hIM\u007fr!OK)mr]lH'o%ft\u001f\"\u0010";
      f4747[55] = "&]T\u001aK^*CG\u0005/KH\u0001J\u001dA\u00176RL\u0005^gxUD\u0019_\u0019+S\\\u0006/";
      f4747[56] = "Id\u0014\u0010\"j\u0003i\u0015\u001fC3\u0015iK\u0017/\u0001B*\u0015AxVHqA\u001e3(\u001bwY\u0001Cg\t*K\u0011\u007f-\u0004+Dp";
      f4747[57] = "2\u000e\u001e\u0010Cnx\u0003\u001f\u001f\"7n\u0003A\u0017N\u0005:G\u0011M\u0018R2D\u0011\t\u0019 ;\u001cQH\"cr@A\u0011\u001e)\u007fANp";
      f4747[58] = "6\u0002p\u0017\u0010n<\ba@bϽ\\Uh@\f%\"\u0006nX\u0013U";
      f4747[59] = "jB?t)a`H.#[ɏ\u0000I2va1yH,r>";
      f4747[60] = "Yk@OSBN&TDhH^g{H\fZ^Ajkh\u001bSxEN\u0019]Nr\u001c!";
      f4747[61] = "_zHx`TV0PbX\f]-rt2>\\=Uh>\nJALu3\u0002\\>Rj!\u001c1%\u0018v=\u0003A0\u0017e!e";
      f4747[62] = "}\u000fY\u001c\u007f?w\u0005HK\rm\u0017\u0007\u001e\u001b2:y\n\u001aNc\u0004xS\u001f\u001e3juWJO\r";
      f4747[63] = "\u0004I\u0013_sq\u000eC\u0002\b\u0001ǯnB\u001e];!\u0017C\u0000Yd";
      f4747[64] = "cz_U8ut7K^\u0003kdvs_{p`C^_dodf:\u0002qs5fARivc\nPKf~2oG\u0006ru\t";
      f4747[65] = "\u0010+wkh-\u001a!f<\u001aΪz zi }\u0003!dm\u007f";
      f4747[66] = "k&\tT9\u0002h&\u0007@Y\u0010d6+E5:`,\u0002W4\u0005\t(\u0016S9\u000e9:\u001a^a\u007f";
      f4747[67] = "%5\u0003d J/?\u00123RӈO9\u0007'0\n+6\u001d81";
      f4747[68] = "s\rt@\u0016--\u0005s[z|)\u0012pL-(tD*\u0018z):\u001ftLEw2\u0018o";
      f4747[69] = "\t_\"Gu\u0005PT>Y\u0013^\u000e\u0003<ZzR7\r<J~4P\u0016;\u000b\u007fO\u0000\u000e>]\u0013";
      f4747[70] = "\f`v\u001d\u001fNTen\u0003$S\u0007\u0001nGDO\t>e\u001bDU";
      f4747[71] = "&\u0018|\u001fp\u0001sX3\u007fzKT\u0001z\u0003j0 \u0016aCwKp\u000ed\u0015\u001b";
      f4747[72] = "ixwQ;'jxk\u0010^{9vs\u00072Im7(]a\u001e8aj_:~>qc\u0006^\"4is\u000f/d)c*`";
      f4747[73] = "Ai\u000b|\u0007vV$\u001fw<hFe0sGrAx\ns@b+\u007f\fwWr\u0015bR.E\u0013Ai\u000b|\u0007vV$\u001fw<";
      f4747[74] = "oUse\"Td\ts\u007fG\u0005o\u0006wp\u0010R1Q/\u001c}[6Up!~\u000e7\u0013";
      f4747[75] = "JR}XZ5\u0000_|W;l\u0016_\"_W^A\u001c|\t\u0005\t@Q\"XW6\u001eY%C;8\n\u001c\"Y\u0007r\u0007\u001d-8";
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
