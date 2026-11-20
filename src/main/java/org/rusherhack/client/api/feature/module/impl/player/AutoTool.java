package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventInteract;
import org.rusherhack.client.api.events.player.EventInteract$Action;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.module.impl.combat.Aura;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTotem;
public class AutoTool extends ToggleableModule {
   public BooleanSetting pullToolsOutOfTheInventory;
   public BooleanSetting requireaura;
   public EnumSetting<AutoToolF9151> prefer;
   public BooleanSetting swapBackToThePreviousItem;
   public float f9153;
   public int f9154;
   public BooleanSetting attacking;
   public static AutoTool f9156;
   public BooleanSetting mining;
   public BooleanSetting useAnAxeToDisableTheTargetsShield;
   public NumberSetting<Integer> mindurability;
   public boolean f9160;
   public int f9161;
   public Timer f9162;
   public NumberSetting<Integer> delay;

   public boolean m17489(ItemStack var1) {
      if (!var1.isEmpty() && var1.getMaxDamage() != 0) {
         if (((float)var1.getMaxDamage() - var1.getDamage()) / var1.getMaxDamage() * 100.0F > this.mindurability.getValue().intValue()) {
            boolean var6 = true;
            return true;
         } else {
            return false;
         }
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public float m17490(ItemStack var1, LivingEntity var2) {
      int var5 = Class253.m9155();
      float var8 = this.m17496(var1, var2);
      float var7 = 1.0F;
      if (var1.contains(DataComponentTypes.ATTRIBUTE_MODIFIERS)) {
         Iterator var9 = ((AttributeModifiersComponent)var1.get(DataComponentTypes.ATTRIBUTE_MODIFIERS)).modifiers().iterator();

         while (var9.hasNext()) {
            EntityAttributeModifier var10;
            if ((var10 = ((Entry)var9.next()).modifier()).id().equals(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID)) {
               var7 = (float)(var10.value() + Globals.mc.player.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_SPEED));
               if (var5 == 0) {
                  break;
               }
            }
         }
      }

      float var11 = var8 * var7;
      if ((Boolean)this.useAnAxeToDisableTheTargetsShield.getValue() && var2.isBlocking() && var1.getItem() instanceof AxeItem) {
         var11 *= 10.0F;
      }

      return var11;
   }

   public float m17491(ItemStack var1, BlockState var2) {
      int var7;
      float var8;
      if ((var8 = var1.getMiningSpeedMultiplier(var2)) > 1.0F && !var1.isEmpty() && (var7 = Util210.m8037(Enchantments.EFFICIENCY, var1)) > 0) {
         int var10001 = var7 * var7;
         boolean var10004 = true;
         var8 += var10001 + 1;
      }

      return var8 / (var2.isToolRequired() && !var1.isSuitableFor(var2) ? 100.0F : 30.0F);
   }

   @Subscribe(
      priority = -1
   )
   public void onUpdate(EventUpdate var1) {
        
    }

   @Subscribe
   public void onInteract(EventInteract var1) {
      int var4 = Class253.m9154();
      AutoTool var6 = this;
      Entity var7;
      if ((Boolean)this.attacking.getValue() && var1.getAction() == EventInteract$Action.ATTACK && (var7 = var1.getTargetEntity()) instanceof LivingEntity) {
         LivingEntity var5 = (LivingEntity)var7;
         if (var4 == 0) {
            if (!AutoEat.f2905.m6292() && !AutoTotem.f3491.m7405()) {
               if ((Boolean)this.requireaura.getValue() && Aura.m16059() == null) {
                  return;
               }

               if (!this.f9162.ticksPassed(this.delay.getValue())) {
                  if (this.f9160) {
                     this.f9162.reset();
                  }

                  return;
               }

               int var8;
               if ((var8 = this.m17498(var5)) == -1) {
                  int var11;
                  label80: {
                     if (!this.m17489(Globals.mc.player.getMainHandStack())) {
                        int var9;
                        var11 = var9 = 44;

                        while (true) {
                           int var10001;
                           if ((Boolean)var6.pullToolsOutOfTheInventory.getValue()) {
                              var10001 = 9;
                           } else {
                              var10001 = 36;
                              boolean var10003 = true;
                           }

                           if (var11 < var10001) {
                              break;
                           }

                           ItemStack var10;
                           if ((var10 = Globals.mc.player.playerScreenHandler.getSlot(var9).getStack()).isEmpty() || var6.m17489(var10)) {
                              var11 = var8 = var9;
                              break label80;
                           }

                           var11 = --var9;
                        }
                     }

                     var11 = var8;
                  }

                  if (var11 == -1) {
                     return;
                  }
               }

               AutoTool var12;
               if (var8 >= 36) {
                  Globals.mc.player.getInventory().selectedSlot = var8 % 9;
                  var12 = var6;
               } else {
                  var12 = var6;
                  m17494(var6.f9154 = var8, Globals.mc.player.getInventory().selectedSlot);
               }

               var12.f9160 = true;
               var6.f9162.reset();
               return;
            }

            return;
         }
      }
   }

   public static void m17494(int var0, int var1) {
      Globals.mc.interactionManager.clickSlot(Globals.mc.player.currentScreenHandler.syncId, var0, var1, SlotActionType.SWAP, Globals.mc.player);
      int var7 = Class253.m9155();
      Globals.mc.interactionManager.tick();
      int var4 = var7;
      MinecraftClient var8 = Globals.mc;
      if (var4 != 0) {
         if (Globals.mc.currentScreen instanceof HandledScreen) {
            return;
         }

         var8 = Globals.mc;
      }

      var8.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(Globals.mc.player.currentScreenHandler.syncId));
   }

   public int m17495(BlockState var1) {
        return 0;
    }

   public float m17496(ItemStack var1, LivingEntity var2) {
      int var10000 = Class253.m9154();
      float var8 = 1.0F;
      int var5 = var10000;
      Item var7;
      Item var9 = var7 = var1.getItem();
      if (var5 == 0) {
         if (!(var9 instanceof ToolItem)) {
            return Util210.m8042(var1, var2, var8);
         }

         var9 = var7;
      }

      float var10 = ((ToolItem)var9).getMaterial().getAttackDamage();
      return Util210.m8042(var1, var2, var10);
   }

   public int m17497(BlockPos var1) {
      BlockState var5 = Globals.mc.world.getBlockState(var1);
      return this.m17495(var5);
   }

   @Override
   public void onEnable() {
      this.f9160 = false;
   }

   public int m17498(LivingEntity var1) {
      AutoTool var5 = this;
      int var10000 = Class253.m9155();
      float var8 = this.m17490(Globals.mc.player.getMainHandStack(), var1);
      int var7 = -1;
      int var4 = var10000;
      int var6;
      var10000 = var6 = 44;

      while (true) {
         int var10001;
         label30: {
            if ((Boolean)var5.pullToolsOutOfTheInventory.getValue()) {
               var10001 = 9;
               if (var4 != 0) {
                  break label30;
               }
            } else {
               var10001 = 36;
            }

            boolean var10003 = true;
         }

         if (var10000 < var10001) {
            return var7;
         }

         label46: {
            ItemStack var9 = Globals.mc.player.playerScreenHandler.getSlot(var6).getStack();
            AutoTool var12 = var5;
            ItemStack var13 = var9;
            if (var4 != 0) {
               if (!var5.m17489(var9) && var4 != 0) {
                  break label46;
               }

               var12 = var5;
               var13 = var9;
            }

            float var10;
            float var14;
            var10000 = (var14 = (var10 = var12.m17490(var13, var1)) - var8) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            if (var4 == 0) {
               continue;
            }

            if (var10000 > 0) {
               var8 = var10;
               var7 = var6;
            }
         }

         var10000 = --var6;
      }
   }

   public AutoTool() {
      super(
         "AutoTool",
         "t@AZXTA\\VTY\r\u0006y switc87\u0015AZ\u0015A\r\u0002e best tool",
         ModuleCategory.PLAYER
      );
      boolean var10021 = true;
      this.attacking = new BooleanSetting("Attacking", true);
      var10021 = true;
      this.useAnAxeToDisableTheTargetsShield = new BooleanSetting("DisableShields", "Use an axe to disable the targets shield", true);
      this.requireaura = new BooleanSetting("RequireAura", false);
      boolean var10018 = true;
      this.mining = new BooleanSetting("Mining", true);
      this.prefer = new EnumSetting<>("Prefer", "Which enchant to prioritize for blocks benefit from both", AutoToolF9151.f3586);
      boolean var10017 = true;
      this.swapBackToThePreviousItem = new BooleanSetting("Return", "Swap back to the previous item", true);
      boolean var10016 = true;
      this.pullToolsOutOfTheInventory = new BooleanSetting("Inventory", "Pull tools out of the inventory", true);
      boolean var10014 = true;
      this.mindurability = new NumberSetting<>("MinDurability", 1, 0, 100);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      this.f9162 = new Timer();
      this.f9161 = -1;
      this.f9154 = -1;
      f9156 = this;
      BooleanSetting var10000 = this.attacking;
      Setting[] var10001 = new Setting[]{this.useAnAxeToDisableTheTargetsShield, null};
      boolean var10005 = true;
      var10001[1] = this.requireaura;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.mining.addSubSettings(this.prefer);
      var10001 = new Setting[6];
      var10001[0] = this.attacking;
      var10005 = true;
      var10001[1] = this.mining;
      var10001[2] = this.swapBackToThePreviousItem;
      var10001[3] = this.pullToolsOutOfTheInventory;
      var10001[4] = this.mindurability;
      var10001[5] = this.delay;
      this.registerSettings(var10001);
   }
}
