package org.rusherhack.mixin.mixins.common.compatibility.sodium;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(
    targets = {"net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer"},
    remap = false
)
public class MixinBlockRenderer {
    @Inject(
        method = {"renderModel"},
        at = {@At("HEAD")},
        cancellable = true,
        require = 0
    )
    private void renderModel(BakedModel var1, BlockState var2, BlockPos var3, BlockPos var4, CallbackInfo var5) {
        MixinHelper.onRenderBlock(var2, var5);
    }
}
