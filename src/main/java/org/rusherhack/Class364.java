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
public class Class364 {
   public static int[] f5936;
   public static Object[] f5937 = new Object[12];
   public static String[] f5938 = new String[12];

   static {
      long var0 = Class066.m4320(2097867744896957982L, -8943866355601097518L, MethodHandles.lookup().lookupClass()).m4325(37218530699515L) ^ 126938712824799L;
      m122();
      f5936 = new int[((net.minecraft.util.Util.OperatingSystem[])(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "ß", java.lang.invoke.MethodType.methodType(net.minecraft.util.Util.OperatingSystem[].class, long.class, long.class)), 1858826644295969153L,  var0))).length];

      try {
         ((int[])(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(int[].class, long.class, long.class)), 1858733619372599262L,  var0)))[((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "H", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.util.Util.OperatingSystem)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(net.minecraft.util.Util.OperatingSystem.class, long.class, long.class)), 1857880293609900256L,  var0))),  1857823439307920143L,  var0))).intValue()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         ((int[])(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(int[].class, long.class, long.class)), 1858733619372599262L,  var0)))[((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "H", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.util.Util.OperatingSystem)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(net.minecraft.util.Util.OperatingSystem.class, long.class, long.class)), 1857776842508791914L,  var0))),  1857823439307920143L,  var0))).intValue()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         ((int[])(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(int[].class, long.class, long.class)), 1858733619372599262L,  var0)))[((java.lang.Integer)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "H", java.lang.invoke.MethodType.methodType(int.class, java.lang.Object.class, long.class, long.class)), ((net.minecraft.util.Util.OperatingSystem)(org.rusherhack.ZkmDispatch.invoke(m120(java.lang.invoke.MethodHandles.lookup(), "$", java.lang.invoke.MethodType.methodType(net.minecraft.util.Util.OperatingSystem.class, long.class, long.class)), 1857985152476508054L,  var0))),  1857823439307920143L,  var0))).intValue()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f5938[var4] != null) {
         return var4;
      } else {
         Object var5 = f5937[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 3;
               case 1 -> 35;
               case 2 -> 25;
               case 3 -> 44;
               case 4 -> 28;
               case 5 -> 1;
               case 6 -> 52;
               case 7 -> 34;
               case 8 -> 18;
               case 9 -> 56;
               case 10 -> 53;
               case 11 -> 40;
               case 12 -> 33;
               case 13 -> 54;
               case 14 -> 15;
               case 15 -> 23;
               case 16 -> 5;
               case 17 -> 29;
               case 18 -> 36;
               case 19 -> 58;
               case 20 -> 21;
               case 21 -> 48;
               case 22 -> 59;
               case 23 -> 55;
               case 24 -> 22;
               case 25 -> 26;
               case 26 -> 9;
               case 27 -> 4;
               case 28 -> 41;
               case 29 -> 7;
               case 30 -> 13;
               case 31 -> 61;
               case 32 -> 51;
               case 33 -> 32;
               case 34 -> 43;
               case 35 -> 49;
               case 36 -> 60;
               case 37 -> 16;
               case 38 -> 27;
               case 39 -> 14;
               case 40 -> 6;
               case 41 -> 19;
               case 42 -> 63;
               case 43 -> 8;
               case 44 -> 62;
               case 45 -> 31;
               case 46 -> 24;
               case 47 -> 17;
               case 48 -> 10;
               case 49 -> 39;
               case 50 -> 57;
               case 51 -> 20;
               case 52 -> 38;
               case 53 -> 42;
               case 54 -> 11;
               case 55 -> 2;
               case 56 -> 46;
               case 57 -> 45;
               case 58 -> 37;
               case 59 -> 50;
               case 60 -> 30;
               case 61 -> 47;
               case 62 -> 12;
               default -> 0;
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

            f5938[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f5937[0] = "6I\u0012\t\u0015=6I\u0005U\u00192,\u0002\u0005K\u0019'+sW\u0012Np;@\u0007T\u000b\u000bi\u0019^";
      f5937[1] = "Ut\f5!BcQ\f56\u001eo^\u0016~6\u0000oK\u0011\u000fdY8\u001c\u0001<4\u001f}gSemW";
      f5937[2] = "\u001e?V'!5\u0002%T{;!\u0012&\u001f\u0383";
      f5937[3] = "p\u007f";
      f5937[4] = int.class;
      f5938[4] = "java/lang/Integer";
      f5937[5] = "I;`\u0019\u001d-B4qV|#I?u\f";
      f5937[6] = "\u0014G<B\u0005\u0011F\u00103$CAO\\5_=\u0011\u0013Y7YX\u0017LB:$";
      f5937[7] = "\u0001\u0006!C\"\u0010W\u0014$CGס8\\%Pv\u000bB[8\\-";
      f5937[8] = "\u0003y8z6\u0007Q.7\u001ciDP~:uj>\u0007pe{|ORs1{\u000e";
      f5937[9] = "j\u0014\u0016c)W8C\u0019\u0005\u007f\u000f8\u0016\u001eR(WnOr:w\n3JKh \u0005";
      f5937[10] = "M>\u0014vq\u0000\u001fi\u001b\u0010'X\u001f<\u001cGp\u0000Igp//]\u0014`I}xR";
      f5937[11] = "\u0011\u00059h@ICR6\u000e\u0016\u0011C\u00071YAI\u0015X]1\u001e\u0014H[dcI\u001b";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f5937[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f5938[var4]);
            f5937[var4] = var5;
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
      Object var5 = f5937[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f5938[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f5937[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f5937[var4] = var13;
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
               var12 = m123(381467623225212L, 0L);
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
      Object var5 = f5937[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f5938[var4];
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
               f5937[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(381467623225212L, 0L);
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
                     f5937[var4] = var19;
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
               var23 = m123(381467623225212L, 0L);
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
         if (var8 != 'v' && var8 != 199 && var8 != '$' && var8 != 229) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'H') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 223) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'v') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 199) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == '$') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class364.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ί" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
