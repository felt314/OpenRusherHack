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
public class Class159 {
   public static Object[] f3220 = new Object[21];
   public static String[] f3221 = new String[21];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3221[var4] != null) {
         return var4;
      } else {
         Object var5 = f3220[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 41;
               case 1 -> 31;
               case 2 -> 52;
               case 3 -> 7;
               case 4 -> 28;
               case 5 -> 53;
               case 6 -> 3;
               case 7 -> 12;
               case 8 -> 34;
               case 9 -> 26;
               case 10 -> 4;
               case 11 -> 39;
               case 12 -> 30;
               case 13 -> 13;
               case 14 -> 62;
               case 15 -> 16;
               case 16 -> 1;
               case 17 -> 46;
               case 18 -> 51;
               case 19 -> 22;
               case 20 -> 45;
               case 21 -> 59;
               case 22 -> 49;
               case 23 -> 38;
               case 24 -> 63;
               case 25 -> 43;
               case 26 -> 33;
               case 27 -> 8;
               case 28 -> 58;
               case 29 -> 25;
               case 30 -> 32;
               case 31 -> 60;
               case 32 -> 24;
               case 33 -> 61;
               case 34 -> 42;
               case 35 -> 20;
               case 36 -> 54;
               case 37 -> 21;
               case 38 -> 6;
               case 39 -> 50;
               case 40 -> 18;
               case 41 -> 44;
               case 42 -> 55;
               case 43 -> 56;
               case 44 -> 23;
               case 45 -> 11;
               case 46 -> 17;
               case 47 -> 10;
               case 48 -> 36;
               case 49 -> 47;
               case 50 -> 9;
               case 51 -> 35;
               case 52 -> 40;
               case 53 -> 2;
               case 54 -> 37;
               case 55 -> 15;
               case 56 -> 19;
               case 57 -> 48;
               case 58 -> 57;
               case 59 -> 5;
               case 60 -> 0;
               case 61 -> 14;
               case 62 -> 29;
               default -> 27;
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

            f3221[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f3220[0] = "g}!7\\\u0013g}6kP\u001c}66uP\tzGg!\u0005B-{9xB\tV*m-\b";
      f3220[1] = "|9KKof|9\\\u0017cifr\\\tc|a\u0003\u000eW47";
      f3220[2] = int.class;
      f3221[2] = "java/lang/Integer";
      f3220[3] = "\u001cS/@0\u0011*v/@'M&y5\u000b'S&l2zv\u0007s'eF(^4l\u001e\u0017|\u000b~$";
      f3220[4] = "\u000ft\u000f8.79Q\u000f89k5^\u0015s9u5K\u0012\u0002k+b\u0000Z";
      f3220[5] = "k\t\u001c/N;w\u0013\u001esT/g\u0010UŘ";
      f3220[6] = "J_";
      f3220[7] = "\u0002t";
      f3220[8] = "\u0011\u000b\u0018nuG\u001a\u0004\t!\u0014I\u0011\u000f\r{";
      f3220[9] = "p\u000e#\\kkdMaeu;wTp2\"`+\u000f-eqd%\tlTe'g";
      f3220[10] = "~fjxFM\u007fad\u0015\u001fQj9i|\u001c+?55t\u001eF793\u007fx";
      f3220[11] = "cb\u007fg;3beq\n{<\u007f!wq\u0005n \" mj8+9v\n";
      f3220[12] = "\u001aV\u001e-W\u001a\u0016\u000f\u0004s1ш&R\u0015cR\nG\u0005\u001bwV";
      f3220[13] = "\\/8M\u000eNHlzt\u0019\u0005Zpa\u001d\u001a\u007f\u000f|=\u0015\u0018\u0012\u0007p;\u001e~";
      f3220[14] = "hAC\u001f;c|\u0002\u0001&%3o\u001b\u0010qrh3O@&!l=F\f\u00175/\u007f";
      f3220[15] = "\u000e}0#:\u0007\u001a>r\u001a$W\t'cMs\fUs6\u001a \b[z\u007f+4K\u0019";
      f3220[16] = ";.'yl(:))\u0014</.t.Co~{ Bll+..$mk%";
      f3220[17] = "X\u001bWJ\u0007!TBM\u0014aǠd\u001f\\\u0004\u00021\u0005HR\u0010\u0006";
      f3220[18] = "\u0019LX`]\u0018\r\u000f\u001aYS@\u0017\u000f\n\"-\u0013\u001a\u001c\r:\u0015NM\u001f\tY";
      f3220[19] = "e\u000e%{a\u0016qMgB\u007fFbTv\u0015(\u001d>\u0000'B{\u00190\tjsoZr";
      f3220[20] = "#]5a7t\"Z;\fgs6\u0007<[4\"b[Pt7w6]6u0y";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f3220[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3221[var4]);
            f3220[var4] = var5;
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
      Object var5 = f3220[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3221[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f3220[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3220[var4] = var13;
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
               var12 = m123(620431638213688L, 0L);
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
      Object var5 = f3220[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3221[var4];
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
               f3220[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(620431638213688L, 0L);
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
                     f3220[var4] = var19;
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
               var23 = m123(620431638213688L, 0L);
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
         if (var8 != 'y' && var8 != 'V' && var8 != 232 && var8 != 'W') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'j') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'H') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'y') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'V') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 232) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class159.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ř" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
