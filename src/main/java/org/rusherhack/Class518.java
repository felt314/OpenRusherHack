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
public class Class518 {
   public static Object[] f8307 = new Object[14];
   public static String[] f8308 = new String[14];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8308[var4] != null) {
         return var4;
      } else {
         Object var5 = f8307[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0:
                  var10000 = 8;
                  break;
               case 1:
                  var10000 = 21;
                  break;
               case 2:
                  var10000 = 37;
                  break;
               case 3:
                  var10000 = 60;
                  break;
               case 4:
                  var10000 = 17;
                  break;
               case 5:
                  var10000 = 34;
                  break;
               case 6:
                  var10000 = 42;
                  break;
               case 7:
                  var10000 = 45;
                  break;
               case 8:
                  var10000 = 13;
                  break;
               case 9:
                  var10000 = 55;
                  break;
               case 10:
                  var10000 = 40;
                  break;
               case 11:
                  var10000 = 29;
                  break;
               case 12:
                  var10000 = 10;
                  break;
               case 13:
                  var10000 = 49;
                  break;
               case 14:
                  var10000 = 43;
                  break;
               case 15:
                  var10000 = 52;
                  break;
               case 16:
                  var10000 = 3;
                  break;
               case 17:
                  var10000 = 46;
                  break;
               case 18:
                  var10000 = 7;
                  break;
               case 19:
                  var10000 = 16;
                  break;
               case 20:
                  var10000 = 5;
                  break;
               case 21:
                  var10000 = 36;
                  break;
               case 22:
                  var10000 = 2;
                  break;
               case 23:
                  var10000 = 12;
                  break;
               case 24:
                  var10000 = 20;
                  break;
               case 25:
                  var10000 = 62;
                  break;
               case 26:
                  var10000 = 0;
                  break;
               case 27:
                  var10000 = 44;
                  break;
               case 28:
                  var10000 = 61;
                  break;
               case 29:
                  var10000 = 48;
                  break;
               case 30:
                  var10000 = 1;
                  break;
               case 31:
                  var10000 = 23;
                  break;
               case 32:
                  var10000 = 50;
                  break;
               case 33:
                  var10000 = 25;
                  break;
               case 34:
                  var10000 = 59;
                  break;
               case 35:
                  var10000 = 27;
                  break;
               case 36:
                  var10000 = 31;
                  break;
               case 37:
                  var10000 = 15;
                  break;
               case 38:
                  var10000 = 56;
                  break;
               case 39:
                  var10000 = 22;
                  break;
               case 40:
                  var10000 = 9;
                  break;
               case 41:
                  var10000 = 47;
                  break;
               case 42:
                  var10000 = 53;
                  break;
               case 43:
                  var10000 = 33;
                  break;
               case 44:
                  var10000 = 26;
                  break;
               case 45:
                  var10000 = 35;
                  break;
               case 46:
                  var10000 = 14;
                  break;
               case 47:
                  var10000 = 63;
                  break;
               case 48:
                  var10000 = 11;
                  break;
               case 49:
                  var10000 = 4;
                  break;
               case 50:
                  var10000 = 30;
                  break;
               case 51:
                  var10000 = 32;
                  break;
               case 52:
                  var10000 = 51;
                  break;
               case 53:
                  var10000 = 6;
                  break;
               case 54:
                  var10000 = 24;
                  break;
               case 55:
                  var10000 = 58;
                  break;
               case 56:
                  var10000 = 18;
                  break;
               case 57:
                  var10000 = 54;
                  break;
               case 58:
                  var10000 = 57;
                  break;
               case 59:
                  var10000 = 28;
                  break;
               case 60:
                  var10000 = 41;
                  break;
               case 61:
                  var10000 = 38;
                  break;
               case 62:
                  var10000 = 19;
                  break;
               default:
                  var10000 = 39;
            }

            var6 = var10000;
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

            f8308[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8307[0] = "U1nl\r\u0005I+l0\u0017\u0011Y('Ώ";
      f8307[1] = int.class;
      f8308[1] = "java/lang/Integer";
      f8307[2] = "'I<PcX;S>\fyL+PuӉ";
      f8307[3] = "kd";
      f8307[4] = "\u0010\u0017]bh_9.Axj\u0003#:Q{!μp";
      f8307[5] = "Ok40\u0019KDd%\u007fxEOo!%";
      f8307[6] = "c\u0016V\u0007v-3B\u0007n*&3\u001e\u0001\u0007)\\$\u001cY\u0017'-8\u0010\tn";
      f8307[7] = "u-%lns%yt\u0005y\u0002u-%lns%yt";
      f8307[8] = "d\b\r\u00120p4\\\\{a\u0001d\b\r\u00120p4\\\\";
      f8307[9] = "\u0007N*\"\u0002W]N>1~њ>\f5r\u001a\u0010YMd$\u0003";
      f8307[10] = "&\u0018xP\u001eFvL)9o7&\u0018xP\u001eFvL)";
      f8307[11] = "\u000e}Z/5!^)\u000bFjP\u000e}Z/5!^)\u000b";
      f8307[12] = "\u0001#\u001adQSQwK\r\u0014KY7Fvj\u0018@+Kb\tH\u00018R\r";
      f8307[13] = "3\u0004]\"7ecP\fKB\u00143\u0004]\"7ecP\f";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8307[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8308[var4]);
            f8307[var4] = var5;
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
      Object var5 = f8307[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8308[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8307[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8307[var4] = var13;
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
               var12 = m123(403020099580371L, 0L);
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
      Object var5 = f8307[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8308[var4];
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
               f8307[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(403020099580371L, 0L);
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
                     f8307[var4] = var19;
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
               var23 = m123(403020099580371L, 0L);
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
         if (var8 != 'u' && var8 != 'A' && var8 != 210 && var8 != 'I') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 212) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'C') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'u') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'A') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 210) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class518.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ҷ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
