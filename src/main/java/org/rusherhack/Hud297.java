package org.rusherhack;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import org.rusherhack.client.api.ui.hud.HudHandlerBase;
import org.rusherhack.client.api.ui.theme.ThemeBase;
import org.rusherhack.client.api.ui.window.WindowHandlerBase;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.EnumSetting;
import org.rusherhack.core.setting.NullSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

public class Hud297 extends ThemeBase {
   public Renderer127 f4952;
   public static Hud297 f4953;
   public static BooleanSetting externalpanellock;
   public static BooleanSetting scrollclamp;
   public static NumberSetting<Integer> strength;
   public Renderer273 f4957;
   public static EnumSetting<Enum297> indicator;
   public static NullSetting panels;
   public static BooleanSetting blur;
   public static NumberSetting<Integer> f4961;
   public Renderer191 f4962;
   public static NullSetting items;
   public static BooleanSetting outline;
   @Override
   public boolean deserialize(JsonElement var1) {
      boolean var5;
      JsonObject var7;
      if ((var5 = super.deserialize(var1)) && (var7 = var1.getAsJsonObject()).has("panels")) {
         JsonObject var8;
         if ((var8 = var7.getAsJsonObject("panels")).has("clickgui")) {
            this.m10077().deserialize((JsonElement)var8.getAsJsonArray("clickgui"));
         }

         if (var8.has("hud")) {
            this.getHudHandler().getHudManagerPanel().deserialize((JsonElement)var8.getAsJsonArray("hud"));
         }
      }

      return var5;
   }

   public Renderer273 m10077() {
      return this.f4957;
   }

   @Override
   public HudHandlerBase getHudHandler() {
      return this.f4952;
   }

   public Hud297() {
    }

   @Override
   public WindowHandlerBase getWindowHandler() {
      return this.f4962;
   }
}
