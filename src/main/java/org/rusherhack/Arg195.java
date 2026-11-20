package org.rusherhack;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.rusherhack.client.api.feature.command.arg.SettingValue;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.core.command.argument.parser.IArg;
import org.rusherhack.core.command.exceptions.ArgumentException;
import org.rusherhack.core.command.processing.CommandProcessingSink;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.Setting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.ColorUtils;
import org.rusherhack.core.utils.StringUtils;

public class Arg195 implements IArg<SettingValue> {
   public static long f3725 = Class066.m4320(-1564009149779667612L, -39510638010773494L, MethodHandles.lookup().lookupClass()).m4325(225628019950654L);
   public static String[] f3726;
   public static String[] f3727;
   public static Object[] f3729 = new Object[64];
   public static String[] f3730 = new String[64];

   public Setting<?> m7734(CommandProcessingSink var1) {
      int var10000 = Class253.m9154();
      Setting var5 = null;
      int var4 = var10000;
      Iterator var7 = var1.getCurrentEntry().getParsedArguments().values().iterator();

      while (var7.hasNext()) {
         Object var6;
         Object var8 = var6 = var7.next();
         if (var4 == 0) {
            if (!(var8 instanceof Setting)) {
               continue;
            }

            var8 = var6;
         }

         var5 = (Setting)var8;
         if (var4 != 0) {
            break;
         }
      }

      return var5;
   }

   @Override
   public List<String> getSuggestions(CommandProcessingSink var1, String var2) {
        return null;
    }

   public SettingValue m7735(CommandProcessingSink var1, String var2) {
        return null;
    }

   static {
    }

   public static Class316 m116(Class316 var0) {
        return null;
    }

   public static String m117(byte[] var0) {
        return null;
    }
   public static void m194() {
        
    }
}
