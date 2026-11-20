package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.block.Block;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.world.FastPlace;
public class FastPlaceCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"blacklist remove", "blacklist rm", "blacklist del", "blacklist delete"}
   )
   @CommandExecutor$Argument({"block"})
   public String m5728(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist remove", "whitelist rm", "whitelist del", "whitelist delete"}
   )
   @CommandExecutor$Argument({"block"})
   public String m5729(BlockReference var1) {
        return null;
    }

   public FastPlaceCommand(FastPlace var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"blacklist list"}
   )
   public String m5730() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blacklist add"}
   )
   @CommandExecutor$Argument({"block"})
   public String m5731(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist list"}
   )
   public String m5732() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist clear"}
   )
   public String m5733() {
        return null;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   @CommandExecutor(
      subCommand = {"blacklist clear"}
   )
   public String m5734() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist add"}
   )
   @CommandExecutor$Argument({"block"})
   public String m5735(BlockReference var1) {
        return null;
    }
}
