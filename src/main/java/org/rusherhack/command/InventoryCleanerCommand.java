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

import org.rusherhack.client.api.feature.module.impl.player.InventoryCleaner;
public class InventoryCleanerCommand extends ModuleCommand {

   public InventoryCleanerCommand(InventoryCleaner var1, IModule var2) {
    }

//    @CommandExecutor(
//       subCommand = {"whitelist"}
//    )
//    @CommandExecutor$Argument({"add OR delete OR list OR clear", "item"})
//    @CommandExecutor(
//       subCommand = {"blacklist"}
//    )
//    @CommandExecutor$Argument({"add OR delete OR list OR clear", "item"})
}
