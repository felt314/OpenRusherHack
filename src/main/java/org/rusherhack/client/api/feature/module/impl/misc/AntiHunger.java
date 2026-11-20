package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.util.hit.HitResult.Type;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

public class AntiHunger extends ToggleableModule {
   public BooleanSetting spoofground;
   public BooleanSetting elytracheck;
   public BooleanSetting spoofsprint;
   public boolean f3548;

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if ((Boolean)this.spoofground.getValue()) {
         if (!(Boolean)this.elytracheck.getValue() || !Globals.mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA)) {
            if (!Globals.mc.options.attackKey.isPressed() || Globals.mc.crosshairTarget == null || !Globals.mc.crosshairTarget.getType().equals(Type.BLOCK)) {
               boolean var6 = var1.isOnGround();
               if (this.f3548 && var6 && Globals.mc.player.fallDistance < 3.0F) {
                  var1.setOnGround(false);
               }

               this.f3548 = var6;
            }
         }
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var6;
      if ((var6 = var1.getPacket()) instanceof ClientCommandC2SPacket) {
         ClientCommandC2SPacket var7 = (ClientCommandC2SPacket)var6;
         if ((Boolean)this.spoofsprint.getValue() && (var7.getMode() == Mode.START_SPRINTING || var7.getMode() == Mode.STOP_SPRINTING)) {
            boolean var10003 = true;
            var1.setCancelled(true);
         }
      }
   }

   public AntiHunger() {
      super("AntiHunger", "Reduces hunger loss", ModuleCategory.MISC);
      this.elytracheck = new BooleanSetting("ElytraCheck", false);
      boolean var10011 = true;
      BooleanSetting var10006 = new BooleanSetting("SpoofGround", true);
      boolean var10009 = true;
      this.spoofground = var10006.setHidden(true);
      boolean var10010 = true;
      BooleanSetting var10005 = new BooleanSetting("SpoofSprint", true);
      boolean var10008 = true;
      this.spoofsprint = var10005.setHidden(true);
      this.f3548 = false;
      Setting[] var10001 = new Setting[]{this.elytracheck, null, null};
      boolean var3 = true;
      var10001[1] = this.spoofground;
      var10001[2] = this.spoofsprint;
      this.registerSettings(var10001);
   }
}
