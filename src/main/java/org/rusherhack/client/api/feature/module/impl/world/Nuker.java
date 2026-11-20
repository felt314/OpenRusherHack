package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.world.IMixinClientLevel;
import org.rusherhack.client.api.events.client.EventQuit;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.client.input.EventMouse$Key;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.command.ModuleCommand;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.system.IRotationManager;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.Timer;

import org.rusherhack.command.NukerCommand;
import org.rusherhack.command.reset;
import org.rusherhack.client.api.feature.hud.impl.Direction;
import org.rusherhack.client.api.feature.hud.impl.Speed;
public class Nuker extends ToggleableModule {
   public BooleanSetting strict;
   public BooleanSetting rotate;
   public EnumSetting<NukerBreak> breakSetting;
   public Class200 f7640;
   public NumberSetting<Float> range;
   public EnumSetting<NukerMode> mode;
   public BlockPos f7643;
   public EnumSetting<NukerTargeting> targeting;
   public Block f7645;
   public EnumSetting<NukerClicktype> clicktype;
   public BooleanSetting flatten;
   public EnumSetting<NukerPriority> priority;
   public Timer f7649;
   public ColorSetting color;
   public BooleanSetting render;
   public NumberSetting<Float> speed;
   public NumberSetting<Integer> delay;

   public Nuker() {
      super("Nuker", "9\u0018\u000e\t\u000f\u0012\u0004]\u001fA\u0006ocks around you", ModuleCategory.WORLD);
      this.mode = new EnumSetting<>("Mode", NukerMode.f4351);
      this.targeting = new EnumSetting<>("Targeting", NukerTargeting.f6838);
      this.clicktype = new EnumSetting<>("ClickType", NukerClicktype.f3994);
      this.breakSetting = new EnumSetting<>("Break", NukerBreak.f5025).setVisibility(() -> {
         return this.clicktype.getValue().equals(NukerClicktype.f3994);
      });
      this.priority = new EnumSetting<>("Priority", NukerPriority.f4757);
      this.range = new NumberSetting<>("Range", 4.5F, 1.0F, 6.0F);
      boolean var10015 = true;
      this.delay = new NumberSetting<>("Delay", 1, 0, 20);
      boolean var10014 = true;
      this.strict = new BooleanSetting("Strict", true);
      this.flatten = new BooleanSetting("Flatten", false);
      boolean var10012 = true;
      this.rotate = new BooleanSetting("Rotate", true);
      this.speed = new NumberSetting<>("Speed", 180.0F, 20.0F, 180.0F).incremental(1.0);
      boolean var10010 = true;
      this.render = new BooleanSetting("Render", true);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.RED, 35));
      this.f7640 = new Class200(RusherHackAPI.getConfigPath().resolve("nuker").resolve("whitelist.json").toFile());
      this.f7649 = new Timer();
      Class170.f3364.m7112().m8473(this.f7640, this.f7640);
      boolean var10003 = true;
      this.rotate.addSubSettings(this.speed);
      var10003 = true;
      this.render.addSubSettings(this.color);
      Setting[] var10001 = new Setting[11];
      var10001[0] = this.mode;
      boolean var10005 = true;
      var10001[1] = this.targeting;
      var10001[2] = this.clicktype;
      var10001[3] = this.breakSetting;
      var10001[4] = this.priority;
      var10001[5] = this.range;
      var10001[6] = this.delay;
      var10001[7] = this.strict;
      var10001[8] = this.flatten;
      var10001[9] = this.rotate;
      var10001[10] = this.render;
      this.registerSettings(var10001);
   }

   @Override
   public ModuleCommand createCommand() {
      return new NukerCommand(this, this);
   }

   public void m14825(BlockHitResult var1) {
      int var4 = Class253.m9154();
      if (var4 == 0) {
         label17:
         switch (this.clicktype.getValue().ordinal()) {
            case 0:
               BlockPos var7 = var1.getBlockPos();
               net.minecraft.util.math.Direction var6 = var1.getSide();
               switch (this.breakSetting.getValue().ordinal()) {
                  case 0:
                     int var10 = ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).getDestroyDelay();
                     ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).setDestroyDelay(0);
                     Globals.mc.interactionManager.updateBlockBreakingProgress(var7, var6);
                     ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).setDestroyDelay(var10);
                     break label17;
                  case 1:
                     PendingUpdateManager var8 = ((IMixinClientLevel)Globals.mc.world).invokeGetBlockStatePredictionHandler();
                     int var9 = var8.incrementSequence().getSequence();
                     var8.close();
                     Globals.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, var7, var6, var9));
                     Globals.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, var7, var6, var9));
                     this.f7643 = null;
                  default:
                     break label17;
               }
            case 1:
               Globals.mc.interactionManager.interactBlock(Globals.mc.player, Hand.MAIN_HAND, var1);
               this.f7643 = null;
         }

         Globals.mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      Nuker var5 = this;
      switch (this.mode.getValue().ordinal()) {
         case 0:
            if (this.f7649.ticksPassed(this.delay.getValue())) {
               this.f7643 = this.m14832();
               this.f7649.reset();
            }

            if (this.f7643 == null || Globals.mc.world.isAir(this.f7643)) {
               Globals.mc.interactionManager.cancelBlockBreaking();
               return;
            }

            if ((Boolean)this.rotate.getValue()) {
               IRotationManager var9;
               (var9 = RusherHackAPI.getRotationManager()).updateRotation(this.f7643, this.speed.getValue());
               BlockHitResult var7;
               if ((var7 = var9.getLookRaycast(this.f7643)).getType() == Type.MISS) {
                  return;
               }

               this.m14825(var7);
               return;
            }

            this.m14825(new BlockHitResult(Vec3d.ofCenter(this.f7643), net.minecraft.util.math.Direction.UP, this.f7643, false));
            break;
         case 1:
            Iterator var8;
            Iterator var10000 = var8 = this.m7876().iterator();

            while (var10000.hasNext()) {
               BlockPos var6 = (BlockPos)var8.next();
               var10000 = var8;
               var5.m14825(new BlockHitResult(Vec3d.ofCenter(var6), net.minecraft.util.math.Direction.UP, var6, false));
            }
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9154();
      Nuker var5 = this;
      List var7 = this.m7876();
      if ((Boolean)this.render.getValue() && !var7.isEmpty()) {
         IRenderer3D var6 = var1.getRenderer();
         var6.begin(var1.getMatrixStack());
         Iterator var9;
         Iterator var10 = var9 = var7.iterator();

         while (true) {
            if (!var10.hasNext()) {
               var6.end();
               break;
            }

            BlockPos var8 = (BlockPos)var9.next();
            if (var4 != 0) {
               break;
            }

            var10 = var9;
            boolean var10003 = var8.equals(var5.f7643);
            boolean var10006 = true;
            var6.drawBox(var8, var10003, true, var5.color.getValueRGB());
         }
      }
   }

   @Subscribe
   public void onKey(EventMouse$Key var1) {
      if (var1.getButton() == 0) {
         int var9 = var1.getAction();
         boolean var10003 = true;
         if (var9 == 1 && this.targeting.getValue() == NukerTargeting.f6837) {
            HitResult var5 = Globals.mc.crosshairTarget;
            BlockHitResult var7;
            if (Globals.mc.crosshairTarget instanceof BlockHitResult && (var7 = (BlockHitResult)var5).getType() == Type.BLOCK) {
               this.f7645 = Globals.mc.world.getBlockState(var7.getBlockPos()).getBlock();
               RusherHackAPI.sendNotification(NotificationType.INFO, "Set nuker selective block to " + this.f7645.getName().getString());
            }

            return;
         }
      }
   }

   @Override
   public void onEnable() {
      this.f7643 = null;
      this.f7645 = null;
   }

   @Subscribe
   public void onQuit(EventQuit var1) {
      this.f7645 = null;
   }

   public List<BlockPos> m7876() {
        return null;
    }

   public BlockPos m14832() {
        return null;
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }
}
