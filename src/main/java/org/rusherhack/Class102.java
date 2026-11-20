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
public class Class102 {
   public static Object[] f2368 = new Object[12];
   public static String[] f2369 = new String[12];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f2369[var4] != null) {
         return var4;
      } else {
         Object var5 = f2368[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 28;
               case 1 -> 49;
               case 2 -> 6;
               case 3 -> 13;
               case 4 -> 22;
               case 5 -> 17;
               case 6 -> 4;
               case 7 -> 41;
               case 8 -> 24;
               case 9 -> 8;
               case 10 -> 20;
               case 11 -> 50;
               case 12 -> 59;
               case 13 -> 37;
               case 14 -> 61;
               case 15 -> 57;
               case 16 -> 55;
               case 17 -> 63;
               case 18 -> 38;
               case 19 -> 9;
               case 20 -> 40;
               case 21 -> 0;
               case 22 -> 46;
               case 23 -> 32;
               case 24 -> 60;
               case 25 -> 23;
               case 26 -> 33;
               case 27 -> 42;
               case 28 -> 34;
               case 29 -> 15;
               case 30 -> 48;
               case 31 -> 29;
               case 32 -> 52;
               case 33 -> 25;
               case 34 -> 56;
               case 35 -> 51;
               case 36 -> 54;
               case 37 -> 1;
               case 38 -> 39;
               case 39 -> 62;
               case 40 -> 43;
               case 41 -> 5;
               case 42 -> 2;
               case 43 -> 10;
               case 44 -> 58;
               case 45 -> 21;
               case 46 -> 7;
               case 47 -> 44;
               case 48 -> 47;
               case 49 -> 11;
               case 50 -> 35;
               case 51 -> 36;
               case 52 -> 27;
               case 53 -> 14;
               case 54 -> 18;
               case 55 -> 53;
               case 56 -> 19;
               case 57 -> 45;
               case 58 -> 16;
               case 59 -> 30;
               case 60 -> 31;
               case 61 -> 26;
               case 62 -> 12;
               default -> 3;
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

            f2369[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f2368[0] = "\u0001\\\u0017]Su\u0001\\\u0000\u0001_z\u001b\u0017\u0000\u001f_o\u001cfQ@\u00078\fU\u0002\u0000MC]\rS";
      f2368[1] = int.class;
      f2369[1] = "java/lang/Integer";
      f2368[2] = "\u0007\u0017!f\u0002w\u001b\r#:\u0018c\u000b\u000eh£";
      f2368[3] = "G{";
      f2368[4] = "g9Bq']Q\u001cBq0\u0001]\u0013X:0\u001f]\u0006_Ka@\u0005QOx2\u0000O*\u001e cH";
      f2368[5] = "\u0005?XDhN\u000e0I\u000b\t@\u0005;MQ";
      f2368[6] = "xzq_9'~#* n?u}#w9e# O@c`g 6F:;";
      f2368[7] = ".\u0011H*,/m\u0012\ty\u0013Π\u0017V\u0002kh|z]\u0002mm";
      f2368[8] = "-!ttDP+x/\u000b\u001aS!#,b\u0019)1(;g\u000fH$!7\u000b";
      f2368[9] = "yT\"\"KL\u007f\ry]\u001cTtSp\nK\u000e\"\r\u001c=\u0011\u000bf\u000ee;HP";
      f2368[10] = "\b\u0006\u001fN[y\u000e_D1\fa\u0005\u0001Mf[;S^!Q\u0001>\u0017\\XWXe";
      f2368[11] = "5\u001b\u001a]&v3BA\"af1\u0005IY\u001f5%\u0013\u0015Ztk4\u0012G\"";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f2368[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f2369[var4]);
            f2368[var4] = var5;
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
      Object var5 = f2368[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f2369[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f2368[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f2368[var4] = var13;
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
               var12 = m123(391663850565305L, 0L);
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
      Object var5 = f2368[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f2369[var4];
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
               f2368[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(391663850565305L, 0L);
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
                     f2368[var4] = var19;
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
               var23 = m123(391663850565305L, 0L);
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
         if (var8 != 205 && var8 != 230 && var8 != 238 && var8 != 255) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 223) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 217) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 205) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 230) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 238) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class102.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ë" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
