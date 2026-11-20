package org.rusherhack.client.api.plugin;
import org.rusherhack.*;

import org.rusherhack.core.logging.ILogger;

public interface IPlugin {
   @Deprecated
   default String[] getAuthors() {
      return null;
   }

   ILogger getLogger();

   @Deprecated
   default String getVersion() {
      return null;
   }

   @Deprecated
   default String getDescription() {
      return null;
   }

   void onLoad();

   @Deprecated
   default String getName() {
      return null;
   }

   void onUnload();
}
