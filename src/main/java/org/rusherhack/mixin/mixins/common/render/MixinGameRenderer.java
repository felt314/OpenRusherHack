package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({GameRenderer.class})
public class MixinGameRenderer {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private Camera camera;

   @Inject(
      method = {"pick(F)V"},
      at = {@At("RETURN")}
   )
   private void updateHitResult(float var1, CallbackInfo var2) {
      MixinHelper.onUpdateHitResult(var1);
   }

   @Redirect(
      method = {"pick(F)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Minecraft;getCameraEntity()Lnet/minecraft/world/entity/Entity;"
      ),
      require = 0
   )
   private Entity getCameraEntity(MinecraftClient var1) {
      return MixinHelper.getCameraEntityForPick(var1);
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "NEW",
         target = "(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/renderer/MultiBufferSource$BufferSource;)Lnet/minecraft/client/gui/GuiGraphics;",
         shift = Shift.AFTER
      )}
   )
   private void onPreRender2D(RenderTickCounter var1, boolean var2, CallbackInfo var3) {
      MixinHelper.onRender2D(
         new DrawContext(MinecraftClient.getInstance(), MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers()),
         var1.getTickDelta(false),
         -1
      );
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphics;flush()V",
         shift = Shift.BEFORE
      )}
   )
   private void onPostRender2D(RenderTickCounter var1, boolean var2, CallbackInfo var3) {
      MixinHelper.onRender2D(
         new DrawContext(MinecraftClient.getInstance(), MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers()),
         var1.getTickDelta(false),
         1
      );
   }

   @Inject(
      method = {"renderLevel"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;resetProjectionMatrix(Lorg/joml/Matrix4f;)V",
         shift = Shift.AFTER
      )}
   )
   private void preCameraSetup(RenderTickCounter var1, CallbackInfo var2) {
      MixinHelper.onCameraSetup(this.camera, this.client.getCameraEntity(), -1);
   }

   @Inject(
      method = {"renderLevel"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Camera;setup(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/world/entity/Entity;ZZF)V",
         shift = Shift.AFTER
      )}
   )
   private void postCameraSetup(RenderTickCounter var1, CallbackInfo var2) {
      MixinHelper.onCameraSetup(this.camera, this.client.getCameraEntity(), 1);
   }

   @Inject(
      method = {"getFov"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void getFov(Camera var1, float var2, boolean var3, CallbackInfoReturnable<Double> var4) {
      MixinHelper.getCameraFov(var1, var2, var3, var4);
   }

   @Inject(
      method = {"bobHurt"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void bobHurt(MatrixStack var1, float var2, CallbackInfo var3) {
      MixinHelper.onViewTransform(var3, 2);
   }

   @Inject(
      method = {"bobView"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void bobView(MatrixStack var1, float var2, CallbackInfo var3) {
      MixinHelper.onViewTransform(var3, 1);
   }

   @Inject(
      method = {"renderItemActivationAnimation"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/renderer/GameRenderer;itemActivationTicks:I",
         ordinal = 1,
         shift = Shift.BEFORE
      )},
      cancellable = true
   )
   private void preRenderItemActivationAnimation(DrawContext var1, float var2, CallbackInfo var3) {
      MixinHelper.onRenderEffect(var3, 0);
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;doEntityOutline()V",
         shift = Shift.BEFORE
      )}
   )
   private void postRender3D(RenderTickCounter var1, boolean var2, CallbackInfo var3) {
      MixinHelper.onRender3D(new MatrixStack(), var1.getTickDelta(false), 1);
   }
}
