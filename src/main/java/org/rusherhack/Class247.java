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
public class Class247 {
   public static Object[] f4370 = new Object[24];
   public static String[] f4371 = new String[24];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f4371[var4] != null) {
         return var4;
      } else {
         Object var5 = f4370[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 5;
               case 1 -> 38;
               case 2 -> 45;
               case 3 -> 14;
               case 4 -> 4;
               case 5 -> 26;
               case 6 -> 6;
               case 7 -> 52;
               case 8 -> 21;
               case 9 -> 32;
               case 10 -> 34;
               case 11 -> 19;
               case 12 -> 31;
               case 13 -> 55;
               case 14 -> 11;
               case 15 -> 0;
               case 16 -> 2;
               case 17 -> 43;
               case 18 -> 29;
               case 19 -> 28;
               case 20 -> 56;
               case 21 -> 16;
               case 22 -> 39;
               case 23 -> 33;
               case 24 -> 57;
               case 25 -> 18;
               case 26 -> 15;
               case 27 -> 1;
               case 28 -> 20;
               case 29 -> 46;
               case 30 -> 37;
               case 31 -> 53;
               case 32 -> 61;
               case 33 -> 44;
               case 34 -> 9;
               case 35 -> 60;
               case 36 -> 49;
               case 37 -> 62;
               case 38 -> 47;
               case 39 -> 51;
               case 40 -> 10;
               case 41 -> 63;
               case 42 -> 22;
               case 43 -> 3;
               case 44 -> 30;
               case 45 -> 36;
               case 46 -> 12;
               case 47 -> 23;
               case 48 -> 25;
               case 49 -> 40;
               case 50 -> 27;
               case 51 -> 50;
               case 52 -> 35;
               case 53 -> 58;
               case 54 -> 17;
               case 55 -> 54;
               case 56 -> 8;
               case 57 -> 41;
               case 58 -> 13;
               case 59 -> 42;
               case 60 -> 7;
               case 61 -> 48;
               case 62 -> 59;
               default -> 24;
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

            f4371[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f4370[0] = "}\u007feADHaeg\u001d^\\qf,Ɩ";
      f4370[1] = "\t\u0016";
      f4370[2] = "#F*|H\u0002?\\( R\u0016/_c1V\u001e)Z9|[\u0007%\u001a+7[\u00039F(|R\u0002(\u001a\u0005'^2 Q 7T\u0003hg#3J'#]#&";
      f4370[3] = "CR\u0019<Zcjk\u0005&X?p\u007f\u0015%\u0013.tw\u0013 Icyn\u001f`[(yj\u0003<Xcpk\u0012`u8|[\u001a+P(vjR\u001dS,hN\u0019'S9#";
      f4370[4] = "m\u0006#\u0002p\\q\u001c!^jHa\u001fjOn@g\u001a0\u0002cYkZ\"Ic]w\u0006!\u0002j\\fZ\fYfln\u0011)Il]&5(EeGo\u0011*X";
      f4370[5] = int.class;
      f4371[5] = "java/lang/Integer";
      f4370[6] = "(7C0fj\u0001\u000e_*d6\u001b\u001aO)/'\u001f\u0012I,uj\u0012\u000bElg!\u0012\u000fY0dj\u001b\u000eHlI1\u0017>@'l!\u001d\u000f\b\u0003m-\u0014\u0015A'o0H";
      f4370[7] = "\u0006|";
      f4370[8] = "T+g\u0004y\n_$vK\u0018\u0004T/r\u0011";
      f4370[9] = "\u000e]*k\u0005c\\\u0016q\u0011ʆ]\u000e\ts~U4^[3,";
      f4370[10] = "*'_\u0016Y\u0018(.W\u00020\u0017z:I\u0006Ki)>R\u0011S\u0003c3R\u00120";
      f4370[11] = "b\u0016A(Ca`\u001fI<*Z\u001c3v\u0012oG\u0001.e\u0015v\u0010b\u0016A(Ca`\u001fI<";
      f4370[12] = ")F\\\u0013|\u0017iS\u001c\u001a\u0015\u0000iPC\u0019|\u0003\u0013\u0007S\u0011v\u001ck[_\u0000ug";
      f4370[13] = "-Y.r$\u0004/P&fM)Sx\u0012D\u00003Hm\u001f\u000ft\f\u007f],~v\u0005wI";
      f4370[14] = "}\u0014V_5*=\u0001\u0016V\\\u0010\u00002tt\u0019\r\u001d/gs\u0000Z}\u0014V_5*=\u0001\u0016V";
      f4370[15] = "p=d-\u0019\u00020($$p.\r\u001fM\u0005=<\u0016G ;\u000e\u001e#7`.N\u0017";
      f4370[16] = "J[l\feJHRd\u0018\f\\\tNf\u0017e_s\u0019v\u001fo@\u000bEz\u000el;";
      f4370[17] = ">a6+G\u0019<h>?.\"@D\u0001\u0011k?CU\u0013\n.Q~s ?_Sw{4";
      f4370[18] = "?%D\bw\u0011\u007f0\u0004\u0001\u001e\u001fl;G\tea9`^\u0003r\u001bb:[T\u001e";
      f4370[19] = "\fd\u0001S)fLqAZ@JqF(t\rPjS%?zlHr\u0016O:y\b{";
      f4370[20] = "UQ\u0007K'\n\u0015DGBN0(w%`\u000b-+f7{N@\u0015U\u0015N>\u0000\u0000\u0015\u001c";
      f4370[21] = "$\u0016\u001b\u001b w&\u001f\u0013\u000fIZZ7'<\bI]3p_0m`\u0006\u0001]9et";
      f4370[22] = "Jomy\te\nz-p`I7MDO!Z0I\u0013/\u001ak\u001c|co\u000f+\u0015";
      f4370[23] = ",\"%b1~~i~\u0018ъ@,v|wa)|$<%";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f4370[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f4371[var4]);
            f4370[var4] = var5;
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
      Object var5 = f4370[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f4371[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f4370[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f4370[var4] = var13;
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
               var12 = m123(605790744443782L, 0L);
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
      Object var5 = f4370[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f4371[var4];
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
               f4370[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(605790744443782L, 0L);
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
                     f4370[var4] = var19;
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
               var23 = m123(605790744443782L, 0L);
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
         if (var8 != 216 && var8 != 'p' && var8 != 241 && var8 != 'L') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'a') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'Z') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 216) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'p') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 241) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class247.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ǹ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
