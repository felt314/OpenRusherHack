package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.render.IMixinGameRenderer;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class BlockOutline extends ToggleableModule {
   public BlockPos f9586;
   public Block f9587;
   public BooleanSetting depth;
   public NumberSetting<Float> thicknessOfTheOutline;
   public VoxelShape f9590;
   public VoxelShape f9591;
   public ColorSetting f9592;
   public BooleanSetting fillTheHighlightedBlockWithAColor;

   @Subscribe(
      priority = 400
   )
   public void onRender3D(EventRender3D var1) {
      int var4 = Class253.m9154();
      if (!Globals.mc.options.hudHidden) {
         if (this.f9590 != null && this.f9586 != null && this.f9587 != null) {
            IRenderer3D var5 = var1.getRenderer();
            boolean var7 = (Boolean)this.depth.getValue();
            BlockPos var8 = this.f9586;
            if (var4 == 0) {
               if (Globals.mc.gameRenderer.getCamera().getBlockPos().equals(var8)) {
                  return;
               }

               var5.begin(var1.getMatrixStack());
               var5.setLineWidth(this.thicknessOfTheOutline.getValue());
               var5.setDepthTest(var7);
               VoxelShape var10001 = this.f9590;
               double var10002 = var8.getX();
               double var10003 = var8.getY();
               double var10004 = var8.getZ();
               boolean var10005 = (Boolean)this.fillTheHighlightedBlockWithAColor.getValue();
               boolean var10008 = true;
               var5.drawShape(var10001, var10002, var10003, var10004, var10005, true, this.f9592.getValueRGB());
               var5.end();
            }
         }
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Override
   public void onDisable() {
      IMixinGameRenderer var10000 = (IMixinGameRenderer)Globals.mc.gameRenderer;
      boolean var10003 = true;
      var10000.setRenderBlockOutline(true);
   }

   public BlockOutline() {
      super("BlockOutline", "Highlights the block you are looking at", ModuleCategory.RENDER);
      this.thicknessOfTheOutline = new NumberSetting<>("Thickness", "Thickness of the outline", 1.5F, 0.1F, 5.0F).incremental(0.5);
      boolean var10018 = true;
      this.depth = new BooleanSetting("Depth", true);
      var10018 = true;
      this.fillTheHighlightedBlockWithAColor = new BooleanSetting("Fill", "Fill the highlighted block with a color", true);
      ColorSetting var10011 = new ColorSetting(
         "Color",
         new Color(
            0, 255, 255, 50
         )
      );
      boolean var10014 = true;
      this.f9592 = var10011.setThemeSync(true);
      this.f9590 = null;
      this.f9591 = null;
      this.f9586 = null;
      this.f9587 = null;
      Setting[] var10001 = new Setting[]{this.thicknessOfTheOutline, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.depth;
      var10001[2] = this.fillTheHighlightedBlockWithAColor;
      var10001[3] = this.f9592;
      this.registerSettings(var10001);
   }

   @Override
   public void onEnable() {
      ((IMixinGameRenderer)Globals.mc.gameRenderer).setRenderBlockOutline(false);
   }
}
