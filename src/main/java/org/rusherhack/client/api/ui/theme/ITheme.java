package org.rusherhack.client.api.ui.theme;
import org.rusherhack.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.rusherhack.Class066;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.ui.hud.HudHandlerBase;
import org.rusherhack.client.api.ui.panel.PanelHandlerBase;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.feature.IFeatureConfigurable;
import org.rusherhack.core.serialize.Class062;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.client.api.feature.hud.impl.IP;
public interface ITheme extends IFeatureConfigurable, Class062 {
   long f917 = Class066.m4320(-3097197233797284074L, -5946571252874938367L, MethodHandles.lookup().lookupClass()).m4325(50356555962995L);

   Map f920 = new HashMap(13);
   Object[] f921 = new Object[62];
   String[] f922 = new String[62];

   @Nullable
   default HudHandlerBase getHudHandler() {
        return null;
    }

   default JsonElement serialize() {
        return null;
    }

   default boolean deserialize(JsonElement var1) {
        return false;
    }

   @Nullable
   default PanelHandlerBase<?> getClickGuiHandler() {
      return null;
   }

   default Color getPrimaryColor() {
        return null;
    }

   default void initialize() {
        
    }

   ColorSetting getColorSetting();

   @Nullable
   default WindowHandlerBase getWindowHandler() {
        return null;
    }

   public static String m117(byte[] var0) {
        return null;
    }
   public static void m122() {
        
    }

   class __RHInit {
      static String[] f918;
      static String[] f919;
      static Object INSTANCE = new Object();
      static {
    }
   }
   Object __RH_INIT = __RHInit.INSTANCE;
   String[] f918 = __RHInit.f918;
   String[] f919 = __RHInit.f919;
}
