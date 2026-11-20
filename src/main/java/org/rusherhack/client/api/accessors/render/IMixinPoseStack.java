package org.rusherhack.client.api.accessors.render;
import org.rusherhack.*;

import java.util.Deque;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({MatrixStack.class})
public interface IMixinPoseStack {
   @Accessor("poseStack")
   Deque<Entry> getPoseStack();

   @Accessor("poseStack")
   @Mutable
   void setPoseStack(Deque<Entry> var1);
}
