package org.rusherhack.client;
import org.rusherhack.*;

import net.minecraft.client.input.Input;
public class Class027 extends Input {
   public static Object[] f1219 = new Object[12];
   public static String[] f1220 = new String[12];

   public void tick(boolean var1, float var2) {
      super.pressingBack = super.pressingForward = false;
      super.pressingLeft = false;
      super.pressingRight = false;
      super.jumping = false;
      super.sneaking = false;
      super.movementForward = 0.0F;
      super.movementSideways = 0.0F;
      super.tick(var1, var2);
   }

   public Class027() {
   }

   static {
      m122();
   }
   public static void m122() {
      f1219[0] = "$#&\u001ee\n89$B\u007f\u001e(:oS{\u0016.?5\u001eƃ";
      f1219[1] = boolean.class;
      f1220[1] = "java/lang/Boolean";
      f1219[2] = float.class;
      f1220[2] = "java/lang/Float";
      f1219[3] = "c9fVmsh6w\u0019\f}c=sC";
      f1219[4] = "3`KW;c1s\b5$d2~Zbq4g*6Dpd=v\u000eNzc";
      f1219[5] = "$^\u0018\u000bm7&M[ir0%@\t>'`p\u001fe\u0018&0*H]\u0012,7";
      f1219[6] = "2\u0010:b&;0\u0003y\u00009<3\u000e+WllgRGqm<<\u0006\u007f{g;";
      f1219[7] = "\"5\u001e\u0003M+ &]aR,#+\u000f6\u0007|vrcXX*q&^XXp'";
      f1219[8] = "\u0019\rxNz%\u001b\u001e;,e\"\u0018\u0013i{0rMF\u0005]1\"\u0017\u001b=W;%";
      f1219[9] = "f4\u001d`\u0012qd'^\u0002\rvg*\fUX&2p`sYvh\"XySq";
      f1219[10] = "I\u0004\u0015\u0016YwK\u0017VtFpH\u001a\u0004#\u0013 \u001dAhMLv\u001a\u0017UML,L";
      f1219[11] = "\\y>/0*^j}M/-]g/\u001az}\b?C<{-Ro{6q*";
   }
}
