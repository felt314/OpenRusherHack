package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.StringJoiner;
import net.minecraft.item.Item;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.command.arg.ItemReference;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.module.impl.combat.HotbarReplenish;
public class HotbarReplenishCommand extends ModuleCommand {

   public HotbarReplenishCommand(HotbarReplenish var1, IModule var2) {
    }

   @CommandExecutor(
      subCommand = {"blacklist add"}
   )
   @CommandExecutor$Argument({"item"})
   public String m13215(ItemReference var1) {
        return null;
    }

   @Override
   public boolean isHidden() {
        return false;
    }

   @CommandExecutor(
      subCommand = {"whitelist remove", "whitelist rm", "whitelist del", "whitelist delete"}
   )
   @CommandExecutor$Argument({"item"})
   public String m13216(ItemReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blacklist clear"}
   )
   public String m13217() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist add"}
   )
   @CommandExecutor$Argument({"item"})
   public String m13218(ItemReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist list"}
   )
   public String m13219() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"whitelist clear"}
   )
   public String m13220() {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blacklist remove", "blacklist rm", "blacklist del", "blacklist delete"}
   )
   @CommandExecutor$Argument({"item"})
   public String m13221(ItemReference var1) {
        return null;
    }

   @CommandExecutor(
      subCommand = {"blacklist list"}
   )
   public String m13222() {
        return null;
    }
}
