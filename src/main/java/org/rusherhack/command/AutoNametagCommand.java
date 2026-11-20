package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.entity.EntityType;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.PlayerReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.processing.CommandProcessor;

import org.rusherhack.client.api.feature.module.impl.misc.AutoNametag;
public class AutoNametagCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"whitelist list"}
   )
   @CommandExecutor(
      subCommand = {"whitelist add"}
   )
   @CommandExecutor$Argument({"entity type"})
   @CommandExecutor(
      subCommand = {"whitelist clear"}
   )
   @CommandExecutor(
      subCommand = {"whitelist remove", "whitelist del", "whitelist delete", "whitelist rm"}
   )
   @CommandExecutor$Argument({"entity type"})
   @CommandExecutor(
      subCommand = {"blacklist add"}
   )
   @CommandExecutor$Argument({"entity type"})
   @CommandExecutor(
      subCommand = {"blacklist list"}
   )
   public AutoNametagCommand(AutoNametag var1, IModule var2) {
    }

//    @CommandExecutor(
//       subCommand = {"blacklist clear"}
//    )
//    @CommandExecutor(
//       subCommand = {"blacklist remove", "blacklist del", "blacklist delete", "blacklist rm"}
//    )
//    @CommandExecutor$Argument({"entity type"})
}
