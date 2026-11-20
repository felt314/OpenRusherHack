package org.rusherhack;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.core.event.subscribe.Subscribe;

public class Util097 implements Globals {
   public static Util097 f2286;
   public Int2IntMap f2287 = new Int2IntOpenHashMap();
   public int m5123(Entity var1) {
      return this.f2287.getOrDefault(var1.getId(), 0);
   }

   @Subscribe(
      priority = 1000
   )
   public void onRemove(EventEntity$Remove var1) {
      this.f2287.remove(var1.getEntity().getId());
   }

   @Subscribe(
      priority = 1000
   )
   public void onReceive(EventPacket$Receive var1) {
        
    }

   @Subscribe(
      priority = 1000
   )
   public void m5126(Event559 var1) {
      Int2IntMap var6 = this.f2287;
      int var10001 = var1.m17271();
      int var10002 = this.m5123(var1.m17272());
      boolean var10005 = true;
      var6.put(var10001, var10002 + 1);
   }
}
