package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.util.Random;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.FluidFillable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundMovePlayerPacket;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundMoveVehiclePacket;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;

public class Jesus extends ToggleableModule {
   public int f9205;
   public EnumSetting<JesusMode> mode;
   public boolean f9207;

   public static BlockState m17609(Entity var0, double var1) {
      if (var0 == null) {
         return null;
      } else {
         Vec3d var8 = var0.getPos();
         BlockPos var7 = var0.getBlockPos();
         var1 = var8.y + var1;
         BlockPos var9 = new BlockPos(var7.getX(), MathHelper.floor(var1), var7.getZ());
         BlockState var10;
         return (var10 = Globals.mc.world.getBlockState(var9)).getBlock() instanceof FluidFillable && !var10.isSolid()
            ? var10.getBlock().getFluidState(var10).getBlockState()
            : var10;
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.mode.getValue() != JesusMode.f5684) {
         Entity var4;
         if ((var4 = Globals.mc.player.getControllingVehicle()) != null && m17617(var4) && !(var4 instanceof BoatEntity)) {
            var4.setVelocity(var4.getVelocity().x, 0.1, var4.getVelocity().z);
         }
      }
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      if (this.mode.getValue().equals(JesusMode.f5683) && var1.getPacket() instanceof VehicleMoveS2CPacket) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (this.mode.getValue() != JesusMode.f5684) {
         if (m17617(Globals.mc.player) && !Globals.mc.player.isSneaking()) {
            Globals.mc.player.setVelocity(Globals.mc.player.getVelocity().x, 0.1, Globals.mc.player.getVelocity().z);
         }
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (this.mode.getValue() != JesusMode.f5684) {
         Packet var10;
         if ((var10 = var1.getPacket()) instanceof PlayerMoveC2SPacket) {
            PlayerMoveC2SPacket var7;
            IMixinServerboundMovePlayerPacket var11 = (IMixinServerboundMovePlayerPacket)(var7 = (PlayerMoveC2SPacket)var10);
            if (this.mode.getValue().equals(JesusMode.f5687)) {
               boolean var17 = true;
               if (!m17614(Globals.mc.player, true, 0.01)
                  && !m17617(Globals.mc.player)
                  && !Globals.mc.player.horizontalCollision
                  && m17618(Globals.mc.player, false)) {
                  int var15;
                  IMixinServerboundMovePlayerPacket var10000;
                  if ((var15 = Globals.mc.player.age % 2) == 0) {
                     var10000 = var11;
                     var11.setY(var7.getY(Globals.mc.player.getY()) - 0.1);
                  } else {
                     var10000 = var11;
                     var11.setY(var7.getY(Globals.mc.player.getY()) - 0.11);
                  }

                  var10000.setOnGround(false);
                  return;
               }

               this.f9205 = 0;
               return;
            }

            this.f9205 = 0;
            boolean var10003 = true;
            int var5;
            if (m17618(Globals.mc.player, true)
               && !m17617(Globals.mc.player)
               && !m17614(Globals.mc.player, false, 0.01)
               && (var5 = Globals.mc.player.age % 2) == 0) {
               var11.setY(var7.getY(Globals.mc.player.getY()) + 0.02);
               return;
            }
         } else {
            Entity var12 = Globals.mc.player.getControllingVehicle();
            Packet var13;
            if ((var13 = var1.getPacket()) instanceof VehicleMoveC2SPacket) {
               VehicleMoveC2SPacket var16 = (VehicleMoveC2SPacket)var13;
               if (var12 != null) {
                  boolean var18 = true;
                  if (!m17614(var12, true, 0.01) && this.mode.getValue().equals(JesusMode.f5687)) {
                     IMixinServerboundMoveVehiclePacket var14 = (IMixinServerboundMoveVehiclePacket)var16;
                     var18 = true;
                     if (m17618(var12, true) && !m17617(var12)) {
                        var18 = true;
                        if (!m17614(var12, true, 0.01)) {
                           double var8 = 0.2 + new Random().nextDouble() / 3.0;
                           var14.setY(var16.getY() - var8);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static boolean m17614(Entity var0, boolean var1, double var2) {
        return false;
    }

   @Subscribe
   public void m17615(Event492 var1) {
      if (this.mode.getValue() != JesusMode.f5684) {
         if (!Globals.mc.world.getFluidState(var1.m15302()).isOf(Fluids.EMPTY)) {
            if (!Globals.mc.player.isTouchingWater() && !Globals.mc.player.isInLava()) {
               if (!Globals.mc.player.isSneaking() && !(Globals.mc.player.fallDistance > 3.0F)) {
                  boolean var7 = m17617(Globals.mc.player);
                  boolean var10000;
                  if (!m17618(Globals.mc.player, false) && !m17618(Globals.mc.player.getControllingVehicle(), false)) {
                     var10000 = false;
                     boolean var12 = true;
                  } else {
                     var10000 = true;
                     boolean var10002 = true;
                  }

                  boolean var6 = var10000;
                  if (!var7 && var6 && Globals.mc.player.getPos().y >= var1.m15302().getY()) {
                     var10000 = true;
                     boolean var14 = true;
                  } else {
                     var10000 = false;
                     boolean var13 = true;
                  }

                  boolean var8 = var10000;
                  if (var8) {
                     if (var1.m15301().isEmpty()) {
                        VoxelShape var9;
                        Event492 var11;
                        if (!this.mode.getValue().equals(JesusMode.f5683) && !this.mode.getValue().equals(JesusMode.f5687)) {
                           var9 = VoxelShapes.cuboid(new Box(0.0, 0.0, 0.0, 1.0, 0.9, 1.0));
                           var11 = var1;
                        } else if (this.mode.getValue().equals(JesusMode.f5687) && Globals.mc.player.getControllingVehicle() != null) {
                           var9 = VoxelShapes.fullCube();
                           var11 = var1;
                        } else {
                           var9 = VoxelShapes.cuboid(new Box(0.0, 0.0, 0.0, 1.0, 0.99, 1.0));
                           var11 = var1;
                        }

                        var11.m15300(var9);
                     }
                  }
               }
            }
         }
      }
   }

   public Jesus() {
      super("Jesus", "Allows you to walk on water", ModuleCategory.MOVEMENT);
      this.mode = new EnumSetting<>("Mode", JesusMode.f5683);
      this.f9205 = 0;
      this.registerSettings(this.mode);
   }

   public static boolean m17616(Entity var0) {
      return m17618(var0, false);
   }

   public static boolean m17617(Entity var0) {
      BlockState var5;
      return (var5 = m17609(var0, 0.01)) == null ? false : var5.getBlock() instanceof FluidBlock;
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Override
   public void setToggled(boolean var1) {
      super.setToggled(var1);
      Class428.f7111.m12375(var1);
   }

   public static boolean m17618(Entity var0, boolean var1) {
      double var5 = -(var1 ? 0.03 : (var0 == Globals.mc.player ? 0.2 : 0.5));
      BlockState var8;
      return (var8 = m17609(var0, var5)) == null ? false : var8.getBlock() instanceof FluidBlock;
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void m17619(Event301 var1) {
      if (this.mode.getValue() == JesusMode.f5684 && m17617(Globals.mc.player)) {
         var1.m10147().jumping = true;
      }
   }
}
