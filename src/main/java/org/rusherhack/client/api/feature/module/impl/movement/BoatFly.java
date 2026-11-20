package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.LevelLoadingScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.BoatPaddleStateC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundPlayerInputPacket;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class BoatFly extends ToggleableModule {
   public NumberSetting<Integer> consecutivelagbacks;
   public int f7550;
   public BooleanSetting duck;
   public Timer f7552;
   public NumberSetting<Float> vertical;
   public BooleanSetting toggleondisconnect;
   public BooleanSetting fixyaw;
   public int f7556;
   public int f7557;
   public static BoatFly f7558;
   public long f7559;
   public NumberSetting<Float> boatscale;
   public NumberSetting<Integer> tickstopause;
   public BooleanSetting strict;
   public NumberSetting<Float> glide;
   public BooleanSetting antikick;
   public NumberSetting<Float> speed;
   public static long f7573;

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Entity var5;
      if ((var5 = Globals.mc.player.getControllingVehicle()) != null && (Boolean)this.strict.getValue()) {
         Packet var7;
         if ((var7 = var1.getPacket()) instanceof PlayerPositionLookS2CPacket) {
            PlayerPositionLookS2CPacket var6 = (PlayerPositionLookS2CPacket)var7;
            if (Globals.mc.player.isAlive()
               && Globals.mc.world.canSetBlock(Globals.mc.player.getBlockPos())
               && !(Globals.mc.currentScreen instanceof LevelLoadingScreen)) {
               if (this.f7556 <= 0) {
                  this.f7556 = var6.getTeleportId();
                  return;
               }

               boolean var11 = true;
               var1.setCancelled(true);
            }
         } else {
            if (var1.getPacket() instanceof VehicleMoveS2CPacket) {
               BoatFly var10;
               label58: {
                  if (this.consecutivelagbacks.getValue() != 0) {
                     boolean var10004 = true;
                     this.f7557++;
                     if (System.currentTimeMillis() - this.f7559 > f7573) {
                        this.f7559 = System.currentTimeMillis();
                        var10 = this;
                        break label58;
                     }

                     if (this.f7557 > this.consecutivelagbacks.getValue()) {
                        this.f7550 = this.tickstopause.getValue();
                        return;
                     }
                  }

                  var10 = this;
               }

               if (var10.f7552.passed(650.0)) {
                  Globals.mc.player.networkHandler.sendPacket(new VehicleMoveC2SPacket(var5));
                  this.f7550 = this.tickstopause.getValue();
                  this.f7552.reset();
                  return;
               }

               boolean var10003 = true;
               var1.setCancelled(true);
            }
         }
      }
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      int var4 = Class253.m9154();
      Entity var8;
      if ((var8 = Globals.mc.player.getControllingVehicle()) != null) {
         if ((Boolean)this.fixyaw.getValue()) {
            var8.setYaw(Globals.mc.player.getYaw());
         }

         var8.setVelocity(0.0, 0.0, 0.0);
         if (this.f7550 > 0) {
            boolean var10004 = true;
            this.f7550--;
            Globals.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interact(var8, false, Hand.OFF_HAND));
         } else {
            double var5;
            BoatFly var10000;
            if (Globals.mc.player.input.jumping) {
               var5 = Globals.mc.player.age % 20 == 0 && this.antikick.getValue()
                  ? -0.04
                  : this.vertical.getValue().floatValue();
               var10000 = this;
            } else if (Globals.mc.player.input.sneaking && (Boolean)this.duck.getValue()) {
               var5 = -this.vertical.getValue();
               var10000 = this;
            } else {
               var5 = this.antikick.getValue() ? (Globals.mc.player.age % 2 == 0 ? 0.05 : -0.05) : -this.glide.getValue();
               var10000 = this;
            }

            double[] var7 = PlayerUtils.getDirectionalSpeed(var10000.speed.getValue().floatValue());
            if (var4 == 0) {
               double var10002 = var7[0];
               boolean var10007 = true;
               var8.setVelocity(var10002, var5, var7[1]);
               if (!(Boolean)this.strict.getValue()) {
                  return;
               }

               Globals.mc.player.networkHandler.sendPacket(new BoatPaddleStateC2SPacket(false, false));
               Globals.mc.player.networkHandler.sendPacket(new VehicleMoveC2SPacket(var8));
               Globals.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interact(var8, false, Hand.OFF_HAND));
            }

            ClientPlayNetworkHandler var10 = Globals.mc.player.networkHandler;
            int var10003 = this.f7556;
            boolean var10008 = true;
            this.f7556++;
            var10.sendPacket(new TeleportConfirmC2SPacket(var10003));
         }
      }
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      if ((Boolean)this.toggleondisconnect.getValue()) {
         this.toggle();
      }
   }

   public BoatFly() {
      super("BoatFly", "Fly with boats", ModuleCategory.MOVEMENT);
      this.speed = new NumberSetting<>("Speed", 1.0F, 0.0F, 10.0F);
      this.vertical = new NumberSetting<>("Vertical", 1.0F, 0.0F, 10.0F);
      boolean var10012 = true;
      this.fixyaw = new BooleanSetting("FixYaw", true);
      this.duck = new BooleanSetting("Duck", false);
      this.strict = new BooleanSetting("Strict", false);
      this.tickstopause = new NumberSetting<>("TicksToPause", 10, 0, 20);
      this.consecutivelagbacks = new NumberSetting<>("ConsecutiveLagBacks", 0, 0, 5);
      boolean var10007 = true;
      this.antikick = new BooleanSetting("AntiKick", true);
      this.glide = new NumberSetting<>("Glide", 0.0F, 0.0F, 5.0F).setVisibility(() -> {
         if (!(Boolean)this.antikick.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.toggleondisconnect = new BooleanSetting("ToggleOnDisconnect", false);
      this.boatscale = new NumberSetting<>("BoatScale", 1.0F, 0.0F, 3.0F);
      this.f7559 = System.currentTimeMillis();
      this.f7552 = new Timer();
      f7558 = this;
      BooleanSetting var10000 = this.strict;
      Setting[] var10001 = new Setting[]{this.tickstopause, null};
      boolean var10005 = true;
      var10001[1] = this.consecutivelagbacks;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[9];
      var10001[0] = this.speed;
      var10005 = true;
      var10001[1] = this.vertical;
      var10001[2] = this.glide;
      var10001[3] = this.fixyaw;
      var10001[4] = this.duck;
      var10001[5] = this.strict;
      var10001[6] = this.antikick;
      var10001[7] = this.toggleondisconnect;
      var10001[8] = this.boatscale;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void m14690(Class459 var1) {
      if (var1.m14393().equals(Globals.mc.player.getControllingVehicle())) {
         var1.m14394(this.boatscale.getValue());
      }
   }

   @Override
   public void onDisable() {
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (Globals.mc.player.getControllingVehicle() != null) {
         if (var1.getPacket() instanceof BoatPaddleStateC2SPacket) {
            if (this.f7550 <= 0 && (Boolean)this.strict.getValue()) {
               boolean var11 = true;
               var1.setCancelled(true);
            }
         } else {
            if ((Boolean)this.duck.getValue() && !Screen.hasAltDown()) {
               ClientCommandC2SPacket var5;
               Packet var6;
               if ((var6 = var1.getPacket()) instanceof ClientCommandC2SPacket
                  && ((var5 = (ClientCommandC2SPacket)var6).getMode() == Mode.PRESS_SHIFT_KEY || var5.getMode() == Mode.RELEASE_SHIFT_KEY)) {
                  boolean var10003 = true;
                  var1.setCancelled(true);
                  return;
               }

               if ((var6 = var1.getPacket()) instanceof PlayerInputC2SPacket) {
                  PlayerInputC2SPacket var9;
                  ((IMixinServerboundPlayerInputPacket)(var9 = (PlayerInputC2SPacket)var6)).setIsShiftKeyDown(false);
               }
            }
         }
      }
   }

   @Override
   public void onEnable() {
      this.f7557 = 0;
   }
}
