package org.rusherhack.client.api.events.client;
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
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.Event;

public class EventUpdate extends Event {
   public static String[] f338;
   public static Object[] f339 = new Object[7];
   public static String[] f340 = new String[7];

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public static void m729(String[] var0) {
      f338 = var0;
   }

   public static String[] m730() {
      return f338;
   }

   static {
      long var0 = Class066.m4320(-2410353046109526345L, 3171971384087076686L, MethodHandles.lookup().lookupClass()).m4325(33095203912491L) ^ 86881570343620L;
      m122();
      if (((java.lang.String[])(org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "T", java.lang.invoke.MethodType.methodType(java.lang.String[].class, long.class, long.class)), 4088363089292300919L,  var0))) != null) {
         org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "T", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), new String[4],  4088187474297999128L,  var0);
      }
   }

   public static int m193(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f340[var4] != null) {
         return var4;
      } else {
         Object var5 = f339[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 25;
               case 1 -> 27;
               case 2 -> 1;
               case 3 -> 29;
               case 4 -> 52;
               case 5 -> 3;
               case 6 -> 19;
               case 7 -> 39;
               case 8 -> 63;
               case 9 -> 41;
               case 10 -> 22;
               case 11 -> 53;
               case 12 -> 5;
               case 13 -> 11;
               case 14 -> 16;
               case 15 -> 12;
               case 16 -> 54;
               case 17 -> 42;
               case 18 -> 35;
               case 19 -> 21;
               case 20 -> 43;
               case 21 -> 14;
               case 22 -> 26;
               case 23 -> 30;
               case 24 -> 15;
               case 25 -> 40;
               case 26 -> 36;
               case 27 -> 49;
               case 28 -> 44;
               case 29 -> 56;
               case 30 -> 50;
               case 31 -> 59;
               case 32 -> 34;
               case 33 -> 6;
               case 34 -> 31;
               case 35 -> 18;
               case 36 -> 23;
               case 37 -> 45;
               case 38 -> 4;
               case 39 -> 32;
               case 40 -> 55;
               case 41 -> 51;
               case 42 -> 10;
               case 43 -> 17;
               case 44 -> 9;
               case 45 -> 37;
               case 46 -> 20;
               case 47 -> 48;
               case 48 -> 2;
               case 49 -> 46;
               case 50 -> 57;
               case 51 -> 13;
               case 52 -> 62;
               case 53 -> 60;
               case 54 -> 8;
               case 55 -> 7;
               case 56 -> 61;
               case 57 -> 0;
               case 58 -> 33;
               case 59 -> 47;
               case 60 -> 38;
               case 61 -> 58;
               case 62 -> 24;
               default -> 28;
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

            f340[var4] = new String(var13);
            return var4;
         }
      }
   }

   public static void m122() {
      f339[0] = "c%P=1'\u007f?Ra+3o<\u0019p/;i9C=\"\"eyRe&<x$\u0019p/;i9C=\u0006$i9CF36m#R";
      f339[1] = "Djkx$\u00101J`w5_LRsp<\u0016$";
      f339[2] = void.class;
      f340[2] = "java/lang/Void";
      f339[3] = "J;\u0010\u001f\\0?\u001b\u001b\u0010M\u007fB\u0003\b\u0017D6*";
      f339[4] = "Lh.8O%Gg?w.+Ll;-";
      f339[5] = "+)Mr,\u0017o&PI҆s.9\u0015t#\u001cx8K(MI-2P&!\u0017-=GI";
      f339[6] = "+;!\u001aK{o4<!ɐ\u001f.+y\u001cDpx*'@*";
   }

   public static Class m195(long var0, long var2) {
      Class var5 = null;
      int var4 = m193(var0, var2);
      Object var6 = f339[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f340[var4]);
            f339[var4] = var5;
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
      Object var5 = f339[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f340[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m195(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m195(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m196(var12, var10, var11);
            if (var13 != null) {
               f339[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m197(var14[var15], var10, var11);
                  if (var13 != null) {
                     f339[var4] = var13;
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
               var12 = m195(309829503236700L, 0L);
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
      Object var5 = f339[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f340[var4];
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
               f339[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m195(309829503236700L, 0L);
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
                     f339[var4] = var19;
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
               var23 = m195(309829503236700L, 0L);
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
         if (var8 != 207 && var8 != 164 && var8 != 214 && var8 != 'F') {
            var11 = m201(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 239) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'T') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m198(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 207) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 164) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 214) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(EventUpdate.class, "m203", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/api/events/client/EventUpdate" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
