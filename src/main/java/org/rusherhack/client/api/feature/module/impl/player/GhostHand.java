package org.rusherhack.client.api.feature.module.impl.player;
import org.rusherhack.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;

public class GhostHand extends ToggleableModule {
   public BooleanSetting render;
   public ColorSetting selectedcolor;
   public ColorSetting color;
   public List<BlockEntity> f6977;

   public List<BlockEntity> m13431() {
        return null;
    }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.f6977 = this.m13431();
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9155();
      GhostHand var11 = this;
      if ((Boolean)this.render.getValue()) {
         IRenderer3D var5 = var1.getRenderer();
         var5.begin(var1.getMatrixStack());
         Iterator var10;
         Iterator var12 = var10 = this.f6977.iterator();

         while (true) {
            if (!var12.hasNext()) {
               var5.end();
               break;
            }

            BlockEntity var6 = (BlockEntity)var10.next();
            if (var4 == 0) {
               break;
            }

            HitResult var8 = Globals.mc.crosshairTarget;
            boolean var13;
            if (Globals.mc.crosshairTarget instanceof BlockHitResult && ((BlockHitResult)var8).getBlockPos().equals(var6.getPos())) {
               var13 = true;
               boolean var14 = true;
            } else {
               var13 = false;
               boolean var10002 = true;
            }

            boolean var7 = var13;
            BlockPos var10001 = var6.getPos();
            boolean var10005 = true;
            var5.drawBox(var10001, true, true, var7 ? var11.selectedcolor.getValueRGB() : var11.color.getValueRGB());
            var12 = var10;
         }
      }
   }

   @Subscribe
   public void m13435(Event482 var1) {
      int var12 = Class253.m9155();
      float var7 = var1.m15044();
      Vec3d var5 = Globals.mc.player.getCameraPosVec(var7);
      Vec3d var8 = Globals.mc.player.getRotationVec(var7);
      int var4 = var12;
      Vec3d var9 = var5.add(
         var8.x * Globals.mc.player.getBlockInteractionRange(),
         var8.y * Globals.mc.player.getBlockInteractionRange(),
         var8.z * Globals.mc.player.getBlockInteractionRange()
      );
      BlockHitResult var10;
      BlockHitResult var13 = var10 = Class220.m8449(new RaycastContext(var5, var9, ShapeType.OUTLINE, FluidHandling.NONE, Globals.mc.player), var1x -> {
         int var10000 = Class253.m9154();
         Iterator var6 = this.f6977.iterator();
         int var4x = var10000;

         while (var6.hasNext()) {
            boolean var7x = ((BlockEntity)var6.next()).getPos().equals(var1x);

            while (var7x) {
               var7x = true;
               boolean var10002 = true;
               if (var4x == 0) {
                  return true;
               }
            }
         }

         return false;
      });
      if (var4 != 0) {
         if (var13 == null) {
            return;
         }

         var13 = var10;
      }

      if (var13.getType().equals(Type.BLOCK)) {
         Globals.mc.crosshairTarget = var10;
      }
   }

   public GhostHand() {
      super("GhostHand", "Allows you to interact with blocks through walls", ModuleCategory.PLAYER);
      boolean var10010 = true;
      this.render = new BooleanSetting("Render", true);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.RED, 0.2F));
      this.selectedcolor = new ColorSetting("SelectedColor", ColorUtils.transparency(Color.GREEN, 0.2F));
      this.f6977 = new ArrayList<>();
      BooleanSetting var10000 = this.render;
      Setting[] var10001 = new Setting[]{this.color, null};
      boolean var10005 = true;
      var10001[1] = this.selectedcolor;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.registerSettings(this.render);
   }
}
