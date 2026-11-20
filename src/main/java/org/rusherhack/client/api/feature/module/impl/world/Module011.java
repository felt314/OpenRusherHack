package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.hud.impl.TPS;
public class Module011 extends ToggleableModule {
   public NumberSetting<Float> speed;
   public static float f212;
   public BooleanSetting tpsSync;

   @Override
   public boolean isListening() {
      boolean var10002 = true;
      return true;
   }

   @Override
   public String getMetadata() {
      return String.valueOf(f212);
   }

   @Override
   public void onDisable() {
      f212 = 1.0F;
   }

   

   public Module011() {
      super("Timer", "Speeds up the game", ModuleCategory.WORLD);
      this.speed = new NumberSetting<>("Speed", 2.0F, 0.1F, 10.0F).incremental(0.1F);
      this.tpsSync = new BooleanSetting("TPS Sync", false);
      Setting[] var10001 = new Setting[]{this.speed, null};
      boolean var10005 = true;
      var10001[1] = this.tpsSync;
      this.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void onRender2D(EventRender2D var1) {
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (Globals.mc.player != null && Globals.mc.world != null) {
            EventTimerSpeed var5 = new EventTimerSpeed(1.0F);
            Class170.f3362.post(var5);
            if (var4 != 0) {
               f212 = var5.getSpeed();
               label30:
               if (!var5.shouldOverrideTimer() && this.isToggled()) {
                  if ((Boolean)this.tpsSync.getValue()) {
                     f212 = Class164.f3259.getTPS() / 20.0F;
                     if (var4 != 0) {
                        break label30;
                     }
                  }

                  f212 = f212 * this.speed.getValue();
               }

               f212 = Math.max(f212, 0.01F);
            }

            return;
         }

         f212 = 1.0F;
      }
   }
}
