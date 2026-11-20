package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.rusherhack.client.api.accessors.entity.IMixinAbstractArrow;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.ColorUtils;
public class Trajectories extends ToggleableModule {
   public BooleanSetting bowdraw;
   public BooleanSetting outline;
   public BooleanSetting fireballs;
   public NumberSetting<Integer> width;
   public Targets f5852;
   public BooleanSetting arrows;
   public BooleanSetting fill;
   public BooleanSetting prediction;
   public ColorSetting color;
   public BooleanSetting target;
   public BooleanSetting airborne;
   public BooleanSetting pearls;
   public BooleanSetting others;

   public Trajectories() {
      super("Trajectories", "Draws a line to where projectiles will land.", ModuleCategory.RENDER);
      boolean var10019 = true;
      this.prediction = new BooleanSetting("Prediction", true);
      boolean var10018 = true;
      this.others = new BooleanSetting("Others", true);
      Targets var10012 = new Targets();
      boolean var10017 = true;
      this.f5852 = var10012.m9192(true, false, false, false, false).m9198(false);
      boolean var10016 = true;
      this.airborne = new BooleanSetting("AirBorne", true);
      boolean var10015 = true;
      this.arrows = new BooleanSetting("Arrows", true);
      boolean var10014 = true;
      this.fireballs = new BooleanSetting("Fireballs", true);
      boolean var10013 = true;
      this.pearls = new BooleanSetting("Pearls", true);
      this.bowdraw = new BooleanSetting("BowDraw", false);
      boolean var10011 = true;
      this.target = new BooleanSetting("Target", true);
      boolean var10010 = true;
      this.fill = new BooleanSetting("Fill", true);
      boolean var10009 = true;
      this.outline = new BooleanSetting("Outline", true);
      Integer var10006 = 2;
      var10009 = true;
      this.width = new NumberSetting<>("Width", var10006, 1, 5);
      this.color = new ColorSetting("Color", ColorUtils.transparency(Color.CYAN, 64));
      BooleanSetting var10000 = this.airborne;
      Setting[] var10001 = new Setting[]{this.arrows, null, null};
      boolean var10005 = true;
      var10001[1] = this.fireballs;
      var10001[2] = this.pearls;
      var10000.addSubSettings(var10001);
      var10000 = this.target;
      var10001 = new Setting[]{this.fill, null};
      var10005 = true;
      var10001[1] = this.outline;
      var10000.addSubSettings(var10001);
      boolean var10003 = true;
      this.others.addSubSettings(this.f5852);
      var10001 = new Setting[7];
      var10001[0] = this.prediction;
      var10005 = true;
      var10001[1] = this.others;
      var10001[2] = this.airborne;
      var10001[3] = this.bowdraw;
      var10001[4] = this.target;
      var10001[5] = this.width;
      var10001[6] = this.color;
      this.registerSettings(var10001);
   }

   public boolean m11718(ProjectileEntity var1) {
      if (var1 instanceof ArrowEntity var5) {
         if ((Boolean)this.arrows.getValue() && !((IMixinAbstractArrow)var5).isInGround()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      } else if (var1 instanceof AbstractFireballEntity) {
         return (Boolean)this.fireballs.getValue();
      } else {
         return var1 instanceof EnderPearlEntity ? (Boolean)this.pearls.getValue() : false;
      }
   }

   @Subscribe
   public void onRender3D(EventRender3D var1) {
        
    }
}
