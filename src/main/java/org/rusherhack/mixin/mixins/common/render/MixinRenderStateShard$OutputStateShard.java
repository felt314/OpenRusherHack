package org.rusherhack.mixin.mixins.common.render;
import org.rusherhack.*;

import net.minecraft.client.render.RenderPhase.Target;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Target.class})
public class MixinRenderStateShard$OutputStateShard {
   @ModifyArgs(
      method = {"<init>"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderStateShard;<init>(Ljava/lang/String;Ljava/lang/Runnable;Ljava/lang/Runnable;)V"
      )
   )
   private static void modify(Args var0, String var1, Runnable var2, Runnable var3) {
      MixinHelper.modifyOutputStateShard(var0, var1, var2, var3);
   }
}
