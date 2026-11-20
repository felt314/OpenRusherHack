package org.rusherhack.client.api.render;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import net.minecraft.client.util.math.MatrixStack;
import org.rusherhack.Class066;

public interface IRenderer {
   long f795 = Class066.m4320(3912416450249696338L, -3971684464017967261L, MethodHandles.lookup().lookupClass()).m4325(131003813508969L);
   Object[] f796 = new Object[5];
   String[] f797 = new String[5];

   MatrixStack getMatrixStack();

   default void begin() {
      this.begin(new MatrixStack());
   }

   void end();

   boolean isBuilding();

   void begin(MatrixStack var1);

   public static void m122() {
      f796[0] = "V6 \bs\fJ,\"Ti\u0018Z/iEm\u0010\\*3\b`\tPj5Co\u001d\\6ioS\u001cW \"Td\u000b";
      f796[1] = "\u0019\u001e\b\u0007uJ\u0019\u001e\u001f[yE\u0003U\u001fEyP\u0004$H\u001c \u0014";
      f796[2] = void.class;
      f797[2] = "java/lang/Void";
      f796[3] = "n'Az9ue(P5X{n#To";
      f796[4] = "`6\"\fd\u0011}=\u001c\fo\u0013p!\u001c_;\u0003.+z\fm\u0004\u007fG%\tm\u001fj.%\\z\u001c\u0011";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
