package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;

public class LiquidInteract extends ToggleableModule {
   public static LiquidInteract f3832;

   public LiquidInteract() {
      super("LiquidInteract", "Place blocks on top of water", ModuleCategory.WORLD);
      f3832 = this;
   }
}
