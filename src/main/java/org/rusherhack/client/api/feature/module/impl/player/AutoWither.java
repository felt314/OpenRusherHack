package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.util.function.Predicate;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.block.WitherSkullBlock;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.Pair;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.world.EventEntity$Add;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.reset;
import org.rusherhack.command.send;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
import org.rusherhack.client.api.feature.module.impl.combat.AutoSurround;
import org.rusherhack.client.api.feature.module.impl.combat.AutoTotem;
public class AutoWither extends ToggleableModule {
   public NumberSetting<Integer> delay;
   public Timer f7128;
   public BooleanSetting silentswap;
   public boolean f7130;
   public NumberSetting<Float> speed;
   public BooleanSetting rotate;
   public BlockPos f7133;
   public BooleanSetting strictdir;

   public BlockHitResult m13795(BlockPos var1) {
      return Util416.m13460(var1, (Boolean)this.strictdir.getValue(), (Boolean)this.strictdir.getValue(), Globals.mc.player.getBlockInteractionRange());
   }

   @Subscribe
   public void onAdd(EventEntity$Add var1) {
      if (var1.getEntity() instanceof WitherEntity) {
         this.toggle();
      }
   }

   public AutoWither() {
      super("AutoWither", ",\u0018\u0019\u0002\u0000\f\u0019\u0004\u000e\f\u0001\u0001D\u0013 spawn a wither", ModuleCategory.PLAYER);
      this.delay = new NumberSetting<>("Delay", 0, 0, 20);
      boolean var10011 = true;
      this.silentswap = new BooleanSetting("SilentSwap", true);
      boolean var10010 = true;
      this.strictdir = new BooleanSetting("StrictDir", true);
      boolean var10009 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      this.f7128 = new Timer();
      boolean var10003 = true;
      this.rotate.addSubSettings(this.speed);
      Setting[] var10001 = new Setting[]{this.delay, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.silentswap;
      var10001[2] = this.strictdir;
      var10001[3] = this.rotate;
      this.registerSettings(var10001);
      this.setNotifications(false);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Nullable
   public Pair<BlockHitResult, Boolean> m13801() {
      if (this.f7133 == null) {
         this.f7133 = ((BlockHitResult)Globals.mc.crosshairTarget).getBlockPos().up();
         boolean var10001;
         if (Globals.mc.player.getHorizontalFacing() != net.minecraft.util.math.Direction.EAST
            && Globals.mc.player.getHorizontalFacing() != net.minecraft.util.math.Direction.WEST) {
            var10001 = true;
            boolean var10003 = true;
         } else {
            var10001 = false;
         }

         this.f7130 = var10001;
      }

      BlockHitResult var8;
      if ((var8 = this.m13795(this.f7133)) != null) {
         return new Pair(var8, false);
      } else {
         boolean var10004 = true;
         BlockPos var5;
         BlockHitResult var9;
         if ((var9 = this.m13795(var5 = this.f7133.add(0, 1, 0))) != null) {
            return new Pair(var9, false);
         } else {
            BlockPos var10000;
            if (this.f7130) {
               boolean var10002 = true;
               boolean var10005 = true;
               var10000 = var5.add(1, 0, 0);
            } else {
               boolean var21 = true;
               var10000 = var5.add(0, 0, 1);
            }

            BlockPos var6 = var10000;
            BlockHitResult var10;
            if ((var10 = this.m13795(var6)) != null) {
               return new Pair(var10, false);
            } else {
               BlockPos var7 = this.f7130 ? var5.add(-1, 0, 0) : var5.add(0, 0, -1);
               BlockHitResult var11;
               if ((var11 = this.m13795(var7)) != null) {
                  return new Pair(var11, false);
               } else if (Util179.m7325(this.f7133) && Util179.m7325(var5) && Util179.m7325(var6) && Util179.m7325(var7)) {
                  boolean var20 = true;
                  var5 = var5.add(0, 1, 0);
                  BlockHitResult var12;
                  if ((var12 = this.m13795(var5)) != null) {
                     boolean var26 = true;
                     return new Pair(var12, true);
                  } else {
                     if (this.f7130) {
                        boolean var19 = true;
                        boolean var22 = true;
                        var10000 = var5.add(1, 0, 0);
                     } else {
                        boolean var23 = true;
                        var10000 = var5.add(0, 0, 1);
                     }

                     var6 = var10000;
                     BlockHitResult var13;
                     if ((var13 = this.m13795(var6)) != null) {
                        boolean var25 = true;
                        return new Pair(var13, true);
                     } else {
                        var5 = this.f7130 ? var5.add(-1, 0, 0) : var5.add(0, 0, -1);
                        BlockHitResult var14;
                        if ((var14 = this.m13795(var5)) != null) {
                           boolean var24 = true;
                           return new Pair(var14, true);
                        } else {
                           return null;
                        }
                     }
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   @Override
   public void onEnable() {
      this.f7133 = null;
   }
}
