package org.rusherhack.command;
import org.rusherhack.*;

import net.minecraft.recipe.RecipeEntry;
import net.minecraft.util.Pair;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.IModule;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.type.Notification;

import org.rusherhack.client.api.feature.module.impl.misc.ExtraCraft;
public class ExtraCraftCommand extends ModuleCommand {
   public Class231 f5180;

   @CommandExecutor(
      subCommand = {"get"}
   )
   @CommandExecutor$Argument({"recipe name"})
   public String m10514(String var1) {
        return null;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   public ExtraCraftCommand(ExtraCraft var1, IModule var2) {
    }
}
