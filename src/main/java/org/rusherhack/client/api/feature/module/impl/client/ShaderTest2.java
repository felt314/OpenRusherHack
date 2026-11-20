package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.ScreenshotRecorder;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;

import org.rusherhack.command.ShaderTest2Command;
public class ShaderTest2 extends ToggleableModule {
   public Class153 f3400;
   public Class294 f3401;
   public static long f3402 = Class066.m4320(5967583920847757502L, 1034179767219808556L, MethodHandles.lookup().lookupClass()).m4325(12069782022325L);
   public static Object[] f3406 = new Object[35];
   public static String[] f3407 = new String[35];

   @Override
   public void onEnable() {
      ShaderTest2 var3 = this;

      try {
         Enum112 var10003 = Enum112.f2469;
         Class290[] var10004 = new Class290[]{Class153.f3138, null, null};
         boolean var10008 = true;
         var10004[1] = Class153.f3148;
         var10004[2] = Class153.f3145;
         var3.f3400 = new Class153(var10003, var10004);
         var3.f3401 = new Class294(var3.f3400);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void m7182(Framebuffer var0, String var1) {
      long var2 = f3402 ^ 121154246838982L;
      int var4 = Class253.m9155();
      Framebuffer var5 = var0;

      try {
         NativeImage var12 = ScreenshotRecorder.takeScreenshot(var5);

         try {
            org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ý", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), var12,  new File(var1 + ".png"),  -3121322313100755629L,  var2);
         } catch (Throwable var10) {
            try {
               if (var12 == null) {
                  throw var10;
               }
            } catch (Throwable var9) {
               var9.printStackTrace();
            }

            try {
               org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ý", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), var12,  -3121768302920735184L,  var2);
            } catch (Throwable var8) {
               var10.addSuppressed(var8);
               throw var10;
            }

            throw var10;
         }

         if (var4 == 0) {
            return;
         }

         try {
            if (var12 != null) {
               org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ý", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), var12,  -3121768302920735184L,  var2);
            }
         } catch (Throwable var7) {
            var7.printStackTrace();
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      }

      boolean var10003 = true;
      ShaderTest.f8475++;
   }

   public ShaderTest2() {
      super("ShaderTest2", ModuleCategory.CLIENT);
      this.f3401 = null;
      this.f3400 = null;
   }

   @Override
   public ModuleCommand createCommand() {
      return new ShaderTest2Command(this, this);
   }

   @Override
   public void onDisable() {
      long var1 = f3402 ^ 27059306350583L;
      if (this.f3401 != null) {
         org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ý", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, long.class, long.class)), this.f3401,  -7377174456871120012L,  var1);
         this.f3401 = null;
         this.f3400 = null;
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      if (this.f3400 != null) {
         ;
      }
   }

   

   public static IllegalStateException m1393(Throwable var0) {
      return new IllegalStateException(var0);
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3407[var4] != null) {
         return var4;
      } else {
         Object var5 = f3406[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 61;
               case 1 -> 43;
               case 2 -> 8;
               case 3 -> 15;
               case 4 -> 30;
               case 5 -> 54;
               case 6 -> 23;
               case 7 -> 0;
               case 8 -> 21;
               case 9 -> 63;
               case 10 -> 62;
               case 11 -> 19;
               case 12 -> 9;
               case 13 -> 27;
               case 14 -> 25;
               case 15 -> 14;
               case 16 -> 29;
               case 17 -> 12;
               case 18 -> 51;
               case 19 -> 13;
               case 20 -> 49;
               case 21 -> 40;
               case 22 -> 2;
               case 23 -> 11;
               case 24 -> 10;
               case 25 -> 39;
               case 26 -> 57;
               case 27 -> 24;
               case 28 -> 50;
               case 29 -> 1;
               case 30 -> 6;
               case 31 -> 59;
               case 32 -> 56;
               case 33 -> 38;
               case 34 -> 60;
               case 35 -> 16;
               case 36 -> 4;
               case 37 -> 48;
               case 38 -> 37;
               case 39 -> 22;
               case 40 -> 26;
               case 41 -> 18;
               case 42 -> 31;
               case 43 -> 7;
               case 44 -> 34;
               case 45 -> 42;
               case 46 -> 28;
               case 47 -> 44;
               case 48 -> 52;
               case 49 -> 46;
               case 50 -> 53;
               case 51 -> 5;
               case 52 -> 55;
               case 53 -> 3;
               case 54 -> 41;
               case 55 -> 35;
               case 56 -> 33;
               case 57 -> 45;
               case 58 -> 36;
               case 59 -> 47;
               case 60 -> 32;
               case 61 -> 17;
               case 62 -> 20;
               default -> 58;
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

            f3407[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f3406[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3407[var4]);
            f3406[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new IllegalStateException(var8.toString());
      }

      return (Class)var6;
   }

   public static Field m181(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   public static Field m182(Class var0, String var1, Class var2) {
      Field var3 = m181(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               var3 = m182(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public static Field m183(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f3406[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3407[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f3406[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3406[var4] = var13;
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
               var12 = m180(1205577807895729L, 0L);
            }
         }
      }
   }

   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = m184(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.length; var7++) {
               var5 = m185(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static Method m186(long var0, long var2) {
      int var4 = m178(var0, var2);
      Object var5 = f3406[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3407[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = m180(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while (true) {
            Method var26 = m184(var23, var10, var15, var13, var14);
            if (var26 != null) {
               f3406[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1205577807895729L, 0L);
               break;
            }
         }

         var23 = var8;

         while (true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for (int var18 = 0; var18 < var27.length; var18++) {
                  Method var19 = m185(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     f3406[var4] = var19;
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
               var23 = m180(1205577807895729L, 0L);
            }
         }
      }
   }

   public static MethodHandle m187(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      Object var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 238 && var8 != 196 && var8 != 'j' && var8 != 'z') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 253) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'g') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 238) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 196) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 'j') {
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

   public static Object m188(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      long var9 = (Long)var4[++var5];
      MethodHandle var8 = m187(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      try {
         return (Object)var8.asSpreader(Object[].class, var4.length).invoke(var4);
      } catch (Throwable throwable) {
         throw new IllegalStateException(throwable);
      }
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(ShaderTest2.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ů" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
