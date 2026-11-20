package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectIntPair;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.BossBar.Style;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.gui.IMixinBossHealthOverlay;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;

public class BossStack extends ToggleableModule {
   public EnumSetting<BossStackMode> mode;
   public static long f7884 = Class066.m4320(-9150581352159973916L, -6749396130084251351L, MethodHandles.lookup().lookupClass()).m4325(237003471625200L);
   public static Object[] f7891 = new Object[112];
   public static String[] f7892 = new String[112];

   public void m15229(DrawContext var1, int var2, int var3, BossBar var4, int var5, Identifier[] var6, Identifier[] var7) {
      var1.drawGuiTexture(var6[var4.getColor().ordinal()], 182, 5, 0, 0, var2, var3, var5, 5);
      if (var4.getStyle() != Style.PROGRESS) {
         RenderSystem.enableBlend();
         int var10002 = var4.getStyle().ordinal();
         boolean var10005 = true;
         var1.drawGuiTexture(var7[var10002 - 1], 182, 5, 0, 0, var2, var3, var5, 5);
         RenderSystem.disableBlend();
      }
   }

   public BossStack() {
      super("BossStack", "aCHEJU\fXDI\f\u001a\boss bars", ModuleCategory.RENDER);
      this.mode = new EnumSetting<>("Mode", BossStackMode.f6071);
      this.registerSettings(this.mode);
   }

   public void m15231(DrawContext var1, int var2, int var3, BossBar var4) {
      this.m15229(var1, var2, var3, var4, 182, BossBarHud.BACKGROUND_TEXTURES, BossBarHud.NOTCHED_BACKGROUND_TEXTURES);
      int var7;
      if ((var7 = MathHelper.lerpPositive(var4.getPercent(), 0, 182)) > 0) {
         this.m15229(var1, var2, var3, var4, var7, BossBarHud.PROGRESS_TEXTURES, BossBarHud.NOTCHED_PROGRESS_TEXTURES);
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void m15232(Event565 var1) {
      if (var1.m17383().equals(Enum201.f3770)) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f7892[var4] != null) {
         return var4;
      } else {
         Object var5 = f7891[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 6;
               case 1 -> 38;
               case 2 -> 40;
               case 3 -> 32;
               case 4 -> 29;
               case 5 -> 27;
               case 6 -> 16;
               case 7 -> 9;
               case 8 -> 62;
               case 9 -> 48;
               case 10 -> 17;
               case 11 -> 3;
               case 12 -> 23;
               case 13 -> 45;
               case 14 -> 2;
               case 15 -> 31;
               case 16 -> 43;
               case 17 -> 28;
               case 18 -> 39;
               case 19 -> 11;
               case 20 -> 55;
               case 21 -> 56;
               case 22 -> 14;
               case 23 -> 36;
               case 24 -> 54;
               case 25 -> 12;
               case 26 -> 58;
               case 27 -> 63;
               case 28 -> 53;
               case 29 -> 33;
               case 30 -> 15;
               case 31 -> 51;
               case 32 -> 18;
               case 33 -> 24;
               case 34 -> 41;
               case 35 -> 49;
               case 36 -> 47;
               case 37 -> 4;
               case 38 -> 42;
               case 39 -> 20;
               case 40 -> 37;
               case 41 -> 30;
               case 42 -> 0;
               case 43 -> 21;
               case 44 -> 35;
               case 45 -> 52;
               case 46 -> 19;
               case 47 -> 10;
               case 48 -> 13;
               case 49 -> 57;
               case 50 -> 46;
               case 51 -> 8;
               case 52 -> 25;
               case 53 -> 22;
               case 54 -> 34;
               case 55 -> 5;
               case 56 -> 44;
               case 57 -> 59;
               case 58 -> 60;
               case 59 -> 61;
               case 60 -> 50;
               case 61 -> 7;
               case 62 -> 26;
               default -> 1;
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

            f7892[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f7891[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f7892[var4]);
            f7891[var4] = var5;
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
      Object var5 = f7891[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f7892[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f7891[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f7891[var4] = var13;
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
               var12 = m180(124464948230585L, 0L);
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
      Object var5 = f7891[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f7892[var4];
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
               f7891[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(124464948230585L, 0L);
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
                     f7891[var4] = var19;
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
               var23 = m180(124464948230585L, 0L);
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
         if (var8 != 246 && var8 != 'J' && var8 != 186 && var8 != 194) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'a') {
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
            if (var8 == 246) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'J') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 186) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(BossStack.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ѻ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
