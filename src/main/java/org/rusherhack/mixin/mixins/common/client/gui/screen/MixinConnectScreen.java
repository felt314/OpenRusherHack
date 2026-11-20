package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.CookieStorage;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.rusherhack.command.connect;
@Mixin({ConnectScreen.class})
public class MixinConnectScreen {
   @Inject(
      method = {"connect"},
      at = {@At("HEAD")}
   )
   private void onConnect(MinecraftClient var1, ServerAddress var2, ServerInfo var3, CookieStorage var4, CallbackInfo var5) {
      MixinHelper.onConnectToServer(var2, var3);
   }
}
