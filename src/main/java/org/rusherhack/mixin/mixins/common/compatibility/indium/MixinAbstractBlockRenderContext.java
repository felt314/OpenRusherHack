package org.rusherhack.mixin.mixins.common.compatibility.indium;
import org.rusherhack.*;

import link.infra.indium.renderer.render.BlockRenderInfo;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(
    targets = {"link.infra.indium.renderer.render.AbstractBlockRenderContext"},
    remap = false
)
public class MixinAbstractBlockRenderContext {
    @Shadow
    private BlockRenderInfo blockInfo;

    @Inject(
        method = {"renderQuad*"},
        at = {@At("HEAD")},
        cancellable = true,
        require = 0
    )
    private void renderQuad(CallbackInfo var1) {
        
    }
}
