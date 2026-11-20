package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class Swing extends ToggleableModule {
   public BooleanSetting offhand;
   public BooleanSetting noswing;
   public boolean f7744;
   public BooleanSetting strict;
   public BooleanSetting clientside;

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (!(Boolean)this.clientside.getValue() && (Boolean)this.noswing.getValue()) {
         Packet var5;
         EventPacket$Send var8;
         if ((var5 = var1.getPacket()) instanceof PlayerActionC2SPacket && ((PlayerActionC2SPacket)var5).getAction() == Action.STOP_DESTROY_BLOCK) {
            var8 = var1;
            this.f7744 = true;
         } else {
            if (var1.getPacket() instanceof PlayerInteractBlockC2SPacket || var1.getPacket() instanceof PlayerInteractEntityC2SPacket) {
               this.f7744 = true;
            }

            var8 = var1;
         }

         if (var8.getPacket() instanceof HandSwingC2SPacket) {
            if (!this.f7744 || !(Boolean)this.strict.getValue()) {
               boolean var10003 = true;
               var1.setCancelled(true);
               return;
            }

            this.f7744 = false;
         }
      }
   }

   public Swing() {
      super("Swing", "Modify swinging", ModuleCategory.PLAYER);
      boolean var10010 = true;
      this.noswing = new BooleanSetting("NoSwing", true);
      this.clientside = new BooleanSetting("ClientSide", false);
      this.strict = new BooleanSetting("Strict", false);
      this.offhand = new BooleanSetting("Offhand", false);
      BooleanSetting var10000 = this.noswing;
      Setting[] var10001 = new Setting[]{this.clientside, null};
      boolean var10005 = true;
      var10001[1] = this.strict;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.noswing, null};
      var10005 = true;
      var10001[1] = this.offhand;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if ((Boolean)this.noswing.getValue()) {
         Globals.mc.player.handSwingTicks = 0;
         Globals.mc.player.handSwinging = false;
      }

      if ((Boolean)this.offhand.getValue()) {
         Globals.mc.player.preferredHand = Hand.OFF_HAND;
      }
   }
}
