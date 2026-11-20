package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.Globals;

import org.rusherhack.command.baritone;
public class Util450 implements Globals {
   public static boolean f7349;
   public static int f7350;
   public static long f7351 = Class066.m4320(-907738807447655309L, -7523433058633432619L, MethodHandles.lookup().lookupClass()).m4325(241557411244357L);
   public static long[] f7352;
   public static Integer[] f7353;
   public static Object[] f7355 = new Object[39];
   public static String[] f7356 = new String[39];

   public static void m14236() {
        
    }

   static {
    }

   public static void m14237() {
      f7350 = -1;
   }

   public static void m14238() {
        
    }
   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7356[var4] != null) {
         return var4;
      } else {
         Object var5 = f7355[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 55;
               case 1 -> 34;
               case 2 -> 11;
               case 3 -> 46;
               case 4 -> 42;
               case 5 -> 48;
               case 6 -> 15;
               case 7 -> 21;
               case 8 -> 29;
               case 9 -> 63;
               case 10 -> 40;
               case 11 -> 58;
               case 12 -> 37;
               case 13 -> 33;
               case 14 -> 3;
               case 15 -> 28;
               case 16 -> 60;
               case 17 -> 6;
               case 18 -> 26;
               case 19 -> 18;
               case 20 -> 59;
               case 21 -> 38;
               case 22 -> 2;
               case 23 -> 25;
               case 24 -> 1;
               case 25 -> 9;
               case 26 -> 8;
               case 27 -> 7;
               case 28 -> 56;
               case 29 -> 20;
               case 30 -> 36;
               case 31 -> 22;
               case 32 -> 14;
               case 33 -> 24;
               case 34 -> 12;
               case 35 -> 13;
               case 36 -> 50;
               case 37 -> 44;
               case 38 -> 31;
               case 39 -> 17;
               case 40 -> 0;
               case 41 -> 39;
               case 42 -> 57;
               case 43 -> 16;
               case 44 -> 41;
               case 45 -> 61;
               case 46 -> 52;
               case 47 -> 35;
               case 48 -> 27;
               case 49 -> 62;
               case 50 -> 54;
               case 51 -> 10;
               case 52 -> 45;
               case 53 -> 43;
               case 54 -> 49;
               case 55 -> 51;
               case 56 -> 30;
               case 57 -> 32;
               case 58 -> 4;
               case 59 -> 53;
               case 60 -> 5;
               case 61 -> 23;
               case 62 -> 19;
               default -> 47;
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

            f7356[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m194() {
      f7355[0] = "7Q>\u000e\u0006\u0005+K<R\u001c\u0011;HwГ";
      f7355[1] = int.class;
      f7356[1] = "java/lang/Integer";
      f7355[2] = boolean.class;
      f7356[2] = "java/lang/Boolean";
      f7355[3] = "y_a\u001eAzgW{Q \u007fgWx\u0011\u000ec";
      f7355[4] = "`\u0014+5Rok\u001b:z3a`\u0010> ";
      f7355[5] = "\t\u0006!9\rc\t\u00066e\u0001l\u0013M6{\u0001y\u0014<b#V";
      f7355[6] = "!zI<w:!z^`{5;1^~{ <@\f+(`";
      f7355[7] = "\\3>\u0002\u007f,W</M\u0015/C0$\u0006";
      f7355[8] = double.class;
      f7356[8] = "java/lang/Double";
      f7355[9] = "\b\u0005Y\u000bu~\u0004\u0001\u0005\u0003qxD\u0006N\n`g\u0003\u000bYLHA\u000b\u0010C\u000bov(\u0001C\u0003wx\u0005\u0016";
      f7355[10] = "u\u001f'\u001cDGi\u0005%@^Sy\u0006nȴ";
      f7355[11] = "Fh\f>g(JlP6c.\nK\u001f%z3Kg\u001b\u0016C\u000e";
      f7355[12] = "+_%\\\n|'[yT\u000ezgw\u0015T\fz=Q9P.a&H>Q\u001ba";
      f7355[13] = ";AGR@`7E\u001bZDfwiwZFf-O[^";
      f7355[14] = "7&\u001a@\\E;\"FHXC{7\u001aFKO&4F`k_&3\u0007DoE4+8[GI04\u001b";
      f7355[15] = "\u001e8\u0010u0K\u0002\"\u0012)*_\u0012!Yȯ";
      f7355[16] = "A 5vLE]:7*VQM9|;RYK<&v_@G|\u00154QRO>!";
      f7355[17] = "):\u0010\f(|):\u0007P$s3q\u0007N$f4\u0000W\u0013u";
      f7355[18] = "m\u001as\r\u001aDa\u001e/\u0005\u001eB!\u000b`\u0010\u0006Ba\u001c/\u0003\u0001Jc\b/#\u0001Jc";
      f7355[19] = void.class;
      f7356[19] = "java/lang/Void";
      f7355[20] = "S>%lIq\u0000v=-sn\u0004sX*Jo\ric{\u001f9S\u000f";
      f7355[21] = "(a\u001b7h\u0006(;C(\u0007\u0012y'\u001c>k /b@f9w(k\u001c0z\u0017%8\u001f#\u0007";
      f7355[22] = "a6!I\u0018\u0003%*8E$Q:;(PIc4\"?Y$\u0003b =WOT#)-4";
      f7355[23] = "`[\u001ay&adT\r|\u001f%?Z\u0017iE4;X\u0015t~?1p\u0012Ir6;\\\u0012n\u001fcoL\t(o0'TH\u0012";
      f7355[24] = "y`PI`)|1TW\u0003ȕF*_\u0017l'$ \u0004K\u0003";
      f7355[25] = "\t'^-i*\u0004t]>\u0014$TzZ(C{\f'\u0007Dd!\u000fxU&nzS";
      f7355[26] = "\u001dD~da<K\n)4\f#@\u0007J/k2L\u0017\u007f/\f|S\u0017j?etI\u0012*U";
      f7355[27] = "v*jZ4\u0010~0o\u001a^\u0016+(^X?\u001c/.wh7\u0003'(aD3ywld\u001f5\u00144,8P^";
      f7355[28] = "?\t4}\u0006R=\u000b*\u0010ŷ(/\u000em\u007fQJ%U1";
      f7355[29] = "1\u0001\u000e\r^arARB5cmE4YIla_\u0003zXliG\rWO\f>S\u0002[\f4:\\\u0015^5";
      f7355[30] = "\u0019yqq|X\u0014*rb\u0001VD$utV\t\u001cy)\u0018qS\u001f&zz{\bC";
      f7355[31] = "iy>m+0:1&,\u0011!(\u0005&hm1Sq>ic%4y&p)@";
      f7355[32] = "\u0005\u00052R].FEn\u001d6,YA\u001b\u0012M?SX\u001f\b_'lG7\u0004[8O=9\u0002\f-\bY<\u001eQ/4";
      f7355[33] = "1id\u0019u^3kzt $8~j\u0014.\u001d<f\u007f\rIM*hg\u0013pI2}~t";
      f7355[34] = "\u001d7M!\u0000ON1Nab\u0014\u001cMK'_\u0001\u0014vI%\u0010\u000f";
      f7355[35] = "&8\u00033\u0015K#$^1)T\")v:@K\u00063U\u0005@S/UR:\u0011J.%\u0007#[\u0016O9C2M\u0011(7\u0005e\u0016/";
      f7355[36] = "\f\u00100x\u000b>\t\fmz7;\u001e4ajV$\b}3kN(\u0000\u001a;sWbe";
      f7355[37] = "|z|m>R~x3c]\u0007v.%q\nP(y}\u001daSp-.la\t(2";
      f7355[38] = "j*qcy\u000fh(o\u000eǥu3;k| \u0012;#r6";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f7355[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7356[var4]);
            f7355[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m196(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m197(Class var0, String var1, Class var2) {
      Field var3 = m196(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m197(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m198(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f7355[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7356[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f7355[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7355[var4] = var13;
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
               var12 = m195(308723551094162L, 0L);
            }
         }
      }
   }

   public static Method m199(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m200(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m199(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m200(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m201(long var0, long var2) {
      int var4 = m193(var0, var2);
      Object var5 = f7355[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7356[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m195(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m199(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f7355[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(308723551094162L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m200(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f7355[var4] = var19;
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
               var23 = m195(308723551094162L, 0L);
            }
         }
      }
   }

   public static MethodHandle m202(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 218 && var8 != 'q' && var8 != 'A' && var8 != 'F') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'O') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 209) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 218) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'q') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'A') {
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

   public static Object m203(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m202(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Util450.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/г" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
