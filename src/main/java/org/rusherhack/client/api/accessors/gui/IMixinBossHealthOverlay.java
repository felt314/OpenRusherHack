package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import java.util.Map;
import java.util.UUID;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({BossBarHud.class})
public interface IMixinBossHealthOverlay {
   @Accessor("events")
   Map<UUID, ClientBossBar> getEvents();
}
