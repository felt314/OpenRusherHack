package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.setting.NumberSetting;

import org.rusherhack.client.api.feature.hud.impl.FPS;
public class LagReducer extends ToggleableModule {
   public static NumberSetting<Integer> f3815;
   public static LagReducer f3816;

   public LagReducer() {
      super("LagReducer", "\\y}ydcdJyour FPS whentZi\u007fedJaretZ~\u007fddJtabbed intotZdxudJgame", ModuleCategory.MISC);
      f3816 = this;
      this.registerSettings(f3815);
   }
}
