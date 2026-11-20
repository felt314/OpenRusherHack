package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.client.api.feature.hud.impl.Direction;
public class Borders extends ToggleableModule {
   public ColorSetting colorOfTheBorder;
   public BooleanSetting outlineTheBorder;
   public BooleanSetting currentMapArtBorder;
   public BooleanSetting outline;
   public EnumSetting<BordersRenderPosition> renderPosition;
   public BooleanSetting currentRegionBorder;
   public BooleanSetting currentChunkBorder;
   public ColorSetting f137;
   public ColorSetting color;
   public BooleanSetting fill;
   public BooleanSetting f140;
   public BooleanSetting fillTheBorder;
   public BooleanSetting f142;

   @Override
   public String getMetadata() {
      return this.renderPosition.getDisplayValue();
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   public Borders() {
      super("Borders", "Shows chunk and region borders", ModuleCategory.RENDER);
      this.renderPosition = new EnumSetting<>("YLevel", "Render position", BordersRenderPosition.f3280);
      boolean var10019 = true;
      this.currentChunkBorder = new BooleanSetting("Chunk", "Current chunk border", true);
      this.colorOfTheBorder = new ColorSetting(
         "Color", "Color of the border", ColorUtils.transparency(Color.RED, 64)
      );
      this.fillTheBorder = new BooleanSetting("Fill", "Fill the border", false);
      boolean var10016 = true;
      this.outlineTheBorder = new BooleanSetting("Outline", "Outline the border", true);
      boolean var10015 = true;
      this.currentMapArtBorder = new BooleanSetting("MapArt", "Current map art border", true);
      this.color = new ColorSetting("Color", "Color of the border", ColorUtils.transparency(Color.YELLOW, 64));
      this.fill = new BooleanSetting("Fill", "Fill the border", false);
      boolean var10012 = true;
      this.outline = new BooleanSetting("Outline", "Outline the border", true);
      boolean var10011 = true;
      this.currentRegionBorder = new BooleanSetting("Region", "Current region border", true);
      this.f137 = new ColorSetting("Color", "Color of the border", ColorUtils.transparency(Color.BLUE, 64));
      this.f142 = new BooleanSetting("Fill", "Fill the border", false);
      boolean var10008 = true;
      this.f140 = new BooleanSetting("Outline", "Outline the border", true);
      BooleanSetting var10000 = this.currentChunkBorder;
      Setting[] var10001 = new Setting[]{this.colorOfTheBorder, null, null};
      boolean var10005 = true;
      var10001[1] = this.fillTheBorder;
      var10001[2] = this.outline;
      var10000.addSubSettings(var10001);
      var10000 = this.currentMapArtBorder;
      var10001 = new Setting[]{this.color, null, null};
      var10005 = true;
      var10001[1] = this.fill;
      var10001[2] = this.outlineTheBorder;
      var10000.addSubSettings(var10001);
      var10000 = this.currentRegionBorder;
      var10001 = new Setting[]{this.f137, null, null};
      var10005 = true;
      var10001[1] = this.f142;
      var10001[2] = this.f140;
      var10000.addSubSettings(var10001);
      var10001 = new Setting[]{this.renderPosition, null, null, null};
      var10005 = true;
      var10001[1] = this.currentChunkBorder;
      var10001[2] = this.currentMapArtBorder;
      var10001[3] = this.currentRegionBorder;
      this.registerSettings(var10001);
   }

   

   public static MatchException m285(MatchException var0) {
      return var0;
   }
}
