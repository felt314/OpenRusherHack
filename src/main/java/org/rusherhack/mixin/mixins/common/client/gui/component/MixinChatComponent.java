package org.rusherhack.mixin.mixins.common.client.gui.component;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.Text;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ChatHud.class})
public class MixinChatComponent {
   @ModifyConstant(
      method = {"addMessageToDisplayQueue"},
      constant = {@Constant(
         intValue = 100
      )},
      require = 0
   )
   private int modifyLineLimitSize1(int var1) {
      return MixinHelper.getChatLineLimit(var1);
   }

   @ModifyConstant(
      method = {"addMessageToQueue"},
      constant = {@Constant(
         intValue = 100
      )},
      require = 0
   )
   private int modifyLineLimitSize2(int var1) {
      return MixinHelper.getChatLineLimit(var1);
   }

   @ModifyConstant(
      method = {"addRecentChat"},
      constant = {@Constant(
         intValue = 100
      )},
      require = 0
   )
   private int modifyLineLimitSize3(int var1) {
      return MixinHelper.getChatLineLimit(var1);
   }

   @Inject(
      method = {"clearMessages"},
      at = {@At("HEAD")},
      cancellable = true,
      locals = LocalCapture.CAPTURE_FAILSOFT
   )
   private void onClearMessages(boolean var1, CallbackInfo var2) {
      MixinHelper.onClearChatMessages(var2, var1);
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/components/ChatComponent;getLinesPerPage()I",
         ordinal = 0,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preRenderChat(DrawContext var1, int var2, int var3, int var4, boolean var5, CallbackInfo var6) {
      MixinHelper.onRenderChat(var1, var2, var3, var4, -1, var6);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void postRenderChat(DrawContext var1, int var2, int var3, int var4, boolean var5, CallbackInfo var6) {
      MixinHelper.onRenderChat(var1, var2, var3, var4, 1, var6);
   }

   @ModifyVariable(
      method = {"addMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/GuiMessageTag;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Text preAddMessage(Text var1) {
      return MixinHelper.onAddMessage(var1);
   }

   @Inject(
      method = {"addMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/GuiMessageTag;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/components/ChatComponent;logChatMessage(Lnet/minecraft/client/GuiMessage;)V",
         shift = Shift.BEFORE,
         ordinal = 0
      )},
      cancellable = true
   )
   private void preAddMessage2(Text var1, MessageSignatureData var2, MessageIndicator var3, CallbackInfo var4) {
      if (var1 == null) {
         var4.cancel();
      }
   }
}
