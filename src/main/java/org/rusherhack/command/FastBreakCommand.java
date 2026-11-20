package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.block.Block;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
public class FastBreakCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"whitelist clear"}
   )
   @CommandExecutor(
      subCommand = {"whitelist list"}
   )
   @CommandExecutor(
      subCommand = {"whitelist remove", "whitelist del", "whitelist delete", "whitelist rm"}
   )
   @CommandExecutor$Argument({"block"})
   @CommandExecutor(
      subCommand = {"blacklist add"}
   )
   @CommandExecutor$Argument({"block"})
   @CommandExecutor(
      subCommand = {"blacklist list"}
   )
   public FastBreakCommand(FastBreak var1, IModule var2) {
    }

//    @CommandExecutor(
//       subCommand = {"blacklist clear"}
//    )
//    @CommandExecutor(
//       subCommand = {"whitelist add"}
//    )
//    @CommandExecutor$Argument({"block"})
//    @CommandExecutor(
//       subCommand = {"blacklist remove", "blacklist del", "blacklist delete", "blacklist rm"}
//    )
//    @CommandExecutor$Argument({"block"})
}
