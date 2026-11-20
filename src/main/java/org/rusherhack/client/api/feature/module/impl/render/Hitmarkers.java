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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.graphic.TextureGraphic;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Time;
public class Hitmarkers extends ToggleableModule {
   public Targets f9386;
   public int f9387;
   public NumberSetting<Float> volume;
   public BooleanSetting sound;
   public TextureGraphic f9390;
   public NumberSetting<Float> scale;
   public NumberSetting<Integer> time;
   public static long f9394 = Class066.m4320(6439143011808486889L, 4355135417172380726L, MethodHandles.lookup().lookupClass()).m4325(277179805994272L);
   public static long[] f9398;
   public static Integer[] f9399;
   public static Map f9400;

   public Hitmarkers() {
        super("Hitmarkers", "Hitmarkers from Call of Duty", ModuleCategory.RENDER);
      long var1 = f9394 ^ 68017535306493L;

      Integer var10009 = m175(3118, 2508194893587135905L ^ var1);
      boolean var10012 = true;
      this.time = new NumberSetting<>("Time", var10009, 1, m175(30182, 1108657611825857640L ^ var1));
      this.scale = new NumberSetting<>("Scale", 1.0F, 0.5F, 5.0F);
      boolean var4 = true;
      this.sound = new BooleanSetting("Sound", true);
      this.volume = new NumberSetting<>("Volume", 1.0F, 0.0F, 1.0F);
      Targets var10002 = new Targets();
      boolean var10006 = true;
      this.f9386 = var10002.m9193(false, true);
      boolean var10003 = true;
      this.sound.addSubSettings(this.volume);
      Setting[] var10001 = new Setting[]{this.time, null, null};
      boolean var10005 = true;
      var10001[1] = this.scale;
      var10001[2] = this.f9386;
      this.registerSettings(var10001);

      try {
         this.f9390 = new TextureGraphic(
            "rusherhack/graphics/hitmarker.png", m175(5139, 8841122572949071262L ^ var1), m175(5092, 7967879604789158504L ^ var1)
         );
      } catch (Throwable var3) {
         this.getLogger().error("Failed to load hitmarker graphic");
      }
   }

   @Subscribe
   public void onInteract(EventInteract var1) {
      if (var1.getAction() == EventInteract$Action.ATTACK) {
         if (this.f9386.m7993(var1.getTargetEntity())) {
         }

         this.f9387 = this.time.getValue();
      }
   }

   @Subscribe(
      priority = -420
   )
   public void onRender2D(EventRender2D var1) {
      double var5 = (this.f9387 / 2.0F - 8.0F * this.scale.getValue()) * (1.0F / this.scale.getValue()) - 0.5;
      double var7 = (var1.getGraphics().getScaledWindowHeight() / 2.0F - 8.0F * this.scale.getValue()) * (1.0F / this.scale.getValue()) - 0.5;
      RusherHackAPI.getRenderer2D().drawGraphicRectangle(this.f9390, var5, var7, 16.0, 16.0);
      RusherHackAPI.getRenderer2D().end();
      var1.getMatrixStack().pop();
   }

   @Override
   public void onEnable() {
      this.f9387 = 0;
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17612;
      if (f9399[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = f9398[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])f9400.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f9400.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/գ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f9399[var3] = var15;
      }

      return f9399[var3];
   }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = m175(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Hitmarkers.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/գ" + " : " + var1 + " : " + var2.toString(), var5);
      }
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
}
