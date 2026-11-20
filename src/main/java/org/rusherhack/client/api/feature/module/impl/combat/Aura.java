package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.util.Hand;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.hud.impl.TPS;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.player.Reach;
public class Aura extends ToggleableModule {
   public BooleanSetting pausebaritone;
   public BooleanSetting onlyAttackWhileHoldingAWeapon;
   public NumberSetting<Float> speed;
   public Entity f8360;
   public static Aura f8361;
   public BooleanSetting syncAttackSpeedWithServerTps;
   public Targets f8363;
   public BooleanSetting pausewhileeating;
   public EnumSetting<AuraPriority> priority;
   public BooleanSetting rotate;
   public BooleanSetting disableondeath;
   public BooleanSetting automaticallyBlockWithYourShield;
   public BooleanSetting armorstands;
   public Timer f8370;
   public EnumSetting<AuraTimingMethodUsedForAttacking> timingMethodUsedForAttacking;
   public NumberSetting<Float> delay;
   public BooleanSetting hitdelay;
   public NumberSetting<Float> reach;
   public BooleanSetting preventsTheGameFromCancellingYourSprint;
   public boolean f8376;

   public static Entity m16059() {
      return f8361.isToggled() ? f8361.f8360 : null;
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Override
   public void onDisable() {
      this.f8360 = null;
   }

   public void m16061() {
      if (this.f8376) {
         if (!(Boolean)this.rotate.getValue() || RusherHackAPI.getRotationManager().isLookingAt(this.f8360)) {
            boolean var5 = Globals.mc.player.isSprinting();
            Globals.mc.interactionManager.attackEntity(Globals.mc.player, this.f8360);
            Globals.mc.player.swingHand(Hand.MAIN_HAND);
            if ((Boolean)this.preventsTheGameFromCancellingYourSprint.getValue() && !Criticals.f8827.m16933()) {
               Globals.mc.player.setSprinting(var5);
            }

            this.f8370.reset();
         }
      }
   }

   public Aura() {
        super(
         "Aura",
         "Automatically attack entities nearby",
         ModuleCategory.COMBAT
      );
      int var10000 = Class253.m9154();

      this.reach = new NumberSetting<>("Reach", 3.0F, 0.0F, 6.0F);
      boolean var10026 = true;
      this.hitdelay = new BooleanSetting("HitDelay", true);
      this.delay = new NumberSetting<>("Delay", 1.0F, 0.1F, 1.0F);
      boolean var10025 = true;
      this.syncAttackSpeedWithServerTps = new BooleanSetting("TPS Sync", "Sync attack speed with server tps", true);
      boolean var10024 = true;
      this.automaticallyBlockWithYourShield = new BooleanSetting("AutoBlock", "Automatically block with your shield", true);
      boolean var10023 = true;
      this.preventsTheGameFromCancellingYourSprint = new BooleanSetting("KeepSprint", "Prevents the game from cancelling your sprint", true);
      this.onlyAttackWhileHoldingAWeapon = new BooleanSetting("WeaponCheck", "Only attack while holding a weapon", false);
      boolean var10020 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      this.timingMethodUsedForAttacking = new EnumSetting<>("Timing", "Timing method used for attacking", AuraTimingMethodUsedForAttacking.f4808);
      this.armorstands = new BooleanSetting("ArmorStands", false);
      Class405 var10011 = new Class405(this);
      boolean var10015 = true;
      Targets var12 = var10011.m9193(true, false);
      boolean var10014 = true;
      this.f8363 = var12.m9199(true);
      this.priority = new EnumSetting<>("Priority", AuraPriority.f186);
      var10014 = true;
      this.pausewhileeating = new BooleanSetting("PauseWhileEating", true);
      boolean var10013 = true;
      this.disableondeath = new BooleanSetting("DisableOnDeath", true);
      this.pausebaritone = new BooleanSetting("PauseBaritone", false);
      this.f8370 = new Timer();
      this.f8360 = null;
      f8361 = this;
      BooleanSetting var10001 = this.hitdelay;
      Setting[] var10002 = new Setting[]{this.delay, null};
      boolean var10006 = true;
      var10002[1] = this.syncAttackSpeedWithServerTps;
      var10001.addSubSettings(var10002);
      var10001 = this.rotate;
      var10002 = new Setting[]{this.speed, null};
      var10006 = true;
      var10002[1] = this.timingMethodUsedForAttacking;
      var10001.addSubSettings(var10002);
      int var3 = var10000;
      Targets var4 = this.f8363;
      Setting[] var7 = new Setting[]{this.armorstands, null};
      boolean var10005 = true;
      var7[1] = this.priority;
      var4.addSubSettings(var7);
      Aura var5 = this;
      Setting[] var8 = new Setting[9];
      var8[0] = this.reach;
      var10005 = true;
      var8[1] = this.hitdelay;
      var8[2] = this.automaticallyBlockWithYourShield;
      var8[3] = this.preventsTheGameFromCancellingYourSprint;
      var8[4] = this.onlyAttackWhileHoldingAWeapon;
      var8[5] = this.rotate;
      var8[6] = this.f8363;
      var8[7] = this.pausewhileeating;
      var8[8] = this.disableondeath;
      if (var3 == 0) {
         this.registerSettings(var8);
         if (!Class170.f3353) {
            return;
         }

         var5 = this;
         boolean var10003 = true;
         var8 = new Setting[]{this.pausebaritone};
      }

      var5.registerSettings(var8);
   }

   @Override
   public String getMetadata() {
      return this.f8360 != null ? this.f8360.getName().getString() : "";
   }

   @Subscribe(
      stage = Stage.POST,
      priority = -100
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (this.f8360 != null) {
         if (this.timingMethodUsedForAttacking.getValue() == AuraTimingMethodUsedForAttacking.f4809) {
            this.m16061();
         }

         if ((Boolean)this.automaticallyBlockWithYourShield.getValue()
            && Globals.mc.player.getOffHandStack().isOf(Items.SHIELD)
            && !Globals.mc.player.isUsingItem()
            && !Globals.mc.player.getItemCooldownManager().isCoolingDown(Items.SHIELD)) {
            Globals.mc.interactionManager.interactItem(Globals.mc.player, Hand.OFF_HAND);
         }
      }
   }

   public Entity m16063() {
      Aura var4 = this;
      Entity var10 = null;
      float var11 = 999.0F;
      int var3 = Class253.m9154();
      float var8 = 999.0F;
      float var7 = 999.0F;
      boolean var6 = false;
      Iterator var9 = WorldUtils.getEntities().iterator();

      label94:
      while (true) {
         Iterator var10000 = var9;

         while (var10000.hasNext()) {
            Entity var14;
            if ((var14 = (Entity)var9.next()) == null) {
               continue label94;
            }

            if (!var4.m16064(var14)) {
               var10000 = var9;
            } else {
               boolean var5 = false;
               if (var14 instanceof PlayerEntity var12 && var4.f8363.m9204()) {
                  var5 = RusherHackAPI.getRelationManager().isEnemy(var12.getName().getString());
               }

               if (!var5 && var6) {
                  var10000 = var9;
               } else {
                  float var15;
                  if (!((var15 = Class220.m8445(var14)) > var4.reach.getValue())) {
                     switch (var4.priority.getValue().ordinal()) {
                        case 0:
                           float var17;
                           if (!((var17 = Util177.m7293(var14.getBoundingBox().getCenter(), false)) < var11) && (!var5 || var6)) {
                              continue label94;
                           }

                           var11 = var17;
                           var6 = var5;
                           var10 = var14;
                           if (var3 == 0) {
                              continue label94;
                           }
                        case 1:
                           if (var15 < var7 || var5 && !var6) {
                              var7 = var15;
                              var6 = var5;
                              var10 = var14;
                           }
                           continue label94;
                        case 2:
                           LivingEntity var16;
                           float var13 = var14 instanceof LivingEntity ? (var16 = (LivingEntity)var14).getHealth() + var16.getAbsorptionAmount() : 1.0F;
                           if (!(var13 < var8) && (!var5 || var6)) {
                              continue label94;
                           }

                           var8 = var13;
                           var6 = var5;
                           var10 = var14;
                        default:
                           if (var3 != 0) {
                              return var10;
                           }
                           continue label94;
                     }
                  }

                  var10000 = var9;
               }
            }
         }

         return var10;
      }
   }

   public boolean m16064(Entity var1) {
      if (!this.f8363.m7993(var1) || var1 instanceof ProjectileEntity && !(var1 instanceof ShulkerBulletEntity) && !(var1 instanceof FireballEntity)) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   @Subscribe
   public void m16065(Event547 var1) {
      if ((Boolean)this.pausebaritone.getValue() && this.f8360 != null) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }
}
