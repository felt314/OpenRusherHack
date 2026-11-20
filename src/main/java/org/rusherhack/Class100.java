package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// $VF: synthetic class
public class Class100 {
   public static Object[] f2357 = new Object[12];
   public static String[] f2358 = new String[12];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2358[var4] != null) {
         return var4;
      } else {
         Object var5 = f2357[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 23;
               case 1 -> 24;
               case 2 -> 41;
               case 3 -> 26;
               case 4 -> 61;
               case 5 -> 27;
               case 6 -> 20;
               case 7 -> 2;
               case 8 -> 8;
               case 9 -> 60;
               case 10 -> 56;
               case 11 -> 4;
               case 12 -> 38;
               case 13 -> 49;
               case 14 -> 59;
               case 15 -> 12;
               case 16 -> 15;
               case 17 -> 11;
               case 18 -> 25;
               case 19 -> 58;
               case 20 -> 47;
               case 21 -> 44;
               case 22 -> 45;
               case 23 -> 19;
               case 24 -> 33;
               case 25 -> 31;
               case 26 -> 30;
               case 27 -> 53;
               case 28 -> 3;
               case 29 -> 22;
               case 30 -> 50;
               case 31 -> 0;
               case 32 -> 10;
               case 33 -> 42;
               case 34 -> 6;
               case 35 -> 13;
               case 36 -> 9;
               case 37 -> 18;
               case 38 -> 35;
               case 39 -> 46;
               case 40 -> 36;
               case 41 -> 63;
               case 42 -> 43;
               case 43 -> 39;
               case 44 -> 62;
               case 45 -> 54;
               case 46 -> 14;
               case 47 -> 7;
               case 48 -> 40;
               case 49 -> 34;
               case 50 -> 17;
               case 51 -> 5;
               case 52 -> 37;
               case 53 -> 57;
               case 54 -> 51;
               case 55 -> 29;
               case 56 -> 28;
               case 57 -> 48;
               case 58 -> 52;
               case 59 -> 1;
               case 60 -> 16;
               case 61 -> 55;
               case 62 -> 32;
               default -> 21;
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

            f2358[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f2357[0] = "\u001dI_sFF\u0001S]/\\R\u0011P\u0016´";
      f2357[1] = "f<";
      f2357[2] = "[:{\u0003\u0007`[:l_\u000boAqlA\u000bzF\u0000=\u001eS-V3n^\u0019V\u0007k?";
      f2357[3] = int.class;
      f2358[3] = "java/lang/Integer";
      f2357[4] = "|x){6rJ]){!.FR30!0FG4Apo\u001e\u0010$r#/Tku*rg";
      f2357[5] = "{4\u0007;h\u001fp;\u0016t\t\u0011{0\u0012.";
      f2357[6] = "\t\u0015a\u0000\u0002\u0017XO6dՆu_\u0013;T\u0019\u0012\u001dX<[";
      f2357[7] = "\u007fE!3\u0002\u0006#\nwmeU'Wx92\u0002}\u0001%U\\D{\\{h\u0000\u000b-\u0002";
      f2357[8] = "?G\nuM\u0001c\b\\+*[|TVuCX\u0006\u0002T|\u0016ShVTrS<";
      f2357[9] = "R\"Jjzg\u000em\u001c4\u001d4\n0\u0013`JcPfM\f$%V;\u00101xj\u0000e";
      f2357[10] = "\u0011;Sd_ZMt\u0005:8\tI)\nno^\u0013\u007fU\u0002\u0001\u0018\u0015\"\t?]WC|";
      f2357[11] = "\u0004u.8D\u0011X:xf#RTnn3X,\u0006:qc\u001eG^{hb#";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f2357[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2358[var4]);
            f2357[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m124(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m125(Class var0, String var1, Class var2) {
      Field var3 = m124(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m125(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m126(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f2357[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2358[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f2357[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2357[var4] = var13;
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
               var12 = m123(393106580992658L, 0L);
            }
         }
      }
   }

   public static Method m127(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m128(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m127(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m128(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m129(long var0, long var2) {
      int var4 = m121(var0, var2);
      Object var5 = f2357[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2358[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m123(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m127(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f2357[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(393106580992658L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m128(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f2357[var4] = var19;
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
               var23 = m123(393106580992658L, 0L);
            }
         }
      }
   }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'T' && var8 != 219 && var8 != 'X' && var8 != 252) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 229) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'a') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'T') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 219) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'X') {
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

   public static Object m131(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m130(var0, var1, var2, var3, var6, var9);
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class100.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/é" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
