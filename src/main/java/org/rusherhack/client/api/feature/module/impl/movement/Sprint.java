package org.rusherhack.client.api.feature.module.impl.movement;
import org.rusherhack.*;

import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.entity.IMixinLocalPlayer;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
public class Sprint extends ToggleableModule {
   public BooleanSetting letsYouSprintInAllDirections;
   public static Sprint f8435;
   public int f8436;
   public BooleanSetting water;
   public BooleanSetting autojump;
   public BooleanSetting bypassStricterAnticheats;

   @Subscribe
   public void m16170(Event239 var1) {
      if (this.m16175()) {
         if ((Boolean)this.letsYouSprintInAllDirections.getValue() && PlayerUtils.hasHorizontalInput() && var1.m8717().equals(Enum495.f8035)) {
            var1.m8716(this.m16171());
         }
      }
   }

   public float m16171() {
      float var4 = Globals.mc.player.input.movementForward;
      int var10000 = Class253.m9154();
      float var5 = Globals.mc.player.input.movementSideways;
      float var7 = Globals.mc.player.getYaw();
      int var3 = var10000;
      float var10 = var4;
      if (var3 == 0) {
         if (var4 <= 0.0F) {
            float var12;
            var10000 = (var12 = var4 - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            if (var3 == 0) {
               if (var10000 < 0) {
                  float var9;
                  return var9 = var7 - 180.0F;
               }

               float var13;
               var10000 = (var13 = var5 - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var3 == 0) {
               if (var10000 > 0) {
                  float var8;
                  return var8 = var7 - 90.0F;
               }

               if (var3 != 0) {
                  return var5;
               }

               float var14;
               var10000 = (var14 = var5 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var10000 < 0) {
               var7 += 90.0F;
            }
         }

         var10 = var7;
      }

      return var10;
   }

   @Subscribe
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (!this.m16175()) {
         this.f8436 = 0;
      } else {
         if (((IMixinLocalPlayer)Globals.mc.player).invokeCanStartSprinting()
            && !(Boolean)this.bypassStricterAnticheats.getValue()
            && (Boolean)this.letsYouSprintInAllDirections.getValue()) {
            boolean var10003 = true;
            Globals.mc.player.setSprinting(true);
         }

         if (PlayerUtils.hasHorizontalInput()) {
            if ((Boolean)this.letsYouSprintInAllDirections.getValue() && (Boolean)this.bypassStricterAnticheats.getValue()) {
               var1.setYaw(this.m16171());
            }

            boolean var10004 = true;
            this.f8436++;
         } else {
            this.f8436 = 0;
         }
      }
   }

   public Sprint() {
      super("Sprint", "Automatically sprint", ModuleCategory.MOVEMENT);
      this.water = new BooleanSetting("Water", false);
      this.autojump = new BooleanSetting("AutoJump", false);
      this.letsYouSprintInAllDirections = new BooleanSetting("Omnidirectional", "Lets you sprint in all directions", false);
      boolean var10011 = true;
      this.bypassStricterAnticheats = new BooleanSetting("Strict", "Bypass stricter anticheats", true);
      this.f8436 = 0;
      f8435 = this;
      boolean var10003 = true;
      this.letsYouSprintInAllDirections.addSubSettings(this.bypassStricterAnticheats);
      Setting[] var10001 = new Setting[]{this.water, null, null};
      boolean var10005 = true;
      var10001[1] = this.autojump;
      var10001[2] = this.letsYouSprintInAllDirections;
      this.registerSettings(var10001);
   }

   public boolean m16173() {
      if (!this.m16175()) {
         return false;
      } else {
         label25: {
            if (PlayerUtils.hasHorizontalInput()) {
               if (!(Boolean)this.bypassStricterAnticheats.getValue()) {
                  break label25;
               }

               boolean var10003 = true;
               if (this.f8436 > 1) {
                  break label25;
               }
            }

            boolean var10002 = true;
            return false;
         }

         boolean var3 = true;
         return true;
      }
   }

   @Subscribe
   public void m16174(Class499 var1) {
      if (this.m16175()) {
         if (var1.m8984().equals(Globals.mc.options.sprintKey)
            && (!(Boolean)this.letsYouSprintInAllDirections.getValue() || (Boolean)this.bypassStricterAnticheats.getValue())) {
            boolean var10003 = true;
            var1.m15527(true);
         }

         if (var1.m8984().equals(Globals.mc.options.jumpKey)
            && (Boolean)this.autojump.getValue()
            && Globals.mc.player.isOnGround()
            && (PlayerUtils.hasHorizontalInput() || AutoWalk.f7979.m15318())
            && this.f8436 > 2) {
            boolean var6 = true;
            var1.m15527(true);
         }
      }
   }

   public boolean m16175() {
      if (Globals.mc.player == null) {
         return false;
      } else if (Class170.f3364.m7108().m10866()
         || Globals.mc.player.isFallFlying()
         || Safewalk.m359()
         || !(Boolean)this.water.getValue() && (Globals.mc.player.isTouchingWater() || Globals.mc.player.isInLava())) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }
}
