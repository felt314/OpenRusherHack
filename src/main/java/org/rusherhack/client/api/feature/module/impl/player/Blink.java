package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.util.ArrayDeque;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.network.packet.Packet;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.module.impl.misc.PingSpoof;
public class Blink extends ToggleableModule {
   public static Blink f2445;
   public Timer f2446;
   public NumberSetting<Float> timelimit;
   public OtherClientPlayerEntity f2448;
   public java.util.Queue<Packet<?>> f2449;
   public static long f2454;

   @Override
   public void onEnable() {
      int var3 = Class253.m9155();
      if (var3 != 0) {
         if (Globals.mc.world != null && !Globals.mc.isConnectedToLocalServer()) {
            this.f2448 = new Util458(Globals.mc.player);
            this.f2448.setId((int)f2454);
            Globals.mc.world.addEntity(this.f2448);
            this.f2446.reset();
            return;
         }

         this.toggle();
      }
   }

   @Subscribe
   public void m5512(Event174 var1) {
      this.toggle();
   }

   @Subscribe(
      priority = -1002,
      ignoreCancelled = true
   )
   public void onSend(EventPacket$Send var1) {
      if (Globals.mc.player.isAlive() && PingSpoof.f4817.f4819.contains(var1.getPacket().getClass())) {
         this.f2449.add(var1.getPacket());
         boolean var10004 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public String getMetadata() {
      return this.timelimit.getValue() != 0.0F ? (long)(this.timelimit.getValue() * 1000.0F - (float)this.f2446.getTime()) + "ms" : this.f2446.getTime() + "ms";
   }

   @Override
   public void setToggled(boolean var1) {
      Blink var7;
      label38: {
         Blink var5 = this;
         if (this.isToggled() && !var1) {
            if (Globals.mc.world == null || Globals.mc.isConnectedToLocalServer()) {
               var7 = this;
               this.f2449.clear();
               break label38;
            }

            for (Blink var6 = this; !var6.f2449.isEmpty(); var6 = var5) {
               PingSpoof.m9754(var5.f2449.poll());
            }

            if (var5.f2448 != null) {
               Globals.mc.world.removeEntity(var5.f2448.getId(), RemovalReason.DISCARDED);
               var5.f2448 = null;
            }
         }

         var7 = var5;
      }

      var7.setToggled(var1);
   }

   public Blink() {
      super(
         "Blink",
         "\u001612:-*Jyour packets until you disable it",
         ModuleCategory.PLAYER
      );
      this.timelimit = new NumberSetting<>("TimeLimit", "Seconds after enabling in which blink will be disabled", 0.0F, 0.0F, 15.0F);
      this.f2449 = new ArrayDeque<>();
      this.f2446 = new Timer();
      f2445 = this;
      this.registerSettings(this.timelimit);
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.toggle();
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.timelimit.getValue() != 0.0F && this.f2446.passed(this.timelimit.getValue() * 1000.0F)) {
         this.toggle();
      }
   }

   @Override
   public void onDisable() {
   }
}
