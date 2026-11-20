package org.rusherhack.client.api.feature.hud;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.rusherhack.Class066;

// $VF: synthetic class
public class ShortListHudElement$2 {
   public static Object[] f668 = new Object[14];
   public static String[] f669 = new String[14];

   static {
    }

   public static int m121(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f669[var4] != null) {
         return var4;
      } else {
         Object var5 = f668[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 47;
               case 1 -> 20;
               case 2 -> 56;
               case 3 -> 37;
               case 4 -> 22;
               case 5 -> 1;
               case 6 -> 45;
               case 7 -> 21;
               case 8 -> 6;
               case 9 -> 18;
               case 10 -> 32;
               case 11 -> 34;
               case 12 -> 42;
               case 13 -> 28;
               case 14 -> 2;
               case 15 -> 9;
               case 16 -> 55;
               case 17 -> 54;
               case 18 -> 5;
               case 19 -> 29;
               case 20 -> 60;
               case 21 -> 49;
               case 22 -> 31;
               case 23 -> 3;
               case 24 -> 19;
               case 25 -> 46;
               case 26 -> 15;
               case 27 -> 44;
               case 28 -> 61;
               case 29 -> 50;
               case 30 -> 27;
               case 31 -> 10;
               case 32 -> 30;
               case 33 -> 25;
               case 34 -> 11;
               case 35 -> 35;
               case 36 -> 36;
               case 37 -> 23;
               case 38 -> 63;
               case 39 -> 0;
               case 40 -> 41;
               case 41 -> 57;
               case 42 -> 33;
               case 43 -> 53;
               case 44 -> 14;
               case 45 -> 58;
               case 46 -> 39;
               case 47 -> 59;
               case 48 -> 62;
               case 49 -> 38;
               case 50 -> 40;
               case 51 -> 4;
               case 52 -> 17;
               case 53 -> 48;
               case 54 -> 13;
               case 55 -> 43;
               case 56 -> 12;
               case 57 -> 24;
               case 58 -> 7;
               case 59 -> 8;
               case 60 -> 51;
               case 61 -> 26;
               case 62 -> 52;
               default -> 16;
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

            f669[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f668[0] = "GIhgKP[Sj;QDKP!*ULMU{gXUA\u0015i,XQ]IjgQPL\u0015G<]`D^b,WQ\fzc ^KE^a=";
      f668[1] = int.class;
      f669[1] = "java/lang/Integer";
      f668[2] = "i)Yf^j@\u0010E|\\6Z\u0004U\u007f\u0017'^\fSzMjS\u0015_:_!S\u0011Cf\\jZ\u0010R:q1V ZqT!\\\u0011\u0012UU-U\u000b[qW0\t";
      f668[3] = "\u001e}&\r\u001f\u001a\u0002g$Q\u0005\u000e\u0012do@\u0001\u0006\u0014a5\r\f\u001f\u0018!'F\f\u001b\u0004}$\r\u0005\u001a\u0015!\u0012K\u0002\u001d\u0005C(P\u0019'\u0004k\u0004O\b\u0002\u0014a5\u0007_";
      f668[4] = "|\u0007";
      f668[5] = "mR\u001f:0\u0005f]\u000euQ\u000bmV\n/";
      f668[6] = "+=H{:\u001c;fS\u0007}\u000f%&[|\u0003\\{?N?mVx%T\u0007";
      f668[7] = "Xxp5PS\\04p;\u0001b;\"t\u0001Q\u001dd,mU";
      f668[8] = "6A[\u0016G^&\u001a@j\"c\u0004pn'8x\u0011}%\u0000\u0018Z \u001e_\u0010CA";
      f668[9] = "?QHN/L/\nS2\\q\tkqwAr\u0018yj2|P+K\u000fHl\u000b0";
      f668[10] = "\u0012~#3s9\u0002%8O-9\u0014y;&.C\u0006h<5)zD%;O";
      f668[11] = "T'?zLiD|$\u0006)Tf\u0016\u001bG:SbA+`\u000bo\u0007;;;\u0010";
      f668[12] = "_r\u001e^:}O)\u0005\"I@iH'gT]t[ ~\u0003mSj\u001c\u001by}\bq";
      f668[13] = "\u001ck)\u0000\u0011j\f02|tW.Z\u00131fLvg1\u0002T)\fwj\u0019";
   }

   public static Class m123(long var0, long var2) {
      Class var5 = null;
      int var4 = m121(var0, var2);
      Object var6 = f668[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f669[var4]);
            f668[var4] = var5;
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
      Object var5 = f668[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f669[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m123(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m123(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m124(var12, var10, var11);
            if (var13 != null) {
               f668[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m125(var14[var15], var10, var11);
                  if (var13 != null) {
                     f668[var4] = var13;
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
               var12 = m123(387940498512124L, 0L);
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
      Object var5 = f668[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f669[var4];
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
               f668[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m123(387940498512124L, 0L);
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
                     f668[var4] = var19;
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
               var23 = m123(387940498512124L, 0L);
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
         if (var8 != 192 && var8 != 't' && var8 != 226 && var8 != 'F') {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'C') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == '$') {
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
            } else if (var8 == 't') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 226) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ShortListHudElement$2.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/feature/hud/ShortListHudElement$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
