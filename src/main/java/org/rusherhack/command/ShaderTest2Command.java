package org.rusherhack.command;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;

import org.rusherhack.client.api.feature.module.impl.client.ShaderTest2;
public class ShaderTest2Command extends ModuleCommand {
   @CommandExecutor(
      subCommand = {"test"}
   )
   public void m10820() {
   }

   public ShaderTest2Command(ShaderTest2 var1, IModule var2) {
      super(var2);
   }
}
