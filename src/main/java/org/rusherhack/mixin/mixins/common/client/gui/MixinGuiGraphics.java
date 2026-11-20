package org.rusherhack.mixin.mixins.common.client.gui;
import org.rusherhack.*;

import java.util.List;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DrawContext.class})
public class MixinGuiGraphics {
   @Inject(
      method = {"renderTooltipInternal"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preRenderTooltip(TextRenderer var1, List<TooltipComponent> var2, int var3, int var4, TooltipPositioner var5, CallbackInfo var6) {
      MixinHelper.onRenderTooltip(DrawContext.class.cast(this), var2, var3, var4, var5, -1, var6);
   }

   @Inject(
      method = {"renderTooltipInternal"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void postRenderTooltip(TextRenderer var1, List<TooltipComponent> var2, int var3, int var4, TooltipPositioner var5, CallbackInfo var6) {
      MixinHelper.onRenderTooltip(DrawContext.class.cast(this), var2, var3, var4, var5, 1, var6);
   }
}
