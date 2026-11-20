package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.player.AutoEat;
import org.rusherhack.client.api.feature.module.impl.render.HoleESP;
public class HoleFiller extends ToggleableModule {
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public BooleanSetting onlyFillHolesWhileYouArenTMoving;
   public BooleanSetting raytrace;
   public BooleanSetting automaticallySwapsToObsidian;
   public int f4410;
   public NumberSetting<Integer> delay;
   public EnumSetting<HoleFillerMode> mode;
   public BooleanSetting render;
   public BooleanSetting fillDoubleHoles;
   public NumberSetting<Float> minimumDistanceToTargetHoles;
   public BlockHitResult f4416;
   public NumberSetting<Float> distance;
   public ColorSetting color;
   public NumberSetting<Float> range;
   public EnumSetting<HoleFillerRotationTimingMethodUsedForPlacements> rotationTimingMethodUsedForPlacements;
   public BlockPos f4421;
   public BooleanSetting swapServerSideOnly;
   public BooleanSetting strictdir;
   public NumberSetting<Float> speed;
   public List<BlockPos> f4425;
   public BooleanSetting onlyFillHolesNearPlayers;
   public BooleanSetting rotate;
   public Timer f4428;

   public void m9030(BlockHitResult var1, int var2) {
      if (RusherHackAPI.getRotationManager().isLookingAt(var1) && this.f4428.ticksPassed(this.delay.getValue())) {
         Hand var7 = var2 < 45 ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (this.f4410 == -1 || (Boolean)this.swapServerSideOnly.getValue()) {
            this.f4410 = Globals.mc.player.getInventory().selectedSlot;
         }

         if (var7 == Hand.MAIN_HAND) {
            Globals.mc.player.getInventory().selectedSlot = var2 - 36;
         }

         boolean var10004 = true;
         Util416.m13459(var1, var7, true);
         this.f4428.reset();
         if ((Boolean)this.swapServerSideOnly.getValue()) {
            Globals.mc.player.getInventory().selectedSlot = this.f4410;
            this.f4410 = -1;
         }
      }
   }

   public HoleFiller() {
      super(
         "HoleFiller",
         "Myxcamxeom``u,|`moi\u007f,n`cog\u007f,e6\u0004 holes",
         ModuleCategory.COMBAT
      );
      this.mode = new EnumSetting<>("Mode", HoleFillerMode.f3230);
      this.onlyFillHolesNearPlayers = new BooleanSetting("Smart", "Only fill holes near players", false);
      this.distance = new NumberSetting<>("Distance", 5.0F, 1.0F, 6.0F);
      boolean var10019 = true;
      this.onlyFillHolesWhileYouArenTMoving = new BooleanSetting("WhileIdle", "Only fill holes while you aren't moving", true);
      this.fillDoubleHoles = new BooleanSetting("Doubles", "Fill double holes", false);
      this.minimumDistanceToTargetHoles = new NumberSetting<>("SafeRange", "Minimum distance to target holes", 1.0F, 0.0F, 3.0F);
      this.range = new NumberSetting<>("Range", 4.5F, 1.0F, 6.0F);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      boolean var10013 = true;
      this.strictdir = new BooleanSetting("StrictDir", true);
      this.raytrace = new BooleanSetting("Raytrace", false);
      boolean var10011 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      this.rotationTimingMethodUsedForPlacements = new EnumSetting<>("Timing", "Rotation timing method used for placements", HoleFillerRotationTimingMethodUsedForPlacements.f7145);
      boolean var10009 = true;
      this.automaticallySwapsToObsidian = new BooleanSetting("Swap", "Automatically swaps to obsidian", true);
      boolean var10008 = true;
      this.swapServerSideOnly = new BooleanSetting("Silent", "Swap server side only", true);
      boolean var10007 = true;
      this.returnsToThePreviousItemYouWereHolding = new BooleanSetting("Return", "Returns to the previous item you were holding", true).setVisibility(() -> {
         if (!(Boolean)this.swapServerSideOnly.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10011 = true;
      this.render = new BooleanSetting("Render", true);
      ColorSetting var10006 = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 50));
      var10009 = true;
      this.color = var10006.setThemeSync(true);
      this.f4428 = new Timer();
      this.f4425 = new ArrayList<>();
      this.f4410 = -1;
      boolean var10003 = true;
      this.onlyFillHolesNearPlayers.addSubSettings(this.distance);
      BooleanSetting var10000 = this.rotate;
      Setting[] var10001 = new Setting[]{this.speed, null};
      boolean var10005 = true;
      var10001[1] = this.rotationTimingMethodUsedForPlacements;
      var10000.addSubSettings(var10001);
      var10000 = this.automaticallySwapsToObsidian;
      var10001 = new Setting[]{this.swapServerSideOnly, null};
      var10005 = true;
      var10001[1] = this.returnsToThePreviousItemYouWereHolding;
      var10000.addSubSettings(var10001);
      var10003 = true;
      this.render.addSubSettings(this.color);
      var10001 = new Setting[12];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.onlyFillHolesNearPlayers;
      var10001[2] = this.onlyFillHolesWhileYouArenTMoving;
      var10001[3] = this.fillDoubleHoles;
      var10001[4] = this.minimumDistanceToTargetHoles;
      var10001[5] = this.range;
      var10001[6] = this.delay;
      var10001[7] = this.strictdir;
      var10001[8] = this.raytrace;
      var10001[9] = this.rotate;
      var10001[10] = this.automaticallySwapsToObsidian;
      var10001[11] = this.render;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      HoleFiller var9 = this;
      if ((Boolean)this.render.getValue()) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         Iterator var8;
         Iterator var10 = var8 = this.f4425.iterator();

         while (true) {
            if (!var10.hasNext()) {
               var5.end();
               break;
            }

            BlockPos var6 = (BlockPos)var8.next();
            if (var4 == 0) {
               break;
            }

            var10 = var8;
            boolean var10003 = var6.equals(var9.f4421);
            boolean var10006 = true;
            var5.drawBox(var6, var10003, true, var9.color.getValueRGB());
         }
      }
   }

   @Override
   public void onEnable() {
      this.f4425.clear();
      this.f4421 = null;
      this.f4410 = -1;
   }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && (Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f4410 != -1) {
         Globals.mc.player.getInventory().selectedSlot = this.f4410;
      }
   }

   public void m9033(PlayerEntity var1, List<BlockPos> var2) {
        
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      HoleFiller var8 = this;
      boolean var10004 = true;
      int var7;
      if ((var7 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) < 36) {
         if (this.mode.getValue() == HoleFillerMode.f3228) {
            this.sendNotification(NotificationType.ERROR, "You have no obsidian in your hotbar!");
            this.toggle();
         }
      } else if (!(Boolean)this.automaticallySwapsToObsidian.getValue()
         && var7 != Globals.mc.player.getInventory().selectedSlot
         && var7 != 45) {
         if (this.mode.getValue() == HoleFillerMode.f3228) {
            this.sendNotification(NotificationType.ERROR, "You are not holding obsidian!");
            this.toggle();
         }
      } else {
         this.f4425 = this.m9035();
         this.f4416 = null;
         if (!AutoTotem.f3491.m7405() && !AutoSurround.f7212.m13915() && !AutoEat.f2905.m6292()) {
            if (!(Boolean)this.onlyFillHolesWhileYouArenTMoving.getValue() || !PlayerUtils.hasHorizontalInput()) {
               Iterator var5 = this.f4425.iterator();

               HoleFiller var10000;
               while (true) {
                  if (var5.hasNext()) {
                     BlockPos var6;
                     var8.f4416 = Util416.m13460(
                        var6 = (BlockPos)var5.next(), (Boolean)var8.strictdir.getValue(), (Boolean)var8.raytrace.getValue(), var8.range.getValue().floatValue()
                     );
                     if (var8.f4416 == null) {
                        continue;
                     }

                     var10000 = var8;
                     var8.f4421 = var6;
                     break;
                  }

                  var10000 = var8;
                  break;
               }

               if (var10000.f4416 == null) {
                  if ((Boolean)var8.returnsToThePreviousItemYouWereHolding.getValue() && var8.f4410 != -1) {
                     Globals.mc.player.getInventory().selectedSlot = var8.f4410;
                     var8.f4410 = -1;
                  }

                  if (var8.mode.getValue() == HoleFillerMode.f3228) {
                     var8.toggle();
                  }

                  var8.f4421 = null;
               } else {
                  if ((Boolean)var8.rotate.getValue()) {
                     RusherHackAPI.getRotationManager().updateRotation(var8.f4416, var8.speed.getValue());
                  }

                  if (var8.rotationTimingMethodUsedForPlacements.getValue() == HoleFillerRotationTimingMethodUsedForPlacements.f7145) {
                     var8.m9030(var8.f4416, var7);
                  }
               }
            }
         }
      }
   }

   public List<BlockPos> m9035() {
        return null;
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (this.rotationTimingMethodUsedForPlacements.getValue() == HoleFillerRotationTimingMethodUsedForPlacements.f7144 && this.f4416 != null) {
         boolean var10004 = true;
         int var4;
         if ((var4 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) < 36
            || !(Boolean)this.automaticallySwapsToObsidian.getValue()
               && var4 != Globals.mc.player.getInventory().selectedSlot
               && var4 != 45) {
            return;
         }

         this.m9030(this.f4416, var4);
      }
   }
}
