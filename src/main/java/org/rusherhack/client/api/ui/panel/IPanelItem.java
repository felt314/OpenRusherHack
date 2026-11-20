package org.rusherhack.client.api.ui.panel;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;
import org.rusherhack.client.api.render.IRenderable2D;
import org.rusherhack.core.interfaces.IClickable;
import org.rusherhack.core.interfaces.ITypeable;

public interface IPanelItem extends IRenderable2D, IClickable, ITypeable {
   long f898 = Class066.m4320(7673072515823807862L, 1947703107372444964L, MethodHandles.lookup().lookupClass()).m4325(44899740429273L);
   Object[] f899 = new Object[5];
   String[] f900 = new String[5];

   boolean isHovered(double var1, double var3, boolean var5);

   @Override
   default boolean isHovered(double var1, double var3) {
      boolean var10005 = true;
      return this.isHovered(var1, var3, true);
   }

   double getWidth();

   default boolean isVisible() {
      boolean var10002 = true;
      return true;
   }

   double getHeight(boolean var1);

   public static void m122() {
      f899[0] = "\u000b\u0006\u0005U-P\u0017\u001c\u0007\t7D\u0007\u001fL\u00183L\u0001\u001a\u0016U>U\rZ\u0017\u0012qU\u0005\u001a\u0007\u0017ql4\u0015\f\u001e3l\u0010\u0011\u000f";
      f899[1] = double.class;
      f900[1] = "java/lang/Double";
      f899[2] = boolean.class;
      f900[2] = "java/lang/Boolean";
      f899[3] = "cit)D\u0017hfef%\u0019cma<";
      f899[4] = "gRfNo\u001bb\u000br%|\u0005\u0018StHg\u001344t_bGb\tcO}~&Nu\u001c'C1^j%'F;R4_w@;K\n\u001f%\u001d>\npO#\u001d'4";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
