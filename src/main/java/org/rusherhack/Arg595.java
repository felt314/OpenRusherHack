package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.FeatureCommand;
import org.rusherhack.core.command.AbstractCommand;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.Setting;

public class Arg595 implements IArg<Setting<?>> {
   public static long f9424 = Class066.m4320(-3520007090382481572L, 2385713774786879807L, MethodHandles.lookup().lookupClass()).m4325(163860022207569L);
   public static String[] f9425;
   public static String[] f9426;
   public static Object[] f9428 = new Object[44];
   public static String[] f9429 = new String[44];

   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
        return null;
    }

   public List<Setting<?>> m18078(Setting<?> var1) {
      Arg595 var4 = this;
      ArrayList var6 = new ArrayList();
      Iterator var7;
      Iterator var10000 = var7 = var1.getSubSettings().iterator();

      while (var10000.hasNext()) {
         Setting var5 = (Setting)var7.next();
         var10000 = var7;
         var6.add(var5);
         var6.addAll(var4.m18078(var5));
      }

      return var6;
   }

   public Setting<?> m18079(CommandProcessingSink var1, String var2) {
      AbstractCommand var7;
      if ((var7 = var1.getCommandData().getCommand()) instanceof FeatureCommand) {
         Setting var6;
         IFeatureConfigurable var8;
         if ((var6 = (var8 = ((FeatureCommand)var7).getFeature()).getSetting(var2)) != null) {
            return var6;
         } else {
            throw new IllegalStateException("Setting " + var2 + " not found for feature " + var8.getName());
         }
      } else {
         throw new IllegalStateException("Unknown context");
      }
   }

   static {
    }
   public static String m117(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }
}
