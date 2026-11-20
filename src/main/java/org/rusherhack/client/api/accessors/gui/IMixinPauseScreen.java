package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.GameMenuScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import org.rusherhack.command.disconnect;
@Mixin({GameMenuScreen.class})
public interface IMixinPauseScreen {
   @Invoker("onDisconnect")
   void disconnect();
}
