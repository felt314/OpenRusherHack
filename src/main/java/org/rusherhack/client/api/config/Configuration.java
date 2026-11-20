package org.rusherhack.client.api.config;
import org.rusherhack.*;

import java.io.File;
import java.nio.file.Path;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.core.logging.ILogger;
import org.rusherhack.core.serialize.ISerializable;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.utils.MathUtils;

import org.rusherhack.command.config;
public abstract class Configuration {
   public ILogger logger;
   public static Path CONFIG_DIRECTORY;
   public File f303;
   public static String[] f304;
   public abstract void read(ISerializable<?> var1);

   public Configuration(File var1) {
    }

   public File getFile() {
        return null;
    }

   public File createTempFile() {

      try {
         File var5;
         (var5 = File.createTempFile("rh_temp", ".tmp")).deleteOnExit();
         return var5;
      } catch (Exception var4) {
         boolean var10004 = true;
         this.logger.warn("Failed to create temp config file", var4);
         return null;
      }
   }

   public static void m634(String[] var0) {
      f304 = var0;
   }

   public static String[] m635() {
      return f304;
   }

   public Configuration() {}
}
