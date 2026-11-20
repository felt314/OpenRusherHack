package org.rusherhack;
import net.minecraft.client.render.VertexConsumerProvider;

import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.type.EventCancellable;

public class Event230 extends EventCancellable {
   public float f4179;
   public Immediate f4180;
   public MatrixStack f4181;
   public static Object[] f4183 = new Object[10];
   public static String[] f4184 = new String[10];

   public float m8611() {
      return this.f4179;
   }

   public MatrixStack m8612() {
      return this.f4181;
   }

   @Override
   public Stage getPreferredStage() {
      return Stage.PRE;
   }

   public Event230(MatrixStack var1, float var2, Immediate var3) {
      this.f4181 = var1;
      this.f4179 = var2;
      this.f4180 = var3;
   }

   @Override
   public Stage getStage() {
      return super.getStage();
   }

   public Immediate m8613() {
      return this.f4180;
   }

   static {
      m122();
   }
   public static void m122() {
      f4183[0] = ";uiheX'ok4\u007fL7l %x_1)k0rC )}2vJ1)]2vJ1";
      f4183[1] = "\u001c\"%\r6\u001e\u00008'Q,\n\u0010;lǿ";
      f4183[2] = float.class;
      f4184[2] = "java/lang/Float";
      f4183[3] = "+\u0016\u0016Co\u0007+\u0016\u0001\u001fc\b1]\u0001\u0001c\u001d6,VX;Ya\u0010\u000e\fq\u001d\u001aGWT:";
      f4183[4] = "$\u00152`\u001f@$\u0015%<\u0013O>^%\"\u0013Z9/r{J\u001e";
      f4183[5] = "^]-/L[UR<`-U^Y8:";
      f4183[6] = "^3\u0014<c3]+\u0001FV\u000btS\u0018&e+T1\u001b>p";
      f4183[7] = "\"V'UPSv\fd\r`Ր\u001b]rX\u001dRt\u0002zC\u000e";
      f4183[8] = "K>\njW \u001fdI2g˺r6M>\u001c;\u00175\u0001g\u001f";
      f4183[9] = "rZ\u001fN,\u0016&\u0000\\\u0016\u001cՃKPIL}\\s\nIQn";
   }
}
