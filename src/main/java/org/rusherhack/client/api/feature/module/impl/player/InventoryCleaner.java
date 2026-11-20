package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.InventoryCleanerCommand;
import org.rusherhack.command.reset;
public class InventoryCleaner extends ToggleableModule {
   public Timer f9229;
   public BooleanSetting inventory;
   public Class585 f9231;
   public BooleanSetting ignorehotbar;
   public Class585 f9233;
   public NumberSetting<Integer> delay;
   public EnumSetting<InventoryCleanerMode> mode;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      InventoryCleaner var7 = this;
      if (Globals.mc.player != null
         && !Globals.mc.player.shouldCloseHandledScreenOnRespawn()
         && (!(Boolean)this.inventory.getValue() || Globals.mc.currentScreen instanceof InventoryScreen)) {
         int var6;
         int var10000 = var6 = 9;

         while (true) {
            int var10001;
            if ((Boolean)var7.ignorehotbar.getValue()) {
               var10001 = 36;
            } else {
               var10001 = 45;
               boolean var10003 = true;
            }

            if (var10000 >= var10001) {
               return;
            }

            ItemStack var5;
            if (!(var5 = Globals.mc.player.playerScreenHandler.getSlot(var6).getStack()).isEmpty()
               && var7.m17672(var5)
               && var7.f9229.ticksPassed(var7.delay.getValue())) {
               boolean var10005 = true;
               Globals.mc.interactionManager.clickSlot(0, var6, 1, SlotActionType.THROW, Globals.mc.player);
               var7.f9229.reset();
            }

            var10000 = ++var6;
         }
      }
   }

   public boolean m17672(ItemStack var1) {
      if (this.mode.getValue().equals(InventoryCleanerMode.f7345)) {
         return this.f9231.m6336(var1.getItem());
      } else if (!this.f9233.m6336(var1.getItem())) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public ModuleCommand createCommand() {
      return new InventoryCleanerCommand(this, this);
   }

   public InventoryCleaner() {
      super("InventoryCleaner", "Cleans your inventory of items you specify", ModuleCategory.PLAYER);
      this.mode = new EnumSetting<>("Mode", InventoryCleanerMode.f7345);
      boolean var10013 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      this.inventory = new BooleanSetting("Inventory", false);
      this.ignorehotbar = new BooleanSetting("IgnoreHotbar", false);
      this.f9233 = new Class585("whitelist");
      this.f9231 = new Class585("blacklist");
      this.f9229 = new Timer();
      Setting[] var10001 = new Setting[]{this.mode, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.delay;
      var10001[2] = this.inventory;
      var10001[3] = this.ignorehotbar;
      this.registerSettings(var10001);
      Class170.f3364.m7112().m8473(this.f9233, this.f9233);
      Class170.f3364.m7112().m8473(this.f9231, this.f9231);
   }
}
