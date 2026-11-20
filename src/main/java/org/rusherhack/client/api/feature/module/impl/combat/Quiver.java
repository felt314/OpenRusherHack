package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.macro;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
public class Quiver extends ToggleableModule {
   public int f6880;
   public boolean f6881;
   public EnumSetting<QuiverSecondary> secondary;
   public Class435 f6883;
   public int f6884;
   public ArrowEntity f6885;
   public BooleanSetting macro;
   public Class435 f6887;
   public int f6888;
   public boolean f6889;
   public NumberSetting<Integer> bowticks;
   public EnumSetting<QuiverSecondary> primary;
   public ArrowEntity f6892;
   public Timer f6893;

   public Class435 m13256() {
        return null;
    }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   public boolean m13258(ItemStack var1) {
      return var1.isOf(Items.TIPPED_ARROW);
   }

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      Entity var5;
      if ((var5 = var1.getEntity()) instanceof ArrowEntity) {
         ArrowEntity var7 = (ArrowEntity)var5;
         if (this.f6892 != null && this.f6892.equals(var7)) {
            this.f6892 = null;
            return;
         }

         if (this.f6885 != null && this.f6885.equals(var7)) {
            this.f6885 = null;
         }
      }
   }

   public Quiver() {
      super(
         "Quiver",
         "Shoots yourself with positive potion effects",
         ModuleCategory.COMBAT
      );
      this.macro = new BooleanSetting("Macro", false);
      this.primary = new EnumSetting<>("Primary", QuiverSecondary.f5146);
      this.secondary = new EnumSetting<>("Secondary", QuiverSecondary.f5143);
      Integer var10015 = 5;
      boolean var10018 = true;
      this.bowticks = new NumberSetting<>("BowTicks", var10015, 1, 20);
      this.f6881 = false;
      this.f6884 = -1;
      this.f6888 = -1;
      this.f6880 = -1;
      this.f6893 = new Timer();
      Setting[] var10001 = new Setting[]{this.macro, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.primary;
      var10001[2] = this.secondary;
      var10001[3] = this.bowticks;
      this.registerSettings(var10001);
   }

   @Override
   public void onDisable() {
      if (this.f6881 && this.f6884 != -1 && this.f6880 != -1) {
         Globals.mc.interactionManager.clickSlot(0, this.f6884, this.f6888, SlotActionType.SWAP, Globals.mc.player);
         if ((Boolean)this.macro.getValue() && Globals.mc.player.getInventory().selectedSlot != this.f6880) {
            Globals.mc.player.getInventory().selectedSlot = this.f6880;
         }

         this.f6881 = false;
         this.f6888 = this.f6884 = -1;
      }

      Globals.mc.options.useKey.setPressed(false);
      this.f6892 = this.f6885 = null;
   }

   public ItemStack m13260(PlayerEntity var1) {
      PlayerEntity var7 = var1;
      Quiver var8 = this;
      if (this.m13258(var1.getOffHandStack())) {
         return var1.getOffHandStack();
      } else if (this.m13258(var1.getMainHandStack())) {
         return var1.getMainHandStack();
      } else {
         int var5;
         for (int var9 = var5 = 0; var9 < var7.getInventory().size(); var9 = ++var5) {
            ItemStack var6 = var7.getInventory().getStack(var5);
            if (var8.m13258(var6)) {
               return var6;
            }
         }

         return ItemStack.EMPTY;
      }
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
      Entity var5;
      if ((var5 = var1.getEntity()) instanceof ArrowEntity) {
         ArrowEntity var7;
         PlayerEntity var9;
         if ((var9 = Util179.m7329(var7 = (ArrowEntity)var5)) != null && var9.equals(Globals.mc.player)) {
            if (this.f6883.f7193.equals(this.primary.getValue().f5144)) {
               this.f6892 = var7;
            } else {
               if (this.f6883.f7193.equals(this.secondary.getValue().f5144)) {
                  this.f6885 = var7;
               }
            }
         }
      }
   }
}
