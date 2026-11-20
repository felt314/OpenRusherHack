package org.rusherhack.client.api.accessors.world;
import org.rusherhack.*;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({BucketItem.class})
public interface IMixinBucketItem {
   @Accessor("content")
   Fluid getContent();
}
