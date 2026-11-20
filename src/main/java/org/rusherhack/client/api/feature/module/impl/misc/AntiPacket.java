package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class AntiPacket extends ToggleableModule {
   public BooleanSetting serverbound;
   public HashMap<PacketType<?>, BooleanSetting> f6061;
   public BooleanSetting debug;
   public BooleanSetting clientbound;
   public HashMap<PacketType<?>, BooleanSetting> f6064;

   public AntiPacket() {
        super(
         "AntiPacket",
         "Allows you to cancel certain packets.",
         ModuleCategory.MISC
      );
      AntiPacket var6 = this;
      int var10000 = Class253.m9154();

      this.debug = new BooleanSetting("Debug", false);
      this.clientbound = new BooleanSetting("Clientbound", false);
      this.serverbound = new BooleanSetting("Serverbound", false);
      this.f6061 = new HashMap<>();
      this.f6064 = new HashMap<>();
      this.registerSettings(this.debug);
      int var3 = var10000;
      Iterator var4;
      Iterator var13 = var4 = Class267.f4648.entrySet().iterator();

      while (true) {
         if (var13.hasNext()) {
            Entry var7;
            PacketType var8 = (PacketType)(var7 = (Entry)var4.next()).getKey();
            String var10003 = var8.id().getPath();
            boolean var10006 = true;
            Class166 var5 = new Class166(var6, var10003, true, var7);
            var6.f6061.put(var8, var5);
            boolean var14 = true;
            var6.clientbound.addSubSettings(var5);
            var13 = var4;
            if (var3 == 0) {
               continue;
            }
            break;
         }

         var13 = Class267.f4647.entrySet().iterator();
         break;
      }

      var4 = var13;

      while (true) {
         if (!var13.hasNext()) {
            Class171.m7164(() -> {
               this.clientbound.getSubSettings().sort(Comparator.comparing(Setting::getDisplayName));
               this.serverbound.getSubSettings().sort(Comparator.comparing(Setting::getDisplayName));
            });
            Setting[] var10001 = new Setting[]{var6.clientbound, null};
            boolean var10005 = true;
            var10001[1] = var6.serverbound;
            var6.registerSettings(var10001);
            break;
         }

         Entry var12;
         PacketType var9 = (PacketType)(var12 = (Entry)var4.next()).getKey();
         String var15 = var9.id().getPath();
         boolean var17 = true;
         Class439 var11 = new Class439(var6, var15, true, var12);
         var6.f6064.put(var9, var11);
         boolean var16 = true;
         var6.serverbound.addSubSettings(var11);
         if (var3 != 0) {
            break;
         }

         var13 = var4;
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if ((Boolean)this.serverbound.getValue()) {
         Packet var6 = var1.getPacket();
         if (this.f6064.containsKey(var6.getPacketId())) {
            if ((Boolean)this.f6064.get(var6.getPacketId()).getValue()) {
               if ((Boolean)this.debug.getValue()) {
                  ChatUtils.print("Cancelled " + var6.getPacketId().id());
               }

               boolean var10003 = true;
               var1.setCancelled(true);
            }
         }
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if ((Boolean)this.clientbound.getValue()) {
         Packet var6 = var1.getPacket();
         if (this.f6061.containsKey(var6.getPacketId())) {
            if ((Boolean)this.f6061.get(var6.getPacketId()).getValue()) {
               if ((Boolean)this.debug.getValue()) {
                  ChatUtils.print("Cancelled " + var6.getPacketId().id());
               }

               boolean var10003 = true;
               var1.setCancelled(true);
            }
         }
      }
   }
}
