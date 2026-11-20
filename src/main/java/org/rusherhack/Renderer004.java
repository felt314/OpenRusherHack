package org.rusherhack;

import java.awt.Color;
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
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.RenderContext;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.utils.ColorUtils;

public class Renderer004 extends Renderer532 {
   public double f078;
   public double f079;
   public boolean f080;
   public Enum161 f081;
   public static long f082 = Class066.m4320(4420770256424000657L, 2816438356991461362L, MethodHandles.lookup().lookupClass()).m4325(138956638267486L);
   public static long f083;
   public static Object[] f084 = new Object[60];
   public static String[] f085 = new String[60];

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.f080 = true;
      super.mouseClicked(var1, var3, var5);
      return true;
   }

   @Override
   public double m190() {
      return this.f079;
   }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   @Override
   public double m191() {
      return 6.0;
   }

   @Override
   public void mouseReleased(double var1, double var3, int var5) {
      this.f080 = false;
   }

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   public Renderer004(Class212 var1, double var2, Class212 var4, Enum161 var5) {
        super(var1, var2, var4);
      long var6 = f082 ^ 48080034785575L;

      this.f080 = false;
      this.f081 = var5;
      this.f079 = ((org.rusherhack.Renderer107)(super.f8551)).getWidth() - 2.0;
      if (var5 != Enum161.f3243) {
         this.f079 = (((org.rusherhack.Renderer107)(super.f8551)).getWidth() - 4.0) / 3.0;
      }

      switch (this.f081.ordinal()) {
         case 1:
            this.f078 = (int)(this.f079 + 1.0);
            return;
         case 2:
            this.f078 = (int)(this.f079 * 2.0 + 2.0);
            return;
         default:
            this.f078 = 0.0;
      }
   }

   static {
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f085[var4] != null) {
         return var4;
      } else {
         Object var5 = f084[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 40;
               case 1 -> 46;
               case 2 -> 50;
               case 3 -> 53;
               case 4 -> 58;
               case 5 -> 51;
               case 6 -> 32;
               case 7 -> 60;
               case 8 -> 38;
               case 9 -> 34;
               case 10 -> 17;
               case 11 -> 25;
               case 12 -> 52;
               case 13 -> 43;
               case 14 -> 7;
               case 15 -> 11;
               case 16 -> 54;
               case 17 -> 33;
               case 18 -> 42;
               case 19 -> 16;
               case 20 -> 49;
               case 21 -> 24;
               case 22 -> 55;
               case 23 -> 9;
               case 24 -> 44;
               case 25 -> 15;
               case 26 -> 39;
               case 27 -> 21;
               case 28 -> 37;
               case 29 -> 27;
               case 30 -> 18;
               case 31 -> 3;
               case 32 -> 28;
               case 33 -> 31;
               case 34 -> 14;
               case 35 -> 19;
               case 36 -> 5;
               case 37 -> 45;
               case 38 -> 63;
               case 39 -> 61;
               case 40 -> 22;
               case 41 -> 13;
               case 42 -> 57;
               case 43 -> 56;
               case 44 -> 48;
               case 45 -> 6;
               case 46 -> 59;
               case 47 -> 36;
               case 48 -> 41;
               case 49 -> 23;
               case 50 -> 4;
               case 51 -> 26;
               case 52 -> 35;
               case 53 -> 2;
               case 54 -> 10;
               case 55 -> 30;
               case 56 -> 0;
               case 57 -> 12;
               case 58 -> 29;
               case 59 -> 1;
               case 60 -> 47;
               case 61 -> 8;
               case 62 -> 62;
               default -> 20;
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

            f085[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f084[0] = "q\u001a\u0013*&)m\u0000\u0011v<=}\u0003ZB";
      f084[1] = boolean.class;
      f085[1] = "java/lang/Boolean";
      f084[2] = "\\'\u0004)k]@=\u0006uqIP>MŦ";
      f084[3] = "hU1PF\u000btO3\f\\\u001fdLx\u008c";
      f084[4] = double.class;
      f085[4] = "java/lang/Double";
      f084[5] = int.class;
      f085[5] = "java/lang/Integer";
      f084[6] = " )\u0016\f~S<3\u0014PdG,0_Ȥ";
      f084[7] = "\nAr3$\r\u0016[po>\u0019\u0006X;ɩ";
      f084[8] = "g\u007fqC\fK{es\u001f\u0016_kf8Һ";
      f084[9] = "OMhZtrSWj\u0006nfCT!Ǆ";
      f084[10] = "6f\u0014#{S+sL\u0001:^3u";
      f084[11] = "N0\u0010\u001b)\u001eR*\u0012G3\nB)YV7\u0002D,\u0003\u001b:\u001bHl\u0004P/\u001fH,\u0010\u001b\u0018\u0004M-\u0005f>\u001fU+\u0019R";
      f084[12] = void.class;
      f085[12] = "java/lang/Void";
      f084[13] = "#\u0013N@5O?\tL\u001c/[/\n\u0007\r+S)\u000f]@&J%O[\u000b)^)\u0013\u0007'\u0014Y%\u0012Z\u00015[.\rL";
      f084[14] = "\u0019\u0018d\u0014jk\u0005\u0002fHp\u007f\u0015\u0001-Ytw\u0013\u0004w\u0014yn\u001fDq_vz\u0013\u0018-sJ{\u0018\u000efH}lD.";
      f084[15] = float.class;
      f085[15] = "java/lang/Float";
      f084[16] = "|H\u000f9\u0011r`R\re\u000bfpQFt\fuv\u0014\u001dc\nk`\u0014+x\u000fhao\u001c~\u000ft";
      f084[17] = "\fw\u00152\\E\u0007x\u0004}=K\fs\u0000'";
      f084[18] = "v;\u001f,jqw'\r|\u0016P\u0013\u001b/S\u0016 $+[ix!89\u000b";
      f084[19] = "{\n#/w\fz\u000b?\u0015ԃi G)$u\u0014+Mz%\u0012";
      f084[20] = "\u0002xY^Mx\u0000\u007fJ\u0002pɐ>9\r\u0003\u000flDj\bPO\t";
      f084[21] = "\u0013>\u000bt\u00107\u00118Ku\u007f?A89 \u00070EDL\u007f@/I>\u001fz\u0013o,";
      f084[22] = "X}\u0014}7:\u00008\t|Eѹe?Ayt#\u00184K*u";
      f084[23] = "/LTecTv\rXx\u0000Ǽ\u0011MRqxGp\u0018\u0006da:";
      f084[24] = "hglD7\u001d yhM\u0006%Q!x\u001e7^#if\u001a>";
      f084[25] = "\"Eo.HEy@~3\"\u0007x\u0018h3E\u0006Y\u001ecH\u0019MyHt5\u0012G*I\u0013s\u0013\u0016\"\u001enx\u0019E#y(yHMt\u0004#s\u001bL\u0013B\"\"\u0013\u001bnI(q\u0012|#\u001dz0_\u001dvIo)\"";
      f084[26] = "rI[w\t28^\u0000jgZ/I\ny=`(O\n`\bi.3X7\r<$NS=^=C\bRlVj>\u0003X?W\rx\u0002\t7\u0000ps\bZ6g6rYRa\u001a=x\nS\u0006^f$U\tg\ff{\fc?\fj%Y\u0002m\f5|3\nbXj\u007fK\rb\u0015=C\u000fX9\u0018h9\\]jX\r\u007f\b\\y\u0002w,\r\u000f9g='Z\u001b{\u0006hsO\u0002\u0006";
      f084[27] = "C$\u0015K\u0019&A\"UJv.\u0011\"4\u0016\u001aA@eQ\u0004\u0013;\u0013`\u0002Dv";
      f084[28] = "R\\sA}(S]o{qM\u000fI+\u001c\"}\n^oC\u0018p[\u0018tA(uL\\+{";
      f084[29] = "#\u0004Hy.\n{AUx\\Ⱥ\u001eC\u001du!\u0017p\u001a\\y<";
      f084[30] = "R4p.Z\\S(bt&h \u0015\r\"KOT%c#W]\u0004";
      f084[31] = "`T\u0007h\u0010}aH\u00158lW\u001ev:\r;\\\u0005p+QS~\"\u0000\u0006?Rb0P";
      f084[32] = "\u000fh6\u0011}C\u000et$A\u0001gtL\u0000k\u0001\u0012]xrTo\u0013Aj\"";
      f084[33] = "8>\u0010{\u0006\u0001:8Pzi\u001dj81&\u0005f;\u007fT4\f\u001chz\u0007tiVc-\u00136\b\u000378\nK";
      f084[34] = "\u001e\u0000~\"FyFEc#4hN\u0005@!RkN\u0003w646YAk\"\u000b|N\u001avL";
      f084[35] = "S>~\"7U\n\u007fr?Tҏm0f$dT\n2`de";
      f084[36] = "l\u001e.\u000f\u0015pm\u001f25\u0011nL\u00050X\nx`bu\u0004\u001a$k\u001f~\u000eI%\fY\u007f_ArqRu\f@\u00155\t)S\u001atg\tv\np";
      f084[37] = "\u001d\u001a\u0018\u000bF*\u001c\u0006\n[:+O\u000b?}pD\u001eLZM_>MI\t\r:";
      f084[38] = "5{\u001b4\u001bn4g\tdg_JW:@g?gk_q\t>{y\u000f";
      f084[39] = "\u0014tJ\u0000K^Hl\r[:Ѱ..\u0005W\u000bUS%\u000f\u0004\n2";
      f084[40] = "LuqggjMtm]Ғ\u000f\u00178{ler\u001c2(m\u0002";
      f084[41] = "\u0007I)4\u00124\u0005Oi5}<UO\u001d~\u0010>^3n?B,]I=:\u0011l8";
      f084[42] = "UjG[:\r\u001f}\u001cFT^\u001ey\u0000e.[\bq\u0012L(h\t{\u0003C2]\u0000}\u007f\u0011eXUw\u0002\u001ao\u000bT\u0010D\u001b>\u0003\u0003mO\u0011m\u0002d+N@eU\u0019 D\u0013d2_!\u0015\u001b3OT+F\u001aT\tUzNM)\u0002_)O*o\u0003\u000e!\u0018Wd\t] \u007f\u0016o\r\u001bu\u0005Ej^[\u0010C\u0011kM\u0001j\u0010\u00148\rd \u001bC,O\u0005uOV52";
      f084[43] = "\b\u0002\u0000R\u0017>\t\u0003\u001chˋ[Q\u0015\u0007\u000e\u0018:\u0003\u0015XW";
      f084[44] = "7v\u0014\u0006\u001fy6w\b<ԗ\u001cnu\u001f\rKn&k\u001b\u0004";
      f084[45] = "\u0012IG/\u007f\u001eNQ\u0000t\u000eˏ(\u0013\bx?\u0015U\u0018\u0002+>r";
      f084[46] = "\u001d#/]6SA;h\u0006GPJ>\u000e\u0001+CGBjQ-\u000e@?a[~\u000f'";
      f084[47] = ",\u001bN\u000f'md\u0005J\u0006\u0016xo\bDX\u007f{\u0015X\u001e\u0001izo\u000b\u001bR)\u001f";
      f084[48] = "!\fBHh4 \r^rҢQzAHCj,qK\u001bB";
      f084[49] = "\u000e\u0011I1}.\f\u0017\t0\u00122\\\u0017}{\u007f$Wk\u000e:-6T\u0011]?~v1[Vhj4P\u000e\u0002}sI";
      f084[50] = "D%xcFL^)$h~YT $i\u0006LT$$y\u000f%\u0011$?+\u0002K\u00108-{~\u0019\u0015v=w\u0004J\u0010%}\u0012AHSp>|@TA B";
      f084[51] = "\u0001\u0016\u001b4\u000e2Z\u0013\n)dsWR<9\u0005pKM\u001d\u0018\u0003{0\u001a\u0003;\u001cvQOW.\u0005\u000b";
      f084[52] = "+\u0018\u0019\\$\r*\u0004\u000b\fX)P()eg\u000eiL\u0018\u000bf\u0012{\u001c";
      f084[53] = "+]L\u000e>L)[\f\u000fQDy[iW5Vy'\bS,\u0012hI\tO>B\u0014";
      f084[54] = "S\u001eZ#]L\u0019\t\u0001>3\u001f\u0018\r\u001d\b^\u0018\u001e\r\u0004=W\u001eb_S8\u0002\u0014\u001fTYk\u0003sYU\bcT\u000eR_[b3HS\u000eS5NCY]RR\bB\bU\u0005/\u0003H[Tbn\bL\u001d\u0001\u0018=\r\u001f]dR6Z\u000b\u001f\u0005\u0007bO\u0012b";
      f084[55] = "#fi^(!!`)_G=q`X\n:+\u001c )Q8#fs,\u0002xF,x{\u0016:'y,n\u000fG";
      f084[56] = ")zRX/0+|\u0012Y@8{|c\f=:\u0016<\u0012W?2lo\u0017\u0004\u007fW";
      f084[57] = "nH\u0017\u001a28oI\u000b \f]5\u0005\u001d\u00110 >\u000fN\u0010";
      f084[58] = "&=Tv\u007f\u0016$;\u0014w\u0010\nt;f\"h\u0011p\u000eK\"w\u000et+/z+Nf\"U).\u001d&G\u001f\"y\td&Jvl\u0010\u0019";
      f084[59] = "B]X,\u000b \nC\\%:?\u0002_ZyAR\u0010IYeF\"\u000b@Uz:k\u0010EUw[9\u0010\u001a\f\u001d";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f084[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f085[var4]);
            f084[var4] = var5;
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
      Object var5 = f084[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f085[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f084[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f084[var4] = var13;
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
               var12 = m195(1253491034785476L, 0L);
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
      Object var5 = f084[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f085[var4];
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
               f084[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1253491034785476L, 0L);
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
                     f084[var4] = var19;
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
               var23 = m195(1253491034785476L, 0L);
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
         if (var8 != 237 && var8 != 'J' && var8 != 'T' && var8 != 164) {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'z') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'd') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 237) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'J') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'T') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer004.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/F" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
