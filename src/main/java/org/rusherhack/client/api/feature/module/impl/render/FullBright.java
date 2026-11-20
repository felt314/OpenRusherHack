package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;

import org.rusherhack.command.reload;
public class FullBright extends ToggleableModule {
   public static FullBright f7114;

   

   public FullBright() {
      super("FullBright", "Makes the world bright", ModuleCategory.RENDER);
      f7114 = this;
   }

   @Override
   public void onDisable() {
      super.onDisable();
      Globals.mc.worldRenderer.reload();
   }

   @Override
   public void onEnable() {
      super.onEnable();
      Globals.mc.worldRenderer.reload();
   }
}
