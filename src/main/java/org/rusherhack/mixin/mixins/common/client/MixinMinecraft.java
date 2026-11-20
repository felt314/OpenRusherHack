package org.rusherhack.mixin.mixins.common.client;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import org.rusherhack.command.shutdown;
@Mixin({MinecraftClient.class})
public class MixinMinecraft {
   private Screen toScreen = null;

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void postStartGame(CallbackInfo var1) {
      MixinHelper.postGameStart();
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")}
   )
   private void shutdown(CallbackInfo var1) {
      MixinHelper.onGameShutdown();
   }

   @Inject(
      method = {"getFramerateLimit"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getFramerateLimit(CallbackInfoReturnable<Integer> var1) {
      MixinHelper.getFramerateLimit(var1);
   }

   @Inject(
      method = {"continueAttack"},
      at = {@At("HEAD")}
   )
   private void onContinueAttackHead(boolean var1, CallbackInfo var2) {
      MixinHelper.multiTaskHook(-1, null);
   }

   @Inject(
      method = {"continueAttack"},
      at = {@At("RETURN")}
   )
   private void onContinueAttackReturn(boolean var1, CallbackInfo var2) {
      MixinHelper.multiTaskHook(1, null);
   }

   @Redirect(
      method = {"startUseItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;isDestroying()Z"
      ),
      require = 0
   )
   private boolean isPlayerDestroying(ClientPlayerInteractionManager var1) {
      return MixinHelper.isPlayerDestroyingBlock(var1);
   }

   @Inject(
      method = {"stop"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void stop(CallbackInfo var1) {
      MixinHelper.onGameStop(var1);
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void preTick(CallbackInfo var1) {
      MixinHelper.onTick(-1);
   }

   @Inject(
      method = {"tick"},
      at = {@At("RETURN")}
   )
   private void postTick(CallbackInfo var1) {
      MixinHelper.onTick(1);
   }

   @Inject(
      method = {"resizeDisplay"},
      at = {@At("RETURN")}
   )
   private void resizeDisplay(CallbackInfo var1) {
      MixinHelper.resizeDisplay();
   }

   @Inject(
      method = {"setLevel"},
      at = {@At("HEAD")}
   )
   private void preWorldLoad(CallbackInfo var1) {
      MixinHelper.loadWorld(true);
   }

   @Inject(
      method = {"setLevel"},
      at = {@At("RETURN")}
   )
   private void postWorldLoad(CallbackInfo var1) {
      MixinHelper.loadWorld(false);
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preSetScreen(@Nullable Screen var1, CallbackInfo var2) {
      this.toScreen = MixinHelper.onSetScreen(var1, var2, -1);
   }

   @ModifyVariable(
      method = {"setScreen"},
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/Minecraft;screen:Lnet/minecraft/client/gui/screens/Screen;",
         ordinal = 0
      ),
      ordinal = 0,
      argsOnly = true
   )
   private Screen modifyScreen(Screen var1) {
      Screen var2 = this.toScreen;
      if (var2 != null) {
         this.toScreen = null;
         return var2;
      } else {
         return var1;
      }
   }
}
