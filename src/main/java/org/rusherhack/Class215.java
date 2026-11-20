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
public class Class215 {
   public static Object[] f4001 = new Object[21];
   public static String[] f4002 = new String[21];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4002[var4] != null) {
         return var4;
      } else {
         Object var5 = f4001[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 13;
               case 1 -> 6;
               case 2 -> 24;
               case 3 -> 10;
               case 4 -> 20;
               case 5 -> 19;
               case 6 -> 54;
               case 7 -> 18;
               case 8 -> 8;
               case 9 -> 2;
               case 10 -> 53;
               case 11 -> 43;
               case 12 -> 0;
               case 13 -> 50;
               case 14 -> 12;
               case 15 -> 46;
               case 16 -> 59;
               case 17 -> 25;
               case 18 -> 49;
               case 19 -> 32;
               case 20 -> 35;
               case 21 -> 15;
               case 22 -> 1;
               case 23 -> 44;
               case 24 -> 45;
               case 25 -> 37;
               case 26 -> 14;
               case 27 -> 39;
               case 28 -> 48;
               case 29 -> 63;
               case 30 -> 23;
               case 31 -> 17;
               case 32 -> 27;
               case 33 -> 38;
               case 34 -> 51;
               case 35 -> 29;
               case 36 -> 58;
               case 37 -> 36;
               case 38 -> 5;
               case 39 -> 11;
               case 40 -> 7;
               case 41 -> 61;
               case 42 -> 4;
               case 43 -> 21;
               case 44 -> 41;
               case 45 -> 30;
               case 46 -> 62;
               case 47 -> 56;
               case 48 -> 26;
               case 49 -> 9;
               case 50 -> 31;
               case 51 -> 3;
               case 52 -> 55;
               case 53 -> 34;
               case 54 -> 40;
               case 55 -> 42;
               case 56 -> 33;
               case 57 -> 22;
               case 58 -> 52;
               case 59 -> 47;
               case 60 -> 60;
               case 61 -> 16;
               case 62 -> 28;
               default -> 57;
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

            f4002[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f4001[0] = "RE \u00177\u001aN_\"K-\u000e^\\iƙ";
      f4001[1] = "~^!\u007f'YbD##=MrGh29EtB2\u007f4\\x\u0002#'0Be_h#0BuI4\u007f\u0010ZtB2\u00030BuI4\u0014;XxX?u\u001cXtA\u0000#4At|'#!_5|'#!";
      f4001[2] = "sw \u0003=-om\"_'9\u007fniƑ";
      f4001[3] = "?\u001d";
      f4001[4] = "xqU{$UQHIa&\tK\\YbmǛ\u0018";
      f4001[5] = int.class;
      f4002[5] = "java/lang/Integer";
      f4001[6] = "c.J$\\\u001bJ\u0017V>^GP\u0003F=\u0015VT\u000b@8O\u001bY\u0012Lx^C]\fQ%\u0015G]\fA3I\u001b}\u0014@8Og]\fA3IpV\u0016L\"B\u0011q\u0016@;}GY\u000f@\u0006ZGL\u0011\u0001\u0006ZGLY";
      f4001[7] = "T(";
      f4001[8] = "J\u0000_c\u0007zA\u000fN,ftJ\u0004Jv";
      f4001[9] = "\fl6[t\u0010Vovb~|\fl6[t\u0010Vov";
      f4001[10] = "Nl\u0010}\u001b4\u0014oPD\u0019XNl\u0010}\u001b4\u0014oP";
      f4001[11] = "p{\u0002O4]*xBv\u00181p{\u0002O4]*xB";
      f4001[12] = "\u001a\u001f;&[\u0012^\t+M)18\"\u0005\u001cd\t\u0018\u00012r\u0001M\u000e\u0011";
      f4001[13] = "2.\u001c+XFv8\f@\u0000Y 3\u0018)\u0003#w3\f [C#b\u000e1g";
      f4001[14] = "$o]5 %`yM^^\u001c\u0017V? c\"1,Zdu2";
      f4001[15] = "UI\u0007g\rp\u0011_\u0017\fL|OH\bw2)RGY|[+MD\u001f\f";
      f4001[16] = ">0\u0004$Zc9$\u0015f5ј\u0007i\u00141I:c?R/Z";
      f4001[17] = "yu@KB?#v\u0000rZ:zp\u0011\t$ieaB\u0015O=zvLr";
      f4001[18] = "\u0004=m%i2^>-\u001ce^\u0004=m%i2^>-";
      f4001[19] = ";_*Es\u0007a\\j|r\u00110Fp\u0015qkgFd\u001c)\u000b3\u0017f\r\u0015";
      f4001[20] = "\u0006;f\u0002j|\u0001/w@\u0005ņ?bv\u0017y%[40\tj";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f4001[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4002[var4]);
            f4001[var4] = var5;
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
      Object var5 = f4001[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4002[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f4001[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4001[var4] = var13;
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
               var12 = m123(582360381103786L, 0L);
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
      Object var5 = f4001[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4002[var4];
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
               f4001[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(582360381103786L, 0L);
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
                     f4001[var4] = var19;
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
               var23 = m123(582360381103786L, 0L);
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
         if (var8 != '$' && var8 != 224 && var8 != 'y' && var8 != 'S') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 210) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 205) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == '$') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 224) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'y') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class215.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ƽ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
