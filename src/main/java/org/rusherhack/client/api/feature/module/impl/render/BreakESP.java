package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.util.WeakHashMap;
import net.minecraft.entity.player.BlockBreakingInfo;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.client.IMixinMultiPlayerGameMode;
import org.rusherhack.client.api.accessors.render.IMixinLevelRenderer;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.module.impl.world.FastBreak;
import org.rusherhack.client.api.feature.module.impl.world.FastBreakMode;
public class BreakESP extends ToggleableModule {
   public ColorSetting startcolor;
   public BooleanSetting outlineTheBox;
   public BooleanSetting fillTheBox;
   public float f8052;
   public BooleanSetting staticSetting;
   public WeakHashMap<BlockPos, Float> f8054;
   public ColorSetting endcolor;
   public BooleanSetting hideHiddenSides;
   public BooleanSetting ignoreself;
   public EnumSetting<BreakESPMode> mode;
   public NumberSetting<Float> widthOfOutline;

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      this.f8054.entrySet().removeIf(var0 -> {
         return Globals.mc.world.isAir(var0.getKey());
      });
   }

   public static void m15472(BlockPos var0, int var1, int var2, double var3, boolean var5, boolean var6, boolean var7, BreakESPMode var8, IRenderer3D var9) {
        
    }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public BreakESP() {
      super(
         "BreakESP",
         "Highlights blocks that are being broken",
         ModuleCategory.RENDER
      );
      boolean var10013 = true;
      this.ignoreself = new BooleanSetting("IgnoreSelf", true);
      this.mode = new EnumSetting<>("Mode", BreakESPMode.f4126);
      this.startcolor = new ColorSetting("StartColor", ColorUtils.transparency(Color.CYAN, 50));
      this.endcolor = new ColorSetting("EndColor", ColorUtils.transparency(Color.CYAN, 50));
      boolean var10010 = true;
      this.fillTheBox = new BooleanSetting("Fill", "Fill the box", true);
      boolean var10009 = true;
      this.outlineTheBox = new BooleanSetting("Outline", "Outline the box", true);
      this.widthOfOutline = new NumberSetting<>("Width", "Width of outline", 2.0F, 0.1F, 3.0F);
      this.staticSetting = new BooleanSetting("Static", false).setVisibility(() -> {
         if (this.mode.getValue() != BreakESPMode.f4124) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.hideHiddenSides = new BooleanSetting("DepthTest", "Hide hidden sides", false);
      this.f8054 = new WeakHashMap<>();
      BooleanSetting var10000 = this.outlineTheBox;
      Setting[] var10001 = new Setting[]{this.widthOfOutline, null};
      boolean var10005 = true;
      var10001[1] = this.staticSetting;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[7];
      var10001[0] = this.ignoreself;
      var10005 = true;
      var10001[1] = this.mode;
      var10001[2] = this.startcolor;
      var10001[3] = this.endcolor;
      var10001[4] = this.fillTheBox;
      var10001[5] = this.outlineTheBox;
      var10001[6] = this.hideHiddenSides;
      this.registerSettings(var10001);
   }

   @Subscribe(
      stage = Stage.PRE
   )
   public void m15474(Class576 var1) {
      this.f8052 = ((IMixinMultiPlayerGameMode)Globals.mc.interactionManager).getDestroyProgress();
   }

   @Subscribe(
      priority = -401
   )
   public void onRender3D(EventRender3D var1) {
        
    }
}
