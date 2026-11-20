package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({AbstractSignEditScreen.class})
public interface IMixinAbstractSignEditScreen {
   @Accessor("messages")
   String[] getMessages();
}
