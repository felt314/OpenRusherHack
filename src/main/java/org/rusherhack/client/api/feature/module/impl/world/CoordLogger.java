package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Tameable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Receive;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.clear;
import org.rusherhack.command.coords;
public class CoordLogger extends ToggleableModule {
   public BooleanSetting endportals;
   public BooleanSetting othersounds;
   public BooleanSetting teleportation;
   public BooleanSetting entityteleportation;
   public Map<Entity, Vec3d> f6107;
   public BooleanSetting enderdragon;
   public BooleanSetting withers;
   public static long f6114;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var4 = Class253.m9155();
      CoordLogger var5 = this;
      if ((Boolean)this.teleportation.getValue()) {
         Iterator var8 = WorldUtils.getEntities().iterator();

         label39:
         while (true) {
            for (Iterator var10000 = var8; var10000.hasNext(); var10000 = var8) {
               Entity var7;
               if (!((var7 = (Entity)var8.next()) instanceof LivingEntity)) {
                  continue label39;
               }

               if (!(var7 instanceof PlayerEntity)) {
                  if (var5.f6107.containsKey(var7)) {
                     Vec3d var6 = var5.f6107.get(var7);
                     if (Math.sqrt(var7.squaredDistanceTo(var6)) > 255.0) {
                        NotificationType var10001 = NotificationType.INFO;
                        Object[] var10003 = new Object[]{var7.getName().getString(), null, null, null};
                        boolean var10007 = true;
                        var10003[1] = var7.getX();
                        var10003[2] = var7.getY();
                        var10003[3] = var7.getZ();
                        var5.sendNotification(var10001, String.format("%s has teleported to X: %s, Y: %s, Z: %s", var10003));
                        var5.f6107.remove(var7);
                        continue label39;
                     }

                     var5.f6107.replace(var7, var7.getPos());
                     if (var4 != 0) {
                        continue label39;
                     }
                  }

                  var5.f6107.put(var7, var7.getPos());
                  if (var4 == 0) {
                     return;
                  }
                  continue label39;
               }
            }

            return;
         }
      }
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.f6107.clear();
   }

   public CoordLogger() {
        super("CoordLogger", "Prints coords of sounds that play", ModuleCategory.WORLD);
      int var10001 = (int)f6114;

      boolean var10014 = true;
      this.teleportation = new BooleanSetting("Teleportation", true);
      boolean var10013 = true;
      this.entityteleportation = new BooleanSetting("EntityTeleportation", true);
      boolean var10012 = true;
      this.endportals = new BooleanSetting("EndPortals", true);
      boolean var10011 = true;
      this.enderdragon = new BooleanSetting("EnderDragon", true);
      boolean var10010 = true;
      this.withers = new BooleanSetting("Withers", true);
      boolean var10009 = true;
      this.othersounds = new BooleanSetting("OtherSounds", true);
      this.f6107 = new HashMap<>();
      Setting[] var3 = new Setting[var10001];
      var3[0] = this.teleportation;
      boolean var10005 = true;
      var3[1] = this.entityteleportation;
      var3[2] = this.endportals;
      var3[3] = this.enderdragon;
      var3[4] = this.withers;
      var3[5] = this.othersounds;
      this.registerSettings(var3);
   }

   @Subscribe
   public void onReceive(EventPacket$Receive var1) {
      Packet var6;
      if ((var6 = var1.getPacket()) instanceof PlaySoundS2CPacket) {
         PlaySoundS2CPacket var8 = (PlaySoundS2CPacket)var6;
         String var12 = null;
         String var10000;
         if (var8.getSound().value() == SoundEvents.BLOCK_END_PORTAL_SPAWN && (Boolean)this.endportals.getValue()) {
            Object[] var18 = new Object[]{var8.getX(), null, null};
            boolean var24 = true;
            var18[1] = var8.getY();
            var18[2] = var8.getZ();
            var10000 = var12 = String.format("End portal was activated at X: %s, Y: %s, Z: %s", var18);
         } else if (var8.getSound().value() == SoundEvents.ENTITY_ENDER_DRAGON_DEATH && (Boolean)this.enderdragon.getValue()) {
            Object[] var17 = new Object[]{var8.getX(), null, null};
            boolean var23 = true;
            var17[1] = var8.getY();
            var17[2] = var8.getZ();
            var10000 = var12 = String.format("Ender dragon was killed at X: %s, Y: %s, Z: %s", var17);
         } else if (var8.getSound().value() == SoundEvents.ENTITY_WITHER_SPAWN && (Boolean)this.withers.getValue()) {
            Object[] var16 = new Object[]{var8.getX(), null, null};
            boolean var22 = true;
            var16[1] = var8.getY();
            var16[2] = var8.getZ();
            var10000 = var12 = String.format("Wither has been spawned at X: %s, Y: %s, Z: %s", var16);
         } else {
            if (Util177.m7289(new Vec3d(var8.getX(), var8.getY(), var8.getZ())) > 255.0F && (Boolean)this.othersounds.getValue()) {
               Object[] var10001 = new Object[]{var8.getX(), null, null};
               boolean var10005 = true;
               var10001[1] = var8.getY();
               var10001[2] = var8.getZ();
               var12 = String.format("Unknown sound at X: %s, Y: %s, Z: %s", var10001);
            }

            var10000 = var12;
         }

         if (var10000 != null) {
            this.sendNotification(NotificationType.INFO, var12);
            return;
         }
      } else if ((var6 = var1.getPacket()) instanceof EntityPositionS2CPacket) {
         EntityPositionS2CPacket var11 = (EntityPositionS2CPacket)var6;
         if ((Boolean)this.entityteleportation.getValue()) {
            Entity var14;
            if ((var14 = Globals.mc.world.getEntityById(var11.getEntityId())) == null || Globals.mc.player.distanceTo(var14) < 255.0F) {
               return;
            }

            if (var14 instanceof PlayerEntity) {
               String var15 = ((PlayerEntity)var14).getName().getString();
               NotificationType var20 = NotificationType.INFO;
               Object[] var21 = new Object[]{var15, null, null, null};
               boolean var25 = true;
               var21[1] = var11.getX();
               var21[2] = var11.getZ();
               var21[3] = var11.getZ();
               this.sendNotification(var20, String.format("%s teleported in the direction of X: %s, Y: %s, Z: %s", var21));
               return;
            }

            Tameable var9;
            if (var14 instanceof Tameable && (var9 = (Tameable)var14).getOwnerUuid() != null) {
               String var7 = Class551.m17068(var9.getOwnerUuid().toString());
               String var10 = var14.getName().getString();
               NotificationType var19 = NotificationType.INFO;
               Object[] var10003 = new Object[]{var7, null, null, null, null};
               boolean var10007 = true;
               var10003[1] = var10;
               var10003[2] = var11.getX();
               var10003[3] = var11.getZ();
               var10003[4] = var11.getZ();
               this.sendNotification(var19, String.format("%s's %s teleported in the direction of X: %s, Y: %s, Z: %s", var10003));
            }
         }
      }
   }
}
