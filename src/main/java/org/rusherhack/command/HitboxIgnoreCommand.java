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
import org.rusherhack.client.api.ui.window.WindowContentHandlerBase;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;

import org.rusherhack.client.api.feature.module.impl.misc.HitboxIgnore;
public class HitboxIgnoreCommand extends ModuleCommand {

   @CommandExecutor(
      subCommand = {"blocks list"}
   )
   public String m6775() {
        return null;
    }

   public HitboxIgnoreCommand(HitboxIgnore var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"blocks add"}
   )
   @CommandExecutor$Argument({"block"})
   public String m6777(BlockReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks clear"}
   )
   public String m6778() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blocks remove", "blocks delete", "blocks rm", "blocks del"}
   )
   @CommandExecutor$Argument({"block"})
   public String m6779(BlockReference var1) {
        return null;
    }
}
