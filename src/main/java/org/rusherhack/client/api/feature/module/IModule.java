package org.rusherhack.client.api.feature.module;
import org.rusherhack.*;

import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.interfaces.IHideable;
import org.rusherhack.core.notification.INotifiable;
import org.rusherhack.core.serialize.Class062;

public interface IModule extends IFeatureConfigurable, INotifiable, IHideable, Class062 {
   ModuleCategory getCategory();

   default String getMetadata() {
      return "";
   }
}
