package org.rusherhack.client;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.rusherhack.Class066;
import org.rusherhack.Class170;
import org.rusherhack.client.api.RusherHackAPI;

public class Class055 extends Renderer034<Renderer044> {
   public List<Renderer044> f1349;
   public static int[] f1350;
   public static long f1351 = Class066.m4320(-6392586825514964546L, 5287401958661633136L, MethodHandles.lookup().lookupClass()).m4325(72242862827498L);
   public static Object[] f1352 = new Object[32];
   public static String[] f1353 = new String[32];

   @Override
   public double getScale() {
      return RusherHackAPI.getThemeManager().getClickGuiHandler().getScale();
   }

   @Override
   public Color m2855() {
      long var1 = f1351 ^ 76309441902839L;
      return ((org.rusherhack.Hud388)(Class170.f3364.m7115())).getClickGuiTheme().getPrimaryColor();
   }

   @Override
   public List<Renderer044> m2852() {
      return this.f1349;
   }

   public Class055(int var1) {
        super(var1);
      Class055 var7 = this;

      this.f1349 = new ArrayList<>();
      Iterator var6;
      Iterator var8 = var6 = Class170.f3364.m7115().m12509().iterator();

      while (var8.hasNext()) {
         Util040 var4 = (Util040)var6.next();
         var8 = var6;
         var7.f1349.add(new Renderer044(var7, var4));
      }
   }

   public static void m3217(int[] var0) {
      f1350 = var0;
   }

   public static int[] m3218() {
      return f1350;
   }

   static {
      m786();
      if (m3218() != null) {
         m3217(new int[4]);
      }
   }

   public static int m156(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1353[var4] != null) {
         return var4;
      } else {
         Object var5 = f1352[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 14;
               case 1 -> 1;
               case 2 -> 23;
               case 3 -> 2;
               case 4 -> 6;
               case 5 -> 3;
               case 6 -> 51;
               case 7 -> 10;
               case 8 -> 48;
               case 9 -> 15;
               case 10 -> 22;
               case 11 -> 30;
               case 12 -> 46;
               case 13 -> 4;
               case 14 -> 59;
               case 15 -> 55;
               case 16 -> 26;
               case 17 -> 42;
               case 18 -> 29;
               case 19 -> 27;
               case 20 -> 44;
               case 21 -> 7;
               case 22 -> 63;
               case 23 -> 0;
               case 24 -> 38;
               case 25 -> 9;
               case 26 -> 49;
               case 27 -> 54;
               case 28 -> 60;
               case 29 -> 21;
               case 30 -> 53;
               case 31 -> 41;
               case 32 -> 11;
               case 33 -> 17;
               case 34 -> 16;
               case 35 -> 35;
               case 36 -> 52;
               case 37 -> 34;
               case 38 -> 58;
               case 39 -> 57;
               case 40 -> 50;
               case 41 -> 5;
               case 42 -> 20;
               case 43 -> 36;
               case 44 -> 32;
               case 45 -> 12;
               case 46 -> 62;
               case 47 -> 56;
               case 48 -> 25;
               case 49 -> 31;
               case 50 -> 40;
               case 51 -> 43;
               case 52 -> 39;
               case 53 -> 13;
               case 54 -> 37;
               case 55 -> 8;
               case 56 -> 47;
               case 57 -> 19;
               case 58 -> 18;
               case 59 -> 28;
               case 60 -> 24;
               case 61 -> 45;
               case 62 -> 61;
               default -> 33;
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

            f1353[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m786() {
      f1352[0] = "IgxoMiU}z3W}E~1\"SuC{koҀ";
      f1352[1] = "#\n\u0019\u0016W6=\u0002\u0003Y5*:\u001f";
      f1352[2] = "\u007f\u001c";
      f1352[3] = "!n";
      f1352[4] = void.class;
      f1353[4] = "java/lang/Void";
      f1352[5] = "x]4|LPdG6 VDtD}Ĺ";
      f1352[6] = "Jk\u0005x9?Vq\u0007$#+FrL5'#@w\u0016x*:L7\u0017?e>M|\u000f3e\u0003qq\u0007;.";
      f1352[7] = ".|3\t\u001a#3ik+[.+o";
      f1352[8] = "\u00166lTEi\n,n\b_}\u001a/%τ";
      f1352[9] = "@_)\u0016X\u001c\\E+JB\bLF`[F\u0000JC:\u0016K\u0019F\u0003;Q\u0004\u001dGH#]\u0004 {E+UO.NC/_O\u001b";
      f1352[10] = ".\f~V[\u001a2\u0016|\nA\u000e\"\u00157\u001bE\u0006$\u0010mVH\u001f(Pl\u0011\u0007\u001f \u0010|\u0014\u0007? \u0010|\u0014a\u000e/\u001au\u001d[- \r|";
      f1352[11] = "O%t1~%S?vmd1C<=|`9E9g1m IyAj\u007f8E%[~o;a\u0007Z";
      f1352[12] = "X\u001c\"1\u0001^D\u0006 m\u001bJT\u0005k|\u001fBR\u000011\u0012[^@0v]n[\u000b(z\u001d_\u007f\u000f+{\u001fNE,$l\u0016";
      f1352[13] = float.class;
      f1353[13] = "java/lang/Float";
      f1352[14] = "@p\u0000`Gj^x\u001a/ kOc\u0017u\u0006m";
      f1352[15] = "Q+C=\r\u0000Z$Rrl\u000eQ/V(";
      f1352[16] = boolean.class;
      f1353[16] = "java/lang/Boolean";
      f1352[17] = "B\u0006R\u0004=\u0005M\u0000\nRO\u0000\u0011\u0002(\f.\u0004\u001f1\u001e\t\u000f\u0006\u001a\u0012\u0007\u00055oB\f\u0011\u0015p\u0017C\u0004\u001b\u0003O";
      f1352[18] = "`{\b\u0006\u000b<2+\u0010\nt'd4\u001el\u001exg4\u0000\u0000\u001a<`4b";
      f1352[19] = "|\u0003N\u0005(6}\\IPK!)W4Pr&5YXT6!5;^Xs);[N\n$3E";
      f1352[20] = "Pp{>e~\u001e%ze\u0005έlp8{?s\u0001>mzd";
      f1352[21] = "\u001a@D\u007f_wAHE\u0014ԟ\u0019\u0010O@k\u0002'ZY\\/c";
      f1352[22] = "\u001cQ%8A;JX,7?Ӝ!\u001aw<\u0000&_\u001b(;UE";
      f1352[23] = "oXN\u0019]74POrӉYeWJ\r\u0000g/AVIabd_\u0016C\u000e3%CKr";
      f1352[24] = "\u0003f`\u001c`z^;\"\u001c\u001cmR%F\u001c}gV#o-{fX#\u001eZb{E4z\rd8\u0004Y";
      f1352[25] = "b33D/Fcl4\u0011LY'f3\u00120_!\u000b D&R.vr\u0014>^[";
      f1352[26] = "\t\u007f\u0018\"kMG*\u0019y\u000bё5~\u0015ru^K(\u001c{z ";
      f1352[27] = "P\u0005$[\u001fo\u001e\u0015>Qne\u0002\u0003\tK\u0003o\u0002:<M\u0007e\u0002\u0005U\u0015\u0016;\u0003\r?\u001a\u0010cU\u007f";
      f1352[28] = "Fh~oo\u0013\b?\"i\u001e\u0003\u001b\u007f\u001bnw\b\u001b\u0003qoaW\u001cx;z|\fv";
      f1352[29] = "\u000f\u000bLe\u0005`T\u0003M\u000eɕ\u000e\u0006ZQ1Zp\u0007\u0005Vd";
      f1352[30] = " |#K_fr,;G { 8\u000fLPgI)+\u0019Ae)9yN[\u001b";
      f1352[31] = "J\u0006wXJ\u0018\u001c\u000f~W4\t\u001a\bVBU\r\u0014;`Gh\u0006\u001a\u0011p&\bY\t\u000ea^U\u0004K\u000e\u001d";
   }

   public static Class m158(long var0, long var2) {
      Class var5 = null;
      int var4 = m156(var0, var2);
      Object var6 = f1352[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1353[var4]);
            f1352[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m159(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m160(Class var0, String var1, Class var2) {
      Field var3 = m159(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m160(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m161(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1352[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f1353[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m158(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m159(var12, var10, var11);
            if (var13 != null) {
               f1352[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m160(var14[var15], var10, var11);
                  if (var13 != null) {
                     f1352[var4] = var13;
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
               var12 = m158(1121229100970025L, 0L);
            }
         }
      }
   }

   public static Method m162(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m163(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m162(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m163(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m164(long var0, long var2) {
      int var4 = m156(var0, var2);
      Object var5 = f1352[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1353[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m158(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m158(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m162(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f1352[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m158(1121229100970025L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m163(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f1352[var4] = var19;
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
               var23 = m158(1121229100970025L, 0L);
            }
         }
      }
   }

   public static MethodHandle m165(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 203 && var8 != 200 && var8 != 162 && var8 != 231) {
            var11 = m164(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'Q') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 216) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m161(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 203) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 200) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 162) {
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

   public static Object m166(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m165(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class055.class, "m166", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/ҿ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
