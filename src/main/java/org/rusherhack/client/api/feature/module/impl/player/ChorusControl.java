package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.entity.Entity;
import net.minecraft.item.ChorusFruitItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

import org.rusherhack.command.bind;
public class ChorusControl extends ToggleableModule {
   public ColorSetting color;
   public PlayerPositionLookS2CPacket f3904;
   public BooleanSetting tracer;
   public BlockPos f3906;
   public boolean f3907;
   public BooleanSetting box;
   public BindSetting accept;
   public BooleanSetting others;

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      int var4 = Class253.m9155();
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof PlayerPositionLookS2CPacket) {
         PlayerPositionLookS2CPacket var5 = (PlayerPositionLookS2CPacket)var7;
         if (var4 == 0) {
            return;
         }

         if (this.f3907) {
            this.f3904 = var5;
            var1.setCancelled(true);
            return;
         }
      } else {
         Packet var8;
         if ((var8 = var1.getPacket()) instanceof PlaySoundS2CPacket) {
            PlaySoundS2CPacket var13 = (PlaySoundS2CPacket)var8;
            if ((Boolean)this.others.getValue()) {
               if (var13.getSound().value() == SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT) {
                  BlockPos var11;
                  if (Util177.m7288(var11 = new BlockPos((int)var13.getX(), (int)var13.getY(), (int)var13.getZ())) <= 1.0F) {
                     return;
                  }

                  this.f3906 = var11;
                  return;
               }

               return;
            }
         }

         Packet var9;
         if ((var9 = var1.getPacket()) instanceof EntityPositionS2CPacket) {
            EntityPositionS2CPacket var12 = (EntityPositionS2CPacket)var9;
            Entity var10;
            if ((Boolean)this.others.getValue()
               && this.f3906 != null
               && (var10 = Globals.mc.world.getEntityById(var12.getEntityId())) != null
               && Math.sqrt(var10.squaredDistanceTo(this.f3906.getX(), this.f3906.getY(), this.f3906.getZ())) <= 1.0) {
               this.f3906 = null;
            }
         }
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      if (this.f3907 && (var1.getPacket() instanceof TeleportConfirmC2SPacket || var1.getPacket() instanceof PlayerMoveC2SPacket)) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public void onDisable() {
      if (this.f3907 || this.f3904 != null) {
         if (this.f3904 != null && Globals.mc.player != null) {
            Globals.mc.player.networkHandler.onPlayerPositionLook(this.f3904);
         }

         this.f3907 = false;
         this.f3904 = null;
      }

      this.f3906 = null;
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   @Subscribe(
      stage = Stage.ALL
   )
   public void onUpdate(EventUpdate var1) {
        
    }

   public ChorusControl() {
      super("ChorusControl", "Know where chorus fruit will teleport you", ModuleCategory.PLAYER);
      this.accept = new BindSetting("Accept", new Class545(257));
      this.others = new BooleanSetting("Others", false);
      boolean var10010 = true;
      this.box = new BooleanSetting("Box", true);
      this.tracer = new BooleanSetting("Tracer", false);
      this.color = (ColorSetting)null;
      Setting[] var10001 = new Setting[]{this.accept, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.others;
      var10001[2] = this.box;
      var10001[3] = this.tracer;
      var10001[4] = this.color;
      this.registerSettings(var10001);
   }
}
