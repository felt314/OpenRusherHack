package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;

public class Avoid extends ToggleableModule {
   public BooleanSetting cactus;
   public EnumSetting<AvoidAvoidLookingIntoTheEyesOfEndermen> avoidLookingIntoTheEyesOfEndermen;
   public boolean f6963;
   public BooleanSetting fire;
   public static Avoid f6965;
   public BooleanSetting web;
   public BooleanSetting unloaded;

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      int var4 = Class253.m9154();
      Avoid var5 = this;
      switch (this.avoidLookingIntoTheEyesOfEndermen.getValue().ordinal()) {
         case 1:
            Iterator var13 = Globals.mc.world.getEntities().iterator();

            while (var13.hasNext()) {
               Entity var14;
               if ((var14 = (Entity)var13.next()) instanceof EndermanEntity && var5.m13413(Globals.mc.player, (EndermanEntity)var14)) {
                  var1.setPitch(90.0F);
                  if (var4 == 0) {
                     return;
                  }
               }
            }
            break;
         case 2:
            EndermanEntity var12 = null;
            double var6 = 200.0;

            for (Entity var9 : Globals.mc.world.getEntities()) {
               if (var4 != 0) {
                  return;
               }

               double var10;
               if (Globals.mc.player.canSee(var9)
                  && var9 instanceof EndermanEntity
                  && !((EndermanEntity)var9).isAttacking()
                  && (var10 = Globals.mc.player.distanceTo(var9)) < var6) {
                  var12 = (EndermanEntity)var9;
                  var6 = var10;
                  if (var4 != 0) {
                     break;
                  }
               }
            }

            if (var12 != null) {
               float[] var15;
               float[] var10001 = var15 = RotationUtils.getRotations(var12.getEyePos());
               var1.setYaw(var15[0]);
               var1.setPitch(var10001[1]);
               return;
            }
      }
   }

   public Avoid() {
      super("Avoid", "*\u001d\u0004\u0002\u000fK\u000f\n\u0005\f^\u000frous stuff", ModuleCategory.WORLD);
      boolean var10015 = true;
      this.fire = new BooleanSetting("Fire", true);
      boolean var10014 = true;
      this.cactus = new BooleanSetting("Cactus", true);
      boolean var10013 = true;
      this.web = new BooleanSetting("Web", true);
      this.avoidLookingIntoTheEyesOfEndermen = new EnumSetting<>("Endermen", "Avoid looking into the eyes of endermen", AvoidAvoidLookingIntoTheEyesOfEndermen.f8900);
      boolean var10011 = true;
      this.unloaded = new BooleanSetting("Unloaded", true);
      this.f6963 = false;
      f6965 = this;
      Setting[] var10001 = new Setting[]{this.fire, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.cactus;
      var10001[2] = this.web;
      var10001[3] = this.avoidLookingIntoTheEyesOfEndermen;
      var10001[4] = this.unloaded;
      this.registerSettings(var10001);
   }

   @Subscribe(
      priority = -999
   )
   public void onMove(EventMove var1) {
      int var4 = Class253.m9154();
      this.f6963 = false;
      if ((Boolean)this.unloaded.getValue()) {
         BlockPos var6 = BlockPos.ofFloored(Globals.mc.player.getPos().add(var1.getMotion()));
         if (Globals.mc.world.getWorldChunk(var6).isEmpty()) {
            Globals.mc.player.setVelocity(Vec3d.ZERO);
            if (var4 == 0) {
               if (Globals.mc.player.getVehicle() != null) {
                  Globals.mc.player.getVehicle().setVelocity(Vec3d.ZERO);
               }

               var1.setMotion(Vec3d.ZERO);
            }

            this.f6963 = true;
         }
      }
   }

   @Subscribe
   public void m13412(Event492 var1) {
        
    }

   public boolean m13413(PlayerEntity var1, EndermanEntity var2) {
      if (((ItemStack)Globals.mc.player.getInventory().armor.get(3)).getItem().equals(Blocks.CARVED_PUMPKIN.asItem())) {
         return false;
      } else {
         Vec3d var7 = var1.getRotationVector().normalize();
         Vec3d var10000 = new Vec3d(
            var2.getX() - var1.getX(),
            var2.getBoundingBox().minY + var2.getStandingEyeHeight() - (var1.getY() + var1.getStandingEyeHeight()),
            var2.getZ() - var1.getZ()
         );
         double var8 = var10000.length();
         Vec3d var6 = var10000.normalize();
         if (var7.dotProduct(var6) > 1.0 - 0.025 / var8 && var1.canSee(var2)) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      }
   }
}
