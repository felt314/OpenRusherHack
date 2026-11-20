package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.ui.ElementBase;

public enum Enum201 {
   f3770,
   f3771,
   f3772,
   f3773,
   f3774,
   f3777,
   f3778;

   // $VF: synthetic field
   public int f3776;
   public static long f3779 = Class066.m4320(-6711057979769984050L, 4521167036331253245L, MethodHandles.lookup().lookupClass()).m4325(223896137978392L);
   public static long[] f3780;
   public static Integer[] f3781;
   public static Map f3782;
   public static Object[] f3783 = new Object[29];
   public static String[] f3784 = new String[29];

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
    }

   Enum201(int var3) {
      this.f3776 = var3;
   }

   public static Enum201 m7856(int var0) {
      long var1 = f3779 ^ 139244732125812L;
      int var6 = var0;
      int var10000 = Class253.m9154();
      Enum201[] var4;
      int var5 = (var4 = ((org.rusherhack.client.api.feature.module.impl.render.Enum201[])(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "m", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.feature.module.impl.render.Enum201[].class, long.class, long.class)), -2854407992646383267L,  var1)))).length;
      int var3 = var10000;
      var10000 = var0 = 0;

      while (var10000 < var5) {
         Enum201 var7;
         var10000 = (var7 = var4[var0]).f3776;
         if (var3 == 0) {
            if (var10000 == var6) {
               return var7;
            }

            var10000 = ++var0;
         }
      }

      return null;
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
      if (f3784[var4] != null) {
         return var4;
      } else {
         Object var5 = f3783[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 47;
               case 1 -> 7;
               case 2 -> 54;
               case 3 -> 45;
               case 4 -> 19;
               case 5 -> 20;
               case 6 -> 12;
               case 7 -> 60;
               case 8 -> 0;
               case 9 -> 8;
               case 10 -> 41;
               case 11 -> 23;
               case 12 -> 52;
               case 13 -> 2;
               case 14 -> 48;
               case 15 -> 31;
               case 16 -> 35;
               case 17 -> 46;
               case 18 -> 39;
               case 19 -> 51;
               case 20 -> 21;
               case 21 -> 57;
               case 22 -> 18;
               case 23 -> 33;
               case 24 -> 49;
               case 25 -> 1;
               case 26 -> 58;
               case 27 -> 15;
               case 28 -> 43;
               case 29 -> 40;
               case 30 -> 22;
               case 31 -> 59;
               case 32 -> 13;
               case 33 -> 53;
               case 34 -> 6;
               case 35 -> 25;
               case 36 -> 30;
               case 37 -> 5;
               case 38 -> 9;
               case 39 -> 14;
               case 40 -> 42;
               case 41 -> 50;
               case 42 -> 36;
               case 43 -> 37;
               case 44 -> 63;
               case 45 -> 32;
               case 46 -> 28;
               case 47 -> 55;
               case 48 -> 3;
               case 49 -> 56;
               case 50 -> 4;
               case 51 -> 27;
               case 52 -> 34;
               case 53 -> 44;
               case 54 -> 38;
               case 55 -> 61;
               case 56 -> 10;
               case 57 -> 26;
               case 58 -> 17;
               case 59 -> 11;
               case 60 -> 16;
               case 61 -> 62;
               case 62 -> 29;
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

            f3784[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f3783[0] = "\rk=\f\u0007R\u0011q?P\u001dF\u0001rtƂ";
      f3783[1] = "'}/\u0003\u001bH\u000eD3\u0019\u0019\u0014\u0014P#\u001aRǆG";
      f3783[2] = "\u0000O\u001eJ\r\u0018\u001cU\u001c\u0016\u0017\f\fVW\u0007\u0013\u0004\nS\rJ\u001e\u001d\u0006\u0013\f\rQ(\u0003X\u0014\u0001\u0011\u0019-\\\n\u0001";
      f3783[3] = "Z\u00168\f\\PQ\u0019)C!HB\u001e \n";
      f3783[4] = "\f\u0007tv]8\u0010\u001dv*G,\u0000\u001e=;@?\u0006[f,F!\u0010[G1B(\u0011";
      f3783[5] = ",\u0001_\u001cp\u001f\u00058C\u0006rC\u001f,S\u00059ƑL";
      f3783[6] = "\u000f\u001da\u001d\u0002\u0004\u0004\u0012pRi\u0006\u0010\u0011";
      f3783[7] = ";f\u000f\u00021E0i\u001eM\\E0t\n";
      f3783[8] = int.class;
      f3784[8] = "java/lang/Integer";
      f3783[9] = "$\u0018Vb;-8\u0002T>!9(\u0001\u001fɊ";
      f3783[10] = "w\u0017n`\u0000\t^.rz\u0002UD:byIƇ\u0017";
      f3783[11] = "n-\r]s{r7\u000f\u0001iob4Dȇ";
      f3783[12] = "6*,*-\u0010=%=eL\u001e6.9?";
      f3783[13] = "'\u001b8-\f\u00069\u000f{\u001d3j'\u001b8-\f\u00069\u000f{";
      f3783[14] = "Ht\u0003a}IV`@QѾ%\u001ba\u001ch6N_uD ";
      f3783[15] = "\u001f5\u0017\b\r\u0015\u0001!T8\u0013y\u001f5\u0017\b\r\u0015\u0001!T";
      f3783[16] = "W>W\u001eL*I*\u0014.wFW>W\u001eL*I*\u0014";
      f3783[17] = "x-?g\u0004Q=;r`\u007fȸFm}|F[-)i$\u000ea";
      f3783[18] = "\u00006\u001a%M_S-\u001ck4\u00179u\u0018\u007fT\n\u0002&\reS;\u0003*\u0017u\u0005\u0000P?\rr4";
      f3783[19] = "'x#:ib9l`\n4\u000e'x#:ib9l`";
      f3783[20] = "=H9\u0000e\u0011{\u001c \u0018\f\nhC/\u0011K\u001a\u0001\u001ao\u0011rD{Z5\u001e~t;B8\u001c=OhW\"\u001b\fHnL.\u0015i\u000e:U6|";
      f3783[21] = "8\u0011\b\u001c\u0003w&\u0005K,\fr2\u0006\u001dWr$=\u001eJR\u001bd.AI,";
      f3783[22] = ")\u0013ZS\u0019-7\u0007\u0019c\u0002A)\u0013ZS\u0019-7\u0007\u0019";
      f3783[23] = "N\u0011Sq\u001f~P\u0005\u0010A\u0002\u0012N\u0011Sq\u001f~P\u0005\u0010";
      f3783[24] = "KeY\u001b>)Uq\u001a++EKeY\u001b>)Uq\u001a";
      f3783[25] = "#\u00123cGBiUt;.\u001f\u0018\u0013lhN\u0002#@yrI3\"Lcb\u001f\bqYye.";
      f3783[26] = "'n\u0012-bK9zQ\u001dŉ'vo\u000f'mN6|P$";
      f3783[27] = "\u000b\u0006\u000eg;4\u0015\u0012MWҮXZ\u0007\u0013m41\u001a\u0014LnJ";
      f3783[28] = "om\tRx0qyJb`\\17\u0012\u0010g6\u007fk\u000e\u0018\tl1d\u0003\fc\"mx\u000bb";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f3783[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3784[var4]);
            f3783[var4] = var5;
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
      Object var5 = f3783[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3784[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f3783[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3783[var4] = var13;
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
               var12 = m123(853839800458418L, 0L);
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
      Object var5 = f3783[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3784[var4];
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
               f3783[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(853839800458418L, 0L);
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
                     f3783[var4] = var19;
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
               var23 = m123(853839800458418L, 0L);
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
         if (var8 != 'a' && var8 != 207 && var8 != 'E' && var8 != 'J') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 216) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'm') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m126(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'a') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 207) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'E') {
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

   public static CallSite m132(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Enum201.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ơ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
   Enum201() {}
}
