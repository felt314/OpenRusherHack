package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.Map.Entry;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.util.Pair;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.world.EventLoadWorld;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Time;
public class Announcer extends ToggleableModule {
   public StringSetting theSunIsRising;
   public HashMap<Block, Integer> f7797;
   public StringSetting iJustBrokeNumberBlock;
   public long f7799;
   public StringSetting iJustMovedDistanceFeet;
   public BooleanSetting breakSetting;
   public BooleanSetting announceChangesOfTheGameTime;
   public StringSetting itSANiceDayOutside;
   public StringSetting itSGettingDarkOutside;
   public HashMap<LivingEntity, Integer> f7806;
   public BooleanSetting xp;
   public StringSetting theSunIsSetting;
   public BooleanSetting eating;
   public StringSetting playerJustAteAItem;
   public StringSetting itIsNowNoon;
   public BooleanSetting place;
   public BooleanSetting walking;
   public StringSetting iJustPlacedNumberBlock;
   public StringSetting playerJustPickedUpNumberItem;
   public NumberSetting<Double> delayInSecondsBetweenMessages;
   public Timer f7820;
   public BooleanSetting pickup;
   public StringSetting playerJustGotNumberXp;
   public BooleanSetting announceOtherPlayerSActions;
   public Pair<Vec3d, Long> f7824;
   public Stack<String> f7825;
   public BooleanSetting onlyShowTheMessagesToYou;
   public BooleanSetting drinking;
   public StringSetting playerJustDrankAItem;
   public HashMap<Block, Integer> f7830;
   public StringSetting itIsNowMidnight;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe
   public void m15123(Event537 var1) {
        
    }

   @Subscribe
   public void m15124(Class203 var1) {
      if ((Boolean)this.place.getValue()) {
         Block var5;
         if ((var5 = var1.m7902().getBlock()) instanceof AirBlock) {
         }

         HashMap var7 = this.f7830;
         int var10002 = this.f7830.getOrDefault(var5, 0);
         boolean var10005 = true;
         var7.put(var5, var10002 + 1);
      }
   }

   @Subscribe
   public void m15125(Class334 var1) {
      if ((Boolean)this.breakSetting.getValue()) {
         Block var5;
         if ((var5 = Globals.mc.world.getBlockState(var1.m15855()).getBlock()) instanceof AirBlock) {
         }

         HashMap var7 = this.f7797;
         int var10002 = this.f7797.getOrDefault(var5, 0);
         boolean var10005 = true;
         var7.put(var5, var10002 + 1);
      }
   }

   public void m15126(String var1, boolean var2) {
      if (var2) {
         this.f7825.push(var1);
      } else {
         this.f7825.add(var1);
      }
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
        
    }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if ((Boolean)this.xp.getValue() && (Boolean)this.pickup.getValue()) {
         Packet var5;
         if ((var5 = var1.getPacket()) instanceof ItemPickupAnimationS2CPacket) {
            ItemPickupAnimationS2CPacket var8 = (ItemPickupAnimationS2CPacket)var5;
            Entity var11;
            if ((var11 = Globals.mc.world.getEntityById(var8.getCollectorEntityId())) == null
               || !var11.equals(Globals.mc.player) && !(Boolean)this.announceOtherPlayerSActions.getValue()) {
               return;
            }

            String var6 = var11.equals(Globals.mc.player) ? "I" : var11.getName().getString();
            Entity var9;
            if ((var9 = Globals.mc.world.getEntityById(var8.getEntityId())) instanceof ExperienceOrbEntity && (Boolean)this.xp.getValue()) {
               this.f7806.put((LivingEntity)var11, this.f7806.getOrDefault(var11, 0) + ((ExperienceOrbEntity)var9).getExperienceAmount());
               return;
            }

            if (var9 instanceof ItemEntity && (Boolean)this.pickup.getValue()) {
               String var10001 = ((String)this.playerJustPickedUpNumberItem.getValue())
                  .replace("[player]", var6)
                  .replace("[number]", String.valueOf(((ItemEntity)var9).getStack().getCount()))
                  .replace("[item]", ((ItemEntity)var9).getStack().getName().getString());
               boolean var10004 = true;
               this.m15126(var10001, true);
            }
         }
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var4 = Class253.m9155();
      if (this.f7820.passed(this.delayInSecondsBetweenMessages.getValue() * 1000.0) && !this.f7825.empty()) {
         Announcer var10000;
         label21: {
            String var5 = this.f7825.pop();
            if (var4 != 0) {
               if ((Boolean)this.onlyShowTheMessagesToYou.getValue()) {
                  var10000 = this;
                  ChatUtils.print(var5);
                  break label21;
               }

               Globals.mc.player.networkHandler.sendChatMessage(var5);
            }

            var10000 = this;
         }

         var10000.f7820.reset();
         this.f7825.clear();
      }
   }

   public Announcer() {
      super(
         "Announcer",
         "Announces whatt\u0014'1+*Jaret\u0014:1709*Jin chat",
         ModuleCategory.CHAT
      );
      this.onlyShowTheMessagesToYou = new BooleanSetting("ClientSide", "Only show the messages to you", false);
      boolean var10038 = true;
      this.announceOtherPlayerSActions = new BooleanSetting("Others", "Announce other player's actions", true);
      this.delayInSecondsBetweenMessages = new NumberSetting<>("Delay", "Delay in seconds between messages", 5.0, 1.0, 30.0).incremental(0.5);
      boolean var10035 = true;
      this.walking = new BooleanSetting("Walking", true);
      this.iJustMovedDistanceFeet = new StringSetting("String", "I just moved [distance] feet!").setNameVisible(false);
      boolean var10033 = true;
      this.breakSetting = new BooleanSetting("Break", true);
      this.iJustBrokeNumberBlock = new StringSetting("String", "I just broke [number] [block]!").setNameVisible(false);
      boolean var10031 = true;
      this.place = new BooleanSetting("Place", true);
      this.iJustPlacedNumberBlock = new StringSetting("String", "I just placed [number] [block]!").setNameVisible(false);
      boolean var10029 = true;
      this.pickup = new BooleanSetting("Pickup", true);
      this.playerJustPickedUpNumberItem = new StringSetting("String", "[player] just picked up [number] [item]!").setNameVisible(false);
      boolean var10027 = true;
      this.xp = new BooleanSetting("XP", true);
      this.playerJustGotNumberXp = new StringSetting("String", "[player] just got [number] XP!").setNameVisible(false);
      boolean var10025 = true;
      this.eating = new BooleanSetting("Eating", true);
      this.playerJustAteAItem = new StringSetting("String", "[player] just ate a [item]!").setNameVisible(false);
      boolean var10023 = true;
      this.drinking = new BooleanSetting("Drinking", true);
      this.playerJustDrankAItem = new StringSetting("String", "[player] just drank a [item]!").setNameVisible(false);
      boolean var10022 = true;
      this.announceChangesOfTheGameTime = new BooleanSetting("Time", "Announce changes of the game time", true);
      this.itSANiceDayOutside = new StringSetting("Day", "It's a nice day outside!").setNameVisible(false);
      this.itIsNowNoon = new StringSetting("Noon", "It is now noon!").setNameVisible(false);
      this.theSunIsSetting = new StringSetting("Sunset", "The sun is setting!").setNameVisible(false);
      this.itSGettingDarkOutside = new StringSetting("Night", "It's getting dark outside!").setNameVisible(false);
      this.itIsNowMidnight = new StringSetting("Midnight", "It is now midnight!").setNameVisible(false);
      this.theSunIsRising = new StringSetting("Sunrise", "The sun is rising!").setNameVisible(false);
      this.f7820 = new Timer();
      this.f7799 = 0L;
      this.f7825 = new Stack<>();
      this.f7824 = null;
      this.f7806 = new HashMap<>();
      this.f7797 = new HashMap<>();
      this.f7830 = new HashMap<>();
      boolean var10003 = true;
      this.walking.addSubSettings(this.iJustMovedDistanceFeet);
      var10003 = true;
      this.breakSetting.addSubSettings(this.iJustBrokeNumberBlock);
      var10003 = true;
      this.place.addSubSettings(this.iJustPlacedNumberBlock);
      var10003 = true;
      this.pickup.addSubSettings(this.playerJustPickedUpNumberItem);
      var10003 = true;
      this.xp.addSubSettings(this.playerJustGotNumberXp);
      var10003 = true;
      this.eating.addSubSettings(this.playerJustAteAItem);
      var10003 = true;
      this.drinking.addSubSettings(this.playerJustDrankAItem);
      BooleanSetting var10000 = this.announceChangesOfTheGameTime;
      Setting[] var10001 = new Setting[6];
      var10001[0] = this.itSANiceDayOutside;
      boolean var10005 = true;
      var10001[1] = this.itIsNowNoon;
      var10001[2] = this.theSunIsSetting;
      var10001[3] = this.itSGettingDarkOutside;
      var10001[4] = this.itIsNowMidnight;
      var10001[5] = this.theSunIsRising;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[11];
      var10001[0] = this.onlyShowTheMessagesToYou;
      var10005 = true;
      var10001[1] = this.announceOtherPlayerSActions;
      var10001[2] = this.delayInSecondsBetweenMessages;
      var10001[3] = this.walking;
      var10001[4] = this.breakSetting;
      var10001[5] = this.place;
      var10001[6] = this.pickup;
      var10001[7] = this.xp;
      var10001[8] = this.eating;
      var10001[9] = this.drinking;
      var10001[10] = this.announceChangesOfTheGameTime;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onLoadWorld(EventLoadWorld var1) {
      this.f7820.reset();
      this.f7825.clear();
      this.f7824 = null;
   }
}
