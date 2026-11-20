package org.rusherhack.mixin.mixins.common.client.gui.screen;
import org.rusherhack.*;

import net.minecraft.client.gui.screen.GameMenuScreen;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameMenuScreen.class})
public class MixinPauseScreen {
   @Inject(
      method = {"onDisconnect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onDisconnect(CallbackInfo var1) {
      MixinHelper.onDisconnect(-1, var1);
   }
}
