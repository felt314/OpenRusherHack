package org.rusherhack.client.api.accessors.gui;
import org.rusherhack.*;

import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import net.minecraft.client.gui.hud.MessageIndicator.Icon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ChatHud.class})
public interface IMixinChatComponent {
   @Accessor("trimmedMessages")
   List<Visible> getTrimmedMessages();

   @Accessor("allMessages")
   List<ChatHudLine> getAllMessages();

   @Accessor("chatScrollbarPos")
   int getChatScrollbarPos();

   @Accessor("newMessageSinceScroll")
   boolean getNewMessageSinceScroll();

   @Invoker("getMessageLineIndexAt")
   int invokeGetMessageLineIndexAt(double var1, double var3);

   @Invoker("getMessageEndIndexAt")
   int invokeGetMessageEndIndexAt(double var1, double var3);

   @Invoker("drawTagIcon")
   void invokeDrawTagIcon(DrawContext var1, int var2, int var3, Icon var4);

   @Invoker("screenToChatX")
   double invokeScreenToChatX(double var1);

   @Invoker("screenToChatY")
   double invokeScreenToChatY(double var1);

   @Invoker("refreshTrimmedMessages")
   void invokeRefreshTrimmedMessage();
}
