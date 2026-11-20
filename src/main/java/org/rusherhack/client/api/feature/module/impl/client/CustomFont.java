package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import java.awt.Font;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.hud.IHudElement;
import org.rusherhack.client.api.feature.hud.ListHudElement;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.system.Fonts;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.command.CustomFontCommand;
public class CustomFont extends ToggleableModule implements Fonts {
   public BooleanSetting clickgui;
   public BooleanSetting f3024;
   public static NumberSetting<Float> shadowblur;
   public BooleanSetting f3026;
   public BooleanSetting italic;
   public StringSetting verdana;
   public NumberSetting<Integer> size;
   public BooleanSetting shadow;
   public BooleanSetting bold;
   public BooleanSetting hud;
   public static CustomFont f3033;
   public BooleanSetting windows;
   public static long f3035 = Class066.m4320(1388558733354211215L, -3010894154220580099L, MethodHandles.lookup().lookupClass()).m4325(82527568542814L);
   public static Object[] f3042 = new Object[100];
   public static String[] f3043 = new String[100];

   public CustomFont() {
        super(
         "CustomFont",
         "V}$\u000bnge RusherH1\u001ev~2f5sz{1\u001e s1\u001a1\u001etings",
         ModuleCategory.CLIENT
      );
      CustomFont var4 = this;
      int var10000 = Class253.m9155();

      int var3 = var10000;
      this.verdana = new StringSetting("Font", "Verdana").onChange(var1x -> {
         this.m6511();
      });
      this.bold = new BooleanSetting("Bold", false).setVisibility(() -> {
         String var10001x = (String)this.verdana.getValue();
         boolean var10004 = true;
         return this.m6507(var10001x, true);
      }).onChange(var1x -> {
         this.m6511();
      });
      this.italic = new BooleanSetting("Italic", false).setVisibility(() -> {
         String var10001x = (String)this.verdana.getValue();
         boolean var10004 = true;
         return this.m6508(var10001x, true);
      }).onChange(var1x -> {
         this.m6511();
      });
      Integer var10003 = 18;
      boolean var10006 = true;
      this.size = new NumberSetting<>("Size", var10003, 1, 30).onChange(var1x -> {
         this.m6511();
      });
      boolean var10013 = true;
      this.clickgui = new BooleanSetting("ClickGui", true);
      var10013 = true;
      this.shadow = new BooleanSetting("Shadow", true);
      boolean var10012 = true;
      this.hud = new BooleanSetting("HUD", true);
      boolean var10011 = true;
      this.f3024 = new BooleanSetting("Shadow", true);
      boolean var10010 = true;
      this.windows = new BooleanSetting("Windows", true);
      this.f3026 = new BooleanSetting("Shadow", false);
      this.setToggled(true);
      f3033 = this;
      Iterator var6;
      Iterator var7 = var6 = Class121.m5755().iterator();

      while (true) {
         if (!var7.hasNext()) {
            boolean var9 = true;
            var4.clickgui.addSubSettings(var4.shadow);
            boolean var10 = true;
            var4.hud.addSubSettings(var4.f3024);
            boolean var11 = true;
            var4.windows.addSubSettings(var4.f3026);
            Setting[] var10001 = new Setting[8];
            var10001[0] = var4.verdana;
            boolean var10005 = true;
            var10001[1] = var4.bold;
            var10001[2] = var4.italic;
            var10001[3] = var4.size;
            var10001[4] = shadowblur;
            var10001[5] = var4.clickgui;
            var10001[6] = var4.hud;
            var10001[7] = var4.windows;
            var4.registerSettings(var10001);
            break;
         }

         Font var5 = (Font)var6.next();
         boolean var8 = true;
         var4.verdana.addOptions(var5.getName());
         if (var3 == 0) {
            break;
         }

         var7 = var6;
      }
   }

   

   @Override
   public IFontRenderer getCustomFontRenderer() {
      return Renderer346.f5593;
   }

   public boolean m6507(String var1, boolean var2) {
      boolean var10002 = true;
      return true;
   }

   public boolean m6508(String var1, boolean var2) {
      boolean var10002 = true;
      return true;
   }

   @Override
   public IFontRenderer getClickGuiFontRenderer() {
      long var1 = f3035 ^ 43878806957444L;
      return this.isToggled() && this.clickgui.getValue() ? ((org.rusherhack.client.api.feature.module.impl.client.CustomFont)(this)).getCustomFontRenderer() : ((org.rusherhack.client.api.render.font.IFontRenderer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.render.font.IFontRenderer.class, java.lang.Object.class, long.class, long.class)), this,  260876544901067467L,  var1)));
   }

   @Override
   public IFontRenderer getWindowFontRenderer() {
      long var1 = f3035 ^ 110073126872128L;
      return this.isToggled() && this.windows.getValue() ? ((org.rusherhack.client.api.feature.module.impl.client.CustomFont)(this)).getCustomFontRenderer() : ((org.rusherhack.client.api.render.font.IFontRenderer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.render.font.IFontRenderer.class, java.lang.Object.class, long.class, long.class)), this,  -3865616655751251185L,  var1)));
   }

   public String m6510() {
        return null;
    }

   @Override
   public ModuleCommand createCommand() {
      return new CustomFontCommand(this, this);
   }

   @Override
   public IFontRenderer getVanillaFontRenderer() {
      return Class563.f9092;
   }

   @Override
   public IFontRenderer getFontRenderer() {
      long var1 = f3035 ^ 30501149807029L;
      return this.isToggled() ? ((org.rusherhack.client.api.feature.module.impl.client.CustomFont)(this)).getCustomFontRenderer() : ((org.rusherhack.client.api.render.font.IFontRenderer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.render.font.IFontRenderer.class, java.lang.Object.class, long.class, long.class)), this,  -4634224357201178886L,  var1)));
   }

   public void m6511() {
      CustomFont var4 = this;

      try {
         Renderer346.f5593.m14089(var4.m6510(), var4.size.getValue().intValue());
         Iterator var8 = Class170.f3364.m7106().m17895().iterator();

         while (var8.hasNext()) {
            IHudElement var5;
            IHudElement var9 = var5 = (IHudElement)var8.next();

            try {
               if (!(var9 instanceof ListHudElement)) {
                  continue;
               }
            } catch (Exception var6) {
               throw m672(var6);
            }

            ((ListHudElement)var5).resort();
         }
      } catch (Exception var7) {
         this.sendNotification(NotificationType.ERROR, "Failed to set font: " + this.verdana.getName(), this.verdana.hashCode());
         ILogger var10000 = this.getLogger();
         Object[] var10002 = new Object[]{this.verdana.getName(), null};
         boolean var10006 = true;
         var10002[1] = var7;
         var10000.error("Failed to set font: {0}", var10002);
      }
   }

   @Override
   public IFontRenderer getHudFontRenderer() {
      long var1 = f3035 ^ 2666241710617L;
      return this.isToggled() && this.hud.getValue() ? ((org.rusherhack.client.api.feature.module.impl.client.CustomFont)(this)).getCustomFontRenderer() : ((org.rusherhack.client.api.render.font.IFontRenderer)(org.rusherhack.ZkmDispatch.invoke(m265(java.lang.invoke.MethodHandles.lookup(), "j", java.lang.invoke.MethodType.methodType(org.rusherhack.client.api.render.font.IFontRenderer.class, java.lang.Object.class, long.class, long.class)), this,  8359793963164452182L,  var1)));
   }

   public static Exception m672(Exception var0) {
      return var0;
   }
   public static int m178(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f3043[var4] != null) {
         return var4;
      } else {
         Object var5 = f3042[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;

            var6 = switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> 4;
               case 1 -> 15;
               case 2 -> 17;
               case 3 -> 27;
               case 4 -> 14;
               case 5 -> 49;
               case 6 -> 39;
               case 7 -> 56;
               case 8 -> 1;
               case 9 -> 63;
               case 10 -> 32;
               case 11 -> 28;
               case 12 -> 9;
               case 13 -> 41;
               case 14 -> 8;
               case 15 -> 6;
               case 16 -> 22;
               case 17 -> 35;
               case 18 -> 50;
               case 19 -> 29;
               case 20 -> 23;
               case 21 -> 51;
               case 22 -> 5;
               case 23 -> 38;
               case 24 -> 13;
               case 25 -> 52;
               case 26 -> 59;
               case 27 -> 18;
               case 28 -> 53;
               case 29 -> 20;
               case 30 -> 44;
               case 31 -> 12;
               case 32 -> 2;
               case 33 -> 31;
               case 34 -> 42;
               case 35 -> 16;
               case 36 -> 24;
               case 37 -> 19;
               case 38 -> 40;
               case 39 -> 26;
               case 40 -> 46;
               case 41 -> 34;
               case 42 -> 45;
               case 43 -> 11;
               case 44 -> 21;
               case 45 -> 58;
               case 46 -> 7;
               case 47 -> 54;
               case 48 -> 47;
               case 49 -> 62;
               case 50 -> 36;
               case 51 -> 0;
               case 52 -> 33;
               case 53 -> 30;
               case 54 -> 55;
               case 55 -> 25;
               case 56 -> 48;
               case 57 -> 3;
               case 58 -> 57;
               case 59 -> 37;
               case 60 -> 43;
               case 61 -> 10;
               case 62 -> 60;
               default -> 61;
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

            f3043[var4] = new String(var13);
            return var4;
         }
      }
   }
   public static Class m180(long var0, long var2) {
      Class var5 = null;
      int var4 = m178(var0, var2);
      Object var6 = f3042[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f3043[var4]);
            f3042[var4] = var5;
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
      Object var5 = f3042[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f3043[var4];
         int var7 = var6.indexOf(8);
         Class var8 = m180(Long.parseLong(var6.substring(0, var7), 36), 0L);
         int var9 = var6.indexOf(8, ++var7);
         String var10 = var6.substring(var7, var9);
         Class var11 = m180(Long.parseLong(var6.substring(++var9), 36), 0L);
         Class var12 = var8;

         while (true) {
            Field var13 = m181(var12, var10, var11);
            if (var13 != null) {
               f3042[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for (int var15 = 0; var15 < var14.length; var15++) {
                  var13 = m182(var14[var15], var10, var11);
                  if (var13 != null) {
                     f3042[var4] = var13;
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
               var12 = m180(585193351742479L, 0L);
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
      Object var5 = f3042[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f3043[var4];
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
               f3042[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = m180(585193351742479L, 0L);
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
                     f3042[var4] = var19;
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
               var23 = m180(585193351742479L, 0L);
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
         if (var8 != 228 && var8 != 'y' && var8 != 233 && var8 != 203) {
            var11 = m186(var4, var6);
            Class var17 = var11.getDeclaringClass();
            String var19 = var11.getName();
            MethodType var20 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'j') {
               var9 = var0.findVirtual(var17, var19, var20);
            } else if (var8 == 206) {
               var9 = var0.findStatic(var17, var19, var20);
            } else {
               var9 = var0.findSpecial(var17, var19, var20, var17);
            }
         } else {
            var10 = m183(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var18 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 228) {
               var9 = var0.findGetter(var12, var18, var14);
            } else if (var8 == 'y') {
               var9 = var0.findSetter(var12, var18, var14);
            } else if (var8 == 233) {
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(CustomFont.class, "m188", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ł" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
