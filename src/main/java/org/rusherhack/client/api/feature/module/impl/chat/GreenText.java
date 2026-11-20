package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import org.rusherhack.client.api.events.client.chat.EventChatMessage;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;

public class GreenText extends ToggleableModule {
   public BooleanSetting space;

   @Subscribe(
      priority = -999
   )
   public void onChatMessage(EventChatMessage var1) {
      if (!var1.getMessage().startsWith("#")) {
         String var10001;
         EventChatMessage var10002;
         if ((Boolean)this.space.getValue()) {
            var10001 = " ";
            var10002 = var1;
         } else {
            var10001 = "";
            var10002 = var1;
         }

         var1.setMessage(">" + var10001 + var10002.getMessage());
      }
   }

   public GreenText() {
      super("GreenText", "@edc07.70y~dJfronttZ\u007fv0i\u007febdJmessages", ModuleCategory.CHAT);
      boolean var10008 = true;
      this.space = new BooleanSetting("Space", true);
      this.registerSettings(this.space);
   }
}
