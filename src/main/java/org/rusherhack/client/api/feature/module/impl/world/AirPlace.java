package org.rusherhack.client.api.feature.module.impl.world;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.utils.ColorUtils;

public class AirPlace extends ToggleableModule {
   public BooleanSetting render;
   public BlockHitResult f5073;
   public ColorSetting color;
   public static long f5079;

   public AirPlace() {
      super("AirPlace", "PlacetZr|\u007fs{c0y~dJmidair", ModuleCategory.WORLD);
      boolean var10008 = true;
      this.render = new BooleanSetting("Render", true);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.WHITE, (int)f5079));
      boolean var10003 = true;
      this.render.addSubSettings(this.color);
      var10003 = true;
      this.registerSettings(this.render);
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
      if ((Boolean)this.render.getValue() && this.f5073 != null) {
         IRenderer3D var6 = var1.getRenderer();
         var6.begin(var1.getMatrixStack());
         BlockPos var10002 = this.f5073.getBlockPos();
         boolean var10006 = true;
         var6.drawBox(var10002, false, true, this.color.getValueRGB());
         var6.end();
      }
   }

   @Subscribe
   public void m10310(Event482 var1) {
      if (Globals.mc.crosshairTarget != null && Globals.mc.crosshairTarget.getType() != Type.MISS) {
         if (this.f5073 != null) {
            HitResult var13 = Globals.mc.crosshairTarget;
            BlockHitResult var12;
            if (Globals.mc.crosshairTarget instanceof BlockHitResult && (var12 = (BlockHitResult)var13).getBlockPos().equals(this.f5073.getBlockPos())) {
               return;
            }
         }

         this.f5073 = null;
      } else {
         float var5 = var1.m15044();
         Vec3d var6 = Globals.mc.player.getCameraPosVec(var5);
         Vec3d var8 = Globals.mc.player.getRotationVec(var5);
         Vec3d var9 = var6.add(
            var8.x * Globals.mc.player.getBlockInteractionRange(),
            var8.y * Globals.mc.player.getBlockInteractionRange(),
            var8.z * Globals.mc.player.getBlockInteractionRange()
         );
         BlockHitResult var10;
         if ((var10 = Class220.m8449(new RaycastContext(var9, var6, ShapeType.OUTLINE, FluidHandling.NONE, Globals.mc.player), var0 -> {
            return Globals.mc.world.getBlockState(var0).isAir();
         })) != null && var10.getType().equals(Type.BLOCK)) {
            Globals.mc.crosshairTarget = this.f5073 = var10;
         }
      }
   }
}
