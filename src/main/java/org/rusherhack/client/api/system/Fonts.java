package org.rusherhack.client.api.system;
import org.rusherhack.*;

import org.rusherhack.client.api.render.font.IFontRenderer;

public interface Fonts {
   IFontRenderer getCustomFontRenderer();

   IFontRenderer getClickGuiFontRenderer();

   IFontRenderer getHudFontRenderer();

   IFontRenderer getFontRenderer();

   IFontRenderer getVanillaFontRenderer();

   IFontRenderer getWindowFontRenderer();
}
