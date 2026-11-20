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

public class Renderer309 extends Renderer532 {
   public Renderer004 f5119;
   public String f5120;
   public boolean f5121;
   public static long f5122 = Class066.m4320(8326750884166234530L, -5929369891130334772L, MethodHandles.lookup().lookupClass()).m4325(20709532674430L);
   public static long[] f5123;
   public static Integer[] f5124;
   public static Object[] f5126 = new Object[75];
   public static String[] f5127 = new String[75];

   @Override
   public void render(RenderContext var1, double var2, double var4) {
        
    }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
        return false;
    }

   public Renderer309(Class212 var1, double var2, Class212 var4, Renderer004 var5) {
      super(var1, var2, var4);
      this.f5121 = false;
      this.f5120 = "";
      this.f5119 = var5;
   }

   public void m10368() {
        
    }

   @Override
   public boolean charTyped(char var1) {
      char var6 = var1;
      if (this.f5121) {
         boolean var8;
         if (this.f5119 != null) {
            var8 = true;
            boolean var10002 = true;
         } else {
            var8 = false;
         }

         boolean var5 = var8;
         if (var5) {
            if (!Character.isDigit(var1)) {
               return false;
            }

            if (Integer.parseInt(this.f5120 + var1) > 255) {
               return false;
            }
         } else {
            if (!Character.isDigit(var6 = Character.toLowerCase(var1)) && (var6 < 'a' || var6 > 'f')) {
               boolean var10 = true;
               return false;
            }

            if (this.f5120.length() == 8) {
               return false;
            }
         }

         this.f5120 = this.f5120 + var6;
         this.m10368();
         boolean var9 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double m191() {
      return 12.0;
   }

   @Override
   public boolean keyTyped(int var1, int var2, int var3) {
      if (this.f5121) {
         switch (var1) {
            case 256:
            case 257:
               this.f5121 = false;
               boolean var9 = true;
               return true;
            case 258:
            default:
               boolean var8 = true;
               return true;
            case 259:
               if (this.f5120.length() > 0) {
                  String var10001 = this.f5120;
                  int var10003 = this.f5120.length();
                  boolean var10006 = true;
                  this.f5120 = var10001.substring(0, var10003 - 1);
               }

               boolean var10002 = true;
               return true;
         }
      } else {
         return super.keyTyped(var1, var2, var3);
      }
   }

   @Override
   public boolean isHovered(double var1, double var3) {
        return false;
    }

   @Override
   public double m190() {
      long var1 = f5122 ^ 116467446259476L;
      return this.f5119 != null ? this.f5119.m190() : ((java.lang.Double)(org.rusherhack.ZkmDispatch.invoke(m174(java.lang.invoke.MethodHandles.lookup(), "p", java.lang.invoke.MethodType.methodType(double.class, java.lang.Object.class, long.class, long.class)), super.f8551,  -6448471164384162185L,  var1))).doubleValue();
   }

   static {
    }

   public static IllegalStateException m1393(Throwable var0) {
      return new IllegalStateException(var0);
   }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5127[var4] != null) {
         return var4;
      } else {
         Object var5 = f5126[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 61;
               case 1 -> 52;
               case 2 -> 51;
               case 3 -> 28;
               case 4 -> 3;
               case 5 -> 36;
               case 6 -> 19;
               case 7 -> 16;
               case 8 -> 40;
               case 9 -> 8;
               case 10 -> 17;
               case 11 -> 9;
               case 12 -> 42;
               case 13 -> 38;
               case 14 -> 4;
               case 15 -> 29;
               case 16 -> 49;
               case 17 -> 7;
               case 18 -> 23;
               case 19 -> 56;
               case 20 -> 14;
               case 21 -> 24;
               case 22 -> 39;
               case 23 -> 55;
               case 24 -> 0;
               case 25 -> 10;
               case 26 -> 46;
               case 27 -> 59;
               case 28 -> 62;
               case 29 -> 20;
               case 30 -> 33;
               case 31 -> 35;
               case 32 -> 11;
               case 33 -> 15;
               case 34 -> 57;
               case 35 -> 22;
               case 36 -> 58;
               case 37 -> 43;
               case 38 -> 27;
               case 39 -> 31;
               case 40 -> 41;
               case 41 -> 18;
               case 42 -> 32;
               case 43 -> 37;
               case 44 -> 30;
               case 45 -> 54;
               case 46 -> 50;
               case 47 -> 63;
               case 48 -> 60;
               case 49 -> 34;
               case 50 -> 13;
               case 51 -> 45;
               case 52 -> 21;
               case 53 -> 44;
               case 54 -> 26;
               case 55 -> 47;
               case 56 -> 2;
               case 57 -> 1;
               case 58 -> 48;
               case 59 -> 6;
               case 60 -> 5;
               case 61 -> 25;
               case 62 -> 12;
               default -> 53;
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

            f5127[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f5126[0] = "m?\u0017fs5q%\u0015:i!a&^+m)g#\u0004f`0kc\u0003-u4k#\u0017fB/n\"\u0002\u001bd4v$\u001e/";
      f5126[1] = int.class;
      f5127[1] = "java/lang/Integer";
      f5126[2] = "f::|q/z 8 k;j#s\u0014";
      f5126[3] = "\u001cN\u0013z[K\u0000T\u0011&A_\u0010WZĵ";
      f5126[4] = "9\u0003?5\rw%\u0019=i\u0017c5\u001avȝ";
      f5126[5] = "\u001apiL8<\u0006jk\u0010\"(\u0016i ȇ";
      f5126[6] = "9Qaty<2^p;\u00038!_`t5<6";
      f5126[7] = "5E\u000e}B3)_\f!X'9\\G҄";
      f5126[8] = "1=*vOO-'(*U[=$cǨ";
      f5126[9] = "\u001dqu|5[\u0016~d3HC\u0005ymz";
      f5126[10] = boolean.class;
      f5127[10] = "java/lang/Boolean";
      f5126[11] = "!K)\u0002S@=Q+^IT-R`OM\\+W:\u0002@E'\u0017<IOQ+K`JN[:\u0017\u0007jN[:k+BEP<\\<";
      f5126[12] = double.class;
      f5127[12] = "java/lang/Double";
      f5126[13] = "j\u00147 >\u0007v\u000e5|$\u0013f\r~Ƀ";
      f5126[14] = "\nGF\fTL\u0016]DPNX\u0006^\u000fAJP\u0000[U\fGI\f\u001bSGH]\u0000G\u000fkt\\\u000bQDPCKWq";
      f5126[15] = float.class;
      f5127[15] = "java/lang/Float";
      f5126[16] = void.class;
      f5127[16] = "java/lang/Void";
      f5126[17] = "\\\u0018G\"\u001a|A\r\u001f\u0000[qY\u000b";
      f5126[18] = "Pf_pk:[iN?\f8NbNt7";
      f5126[19] = "X\u0003\u0016\u0003J\u0014D\u0019\u0014_P\u0000T\u001a_NT\bR\u001f\u0005\u0003Y\u0011^_\u0004D\u0016\u0015_\u0014\u001cH\u00165_\u0014\u001cHz\u0000D\u0014";
      f5126[20] = "d/K(iSx5ItsGh6\u0002etTns_coRb3K(HC\u007f)Eh|";
      f5126[21] = ":Bo\u0017\"O1M~XCA:Fz\u0002";
      f5126[22] = "\u0016IXC$.\u001dFI\fF-\u0012O";
      f5126[23] = long.class;
      f5127[23] = "java/lang/Long";
      f5126[24] = "b\u0016/\u007f%0~\f-#?$n\u000ff£";
      f5126[25] = "[\u000e\u001f-:\u0006P\u0001\u000ebW\u0002P\u001d\b/`\u000fC";
      f5126[26] = char.class;
      f5127[26] = "java/lang/Character";
      f5126[27] = "D<w~9y\u00146r+\u0001v\u0001.kN}`\u001a!{\u0015?eDzi$=u\u00066\u0014%`t\u0012,)~{gCG$tos\u0010z\u007fo|\"{~+)`j\u0011#ul0\u001aK&z|j'\u0010=i-\u0001";
      f5126[28] = "lU\u0001?E.8\u000eN+{!,w\u0014.\u0016::[s`\u001a.>\\N;\u0001=o7C1\u0015)<\n\u0018*\u0006xW\bN`\u0002:-[\u0016a\u0007@";
      f5126[29] = "\n\u0002>?@f^\u0016x')ժ0K|jHzZ\u0016\"/\u0018\n";
      f5126[30] = "5a\u00056C|`xIh;Ԏ\f1\u0018dRt1j\u0003w\u0003\u001f";
      f5126[31] = "\u0012r\u00028~M\u0011&@C`\u001aS\u0002\u0018;o\u001e/rC\u007fn\u0007E/\u001d:>w";
      f5126[32] = "F)s\u001f#]\u0018w5DIЂ{x,\u0015 TF#7\u0006q";
      f5126[33] = "\u001f}TuO6Ki\u0012m&ȃ%4\u0016 G*OiHe\u0017Z";
      f5126[34] = "&GQ\u0003\u0014v5\u0001\nWv7 ;\u000eD\u001b1\f\u0016\u0012Vv*)\u0010\u0016U\u0015*7\u001dR;\u0017%(\u0000\u0007X\u0017;%Di";
      f5126[35] = "{\t:If;9\rf\u0017^ƑE[6L 6!S7\u001d!W";
      f5126[36] = "y\u0005Jit\u0005-^\u0005}JɇBYG9w\u0016s[W{;";
      f5126[37] = "\u000f_8M'\"\u000eK#\u0011HΘ>\u0005/\fu3@\u0004;\u0017)";
      f5126[38] = "\u007f$hQabi\u007ftXQXzapI\u000bb}gpP>k{\u001b)W?f}&rL,7\u0016+xX8d+pcKi\u000f&zw_:2}ad\u000eQ?wup]ldlf!6n2&bcL=j'g\u0019\tl?oacZ4>j\u001bs\u000f`0'zeP`}\u0016\"&\n0\u007f|\u007fxO`\u000f/$%W!erz`\u0007Qe{&gW5mzwf6";
      f5126[39] = "\u0007S\b'-r\u0005CJkP'TJXf0C\u0000\u0013\u000b{ )]MN+P";
      f5126[40] = "^?fvq\u0017]k$\ro@\u001f\\ua\u0000\u0014\\:y}jI\u0002\u007f)\r";
      f5126[41] = "t//\u007fXrm3q*axv22( fcHw:^=byu*\u001cq\u001fqvy\u0000pu,(<P\u0000";
      f5126[42] = "\u0013\u001aWV\u000bLMD\u0011\raɠ.EQSY\u0016B\u0007U\u000f\u0007";
      f5126[43] = "\u0003\u007f6R#P\u0001ot\u001e^\u001a@jr\u0013$\u0000[o\tVa]\\pc\u000b?\u0018\f\u00000Pb\u0000Mjm\u000e'P=>vPc\u001c\f<f\u0012/a";
      f5126[44] = "\tM8\u0016p\u001a\bB1\tOi&m\u00101OH\u000bG?MvI\u0004N ";
      f5126[45] = "\r3^=c\f\u000eg\u001cFi[LPM*\u0012\u000f\u000f6A6xRQs\u0011Fx[\rtA\"pZ\\u ";
      f5126[46] = "2\u0017TFG\rlI\u0012\u001d-\u0000b\n$EK\u0013U\u001b\fN@\u0015b\fj\u001dV\fdN\tM\\\t1v";
      f5126[47] = "(d\u0006&t\u0003v:@}\u001e\u000exyb/x\rx\u007fU8\u001e\b*t_rs\u001eqhVB";
      f5126[48] = "k\u001c9\\/0f\u00137M]2l\u0007/\\\u0019-c\u0012T\u000f\"u8\u0000e\r27t}m\u000ea+u\u00170P${\u0005\u00129Q=r>\u001e$\n,J";
      f5126[49] = "p[k.\t!2_7p1ӹN^3hJ<t]g*";
      f5126[50] = "Mb;klyLm2tS/Kw\u0002@\u0019@\u001f4dn#*Bj!>S";
      f5126[51] = "\u001c\u0005rmzV\u001d\n{rE07-MDE\u0004\u001e\u000fu6|\u0005\u0011\u0006j";
      f5126[52] = "ltg'Von3#93щ\u0003:?'Z`>a$4\u000b\u000b";
      f5126[53] = "*)VpgK)}\u0014\u000by\u001ck_Rf{\u0017\u0017)\u00177w\u0001}tIr'q";
      f5126[54] = "\u0013SAA9E\u0010\u0007\u0003:'\u0012R4V^5\u0012t%u:q@\u0012\u000bOP,\u001eW[?";
      f5126[55] = "'P=\u0000H\u0018>LcUq\u0016+w6J*\u00166V=UqSs\u000b:J\u001b\u000e-Nj:O\u0015s\n&\u000bM\u00051F[";
      f5126[56] = "!\u001dt@ Yw\fy\u0014Q@!\u000eU\u00105F!rf\u001b,\u0007}\u0011:\u00186XL\u0018fD/Z(\u0010g\u0015.;";
      f5126[57] = "}\u0014.a\u0006w(\rb?~չDN8e\u001e+9N=:\u0017";
      f5126[58] = ".PZ_~V,\u0017\u001eA\u001bʏA\u001e\u0002_rY|E\u0019L#2";
      f5126[59] = "\u0000s`\u000eS+\u0000v?\u0007l1@u9\b\u00052: gR\r&P}9\u0017]V";
      f5126[60] = "UV.mX2W\u0011js=9WTHbQ*Z('bS?Q\u0015|y@n:";
      f5126[61] = "\u000e\u0018\u0011P\n\u0006[\u0001]\u000erӊ7H\f\u0002\u001b\u000e\n\u0013\u0017\u0011J";
      f5126[62] = "U 'tTtVte\u000f^#\u0014V#bH(h f3D>\u0002}8v\u0014N\u0002tdqD*\nu5p%";
      f5126[63] = "4v_XR[`-\u0010Ll\\\u000f(GR\f\u000eo/]\u000f\t53~HWWU4d\u0015Rl";
      f5126[64] = "Ek42J\u001a\u00110{&tӤ~9'3\u001d\u001fCb< Lt";
      f5126[65] = "5T\u00057lx,H[bUv9h\u001fw4l13Z2ik.Y\u0007l,;^\r\u001c2hwo\u000f\fp$\n";
      f5126[66] = "..\u0002\u007fL.zuMkrǺ\u0015u\u0010lN8v \t \u0010";
      f5126[67] = "H%}y+9\u001c~2m\u0015Ńs-b+k6\u0017%czjW";
      f5126[68] = "\\2U9\u0013l\ba\u0016!+r]\u007fs2JxYyZ\u0003LyWy+#B~T<\u0012\"MwK\u0003";
      f5126[69] = "|8rn_N(c=zaԱGjao\bKz1z|Y ";
      f5126[70] = "\fO\u000eXX9\u000f\u001bL#RnM<\u0014^D\u0003\bILBYiU\u0017\t\u0012)i\\K\u000eBMa]\u001a\u000f#";
      f5126[71] = ")d\u0003a\u0014F:\"X5v\u001a3\u0010Z6\u0017\u0007H=U6\t\u0015+=K;M{wa\u000b \f\u0001$9\n%v";
      f5126[72] = "\u001eex#\u0010\u0000\u001d1:X\u000eW_\u0016b%\f:\u001ac:9\u0011PG=\u007fia";
      f5126[73] = "\rJ\u0007Dj=\u000e\u001eE?`jL:\u001dG{ny\u0017\u001dXdj\\s@\u0000'f@\u0019\u001d^b60\u0019\u0014\u0002efT\u0011\u0015Sd\u0007";
      f5126[74] = "7uca`tc.,u^Н\f(,>'`v{t?\"";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f5126[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5127[var4]);
            f5126[var4] = var5;
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
      Object var5 = f5126[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5127[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f5126[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5126[var4] = var13;
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
               var12 = m195(1477800691883732L, 0L);
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
      Object var5 = f5126[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5127[var4];
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
               f5126[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(1477800691883732L, 0L);
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
                     f5126[var4] = var19;
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
               var23 = m195(1477800691883732L, 0L);
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
         if (var8 != 208 && var8 != 192 && var8 != 'g' && var8 != 212) {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'p') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == '$') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 208) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 192) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'g') {
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

   public static CallSite m174(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Renderer309.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ɥ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
