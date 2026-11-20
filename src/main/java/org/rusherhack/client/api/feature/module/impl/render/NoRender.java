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
import net.minecraft.client.particle.BlockDustParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.FireworksSparkParticle.FireworkParticle;
import net.minecraft.client.particle.FireworksSparkParticle.Flash;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRenderBlockEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.events.render.EventRenderEntity$Armor;
import org.rusherhack.client.api.events.render.EventRenderEntity$ItemFrameParts;
import org.rusherhack.client.api.events.render.EventRenderScreen$Background;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Armor;
import org.rusherhack.client.api.feature.hud.impl.PotionEffects;
import org.rusherhack.client.api.feature.hud.impl.Weather;
import org.rusherhack.client.api.feature.module.impl.client.Background;
import org.rusherhack.client.api.feature.module.impl.combat.Criticals;
public class NoRender extends ToggleableModule {
   public BooleanSetting totempop;
   public BooleanSetting totempops;
   public Setting<Integer> opacity;
   public BooleanSetting fireworks;
   public BooleanSetting hurtcam;
   public NumberSetting<Integer> f4465;
   public BooleanSetting nocluster;
   public BooleanSetting background;
   public BooleanSetting scoreboard;
   public BooleanSetting item;
   public BooleanSetting fog;
   public BooleanSetting armor;
   public BooleanSetting itemframes;
   public BooleanSetting barriers;
   public NumberSetting<Integer> limit;
   public BooleanSetting ridingentity;
   public BooleanSetting caveculling;
   public BooleanSetting bobbing;
   public BooleanSetting overlays;
   public BooleanSetting blindness;
   public BooleanSetting potionoverlay;
   public NullSetting entities;
   public BooleanSetting entity;
   public BooleanSetting blockbreak;
   public BooleanSetting potioneffects;
   public BooleanSetting criticals;
   public BooleanSetting sprinting;
   public BooleanSetting fallingblocks;
   public BooleanSetting armorstands;
   public NumberSetting<Float> occludedistance;
   public BooleanSetting weather;
   public BooleanSetting explosions;
   public BooleanSetting projectiles;
   public NumberSetting<Float> range;
   public BooleanSetting eating;
   public NullSetting world;
   public int f4496;
   public BooleanSetting xp;
   public NullSetting ui;
   public NullSetting player;
   public NullSetting particles;
   public BooleanSetting items;
   public BooleanSetting blockentitylimit;
   public static long f4503 = Class066.m4320(2434426767676554098L, -3593323404577445268L, MethodHandles.lookup().lookupClass()).m4325(269462555952056L);
   public static long[] f4507;
   public static Integer[] f4508;
   public static Map f4509;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe
   public void onItemFrameParts(EventRenderEntity$ItemFrameParts var1) {
        
    }

   @Subscribe
   public void onBackground(EventRenderScreen$Background var1) {
      if ((Boolean)this.background.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void m9113(Class227 var1) {
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (!(Boolean)this.bobbing.getValue()) {
            return;
         }

         Globals.mc.player.strideDistance = Globals.mc.player.prevStrideDistance = 0.0F;
      }

      boolean var10003 = true;
      var1.setCancelled(true);
   }

   @Subscribe
   public void onArmor(EventRenderEntity$Armor var1) {
      if ((Boolean)this.armor.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void m9115(Event601 var1) {
      if ((Boolean)this.caveculling.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe
   public void m9116(Event565 var1) {
        
    }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onRender2D(EventRender2D var1) {
      this.f4496 = 0;
   }

   @Subscribe
   public void m9118(Class519 var1) {
        
    }

   @Subscribe
   public void m9119(Class491 var1) {
      if ((Boolean)this.totempop.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void m9120(Class535 var1) {
      if ((Boolean)this.fog.getValue() && var1.m16518().equals(FogType.FOG_TERRAIN)) {
         var1.f8613 = FogShape.CYLINDER;
         var1.f8614 = -1.0F;
         var1.f8611 = 1000000.0F;
      }
   }

   @Subscribe
   public void onRenderEntity(EventRenderEntity var1) {
      Entity var5;
      if ((var5 = var1.getEntity()) instanceof ItemFrameEntity) {
         if ((Boolean)this.itemframes.getValue()
            && ((Boolean)this.entity.getValue() && (Boolean)this.item.getValue() || Globals.mc.getCameraEntity().distanceTo(var5) >= this.occludedistance.getValue())) {
            boolean var10003 = true;
            var1.setCancelled(true);
            return;
         }
      } else if (var5 instanceof FallingBlockEntity) {
         if ((Boolean)this.fallingblocks.getValue()) {
            boolean var8 = true;
            var1.setCancelled(true);
            return;
         }
      } else if (var5 instanceof ItemEntity) {
         if ((Boolean)this.items.getValue()) {
            boolean var9 = true;
            var1.setCancelled(true);
            return;
         }
      } else {
         if ((Boolean)this.ridingentity.getValue() && Globals.mc.player.getVehicle() != null && var1.getEntity().equals(Globals.mc.player.getVehicle())) {
            boolean var13 = true;
            var1.setCancelled(true);
            return;
         }

         if (var5 instanceof ArmorStandEntity) {
            if ((Boolean)this.armorstands.getValue()) {
               boolean var10 = true;
               var1.setCancelled(true);
               return;
            }
         } else {
            if ((Boolean)this.projectiles.getValue() && var5 instanceof ProjectileEntity) {
               boolean var12 = true;
               var1.setCancelled(true);
               return;
            }

            if ((Boolean)this.xp.getValue() && var5 instanceof ExperienceOrbEntity) {
               boolean var11 = true;
               var1.setCancelled(true);
            }
         }
      }
   }

   @Subscribe
   public void m9122(Class275 var1) {
      if ((Boolean)this.hurtcam.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void m9123(Event485 var1) {
      if ((Boolean)this.weather.getValue()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if ((Boolean)this.blindness.getValue()) {
         Globals.mc.player.removeStatusEffect(StatusEffects.NAUSEA);
         Globals.mc.player.removeStatusEffect(StatusEffects.BLINDNESS);
         Globals.mc.player.removeStatusEffect(StatusEffects.DARKNESS);
      }
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onRenderBlockEntity(EventRenderBlockEntity var1) {
      if ((Boolean)this.blockentitylimit.getValue()) {
         if (this.f4496 < this.limit.getValue()
            && !(Globals.mc.player.getPos().distanceTo(Vec3d.ofCenter(var1.getBlockEntity().getPos())) > this.f4465.getValue().intValue())) {
            boolean var10004 = true;
            this.f4496++;
         } else {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   public NoRender() {
        super(
         "NoRender",
         "Prevent' \u0019K\\W]\\KPW^\u0019V_\u0019Z\\KMXPW\u0019MQPW^\u001e\u0019",
         ModuleCategory.RENDER
      );
      long var1 = f4503 ^ 98020261719831L;

      this.player = new NullSetting("Player");
      boolean var10049 = true;
      this.overlays = new BooleanSetting("Overlays", true);
      this.bobbing = new BooleanSetting("Bobbing", false);
      this.hurtcam = new BooleanSetting("Hurtcam", false);
      boolean var10046 = true;
      this.blindness = new BooleanSetting("Blindness", true);
      boolean var10045 = true;
      this.totempop = new BooleanSetting("TotemPop", true);
      this.ui = new NullSetting("UI");
      this.background = new BooleanSetting("Background", false);
      this.scoreboard = new BooleanSetting("Scoreboard", false);
      boolean var10041 = true;
      this.potionoverlay = new BooleanSetting("PotionOverlay", true);
      this.entities = new NullSetting("Entities");
      this.nocluster = new BooleanSetting("NoCluster", false);
      this.range = new NumberSetting<>("Range", 3.0F, 1.0F, 10.0F);
      this.opacity = new NumberSetting<>("Opacity", m175(19803, 2185918682707133690L ^ var1), 0, m175(5801, 7293175469652729604L ^ var1));
      this.armor = new BooleanSetting("Armor", false);
      this.itemframes = new BooleanSetting("ItemFrames", false);
      this.occludedistance = new NumberSetting<>("OccludeDistance", "Item frames further than this distance will be hidden", 180.0F, 0.0F, 180.0F).incremental(1.0);
      boolean var10033 = true;
      this.entity = new BooleanSetting("Entity", true);
      boolean var10032 = true;
      this.item = new BooleanSetting("Item", true);
      this.fallingblocks = new BooleanSetting("FallingBlocks", false);
      this.items = new BooleanSetting("Items", false);
      this.ridingentity = new BooleanSetting("RidingEntity", false);
      this.armorstands = new BooleanSetting("ArmorStands", false);
      this.projectiles = new BooleanSetting("Projectiles", false);
      this.xp = new BooleanSetting("XP", false);
      this.world = new NullSetting("World");
      boolean var10024 = true;
      this.weather = new BooleanSetting("Weather", true);
      this.fog = new BooleanSetting("Fog", false);
      this.caveculling = new BooleanSetting("CaveCulling", false);
      this.blockentitylimit = new BooleanSetting("BlockEntityLimit", false);
      this.limit = new NumberSetting<>("Limit", m175(24562, 362956508021757534L ^ var1), 0, m175(24703, 1865006385223608799L ^ var1));
      this.f4465 = new NumberSetting<>("Range", m175(19872, 2498700603267810313L ^ var1), 0, m175(15922, 6469397592367626140L ^ var1));
      this.particles = new NullSetting("Particles");
      boolean var10017 = true;
      this.fireworks = new BooleanSetting("Fireworks", true);
      this.barriers = new BooleanSetting("Barriers", false);
      this.explosions = new BooleanSetting("Explosions", false);
      this.blockbreak = new BooleanSetting("BlockBreak", false);
      this.eating = new BooleanSetting("Eating", false);
      this.criticals = new BooleanSetting("Criticals", false);
      this.potioneffects = new BooleanSetting("PotionEffects", false);
      this.totempops = new BooleanSetting("TotemPops", false);
      this.sprinting = new BooleanSetting("Sprinting", false);
      this.f4496 = 0;
      NullSetting var10000 = this.player;
      Setting[] var10001 = new Setting[]{this.overlays, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.bobbing;
      var10001[2] = this.hurtcam;
      var10001[3] = this.blindness;
      var10001[4] = this.totempop;
      var10000.addSubSettings(var10001);
      var10000 = this.ui;
      var10001 = new Setting[]{this.background, null, null};
      var10005 = true;
      var10001[1] = this.scoreboard;
      var10001[2] = this.potionoverlay;
      var10000.addSubSettings(var10001);
      var10000 = this.entities;
      var10001 = new Setting[m175(24794, 747109670321400178L ^ var1)];
      var10001[0] = this.armor;
      var10005 = true;
      var10001[1] = this.itemframes;
      var10001[2] = this.fallingblocks;
      var10001[3] = this.items;
      var10001[4] = this.ridingentity;
      var10001[5] = this.armorstands;
      var10001[m175(32262, 2509108692318795692L ^ var1)] = this.projectiles;
      var10001[m175(15601, 1439301719048746324L ^ var1)] = this.xp;
      var10000.addSubSettings(var10001);
      var10000 = this.world;
      var10001 = new Setting[]{this.weather, null, null, null};
      var10005 = true;
      var10001[1] = this.fog;
      var10001[2] = this.caveculling;
      var10001[3] = this.blockentitylimit;
      var10000.addSubSettings(var10001);
      var10000 = this.particles;
      var10001 = new Setting[m175(30698, 4236416867163192904L ^ var1)];
      var10001[0] = this.fireworks;
      var10005 = true;
      var10001[1] = this.barriers;
      var10001[2] = this.explosions;
      var10001[3] = this.blockbreak;
      var10001[4] = this.eating;
      var10001[5] = this.criticals;
      var10001[m175(16672, 7582163604093241475L ^ var1)] = this.potioneffects;
      var10001[m175(17942, 7944940629684031417L ^ var1)] = this.totempops;
      var10001[m175(4903, 6104260239360055948L ^ var1)] = this.sprinting;
      var10000.addSubSettings(var10001);
      BooleanSetting var7 = this.blockentitylimit;
      var10001 = new Setting[]{this.limit, null};
      var10005 = true;
      var10001[1] = this.f4465;
      var7.addSubSettings(var10001);
      BooleanSetting var8 = this.itemframes;
      var10001 = new Setting[]{this.occludedistance, null, null};
      var10005 = true;
      var10001[1] = this.entity;
      var10001[2] = this.item;
      var8.addSubSettings(var10001);
      var10001 = new Setting[]{this.player, null, null, null, null};
      var10005 = true;
      var10001[1] = this.ui;
      var10001[2] = this.entities;
      var10001[3] = this.world;
      var10001[4] = this.particles;
      this.registerSettings(var10001);
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23210;
      if (f4508[var3] == null) {
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
         long var5 = f4507[var3];
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
         Object[] var9 = (Object[])f4509.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f4509.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ȅ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f4508[var3] = var15;
      }

      return f4508[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(NoRender.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ȅ" + " : " + var1 + " : " + var2.toString(), var5);
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
