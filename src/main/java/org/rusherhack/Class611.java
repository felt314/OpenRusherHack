package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class Class611 {
   public static Object[] f9651 = new Object[15];
   public static String[] f9652 = new String[15];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f9652[var4] != null) {
         return var4;
      } else {
         Object var5 = f9651[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 52;
               case 1 -> 43;
               case 2 -> 28;
               case 3 -> 29;
               case 4 -> 23;
               case 5 -> 31;
               case 6 -> 7;
               case 7 -> 10;
               case 8 -> 8;
               case 9 -> 58;
               case 10 -> 16;
               case 11 -> 51;
               case 12 -> 63;
               case 13 -> 53;
               case 14 -> 6;
               case 15 -> 24;
               case 16 -> 25;
               case 17 -> 22;
               case 18 -> 20;
               case 19 -> 45;
               case 20 -> 38;
               case 21 -> 35;
               case 22 -> 5;
               case 23 -> 60;
               case 24 -> 36;
               case 25 -> 4;
               case 26 -> 34;
               case 27 -> 11;
               case 28 -> 59;
               case 29 -> 41;
               case 30 -> 21;
               case 31 -> 47;
               case 32 -> 32;
               case 33 -> 26;
               case 34 -> 48;
               case 35 -> 40;
               case 36 -> 54;
               case 37 -> 61;
               case 38 -> 27;
               case 39 -> 55;
               case 40 -> 9;
               case 41 -> 2;
               case 42 -> 50;
               case 43 -> 39;
               case 44 -> 44;
               case 45 -> 3;
               case 46 -> 18;
               case 47 -> 12;
               case 48 -> 42;
               case 49 -> 62;
               case 50 -> 15;
               case 51 -> 1;
               case 52 -> 13;
               case 53 -> 0;
               case 54 -> 56;
               case 55 -> 14;
               case 56 -> 57;
               case 57 -> 49;
               case 58 -> 17;
               case 59 -> 46;
               case 60 -> 33;
               case 61 -> 30;
               case 62 -> 37;
               default -> 19;
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

            f9652[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f9651[0] = "\u0019:\u0014\u0000z\u001e\u0019:\u0003\\v\u0011\u0003q\u0003Bv\u0004\u0004\u0000R\u001d\"G";
      f9651[1] = "<V];\u000bs\ns];\u001c/\u0006|Gp\u001c1\u0006i@\u0001MnR*\b";
      f9651[2] = "\u0017\u001a\u0011Z\u0007\u001a\u000b\u0000\u0013\u0006\u001d\u000e\u001b\u0003X׳";
      f9651[3] = "{\u0015";
      f9651[4] = int.class;
      f9652[4] = "java/lang/Integer";
      f9651[5] = "\u000f,R69-\u0004#CyX#\u000f(G#";
      f9651[6] = "\u0012D3f\u00037\u0013Jd\r\u0000%OKdv~u\u001b\foc\u0007 BSv\r";
      f9651[7] = "G@RAF_FN\u0005*UE\u0013V\u0004}\u0002\u001dF\tT*\u0002VDY\u0015Q\u0003X\u0013";
      f9651[8] = ">\t1\u0015DV?\u0007f~^Wk\u001am\u0017]-<F:\u0007T]uB6\u000f9";
      f9651[9] = "\f\u000f0\nP~\r\u0001gaCdX\u0019f6\u0014<\rF4a\u0014w\u000f\u0016w\u001a\u0015yX";
      f9651[10] = "q\u001a,J\rDp\u0014{!\u001e^%\fzvI\u0006pS-!IMr\u0003kZHC%";
      f9651[11] = "D\u000e@H\u0007\u0005\u001e\u000b\u0017Tgŏ}W\u001aR\f\u0001\u0011\u000bI\u0000\u0007";
      f9651[12] = "\u0019 \u001d\u0012\u0005c\u0018.Jy\u0016yM6K.A!\u0018i\u0016yAj\u001a9Z\u0002@dM";
      f9651[13] = "k\n\\uE+j\u0004\u000b\u001eV1?\u001c\nI\u0001ijD]\u001e\u0001\"h\u0013\u001be\u0000,?";
      f9651[14] = "OlmsyxNb:\u0018jb\u001bz;O=:N%j\u0018=qLu*c<\u007f\u001b";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f9651[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f9652[var4]);
            f9651[var4] = var5;
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
      Object var5 = f9651[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f9652[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f9651[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f9651[var4] = var13;
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
               var12 = m123(417634688112214L, 0L);
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
      Object var5 = f9651[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f9652[var4];
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
               f9651[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(417634688112214L, 0L);
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
                     f9651[var4] = var19;
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
               var23 = m123(417634688112214L, 0L);
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
         if (var8 != 226 && var8 != 'A' && var8 != 208 && var8 != 'w') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 253) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 204) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 226) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'A') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 208) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class611.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/և" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
