package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinClientboundExplodePacket;
import org.rusherhack.client.api.accessors.packet.IMixinClientboundSetEntityMotionPacket;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Velocity extends ToggleableModule {
   public int f4052;
   public BooleanSetting grimmotiontest;
   public NumberSetting<Integer> horizontal;
   public BooleanSetting pushing;
   public boolean f4056;
   public boolean f4057;
   public NumberSetting<Integer> f4058;
   public PlayerMoveC2SPacket f4059;
   public int f4060;
   public BooleanSetting water;
   public boolean f4062;
   public BooleanSetting debug;
   public EnumSetting<VelocityMode> mode;
   public java.util.Queue<CommonPingS2CPacket> f4065;
   public NumberSetting<Integer> vertical;
   public BooleanSetting blocks;
   public NumberSetting<Integer> f4068;
   public Set<CommonPongC2SPacket> f4069;
   public Timer f4070;
   public BooleanSetting entities;
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Subscribe
   public void m8345(Event390 var1) {
        
    }

   @Subscribe(
      priority = 1000
   )
   public void onUpdate(EventUpdate var1) {
      switch (this.mode.getValue().ordinal()) {
         case 1:
            if (this.f4052 > 0) {
               if ((Boolean)this.debug.getValue()) {
                  ChatUtils.print(System.currentTimeMillis() + " sent 1");
               }

               if (this.f4059 != null) {
                  Full var4 = new Full(
                     this.f4059.getX(Globals.mc.player.getX()),
                     this.f4059.getY(Globals.mc.player.getY()),
                     this.f4059.getZ(Globals.mc.player.getZ()),
                     this.f4059.getYaw(Class170.f3364.m7108().f5316),
                     this.f4059.getPitch(Class170.f3364.m7108().f5323),
                     this.f4059.isOnGround()
                  );
                  this.f4059 = var4;
                  Globals.mc.player.networkHandler.sendPacket(var4);
               }

               Globals.mc
                  .player
                  .networkHandler
                  .sendPacket(
                     new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, Globals.mc.player.getBlockPos().up(), net.minecraft.util.math.Direction.DOWN)
                  );
               return;
            }
            break;
         case 2:
            if (this.f4060 > 0) {
               boolean var6 = true;
               this.f4060--;
            }

            this.f4056 = false;
            return;
         case 3:
            if (Globals.mc.player.hurtTime > 0 && Globals.mc.player.hurtTime < 10) {
               if (!Globals.mc.player.isSprinting()) {
                  boolean var10004 = true;
                  Globals.mc.player.setSprinting(this.f4062 = true);
                  return;
               }

               if (Globals.mc.player.isOnGround()) {
                  Globals.mc.player.jump();
                  return;
               }
            } else if (this.f4062) {
               Globals.mc.player.setSprinting(this.f4062 = false);
            }
      }
   }

   @Subscribe(
      stage = Stage.PRE,
      priority = -1000
   )
   public void onSend(EventPacket$Send var1) {
      int var4 = Class253.m9154();
      Velocity var6 = this;
      switch (this.mode.getValue().ordinal()) {
         case 1:
            Packet var11;
            if ((var11 = var1.getPacket()) instanceof PlayerMoveC2SPacket) {
               PlayerMoveC2SPacket var13 = (PlayerMoveC2SPacket)var11;
               if (var4 == 0) {
                  if (var1.isCancelled()) {
                     return;
                  }

                  this.f4059 = var13;
               }

               return;
            }

            return;
         case 2:
            Packet var8;
            if ((var8 = var1.getPacket()) instanceof CommonPongC2SPacket) {
               CommonPongC2SPacket var5 = (CommonPongC2SPacket)var8;
               if (this.f4060 == 0) {
                  if (this.f4069.contains(var5)) {
                     this.f4069.remove(var5);
                     return;
                  }

                  CommonPingS2CPacket var9;
                  if ((var9 = this.f4065.poll()) != null) {
                     CommonPongC2SPacket var7 = new CommonPongC2SPacket(var9.getParameter());
                     this.f4069.add(var7);
                     Globals.mc.player.networkHandler.sendPacket(var7);
                  }
               }
            }

            if (var1.getPacket() instanceof PlayerInteractEntityC2SPacket && var1.getStage() == Stage.PRE) {
               Velocity var10000 = this;

               CommonPingS2CPacket var12;
               while ((var12 = var10000.f4065.poll()) != null) {
                  CommonPongC2SPacket var10 = new CommonPongC2SPacket(var12.getParameter());
                  var10000 = var6;
                  var6.f4069.add(var10);
                  Globals.mc.player.networkHandler.sendPacket(var10);
               }
            }
      }
   }

   @Subscribe(
      priority = -1000,
      stage = Stage.ALL
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (var1.getStage().equals(Stage.PRE) && this.f4052 > 0) {
         if ((Boolean)this.debug.getValue()) {
            ChatUtils.print(System.currentTimeMillis() + " sent 2");
         }

         boolean var10004 = true;
         this.f4052--;
      }
   }

   public Velocity() {
      super("Velocity", "Reduces knockback velocity", ModuleCategory.MOVEMENT);
      boolean var10008 = true;
      this.pushing = new BooleanSetting("Pushing", true);
      boolean var10007 = true;
      this.entities = new BooleanSetting("Entities", true);
      this.water = new BooleanSetting("Water", false).setVisibility(() -> {
         if (this.mode.getValue() != VelocityMode.f8683 && this.mode.getValue() != VelocityMode.f8681) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10007 = true;
      this.blocks = new BooleanSetting("Blocks", true);
      this.mode = new EnumSetting<>("Mode", VelocityMode.f8681);
      this.horizontal = new NumberSetting<>("Horizontal", 0, 0, 100).setVisibility(() -> {
         if (this.mode.getValue() != VelocityMode.f8679) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.vertical = new NumberSetting<>("Vertical", 0, 0, 100).setVisibility(() -> {
         if (this.mode.getValue() != VelocityMode.f8679) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      NumberSetting var10001 = new NumberSetting<>(
            "TransactionDelay",
            50,
            10,
            200
         )
         .setVisibility(() -> {
            if (this.mode.getValue() == VelocityMode.f8681) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      boolean var10004 = true;
      this.f4058 = var10001.setHidden(true);
      Integer var10003 = 10;
      boolean var10006 = true;
      var10001 = new NumberSetting<>("PauseTicks", var10003, 1, 200).setVisibility(() -> {
         if (this.mode.getValue() == VelocityMode.f8681) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10004 = true;
      this.f4068 = var10001.setHidden(true);
      BooleanSetting var10005 = new BooleanSetting("Debug", false);
      var10008 = true;
      this.debug = var10005.setHidden(true);
      boolean var10010 = true;
      var10005 = new BooleanSetting("GrimMotionTest", true);
      var10008 = true;
      this.grimmotiontest = var10005.setHidden(true);
      this.f4065 = new ArrayDeque<>();
      this.f4069 = new HashSet<>();
      this.f4070 = new Timer();
      BooleanSetting var10000 = this.pushing;
      Setting[] var4 = new Setting[]{this.entities, null, null};
      boolean var8 = true;
      var4[1] = this.water;
      var4[2] = this.blocks;
      var10000.addSubSettings(var4);
      Setting[] var5 = new Setting[8];
      var5[0] = this.pushing;
      boolean var9 = true;
      var5[1] = this.mode;
      var5[2] = this.horizontal;
      var5[3] = this.vertical;
      var5[4] = this.f4058;
      var5[5] = this.f4068;
      var5[6] = this.debug;
      var5[7] = this.grimmotiontest;
      this.registerSettings(var5);
   }

   @Override
   public String getMetadata() {
      if (this.mode.getValue() != VelocityMode.f8680) {
         return this.mode.getDisplayValue();
      } else {
         Object[] var10001 = new Object[]{this.horizontal.getValue(), null};
         boolean var10005 = true;
         var10001[1] = this.vertical.getValue();
         return String.format("H: %s, V: %s", var10001);
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (this.mode.getValue() != VelocityMode.f8679) {
         if (this.mode.getValue() == VelocityMode.f8681) {
            if (var1.getPacket() instanceof PlayerPositionLookS2CPacket) {
               this.f4056 = false;
               this.f4057 = true;
               this.f4070.reset();
               return;
            }

            if (!this.f4070.ticksPassed(this.f4068.getValue())) {
               this.f4057 = false;
               return;
            }

            Packet var10;
            if ((var10 = var1.getPacket()) instanceof CommonPingS2CPacket) {
               CommonPingS2CPacket var27 = (CommonPingS2CPacket)var10;
               if (this.f4056) {
                  this.f4060 = this.f4058.getValue();
               }

               if (this.f4060 > 0) {
                  this.f4065.add(var27);
                  boolean var10004 = true;
                  var1.setCancelled(true);
               }

               return;
            }
         }

         Packet var21;
         if (!((var21 = var1.getPacket()) instanceof EntityVelocityUpdateS2CPacket)) {
            Packet var23;
            if ((var23 = var1.getPacket()) instanceof ExplosionS2CPacket) {
               ExplosionS2CPacket var30 = (ExplosionS2CPacket)var23;
               if (!this.f4057 || this.mode.getValue() != VelocityMode.f8681) {
                  IMixinClientboundExplodePacket var24 = (IMixinClientboundExplodePacket)var30;
                  float var28 = var30.getPlayerVelocityX();
                  float var29 = var30.getPlayerVelocityY();
                  float var25 = var30.getPlayerVelocityZ();
                  if ((Boolean)this.debug.getValue()) {
                     ChatUtils.print(System.currentTimeMillis() + " receive explosion packet " + var28 + " " + var29 + " " + var25);
                  }

                  if (var28 != 0.0F || var29 != 0.0F || var25 != 0.0F) {
                     IMixinClientboundExplodePacket var33;
                     switch (this.mode.getValue().ordinal()) {
                        case 1:
                           this.f4052 = 1;
                           var33 = var24;
                           break;
                        case 2:
                           this.f4056 = true;
                        default:
                           var33 = var24;
                     }

                     var33.setKnockbackX(var28 * (this.horizontal.getValue().intValue() / 100.0F));
                     var24.setKnockbackY(var29 * (this.vertical.getValue().intValue() / 100.0F));
                     var24.setKnockbackZ(var25 * (this.horizontal.getValue().intValue() / 100.0F));
                  }
               }
            } else {
               this.f4057 = false;
            }
         } else {
            EntityVelocityUpdateS2CPacket var7 = (EntityVelocityUpdateS2CPacket)var21;
            if ((!this.f4057 || this.mode.getValue() != VelocityMode.f8681) && var7.getEntityId() == Globals.mc.player.getId()) {
               IMixinClientboundSetEntityMotionPacket var22 = (IMixinClientboundSetEntityMotionPacket)var7;
               int var8 = var22.getMotionX();
               int var9 = var22.getMotionY();
               int var6 = var22.getMotionZ();
               if ((Boolean)this.debug.getValue()) {
                  long var10000 = System.currentTimeMillis();
                  float var10001 = var8 / 8000.0F;
                  float var10002 = var9 / 8000.0F;
                  float var15 = var6 / 8000.0F;
                  float var16 = var10002;
                  float var17 = var10001;
                  ChatUtils.print(var10000 + " receive velocity packet " + var17 + " " + var16 + " " + var15);
               }

               if (var8 != 0 || var9 != 0 || var6 != 0) {
                  double var11 = Math.abs(var8 / 8000.0F);
                  double var13 = Math.abs(var6 / 8000.0F);
                  boolean var31;
                  if (!(var11 > 0.01) && !(var13 > 0.01) && (!(Boolean)this.grimmotiontest.getValue() || !(var9 / 8000.0F > 0.03))) {
                     var31 = false;
                     boolean var35 = true;
                  } else {
                     var31 = true;
                     boolean var34 = true;
                  }

                  boolean var26 = var31;
                  Velocity var32;
                  switch (this.mode.getValue().ordinal()) {
                     case 1:
                        if (!var26) {
                           return;
                        }

                        var32 = this;
                        this.f4052 = 1;
                        break;
                     case 2:
                        if (!var26) {
                           this.f4056 = false;
                           return;
                        }

                        this.f4056 = true;
                        this.f4057 = false;
                     default:
                        var32 = this;
                  }

                  if (var32.horizontal.getValue().equals(0) && this.vertical.getValue().equals(0)) {
                     boolean var10003 = true;
                     var1.setCancelled(true);
                  } else {
                     var22.setMotionX(var8 * (this.horizontal.getValue() / 100));
                     var22.setMotionY(var9 * (this.vertical.getValue() / 100));
                     var22.setMotionZ(var6 * (this.horizontal.getValue() / 100));
                  }
               }
            }
         }
      }
   }
}
