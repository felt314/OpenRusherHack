package org.rusherhack.core.interfaces;
import org.rusherhack.*;

import org.rusherhack.command.toggle;

public interface IToggleable {
   void onEnable();

   boolean isToggled();

   void setToggled(boolean var1);

   void onDisable();

   void toggle();
}
