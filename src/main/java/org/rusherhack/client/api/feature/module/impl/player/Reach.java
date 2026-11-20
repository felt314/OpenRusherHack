package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundInteractPacket;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class Reach extends ToggleableModule {
   public NumberSetting<Float> blockreach;
   public NumberSetting<Float> entityreach;
   public static Reach f3922;
   public EnumSetting<ReachMode> mode;

   public Reach() {
      super(
         "Reach", "|AM\\W]\u001e\u0019 your interaction distance", ModuleCategory.PLAYER
      );
      this.mode = new EnumSetting<>("Mode", ReachMode.f3467);
      this.entityreach = new NumberSetting<>("EntityReach", 6.0F, 0.1F, 6.0F).setVisibility(() -> {
         if (this.mode.getValue() == ReachMode.f3467) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.blockreach = new NumberSetting<>("BlockReach", 6.0F, 0.1F, 6.0F).setVisibility(() -> {
         if (this.mode.getValue() == ReachMode.f3467) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      Reach var10000 = f3922 = this;
      Setting[] var10001 = new Setting[]{this.mode, null, null};
      boolean var10005 = true;
      var10001[1] = this.entityreach;
      var10001[2] = this.blockreach;
      var10000.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onSend(EventPacket$Send var1) {
      if (this.mode.getValue() == ReachMode.f3469) {
         Vec3d var10 = Vec3d.ZERO;
         double var6 = 69420.0;
         Packet var9;
         Vec3d var10000;
         if ((var9 = var1.getPacket()) instanceof PlayerActionC2SPacket) {
            PlayerActionC2SPacket var8;
            if ((var8 = (PlayerActionC2SPacket)var9).getPos() == BlockPos.ORIGIN) {
               return;
            }

            var10 = Class220.m8439(var8.getPos(), var8.getDirection());
            var6 = Globals.mc.player.getAttributeValue(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE);
            var10000 = var10;
         } else if ((var9 = var1.getPacket()) instanceof PlayerInteractBlockC2SPacket) {
            var10 = ((PlayerInteractBlockC2SPacket)var9).getBlockHitResult().getPos();
            var6 = Globals.mc.player.getAttributeValue(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE);
            var10000 = var10;
         } else {
            if ((var9 = var1.getPacket()) instanceof PlayerInteractEntityC2SPacket) {
               PlayerInteractEntityC2SPacket var11 = (PlayerInteractEntityC2SPacket)var9;
               Entity var14;
               if ((var14 = Globals.mc.world.getEntityById(((IMixinServerboundInteractPacket)var11).getEntityId())) == null) {
                  return;
               }

               var10 = Class220.m8443(var14, false);
               var6 = Globals.mc.player.getAttributeValue(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE);
            }

            var10000 = var10;
         }

         if (var10000 != Vec3d.ZERO && Util177.m7290(var10) > var6) {
            if (var1.getStage() == Stage.POST) {
               var10 = Globals.mc.player.getPos();
            }

            Globals.mc.player.networkHandler.sendPacket(new PositionAndOnGround(var10.x, var10.y, var10.z, Globals.mc.player.isOnGround()));
         }
      }
   }
}
