package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class RainbowEnchant extends ToggleableModule {
   public static RainbowEnchant f7298;
   public static ColorSetting color;
   public static BooleanSetting strong;

   

   public RainbowEnchant() {
      super("RainbowEnchant", "Makes the enchant glint rainbow", ModuleCategory.RENDER);
      f7298 = this;
      Setting[] var10001 = new Setting[]{color, null};
      boolean var10005 = true;
      var10001[1] = strong;
      this.registerSettings(var10001);
   }
}
