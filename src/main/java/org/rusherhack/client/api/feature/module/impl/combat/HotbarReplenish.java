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
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.HotbarReplenishCommand;
import org.rusherhack.command.reset;
public class HotbarReplenish extends ToggleableModule {
   public BooleanSetting offhand;
   public Class139 f101;
   public BooleanSetting inventory;
   public NumberSetting<Integer> threshold;
   public Timer f104;
   public java.util.Queue<Runnable> f105;
   public Class139 f106;
   public NumberSetting<Integer> delay;
   public WeakHashMap<Integer, Long> f108;
   public BooleanSetting whileidle;
   public EnumSetting<HotbarReplenishMode> mode;
   public static long f111 = Class066.m4320(-20241360123246583L, 7532062173450654659L, MethodHandles.lookup().lookupClass()).m4325(96057675187456L);
   public static long[] f115;
   public static Integer[] f116;
   public static Map f117;
   public static long f118;

   @Override
   public ModuleCommand createCommand() {
      return new HotbarReplenishCommand(this, this);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public HotbarReplenish() {
        super(
         "HotbarReplenish",
         "Autom5`\u001f\u0002\b^\u000blly r5d\u001b\u0007\u000e\u0005\u0002\u0018\u0003^\u000fs items in your hotbar",
         ModuleCategory.COMBAT
      );
      int var10001 = 6;

      this.mode = new EnumSetting<>("Mode", HotbarReplenishMode.f4771);
      this.whileidle = new BooleanSetting("WhileIdle", false);
      this.inventory = new BooleanSetting("Inventory", false);
      this.offhand = new BooleanSetting("Offhand", false);
      Integer var10020 = 12;
      boolean var10023 = true;
      this.threshold = new NumberSetting<>("Threshold", var10020, 1, 63);
      boolean var10021 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      this.f105 = new ConcurrentLinkedQueue<>();
      this.f108 = new WeakHashMap<>();
      this.f101 = new Class139(RusherHackAPI.getConfigPath().resolve("hotbarreplenish").resolve("items.json").toFile());
      this.f106 = new Class139(RusherHackAPI.getConfigPath().resolve("hotbarreplenish").resolve("blacklist.json").toFile());
      this.f104 = new Timer();
      this.f101.m6334(Items.EXPERIENCE_BOTTLE);
      this.f101.m6334(Items.ENCHANTED_GOLDEN_APPLE);
      this.f101.m6334(Items.GOLDEN_APPLE);
      this.f101.m6334(Items.END_CRYSTAL);
      this.f101.m6334(Items.CHORUS_FRUIT);
      this.f101.m6334(Items.ENDER_PEARL);
      this.f101.m6334(Blocks.OBSIDIAN.asItem());
      this.f101.m6334(Blocks.ENDER_CHEST.asItem());
      Class170.f3364.m7112().m8473(this.f101, this.f101);
      Class170.f3364.m7112().m8473(this.f106, this.f106);
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.mode;
      boolean var10005 = true;
      var3[1] = this.whileidle;
      var3[2] = this.inventory;
      var3[3] = this.offhand;
      var3[4] = this.threshold;
      var3[5] = this.delay;
      this.registerSettings(var3);
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      int var4 = Class253.m9154();
      Packet var9;
      if ((var9 = var1.getPacket()) instanceof ScreenHandlerSlotUpdateS2CPacket) {
         ScreenHandlerSlotUpdateS2CPacket var5;
         int var10 = (var5 = (ScreenHandlerSlotUpdateS2CPacket)var9).getSlot();
         if (this.f108.containsKey(var10)) {
            long var7 = this.f108.get(var10);
            if (var4 != 0) {
               return;
            }

            if (System.currentTimeMillis() - var7 <= f118) {
               boolean var10003 = true;
               var1.setCancelled(true);
               return;
            }

            this.f108.remove(var10);
         }
      }
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.delay.getValue());
   }

   public boolean m243(ItemStack var1) {
      if (!var1.isEmpty() && var1.getCount() <= this.threshold.getValue()) {
         Item var5 = var1.getItem();
         boolean var6 = true;
         if (var1.getMaxCount() < this.threshold.getValue()) {
            boolean var9;
            if (var1.getCount() < var1.getMaxCount()) {
               var9 = true;
               boolean var10002 = true;
            } else {
               var9 = false;
               boolean var10 = true;
            }

            var6 = var9;
         }

         if ((this.mode.getValue().equals(HotbarReplenishMode.f4771) && this.f101.m6336(var5) || this.mode.getValue().equals(HotbarReplenishMode.f4772) && !this.f106.m6336(var5))
            && var6) {
            boolean var11 = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8004;
      if (f116[var3] == null) {
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
         long var5 = f115[var3];
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
         Object[] var9 = (Object[])f117.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f117.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/I", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f116[var3] = var15;
      }

      return f116[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(HotbarReplenish.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/I" + " : " + var1 + " : " + var2.toString(), var5);
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
