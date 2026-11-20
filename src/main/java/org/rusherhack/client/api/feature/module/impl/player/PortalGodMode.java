package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;

public class PortalGodMode extends ToggleableModule {
   public TeleportConfirmC2SPacket f8618;

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.f8618 = null;
   }

   public PortalGodMode() {
      super("PortalGodMode", "Go into god mode when you enter a portal", ModuleCategory.PLAYER);
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof TeleportConfirmC2SPacket) {
         TeleportConfirmC2SPacket var5 = (TeleportConfirmC2SPacket)var7;
         if (Globals.mc.player.isAlive()) {
            this.f8618 = var5;
            var1.setCancelled(true);
            this.sendNotification(NotificationType.WARNING, "You should now be in godmode, disable this module to return to normal!");
         }
      }
   }

   @Subscribe
   public void onMove(EventMove var1) {
      if (this.f8618 != null) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public void onDisable() {
      int var3 = Class253.m9155();
      if (var3 != 0) {
         if (Globals.mc.world != null && !Globals.mc.isConnectedToLocalServer() && this.f8618 != null) {
            Globals.mc.player.networkHandler.sendPacket(this.f8618);
         }

         this.f8618 = null;
      }
   }

   @Override
   public void onEnable() {
      this.sendNotification(NotificationType.WARNING, "You should only enable this module when you need it!");
   }
}
