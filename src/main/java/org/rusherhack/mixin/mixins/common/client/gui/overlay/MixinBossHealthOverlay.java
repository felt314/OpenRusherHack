package org.rusherhack.mixin.mixins.common.client.gui.overlay;
import org.rusherhack.*;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BossBarHud.class})
public class MixinBossHealthOverlay {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void render(DrawContext var1, CallbackInfo var2) {
      MixinHelper.onRenderOverlay(var2, 6);
   }
}
