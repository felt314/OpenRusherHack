package org.rusherhack;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import org.rusherhack.core.event.stage.Stage;

public class Class417 extends Event318 {
   public Entity f6997;
   public static Object[] f6999 = new Object[4];

   public Class417(Camera var1, Entity var2) {
      super(var1);
      this.f6997 = var2;
   }

   public Entity m13495() {
      return this.f6997;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public void m13496(Entity var1) {
      this.f6997 = var1;
   }

   static {
      m157();
   }
   public static void m157() {
      f6999[0] = "K<tj\u001fKW&v6\u0005_G%=ι";
      f6999[1] = "[\u001edy\u0012c[\u001es%\u001elAUs;\u001eyF$!eF=";
      f6999[2] = "@8(\u0017\u0002~K79Xcp@<=\u0002";
      f6999[3] = "\u0017=.\u001fW:\u0003ix|є\u0003J<s\u0016\u000bz\u0011>*C";
   }
}
