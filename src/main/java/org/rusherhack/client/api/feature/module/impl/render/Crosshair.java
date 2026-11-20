package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.option.AttackIndicator;
import net.minecraft.client.render.Camera;
import org.joml.Matrix4fStack;
import org.rusherhack.client.Freecam;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.PlayerUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.peek;
public class Crosshair extends ToggleableModule {
   public BooleanSetting outline;
   public NumberSetting<Float> voffset;
   public NumberSetting<Float> width;
   public NumberSetting<Float> length;
   public boolean f8810;
   public NumberSetting<Float> dynamicgap;
   public NumberSetting<Float> hoffset;
   public BooleanSetting expandsTheCrosshairWhileMoving;
   public NumberSetting<Float> gap;
   public EnumSetting<CrosshairMode> mode;
   public ColorSetting color;
   public int f8817;

   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }

   public Crosshair() {
    }

   @Subscribe(
      priority = -1
   )
   public void onUpdate(EventUpdate var1) {
      if (Globals.mc.player.isRiding() || Globals.mc.player.handSwinging || Freecam.f1230.isToggled()) {
         this.f8810 = true;
         this.f8817 = 0;
      }

      if (this.f8810) {
         boolean var10004 = true;
         this.f8817++;
      }

      if (this.f8817 >= 6 && this.f8810) {
         this.f8810 = false;
         this.f8817 = 0;
      }
   }

   @Subscribe
   public void m16905(Event565 var1) {
      if (var1.m17383().equals(Enum201.f3773) && Globals.mc.options.getPerspective().isFirstPerson() && !Globals.mc.getDebugHud().shouldShowDebugHud()) {
         boolean var10003 = true;
         var1.setCancelled(true);
      }
   }

   @Override
   public String getMetadata() {
      return this.mode.getDisplayValue();
   }
}
