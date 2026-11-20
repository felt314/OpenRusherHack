package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.notification.NotificationType;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;
public class ArmorAlert extends ToggleableModule {
   public NumberSetting<Integer> threshold;
   public BooleanSetting render;
   public Set<PlayerEntity> f7772;
   public BooleanSetting clientside;
   public BooleanSetting notification;
   public BooleanSetting self;
   public BooleanSetting others;
   public BooleanSetting nolongerlowAlert;
   public BooleanSetting friends;

   public boolean m15070(PlayerEntity var1) {
        return false;
    }

   public ArmorAlert() {
      super("ArmorAlert", "Alerts you and other players when your or someone's armor durability is low", ModuleCategory.CHAT);
      boolean var10015 = true;
      this.render = new BooleanSetting("Render", true);
      boolean var10014 = true;
      this.notification = new BooleanSetting("Notification", true);
      boolean var10013 = true;
      this.clientside = new BooleanSetting("Clientside", true);
      boolean var10012 = true;
      this.self = new BooleanSetting("Self", true);
      boolean var10011 = true;
      this.others = new BooleanSetting("Others", true);
      boolean var10010 = true;
      this.friends = new BooleanSetting("Friends", true);
      this.nolongerlowAlert = new BooleanSetting("NoLongerLow Alert", false);
      Integer var10006 = 50;
      boolean var10009 = true;
      this.threshold = new NumberSetting<>("Threshold", var10006, 1, 1000);
      this.f7772 = Collections.newSetFromMap(new WeakHashMap<>());
      boolean var10003 = true;
      this.notification.addSubSettings(this.clientside);
      Setting[] var10001 = new Setting[7];
      var10001[0] = this.render;
      boolean var10005 = true;
      var10001[1] = this.notification;
      var10001[2] = this.self;
      var10001[3] = this.others;
      var10001[4] = this.friends;
      var10001[5] = this.nolongerlowAlert;
      var10001[6] = this.threshold;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onUpdate(EventUpdate var1) {
        
    }

   @Subscribe
   public void onRender2D(EventRender2D var1) {
      int var4 = Class253.m9155();
      if ((Boolean)this.render.getValue()) {
         IFontRenderer var9 = RusherHackAPI.fonts().getHudFontRenderer();
         var9.begin(var1.getMatrixStack());
         byte var8 = 0;
         Iterator var7;
         Iterator var10000 = var7 = this.f7772.iterator();

         while (true) {
            if (!var10000.hasNext()) {
               var9.end();
               break;
            }

            PlayerEntity var6 = (PlayerEntity)var7.next();
            String var10001 = Formatting.RED + var6.getName().getString() + " has low durability";
            double var10002 = (float)(
               var1.getGraphics().getScaledWindowWidth() / 2 - var9.getStringWidth(var6.getName().getString() + " has low durability") / 2.0
            );
            double var10003 = 20.0F + var8;
            var8 += 10;
            boolean var10006 = true;
            var9.drawString(var10001, var10002, var10003, -1);
            if (var4 == 0) {
               break;
            }

            var10000 = var7;
         }
      }
   }
}
