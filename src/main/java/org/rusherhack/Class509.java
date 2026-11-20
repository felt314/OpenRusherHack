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
public class Class509 {
   public static Object[] f8147 = new Object[14];
   public static String[] f8148 = new String[14];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8148[var4] != null) {
         return var4;
      } else {
         Object var5 = f8147[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 9;
               case 1 -> 28;
               case 2 -> 41;
               case 3 -> 45;
               case 4 -> 15;
               case 5 -> 4;
               case 6 -> 7;
               case 7 -> 59;
               case 8 -> 22;
               case 9 -> 63;
               case 10 -> 38;
               case 11 -> 24;
               case 12 -> 11;
               case 13 -> 34;
               case 14 -> 29;
               case 15 -> 51;
               case 16 -> 19;
               case 17 -> 3;
               case 18 -> 31;
               case 19 -> 0;
               case 20 -> 17;
               case 21 -> 46;
               case 22 -> 6;
               case 23 -> 50;
               case 24 -> 56;
               case 25 -> 39;
               case 26 -> 61;
               case 27 -> 8;
               case 28 -> 48;
               case 29 -> 12;
               case 30 -> 37;
               case 31 -> 44;
               case 32 -> 62;
               case 33 -> 55;
               case 34 -> 20;
               case 35 -> 10;
               case 36 -> 47;
               case 37 -> 40;
               case 38 -> 32;
               case 39 -> 18;
               case 40 -> 53;
               case 41 -> 33;
               case 42 -> 30;
               case 43 -> 21;
               case 44 -> 23;
               case 45 -> 5;
               case 46 -> 52;
               case 47 -> 60;
               case 48 -> 49;
               case 49 -> 1;
               case 50 -> 57;
               case 51 -> 27;
               case 52 -> 25;
               case 53 -> 2;
               case 54 -> 58;
               case 55 -> 36;
               case 56 -> 26;
               case 57 -> 43;
               case 58 -> 42;
               case 59 -> 13;
               case 60 -> 35;
               case 61 -> 14;
               case 62 -> 54;
               default -> 16;
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

            f8148[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8147[0] = "\u0003xzHd_\u001fbx\u0014~K\u000fa3\u0005yX\t$s\tbC\nc~\u0007bC\u0003d3(y^\u0005lt\u0005w^\u0005es2oZ\t";
      f8147[1] = "!\n@ojV=\u0010B3pB-\u0013\tӣ";
      f8147[2] = "rT";
      f8147[3] = "H/jM)Wa\u0016vW+\u000b{\u0002fT`\u001a|\u0011`\u0011 \u0016g\ncV-\u0018g\njQ`7|\u0017lY'\u001ar\u0017lP -j\u0013`\u0004";
      f8147[4] = int.class;
      f8148[4] = "java/lang/Integer";
      f8147[5] = "\u0001\u0005MCa\u000e\n\n\\\f\u0000\u0000\u0001\u0001XV";
      f8147[6] = "I\u0015Q\u000b\u0017RQFP4'jpor4\t\rS\u0017UV\u0011^R";
      f8147[7] = "w*$Tl6oy%ko=pj0\u0010\u0011nlu$\u0007{n}l#k";
      f8147[8] = "[>_gif\f)X;\u0019Ŝbl\u0005gp4\u0001,\u0004ff";
      f8147[9] = "Q~\"\u0019\rCI-#&0`t\u001f[EMX\r>9]\u001eY";
      f8147[10] = "0I,\u0019\u001b\u001d(\u001a-&*2\u0019)\u001a&\u0005B*K(D\u001d\u0011+";
      f8147[11] = "\u0016\nK\u0005M\u0002\u000eYJ:W\u001a\u0019VTST`N\f\u000eE\nQDE\bF0";
      f8147[12] = "YF#\"=\u001bA\u0015\"\u001d\u001f0`=\u001b[\u000fyYF#\"=\u001bA\u0015\"";
      f8147[13] = "eL\u001c\u0001h%}\u001f\u001d>T\u0001H6e](>9\f\u0007E{?";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8147[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8148[var4]);
            f8147[var4] = var5;
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
      Object var5 = f8147[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8148[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8147[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8147[var4] = var13;
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
               var12 = m123(373728081670259L, 0L);
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
      Object var5 = f8147[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8148[var4];
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
               f8147[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(373728081670259L, 0L);
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
                     f8147[var4] = var19;
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
               var23 = m123(373728081670259L, 0L);
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
         if (var8 != 204 && var8 != 201 && var8 != 181 && var8 != 194) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 207) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == '$') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 204) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 201) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 181) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class509.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ң" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
