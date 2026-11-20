package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import net.minecraft.util.math.ChunkPos;
import org.rusherhack.core.event.type.Event;

public abstract class EventChunk extends Event {
   public ChunkPos f523;
   public static Object[] f525 = new Object[4];

   public ChunkPos getChunkPos() {
        return null;
    }

   public EventChunk(ChunkPos var1) {
      this.f523 = var1;
   }

   static {
      m122();
   }
   public static void m122() {
      f525[0] = "K\u001f\u001e*fbW\u0005\u001cv|vG\u0006Wgx~A\u0003\r*ugMC\u001crqyP\u001eWs{eH\tWAbrJ\u0019:layO";
      f525[1] = "BhnSC\u007fBhy\u000fOpX#y\u0011Oe_R+D\u001c%";
      f525[2] = "-6[>*M&9JqKC-2N+";
      f525[3] = "RNt\u0014`*EJ uԪ\u0011FGyO`(YP(";
   }

   public EventChunk() {}
}
