package org.rusherhack.command;
import org.rusherhack.*;

import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.ItemReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;

import org.rusherhack.client.api.feature.module.impl.chat.Spammer;
public class SpammerCommand extends ModuleCommand {
   public static String f3722;

   @Override
   public boolean isHidden() {
        return false;
    }

   public SpammerCommand(Spammer var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"reload"}
   )
   public String m7720() {
        return null;
    }
}
