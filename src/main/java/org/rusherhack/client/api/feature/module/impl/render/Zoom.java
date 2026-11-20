package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.bind;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
public class Zoom extends ToggleableModule {
   public BooleanSetting smooth;
   public EnumSetting<ZoomUsage> usage;
   public boolean f8188;
   public float f8189;
   public Animation f8190;
   public BooleanSetting cinematic;
   public static Zoom f8192;
   public NumberSetting<Float> zoom;
   public BooleanSetting scroll;
   public BooleanSetting reset;
   public static long f8200;
   public static long f8201;

   @Subscribe
   public void m15797(Event554 var1) {
      if ((Boolean)this.scroll.getValue()) {
         this.zoom
            .setValue(
               MathUtils.clamp(
                  this.zoom.getValue().floatValue() + var1.m17136() / 2.0,
                  (double)this.zoom.getMinimum().floatValue(),
                  (double)this.zoom.getMaximum().floatValue()
               )
            );
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public void onDisable() {
      if ((Boolean)this.reset.getValue()) {
         this.zoom.setValue(this.f8189);
      }

      if ((Boolean)this.cinematic.getValue()) {
         Globals.mc.options.smoothCameraEnabled = this.f8188;
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Override
   public void onEnable() {
      this.f8190.restart().play();
      this.f8189 = this.zoom.getValue();
      this.f8188 = Globals.mc.options.smoothCameraEnabled;
   }

   public float m15800() {
        return 0.0f;
    }

   public Zoom() {
      super("Zoom", "Zooms in", ModuleCategory.RENDER);
      this.usage = new EnumSetting<>("Usage", ZoomUsage.f4202);
      this.zoom = new NumberSetting<>("Zoom", 2.0F, 1.0F, 10.0F).incremental(0.5);
      boolean var10009 = true;
      this.smooth = new BooleanSetting("Smooth", true);
      this.reset = new BooleanSetting("Reset", false);
      boolean var10007 = true;
      this.scroll = new BooleanSetting("Scroll", true);
      boolean var10006 = true;
      this.cinematic = new BooleanSetting("Cinematic", true).onChange(var1x -> {
         if (this.isToggled()) {
            Globals.mc.options.smoothCameraEnabled = var1x;
         }
      });
      int var10001 = (int)f8200;
      this.f8190 = new Animation(Easing.LINEAR, f8201);
      this.f8189 = 2.0F;
      this.setNotifications(false);
      this.setHidden(true);
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.usage;
      boolean var10005 = true;
      var3[1] = this.zoom;
      var3[2] = this.smooth;
      var3[3] = this.reset;
      var3[4] = this.scroll;
      var3[5] = this.cinematic;
      this.registerSettings(var3);
      f8192 = this;
   }
}
