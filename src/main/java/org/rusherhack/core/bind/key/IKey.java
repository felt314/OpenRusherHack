package org.rusherhack.core.bind.key;
import org.rusherhack.*;

import java.lang.invoke.MethodHandles;
import org.rusherhack.Class066;

import org.rusherhack.command.bind;
public interface IKey {
   long f1418 = Class066.m4320(6391805352557546292L, -3207908427786062149L, MethodHandles.lookup().lookupClass()).m4325(191443904209020L);
   Object[] f1419 = new Object[5];
   String[] f1420 = new String[5];

   default String getDisplayLabel() {
      boolean var10003 = true;
      return this.getLabel(true);
   }

   boolean isKeyDown();

   String getLabel(boolean var1);

   public static void m122() {
      f1419[0] = "\u0011&\u0018o,U\r<\u001a36A\u001d?Q\"1R\u001bz\u001d(0DP?\u001a8pi51\u0006";
      f1419[1] = boolean.class;
      f1420[1] = "java/lang/Boolean";
      f1419[2] = ";kfwq.0dw8\f6#c~q";
      f1419[3] = "\u001d*J\u0012\f\u001c\u0016%[]m\u0012\u001d._\u0007";
      f1419[4] = "&W\u0014y[)\"\\\b\u0007[63(\u001fmY?O\u0017HwZ1(\u0000O}4b\"\u001eNuUb7R\u0007\u0007";
   }

   class __RHInit {
      static Object INSTANCE = new Object();
      static {
      m122();
   }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
}
