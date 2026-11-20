package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.text.DecimalFormat;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class LagDetector extends ToggleableModule {
   public BooleanSetting notification;
   public DecimalFormat f2293;
   public NumberSetting<Float> delay;
   public boolean f2295;
   public BooleanSetting clientside;
   public BooleanSetting f2297;

   public void m5140(boolean var1, String var2) {
      int var5 = Class253.m9155();
      if (var5 != 0) {
         if ((Boolean)this.clientside.getValue()) {
            NotificationType var10001;
            String var10002;
            if (var1) {
               var10001 = NotificationType.WARNING;
               var10002 = var2;
            } else {
               var10001 = NotificationType.INFO;
               var10002 = var2;
            }

            this.sendNotification(var10001, var10002, this.notification.hashCode());
            return;
         }

         Globals.mc.player.networkHandler.sendChatMessage(var2);
      }
   }

   public LagDetector() {
      super(
         "LagDetector",
         "\u000e,70*-~?~3;--?9;~70*Jchat/ont\u0014-=,;;0~)6;0*Jthet\u0014-;,(;,~7-*Jlagging",
         ModuleCategory.CHAT
      );
      this.delay = new NumberSetting<>("Delay", 1.5F, 0.0F, 5.0F);
      boolean var10014 = true;
      this.f2297 = new BooleanSetting("Render", "Draws text on your screen when the server is lagging", true);
      this.notification = new BooleanSetting("Notification", false);
      boolean var10011 = true;
      this.clientside = new BooleanSetting("Clientside", true);
      this.f2293 = new DecimalFormat("#.#");
      this.f2295 = false;
      Setting[] var10001 = new Setting[]{this.delay, null, null, null};
      boolean var10005 = true;
      var10001[1] = this.f2297;
      var10001[2] = this.notification;
      var10001[3] = this.clientside;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onRender2D(EventRender2D var1) {
        
    }
}
