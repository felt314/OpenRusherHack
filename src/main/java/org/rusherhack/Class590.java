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
public class Class590 {
   public static Object[] f9370 = new Object[29];
   public static String[] f9371 = new String[29];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9371[var4] != null) {
         return var4;
      } else {
         Object var5 = f9370[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 6;
               case 1 -> 9;
               case 2 -> 40;
               case 3 -> 59;
               case 4 -> 23;
               case 5 -> 42;
               case 6 -> 36;
               case 7 -> 37;
               case 8 -> 63;
               case 9 -> 50;
               case 10 -> 14;
               case 11 -> 41;
               case 12 -> 1;
               case 13 -> 51;
               case 14 -> 24;
               case 15 -> 62;
               case 16 -> 38;
               case 17 -> 44;
               case 18 -> 28;
               case 19 -> 16;
               case 20 -> 0;
               case 21 -> 25;
               case 22 -> 11;
               case 23 -> 21;
               case 24 -> 27;
               case 25 -> 54;
               case 26 -> 26;
               case 27 -> 19;
               case 28 -> 29;
               case 29 -> 22;
               case 30 -> 3;
               case 31 -> 34;
               case 32 -> 48;
               case 33 -> 13;
               case 34 -> 18;
               case 35 -> 35;
               case 36 -> 47;
               case 37 -> 53;
               case 38 -> 56;
               case 39 -> 15;
               case 40 -> 57;
               case 41 -> 2;
               case 42 -> 32;
               case 43 -> 10;
               case 44 -> 49;
               case 45 -> 45;
               case 46 -> 4;
               case 47 -> 43;
               case 48 -> 58;
               case 49 -> 55;
               case 50 -> 39;
               case 51 -> 17;
               case 52 -> 60;
               case 53 -> 31;
               case 54 -> 20;
               case 55 -> 61;
               case 56 -> 30;
               case 57 -> 52;
               case 58 -> 12;
               case 59 -> 5;
               case 60 -> 33;
               case 61 -> 46;
               case 62 -> 7;
               default -> 8;
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

            f9371[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f9370[0] = "?3-]=\u001c?3:\u00011\u0013%x:\u001f1\u0006\"\tk@eE";
      f9370[1] = "Q\u000etISTg+tID\bk$n\u0002D\u0016k1is\u0015I?r!";
      f9370[2] = "\u0011wz<B]\u0011wm`NR\u000b<m~NG\fM<!\u001a\u0004[qbs\\G  ='\u001d";
      f9370[3] = int.class;
      f9371[3] = "java/lang/Integer";
      f9370[4] = "!R(*;K\u0017w(*,\u0017\u001bx2a,\t\u001bm5\u0010}VO.b,#\u0004\tm\u0019}|PH%";
      f9370[5] = "}\u000f+mr\u001c}\u000f<1~\u0013gD</~\u0006`5mp*E7\t3\"l\u0006LXlv.";
      f9370[6] = "(C=\u000b]w4Y?WGc.Ztհ";
      f9370[7] = "V\t";
      f9370[8] = "\u001e?";
      f9370[9] = "1l";
      f9370[10] = "YeBC\u001c\u0001o@BC\u000b]cOX\b\u000bCcZ_yZ\u001c7\u0019\bE\u0004NqZs\u0014[\u001a3\u0012";
      f9370[11] = "\u001f4\u001b\u0012\u0001\u0019\u0014;\n]`\u0017\u001f0\u000e\u0007";
      f9370[12] = "@9bd08E%1Zp0E\"f!\u000e`\u0019oraa2H!iZ";
      f9370[13] = "$\u0015jqa\u001cvDol\u0013\u0019g\u0014dmz\u001a\u001dBfn|C#G?6(~";
      f9370[14] = "Rw\u0015g3y\u0000&\u0010zAe\u0002~\u0007p:\u001bQ`\u0001%+j\u0014s\u0015wA";
      f9370[15] = "m;Zf%+3z\u001dmT,,/\u0002z=/Vy\u0000y;vh|Y!oK";
      f9370[16] = "W\u0017\u001b48<R\u000bH\nh<[\u0015\u001e]?d\u000eMI\ng;_OLkb'\f";
      f9370[17] = "S\u0017\u0003m^BV\u000bPS\u000eB_\u0015\u0006\u0004Y\u001a\nJWS\u0001E[OT2\u0004Y\b";
      f9370[18] = "\u0017g\u000b\u001216\u0012{X,a6\u001be\u000e{6nN:^,n1\u001f?\\Mk-L";
      f9370[19] = "\u0000\u001c\u0012b7\u001aRKInKć<\u0012Yj)\u001bCCPa-";
      f9370[20] = "\t;\u0015wcf\f'FI:}\u0004<\u001a 9\u0007R>\u0019&`9WgAr]";
      f9370[21] = "pw\u001b\"{\\.6\\)\nR*bF4]\u0005r7\u001eh\n\u000736X)jYrqS";
      f9370[22] = ";\u0003J{4riT\u0011wHթ\u0007\r\u0001s*sx\\\bx.";
      f9370[23] = "8\u001dCgw\u001cjJ\u0018k\u000bġ\u0004\u0013\boi\u001d{B\u0001dm";
      f9370[24] = "5/hX~Ag~mE\fMm/cN[\u001a5z9\u001a\f\u001aa-}PnH0(`";
      f9370[25] = ";YqA!\n>E\"\u007fq\n7[t(&Rb\u0004)\u007f~\r3\u0001&\u001e{\u0011`";
      f9370[26] = "\u000b{?!\u0005\u0012U:x*t\fYg{6\u000fr\u000fgj8\b\u0010\ty|&t";
      f9370[27] = "\t/yeT)[~|x&%Q/rsqr\tz+!&r]-lmD \f(q";
      f9370[28] = "\u0018\u0005\u0011Y\u0012\u001bFDVRc\u0015B\u0010LO4B\u001aE\u0015\u001ac@[DRR\u0003\u001e\u001a\u0003Y";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f9370[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9371[var4]);
            f9370[var4] = var5;
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
      Object var5 = f9370[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9371[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f9370[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9370[var4] = var13;
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
               var12 = m123(787484128649222L, 0L);
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
      Object var5 = f9370[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9371[var4];
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
               f9370[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(787484128649222L, 0L);
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
                     f9370[var4] = var19;
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
               var23 = m123(787484128649222L, 0L);
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
         if (var8 != 192 && var8 != 224 && var8 != 'y' && var8 != 't') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 238) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'p') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 192) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class590.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Օ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
