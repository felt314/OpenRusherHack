package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters.Builder;
import net.minecraft.client.render.RenderPhase.Texture;
import net.minecraft.client.render.RenderPhase.TextureBase;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.util.Identifier;
import org.rusherhack.client.api.accessors.render.IMixinRenderStateShard;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   targets = {"net.minecraft.client.renderer.RenderType.CompositeState.CompositeStateBuilder"}
)
public class MixinRenderType {
   @Shadow
   private TextureBase texture;

   @Inject(
      method = {"setTextureState"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void setTextureState(TextureBase var1, CallbackInfoReturnable<Builder> var2) {
      if (var1.getId().isPresent()
         && (
            ((Identifier)var1.getId().get()).equals(ItemRenderer.ITEM_ENCHANTMENT_GLINT)
               || ((Identifier)var1.getId().get()).equals(ItemRenderer.ENTITY_ENCHANTMENT_GLINT)
         )) {
         Identifier var3 = (Identifier)var1.getId().get();
         Texture var4 = new Texture(var3, true, false);
         IMixinRenderStateShard var5 = (IMixinRenderStateShard)var4;
         var5.setSetupState(() -> {
            Identifier var1x = MixinHelper.getGlintTexture(var3);
            MinecraftClient.getInstance().getTextureManager().getTexture(var1x).setFilter(true, false);
            RenderSystem.setShaderTexture(0, var1x);
            MixinHelper.setupEnchantTexture(-1);
         });
         var5.setClearState(() -> MixinHelper.setupEnchantTexture(1));
         this.texture = var4;
         var2.setReturnValue(Builder.class.cast(this));
         var2.cancel();
      }
   }
}
