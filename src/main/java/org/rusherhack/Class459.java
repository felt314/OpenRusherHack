package org.rusherhack;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.rusherhack.client.api.events.render.EventRender;

public class Class459 extends EventRender {
   public Entity f7412;
   public float f7413;
   public static Object[] f7415 = new Object[6];
   public static String[] f7416 = new String[6];

   public float m14392() {
      return this.f7413;
   }

   public Entity m14393() {
      return this.f7412;
   }

   public void m14394(float var1) {
      this.f7413 = var1;
   }

   public Class459(MatrixStack var1, float var2, Entity var3) {
      super(var1, var2);
      this.f7413 = 1.0F;
      this.f7412 = var3;
   }

   static {
      m157();
   }
   public static void m157() {
      f7415[0] = "\u001fRT\ts\u0017\u0003HVUi\u0003\u0013K\u001dК";
      f7415[1] = float.class;
      f7416[1] = "java/lang/Float";
      f7415[2] = "EcP1)\u0007EcGm%\b_(Gs%\u001dXY\u0015-}Y";
      f7415[3] = "WV\u000bg\u001fT\\Y\u001a(~ZWR\u001er";
      f7415[4] = "n_\u0019wmsaFP\tͶJ9F\u001cbu-i\u000e\u0004x";
      f7415[5] = "*|Ej\u001d\u0016%e\f\u0014\"/}\"^(E_y}\u0000o";
   }
}
