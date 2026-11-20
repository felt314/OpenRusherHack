package org.rusherhack.client.api.accessors.client;
import org.rusherhack.*;

import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GameOptions.class})
public interface IMixinOptions {
   @Accessor("fov")
   @Mutable
   void setFov(SimpleOption<Integer> var1);
}
