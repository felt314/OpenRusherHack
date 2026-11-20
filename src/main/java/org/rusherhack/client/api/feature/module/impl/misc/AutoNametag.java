package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.function.Predicate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.NameTagItem;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.AutoNametagCommand;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class AutoNametag extends ToggleableModule {
   public EnumSetting<AutoNametagMode> mode;
   public Class402 f6289;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public NumberSetting<Float> speed;
   public BooleanSetting ignoreAlreadyNamedEntities;
   public Class402 f6293;
   public BooleanSetting rotate;
   public int f6295;
   public BooleanSetting swapServerSideOnly;
   public NumberSetting<Float> range;
   public BooleanSetting automaticallySwapsToNametags;
   public Timer f6299;
   public NumberSetting<Integer> delay;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public AutoNametag() {
      super(
         "AutoNametag",
         ">\n\u000b\u0010\u0012\u001e\u000b\u0016\u001c\u001e\u0013\u0013\u0006_\r\u001aA\u0004ame e>{\u000b\u0016\u000b\u0016\u001a\f_A\u0004earby",
         ModuleCategory.MISC
      );
      this.mode = new EnumSetting<>("Mode", AutoNametagMode.f2520);
      boolean var10012 = true;
      this.ignoreAlreadyNamedEntities = new BooleanSetting("IgnoreNamed", "Ignore already named entities", true);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      this.range = new NumberSetting<>("Range", 3.0F, 0.1F, 6.0F);
      boolean var10009 = true;
      this.automaticallySwapsToNametags = new BooleanSetting("Swap", "Automatically swaps to nametags", true);
      boolean var10008 = true;
      this.swapServerSideOnly = new BooleanSetting("Silent", "Swap server side only", true);
      boolean var10007 = true;
      this.returnsToThePreviousItemYouWereHolding = new BooleanSetting("Return", "Returns to the previous item you were holding", true).setVisibility(() -> {
         if (!(Boolean)this.swapServerSideOnly.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10012 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      this.f6289 = new Class402(RusherHackAPI.getConfigPath().resolve("autonametag").resolve("whitelist.json").toFile());
      this.f6293 = new Class402(RusherHackAPI.getConfigPath().resolve("autonametag").resolve("blacklist.json").toFile());
      this.f6299 = new Timer();
      this.f6295 = -1;
      BooleanSetting var10000 = this.automaticallySwapsToNametags;
      Setting[] var10001 = new Setting[]{this.swapServerSideOnly, null};
      boolean var10005 = true;
      var10001[1] = this.returnsToThePreviousItemYouWereHolding;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.rotate.addSubSettings(this.speed);
      var10001 = new Setting[6];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.ignoreAlreadyNamedEntities;
      var10001[2] = this.automaticallySwapsToNametags;
      var10001[3] = this.rotate;
      var10001[4] = this.range;
      var10001[5] = this.delay;
      this.registerSettings(var10001);
      this.f6289.m13066(EntityType.WITHER);
      Class170.f3364.m7112().m8473(this.f6293, this.f6293);
      Class170.f3364.m7112().m8473(this.f6289, this.f6289);
   }

   @Override
   public ModuleCommand createCommand() {
      return new AutoNametagCommand(this, this);
   }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && (Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f6295 != -1) {
         Globals.mc.player.getInventory().selectedSlot = this.f6295;
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Override
   public void onEnable() {
      this.f6295 = -1;
   }
}
