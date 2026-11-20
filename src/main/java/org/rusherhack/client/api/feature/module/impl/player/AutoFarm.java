package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2LongMap;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.awt.Color;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Shearable;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.breed;
import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
public class AutoFarm extends ToggleableModule {
   public BooleanSetting rotate;
   public AnimalEntity f6078;
   public BooleanSetting harvest;
   public BooleanSetting render;
   public Int2LongMap f6081;
   public NumberSetting<Integer> delay;
   public BlockPos f6083;
   public Map<BlockPos, CropBlock> f6084;
   public Timer f6085;
   public BooleanSetting shear;
   public BooleanSetting silentswap;
   public NumberSetting<Float> range;
   public Timer f6089;
   public ColorSetting color;
   public BooleanSetting replant;
   public BooleanSetting breed;
   public static long f6093 = Class066.m4320(9081665190412752797L, 216532126785321027L, MethodHandles.lookup().lookupClass()).m4325(103564599805484L);
   public static long[] f6097;
   public static Integer[] f6098;
   public static Map f6099;
   public static long f6100;

   @Subscribe
   public void onRender3D(EventRender3D var1) {
   }

   public void m12121() {
      if (this.f6083 == null || Class220.m8450(this.f6083) > this.range.getValue()) {
         this.f6083 = null;
         if (!this.f6084.isEmpty()) {
         }
      }
   }

   @Override
   public void onEnable() {
      this.f6081.clear();
   }

   public boolean m12123(AnimalEntity var1) {
      if (!(Boolean)this.shear.getValue()) {
         return false;
      } else if (var1 instanceof Shearable && ((Shearable)var1).isShearable()) {
         boolean var10004 = true;
         if (InventoryUtils.findItem(Items.SHEARS, true, true) >= 36) {
            boolean var6 = true;
            return true;
         } else {
            boolean var10002 = true;
            return false;
         }
      } else {
         return false;
      }
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.f6081.clear();
   }

   public boolean m12125(AnimalEntity var1) {
        return false;
    }

   public void m12126() {
        
    }

   public boolean m12128(AnimalEntity var1, ItemStack var2) {
      if (var1 instanceof AbstractHorseEntity && ((AbstractHorseEntity)var1).isTame() && var2.getItem() == Items.GOLDEN_APPLE) {
         boolean var10002 = true;
         return true;
      } else {
         return var1.isBreedingItem(var2);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.m12126();
      if (this.f6078 == null) {
         this.m12121();
      }
   }

   public AutoFarm() {
      super("AutoFarm", "Farms animals and crops around you", ModuleCategory.PLAYER);
      boolean var10020 = true;
      this.harvest = new BooleanSetting("Harvest", true);
      boolean var10019 = true;
      this.replant = new BooleanSetting("Replant", true);
      boolean var10018 = true;
      this.render = new BooleanSetting("Render", true);
      ColorSetting var10012 = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 50));
      boolean var10015 = true;
      this.color = var10012.setThemeSync(true);
      boolean var10016 = true;
      this.breed = new BooleanSetting("Breed", true);
      this.shear = new BooleanSetting("Shear", false);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      boolean var10013 = true;
      this.silentswap = new BooleanSetting("SilentSwap", true);
      this.range = new NumberSetting<>("Range", 3.0F, 1.0F, 6.0F);
      boolean var10011 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.f6089 = new Timer();
      this.f6085 = new Timer();
      this.f6084 = new HashMap<>();
      this.f6081 = new Int2LongOpenHashMap();
      BooleanSetting var10000 = this.harvest;
      Setting[] var10001 = new Setting[]{this.replant, null};
      boolean var10005 = true;
      var10001[1] = this.render;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.render.addSubSettings(this.color);
      var10001 = new Setting[7];
      var10001[0] = this.harvest;
      var10005 = true;
      var10001[1] = this.breed;
      var10001[2] = this.shear;
      var10001[3] = this.delay;
      var10001[4] = this.silentswap;
      var10001[5] = this.range;
      var10001[6] = this.rotate;
      this.registerSettings(var10001);
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4911;
      if (f6098[var3] == null) {
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
         long var5 = f6097[var3];
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
         Object[] var9 = (Object[])f6099.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f6099.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Υ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f6098[var3] = var15;
      }

      return f6098[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoFarm.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Υ" + " : " + var1 + " : " + var2.toString(), var5);
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
