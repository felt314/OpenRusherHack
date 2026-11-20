package org.rusherhack.client.api.feature.module.impl.render;
import org.rusherhack.*;

import net.minecraft.client.option.Perspective;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.render.IMixinCamera;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.animation.Animation;
import org.rusherhack.core.animation.Easing;
import org.rusherhack.core.bind.key.IKey;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;
import org.rusherhack.command.bind;
import org.rusherhack.command.toggle;
public class FreeLook extends ToggleableModule {
   public float f2735;
   public BooleanSetting smooth;
   public EnumSetting<FreeLookCamera> camera;
   public EnumSetting<FreeLookUsage> usage;
   public Animation f2739;
   public Perspective f2740;
   public float f2741;
   public static long f2746;

   @Subscribe
   public void m6008(Event516 var1) {
      if (var1.m15868().equals(Globals.mc.player)) {
         boolean var10004 = true;
         var1.setCancelled(true);
         this.f2741 = (float)(this.f2741 + var1.m15870() * 0.15);
         this.f2735 = (float)(this.f2735 + var1.m15869() * 0.15);
         this.f2735 = MathUtils.clamp(this.f2735, -90.0F, 90.0F);
      }
   }

   @Subscribe
   public void m6009(Class417 var1) {
      ((IMixinCamera)var1.m10623()).invokeSetRotation(this.f2741, this.f2735);
   }

   @Override
   public void onDisable() {
      if (Globals.mc.player != null && this.f2740 != null) {
         Globals.mc.options.setPerspective(this.f2740);
      }
   }

   public FreeLook() {
      super(
         "FreeLook",
         "Ehhksw$}kq$pk$hkko$evkqj`$bvaah}$smplkqp$3\than7\tmj7\r your movin3\t$`mva7\ttion",
         ModuleCategory.RENDER
      );
      this.usage = new EnumSetting<>("Usage", FreeLookUsage.f9053);
      this.camera = new EnumSetting<>("Camera", FreeLookCamera.f5414);
      boolean var10006 = true;
      this.smooth = new BooleanSetting("Smooth", true).setVisibility(() -> {
         if (this.camera.getValue() == FreeLookCamera.f5414) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.f2740 = null;
      this.f2739 = new Animation(Easing.EASE_OUT, f2746);
      this.setNotifications(false);
      this.setHidden(true);
      Setting[] var10001 = new Setting[]{this.usage, null, null};
      boolean var10005 = true;
      var10001[1] = this.camera;
      var10001[2] = this.smooth;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void m6010(Class381 var1) {
      if ((Boolean)this.smooth.getValue()) {
         var1.m12328(this.f2739.get() * var1.m12327());
      }
   }

   @Override
   public void onEnable() {
      if (Globals.mc.player != null) {
         this.f2740 = Globals.mc.options.getPerspective();
         if (this.f2740.isFirstPerson()) {
            this.f2739.restart().play();
         }

         this.f2741 = Globals.mc.player.getYaw();
         this.f2735 = Globals.mc.player.getPitch();
         Globals.mc.options.setPerspective(this.camera.getValue().f5411);
      }
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
      int var10000 = Class253.m9155();
      Globals.mc.options.setPerspective(this.camera.getValue().f5411);
      int var4 = var10000;
      boolean var5 = this.usage.getValue().equals(FreeLookUsage.f9053);
      if (var4 != 0) {
         if (!var5) {
            return;
         }

         var5 = ((IKey)Class170.f3364.m7119().getBindRegistry().get(this)).isKeyDown();
      }

      if (!var5) {
         this.toggle();
      }
   }
}
