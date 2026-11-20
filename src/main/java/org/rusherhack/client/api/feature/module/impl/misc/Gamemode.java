package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Action;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import net.minecraft.world.GameMode;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinAbstractClientPlayer;
import org.rusherhack.client.api.accessors.entity.IMixinPlayerInfo;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;

import org.rusherhack.command.toggle;
public class Gamemode extends ToggleableModule {
   public GameMode f2498;
   public EnumSetting<GamemodeGamemode> gamemode;

   public Gamemode() {
      super("Gamemode", "Change your gamemode client-side", ModuleCategory.MISC);
      this.gamemode = new EnumSetting<>("Gamemode", GamemodeGamemode.f2543);
      this.f2498 = GameMode.SURVIVAL;
      this.setHidden(true);
      this.registerSettings(this.gamemode);
   }

   @Override
   public void onEnable() {
      int var3 = Class253.m9155();
      if (var3 != 0) {
         if (Globals.mc.world != null) {
            this.f2498 = Globals.mc.interactionManager.getCurrentGameMode();
            return;
         }

         this.toggle();
      }
   }

   @Override
   public String getMetadata() {
      return this.gamemode.getDisplayValue();
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
        
    }

   public void m5616(GameMode var1) {
      int var10000 = Class253.m9155();
      Globals.mc.interactionManager.setGameMode(var1);
      int var4 = var10000;
      PlayerListEntry var6;
      PlayerListEntry var7 = var6 = ((IMixinAbstractClientPlayer)Globals.mc.player).invokeGetPlayerInfo();
      if (var4 != 0) {
         if (var7 == null) {
            return;
         }

         var7 = var6;
      }

      ((IMixinPlayerInfo)var7).invokeSetGameMode(var1);
   }

   @Override
   public void onDisable() {
      if (Globals.mc.world != null) {
         this.m5616(this.f2498);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.m5616(this.gamemode.getValue().f2545);
   }
}
