package org.rusherhack.core.interfaces;
import org.rusherhack.*;

public interface IClickable extends IHoverable {
   default void mouseReleased(double var1, double var3, int var5) {
   }

   boolean mouseClicked(double var1, double var3, int var5);
}
