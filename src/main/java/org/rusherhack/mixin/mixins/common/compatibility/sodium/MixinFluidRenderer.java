package org.rusherhack.mixin.mixins.common.compatibility.sodium;
import org.rusherhack.*;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import org.rusherhack.mixin.MixinHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(
    targets = {"net.caffeinemc.mods.sodium.fabric.render.FluidRendererImpl"},
    remap = false
)
public class MixinFluidRenderer {
    @Inject(
        method = {"render"},
        at = {@At("HEAD")},
        cancellable = true,
        require = 0
    )
    private void render(
        LevelSlice var1,
        BlockState var2,
        FluidState var3,
        BlockPos var4,
        BlockPos var5,
        TranslucentGeometryCollector var6,
        ChunkBuildBuffers var7,
        CallbackInfo var8
    ) {
        
    }
}
