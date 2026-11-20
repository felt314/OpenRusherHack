package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.command.pitch;
import org.rusherhack.command.yaw;
public class RotationLock extends ToggleableModule {
   public NumberSetting<Float> f7150;
   public NumberSetting<Float> f7151;
   public NumberSetting<Integer> angles;
   public BooleanSetting yaw;
   public NumberSetting<Integer> f7154;
   public BooleanSetting waypointlock;
   public BooleanSetting f7156;
   public BooleanSetting hard;
   public BooleanSetting custom;
   public BooleanSetting pitch;
   public StringSetting waypointNameHere;

   public void m13836() {
        
    }

   public RotationLock() {
      super("RotationLock", "\\\u007fs{dJyour yaw and pitch", ModuleCategory.PLAYER);
      boolean var10009 = true;
      this.yaw = new BooleanSetting("Yaw", true);
      this.custom = new BooleanSetting("Custom", false);
      this.f7151 = new NumberSetting<>("Yaw", 0.0F, 0.0F, 360.0F).incremental(45.0);
      this.angles = new NumberSetting<>("Angles", 8, 4, 24)
         .setVisibility(() -> {
            if (!(Boolean)this.custom.getValue()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      this.pitch = new BooleanSetting("Pitch", false);
      this.f7156 = new BooleanSetting("Custom", false);
      this.f7150 = new NumberSetting<>("Pitch", 0.0F, -90.0F, 90.0F).incremental(1.0);
      this.f7154 = new NumberSetting<>("Angles", 8, 4, 24)
         .setVisibility(() -> {
            if (!(Boolean)this.f7156.getValue()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      this.waypointlock = new BooleanSetting("WaypointLock", false);
      this.waypointNameHere = new StringSetting("Name", "waypoint name here").setNameVisible(false);
      this.hard = new BooleanSetting("Hard", false);
      BooleanSetting var10000 = this.yaw;
      Setting[] var10001 = new Setting[]{this.angles, null};
      boolean var10005 = true;
      var10001[1] = this.custom;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.custom.addSubSettings(this.f7151);
      var10000 = this.pitch;
      var10001 = new Setting[]{this.f7154, null};
      var10005 = true;
      var10001[1] = this.f7156;
      var10000.addSubSettings(var10001);
      var10003 = true;
      this.f7156.addSubSettings(this.f7150);
      var10003 = true;
      this.waypointlock.addSubSettings(this.waypointNameHere);
      var10001 = new Setting[]{this.yaw, null, null, null};
      var10005 = true;
      var10001[1] = this.pitch;
      var10001[2] = this.waypointlock;
      var10001[3] = this.hard;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.m13836();
   }

   @Subscribe
   public void m13840(Event516 var1) {
      if (var1.m15868().equals(Globals.mc.player) && (Boolean)this.hard.getValue()) {
         this.m13836();
         if ((Boolean)this.yaw.getValue() && var1.m15870() > 0.0 || (Boolean)this.pitch.getValue() && var1.m15869() > 0.0) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }
}
