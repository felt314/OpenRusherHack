package org.rusherhack.client.api.feature.module.impl.combat;
import org.rusherhack.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.entity.IMixinEntity;
import org.rusherhack.client.api.accessors.world.IMixinClientLevel;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.player.EventPlayerUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.world.EventEntity$Remove;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.IServerState;
import org.rusherhack.client.api.utils.InventoryUtils;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.client.api.utils.RotationUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.clear;
import org.rusherhack.command.reset;
import org.rusherhack.command.toggle;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class AutoSurround extends ToggleableModule {
   public BooleanSetting centersThePlayer;
   public SortedSet<BlockPos> f7195;
   public BooleanSetting instantlyPlaceSurroundBlocks;
   public ColorSetting color;
   public int f7198;
   public NumberSetting<Integer> movedelay;
   public NumberSetting<Integer> placedelay;
   public BooleanSetting raytrace;
   public EnumSetting<AutoSurroundAnticity> anticity;
   public NumberSetting<Float> widthOfOutline;
   public Vec3d f7204;
   public BooleanSetting strict;
   public BooleanSetting hideHiddenSides;
   public BooleanSetting strictdir;
   public Timer f7208;
   public Timer f7209;
   public int f7210;
   public BooleanSetting widenSurroundIfNecessary;
   public static AutoSurround f7212;
   public EnumSetting<AutoSurroundRotationTimingMethodUsedForPlacements> rotationTimingMethodUsedForPlacements;
   public BooleanSetting disableondeath;
   public BooleanSetting returnsToThePreviousItemYouWereHolding;
   public BooleanSetting swapServerSideOnly;
   public EnumSetting<AutoSurroundMode> mode;
   public NumberSetting<Float> speed;
   public BlockHitResult f7219;
   public BlockPos f7220;
   public BooleanSetting grimBypassForInstantRotations;
   public BooleanSetting automaticallySwapsToObsidian;
   public BooleanSetting rotate;
   public BooleanSetting antifaceplace;
   public BooleanSetting sync;
   public BooleanSetting render;

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && (Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f7198 != -1) {
         Globals.mc.player.getInventory().selectedSlot = this.f7198;
      }
   }

   public boolean m13911() {
      if ((Boolean)this.strict.getValue() && Criticals.m7812()) {
         return false;
      } else {
         boolean var10002 = true;
         return true;
      }
   }

   public AutoSurround() {
      super("AutoSurround", "Automatically surrounds your feet with obsidian", ModuleCategory.COMBAT);
      this.mode = new EnumSetting<>("Mode", AutoSurroundMode.f7529).onChange(var1x -> {
         if (Globals.mc.player != null) {
            this.f7204 = Globals.mc.player.getPos();
         }
      });
      this.movedelay = new NumberSetting<>("MoveDelay", 10, 0, 20)
         .setVisibility(() -> {
            if (this.mode.getValue() == AutoSurroundMode.f7529) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      this.centersThePlayer = new BooleanSetting("Center", "Centers the player", false);
      boolean var10007 = true;
      this.strict = new BooleanSetting("Strict", true);
      var10007 = true;
      this.widenSurroundIfNecessary = new BooleanSetting("Dynamic", "Widen surround if necessary", true).setVisibility(() -> {
         if ((Boolean)this.centersThePlayer.getValue() && !(Boolean)this.strict.getValue()) {
            return false;
         } else {
            boolean var10002 = true;
            return true;
         }
      });
      this.instantlyPlaceSurroundBlocks = new BooleanSetting("Instant", "Instantly place surround blocks", false);
      this.grimBypassForInstantRotations = new BooleanSetting("Grim", "Grim bypass for instant rotations", false);
      this.sync = new BooleanSetting("Sync", false);
      this.placedelay = new NumberSetting<>("PlaceDelay", 0, 0, 20).setVisibility(() -> {
         if (!(Boolean)this.instantlyPlaceSurroundBlocks.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10008 = true;
      this.strictdir = new BooleanSetting("StrictDir", true);
      this.raytrace = new BooleanSetting("Raytrace", false);
      var10007 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0).setVisibility(() -> {
         if (!(Boolean)this.instantlyPlaceSurroundBlocks.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.rotationTimingMethodUsedForPlacements = new EnumSetting<>("Timing", "Rotation timing method used for placements", AutoSurroundRotationTimingMethodUsedForPlacements.f4897)
         .setVisibility(() -> {
            if (!(Boolean)this.instantlyPlaceSurroundBlocks.getValue()) {
               boolean var10002 = true;
               return true;
            } else {
               return false;
            }
         });
      var10008 = true;
      this.automaticallySwapsToObsidian = new BooleanSetting("Swap", "Automatically swaps to obsidian", true);
      var10008 = true;
      this.swapServerSideOnly = new BooleanSetting("Silent", "Swap server side only", true);
      var10007 = true;
      this.returnsToThePreviousItemYouWereHolding = new BooleanSetting("Return", "Returns to the previous item you were holding", true).setVisibility(() -> {
         if (!(Boolean)this.swapServerSideOnly.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.anticity = new EnumSetting<>("AntiCity", AutoSurroundAnticity.f8166).setVisibility(() -> {
         if (this.mode.getValue() != AutoSurroundMode.f7530) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.antifaceplace = new BooleanSetting("AntiFacePlace", false).setVisibility(() -> {
         if (this.mode.getValue() != AutoSurroundMode.f7530 && this.anticity.getValue() != AutoSurroundAnticity.f8166) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10018 = true;
      this.disableondeath = new BooleanSetting("DisableOnDeath", true);
      var10018 = true;
      this.render = new BooleanSetting("Render", true);
      ColorSetting var10012 = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 50));
      boolean var10015 = true;
      this.color = var10012.setThemeSync(true);
      this.widthOfOutline = new NumberSetting<>("Width", "Width of outline", 2.0F, 0.1F, 3.0F);
      this.hideHiddenSides = new BooleanSetting("DepthTest", "Hide hidden sides", false);
      this.f7208 = new Timer();
      this.f7209 = new Timer();
      this.f7195 = new TreeSet<>();
      this.f7198 = -1;
      this.f7204 = Vec3d.ZERO;
      f7212 = this;
      boolean var10004 = true;
      this.centersThePlayer.setHidden(true);
      boolean var10005 = true;
      this.widenSurroundIfNecessary.setHidden(true);
      boolean var10003 = true;
      this.centersThePlayer.addSubSettings(this.strict);
      BooleanSetting var10000 = this.instantlyPlaceSurroundBlocks;
      Setting[] var10001 = new Setting[]{this.grimBypassForInstantRotations, null};
      var10005 = true;
      var10001[1] = this.sync;
      var10000.addSubSettings(var10001);
      var10000 = this.rotate;
      var10001 = new Setting[]{this.speed, null};
      var10005 = true;
      var10001[1] = this.rotationTimingMethodUsedForPlacements;
      var10000.addSubSettings(var10001);
      var10000 = this.automaticallySwapsToObsidian;
      var10001 = new Setting[]{this.swapServerSideOnly, null};
      var10005 = true;
      var10001[1] = this.returnsToThePreviousItemYouWereHolding;
      var10000.addSubSettings(var10001);
      var10000 = this.render;
      var10001 = new Setting[]{this.color, null, null};
      var10005 = true;
      var10001[1] = this.widthOfOutline;
      var10001[2] = this.hideHiddenSides;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[14];
      var10001[0] = this.mode;
      var10005 = true;
      var10001[1] = this.movedelay;
      var10001[2] = this.centersThePlayer;
      var10001[3] = this.widenSurroundIfNecessary;
      var10001[4] = this.instantlyPlaceSurroundBlocks;
      var10001[5] = this.placedelay;
      var10001[6] = this.strictdir;
      var10001[7] = this.raytrace;
      var10001[8] = this.rotate;
      var10001[9] = this.automaticallySwapsToObsidian;
      var10001[10] = this.anticity;
      var10001[11] = this.antifaceplace;
      var10001[12] = this.disableondeath;
      var10001[13] = this.render;
      this.registerSettings(var10001);
   }

   public boolean m13915() {
      if (this.isToggled() && this.f7220 != null) {
         boolean var10002 = true;
         return true;
      } else {
         return false;
      }
   }

   public SortedSet<BlockPos> m13916() {
        return null;
    }

   public void m13918(BlockHitResult var1, int var2) {
      if ((Boolean)this.instantlyPlaceSurroundBlocks.getValue()
         || RusherHackAPI.getRotationManager().isLookingAt(var1) && this.f7208.ticksPassed(this.placedelay.getValue())) {
         Hand var7 = var2 < 45 ? Hand.MAIN_HAND : Hand.OFF_HAND;
         if (this.f7198 == -1 || (Boolean)this.swapServerSideOnly.getValue()) {
            this.f7198 = Globals.mc.player.getInventory().selectedSlot;
         }

         if (var7 == Hand.MAIN_HAND) {
            Globals.mc.player.getInventory().selectedSlot = var2 - 36;
         }

         if ((Boolean)this.rotate.getValue() && (Boolean)this.instantlyPlaceSurroundBlocks.getValue()) {
            this.m13923(var1, var2);
         }

         boolean var10004 = true;
         AutoSurround var8;
         boolean var10003;
         if ((Boolean)this.instantlyPlaceSurroundBlocks.getValue() && !(Boolean)this.sync.getValue()) {
            var10003 = false;
            var8 = this;
         } else {
            var10003 = true;
            boolean var10005 = true;
            var8 = this;
         }

         Util416.m13462(var1, var7, true, var10003, var8.f7210);
         this.f7208.reset();
         if ((Boolean)this.swapServerSideOnly.getValue()) {
            Globals.mc.player.getInventory().selectedSlot = this.f7198;
            this.f7198 = -1;
         }
      }
   }

   public void m13919() {
        
    }

   @Subscribe(
      stage = Stage.POST
   )
   public void m13921(Class007 var1) {
      if ((Boolean)this.instantlyPlaceSurroundBlocks.getValue() && var1.m340().isAir()) {
         BlockPos var5 = var1.m15855();
         if (this.f7195.contains(var5)) {
            this.m13929(var5);
         }
      }
   }

   public BlockHitResult m13922(BlockPos var1) {
      return Util416.m13460(var1, (Boolean)this.strictdir.getValue(), (Boolean)this.raytrace.getValue(), Globals.mc.player.getBlockInteractionRange());
   }

   public void m13923(BlockHitResult var1, int var2) {
        
    }

   @Subscribe(
      stage = Stage.POST
   )
   public void onRemove(EventEntity$Remove var1) {
      AutoSurround var5 = this;
      if ((Boolean)this.instantlyPlaceSurroundBlocks.getValue()) {
         Entity var8;
         EndCrystalEntity var11;
         if ((var8 = var1.getEntity()) instanceof EndCrystalEntity && !(Util177.m7288((var11 = (EndCrystalEntity)var8).getBlockPos()) > 3.0F)) {
            BlockPos var9 = var11.getBlockPos();
            if (this.f7195.contains(var9)) {
               this.m13929(var9);
            } else {
               boolean var10003 = true;
               BlockPos[] var12;
               int var10 = (var12 = Util418.m13511(var9, true)).length;

               int var7;
               for (int var10000 = var7 = 0; var10000 < var10; var10000 = ++var7) {
                  BlockPos var6 = var12[var7];
                  if (var5.f7195.contains(var6) && !Util179.m7325(var6)) {
                     var5.m13929(var6);
                  }
               }
            }
         }
      }
   }

   @Subscribe(
      stage = Stage.POST
   )
   public void onPlayerUpdate(EventPlayerUpdate var1) {
      if (!(Boolean)this.instantlyPlaceSurroundBlocks.getValue() && this.rotationTimingMethodUsedForPlacements.getValue() == AutoSurroundRotationTimingMethodUsedForPlacements.f4899 && this.f7219 != null
         )
       {
         boolean var10004 = true;
         int var4;
         if ((var4 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) < 36
            || !(Boolean)this.automaticallySwapsToObsidian.getValue()
               && var4 != Globals.mc.player.getInventory().selectedSlot
               && var4 != 45) {
            return;
         }

         this.m13918(this.f7219, var4);
      }

      if (this.m11871() || this.f7220 == null) {
         if ((Boolean)this.returnsToThePreviousItemYouWereHolding.getValue() && this.f7198 != -1) {
            Globals.mc.player.getInventory().selectedSlot = this.f7198;
            this.f7198 = -1;
         }

         if (this.mode.getValue() == AutoSurroundMode.f7530) {
            this.toggle();
         }
      }
   }

   @Override
   public void onEnable() {
      this.f7195.clear();
      this.f7220 = null;
      this.f7219 = null;
      this.f7198 = -1;
      if (Globals.mc.player != null) {
         this.f7204 = Globals.mc.player.getPos();
      }
   }

   public void m13929(BlockPos var1) {
      boolean var10004 = true;
      int var7;
      if ((var7 = InventoryUtils.findItem(Items.OBSIDIAN, true, true)) >= 36
         && (
            (Boolean)this.automaticallySwapsToObsidian.getValue()
               || var7 == Globals.mc.player.getInventory().selectedSlot
               || var7 == 45
         )) {
         BlockHitResult var6;
         if ((var6 = this.m13922(var1)) != null) {
            this.f7220 = var1;
            this.f7219 = var6;
            if ((Boolean)this.rotate.getValue()) {
               this.m13923(this.f7219, var7);
            }

            this.m13918(this.f7219, var7);
         }
      }
   }

   public boolean m11871() {
      int var10000 = Class253.m9155();
      Iterator var6 = this.f7195.iterator();
      int var3 = var10000;

      label39:
      while (true) {
         Iterator var7 = var6;

         label37:
         while (true) {
            boolean var8 = var7.hasNext();

            while (true) {
               if (!var8) {
                  var8 = true;
                  boolean var10002 = true;
                  break;
               }

               BlockPos var5;
               var8 = Util179.m7325(var5 = (BlockPos)var6.next());
               if (var3 == 0) {
                  break;
               }

               if (var8) {
                  continue label39;
               }

               var8 = Util179.m7327(var5);
               if (var3 != 0) {
                  if (var3 != 0) {
                     if (!var8) {
                        var7 = var6;
                        continue label37;
                     }

                     var8 = false;
                  }

                  return var8;
               }
            }

            return var8;
         }
      }
   }

   public boolean m13932(BlockPos var1, boolean var2) {
        return false;
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      AutoSurround var9 = this;
      if ((Boolean)this.render.getValue()) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         var5.setLineWidth(this.widthOfOutline.getValue());
         var5.setDepthTest((Boolean)this.hideHiddenSides.getValue());
         Iterator var8;
         Iterator var10 = var8 = this.f7195.iterator();

         while (var10.hasNext()) {
            BlockPos var6;
            if ((Util179.m7325(var6 = (BlockPos)var8.next()) || !Util179.m7327(var6)) && !var6.equals(var9.f7220)) {
               var10 = var8;
            } else {
               boolean var10002 = var6.equals(var9.f7220);
               boolean var10005 = true;
               var5.drawBox(var6, var10002, true, var9.color.getValueRGB());
               var10 = var8;
            }
         }

         var5.end();
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }
}
