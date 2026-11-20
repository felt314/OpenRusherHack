package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.Optional;
import net.minecraft.item.Item;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.ItemReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.misc.ExtraChest;
public class ExtraChestCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"steal"}
   )
   @CommandExecutor$Argument({"whitelist OR blacklist", "add OR delete OR list OR clear", "item"})
   public ExtraChestCommand(ExtraChest var1, IModule var2) {
    }

//    @CommandExecutor(
//       subCommand = {"drop"}
//    )
//    @CommandExecutor$Argument({"whitelist OR blacklist", "add OR delete OR list OR clear", "item"})
//    @CommandExecutor(
//       subCommand = {"fill"}
//    )
//    @CommandExecutor$Argument({"whitelist OR blacklist", "add OR delete OR list OR clear", "item"})
}
