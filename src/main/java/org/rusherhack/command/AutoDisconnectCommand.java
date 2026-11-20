package org.rusherhack.command;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.combat.AutoDisconnect;
public class AutoDisconnectCommand extends ModuleCommand {

   public AutoDisconnectCommand(AutoDisconnect var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"coordinates", "coords", "position"}
   )
   @CommandExecutor$Argument({"x", "z"})
   public String m5854(double var1, double var3) {
        return null;
    }
}
