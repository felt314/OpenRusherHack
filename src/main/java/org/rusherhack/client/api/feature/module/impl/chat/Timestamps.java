package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.events.client.chat.EventAddChat;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.client.api.feature.hud.impl.Time;
public class Timestamps extends ToggleableModule {
   public ColorSetting timeColor;
   public BooleanSetting space;
   public BooleanSetting amPm;
   public BooleanSetting s24hr;
   public BooleanSetting milliseconds;
   public ColorSetting punctuationColor;
   public static Timestamps f172;
   public StringSetting hhMmSs;
   public BooleanSetting advanced;
   public EnumSetting<TimestampsPunctuation> punctuation;
   public BooleanSetting seconds;

   public SimpleDateFormat m354() {
      if ((Boolean)this.advanced.getValue()) {
         return new SimpleDateFormat((String)this.hhMmSs.getValue());
      } else {
         String var5 = this.s24hr.getValue() ? "H:mm" : "h:mm";
         if ((Boolean)this.seconds.getValue()) {
            var5 = var5 + ":ss";
         }

         if ((Boolean)this.milliseconds.getValue()) {
            var5 = var5 + ".SSS";
         }

         if ((Boolean)this.amPm.getValue() && !(Boolean)this.s24hr.getValue()) {
            var5 = var5 + " a";
         }

         return new SimpleDateFormat(var5);
      }
   }

   public MutableText m358() {
        return null;
    }

   public Timestamps() {
      super("Timestamps", "Adds time stamps to chat messages", ModuleCategory.CHAT);
      this.timeColor = new ColorSetting("Time Color", new Color(Formatting.GRAY.getColorValue(), false)).setAlphaAllowed(false);
      this.advanced = new BooleanSetting("Advanced", false);
      this.hhMmSs = new StringSetting("Format", "HH:mm:ss").setNameVisible(false);
      this.s24hr = new BooleanSetting("24hr", false).setVisibility(() -> {
         if (!(Boolean)this.advanced.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      boolean var10005 = true;
      this.seconds = new BooleanSetting("Seconds", true).setVisibility(() -> {
         if (!(Boolean)this.advanced.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.milliseconds = new BooleanSetting("Milliseconds", false).setVisibility(() -> {
         if (!(Boolean)this.advanced.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      var10005 = true;
      this.amPm = new BooleanSetting("AM/PM", true).setVisibility(() -> {
         if (!(Boolean)this.s24hr.getValue() && !(Boolean)this.advanced.getValue()) {
            boolean var10002 = true;
            return true;
         } else {
            return false;
         }
      });
      this.punctuation = new EnumSetting<>("Punctuation", TimestampsPunctuation.f5225);
      this.punctuationColor = new ColorSetting("Punctuation Color", new Color(Formatting.DARK_GRAY.getColorValue(), false)).setAlphaAllowed(false);
      boolean var10007 = true;
      this.space = new BooleanSetting("Space", true);
      boolean var10003 = true;
      this.advanced.addSubSettings(this.hhMmSs);
      Setting[] var10001 = new Setting[9];
      var10001[0] = this.timeColor;
      var10005 = true;
      var10001[1] = this.advanced;
      var10001[2] = this.s24hr;
      var10001[3] = this.seconds;
      var10001[4] = this.milliseconds;
      var10001[5] = this.amPm;
      var10001[6] = this.punctuation;
      var10001[7] = this.punctuationColor;
      var10001[8] = this.space;
      this.registerSettings(var10001);
      f172 = this;
   }

   @Subscribe(
      priority = -999
   )
   public void onAddChat(EventAddChat var1) {
      int var4 = Class253.m9154();
      if (var4 == 0) {
         if (var1.getChatComponent().getString().startsWith("[rusherhack]")) {
            return;
         }

         var1.setChatComponent(this.m358().append(var1.getChatComponent()));
      }
   }
}
