package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.rusherhack.client.Enum024;
import org.rusherhack.client.Class025;
import org.rusherhack.client.Class039;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
public class Windows extends ToggleableModule {
   public EnumSetting<WindowsTaskbarside> taskbarside;
   public static Windows f8104;
   public static long f8105 = Class066.m4320(8188654962894434245L, -5229493161064359645L, MethodHandles.lookup().lookupClass()).m4325(151962742480194L);
   public static long f8109;
   public static Object[] f8110 = new Object[80];
   public static String[] f8111 = new String[80];

   @Subscribe(
      priority = 10
   )
   public void m15599(Class263 var1) {
        
    }

   @Override
   public void onEnable() {
      long var1 = f8105 ^ 81556434376141L;
      Class039 var5;
      (var5 = Class170.f3364.m7115().m12503()).m3050(Globals.mc.currentScreen);
      int var10000 = Class253.m9155();
      Globals.mc.setScreen(var5);
      int var3 = var10000;
      if (var3 != 0) {
         if (!Console.f8537.isHidden()) {
            org.rusherhack.ZkmDispatch.invoke(m177(java.lang.invoke.MethodHandles.lookup(), "ÿ", java.lang.invoke.MethodType.methodType(void.class, java.lang.Object.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7121(),  Console.f8537,  3978812032670257784L,  var1);
         }

         this.toggle();
      }
   }

   @Override
   public boolean isListening() {
      boolean var10002 = true;
      return true;
   }

   public Windows() {
      super(
         "Windows",
         "Opens the rusherhack window manager",
         ModuleCategory.CLIENT
      );
      this.taskbarside = new EnumSetting<>("TaskbarSide", WindowsTaskbarside.f7368).onChange(var0 -> {
         int var3 = Class253.m9155();
         WindowHandlerBase var5;
         if ((var5 = Class170.f3364.m7121().getWindowHandler()) instanceof Renderer191) {
            Class025 var6 = ((Renderer191)var5).m7672();
            if (var3 == 0) {
               return;
            }

            if (var0 == WindowsTaskbarside.f7369) {
               var6.m2883(Enum024.f1196);
               return;
            }

            var6.m2883(Enum024.f1199);
         }
      });
      f8104 = this;
      Class170.f3364.m7119().setBind(this, new Class545((int)f8109));
      this.setNotifications(false);
      this.registerSettings(this.taskbarside);
   }

   @Override
   public boolean reset() {
      Class170.f3364.m7121().getFeatures().forEach(Window::reset);
      return super.reset();
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8111[var4] != null) {
         return var4;
      } else {
         Object var5 = f8110[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 61;
               case 1 -> 3;
               case 2 -> 29;
               case 3 -> 39;
               case 4 -> 49;
               case 5 -> 30;
               case 6 -> 34;
               case 7 -> 52;
               case 8 -> 14;
               case 9 -> 17;
               case 10 -> 43;
               case 11 -> 41;
               case 12 -> 51;
               case 13 -> 47;
               case 14 -> 25;
               case 15 -> 0;
               case 16 -> 6;
               case 17 -> 13;
               case 18 -> 58;
               case 19 -> 32;
               case 20 -> 12;
               case 21 -> 23;
               case 22 -> 19;
               case 23 -> 38;
               case 24 -> 28;
               case 25 -> 63;
               case 26 -> 18;
               case 27 -> 21;
               case 28 -> 15;
               case 29 -> 57;
               case 30 -> 10;
               case 31 -> 44;
               case 32 -> 27;
               case 33 -> 48;
               case 34 -> 40;
               case 35 -> 37;
               case 36 -> 35;
               case 37 -> 56;
               case 38 -> 42;
               case 39 -> 55;
               case 40 -> 33;
               case 41 -> 50;
               case 42 -> 16;
               case 43 -> 8;
               case 44 -> 1;
               case 45 -> 53;
               case 46 -> 24;
               case 47 -> 11;
               case 48 -> 20;
               case 49 -> 9;
               case 50 -> 54;
               case 51 -> 45;
               case 52 -> 62;
               case 53 -> 5;
               case 54 -> 36;
               case 55 -> 7;
               case 56 -> 4;
               case 57 -> 60;
               case 58 -> 59;
               case 59 -> 31;
               case 60 -> 26;
               case 61 -> 2;
               case 62 -> 22;
               default -> 46;
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

            f8111[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f8110[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8111[var4]);
            f8110[var4] = var5;
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
      Object var5 = f8110[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8111[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f8110[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8110[var4] = var13;
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
               var12 = m180(1940617997553019L, 0L);
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
      Object var5 = f8110[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8111[var4];
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
               f8110[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(1940617997553019L, 0L);
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
                     f8110[var4] = var19;
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
               var23 = m180(1940617997553019L, 0L);
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
         if (var8 != 'j' && var8 != 234 && var8 != 'E' && var8 != 'm') {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 255) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 170) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'j') {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 234) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Windows.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Қ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
