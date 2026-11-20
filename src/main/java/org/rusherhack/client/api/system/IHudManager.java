package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.awt.Color;
import org.rusherhack.client.api.feature.hud.HudElement;
import org.rusherhack.core.feature.IFeatureManager;

public interface IHudManager extends IFeatureManager<HudElement> {
   @Deprecated
   String getModuleToggleColorString(boolean var1);

   boolean isThemeColorSynced();

   Color getBackgroundColor();

   Color getPrimaryColor();

   Color getSecondaryColor();

   double getScale();

   boolean isGlobalColorSynced();

   void moveToTop(HudElement var1);
}
