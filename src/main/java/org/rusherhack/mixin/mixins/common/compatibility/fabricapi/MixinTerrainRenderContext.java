package org.rusherhack.mixin.mixins.common.compatibility.fabricapi;
import org.rusherhack.*;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(
    targets = {"net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainRenderContext"},
    remap = false
)
public class MixinTerrainRenderContext {
    @Inject(
        method = {"tessellateBlock"},
        at = {@At("HEAD")},
        cancellable = true,
        require = 0
    )
    private void tessellateBlock(BlockState var1, BlockPos var2, BakedModel var3, MatrixStack var4, CallbackInfo var5) {
        MixinHelper.onRenderBlock(var1, var5);
    }
}
