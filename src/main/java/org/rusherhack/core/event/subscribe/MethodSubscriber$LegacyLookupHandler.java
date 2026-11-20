package org.rusherhack.core.event.subscribe;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.Class066;
import org.rusherhack.core.utils.MathUtils;

public class MethodSubscriber$LegacyLookupHandler extends MethodSubscriber$LookupHandler {
   public static long f1576 = Class066.m4320(-5315955633876298323L, 3121339053459624385L, MethodHandles.lookup().lookupClass()).m4325(139658023092750L);
   public static String f1577;
   public static Object[] f1578 = new Object[16];
   public static String[] f1579 = new String[16];

   @Override
   public Lookup lookup(Class<?> var1) {
        return null;
    }

   static {
   }

   public static String m117(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f1579[var4] != null) {
         return var4;
      } else {
         Object var5 = f1578[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 47;
               case 1 -> 11;
               case 2 -> 16;
               case 3 -> 14;
               case 4 -> 13;
               case 5 -> 24;
               case 6 -> 60;
               case 7 -> 5;
               case 8 -> 27;
               case 9 -> 29;
               case 10 -> 63;
               case 11 -> 8;
               case 12 -> 56;
               case 13 -> 37;
               case 14 -> 39;
               case 15 -> 61;
               case 16 -> 12;
               case 17 -> 20;
               case 18 -> 1;
               case 19 -> 54;
               case 20 -> 31;
               case 21 -> 52;
               case 22 -> 62;
               case 23 -> 34;
               case 24 -> 59;
               case 25 -> 53;
               case 26 -> 43;
               case 27 -> 45;
               case 28 -> 3;
               case 29 -> 49;
               case 30 -> 0;
               case 31 -> 46;
               case 32 -> 19;
               case 33 -> 58;
               case 34 -> 28;
               case 35 -> 40;
               case 36 -> 15;
               case 37 -> 23;
               case 38 -> 30;
               case 39 -> 42;
               case 40 -> 10;
               case 41 -> 32;
               case 42 -> 36;
               case 43 -> 48;
               case 44 -> 18;
               case 45 -> 50;
               case 46 -> 6;
               case 47 -> 55;
               case 48 -> 21;
               case 49 -> 38;
               case 50 -> 35;
               case 51 -> 26;
               case 52 -> 25;
               case 53 -> 33;
               case 54 -> 2;
               case 55 -> 51;
               case 56 -> 41;
               case 57 -> 7;
               case 58 -> 17;
               case 59 -> 22;
               case 60 -> 9;
               case 61 -> 4;
               case 62 -> 44;
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

            f1579[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f1578[0] = "F2K\u00016SM=ZNjZJ?X\u0003l\u0011j:X\f|";
      f1578[1] = "\u0007m\u0012\bvn\fb\u0003G\u0017`\u0007i\u0007\u001d";
      f1578[2] = int.class;
      f1579[2] = "java/lang/Integer";
      f1578[3] = void.class;
      f1579[3] = "java/lang/Void";
      f1578[4] = "\u0010%\u001cYth\u001b*\r\u00163j\f+\u0001]tI\u001f0\u0002W>L\u001b*\u000eT?w";
      f1578[5] = "\u0000{ yc$\u000bt16$&\u001cu=}c\u0005\u000fn>w)\u0000\u000bt2t(;NV9w&=\u001a";
      f1578[6] = "3jIQ;J/pK\r!^?s\u0000\u001c&M96[\u000b S/6c\u001e=W\tlG\u0013:";
      f1578[7] = "=o)\\\u0004\u00186`8\u0013y\u0000%g1Z";
      f1578[8] = "Z__h\u0002\u0000QPN'o\u0000QMZ";
      f1578[9] = boolean.class;
      f1579[9] = "java/lang/Boolean";
      f1578[10] = " #\u001dfwc f\u001cVg2g\u001f\u0004*\u001c#v>\u001fj$=!4bl%4do_.~4v^X.-?i3\u0001:m:\u001b";
      f1578[11] = ";\u00102:Z1?K-l:)gK0*BM<\u0010>7\u0002'`\u001cj6:";
      f1578[12] = "X%8$\u0010`\u001b&=lk*dv)s\u0014c[2$f\u0006\u0006X:>k\u000e9\u001c7+yk";
      f1578[13] = "\u0010x\u001c\u0005U\u001cLtH\u0004m\u0017JDO[\u0003\u0004M=\u0015\u0007\u0011\u0018,xM\b\rNF$A\\\fv";
      f1578[14] = "\u0017ks-X1\u0017.r\u001dH`P_gv^vWwfy^\r\u0012'=xQb^t3c37T'lo^n@gi\u001d";
      f1578[15] = "pEL]W\n*\u0019^A6\u001c#\u0007nB]\u0017'\u0001OCx\u0012#\u001fN/\n\u0003)\u0004G\u0010N\u000e<\u0016\"\u0014K\f~\u0010\u001e\u0014\u000e\rN";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f1578[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f1579[var4]);
            f1578[var4] = var5;
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
      Object var5 = f1578[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f1579[var4];
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
               f1578[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(82948111641731L, 0L);
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
                     f1578[var4] = var19;
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
               var23 = m123(82948111641731L, 0L);
            }
         }
      }
   }
   public static Object[] m3839() {
      return new Object[0];
   }

   public static Object[] m3840(Object var0) {
      return new Object[]{var0};
   }
}
