package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;

public class MultiTask extends ToggleableModule {
   public static MultiTask f6358;

   public MultiTask() {
      super("MultiTask", "Allows you to interact while eating", ModuleCategory.PLAYER);
      f6358 = this;
   }
}
