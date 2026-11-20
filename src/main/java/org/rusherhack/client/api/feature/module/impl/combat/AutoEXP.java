package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Durability;
public class AutoEXP extends ToggleableModule {
   public BooleanSetting takesOffAndReequipsArmorToReduceXpUsage;
   public BooleanSetting donTUnequipYourElytraIfYouAreFlying;
   public NumberSetting<Integer> delay;
   public BooleanSetting pausesWhileAPlayerIsInRange;
   public boolean f2090;
   public BooleanSetting pauseTheAutoarmorModule;
   public EnumSetting<AutoEXPMode> mode;
   public BooleanSetting storesUnequippedArmorInYourCraftingSlots;
   public java.util.Queue<Runnable> f2094;
   public BooleanSetting rotate;
   public boolean f2096;
   public static AutoEXP f2097;
   public NumberSetting<Integer> f2098;
   public int f2099;
   public BooleanSetting automaticallySwitchesToXpBottles;
   public NumberSetting<Float> range;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public BooleanSetting switchServerSideOnly;
   public Map<EquipmentSlot, ItemStack> f2104;
   public Timer f2105;
   public static long f2106 = Class066.m4320(9177531624054063768L, 3359741192566562144L, MethodHandles.lookup().lookupClass()).m4325(256528555736136L);
   public static long[] f2110;
   public static Integer[] f2111;
   public static Map f2112;

   @Nullable
   public BlockPos m4809() {
      int var10000 = Class253.m9154();
      BlockPos var6 = Globals.mc.player.getBlockPos().down();
      int var3 = var10000;
      if (!Globals.mc.world.isAir(var6)) {
         return var6;
      } else {
         BlockPos var8 = var6.add(-1, -1, -1);
         boolean var10006 = true;

         label23:
         for (BlockPos var9 : BlockPos.iterate(var8, var6.add(1, 1, 1))) {
            BlockPos var5;
            do {
               var5 = var9;
               if (Globals.mc.world.isAir(var5)) {
                  continue label23;
               }

               var9 = var5;
            } while (var3 != 0);

            return var5;
         }

         return null;
      }
   }

   public AutoEXP() {
      super(
         "AutoEXP",
         "T`azxta|vtyyl5gpet|g5lz`g5$\u000brmor",
         ModuleCategory.COMBAT
      );
      this.mode = new EnumSetting<>("Mode", AutoEXPMode.f8766);
      this.f2098 = new NumberSetting<>(
         "Durability%",
         "The percentage at which armor should be repaired",
         50,
         0,
         99
      );
      boolean var10016 = true;
      this.takesOffAndReequipsArmorToReduceXpUsage = new BooleanSetting("DynamicArmor", "Takes off and reequips armor to reduce xp usage", true);
      boolean var10014 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      var10014 = true;
      this.pauseTheAutoarmorModule = new BooleanSetting("PauseAutoArmor", "Pause the AutoArmor module", true);
      boolean var10013 = true;
      this.pausesWhileAPlayerIsInRange = new BooleanSetting("Smart", "Pauses while a player is in range", true);
      this.range = new NumberSetting<>("Range", 10.0F, 0.0F, 50.0F);
      boolean var10011 = true;
      this.storesUnequippedArmorInYourCraftingSlots = new BooleanSetting("AllowXCarry", "Stores unequipped armor in your crafting slots", true);
      boolean var10010 = true;
      this.donTUnequipYourElytraIfYouAreFlying = new BooleanSetting("IgnoreElytra", "Don't unequip your elytra if you are flying", true);
      boolean var10009 = true;
      this.automaticallySwitchesToXpBottles = new BooleanSetting("AutoSwitch", "Automatically switches to xp bottles", true);
      boolean var10008 = true;
      this.switchServerSideOnly = new BooleanSetting("Silent", "Switch server side only", true);
      boolean var10007 = true;
      this.returnsToThePreviousItemYouWereHolding = new BooleanSetting("Return", "Returns to the previous item you were holding", true).setVisibility(() -> {
         if (!(Boolean)this.switchServerSideOnly.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10012 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.f2104 = new HashMap<>();
      this.f2094 = new ConcurrentLinkedQueue<>();
      this.f2105 = new Timer();
      this.f2099 = -1;
      f2097 = this;
      BooleanSetting var10000 = this.takesOffAndReequipsArmorToReduceXpUsage;
      Setting[] var10001 = new Setting[]{this.delay, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.pauseTheAutoarmorModule;
      var10001[2] = this.pausesWhileAPlayerIsInRange;
      var10001[3] = this.storesUnequippedArmorInYourCraftingSlots;
      var10001[4] = this.donTUnequipYourElytraIfYouAreFlying;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.pausesWhileAPlayerIsInRange.addSubSettings(this.range);
      var10000 = this.automaticallySwitchesToXpBottles;
      var10001 = new Setting[]{this.switchServerSideOnly, null};
      var10005 = true;
      var10001[1] = this.returnsToThePreviousItemYouWereHolding;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.mode, null, null, null, null};
      var10005 = true;
      var10001[1] = this.f2098;
      var10001[2] = this.takesOffAndReequipsArmorToReduceXpUsage;
      var10001[3] = this.automaticallySwitchesToXpBottles;
      var10001[4] = this.rotate;
      this.registerSettings(var10001);
   }

   public void m4811() {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public void m4815(List<EquipmentSlot> var1) {
      int var4 = Class253.m9155();
      AutoEXP var6 = this;
      if ((Boolean)this.takesOffAndReequipsArmorToReduceXpUsage.getValue()) {
         List var5;
         if (!(Boolean)this.pausesWhileAPlayerIsInRange.getValue() || (var5 = WorldUtils.getEntitiesSorted(Globals.mc.player, var0 -> {
            if (var0 instanceof OtherClientPlayerEntity && !(var0 instanceof Util458)) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         })).isEmpty() || !(Globals.mc.player.distanceTo((Entity)var5.get(0)) < this.range.getValue())) {
            for (EquipmentSlot var10 : var1) {
               int var9 = var6.m4818(ItemStack::isEmpty, false);
               ItemStack var7 = Globals.mc.player.getEquippedStack(var10).copy();
               int var8 = InventoryUtils.getInventorySlot(var10);
               ItemStack var10000;
               if (var9 >= 36) {
                  var6.f2094.offer(() -> {
                     long var2x = f2106 ^ 7983082657528L;
                     InventoryUtils.swapSlots(var8, var9 - m175(1888, 1846605524461169955L ^ var2x));
                  });
                  var10000 = var7;
               } else if (var9 >= 9) {
                  var6.f2094.offer(() -> {
                     boolean var10003x = true;
                     InventoryUtils.clickSlot(var8, true);
                  });
                  var10000 = var7;
               } else {
                  boolean var10003 = true;
                  if (var9 < 1) {
                     break;
                  }

                  var6.f2094.offer(() -> {
                     InventoryUtils.clickSlot(var8, false);
                  });
                  var6.f2094.offer(() -> {
                     InventoryUtils.clickSlot(var9, false);
                  });
                  var10000 = var7;
               }

               if (var10000.getItem() instanceof Equipment) {
                  var6.f2104.put(var10, var7);
                  var6.f2096 = (Boolean)var6.pauseTheAutoarmorModule.getValue();
                  if (var4 == 0) {
                     break;
                  }
               }
            }
         }
      }
   }

   @Override
   public void onEnable() {
      this.f2104.clear();
      this.f2099 = -1;
   }

   public int m4818(Predicate<ItemStack> var1, boolean var2) {
        return 0;
    }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe(
      stage = Stage.ALL,
      priority = -997
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   @Override
   public void onDisable() {
        
    }

   @Override
   public String getMetadata() {
      boolean var10004 = true;
      return String.valueOf(InventoryUtils.getItemCount(Items.EXPERIENCE_BOTTLE, false, true));
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8650;
      if (f2111[var3] == null) {
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
         long var5 = f2110[var3];
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
         Object[] var9 = (Object[])f2112.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f2112.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/Ç", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f2111[var3] = var15;
      }

      return f2111[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoEXP.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/Ç" + " : " + var1 + " : " + var2.toString(), var5);
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
