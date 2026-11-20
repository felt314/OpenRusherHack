package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.ItemReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.player.FastUse;
import org.rusherhack.client.api.feature.module.impl.world.FastPlace;
public class FastUseCommand extends ModuleCommand {

   @Override
   public boolean isHidden() {
        return false;
    }

   public FastUseCommand(FastUse var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"whitelist add"}
   )
   @CommandExecutor$Argument({"item"})
   public String m5341(ItemReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist remove", "whitelist rm", "whitelist del", "whitelist delete"}
   )
   @CommandExecutor$Argument({"item"})
   public String m5342(ItemReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist list"}
   )
   public String m5343() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist clear"}
   )
   public String m5344() {
        return null;
    }
}
