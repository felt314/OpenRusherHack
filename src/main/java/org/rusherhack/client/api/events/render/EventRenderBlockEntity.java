package org.rusherhack.client.api.events.render;
import org.rusherhack.*;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class EventRenderBlockEntity extends EventCancellable {
   public BlockEntity f460;
   public VertexConsumerProvider f461;
   public MatrixStack f462;
   public float f463;
   public static Object[] f465 = new Object[12];
   public static String[] f466 = new String[12];

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public float getPartialTicks() {
        return 0.0f;
    }

   public BlockEntity getBlockEntity() {
        return null;
    }

   public void setBufferSource(VertexConsumerProvider var1) {
        
    }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public EventRenderBlockEntity(BlockEntity var1, float var2, MatrixStack var3, VertexConsumerProvider var4) {
    }

   public VertexConsumerProvider getBufferSource() {
        return null;
    }

   public MatrixStack getPoseStack() {
        return null;
    }

   static {
      m122();
   }
   public static void m122() {
      f465[0] = "\u001dRrO\u000eH\u0001Hp\u0013\u0014\\\u0011K;\u0002\u0010T\u0017NaO\u001dM\u001b\u000ep\u0017\u0019S\u0006S;\u0013\u0019S\u0016EgO9K\u0017Na3\u0019S\u0016Eg#\u0010R\u0011KP\u000f\bT\u0006Y";
      f465[1] = "\n]\nZKV\n]\u001d\u0006GY\u0010\u0016\u001d\u0018GL\u0017gJA\u001e\b";
      f465[2] = float.class;
      f466[2] = "java/lang/Float";
      f465[3] = "\u0005'\u0001Zl|\u0005'\u0016\u0006`s\u001fl\u0016\u0018`f\u0018\u001dAA8\"";
      f465[4] = "5N\u0014%mv)T\u0016ywb9W]hpq?\u0012\u0016}zm.\u0012\u0000\u007f~d?\u0012 \u007f~d?";
      f465[5] = "+d\u0010T1x+d\u0007\b=w1/\u0007\u0016=b6^VOd'";
      f465[6] = "p@\t\u0019\u0002x{O\u0018VcvpD\u001c\f";
      f465[7] = "YBY\u000e\u001c\t\u0001\u0002\flǟn^JK\u0006^W\u0015B\u000e\n";
      f465[8] = "I!sAO\u0014\u0011\"g\u0001**(\u0002\u001aCD\u001bK*|\u001bG\u000f\u000b";
      f465[9] = "-\u001d^z\u001ciu]\u000b\u0018\u0090\u000e)DOzPnyG@r";
      f465[10] = "4\u000f]]s~lO\b?è\u00195\n\u0003PgsdFMU";
      f465[11] = "\u0019z./D%A:{MПB](+}P!\u001c-+";
   }
}
