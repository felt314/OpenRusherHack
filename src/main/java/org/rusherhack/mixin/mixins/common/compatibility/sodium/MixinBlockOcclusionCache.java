package org.rusherhack.mixin.mixins.common.compatibility.sodium;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(
    targets = {"net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockOcclusionCache"},
    remap = false
)
public class MixinBlockOcclusionCache {
    @Inject(
        method = {"shouldDrawSide"},
        at = {@At("HEAD")},
        cancellable = true,
        require = 0
    )
    private void shouldDrawSide(BlockState var1, BlockView var2, BlockPos var3, Direction var4, CallbackInfoReturnable<Boolean> var5) {
        MixinHelper.shouldRenderBlockFace(var1, var5);
    }
}
