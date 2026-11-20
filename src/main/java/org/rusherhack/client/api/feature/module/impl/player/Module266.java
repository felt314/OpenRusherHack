package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.logging.Logger;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class Module266 extends ToggleableModule {
   public Logger f4631;
   public HashMap<PacketType<?>, BooleanSetting> f4632;
   public BooleanSetting verbose;
   public BooleanSetting fileoutput;
   public BooleanSetting chatoutput;
   public HashMap<PacketType<?>, BooleanSetting> f4636;
   public static Module266 f4637;
   public BooleanSetting serverbound;
   public BooleanSetting clientbound;
   public static long f4644;

   @Override
   public void onEnable() {
      if ((Boolean)this.fileoutput.getValue()) {
         this.f4631 = new PacketLogger();
      }
   }

   @Subscribe(
      priority = -1000
   )
   public void onSend(EventPacket$Send var1) {
      if ((Boolean)this.serverbound.getValue()) {
         Packet var5 = var1.getPacket();
         if (this.f4636.containsKey(var5.getPacketId())) {
            if ((Boolean)this.f4636.get(var5.getPacketId()).getValue()) {
               String var6 = Class267.m9409(var5, (Boolean)this.verbose.getValue());
               this.m9383(var6);
            }
         }
      }
   }

   public void m9383(String var1) {
      int var4;
      Module266 var8;
      label36: {
         int var10000 = Class253.m9154();
         MutableText var6 = Text.literal(var1);
         var4 = var10000;
         boolean var7 = (Boolean)this.chatoutput.getValue();
         if (var4 == 0) {
            if (var7) {
               Class170.f3364.m7110().m17547(var6, RusherHackAPI.colors().primaryColor().getRealValue().getRGB(), Style.EMPTY, (int)f4644, false);
            }

            Console.f8537.m16406().add(var6, -1);
            var8 = this;
            if (var4 != 0) {
               break label36;
            }

            var7 = (Boolean)this.fileoutput.getValue();
         }

         if (!var7) {
            return;
         }

         var8 = this;
      }

      Logger var9 = var8.f4631;
      if (var4 == 0) {
         if (var8.f4631 == null) {
            return;
         }

         var9 = this.f4631;
      }

      var9.info(var1);
   }

   @Override
   public boolean isListening() {
      if (super.isListening() && !Globals.mc.isConnectedToLocalServer()) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public Module266() {
        super("PacketLogger", "Logs incoming and outgoing packets", ModuleCategory.PLAYER);
      Module266 var6 = this;
      int var10000 = Class253.m9154();

      boolean var10009 = true;
      this.verbose = new BooleanSetting("Verbose", true);
      boolean var10008 = true;
      this.chatoutput = new BooleanSetting("ChatOutput", true);
      this.fileoutput = new BooleanSetting("FileOutput", false).onChange(var1x -> {
         if (this.isToggled()) {
            this.f4631 = new PacketLogger();
         }
      });
      this.clientbound = new BooleanSetting("Clientbound", false);
      boolean var10014 = true;
      this.serverbound = new BooleanSetting("Serverbound", true);
      this.f4632 = new HashMap<>();
      this.f4636 = new HashMap<>();
      this.f4631 = null;
      f4637 = this;
      Setting[] var10002 = new Setting[]{this.verbose, null, null};
      boolean var10006 = true;
      var10002[1] = this.chatoutput;
      var10002[2] = this.fileoutput;
      this.registerSettings(var10002);
      int var3 = var10000;
      Iterator var4;
      Iterator var13 = var4 = Class267.f4648.entrySet().iterator();

      while (true) {
         if (var13.hasNext()) {
            Entry var7;
            PacketType var8 = (PacketType)(var7 = (Entry)var4.next()).getKey();
            String var10003 = var8.id().getPath();
            var10006 = true;
            Class604 var5 = new Class604(var6, var10003, true, var7);
            var6.f4632.put(var8, var5);
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
         var10006 = true;
         Class076 var11 = new Class076(var6, var15, true, var12);
         var6.f4636.put(var9, var11);
         boolean var16 = true;
         var6.serverbound.addSubSettings(var11);
         if (var3 != 0) {
            break;
         }

         var13 = var4;
      }
   }

   @Subscribe(
      priority = -1000
   )
   public void onReceive(EventPacket$Receive var1) {
      if ((Boolean)this.clientbound.getValue()) {
         Packet var5 = var1.getPacket();
         if (this.f4632.containsKey(var5.getPacketId())) {
            if ((Boolean)this.f4632.get(var5.getPacketId()).getValue()) {
               String var6 = Class267.m9409(var5, (Boolean)this.verbose.getValue());
               this.m9383(var6);
            }
         }
      }
   }
}
