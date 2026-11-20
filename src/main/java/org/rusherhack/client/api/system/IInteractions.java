package org.rusherhack.client.api.system;
import org.rusherhack.*;

import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public interface IInteractions {
   boolean useBlock(BlockPos var1, Hand var2, boolean var3, boolean var4);

   @Nullable
   BlockHitResult getBlockPlaceHitResult(BlockPos var1, boolean var2, boolean var3, double var4);

   boolean useBlock(BlockHitResult var1, Hand var2, boolean var3);

   boolean placeBlock(BlockPos var1, Hand var2, boolean var3);

   @Nullable
   BlockHitResult getBlockHitResult(BlockPos var1, boolean var2, boolean var3, double var4);
}
