package org.rusherhack.client.api.system;
import org.rusherhack.*;

import net.minecraft.util.math.ChunkPos;

public interface IChunkProcessor$Processee {
   boolean isActive();

   void process(ChunkPos var1, boolean var2);
}
