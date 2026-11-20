package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.awt.Color;
import java.util.Iterator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
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
import org.rusherhack.client.api.utils.EntityUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class RangeCircle extends ToggleableModule {
   public BooleanSetting morph;
   public NumberSetting<Float> radius;
   public EnumSetting<RangeCircleMode> mode;
   public BooleanSetting others;
   public NumberSetting<Float> f6768;
   public NumberSetting<Float> thickness;
   public ColorSetting color;
   public EnumSetting<RangeCircleRainbowmode> rainbowmode;
   public static long f6776;

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }

   public RangeCircle() {
      super(
         "RangeCircle",
         "\f:)?;h)h+!:+$-h)<h1'=:h.--<h!&,!+)<!&/ha\u0013our hit range",
         ModuleCategory.RENDER
      );
      this.mode = new EnumSetting<>("Mode", RangeCircleMode.f7544);
      this.radius = new NumberSetting<>("Radius", 4.5F, 1.0F, 6.0F);
      this.thickness = new NumberSetting<>("Thickness", 2.0F, 1.0F, 5.0F);
      boolean var10010 = true;
      this.morph = new BooleanSetting("Morph", true);
      this.others = new BooleanSetting("Others", false);
      this.f6768 = new NumberSetting<>("Radius", 4.5F, 1.0F, 6.0F);
      ColorSetting var10002 = (ColorSetting)null;
      boolean var10005 = true;
      this.color = var10002.setRainbow(true);
      this.rainbowmode = new EnumSetting<>("RainbowMode", RangeCircleRainbowmode.f2944).setVisibility(this.color::isRainbow);
      boolean var10003 = true;
      this.others.addSubSettings(this.f6768);
      Setting[] var10001 = new Setting[(int)f6776];
      var10001[0] = this.radius;
      var10005 = true;
      var10001[1] = this.thickness;
      var10001[2] = this.morph;
      var10001[3] = this.others;
      var10001[4] = this.color;
      var10001[5] = this.rainbowmode;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }

   public void m13014(PlayerEntity var1, float var2, float var3, IRenderer3D var4) {
        
    }
}
