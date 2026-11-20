package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

public interface IChunkProcessor {
   void registerProcessee(IChunkProcessor$Processee var1);

   void reloadChunks();

   void scanChunk(ChunkPos var1, Predicate<BlockState> var2, Consumer<HashMap<BlockPos, BlockState>> var3);
}
