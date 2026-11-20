package org.rusherhack.command;
import org.rusherhack.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.block.Block;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.BlockReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.command.exceptions.CommandException;

import org.rusherhack.client.api.feature.module.impl.render.Xray;
public class XrayCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"blocks clear"}
   )
   public String m9077() {
        return null;
    }

   public XrayCommand(Xray var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"blocks remove", "blocks delete", "blocks rm", "blocks del"}
   )
   @CommandExecutor$Argument({"block"})
   public String m9078(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks add"}
   )
   @CommandExecutor$Argument({"block"})
   public String m9079(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks list"}
   )
   public String m9080() {
        return null;
    }
}
