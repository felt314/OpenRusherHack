package org.rusherhack.command;
import org.rusherhack.*;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.StringJoiner;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.explosion.Explosion;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundInteractPacket;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.network.EventPacket$Send;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;
import org.rusherhack.core.command.annotations.CommandExecutor$Argument;
import org.rusherhack.core.event.subscribe.Subscribe;

public class fakeplayer extends Command {
   public static List<Class156> f8635;
   @Subscribe
   public void onQuit(EventQuit var1) {
      f8635.clear();
   }

   public Class156 m16581(Optional<String> var1) {
        return null;
    }

   @CommandExecutor
   public String m5733() {
      if (f8635.isEmpty()) {
         Class156 var4 = this.m16581(Optional.empty());
         boolean var5 = true;
         return String.format("Created %s", var4.getName().getString());
      } else {
         boolean var10003 = true;
         return String.format("Deleted %s", this.m16591(Optional.empty()).getName().getString());
      }
   }

   public fakeplayer() {
      super("fakeplayer", "Spawns a fake player in the world");
      Class170.f3362.subscribe(this);
   }

   @Subscribe
   public void onRemove(EventEntity$Remove var1) {
      int var4 = Class253.m9154();
      Entity var13;
      if ((Boolean)Module087.f2190.damage.getValue() && (var13 = var1.getEntity()) instanceof EndCrystalEntity) {
         EndCrystalEntity var19 = (EndCrystalEntity)var13;
         float var20 = 12.0F;
         double var6 = var19.getX();
         double var8 = var19.getY();
         double var10 = var19.getZ();
         Box var21 = new Box(
            MathHelper.floor(var6 - 12.0 - 1.0),
            MathHelper.floor(var8 - 12.0 - 1.0),
            MathHelper.floor(var10 - 12.0 - 1.0),
            MathHelper.floor(var6 + 12.0 + 1.0),
            MathHelper.floor(var8 + 12.0 + 1.0),
            MathHelper.floor(var10 + 12.0 + 1.0)
         );
         Iterator var12 = f8635.iterator();

         label35:
         while (true) {
            for (Iterator var10000 = var12; var10000.hasNext(); var10000 = var12) {
               double var14;
               Class156 var18;
               if (!(var18 = (Class156)var12.next()).getBoundingBox().intersects(var21)
                  || (var14 = Math.sqrt(var18.squaredDistanceTo(var19.getPos())) / 12.0) > 1.0) {
                  continue label35;
               }

               double var24 = var6 = var18.getX() - var6;
               double var25 = var24 * var24;
               double var10001 = var8 = var18.getEyeY() - var8;
               double var26 = var25 + var10001 * var10001;
               var10001 = var10 = var18.getZ() - var10;
               if (Math.sqrt(var26 + var10001 * var10001) != 0.0) {
                  double var16 = Explosion.getExposure(var19.getPos(), var18);
                  double var22;
                  double var27 = var22 = (1.0 - var14) * var16;
                  float var23 = (int)((var27 * var27 + var22) / 2.0 * 7.0 * 12.0 + 1.0);
                  var18.setHealth(var18.getHealth() + var18.getAbsorptionAmount() - var23);
                  if (var4 != 0) {
                     return;
                  }
                  continue label35;
               }
            }

            return;
         }
      }
   }

   @CommandExecutor(
      subCommand = {"del", "delete", "rm", "remove"}
   )
   @CommandExecutor$Argument({"name"})
   public String m16584(Optional<String> var1) {
      Class156 var5;
      if ((var5 = this.m16591(var1)) != null) {
         boolean var6 = true;
         return String.format("Deleted %s", var5.getName().getString());
      } else {
         boolean var10003 = true;
         return String.format("Could not find %s", var1.orElse("any FakePlayers to remove"));
      }
   }

   @Subscribe
   public void onSend(EventPacket$Send var1) {
      Packet var7;
      if ((var7 = var1.getPacket()) instanceof PlayerInteractEntityC2SPacket) {
         PlayerInteractEntityC2SPacket var5 = (PlayerInteractEntityC2SPacket)var7;
         Iterator var8 = f8635.iterator();

         while (var8.hasNext()) {
            if (((Class156)var8.next()).getId() == ((IMixinServerboundInteractPacket)var5).getEntityId()) {
               boolean var10003 = true;
               var1.setCancelled(true);
               return;
            }
         }
      }
   }

   @CommandExecutor(
      subCommand = {"list"}
   )
   public String m16586() {
      StringJoiner var3 = new StringJoiner(", ");
      Iterator var6;
      Iterator var10000 = var6 = f8635.iterator();

      while (var10000.hasNext()) {
         Class156 var5 = (Class156)var6.next();
         var10000 = var6;
         var3.add(var5.getName().getString());
      }

      return "FakePlayers: " + var3;
   }

   @CommandExecutor(
      subCommand = {"add"}
   )
   @CommandExecutor$Argument({"name"})
   public String m16589(Optional<String> var1) {
      boolean var10003 = true;
      return String.format("Created %s", this.m16581(var1).getName().getString());
   }

   @CommandExecutor(
      subCommand = {"clear"}
   )
   public String m12908() {
      f8635.removeIf(var0 -> {
         Globals.mc.world.removeEntity(var0.getId(), RemovalReason.DISCARDED);
         boolean var10002 = true;
         return true;
      });
      return "Cleared FakePlayers";
   }

   public Class156 m16591(Optional<String> var1) {
      if (f8635.isEmpty()) {
         return null;
      } else {
         Class156 var8 = null;
         if (var1.isPresent()) {
            Iterator var6 = f8635.iterator();

            while (var6.hasNext()) {
               Class156 var7;
               if ((var7 = (Class156)var6.next()).getName().getString().equalsIgnoreCase((String)var1.get())) {
                  var8 = var7;
                  break;
               }
            }
         } else {
            var8 = f8635.get(0);
         }

         if (var8 != null) {
            Globals.mc.world.removeEntity(var8.getId(), RemovalReason.DISCARDED);
            f8635.remove(var8);
         }

         return var8;
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }
}
