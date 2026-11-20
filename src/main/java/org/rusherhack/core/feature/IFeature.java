package org.rusherhack.core.feature;
import org.rusherhack.*;

import org.rusherhack.core.interfaces.INamed;

import org.rusherhack.command.reset;
public interface IFeature extends INamed {
   default boolean reset() {
      return false;
   }

   String getDescription();
}
