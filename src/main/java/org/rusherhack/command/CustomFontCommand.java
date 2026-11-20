package org.rusherhack.command;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.IModule;

import org.rusherhack.client.api.feature.module.impl.client.CustomFont;
public class CustomFontCommand extends ModuleCommand {
   public CustomFontCommand(CustomFont var1, IModule var2) {
      super(var2);
   }

   @Override
   public boolean isHidden() {
      return false;
   }
}
