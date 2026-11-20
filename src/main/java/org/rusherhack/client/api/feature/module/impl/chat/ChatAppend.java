package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import java.util.Random;
import org.rusherhack.client.api.events.client.chat.EventChatMessage;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;

import org.rusherhack.command.prefix;
public class ChatAppend extends ToggleableModule {
   public BooleanSetting suffix;
   public BooleanSetting separator;
   public BooleanSetting enableTheAbilityToUseCustomText;
   public BooleanSetting prefix;
   public BooleanSetting appendARandomNumberAtTheEndOfYourMessage;
   public String f8944;
   public StringSetting rusherhack;
   public BooleanSetting between;

   @Subscribe
   public void onChatMessage(EventChatMessage var1) {
      if (!var1.getMessage().startsWith("#")) {
         String var7 = var1.getMessage();
         String var6 = this.separator.getValue() ? " ⏐ " : " ";
         if ((Boolean)this.between.getValue()) {
            var7 = var7.replace(" ", var6 + this.m3279() + var6);
         }

         if ((Boolean)this.prefix.getValue()) {
            var7 = this.m3279() + var6 + var7;
         }

         if ((Boolean)this.suffix.getValue()) {
            var7 = var7 + var6 + this.m3279();
         }

         var1.setMessage(var7);
      }
   }

   public ChatAppend() {
      super("ChatAppend", "Qed\u007f}qdysq||i0qttcdJtext totZi\u007feb0sxqddJmessages", ModuleCategory.CHAT);
      this.enableTheAbilityToUseCustomText = new BooleanSetting("Custom", "Enable the ability to use custom text", false);
      this.rusherhack = new StringSetting("Text", "rusherhack");
      this.appendARandomNumberAtTheEndOfYourMessage = new BooleanSetting("Random", "Append a random number at the end of your message", false);
      this.prefix = new BooleanSetting("Prefix", false);
      boolean var10011 = true;
      this.suffix = new BooleanSetting("Suffix", true);
      this.between = new BooleanSetting("Between", false);
      boolean var10009 = true;
      this.separator = new BooleanSetting("Separator", true);
      this.f8944 = "ʳᵘˢʰᵉʳʰᵃᶜᵏ";
      boolean var10003 = true;
      this.enableTheAbilityToUseCustomText.addSubSettings(this.rusherhack);
      Setting[] var10001 = new Setting[6];
      var10001[0] = this.enableTheAbilityToUseCustomText;
      boolean var10005 = true;
      var10001[1] = this.appendARandomNumberAtTheEndOfYourMessage;
      var10001[2] = this.prefix;
      var10001[3] = this.suffix;
      var10001[4] = this.between;
      var10001[5] = this.separator;
      this.registerSettings(var10001);
   }

   public String m3279() {
      String var10000;
      ChatAppend var10001;
      if ((Boolean)this.enableTheAbilityToUseCustomText.getValue()) {
         var10000 = (String)this.rusherhack.getValue();
         var10001 = this;
      } else {
         var10000 = "ʳᵘˢʰᵉʳʰᵃᶜᵏ";
         var10001 = this;
      }

      return var10000
         + (var10001.appendARandomNumberAtTheEndOfYourMessage.getValue() ? " " + new Random().nextInt(10000) : "");
   }
}
