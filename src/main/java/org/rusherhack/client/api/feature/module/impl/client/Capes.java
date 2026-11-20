package org.rusherhack.client.api.feature.module.impl.client;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
public class Capes extends ToggleableModule {

   public Capes() {
      super("Capes", "Show rusherhack capes on other rusherhack players", ModuleCategory.CLIENT);
      this.setToggled(true);
   }
}
