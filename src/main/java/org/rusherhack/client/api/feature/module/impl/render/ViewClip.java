package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.NumberSetting;

public class ViewClip extends ToggleableModule {
   public NumberSetting<Double> distance;

   public ViewClip() {
      super("ViewClip", "Ignores block collision for the camera in third person", ModuleCategory.RENDER);
      this.distance = new NumberSetting<>("Distance", 4.0, 1.0, 20.0);
      this.registerSettings(this.distance);
   }

   @Override
   public String getMetadata() {
      return String.valueOf(this.distance.getValue());
   }

   @Subscribe(
      priority = 999
   )
   public void m6758(Class381 var1) {
      var1.m12328(this.distance.getValue());
   }
}
