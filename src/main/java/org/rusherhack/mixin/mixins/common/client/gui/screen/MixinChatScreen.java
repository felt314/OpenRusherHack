package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChatScreen.class})
public class MixinChatScreen {
   @Shadow
   private TextFieldWidget chatField;

   @Inject(
      method = {"onEdited"},
      at = {@At("RETURN")}
   )
   private void postChatEdited(String var1, CallbackInfo var2) {
      MixinHelper.postChatEdited(this.chatField);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderChatInputHead(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (MixinHelper.onRenderChatInput(var1, -1, this.chatField)) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/components/EditBox;render(Lnet/minecraft/client/gui/GuiGraphics;IIF)V",
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void renderChatInput(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (MixinHelper.onRenderChatInput(var1, 0, this.chatField)) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void renderChatInputPost(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (MixinHelper.onRenderChatInput(var1, 1, this.chatField)) {
         var5.cancel();
      }
   }
}
