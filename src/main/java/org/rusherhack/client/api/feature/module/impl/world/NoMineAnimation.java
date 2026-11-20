package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
public class NoMineAnimation extends ToggleableModule {

   public NoMineAnimation() {
      super("NoMineAnimation", "Hides your block mining progress for other players", ModuleCategory.WORLD);
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var5;
      PlayerActionC2SPacket var6;
      if ((var5 = var1.getPacket()) instanceof PlayerActionC2SPacket && (var6 = (PlayerActionC2SPacket)var5).getAction() == Action.START_DESTROY_BLOCK) {
         Globals.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, var6.getPos(), var6.getDirection()));
      }
   }
}
