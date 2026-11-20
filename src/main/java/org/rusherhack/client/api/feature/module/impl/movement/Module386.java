package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.util.List;
import java.util.Random;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinLocalPlayer;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundMovePlayerPacket;
import org.rusherhack.client.api.events.client.EventTimerSpeed;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.player.TickShift;
public class Module386 extends ToggleableModule {
   public NumberSetting<Float> speed;
   public double f6265;
   public BooleanSetting autosprint;
   public boolean f6267;
   public static Module386 f6268;
   public static boolean f6269;
   public int f6270;
   public EnumSetting<Enum386> mode;
   public BooleanSetting timer;
   public double f6273;
   public BooleanSetting water;
   public float f6275;
   public int f6276;
   public BooleanSetting strict;
   public BooleanSetting ongroundstrict;

   public Module386() {
      super("Speed", "Speeds up the player", ModuleCategory.MOVEMENT);
      this.mode = new EnumSetting<>("Mode", Enum386.f7455);
      this.strict = new BooleanSetting("Strict", false).setVisibility(() -> {
         return this.mode.getValue().equals(Enum386.f7455);
      });
      this.ongroundstrict = new BooleanSetting("OnGroundStrict", false).setVisibility(() -> {
         return this.mode.getValue().equals(Enum386.f7460);
      });
      this.speed = new NumberSetting<>("Speed", 5.0F, 0.0F, 10.0F).setVisibility(() -> {
         return this.mode.getValue().equals(Enum386.f7456);
      });
      boolean var10005 = true;
      this.timer = new BooleanSetting("Timer", true).setVisibility(() -> {
         if (!this.mode.getValue().equals(Enum386.f7456) && !this.mode.getValue().equals(Enum386.f7458)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.autosprint = new BooleanSetting("AutoSprint", false);
      this.water = new BooleanSetting("Water", false).setVisibility(() -> {
         if (!this.mode.getValue().equals(Enum386.f7458)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      int var10001 = 7;
      this.f6270 = 0;
      this.f6267 = false;
      this.f6275 = 1.0F;
      f6268 = this;
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.mode;
      var10005 = true;
      var3[1] = this.strict;
      var3[2] = this.ongroundstrict;
      var3[3] = this.speed;
      var3[4] = this.timer;
      var3[5] = this.autosprint;
      var3[6] = this.water;
      this.registerSettings(var3);
   }

   @Subscribe
   public void onMove(EventMove var1) {
      int var4 = Class253.m9154();
      if (!TickShift.f3867.f3871) {
         if (!f6269 && !(Globals.mc.player.fallDistance >= 4.0F) && !Globals.mc.player.isFallFlying()) {
            if ((Boolean)this.water.getValue() || !Globals.mc.player.isTouchingWater() && !Globals.mc.player.isInLava()) {
               if (this.f6270 > 0) {
                  boolean var10004 = true;
                  this.f6270--;
               }

               if ((Boolean)this.autosprint.getValue() && ((IMixinLocalPlayer)Globals.mc.player).invokeCanStartSprinting()) {
                  boolean var10003 = true;
                  Globals.mc.player.setSprinting(true);
               }

               switch (this.mode.getValue().ordinal()) {
                  case 0:
                     Vec3d var13 = var1.getMotion();
                     double var7 = var13.y;
                     if ((Boolean)this.timer.getValue() && !(Boolean)this.strict.getValue()) {
                        this.f6275 = 1.08F;
                     }

                     if (MathUtils.round(Globals.mc.player.getY() - (int)Globals.mc.player.getY(), 3) == MathUtils.round(0.138, 3)) {
                        Globals.mc
                           .player
                           .setVelocity(Globals.mc.player.getVelocity().x, Globals.mc.player.getVelocity().y - 1.0, Globals.mc.player.getVelocity().z);
                        var7 -= 0.0931;
                     }

                     Module386 var21;
                     if (this.f6276 == 2
                        && (Globals.mc.player.input.movementForward != 0.0F || Globals.mc.player.input.movementSideways != 0.0F)
                        && Globals.mc.player.verticalCollision) {
                        if (!Globals.mc.player.isTouchingWater() && !Globals.mc.player.isInLava()) {
                           Globals.mc.player.setVelocity(Globals.mc.player.getVelocity().x, 0.39936, Globals.mc.player.getVelocity().z);
                           var7 = 0.4;
                        }

                        boolean var10001;
                        if (!this.f6267) {
                           var10001 = true;
                           boolean var23 = true;
                        } else {
                           var10001 = false;
                           boolean var24 = true;
                        }

                        label231: {
                           this.f6267 = var10001;
                           if ((Boolean)this.strict.getValue()) {
                              if (this.f6267) {
                                 this.f6275 = 1.08F;
                                 var21 = this;
                                 break label231;
                              }

                              this.f6275 = 1.0F;
                           }

                           var21 = this;
                        }

                        var21.f6265 = var21.f6265 * (this.strict.getValue() ? (this.f6267 ? 1.9 : 1.85) : (this.f6267 ? 1.55 : 1.395));
                        var21 = this;
                     } else {
                        label301: {
                           if (this.f6276 == 3) {
                              double var9 = 0.66 * (this.f6273 - this.m12440());
                              this.f6265 = this.f6273 - var9;
                              if (!(Boolean)this.timer.getValue()) {
                                 break label301;
                              }

                              this.f6275 = this.f6267 ? (this.strict.getValue() ? 1.08F : 1.125F) : (this.strict.getValue() ? 1.05F : 1.0088F);
                              if (var4 == 0) {
                                 break label301;
                              }
                           }

                           if (Globals.mc
                                 .world
                                 .getBlockCollisions(Globals.mc.player, Globals.mc.player.getBoundingBox().stretch(0.0, Globals.mc.player.getVelocity().y, 0.0))
                                 .iterator()
                                 .hasNext()
                              || Globals.mc.player.verticalCollision) {
                              this.f6276 = 1;
                           }

                           this.f6265 = this.f6273 - this.f6273 / 159.0;
                        }

                        var21 = this;
                     }

                     var21.f6265 = Math.max(this.f6265, this.m12440()) * (this.strict.getValue() ? (this.f6267 ? 0.983 : 0.975) : 1.0);
                     double[] var14 = PlayerUtils.getDirectionalSpeed(Globals.mc.player.getYaw(), this.f6265);
                     double var25 = var14[0];
                     boolean var10009 = true;
                     var1.setMotion(new Vec3d(var25, var7, var14[1]));
                     boolean var26 = true;
                     this.f6276++;
                     return;
                  case 1:
                     if (!Globals.mc.player.horizontalCollision
                        && PlayerUtils.hasHorizontalInput()
                        && (!(Boolean)this.ongroundstrict.getValue() || this.m12431(Globals.mc.player))) {
                        Module386 var19;
                        label215: {
                           if (Globals.mc.player.isOnGround()) {
                              if (this.f6276 == 2) {
                                 this.f6275 = 1.0F;
                                 if (this.f6270 > 0) {
                                    this.f6265 = this.m12440();
                                    var19 = this;
                                 } else {
                                    this.f6265 *= 2.149;
                                    var19 = this;
                                 }

                                 var19.f6276 = 3;
                                 var19 = this;
                                 break label215;
                              }

                              if (this.f6276 == 3) {
                                 if ((Boolean)this.timer.getValue()) {
                                    this.f6275 = Math.max(1.0F + new Random().nextFloat(), 1.2F);
                                    var19 = this;
                                 } else {
                                    this.f6275 = 1.0F;
                                    var19 = this;
                                 }

                                 var19.f6276 = 2;
                                 double var5 = 0.66 * (this.f6273 - this.m12440());
                                 var19 = this;
                                 this.f6265 = this.f6273 - var5;
                                 break label215;
                              }
                           } else {
                              this.f6275 = 1.0F;
                           }

                           var19 = this;
                        }

                        var19.f6265 = Math.max(this.f6265, this.m12440());
                        this.m12436(var1, this.f6265);
                        return;
                     }

                     this.f6275 = 1.0F;
                     return;
                  case 2:
                     if (!PlayerUtils.hasHorizontalInput()) {
                        var1.setMotion(new Vec3d(0.0, var1.getMotion().getY(), 0.0));
                        return;
                     }

                     if (!Globals.mc.player.horizontalCollision && !Globals.mc.player.input.sneaking) {
                        Module386 var17;
                        if (Globals.mc.player.isOnGround()) {
                           if (Globals.mc.player.age % 2 == 0) {
                              this.f6275 = 1.0F;
                              var17 = this;
                              this.f6276 = 2;
                           } else {
                              if ((Boolean)this.timer.getValue()) {
                                 this.f6275 = 1.2F;
                                 var17 = this;
                              } else {
                                 this.f6275 = 1.0F;
                                 var17 = this;
                              }

                              var17.f6276 = 3;
                              var17 = this;
                           }

                           var17.f6265 = this.m12440();
                           var17 = this;
                        } else {
                           var17 = this;
                           this.f6276 = 0;
                        }

                        var17.f6265 = Math.max(this.f6265, this.m12440());
                        this.m12436(var1, this.f6265);
                        return;
                     }
                     break;
                  case 3:
                     this.m12436(var1, this.speed.getValue() / 5.0F);
               }
            }
         }
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public boolean m12431(ClientPlayerEntity var1) {
      if (var1 == null) {
         return false;
      } else {
         BlockPos var4 = var1.getBlockPos().up(2);
         return Globals.mc.world.getBlockState(var4).isSideSolidFullSquare(Globals.mc.world, var4, net.minecraft.util.math.Direction.DOWN);
      }
   }

   @Override
   public void onEnable() {
      this.f6276 = 2;
      f6269 = false;
      this.f6273 = 0.0;
      this.f6265 = this.m12440();
   }

   

   @Override
   public void onDisable() {
      int var10000 = Class253.m9154();
      this.f6275 = 1.0F;
      f6269 = false;
      int var3 = var10000;
      Object var4 = Globals.mc.player;
      if (var3 == 0) {
         if (Globals.mc.player == null) {
            return;
         }

         var4 = this.autosprint.getValue();
      }

      if ((Boolean)var4) {
         Globals.mc.player.setSprinting(false);
      }
   }

   @Subscribe
   public void onTimerSpeed(EventTimerSpeed var1) {
      if ((Boolean)this.timer.getValue()) {
         var1.setSpeed(this.f6275);
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (var1.getPacket() instanceof PlayerPositionLookS2CPacket && (this.mode.getValue().equals(Enum386.f7460) || this.mode.getValue().equals(Enum386.f7455))) {
         this.f6270 = 6;
         Module386 var6;
         if (this.mode.getValue().equals(Enum386.f7460)) {
            var6 = this;
            this.f6276 = 2;
         } else {
            var6 = this;
            this.f6276 = 1;
            this.f6267 = false;
         }

         var6.f6273 = 0.0;
         this.f6265 = this.m12440();
      }
   }

   public void m12436(EventMove var1, double var2) {
        
    }

   public double m12440() {
        return 0.0;
    }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var5;
      if ((var5 = var1.getPacket()) instanceof PlayerMoveC2SPacket) {
         PlayerMoveC2SPacket var7 = (PlayerMoveC2SPacket)var5;
         if (!f6269 && this.mode.getValue().equals(Enum386.f7460) && this.f6276 == 3) {
            ((IMixinServerboundMovePlayerPacket)var7).setY(var7.getY(Globals.mc.player.getY()) + (this.m12431(Globals.mc.player) ? 0.2 : 0.4));
         }
      }
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (!f6269) {
         double var5 = Globals.mc.player.getX() - Globals.mc.player.lastRenderX;
         double var7 = Globals.mc.player.getZ() - Globals.mc.player.lastRenderZ;
         this.f6273 = Math.sqrt(var5 * var5 + var7 * var7);
         if (!TickShift.f3867.f3871 && this.mode.getValue() == Enum386.f7458) {
            double var10000 = 1.5;
            List var9;
            if (!(var9 = Globals.mc.world.getOtherEntities(Globals.mc.player, Globals.mc.player.getBoundingBox().expand(MathHelper.square(1.5)), var0 -> {
               if (var0.isPushable() && Globals.mc.player.distanceTo(var0) < 1.5) {
                  boolean var10002 = true;
                  return true;
               } else {
                  return false;
               }
            })).isEmpty()) {
               double[] var10 = PlayerUtils.getDirectionalSpeed(var9.size() * 0.08);
               double var10003 = var10[0];
               boolean var10008 = true;
               Globals.mc.player.addVelocityInternal(new Vec3d(var10003, 0.0, var10[1]));
            }
         }
      }
   }
}
