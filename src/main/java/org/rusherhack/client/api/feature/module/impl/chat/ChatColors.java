package org.rusherhack.client.api.feature.module.impl.chat;
import org.rusherhack.*;

import net.minecraft.text.Text;
import org.rusherhack.client.api.events.client.chat.EventAddChat;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;

public class ChatColors extends ToggleableModule {

   public ChatColors() {
      super(
         "ChatColors",
         "jQV\u001e\u001ds chat colors in chat clientside",
         ModuleCategory.CHAT
      );
   }

   @Subscribe
   public void onAddChat(EventAddChat var1) {
      String var5;
      if ((var5 = var1.getChatComponent().getString()).contains("&")) {
         var1.setChatComponent(
            Text.literal(var5.replace((char)38, (char)167))
         );
      }
   }
}
