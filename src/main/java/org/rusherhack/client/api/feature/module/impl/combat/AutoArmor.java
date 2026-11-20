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
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.screen.slot.SlotActionType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Durability;
public class AutoArmor extends ToggleableModule {
   public BooleanSetting bindingcurse;
   public java.util.Queue<Runnable> f5783;
   public NumberSetting<Integer> delay;
   public BooleanSetting durability;
   public NumberSetting<Integer> threshold;
   public BooleanSetting blastpriority;
   public Timer f5788;
   public BooleanSetting neverReplaceArmorAlreadyInTheSlot;
   public BooleanSetting elytrapriority;
   public static AutoArmor f5791;
   public BooleanSetting allowAutoarmorWhileInsideOfInventory;
   public static long f5793 = Class066.m4320(-129595589323430571L, -3140255344185754251L, MethodHandles.lookup().lookupClass()).m4325(7478119958041L);
   public static long[] f5797;
   public static Integer[] f5798;
   public static Map f5799;

   public static void m11587(int var0, int var1) {
      int var7 = Class253.m9154();
      Globals.mc.interactionManager.clickSlot(Globals.mc.player.currentScreenHandler.syncId, var0, var1, SlotActionType.SWAP, Globals.mc.player);
      int var4 = var7;
      Globals.mc.interactionManager.tick();
      MinecraftClient var8 = Globals.mc;
      if (var4 == 0) {
         if (Globals.mc.currentScreen instanceof HandledScreen) {
            return;
         }

         var8 = Globals.mc;
      }

      var8.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(Globals.mc.player.currentScreenHandler.syncId));
   }

   public AutoArmor() {
        super("AutoArmor", "Automatically equips your best armor", ModuleCategory.COMBAT);
      long var1 = f5793 ^ 21225104308109L;

      this.delay = new NumberSetting<>("Delay", 2, 0, m175(9465, 2656621397115272436L ^ var1));
      this.neverReplaceArmorAlreadyInTheSlot = new BooleanSetting("Soft", "Never replace armor already in the slot", false);
      boolean var10016 = true;
      this.allowAutoarmorWhileInsideOfInventory = new BooleanSetting("Inventory", "Allow AutoArmor while inside of inventory", true);
      this.bindingcurse = new BooleanSetting("BindingCurse", false);
      this.elytrapriority = new BooleanSetting("ElytraPriority", false);
      boolean var10012 = true;
      this.blastpriority = new BooleanSetting("BlastPriority", true);
      this.durability = new BooleanSetting("Durability", false);
      this.threshold = new NumberSetting<>("Threshold", 5, 0, m175(6725, 1672237524135592515L ^ var1));
      this.f5788 = new Timer();
      this.f5783 = new ConcurrentLinkedQueue<>();
      f5791 = this;
      boolean var10003 = true;
      this.durability.addSubSettings(this.threshold);
      Setting[] var10001 = new Setting[m175(8061, 6199026836755466101L ^ var1)];
      var10001[0] = this.delay;
      boolean var10005 = true;
      var10001[1] = this.neverReplaceArmorAlreadyInTheSlot;
      var10001[2] = this.allowAutoarmorWhileInsideOfInventory;
      var10001[3] = this.bindingcurse;
      var10001[4] = this.elytrapriority;
      var10001[5] = this.blastpriority;
      var10001[m175(25291, 8271794367931595463L ^ var1)] = this.durability;
      this.registerSettings(var10001);
   }

   public int m11591(ItemStack var1, ArmorItem var2, Type var3) {
      float var8 = var2.getProtection() + ((ArmorMaterial)var2.getMaterial().value()).toughness();
      RegistryKey var10001;
      ItemStack var10002;
      if (var3.equals(Type.LEGGINGS) && (Boolean)this.blastpriority.getValue()) {
         var10001 = Enchantments.BLAST_PROTECTION;
         var10002 = var1;
      } else {
         var10001 = Enchantments.PROTECTION;
         var10002 = var1;
      }

      return (int)(var8 + Util210.m8037(var10001, var10002));
   }

   public void m11592(int var1, int var2, boolean var3) {
      this.f5783.offer(() -> {
         InventoryUtils.clickSlot(var1, false);
      });
      int var9 = Class253.m9154();
      this.f5783.offer(() -> {
         InventoryUtils.clickSlot(var2, false);
      });
      int var6 = var9;
      if (var6 == 0 && !var3) {
         this.f5783.offer(() -> {
            InventoryUtils.clickSlot(var1, false);
         });
      }
   }

   public int m11593(Type var1) {
        return 0;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      long var2 = f5793 ^ 100780187250193L;
      AutoArmor var12 = this;
      if (!AutoTotem.f3491.m7405() && !AutoEXP.f2097.f2096) {
         boolean var10000;
         if (!this.f5783.isEmpty()) {
            var10000 = true;
            boolean var10002 = true;
         } else {
            var10000 = false;
            boolean var18 = true;
         }

         boolean var7 = var10000;
         var10000 = var7;

         Runnable var5;
         while (var10000 && var12.f5788.ticksPassed(var12.delay.getValue()) && (var5 = var12.f5783.poll()) != null) {
            var10000 = var7;
            var5.run();
            var12.f5788.reset();
         }

         if ((!(Globals.mc.currentScreen instanceof InventoryScreen) || (Boolean)var12.allowAutoarmorWhileInsideOfInventory.getValue())
            && !var7
            && (!(Globals.mc.currentScreen instanceof HandledScreen) || Globals.mc.currentScreen instanceof InventoryScreen)) {
            boolean var13 = (Boolean)var12.neverReplaceArmorAlreadyInTheSlot.getValue();
            boolean var8 = Globals.mc.player.getEquippedStack(EquipmentSlot.HEAD).isEmpty();
            int var6;
            if ((!var13 || var8) && (var6 = var12.m11593(Type.HELMET)) != -1) {
               var12.m11592(var6, 5, var8);
            }

            boolean var9 = Globals.mc.player.getEquippedStack(EquipmentSlot.CHEST).isEmpty();
            if ((!var13 || var9) && (var6 = var12.m11593(Type.CHESTPLATE)) != -1) {
               var12.m11592(var6, m175(1130, 3661305581728974321L ^ var2), var9);
            }

            boolean var10 = Globals.mc.player.getEquippedStack(EquipmentSlot.LEGS).isEmpty();
            if ((!var13 || var10) && (var6 = var12.m11593(Type.LEGGINGS)) != -1) {
               var12.m11592(var6, m175(31320, 8397032436639185870L ^ var2), var10);
            }

            boolean var11 = Globals.mc.player.getEquippedStack(EquipmentSlot.FEET).isEmpty();
            if ((!var13 || var11) && (var6 = var12.m11593(Type.BOOTS)) != -1) {
               var12.m11592(var6, m175(23359, 855472334319327916L ^ var2), var11);
            }
         }
      }
   }
   public static int m175(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13805;
      if (f5798[var3] == null) {
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
         long var5 = f5797[var3];
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
         Object[] var9 = (Object[])f5799.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f5799.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new IllegalStateException("org/rusherhack/ˁ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f5798[var3] = var15;
      }

      return f5798[var3];
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
               MethodHandles.insertArguments(MethodHandles.lookup().findStatic(AutoArmor.class, "m176", MethodType.methodType(Object.class, Lookup.class, MutableCallSite.class, String.class, MethodType.class, Object[].class)).asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new IllegalStateException("org/rusherhack/ˁ" + " : " + var1 + " : " + var2.toString(), var5);
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
