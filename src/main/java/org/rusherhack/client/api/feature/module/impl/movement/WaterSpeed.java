package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class WaterSpeed extends ToggleableModule {
   public NumberSetting<Float> speed;
   public NumberSetting<Float> lavamultiplier;
   public BooleanSetting vertical;
   public BooleanSetting lava;
   public NumberSetting<Float> downwardsmult;
   public NumberSetting<Float> upwardsmult;
   public BooleanSetting depthstriderrequired;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public WaterSpeed() {
      super("WaterSpeed", "Go faster in water", ModuleCategory.MOVEMENT);
      boolean var10013 = true;
      this.lava = new BooleanSetting("Lava", true);
      this.depthstriderrequired = new BooleanSetting("DepthStriderRequired", false);
      this.speed = new NumberSetting<>("Speed", 1.0F, 0.1F, 10.0F);
      boolean var10010 = true;
      this.vertical = new BooleanSetting("Vertical", true);
      this.upwardsmult = new NumberSetting<>("UpwardsMult", 2.0F, 0.0F, 5.0F);
      this.downwardsmult = new NumberSetting<>("DownwardsMult", 2.0F, 0.0F, 5.0F);
      this.lavamultiplier = new NumberSetting<>("LavaMultiplier", 0.4F, 0.0F, 10.0F);
      BooleanSetting var10000 = this.vertical;
      Setting[] var10001 = new Setting[]{this.upwardsmult, null};
      boolean var10005 = true;
      var10001[1] = this.downwardsmult;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.lava, null, null, null, null};
      var10005 = true;
      var10001[1] = this.depthstriderrequired;
      var10001[2] = this.speed;
      var10001[3] = this.vertical;
      var10001[4] = this.lavamultiplier;
      this.registerSettings(var10001);
   }
}
