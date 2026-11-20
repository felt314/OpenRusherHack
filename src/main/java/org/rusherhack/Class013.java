package org.rusherhack;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Class013 {
   public static long f243 = 75304071016608L;
   public static int f234;
   public static int f227;
   public static int f230;
   public static boolean f236;
   public static int f233;
   public static int f229;
   public static boolean f239;
   public static boolean f231;
   public static boolean f237;
   public static java.nio.ByteBuffer f228;
   public static boolean f240;
   public static int f232;
   public static int f235;
   public static int f241;
   public static int f238;
   public static long[] f244;
   public static Integer[] f245;
   public static String[] f248 = new String[45];

   public static void m472() {
        
    }

   static {
    }

   public static void m473() {
      long var0 = f243 ^ 15187731765277L;
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(15819, 3571272473511561801L ^ var0)),  7546090459084016711L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(3189, 2228027595221908474L ^ var0)),  7545935648005853468L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(23937, 8107952980157491714L ^ var0)),  7545157610704129431L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), org.lwjgl.opengl.GL11.glIsEnabled(m118(12913, 545467045206590972L ^ var0)),  7546822625708504083L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(16552, 8330207041037039421L ^ var0)),  7546889566740677456L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(10659, 1129141935731056166L ^ var0)),  7545808490263908817L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), org.lwjgl.opengl.GL11.glIsEnabled(m118(8530, 6256790272674338497L ^ var0)),  7546428657539871685L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), org.lwjgl.opengl.GL11.glIsEnabled(m118(16430, 6036235771778299834L ^ var0)),  7544959316048382802L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), org.lwjgl.opengl.GL11.glIsEnabled(m118(31723, 6716790475346234464L ^ var0)),  7547938585149755669L,  var0);
      org.lwjgl.opengl.GL11.glGetBooleanv(m118(28067, 2471540154775067170L ^ var0),((java.nio.ByteBuffer)( org.rusherhack.Class013.f228)));
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, boolean.class, long.class, long.class)), org.lwjgl.opengl.GL11.glIsEnabled(m118(3192, 143593927564475384L ^ var0)),  7544821292296120405L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(24268, 9208971734758386014L ^ var0)),  7545718727921936151L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(15785, 1507691763940756007L ^ var0)),  7547497420003058885L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(18996, 7314219996827221424L ^ var0)),  7546636331091664367L,  var0);
      org.rusherhack.ZkmDispatch.invoke(m132(java.lang.invoke.MethodHandles.lookup(), "ª", java.lang.invoke.MethodType.methodType(void.class, int.class, long.class, long.class)), org.lwjgl.opengl.GL11.glGetInteger(m118(27931, 1625835359961733789L ^ var0)),  7547729873204856320L,  var0);
   }
   public static int m118(int var0, long var1) {
        return 0;
    }

   public static int m119(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m118(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m120(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class013.class, "m119", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/X" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static int m121(long var0, long var2) {
        return 0;
    }

   public static void m122() {
        
    }

   public static Class m123(long var0, long var2) {
        return null;
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
        return null;
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
        return null;
    }

   public static MethodHandle m130(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 237 && var8 != 'U' && var8 != 'I' && var8 != 170) {
            var11 = m129(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 252) {
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
            if (var8 == 237) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'U') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'I') {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Class013.class, "m131", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/X" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
