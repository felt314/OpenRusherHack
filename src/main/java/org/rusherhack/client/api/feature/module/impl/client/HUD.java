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
import org.rusherhack.client.Class022;
import org.rusherhack.client.Class039;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.feature.window.Window;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.interfaces.IPinnable;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.FPS;
public class HUD extends ToggleableModule {
   public static NumberSetting<Integer> strength;
   public static BooleanSetting syncAllHudColors;
   public static EnumSetting<HUDFilter> filter;
   public NullSetting colors;
   public static NumberSetting<Integer> f8691;
   public static BooleanSetting syncHudColorsWithTheme;
   public static EnumSetting<HUDEnablecolor> enablecolor;
   public static BooleanSetting f8694;
   public static BooleanSetting clampToScreenEdges;
   public static EnumSetting<HUDMode> mode;
   public BooleanSetting notifications;
   public static ColorSetting f8698;
   public static ColorSetting f8699;
   public NumberSetting<Integer> f8700;
   public static ColorSetting f8701;
   public static BooleanSetting showNotificationsWhenModulesAreToggled;
   public static BooleanSetting snappingToScreenCorners;
   public static BooleanSetting backgroundBehindHudElements;
   public static BooleanSetting blur;
   public static EnumSetting<HUDEnablecolor> disablecolor;
   public static NumberSetting<Double> scaleOfTheEntireHud;
   public static long f8708 = Class066.m4320(3898905682035901821L, -5720055962024806703L, MethodHandles.lookup().lookupClass()).m4325(142700805168608L);
   public static Object[] f8715 = new Object[131];
   public static String[] f8716 = new String[131];

   public HUD() {
      super("HUD", "In-Game Heads up Display", ModuleCategory.CLIENT);
      Integer var10009 = 60;
      boolean var10012 = true;
      NumberSetting var10006 = new NumberSetting<>("FPS", var10009, 1, 360);
      boolean var11 = true;
      this.f8700 = var10006.setHidden(true);
      this.colors = new NullSetting("Colors");
      boolean var12 = true;
      this.notifications = new BooleanSetting("Notifications", true);
      this.setToggled(true);
      Class170.f3364.m7119().setBind(this, new Class545(44));
      NullSetting var10000 = this.colors;
      Setting[] var10001 = new Setting[]{syncHudColorsWithTheme, null};
      boolean var10005 = true;
      var10001[1] = syncAllHudColors;
      var10000.addSubSettings(var10001);
      BooleanSetting var3 = this.notifications;
      var10001 = new Setting[]{mode, null, null, null};
      var10005 = true;
      var10001[1] = filter;
      var10001[2] = showNotificationsWhenModulesAreToggled;
      var10001[3] = f8694;
      var3.addSubSettings(var10001);
      BooleanSetting var4 = showNotificationsWhenModulesAreToggled;
      var10001 = new Setting[]{enablecolor, null};
      var10005 = true;
      var10001[1] = disablecolor;
      var4.addSubSettings(var10001);
      var10001 = new Setting[7];
      var10001[0] = scaleOfTheEntireHud;
      var10005 = true;
      var10001[1] = this.f8700;
      var10001[2] = this.colors;
      var10001[3] = backgroundBehindHudElements;
      var10001[4] = clampToScreenEdges;
      var10001[5] = snappingToScreenCorners;
      var10001[6] = this.notifications;
      this.registerSettings(var10001);
   }

   @Override
   public void onKeybindEvent() {
      Class022 var4;
      (var4 = Class170.f3364.m7115().m12501()).m3050(Globals.mc.currentScreen);
      Globals.mc.setScreen(var4);
   }

   @Override
   public boolean isListening() {
      boolean var10002 = true;
      return true;
   }

   

   @Override
   public boolean reset() {
      Class170.f3364.m7115().getHudHandler().setDefaultPositions();
      Class170.f3364.m7106().m17895().forEach(IFeatureConfigurable::reset);
      return super.reset();
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      Class170.f3364.m7115().getHudHandler().tick();
   }

   @Subscribe(
      priority = -9999
   )
   public void onRender2D(EventRender2D var1) {
      long var2 = f8708 ^ 139330757467075L;
      int var4 = Class253.m9155();
      if (this.isToggled()) {
         Globals.mc.getProfiler().push("rusherhack_hud");
         if (!Globals.mc.getDebugHud().shouldShowDebugHud() && !(Globals.mc.currentScreen instanceof Class022)) {
            Class170.f3364.m7115().getHudHandler().renderElements(var1.getRenderContext(), -1.0, -1.0);
         }

         if (!(Globals.mc.currentScreen instanceof Class039)) {
            Iterator var5 = Class170.f3364.m7121().getVisibleWindows().iterator();

            while (var5.hasNext()) {
               Window var7;
               if ((var7 = (Window)var5.next()) instanceof IPinnable && ((IPinnable)var7).isPinned()) {
                  ((org.rusherhack.client.api.ui.theme.ITheme)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "º", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.ui.theme.ITheme.class, java.lang.Object.class, long.class, long.class)), Class170.f3364.m7115(),  7252448069354784513L,  var2))).getWindowHandler().renderWindow(var7, var1.getRenderContext(), -1.0, -1.0);
                  if (var4 == 0) {
                     break;
                  }
               }
            }
         }

         Class170.f3364.m7110().render(var1.getRenderContext());
         Globals.mc.getProfiler().pop();
      }
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f8716[var4] != null) {
         return var4;
      } else {
         Object var5 = f8715[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 30;
               case 1 -> 16;
               case 2 -> 46;
               case 3 -> 39;
               case 4 -> 31;
               case 5 -> 4;
               case 6 -> 42;
               case 7 -> 17;
               case 8 -> 5;
               case 9 -> 15;
               case 10 -> 62;
               case 11 -> 21;
               case 12 -> 14;
               case 13 -> 52;
               case 14 -> 55;
               case 15 -> 24;
               case 16 -> 40;
               case 17 -> 47;
               case 18 -> 60;
               case 19 -> 22;
               case 20 -> 63;
               case 21 -> 34;
               case 22 -> 56;
               case 23 -> 10;
               case 24 -> 28;
               case 25 -> 12;
               case 26 -> 11;
               case 27 -> 36;
               case 28 -> 9;
               case 29 -> 45;
               case 30 -> 57;
               case 31 -> 38;
               case 32 -> 33;
               case 33 -> 7;
               case 34 -> 54;
               case 35 -> 8;
               case 36 -> 13;
               case 37 -> 20;
               case 38 -> 53;
               case 39 -> 44;
               case 40 -> 2;
               case 41 -> 27;
               case 42 -> 59;
               case 43 -> 18;
               case 44 -> 23;
               case 45 -> 1;
               case 46 -> 26;
               case 47 -> 3;
               case 48 -> 43;
               case 49 -> 35;
               case 50 -> 29;
               case 51 -> 19;
               case 52 -> 51;
               case 53 -> 61;
               case 54 -> 25;
               case 55 -> 6;
               case 56 -> 48;
               case 57 -> 41;
               case 58 -> 50;
               case 59 -> 58;
               case 60 -> 32;
               case 61 -> 49;
               case 62 -> 0;
               default -> 37;
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

            f8716[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f8715[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f8716[var4]);
            f8715[var4] = var5;
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
      Object var5 = f8715[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f8716[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f8715[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f8715[var4] = var13;
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
               var12 = m180(2000065073333889L, 0L);
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
      Object var5 = f8715[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f8716[var4];
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
               f8715[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(2000065073333889L, 0L);
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
                     f8715[var4] = var19;
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
               var23 = m180(2000065073333889L, 0L);
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
         if (var8 != 201 && var8 != 252 && var8 != 230 && var8 != 249) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 186) {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 'm') {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 201) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 252) {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 230) {
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

   public static CallSite m265(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(HUD.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ӭ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
