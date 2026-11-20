package org.rusherhack.client.api.accessors.client;
import org.rusherhack.*;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil.Key;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({KeyBinding.class})
public interface IMixinKeyMapping {
   @Accessor("key")
   Key getKey();

   @Invoker("release")
   void invokeReleaseKey();
}
