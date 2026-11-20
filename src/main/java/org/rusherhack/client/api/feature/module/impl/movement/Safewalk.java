package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.player.EventMove;
import org.rusherhack.client.api.events.player.EventMove$Mount;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
public class Safewalk extends ToggleableModule {
   public static Safewalk f4227;
   public BooleanSetting f4228;
   public BooleanSetting sneak;
   public BooleanSetting slabs;
   public boolean f4231;
   public boolean f4232;
   public BooleanSetting s2b2t;

   public void m8731(Entity var1, EventMove var2, boolean var3) {
      Entity var16 = var1;
      Safewalk var17 = this;
      if (var1.isOnGround() && !(var2.getY() > 0.0)) {
         double var7 = this.slabs.getValue() ? -0.5 : -1.0;
         double var9 = var2.getX();
         double var11 = var2.getZ();
         double var13 = 0.05;
         if (var1.equals(Globals.mc.player)) {
            this.f4232 = this.m8737(Globals.mc.player, var9, var7, var11);
            this.f4231 = var3;
            if (!this.f4232 && var3) {
               Vec3d var19 = Globals.mc.player.getPos();
               Vec3d var10001 = new Vec3d(var9, 0.0, var11);
               boolean var10005 = true;
               Vec3d var18 = Class006.m305(var19, var10001, Globals.mc.player, 1);
               Vec3d var15 = Class006.m305(Globals.mc.player.getPos(), new Vec3d(var9, 0.0, var11), Globals.mc.player, 4)
                  .add(0.0, Globals.mc.player.getHeight(), 0.0);
               this.f4232 = Globals.mc.world.isSpaceEmpty(var1, new Box(var18, var15).offset(0.0, var7, 0.0));
            }
         }

         double var20 = var9;

         while (var20 != 0.0 && var17.m8737(var16, var9, var7, 0.0)) {
            var20 = var9 < var13 && var9 >= -var13 ? (var9 = 0.0) : (var9 > 0.0 ? (var9 -= var13) : (var9 += var13));
         }

         var20 = var11;

         while (var20 != 0.0 && var17.m8737(var16, 0.0, var7, var11)) {
            var20 = var11 < var13 && var11 >= -var13 ? (var11 = 0.0) : (var11 > 0.0 ? (var11 -= var13) : (var11 += var13));
         }

         var20 = var9;

         while (var20 != 0.0 && var11 != 0.0 && var17.m8737(var16, var9, var7, var11)) {
            if (var9 < var13 && var9 >= -var13) {
               var9 = 0.0;
               var20 = var11;
            } else if (var9 > 0.0) {
               var9 -= var13;
               var20 = var11;
            } else {
               var9 += var13;
               var20 = var11;
            }

            if (var20 < var13 && var11 >= -var13) {
               var11 = 0.0;
               var20 = var9;
            } else if (var11 > 0.0) {
               var11 -= var13;
               var20 = var9;
            } else {
               var11 += var13;
               var20 = var9;
            }
         }

         var2.setX(var9);
         var2.setZ(var11);
      }
   }

   @Subscribe(
      priority = -69
   )
   public void onMove(EventMove var1) {
      this.f4232 = false;
      this.m8731(Globals.mc.player, var1, (Boolean)this.s2b2t.getValue());
   }

   public static boolean m359() {
      if (f4227.f4231 && f4227.f4232) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void onDisable() {
      this.f4232 = this.f4231 = false;
   }

   @Subscribe
   public void m8734(Class499 var1) {
      if (this.f4231 && this.f4232 && var1.m8984().equals(Globals.mc.options.sprintKey)) {
         var1.m15527(false);
      }
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void m8735(Event301 var1) {
      if ((Boolean)this.sneak.getValue() && this.f4232) {
         var1.m10147().sneaking = true;
      }
   }

   @Subscribe(
      priority = -69
   )
   public void onMount(EventMove$Mount var1) {
      if ((Boolean)this.f4228.getValue()) {
         this.m8731(var1.getEntity(), var1, false);
      }
   }

   public boolean m8737(Entity var1, double var2, double var4, double var6) {
      return Globals.mc.world.isSpaceEmpty(var1, var1.getBoundingBox().offset(var2, var4, var6));
   }

   public Safewalk() {
      super("Safewalk", "Prevents you from walking off the edge of blocks", ModuleCategory.MOVEMENT);
      boolean var10011 = true;
      this.slabs = new BooleanSetting("Slabs", true);
      var10011 = true;
      this.f4228 = new BooleanSetting("Riding", "Prevents the entity you are riding from walking off blocks", true);
      this.sneak = new BooleanSetting("Sneak", false);
      boolean var10008 = true;
      this.s2b2t = new BooleanSetting("2b2t", true);
      f4227 = this;
      boolean var10003 = true;
      this.sneak.addSubSettings(this.s2b2t);
      Setting[] var10001 = new Setting[]{this.slabs, null, null};
      boolean var10005 = true;
      var10001[1] = this.f4228;
      var10001[2] = this.sneak;
      this.registerSettings(var10001);
   }
}
