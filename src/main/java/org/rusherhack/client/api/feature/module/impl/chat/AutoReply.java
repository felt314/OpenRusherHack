package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.friend;
import org.rusherhack.command.reset;
public class AutoReply extends ToggleableModule {
   public Timer f9314;
   public BooleanSetting focuscheck;
   public NumberSetting<Float> delay;
   public BooleanSetting globalchat;
   public StringSetting whispers;
   public BooleanSetting friends;
   public StringSetting msgNameHelloFriend;
   public StringSetting nonfriendtext;

   public String m13552(String var1) {
      return var1.replaceAll("§.", "");
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (!(Boolean)this.focuscheck.getValue() || !Globals.mc.isWindowFocused()) {
         Packet var8;
         if ((var8 = var1.getPacket()) instanceof GameMessageS2CPacket) {
            GameMessageS2CPacket var10 = (GameMessageS2CPacket)var8;
            if (this.f9314.passed(this.delay.getValue() * 1000.0F)) {
               String var9;
               if (!(var9 = this.m13552(var10.content().getString())).startsWith("<")) {
                  if (var9.contains((CharSequence)this.whispers.getValue())) {
                     int var11 = var9.indexOf(" " + (String)this.whispers.getValue());
                     String var6 = var9.substring(0, var11);
                     String var7 = this.friends.getValue() && RusherHackAPI.getRelationManager().isFriend(var6)
                        ? (String)this.msgNameHelloFriend.getValue()
                        : (String)this.nonfriendtext.getValue();
                     this.m17856(var7.replace("[name]", var6));
                     this.f9314.reset();
                     return;
                  }
               } else if (var9.startsWith("<") && (Boolean)this.globalchat.getValue() && var9.contains((CharSequence)this.whispers.getValue())) {
                  int var12 = var9.indexOf("<");
                  int var14 = var9.indexOf(">");
                  boolean var10004 = true;
                  String var15 = var9.substring(var12 + 1, var14);
                  String var13 = this.friends.getValue() && RusherHackAPI.getRelationManager().isFriend(var15)
                     ? (String)this.msgNameHelloFriend.getValue()
                     : (String)this.nonfriendtext.getValue();
                  this.m17856(var13.replace("[name]", var15));
                  this.f9314.reset();
               }
            }
         }
      }
   }

   public void m17856(String var1) {
      int var4 = Class253.m9155();
      if (var4 != 0) {
         if (var1.startsWith("/")) {
            boolean var10004 = true;
            Globals.mc.player.networkHandler.sendChatCommand(var1.substring(1));
            return;
         }

         Globals.mc.player.networkHandler.sendChatMessage(var1);
      }
   }

   public AutoReply() {
        super(
         "AutoReply",
         "Automatically reply to messages",
         ModuleCategory.CHAT
      );
      int var10001 = 7;

      this.whispers = new StringSetting("TriggerText", "The text needed in a chat message to trigger a reply", "whispers:");
      this.msgNameHelloFriend = new StringSetting("FriendText", "The reply message to friends", "/msg [name] Hello friend!");
      this.nonfriendtext = new StringSetting(
         "NonFriendText", "The reply message to non-friends", "/msg [name] Who are you? Are you relevant enough to be telling me such things?"
      );
      this.globalchat = new BooleanSetting("GlobalChat", "Reply in global chat rather than in public message", false);
      boolean var10011 = true;
      this.friends = new BooleanSetting("Friends", true);
      this.focuscheck = new BooleanSetting("FocusCheck", "Only trigger while not actively tabbed into the game", false);
      this.delay = new NumberSetting<>("Delay", 1.0F, 0.0F, 5.0F);
      this.f9314 = new Timer();
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.whispers;
      boolean var10005 = true;
      var3[1] = this.msgNameHelloFriend;
      var3[2] = this.nonfriendtext;
      var3[3] = this.globalchat;
      var3[4] = this.friends;
      var3[5] = this.focuscheck;
      var3[6] = this.delay;
      this.registerSettings(var3);
   }
}
