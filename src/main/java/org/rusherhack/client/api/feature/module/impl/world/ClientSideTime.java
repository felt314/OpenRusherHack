package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinClientboundSetTimePacket;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.NumberSetting;

import org.rusherhack.client.api.feature.hud.impl.Time;
public class ClientSideTime extends ToggleableModule {
   public NumberSetting<Integer> time;
   public long f6050;

   @Override
   public void onDisable() {
      Globals.mc.world.setTimeOfDay(this.f6050);
   }

   public ClientSideTime() {
      super("ClientSideTime", "Set the time client-side", ModuleCategory.WORLD);
      this.time = new NumberSetting<>("Time", 6000, 0, 24000);
      this.registerSettings(this.time);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      Globals.mc.world.setTimeOfDay(this.time.getValue().intValue());
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof WorldTimeUpdateS2CPacket) {
         WorldTimeUpdateS2CPacket var7 = (WorldTimeUpdateS2CPacket)var5;
         this.f6050 = var7.getTimeOfDay();
         ((IMixinClientboundSetTimePacket)var7).setDayTime(this.time.getValue().intValue());
      }
   }
}
