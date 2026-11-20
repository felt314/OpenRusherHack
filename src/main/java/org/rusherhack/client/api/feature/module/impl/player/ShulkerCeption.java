package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;

public class ShulkerCeption extends ToggleableModule {
   public static ShulkerCeption f6007;

   public ShulkerCeption() {
      super("ShulkerCeption", "Allows you to place shulkers inside of other shulkers in singleplayer", ModuleCategory.PLAYER);
      f6007 = this;
   }
}
