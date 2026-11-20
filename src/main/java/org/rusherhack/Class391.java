package org.rusherhack;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class Class391<T extends Entity> extends Class524<T> {
   public static Object[] f6348 = new Object[18];
   public static String[] f6349 = new String[18];

   @Override
   public void render(T var1, float var2, float var3, MatrixStack var4, VertexConsumerProvider var5, int var6) {
      if (this.hasLabel((T)var1)) {
         this.renderLabelIfPresent((T)var1, var1.getDisplayName(), var4, var5, var6, var3);
      }
   }

   public Class391(EntityRenderer<T> var1) {
      super(var1);
   }

   static {
      m194();
   }
   public static void m194() {
      f6348[0] = "\u0018{bz\u0015\u000e\u0004a`&\u000f\u001a\u0014b+Ҝ";
      f6348[1] = "[$~*<E[$iv0JAoih0_F\u001e;6h\u001b";
      f6348[2] = "rv@ G;rvW|K4h=WbK!oL\u0006;\u001cc";
      f6348[3] = "\u0019(Z\u007f{\u0002\u0019(M#w\r\u0003cM=w\u0018\u0004\u0012\u001ad.\\";
      f6348[4] = "+R@v=!+RW*1.1\u0019W41;6h\u0000mi\u007f";
      f6348[5] = int.class;
      f6349[5] = "java/lang/Integer";
      f6348[6] = float.class;
      f6349[6] = "java/lang/Float";
      f6348[7] = void.class;
      f6349[7] = "java/lang/Void";
      f6348[8] = "\u0006\u0002Hd<k\u001a\u0018J8&\u007f\n\u001b\u0001Ɍ";
      f6348[9] = boolean.class;
      f6349[9] = "java/lang/Boolean";
      f6348[10] = "]\u0017\r\u0011\f\u0004A\r\u000fM\u0016\u0010Q\u000eDϽ";
      f6348[11] = "]\u0006\f\u0000(*A\u001c\u000e\\2>Q\u001fEɚ";
      f6348[12] = "{\u0001\u0003\u0013@Ip\u000e\u0012\\!G{\u0005\u0016\u0006";
      f6348[13] = "WT9\u001a\u0013cB@/z\fwN_5\u0016>!\u0003\u0005lz\u0012j\fA#\u0013\u000f \u000f?k\u0017\u0016~\u0003^0\u0003P'2\u0005<\u0005\u0014|ND0A\u0000\u001a\bCo\u0000\u0012+P\u000ebFi&\b\u0007l\b\rp\u0002Z<zU$\r\u0000-CRq\\\u0001RGUw\\S,\u001d\u0014&O?";
      f6348[14] = "\u0005\u0015#\u0019eL\u0005LfD\u0005ɱ;\u0015'G;Z_C-\u001ak(";
      f6348[15] = ":\u0015\u00158,\b/\u0001\u0003X3\u001c#\u001e\u00194\u0001JnDGX-\u0001a\u0000\u000f10Kb~@?2H#F\u0010'1N_";
      f6348[16] = "\u0005\u001cV\bi\u0007J\f\u0011Y\u001bS:GS\u0005d^UFV]%:\nN\n\u001a\u007fU\u000bKR[\u001b";
      f6348[17] = "\u0015\bq.\u0007k\bBrP\u0013o\u0012\u0018(<!?RGqPOo\u0011\u001c~1\u0014{WEO";
   }
}
