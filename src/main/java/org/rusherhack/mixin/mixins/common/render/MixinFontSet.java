package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.font.EmptyGlyphRenderer;
import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.GlyphRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({FontStorage.class})
public class MixinFontSet {
   @Inject(
      method = {"getGlyph"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getCharacterGlyph(int var1, CallbackInfoReturnable<GlyphRenderer> var2) {
      if (var1 == 9 || var1 == 13) {
         var2.setReturnValue(new EmptyGlyphRenderer());
      }
   }
}
