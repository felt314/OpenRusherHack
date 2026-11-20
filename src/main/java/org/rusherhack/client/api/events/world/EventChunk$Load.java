package org.rusherhack.client.api.events.world;
import org.rusherhack.*;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.WorldChunk;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.setting.Setting;

public class EventChunk$Load extends EventChunk {
   public WorldChunk f519;
   public static Object[] f521 = new Object[17];
   public static String[] f522 = new String[17];

   public EventChunk$Load(ChunkPos var1, WorldChunk var2) {
    }

   @Override
   public Stage getPreferredStage() {
      return Stage.POST;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public WorldChunk getChunk() {
        return null;
    }

   static {
      m157();
   }
   public static void m157() {
      f521[0] = ",1W9Py0+UeJm (\u001etM~&mUaGb7mCcCk&mccCk&";
      f521[1] = "\u001fT1\u0006 -\u0003N3Z:9\u0013MxK>1\u0015H\"\u00063(\u0019\b3^76\u0004Ux_=*\u001cBxm$=\u001eR\u0015@'6\u001b\u0002\u001aG3<";
      f521[2] = "z\f4\u000bN[z\f#WBT`G#IBAg6r\u001d\u0012\n";
      f521[3] = "'\u0016-2Y\u007f;\f/nCk+\u000fd\u007fDx-J9y_~!\n-2xo<\u0010#rL";
      f521[4] = "{feK,.\u000eFnD=as^}C4(\u001b";
      f521[5] = "\u001et9\u001b\u0012W\u0002n;G\bC\u0012mpV\fK\u0014h*\u001b\u0001R\u0018(;C\u0005L\u0005upB\u000fP\u001dbpp\u0016G\u001fr\u001b[\u0014K\u0005\u007f";
      f521[6] = "\"\u0004";
      f521[7] = void.class;
      f522[7] = "java/lang/Void";
      f521[8] = "\u0004\n";
      f521[9] = "n\b9pjcr\u0012;,pwb\u0011pȪ";
      f521[10] = "Z\u0019`\u0015:uQ\u0016qZ[{Z\u001du\u0000";
      f521[11] = "YU-X\u0007B[[05d\u007fkmA\\XT]\n;^VI";
      f521[12] = "HMT6'iNL[t\u001eգr\fY~~g\u0002X\u0006h&\u0002";
      f521[13] = "1io*;\u0007rm-;XΘ\n/0%6\u0014lqnygn";
      f521[14] = "k\u000f\u001dIYL.QG9\\0)\n\u001eFMMt_\u0019U5\u000esVYAHS&QJ9";
      f521[15] = "mp\u000eDqN.tLU\u0012ѭV6QK|]0h\u000f\u0017-'k7S],L4:\b^\u0012";
      f521[16] = "-o*\u000bc-h1p{ϿQh|+@ln3v-K";
   }
}
