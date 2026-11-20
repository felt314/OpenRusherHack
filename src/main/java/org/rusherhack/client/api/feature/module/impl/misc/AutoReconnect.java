package org.rusherhack.client.api.feature.module.impl.misc;
import org.rusherhack.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.rusherhack.client.api.Globals;
import org.rusherhack.client.api.accessors.gui.IMixinScreen;
import org.rusherhack.client.api.events.client.screen.EventScreen$BuildButtons;
import org.rusherhack.client.api.events.client.screen.EventScreen$Initialize;
import org.rusherhack.client.api.events.render.EventRenderScreen;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.stage.Stage;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.Setting;

import org.rusherhack.command.connect;
import org.rusherhack.command.send;
import org.rusherhack.command.toggle;
public class AutoReconnect extends ToggleableModule {
   public ButtonWidget f3085;
   public BooleanSetting hide;
   public static AutoReconnect f3087;
   public long f3088;
   public DecimalFormat f3089;
   public static ServerInfo f3090;
   public NumberSetting<Double> delay;
   public ButtonWidget f3092;
   public SliderWidget f3093;
   public static long f3094 = Class066.m4320(-5063409709584553502L, -5667415063247158103L, MethodHandles.lookup().lookupClass()).m4325(266732059175043L);
   public static long[] f3098;
   public static Integer[] f3099;
   public static Map f3100;

   @Subscribe
   public void m6593(Event581 var1) {
        
    }

   @Override
   public boolean isListening() {
        return false;
    }

   @Subscribe(
      stage = Stage.ON
   )
   public void onRenderScreen(EventRenderScreen var1) {
        
    }

   

   @Override
   public void onEnable() {
        
    }

   public AutoReconnect() {
      super("AutoReconnect", "Automatically reconnect to servers", ModuleCategory.MISC);
      this.delay = new NumberSetting<>("Delay", 5.0, 1.0, 60.0).incremental(0.1);
      this.hide = new BooleanSetting("Hide", false);
      this.f3085 = null;
      this.f3092 = null;
      this.f3093 = null;
      this.f3089 = new DecimalFormat("0.#");
      f3087 = this;
      Setting[] var10001 = new Setting[]{this.delay, null};
      boolean var10005 = true;
      var10001[1] = this.hide;
      this.registerSettings(var10001);
   }

   @Subscribe
   public void onInitialize(EventScreen$Initialize var1) {
        
    }

   public void m6598() {
        
    }

   @Subscribe
   public void onBuildButtons(EventScreen$BuildButtons var1) {
        
    }
   public static int m175(int var0, long var1) {
        return 0;
    }

   public static int m176(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
        return 0;
    }

   public static CallSite m177(Lookup var0, String var1, MethodType var2) {
        return null;
    }
   public static Field m181(Class var0, String var1, Class var2) {
        return null;
    }

   public static Field m182(Class var0, String var1, Class var2) {
        return null;
    }
   public static Method m184(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }

   public static Method m185(Class var0, String var1, Class var2, int var3, Class[] var4) {
        return null;
    }
}
