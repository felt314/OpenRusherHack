package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import java.util.Comparator;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({PlayerListHud.class})
public interface IMixinPlayerTabOverlay {
   @Accessor("PLAYER_COMPARATOR")
   static Comparator<PlayerListEntry> getPlayerComparator() {
      return null;
   }
}
