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
public class Class505 {
   public static Object[] f8129 = new Object[21];
   public static String[] f8130 = new String[21];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8130[var4] != null) {
         return var4;
      } else {
         Object var5 = f8129[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 52;
               case 1 -> 16;
               case 2 -> 38;
               case 3 -> 34;
               case 4 -> 39;
               case 5 -> 54;
               case 6 -> 21;
               case 7 -> 14;
               case 8 -> 32;
               case 9 -> 24;
               case 10 -> 25;
               case 11 -> 6;
               case 12 -> 63;
               case 13 -> 19;
               case 14 -> 60;
               case 15 -> 36;
               case 16 -> 44;
               case 17 -> 47;
               case 18 -> 50;
               case 19 -> 20;
               case 20 -> 17;
               case 21 -> 62;
               case 22 -> 9;
               case 23 -> 0;
               case 24 -> 57;
               case 25 -> 2;
               case 26 -> 58;
               case 27 -> 61;
               case 28 -> 56;
               case 29 -> 29;
               case 30 -> 53;
               case 31 -> 30;
               case 32 -> 18;
               case 33 -> 4;
               case 34 -> 3;
               case 35 -> 1;
               case 36 -> 13;
               case 37 -> 40;
               case 38 -> 37;
               case 39 -> 7;
               case 40 -> 23;
               case 41 -> 49;
               case 42 -> 27;
               case 43 -> 42;
               case 44 -> 15;
               case 45 -> 26;
               case 46 -> 11;
               case 47 -> 51;
               case 48 -> 45;
               case 49 -> 43;
               case 50 -> 5;
               case 51 -> 48;
               case 52 -> 8;
               case 53 -> 33;
               case 54 -> 55;
               case 55 -> 10;
               case 56 -> 46;
               case 57 -> 12;
               case 58 -> 59;
               case 59 -> 41;
               case 60 -> 31;
               case 61 -> 28;
               case 62 -> 35;
               default -> 22;
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

            f8130[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f8129[0] = "AF\"\u0013ZN]\\ O@ZM_k^GIK\u001a KMUZ\u001a6II\\K\u001a\u0016II\\K";
      f8129[1] = "\b@&U\u0006/\b@1\t\n \u0012\u000b1\u0017\n5\u0015z`C_pBF>\u001a\u001859\u0017jO\\";
      f8129[2] = "NEE`\u001b@x`E`\f\u001cto_+\f\u0002tzXZ]V!?\u000ff\u0003\u000ffzt7WZ\"2";
      f8129[3] = "M\u0014 ]i^d-<Gk\u0002~9,D \u0013y**\u0001k\u0006s6;\u0001}\u0004w?*\u0001]\u0004w?*\u0014";
      f8129[4] = int.class;
      f8130[4] = "java/lang/Integer";
      f8129[5] = "V \u00015PhJ:\u0003iJ|Z9H҅";
      f8129[6] = "2S";
      f8129[7] = "-y";
      f8129[8] = "5\u000bQejj>\u0004@*\u000bd5\u000fDp";
      f8129[9] = "^\nk`3lYL>\u0012\u0000N/7;/4f\tO<ia";
      f8129[10] = "('agv3?%3\u000bz5765p\u0004e*42{:g?5 \u000b";
      f8129[11] = "\u001e'=\u0000e[\u0019ahrVdyFQN3OPq)Iu\u001a";
      f8129[12] = "-]](q\"*\u001b\bZd3u\u001d\\!\u001a`s\rHfq\"l\u001f[Z";
      f8129[13] = "lM\u0007E\u00157%G\u0015C-ԈW\u0003\u001f\u0007\u0010=2MV\fQ";
      f8129[14] = "Q\u0003ZD\u0015QVE\u000f69om\u0002\u000bZ\fB\u0015\u0005M\u000f";
      f8129[15] = "\t*\u0015c\u0011=@ \u0007e)ž2d\r!\u00147W*D*U";
      f8129[16] = " B\u0013#\f[7@AO\u0010U6JF\u0018G\u000ej\u0010\u001aO\u0005XbBX \u0012Z0";
      f8129[17] = "_\u0014oTI:XR:&E8\u000fHeOFBX\u0013yGK\u007f\u0011[j@\"";
      f8129[18] = ">)\u0005~w))+W\u0012b<)$Z{aF~\u007fFsl{77Ut\u0005";
      f8129[19] = "R\u007f\u001dj\u0015PE}O\u0006\t^DwHQ^\u0005\u0018,\u001d\u0006\u001cS\u0010\u007fVi\u000bQB";
      f8129[20] = "\u00172a\u001b\u000f\t\u000003w\u0013\u0007\u0001:4 D\\]acw\u0006\nU2*\u0018\u0011\b\u0007";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f8129[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8130[var4]);
            f8129[var4] = var5;
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
      Object var5 = f8129[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8130[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f8129[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8129[var4] = var13;
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
               var12 = m123(571194795698710L, 0L);
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
      Object var5 = f8129[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8130[var4];
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
               f8129[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(571194795698710L, 0L);
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
                     f8129[var4] = var19;
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
               var23 = m123(571194795698710L, 0L);
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
         if (var8 != 244 && var8 != 'B' && var8 != 207 && var8 != 'w') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'E') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'y') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 244) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'B') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 207) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class505.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ҟ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
