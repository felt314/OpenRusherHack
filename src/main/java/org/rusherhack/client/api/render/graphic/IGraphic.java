package org.rusherhack.client.api.render.graphic;
import org.rusherhack.*;

import java.io.InputStream;

public interface IGraphic {
   int getYOffset();

   InputStream getInputStream();

   int getXOffset();

   int getWidth();

   int getHeight();
}
