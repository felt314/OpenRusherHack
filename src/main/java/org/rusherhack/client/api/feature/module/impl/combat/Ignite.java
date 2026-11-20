package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.player.Reach;
public class Ignite extends ToggleableModule {
   public NumberSetting<Float> speed;
   public BooleanSetting swap;
   public NumberSetting<Float> reach;
   public Timer f8877;
   public Targets f8878;
   public NumberSetting<Float> delay;
   public BooleanSetting rotate;

   @Override
   public String getMetadata() {
      return String.valueOf(this.delay.getValue());
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      if (this.f8877.passed(this.delay.getValue() / 20.0F * 1000.0F)) {
         int var10;
         if ((var10 = InventoryUtils.findItemHotbar(Items.FLINT_AND_STEEL)) != -1) {
            Entity var8;
            if ((var8 = this.m17016()) == null) {
               return;
            }

            if (!Globals.mc.world.getBlockState(var8.getBlockPos()).isAir()) {
               return;
            }

            BlockPos var9 = var8.getBlockPos().down();
            if (Globals.mc.world.getBlockState(var9).isAir()) {
               return;
            }

            BlockHitResult var7;
            if ((Boolean)this.rotate.getValue()) {
               IRotationManager var6;
               (var6 = RusherHackAPI.getRotationManager()).updateRotation(var9, this.speed.getValue());
               if ((var7 = var6.getLookRaycast(var9)).getType() == Type.MISS) {
                  return;
               }
            } else {
               var7 = new BlockHitResult(Vec3d.ofCenter(var9), net.minecraft.util.math.Direction.UP, var9, false);
            }

            int var11 = Globals.mc.player.getInventory().selectedSlot;
            if (!Globals.mc.player.getMainHandStack().getItem().equals(Items.FLINT_AND_STEEL) && (Boolean)this.swap.getValue()) {
               Globals.mc.player.getInventory().selectedSlot = var10;
            }

            Globals.mc.interactionManager.interactBlock(Globals.mc.player, Hand.MAIN_HAND, var7);
            Globals.mc.player.swingHand(Hand.MAIN_HAND);
            if ((Boolean)this.swap.getValue()) {
               Globals.mc.player.getInventory().selectedSlot = var11;
            }

            this.f8877.reset();
         }
      }
   }

   public Ignite() {
      super("Ignite", "Light players up on fire with a flint and steel or fire charge", ModuleCategory.COMBAT);
      this.reach = new NumberSetting<>("Reach", 4.5F, 0.0F, 6.0F);
      this.delay = new NumberSetting<>("Delay", 5.0F, 0.0F, 20.0F);
      boolean var10011 = true;
      this.swap = new BooleanSetting("Swap", true);
      boolean var10010 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      Targets var10003 = new Targets();
      boolean var10007 = true;
      this.f8878 = var10003.m9193(true, false);
      this.f8877 = new Timer();
      boolean var3 = true;
      this.rotate.addSubSettings(this.speed);
      Setting[] var10001 = new Setting[]{this.reach, null, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.delay;
      var10001[2] = this.swap;
      var10001[3] = this.rotate;
      var10001[4] = this.f8878;
      this.registerSettings(var10001);
   }

   public Entity m17016() {
        return null;
    }
}
