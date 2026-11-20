package org.rusherhack.core.interfaces;
import org.rusherhack.*;

public interface IDraggable extends IClickable {
   void mouseMoved(double var1, double var3);

   default boolean isDragging() {
      return false;
   }
}
