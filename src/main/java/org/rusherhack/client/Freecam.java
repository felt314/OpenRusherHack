package org.rusherhack.client;
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
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import org.rusherhack.Class066;
import org.rusherhack.Event174;
import org.rusherhack.Event301;
import org.rusherhack.Event516;
import org.rusherhack.Event601;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.bind;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Freecam extends ToggleableModule {
   public KeyboardInput f1225;
   public Entity f1226;
   public Class027 f1227;
   public BooleanSetting letsYouSpectateFromAnyEntitySPov;
   public BooleanSetting debug;
   public static Freecam f1230;
   public NumberSetting<Double> speed;
   public Entity f1232;
   public Class056 f1233;
   public BindSetting f1234;
   public static int f1235;
   public static long f1236 = Class066.m4320(940214206480511937L, 678773701811572822L, MethodHandles.lookup().lookupClass()).m4325(174691989265151L);
   public static long[] f1240;
   public static Integer[] f1241;
   public static Map f1242;

   public Freecam() {
    }

   

   @Subscribe
   public void onKey(EventMouse$Key var1) {
      if ((Boolean)this.letsYouSpectateFromAnyEntitySPov.getValue()) {
         if (var1.getButton() == 2) {
            int var9 = var1.getAction();
            boolean var10003 = true;
            if (var9 == 1) {
               HitResult var5 = Globals.mc.crosshairTarget;
               EntityHitResult var7;
               if (Globals.mc.crosshairTarget instanceof EntityHitResult && !(var7 = (EntityHitResult)var5).getEntity().equals(Globals.mc.player)) {
                  Globals.mc.setCameraEntity(this.f1226 = var7.getEntity());
                  return;
               }

               Globals.mc.setCameraEntity(this.f1233);
               return;
            }
         }
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
   }

   @Override
   public void onEnable() {
      long var1 = f1236 ^ 131330960144660L;
      int var3 = m2930();
      if (var3 != 0) {
         if (Globals.mc.player != null && Globals.mc.world != null) {
            this.f1232 = Globals.mc.getCameraEntity();
            this.f1233 = new Class056();
            this.f1233.setId(m175(22004, 661709648832979086L ^ var1));
            Globals.mc.setCameraEntity(this.f1233);
            Globals.mc.world.addEntity(this.f1233);
            return;
         }

         this.toggle();
      }
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.toggle();
   }

   @Subscribe
   public void m2920(Event601 var1) {
      boolean var10003 = true;
      var1.setCancelled(true);
   }

   @Subscribe
   public void m2921(Event174 var1) {
      this.toggle();
   }

   @Subscribe
   public void onMove(EventMove var1) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL
   )
   public void onRender2D(EventRender2D var1) {
        
    }

   @Subscribe(
      stage = Stage.POST,
      priority = 100
   )
   public void m2924(Event301 var1) {
        
    }

   @Override
   public void onDisable() {
      long var1 = f1236 ^ 133678391924649L;
      if (Globals.mc.player != null && Globals.mc.world != null) {
         Globals.mc.setCameraEntity(this.f1232);
         Globals.mc.world.removeEntity(m175(12063, 5280988798000510169L ^ var1), RemovalReason.DISCARDED);
         this.f1233.remove(RemovalReason.DISCARDED);
         this.f1233 = null;
         Globals.mc.player.input = this.f1225;
         this.f1226 = null;
      }
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.toggle();
   }

   @Subscribe
   public void m2926(Event516 var1) {
      this.f1233.changeLookDirection(var1.m15870(), var1.m15869());
   }

   @Subscribe
   public void onInteract(EventInteract var1) {
      if (var1.getTargetEntity() instanceof ClientPlayerEntity) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   public boolean m2928() {
      return ((IKey)this.f1234.getValue()).isKeyDown();
   }

   public static void m2929(int var0) {
      f1235 = var0;
   }

   public static int m2930() {
      return f1235;
   }

   public static int m2931() {
      int var0 = m2930();
      return var0 == 0 ? 124 : 0;
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 606;
      if (f1241[var3] == null) {
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
         long var5 = f1240[var3];
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
         Object[] var9 = (Object[])f1242.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f1242.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/client/Ǡ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f1241[var3] = var15;
      }

      return f1241[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(Freecam.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/client/Ǡ" + " : " + var1 + " : " + var2.toString(), var5);
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
