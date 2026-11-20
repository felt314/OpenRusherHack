package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.awt.Color;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.gui.IMixinAbstractContainerScreen;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.client.screen.EventScreen$BuildButtons;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.ExtraChestCommand;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.module.impl.render.Search;
public class ExtraChest extends ToggleableModule {
   public BooleanSetting search;
   public EnumSetting<ExtraChestDropmode> dropmode;
   public Class182 f1798;
   public Class471 f1799;
   public ColorSetting color;
   public NumberSetting<Integer> dropdelay;
   public BooleanSetting filter;
   public NumberSetting<Integer> stealdelay;
   public BooleanSetting addStealFillButtonsToContainerGuis;
   public BooleanSetting shulkerhighlight;
   public EnumSetting<ExtraChestMode> mode;
   public Timer f1807;
   public ColorSetting f1808;
   public Class471 f1809;
   public NumberSetting<Integer> filldelay;
   public EnumSetting<ExtraChestDropmode> stealmode;
   public TextFieldWidget f1812;
   public BooleanSetting save;
   public EnumSetting<ExtraChestDropmode> fillmode;
   public Class471 f1815;
   public Class471 f1816;
   public Class471 f1817;
   public Class471 f1818;

   public boolean m4381(Screen var1) {
        return false;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Subscribe
   public void onBuildButtons(EventScreen$BuildButtons var1) {
        
    }

   @Override
   public ModuleCommand createCommand() {
        return null;
    }

   public boolean m4388(ItemStack var1) {
        return false;
    }

   @Subscribe
   public void onKey(EventMouse$Key var1) {
        
    }

   public ExtraChest() {
      super("ExtraChest", "Automatically steal/fill items from containers", ModuleCategory.MISC);
      this.addStealFillButtonsToContainerGuis = new BooleanSetting("Buttons", "Add Steal/Fill buttons to container guis", false);
      this.mode = new EnumSetting<>("Mode", ExtraChestMode.f2749);
      this.stealmode = new EnumSetting<>("StealMode", ExtraChestDropmode.f7443).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2750);
      });
      this.fillmode = new EnumSetting<>("FillMode", ExtraChestDropmode.f7445).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2752);
      });
      this.dropmode = new EnumSetting<>("DropMode", ExtraChestDropmode.f7443).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2753);
      });
      boolean var10005 = true;
      this.stealdelay = new NumberSetting<>("StealDelay", 1, 0, 20).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2750);
      });
      var10005 = true;
      this.filldelay = new NumberSetting<>("FillDelay", 1, 0, 20).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2752);
      });
      var10005 = true;
      this.dropdelay = new NumberSetting<>("DropDelay", 1, 0, 20).setVisibility(() -> {
         return this.mode.getValue().equals(ExtraChestMode.f2753);
      });
      boolean var10021 = true;
      this.search = new BooleanSetting("Search", true);
      var10021 = true;
      this.save = new BooleanSetting("Save", true);
      this.filter = new BooleanSetting("Filter", false);
      this.color = (ColorSetting)null;
      this.shulkerhighlight = new BooleanSetting("ShulkerHighlight", false);
      this.f1808 = (ColorSetting)null;
      this.f1816 = new Class471("fill_whitelist");
      this.f1799 = new Class471("fill_blacklist");
      this.f1809 = new Class471("steal_whitelist");
      this.f1818 = new Class471("steal_blacklist");
      this.f1817 = new Class471("drop_whitelist");
      this.f1815 = new Class471("drop_blacklist");
      this.f1807 = new Timer();
      this.f1798 = new Class182(this);
      this.f1812 = null;
      BooleanSetting var10000 = this.search;
      Setting[] var10001 = new Setting[]{this.save, null, null};
      var10005 = true;
      var10001[1] = this.filter;
      var10001[2] = this.color;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.shulkerhighlight.addSubSettings(this.f1808);
      var10001 = new Setting[10];
      var10001[0] = this.addStealFillButtonsToContainerGuis;
      var10005 = true;
      var10001[1] = this.mode;
      var10001[2] = this.stealmode;
      var10001[3] = this.fillmode;
      var10001[4] = this.dropmode;
      var10001[5] = this.stealdelay;
      var10001[6] = this.filldelay;
      var10001[7] = this.dropdelay;
      var10001[8] = this.search;
      var10001[9] = this.shulkerhighlight;
      this.registerSettings(var10001);
      Class170.f3364.m7112().m8473(this.f1816, this.f1816);
      Class170.f3364.m7112().m8473(this.f1799, this.f1799);
      Class170.f3364.m7112().m8473(this.f1809, this.f1809);
      Class170.f3364.m7112().m8473(this.f1818, this.f1818);
      Class170.f3364.m7112().m8473(this.f1817, this.f1817);
      Class170.f3364.m7112().m8473(this.f1815, this.f1815);
      Class170.f3362.subscribe(this.f1798);
   }

   @Subscribe
   public void m4390(Event204 var1) {
        
    }

   public boolean m4391(Class471 var1, ItemStack var2) {
        return false;
    }

   @Subscribe
   public void m4392(Event158 var1) {
        
    }
}
