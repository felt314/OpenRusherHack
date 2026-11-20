package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import java.text.DecimalFormat;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.Speed;
public class EntitySpeed extends ToggleableModule {
   public NumberSetting<Float> speed;
   public DecimalFormat f4666;
   public BooleanSetting pauseWhenApproachingObstacle;
   public int f4668;
   public static long f4673;

   @Override
   public void onEnable() {
      this.f4668 = 0;
   }

   public EntitySpeed() {
      super("EntitySpeed", "Make entities go faster", ModuleCategory.MOVEMENT);
      this.speed = new NumberSetting<>("Speed", 2.0F, 0.0F, 10.0F);
      this.pauseWhenApproachingObstacle = new BooleanSetting("Strict", "Pause when approaching obstacle", false);
      this.f4666 = new DecimalFormat("#.##");
      this.f4668 = 0;
      Setting[] var10001 = new Setting[]{this.speed, null};
      boolean var10005 = true;
      var10001[1] = this.pauseWhenApproachingObstacle;
      this.registerSettings(var10001);
   }

   @Override
   public String getMetadata() {
      return this.f4666.format(this.speed.getValue());
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      int var4 = Class253.m9155();
      Entity var7;
      if ((var7 = Globals.mc.player.getControllingVehicle()) != null) {
         double[] var5 = PlayerUtils.getDirectionalSpeed(Globals.mc.player, Globals.mc.player.getYaw(), this.speed.getValue() / 5.0F);
         if (var4 != 0) {
            if ((Boolean)this.pauseWhenApproachingObstacle.getValue()) {
               Vec3d var10002 = var7.getPos().add(0.0, 0.4, 0.0);
               Vec3d var10003 = var7.getPos();
               double var10004 = var5[0] * 10.0;
               boolean var10009 = true;
               RaycastContext var6 = new RaycastContext(var10002, var10003.add(var10004, 0.4, var5[1] * 10.0), ShapeType.COLLIDER, FluidHandling.NONE, var7);
               if (Globals.mc.world.raycast(var6).getType() == Type.BLOCK) {
                  this.f4668 = (int)f4673;
               }

               if (this.f4668 > 0) {
                  boolean var10 = true;
                  this.f4668--;
                  return;
               }
            }

            double var9 = var5[0];
            boolean var10008 = true;
            var7.setVelocity(new Vec3d(var9, var7.getVelocity().y, var5[1]));
         }
      }
   }
}
